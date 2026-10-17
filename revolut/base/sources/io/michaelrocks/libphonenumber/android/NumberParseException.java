package io.michaelrocks.libphonenumber.android;

import yem.c;

/* JADX INFO: loaded from: classes13.dex */
public class NumberParseException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f163106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f163107b;

    public NumberParseException(c cVar, String str) {
        super(str);
        this.f163107b = str;
        this.f163106a = cVar;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Error type: " + this.f163106a + ". " + this.f163107b;
    }
}
