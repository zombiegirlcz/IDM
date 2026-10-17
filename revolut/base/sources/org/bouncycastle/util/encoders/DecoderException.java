package org.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes14.dex */
public class DecoderException extends IllegalStateException {
    private Throwable cause;

    public DecoderException(String str, Throwable th10) {
        super(str);
        this.cause = th10;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
