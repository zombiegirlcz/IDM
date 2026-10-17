package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureStage;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class ProcessingRequest {
    private final TakePictureCallback mCallback;
    final ListenableFuture<Void> mCaptureFuture;
    private final Rect mCropRect;
    private final int mJpegQuality;
    private final ImageCapture.OutputFileOptions mOutputFileOptions;
    private final int mRequestId;
    private final int mRotationDegrees;
    private final ImageCapture.OutputFileOptions mSecondaryOutputFileOptions;
    private final Matrix mSensorToBufferTransform;
    private final String mTagBundleKey;
    TakePictureRequest mTakePictureRequest;
    private int mLastCaptureProcessProgressed = -1;
    private final List<Integer> mStageIds = new ArrayList();

    public ProcessingRequest(CaptureBundle captureBundle, TakePictureRequest takePictureRequest, TakePictureCallback takePictureCallback, ListenableFuture<Void> listenableFuture, int i) {
        this.mRequestId = i;
        this.mTakePictureRequest = takePictureRequest;
        this.mOutputFileOptions = takePictureRequest.getOutputFileOptions();
        this.mSecondaryOutputFileOptions = takePictureRequest.getSecondaryOutputFileOptions();
        this.mJpegQuality = takePictureRequest.getJpegQuality();
        this.mRotationDegrees = takePictureRequest.getRotationDegrees();
        this.mCropRect = takePictureRequest.getCropRect();
        this.mSensorToBufferTransform = takePictureRequest.getSensorToBufferTransform();
        this.mCallback = takePictureCallback;
        this.mTagBundleKey = String.valueOf(captureBundle.hashCode());
        List<CaptureStage> captureStages = captureBundle.getCaptureStages();
        Objects.requireNonNull(captureStages);
        Iterator<CaptureStage> it8 = captureStages.iterator();
        while (it8.hasNext()) {
            this.mStageIds.add(Integer.valueOf(it8.next().getId()));
        }
        this.mCaptureFuture = listenableFuture;
        Logger.d("ProcessingRequest", "ProcessingRequest: mRequestId = " + this.mRequestId + ", mTagBundleKey = " + this.mTagBundleKey);
    }

    public ListenableFuture<Void> getCaptureFuture() {
        return this.mCaptureFuture;
    }

    public Rect getCropRect() {
        return this.mCropRect;
    }

    public int getJpegQuality() {
        return this.mJpegQuality;
    }

    public ImageCapture.OutputFileOptions getOutputFileOptions() {
        return this.mOutputFileOptions;
    }

    public int getRequestId() {
        return this.mRequestId;
    }

    public int getRotationDegrees() {
        return this.mRotationDegrees;
    }

    public ImageCapture.OutputFileOptions getSecondaryOutputFileOptions() {
        return this.mSecondaryOutputFileOptions;
    }

    public Matrix getSensorToBufferTransform() {
        return this.mSensorToBufferTransform;
    }

    public List<Integer> getStageIds() {
        return this.mStageIds;
    }

    public String getTagBundleKey() {
        return this.mTagBundleKey;
    }

    public TakePictureRequest getTakePictureRequest() {
        return this.mTakePictureRequest;
    }

    public boolean isAborted() {
        return this.mCallback.isAborted();
    }

    public boolean isInMemoryCapture() {
        return getOutputFileOptions() == null && getSecondaryOutputFileOptions() == null;
    }

    public void onCaptureFailure(ImageCaptureException imageCaptureException) {
        Logger.w("ProcessingRequest", "onCaptureFailure: request ID = " + this.mRequestId, imageCaptureException);
        this.mCallback.onCaptureFailure(imageCaptureException);
    }

    public void onCaptureProcessProgressed(int i) {
        if (this.mLastCaptureProcessProgressed != i) {
            this.mLastCaptureProcessProgressed = i;
            this.mCallback.onCaptureProcessProgressed(i);
        }
    }

    public void onCaptureStarted() {
        Logger.d("ProcessingRequest", "onCaptureStarted: request ID = " + this.mRequestId);
        this.mCallback.onCaptureStarted();
    }

    public void onFinalResult(ImageCapture.OutputFileResults outputFileResults) {
        Logger.i("ProcessingRequest", "onFinalResult(OutputFileResults): request ID = " + this.mRequestId);
        this.mCallback.onFinalResult(outputFileResults);
    }

    public void onImageCaptured() {
        Logger.i("ProcessingRequest", "onImageCaptured: request ID = " + this.mRequestId);
        if (this.mLastCaptureProcessProgressed != -1) {
            onCaptureProcessProgressed(100);
        }
        this.mCallback.onImageCaptured();
    }

    public void onPostviewBitmapAvailable(Bitmap bitmap) {
        Logger.i("ProcessingRequest", "onPostviewBitmapAvailable: request ID = " + this.mRequestId);
        this.mCallback.onPostviewBitmapAvailable(bitmap);
    }

    public void onProcessFailure(ImageCaptureException imageCaptureException) {
        Logger.w("ProcessingRequest", "onProcessFailure: request ID = " + this.mRequestId, imageCaptureException);
        this.mCallback.onProcessFailure(imageCaptureException);
    }

    public void onFinalResult(ImageProxy imageProxy) {
        Logger.i("ProcessingRequest", "onFinalResult(ImageProxy): request ID = " + this.mRequestId);
        this.mCallback.onFinalResult(imageProxy);
    }
}
