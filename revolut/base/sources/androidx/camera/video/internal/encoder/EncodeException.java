package androidx.camera.video.internal.encoder;

/* JADX INFO: loaded from: classes15.dex */
public class EncodeException extends Exception {
    private final int mErrorType;

    public EncodeException(int i, String str, Throwable th10) {
        super(str, th10);
        this.mErrorType = i;
    }
}
