package org.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes14.dex */
public class EncoderException extends IllegalStateException {
    private Throwable cause;

    public EncoderException(String str, Throwable th10) {
        super(str);
        this.cause = th10;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
