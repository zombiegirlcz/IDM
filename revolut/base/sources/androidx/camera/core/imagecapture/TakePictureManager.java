package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCaptureException;

/* JADX INFO: loaded from: classes15.dex */
public interface TakePictureManager {

    public static abstract class CaptureError {
        public static CaptureError of(int i, ImageCaptureException imageCaptureException) {
            return new AutoValue_TakePictureManager_CaptureError(i, imageCaptureException);
        }

        public abstract ImageCaptureException getImageCaptureException();

        public abstract int getRequestId();
    }

    public interface Provider {
        TakePictureManager newInstance(ImageCaptureControl imageCaptureControl);
    }

    void abortRequests();

    void offerRequest(TakePictureRequest takePictureRequest);

    void pause();

    void resume();

    void setImagePipeline(ImagePipeline imagePipeline);
}
