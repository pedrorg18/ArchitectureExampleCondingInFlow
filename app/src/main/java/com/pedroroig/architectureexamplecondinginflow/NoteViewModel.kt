package com.pedroroig.architectureexamplecondinginflow

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.pedroroig.architectureexamplecondinginflow.utils.subscribeOnBackground

class NoteViewModel(app: Application) : AndroidViewModel(app) {

    private val repository = NoteRepository(app)
    private val allNotes = repository.getAllNotes()

    fun insert(note: Note) {
        repository.insert(note)
    }

    fun update(note: Note) {
        repository.update(note)
    }

    fun delete(note: Note) {
        repository.delete(note)
    }

    fun deleteAllNotes() {
        repository.deleteAllNotes()
    }

    fun getAllNotes(): LiveData<List<Note>> {
        return allNotes
    }


}