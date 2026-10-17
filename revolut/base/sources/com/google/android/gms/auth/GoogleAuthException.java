package com.google.android.gms.auth;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public class GoogleAuthException extends Exception {
    public GoogleAuthException() {
    }

    public GoogleAuthException(String str) {
        super(str);
    }

    public GoogleAuthException(String str, @NonNull Throwable th10) {
        super(str, th10);
    }

    public GoogleAuthException(@NonNull Throwable th10) {
        super(th10);
    }
}
