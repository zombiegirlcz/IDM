package com.onfido.android.sdk.capture.internal.camera.camerax;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.android.sdk.capture.internal.camera.OnfidoCamera;
import com.onfido.android.sdk.capture.internal.camera.OnfidoImage;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0012\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraXTakePictureUseCase;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Bitmap;", "Landroidx/camera/view/PreviewView;", "previewView", "", "isRotated", "(Landroid/graphics/Bitmap;Landroidx/camera/view/PreviewView;)Z", "Landroidx/camera/core/ImageCapture;", "imageCapture", "Lkotlin/Function1;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$PictureCaptureEvent;", "", "callback", "invoke", "(Landroidx/camera/core/ImageCapture;Landroidx/camera/view/PreviewView;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CameraXTakePictureUseCase {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final Executor executor;

    public CameraXTakePictureUseCase(@ApplicationContext @NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
        Executor mainExecutor = ContextCompat.getMainExecutor(applicationContext);
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "getMainExecutor(...)");
        this.executor = mainExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRotated(Bitmap bitmap, PreviewView previewView) {
        return bitmap.getWidth() > bitmap.getHeight() && previewView.getWidth() < previewView.getHeight();
    }

    @NotNull
    public final Executor getExecutor() {
        return this.executor;
    }

    public final void invoke(@NotNull ImageCapture imageCapture, @NotNull final PreviewView previewView, @NotNull final Function1<? super OnfidoCamera.PictureCaptureEvent, Unit> callback) {
        Intrinsics.checkNotNullParameter(imageCapture, "imageCapture");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageCapture.OutputFileOptions outputFileOptionsBuild = new ImageCapture.OutputFileOptions.Builder(byteArrayOutputStream).build();
        Intrinsics.checkNotNullExpressionValue(outputFileOptionsBuild, "build(...)");
        imageCapture.lambda$takePicture$2(outputFileOptionsBuild, this.executor, new ImageCapture.OnImageSavedCallback() { // from class: com.onfido.android.sdk.capture.internal.camera.camerax.CameraXTakePictureUseCase.invoke.1
            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public /* bridge */ /* synthetic */ void onCaptureProcessProgressed(int i) {
                super.onCaptureProcessProgressed(i);
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public /* bridge */ /* synthetic */ void onCaptureStarted() {
                super.onCaptureStarted();
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onError(@NotNull ImageCaptureException exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                callback.invoke(new OnfidoCamera.PictureCaptureEvent.Error(exception));
                Timber.INSTANCE.e(exception);
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onImageSaved(@NotNull ImageCapture.OutputFileResults outputFileResults) {
                float width;
                float f;
                Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                int width2 = bitmapDecodeByteArray.getWidth();
                int height = bitmapDecodeByteArray.getHeight();
                if (this.isRotated(bitmapDecodeByteArray, previewView)) {
                    width = previewView.getWidth();
                    f = height;
                } else {
                    width = previewView.getWidth();
                    f = width2;
                }
                float f4 = width / f;
                bitmapDecodeByteArray.recycle();
                callback.invoke(new OnfidoCamera.PictureCaptureEvent.Captured(new OnfidoImage(byteArray, width2, height, 0, new OnfidoImage.CropRect(f4, 0, 0, previewView.getWidth(), previewView.getHeight()), bitmapDecodeByteArray)));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public /* bridge */ /* synthetic */ void onPostviewBitmapAvailable(Bitmap bitmap) {
                super.onPostviewBitmapAvailable(bitmap);
            }
        });
    }
}
