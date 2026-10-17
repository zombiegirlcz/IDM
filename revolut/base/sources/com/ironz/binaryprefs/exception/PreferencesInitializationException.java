package com.ironz.binaryprefs.exception;

/* JADX INFO: loaded from: classes17.dex */
public final class PreferencesInitializationException extends RuntimeException {
    public PreferencesInitializationException() {
        super("Preferences should be instantiated in the main thread.");
    }
}
