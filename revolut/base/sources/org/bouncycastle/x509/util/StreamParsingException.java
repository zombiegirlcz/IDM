package org.bouncycastle.x509.util;

/* JADX INFO: loaded from: classes14.dex */
public class StreamParsingException extends Exception {
    Throwable _e;

    public StreamParsingException(String str, Throwable th10) {
        super(str);
        this._e = th10;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this._e;
    }
}
