package com.onfido.android.sdk.capture.internal.camera;

import a10.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.YuvImage;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.util.a;
import cmc.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.internal.camera.OnfidoCamera;
import com.onfido.android.sdk.capture.internal.camera.OnfidoImage;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.camera.FaceDetectionFrame;
import com.onfido.android.sdk.capture.ui.camera.MediaCaptureCallback;
import com.onfido.android.sdk.capture.ui.camera.OverlayView;
import com.onfido.android.sdk.capture.ui.camera.TorchMode;
import com.onfido.android.sdk.capture.ui.camera.capture.PhotoCaptureConfig;
import com.onfido.android.sdk.capture.ui.camera.capture.VideoCaptureConfig;
import com.onfido.android.sdk.capture.ui.camera.exception.UnknownCameraException;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSource;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSourcePreview;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import ehm.e;
import igm.g;
import igm.o;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 _2\u00020\u00012\u00020\u0002:\u0002`_B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ/\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001aH\u0007¢\u0006\u0004\b&\u0010\u001cJ+\u0010,\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020'2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001a0)H\u0016¢\u0006\u0004\b,\u0010-J+\u00101\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020.2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001a0)H\u0016¢\u0006\u0004\b1\u00102J#\u00105\u001a\u0002042\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u001a0)H\u0016¢\u0006\u0004\b5\u00106J\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u001aH\u0016¢\u0006\u0004\b;\u0010\u001cJ\u0017\u0010>\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010FR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010JR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\"\u0010S\u001a\u0010\u0012\f\u0012\n R*\u0004\u0018\u000108080Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001a\u0010Y\u001a\u00020X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010]¨\u0006a"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/Camera1Api;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera;", "Landroidx/lifecycle/LifecycleObserver;", "Landroid/content/Context;", "applicationContext", "Lcom/onfido/android/sdk/capture/ui/camera/view/CameraSourcePreview;", "cameraSourcePreview", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayView;", "overlayView", "Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;", "videoCaptureConfig", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "onfidoRemoteConfig", "<init>", "(Landroid/content/Context;Lcom/onfido/android/sdk/capture/ui/camera/view/CameraSourcePreview;Landroidx/lifecycle/LifecycleOwner;Lcom/onfido/android/sdk/capture/ui/camera/OverlayView;Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;)V", "", "pictureWidth", "pictureHeight", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage$CropRect;", "getCropRect", "(II)Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage$CropRect;", "", "getZoomFactor", "(II)F", "", "startNextVideoFrameSampling", "()V", "restartCameraPreview", "", "data", "width", "height", "rotation", "Landroid/graphics/Bitmap;", "nv21ToBitmap", "([BIII)Landroid/graphics/Bitmap;", "onPause", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraFacing;", "cameraFacing", "Lkotlin/Function1;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraStatus;", "callback", "start", "(Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraFacing;Lkotlin/jvm/functions/Function1;)V", "Lcom/onfido/android/sdk/capture/ui/camera/capture/PhotoCaptureConfig;", "photoCaptureConfig", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$PictureCaptureEvent;", "takePicture", "(Lcom/onfido/android/sdk/capture/ui/camera/capture/PhotoCaptureConfig;Lkotlin/jvm/functions/Function1;)V", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoCaptureEvent;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoRecorder;", "takeVideo", "(Lkotlin/jvm/functions/Function1;)Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoRecorder;", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "observeFrame", "()Lio/reactivex/rxjava3/core/Observable;", "stop", "Landroid/graphics/RectF;", "rect", "centerPreviewAccordingTo", "(Landroid/graphics/RectF;)V", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "Lcom/onfido/android/sdk/capture/ui/camera/view/CameraSourcePreview;", "getCameraSourcePreview", "()Lcom/onfido/android/sdk/capture/ui/camera/view/CameraSourcePreview;", "Landroidx/lifecycle/LifecycleOwner;", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayView;", "getOverlayView", "()Lcom/onfido/android/sdk/capture/ui/camera/OverlayView;", "Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "previousEmittedBitmap", "Landroid/graphics/Bitmap;", "", "shouldProcessNextFrame", "Z", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "framePublishSubjectFrame", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraControl;", "cameraControl", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraControl;", "getCameraControl", "()Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraControl;", "()Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage$CropRect;", "cropRect", "Companion", "AbstractMediaCaptureCallback", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Camera1Api implements OnfidoCamera, LifecycleObserver {
    private static final int FACE_TRACKING_MIN_BITMAP_WIDTH = 480;
    private static final int MAX_QUALITY = 100;
    private static final float ROTATION_MULTIPLIER = 90.0f;
    private static final long VIDEO_FRAME_SAMPLING_PERIOD = 200;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final OnfidoCamera.CameraControl cameraControl;

    @NotNull
    private final CameraSourcePreview cameraSourcePreview;

    @NotNull
    private final CompositeDisposable compositeDisposable;

    @NotNull
    private final PublishSubject framePublishSubjectFrame;

    @NotNull
    private final LifecycleOwner lifecycleOwner;

    @NotNull
    private final OnfidoRemoteConfig onfidoRemoteConfig;

    @NotNull
    private final OverlayView overlayView;
    private Bitmap previousEmittedBitmap;
    private boolean shouldProcessNextFrame;

    @NotNull
    private final VideoCaptureConfig videoCaptureConfig;

    @NotNull
    private static final String VIDEO_PREFIX = "onfido-video";

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016¨\u0006\u0014"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/Camera1Api$AbstractMediaCaptureCallback;", "Lcom/onfido/android/sdk/capture/ui/camera/MediaCaptureCallback;", "()V", "onErrorTakingPicture", "", "takePictureException", "Lcom/onfido/android/sdk/capture/ui/camera/view/CameraSource$TakePictureException;", "onPictureCaptured", "data", "", "pictureWidth", "", "pictureHeight", "onVideoCanceled", "onVideoCaptured", "isSuccess", "", "fileName", "", "onVideoTimeoutExceeded", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class AbstractMediaCaptureCallback implements MediaCaptureCallback {
        @Override // com.onfido.android.sdk.capture.ui.camera.MediaCaptureCallback
        public void onErrorTakingPicture(@NotNull CameraSource.TakePictureException takePictureException) {
            Intrinsics.checkNotNullParameter(takePictureException, "takePictureException");
        }

        @Override // com.onfido.android.sdk.capture.ui.camera.MediaCaptureCallback
        public void onPictureCaptured(@NotNull byte[] data, int pictureWidth, int pictureHeight) {
            Intrinsics.checkNotNullParameter(data, "data");
        }

        @Override // com.onfido.android.sdk.capture.ui.camera.MediaCaptureCallback
        public void onVideoCanceled() {
        }

        @Override // com.onfido.android.sdk.capture.ui.camera.MediaCaptureCallback
        public void onVideoCaptured(boolean isSuccess, String fileName) {
        }

        @Override // com.onfido.android.sdk.capture.ui.camera.MediaCaptureCallback
        public void onVideoTimeoutExceeded() {
        }
    }

    public Camera1Api(@NotNull Context applicationContext, @NotNull CameraSourcePreview cameraSourcePreview, @NotNull LifecycleOwner lifecycleOwner, @NotNull OverlayView overlayView, @NotNull VideoCaptureConfig videoCaptureConfig, @NotNull OnfidoRemoteConfig onfidoRemoteConfig) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(cameraSourcePreview, "cameraSourcePreview");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(overlayView, "overlayView");
        Intrinsics.checkNotNullParameter(videoCaptureConfig, "videoCaptureConfig");
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
        this.applicationContext = applicationContext;
        this.cameraSourcePreview = cameraSourcePreview;
        this.lifecycleOwner = lifecycleOwner;
        this.overlayView = overlayView;
        this.videoCaptureConfig = videoCaptureConfig;
        this.onfidoRemoteConfig = onfidoRemoteConfig;
        this.shouldProcessNextFrame = true;
        this.framePublishSubjectFrame = a.n("create(...)");
        this.compositeDisposable = new CompositeDisposable();
        this.cameraControl = new OnfidoCamera.CameraControl() { // from class: com.onfido.android.sdk.capture.internal.camera.Camera1Api$cameraControl$1
            @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera.CameraControl
            public void enableTorch(boolean enabled) {
                this.this$0.getCameraSourcePreview().setTorchMode(enabled ? TorchMode.ON : TorchMode.OFF);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnfidoImage.CropRect getCropRect() {
        return new OnfidoImage.CropRect(this.cameraSourcePreview.getPreviewZoomFactor(), this.cameraSourcePreview.getPreviewVerticalOffset(), this.cameraSourcePreview.getPreviewHorizontalOffset(), this.cameraSourcePreview.getActualPreviewWidth(), this.cameraSourcePreview.getActualPreviewHeight());
    }

    private final float getZoomFactor(int pictureWidth, int pictureHeight) {
        return Math.max(this.cameraSourcePreview.getActualPreviewWidth() / pictureWidth, this.cameraSourcePreview.getActualPreviewHeight() / pictureHeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap nv21ToBitmap(byte[] data, int width, int height, int rotation) {
        YuvImage yuvImage = new YuvImage(data, 17, width, height, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, width, height), 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        Matrix matrix = new Matrix();
        matrix.postRotate(rotation * ROTATION_MULTIPLIER);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        bitmapDecodeByteArray.recycle();
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeFrame$lambda$0(Camera1Api this$0, byte[] data, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "data");
        int i5 = i3 != 0 ? i2 : i;
        int i6 = i3 != 0 ? i : i2;
        boolean z = false;
        if (this$0.shouldProcessNextFrame) {
            this$0.shouldProcessNextFrame = false;
            Bitmap bitmapNv21ToBitmap = this$0.nv21ToBitmap(data, i, i2, i3);
            this$0.previousEmittedBitmap = bitmapNv21ToBitmap;
            this$0.framePublishSubjectFrame.onNext(new OnfidoImage(data, i, i2, i3, this$0.getCropRect(i5, i6), bitmapNv21ToBitmap));
            return;
        }
        Bitmap bitmap = this$0.previousEmittedBitmap;
        if (bitmap != null && bitmap.isRecycled()) {
            z = true;
        }
        this$0.shouldProcessNextFrame = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restartCameraPreview() {
        this.cameraSourcePreview.start(this.onfidoRemoteConfig.isAutoFlashModeEnabled(), true, new VideoCaptureConfig(null, false, 0, 0, 0, 0, 0, 0L, 0L, 511, null));
    }

    private final void startNextVideoFrameSampling() {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Disposable disposableSubscribe = Observable.interval(200L, TimeUnit.MILLISECONDS).map(new o() { // from class: com.onfido.android.sdk.capture.internal.camera.Camera1Api.startNextVideoFrameSampling.1
            @NotNull
            public final FaceDetectionFrame apply(long j2) {
                return Camera1Api.this.getCameraSourcePreview().getFaceDetectionFrame(480);
            }

            @Override // igm.o
            public /* bridge */ /* synthetic */ Object apply(Object obj2) {
                return apply(((Number) obj2).longValue());
            }
        }).subscribeOn(e.f126319b).subscribe(new g() { // from class: com.onfido.android.sdk.capture.internal.camera.Camera1Api.startNextVideoFrameSampling.2
            @Override // igm.g
            public final void accept(@NotNull FaceDetectionFrame faceDetectionFrame) {
                Intrinsics.checkNotNullParameter(faceDetectionFrame, "faceDetectionFrame");
                byte[] yuv = faceDetectionFrame.getYuv();
                int pictureWidth = faceDetectionFrame.getPictureWidth();
                int pictureHeight = faceDetectionFrame.getPictureHeight();
                int rotation = faceDetectionFrame.getRotation();
                Camera1Api.this.framePublishSubjectFrame.onNext(new OnfidoImage(yuv, pictureWidth, pictureHeight, rotation, Camera1Api.this.getCropRect(rotation != 0 ? pictureHeight : pictureWidth, rotation != 0 ? pictureWidth : pictureHeight), faceDetectionFrame.getBitmap()));
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.internal.camera.Camera1Api.startNextVideoFrameSampling.3
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                Timber.INSTANCE.e(it8, b.u(new StringBuilder("Error on video frames subscription: "), it8), new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera
    public void centerPreviewAccordingTo(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.cameraSourcePreview.setDocumentOverlayRect(rect);
    }

    @NotNull
    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera
    @NotNull
    public OnfidoCamera.CameraControl getCameraControl() {
        return this.cameraControl;
    }

    @NotNull
    public final CameraSourcePreview getCameraSourcePreview() {
        return this.cameraSourcePreview;
    }

    @NotNull
    public final OverlayView getOverlayView() {
        return this.overlayView;
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera
    @NotNull
    public Observable observeFrame() {
        this.cameraSourcePreview.setFrameCallback(new d(this, 20));
        Observable observableHide = this.framePublishSubjectFrame.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.lifecycleOwner.getLifecycle().removeObserver(this);
        Bitmap bitmap = this.previousEmittedBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.previousEmittedBitmap = null;
        stop();
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera
    public void start(@NotNull OnfidoCamera.CameraFacing cameraFacing, @NotNull final Function1<? super OnfidoCamera.CameraStatus, Unit> callback) {
        Intrinsics.checkNotNullParameter(cameraFacing, "cameraFacing");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.shouldProcessNextFrame = true;
        ViewExtensionsKt.toVisible$default(this.cameraSourcePreview, false, 1, null);
        this.compositeDisposable.d();
        this.lifecycleOwner.getLifecycle().addObserver(this);
        this.cameraSourcePreview.setIsFront(cameraFacing == OnfidoCamera.CameraFacing.FRONT);
        this.cameraSourcePreview.setListener(new CameraSourcePreview.CameraPreviewListener() { // from class: com.onfido.android.sdk.capture.internal.camera.Camera1Api$start$cameraPreviewListener$1
            @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSourcePreview.CameraPreviewListener
            public void onCameraNotFound() {
                callback.invoke(OnfidoCamera.CameraStatus.NotFound.INSTANCE);
            }

            @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSourcePreview.CameraPreviewListener
            public void onCameraPreviewAvailable() {
                this.getCameraSourcePreview().setFocusMeterAreaWeight(this.getOverlayView().getBigHorizontalWeight$onfido_capture_sdk_core_release(), this.getOverlayView().getVerticalWeight());
                this.getCameraSourcePreview().setPictureWeightSize(this.getOverlayView().getBigHorizontalWeight$onfido_capture_sdk_core_release(), this.getOverlayView().getVerticalWeight());
                this.getCameraSourcePreview().start(this.onfidoRemoteConfig.isAutoFlashModeEnabled(), true, new VideoCaptureConfig(null, false, 0, 0, 0, 0, 0, 0L, 0L, 511, null));
                callback.invoke(OnfidoCamera.CameraStatus.Started.INSTANCE);
            }

            @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSourcePreview.CameraPreviewListener
            public void onCameraUnavailable() {
                callback.invoke(OnfidoCamera.CameraStatus.NotAvailable.INSTANCE);
            }

            @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSourcePreview.CameraPreviewListener
            public void onUnknownCameraError(@NotNull UnknownCameraException exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                callback.invoke(new OnfidoCamera.CameraStatus.Failed(exception));
            }
        });
        this.cameraSourcePreview.setupTextureView();
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera
    public void stop() {
        this.compositeDisposable.d();
        this.cameraSourcePreview.stop();
        this.cameraSourcePreview.release();
        ViewExtensionsKt.toGone$default(this.cameraSourcePreview, false, 1, null);
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera
    public void takePicture(@NotNull PhotoCaptureConfig photoCaptureConfig, @NotNull final Function1<? super OnfidoCamera.PictureCaptureEvent, Unit> callback) {
        Intrinsics.checkNotNullParameter(photoCaptureConfig, "photoCaptureConfig");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.cameraSourcePreview.setTorchMode(TorchMode.AUTO);
        this.cameraSourcePreview.takePicture(null, new AbstractMediaCaptureCallback() { // from class: com.onfido.android.sdk.capture.internal.camera.Camera1Api.takePicture.1
            @Override // com.onfido.android.sdk.capture.internal.camera.Camera1Api.AbstractMediaCaptureCallback, com.onfido.android.sdk.capture.ui.camera.MediaCaptureCallback
            public void onErrorTakingPicture(@NotNull CameraSource.TakePictureException takePictureException) {
                Intrinsics.checkNotNullParameter(takePictureException, "takePictureException");
                Camera1Api.this.getCameraSourcePreview().release();
                callback.invoke(new OnfidoCamera.PictureCaptureEvent.Error(takePictureException));
                Camera1Api.this.restartCameraPreview();
            }

            @Override // com.onfido.android.sdk.capture.internal.camera.Camera1Api.AbstractMediaCaptureCallback, com.onfido.android.sdk.capture.ui.camera.MediaCaptureCallback
            public void onPictureCaptured(@NotNull byte[] data, int pictureWidth, int pictureHeight) {
                Intrinsics.checkNotNullParameter(data, "data");
                Camera1Api.this.getCameraSourcePreview().release();
                callback.invoke(new OnfidoCamera.PictureCaptureEvent.Captured(new OnfidoImage(data, pictureWidth, pictureHeight, 0, Camera1Api.this.getCropRect(), Camera1Api.this.nv21ToBitmap(data, pictureWidth, pictureHeight, 0))));
            }
        }, photoCaptureConfig.getShouldUseDefaultJpegQuality());
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera
    @NotNull
    public OnfidoCamera.VideoRecorder takeVideo(@NotNull final Function1<? super OnfidoCamera.VideoCaptureEvent, Unit> callback) throws IOException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.cameraSourcePreview.hasCameraSource()) {
            restartCameraPreview();
        }
        final File fileCreateTempFile = File.createTempFile("onfido-video-" + System.currentTimeMillis() + CoreConstants.DASH_CHAR, ".mp4", this.applicationContext.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        OnfidoCamera.VideoRecorder videoRecorder = new OnfidoCamera.VideoRecorder() { // from class: com.onfido.android.sdk.capture.internal.camera.Camera1Api$takeVideo$recorder$1
            private final boolean hasValidRecording = true;

            @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera.VideoRecorder
            public void cancel() {
                this.this$0.getCameraSourcePreview().stopRecording();
            }

            @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera.VideoRecorder
            public void finish() {
                this.this$0.getCameraSourcePreview().finishRecording(true);
            }

            @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera.VideoRecorder
            public boolean getHasValidRecording() {
                return this.hasValidRecording;
            }

            @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera.VideoRecorder
            public boolean isRecording() {
                return this.this$0.getCameraSourcePreview().isReady() && this.this$0.getCameraSourcePreview().isRecording();
            }
        };
        this.cameraSourcePreview.startVideo(this.onfidoRemoteConfig.isAutoFlashModeEnabled(), new AbstractMediaCaptureCallback() { // from class: com.onfido.android.sdk.capture.internal.camera.Camera1Api.takeVideo.1
            @Override // com.onfido.android.sdk.capture.internal.camera.Camera1Api.AbstractMediaCaptureCallback, com.onfido.android.sdk.capture.ui.camera.MediaCaptureCallback
            public void onErrorTakingPicture(@NotNull CameraSource.TakePictureException takePictureException) {
                Intrinsics.checkNotNullParameter(takePictureException, "takePictureException");
                callback.invoke(new OnfidoCamera.VideoCaptureEvent.Error(takePictureException));
            }

            @Override // com.onfido.android.sdk.capture.internal.camera.Camera1Api.AbstractMediaCaptureCallback, com.onfido.android.sdk.capture.ui.camera.MediaCaptureCallback
            public void onVideoCanceled() {
                callback.invoke(OnfidoCamera.VideoCaptureEvent.Canceled.INSTANCE);
                fileCreateTempFile.delete();
            }

            @Override // com.onfido.android.sdk.capture.internal.camera.Camera1Api.AbstractMediaCaptureCallback, com.onfido.android.sdk.capture.ui.camera.MediaCaptureCallback
            public void onVideoCaptured(boolean isSuccess, String fileName) {
                if (!isSuccess) {
                    callback.invoke(OnfidoCamera.VideoCaptureEvent.Canceled.INSTANCE);
                    fileCreateTempFile.delete();
                } else {
                    Function1<OnfidoCamera.VideoCaptureEvent, Unit> function1 = callback;
                    if (fileName == null) {
                        fileName = "";
                    }
                    function1.invoke(new OnfidoCamera.VideoCaptureEvent.Recorded(fileName));
                }
            }

            @Override // com.onfido.android.sdk.capture.internal.camera.Camera1Api.AbstractMediaCaptureCallback, com.onfido.android.sdk.capture.ui.camera.MediaCaptureCallback
            public void onVideoTimeoutExceeded() {
                callback.invoke(OnfidoCamera.VideoCaptureEvent.Timeout.INSTANCE);
            }
        }, fileCreateTempFile.getAbsolutePath(), this.videoCaptureConfig);
        startNextVideoFrameSampling();
        callback.invoke(OnfidoCamera.VideoCaptureEvent.Started.INSTANCE);
        return videoRecorder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnfidoImage.CropRect getCropRect(int pictureWidth, int pictureHeight) {
        int i;
        int i2;
        Object obj2;
        float f;
        int i3;
        float zoomFactor = getZoomFactor(pictureWidth, pictureHeight);
        int actualPreviewWidth = this.cameraSourcePreview.getActualPreviewWidth();
        int actualPreviewHeight = this.cameraSourcePreview.getActualPreviewHeight();
        OnfidoImage.CropRect cropRect = new OnfidoImage.CropRect(zoomFactor, 0, 0, actualPreviewWidth, actualPreviewHeight, 6, null);
        float f4 = pictureWidth;
        float f5 = actualPreviewWidth / f4;
        float f6 = pictureHeight;
        float f32 = actualPreviewHeight / f6;
        if (f5 > f32) {
            i3 = (((int) (f6 * f5)) - actualPreviewHeight) / 2;
            i2 = 29;
            obj2 = null;
            f = BitmapDescriptorFactory.HUE_RED;
            i = 0;
        } else {
            i = (((int) (f4 * f32)) - actualPreviewWidth) / 2;
            i2 = 27;
            obj2 = null;
            f = BitmapDescriptorFactory.HUE_RED;
            i3 = 0;
        }
        return OnfidoImage.CropRect.copy$default(cropRect, f, i3, i, 0, 0, i2, obj2);
    }
}
