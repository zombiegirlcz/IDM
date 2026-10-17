package androidx.camera.core;

/* JADX INFO: loaded from: classes15.dex */
public class ImageCaptureException extends Exception {
    private final int mImageCaptureError;

    public ImageCaptureException(int i, String str, Throwable th10) {
        super(str, th10);
        this.mImageCaptureError = i;
    }

    public int getImageCaptureError() {
        return this.mImageCaptureError;
    }
}
