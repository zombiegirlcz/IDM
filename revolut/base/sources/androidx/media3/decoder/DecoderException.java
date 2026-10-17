package androidx.media3.decoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class DecoderException extends Exception {
    public DecoderException(String str) {
        super(str);
    }

    public DecoderException(Throwable th10) {
        super(th10);
    }

    public DecoderException(String str, Throwable th10) {
        super(str, th10);
    }
}
