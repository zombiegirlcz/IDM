package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.view.Surface;
import android.view.ViewTreeObserver;
import androidx.camera.viewfinder.CameraViewfinder;
import androidx.camera.viewfinder.CameraViewfinderExt;
import androidx.camera.viewfinder.ViewfinderSurfaceRequest;
import androidx.camera.viewfinder.ViewfinderSurfaceRequestUtil;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewKt;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.util.SurfaceSizeProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import com.onfido.api.client.data.SdkConfiguration;
import gim.d;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import skm.e0;
import yhm.j;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0010\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u001cJ%\u0010#\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u0016H\u0002¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u0016H\u0002¢\u0006\u0004\b%\u0010$J#\u0010)\u001a\u00020(2\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140&\"\u00020\u0014H\u0002¢\u0006\u0004\b)\u0010*J#\u0010+\u001a\u00020(2\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140&\"\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010*J1\u0010-\u001a\u00020\f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH\u0003¢\u0006\u0004\b-\u0010.JA\u00101\u001a\u00020\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b1\u00102J\u0011\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0016\u0010E\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010G\u001a\u00020\u000b8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006["}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/Camera2WrapperImpl;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/Camera2Wrapper;", "Landroid/content/Context;", "context", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/util/SurfaceSizeProvider;", "surfaceSizeProvider", "Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture$MotionVideoSettings;", "motionVideoSettings", "<init>", "(Landroid/content/Context;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/util/SurfaceSizeProvider;Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture$MotionVideoSettings;)V", "Lkotlin/Function1;", "Landroid/hardware/camera2/CameraCharacteristics;", "", "onSuccess", "", "onError", "findSelfieCamera", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroidx/camera/viewfinder/CameraViewfinder;", "cameraViewfinder", "Landroid/view/Surface;", "recorderSurface", "Lkotlin/Function0;", "start", "(Landroidx/camera/viewfinder/CameraViewfinder;Landroid/view/Surface;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "resetCaptureSession", "(Landroid/view/Surface;)V", "setPreviewMode", "()V", "setRecordingMode", "stopPreview", "closeCamera", "cleanup", "cameraViewFinder", "onPreviewSurfaceReady", "setupCameraViewFinder", "(Landroidx/camera/viewfinder/CameraViewfinder;Lkotlin/jvm/functions/Function0;)V", "sendSurfaceRequest", "", "surfaces", "Landroid/hardware/camera2/CaptureRequest;", "createPreviewRequest", "([Landroid/view/Surface;)Landroid/hardware/camera2/CaptureRequest;", "createRecordRequest", "onOpened", "openCamera", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "onConfigured", "createCaptureSession", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "getFrontFacingCamera", "()Ljava/lang/String;", "Landroid/content/Context;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/util/SurfaceSizeProvider;", "Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture$MotionVideoSettings;", "Landroid/os/HandlerThread;", "cameraThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "cameraHandler", "Landroid/os/Handler;", "Landroid/hardware/camera2/CameraManager;", "cameraManager$delegate", "Lkotlin/Lazy;", "getCameraManager", "()Landroid/hardware/camera2/CameraManager;", "cameraManager", "selfieCameraId", "Ljava/lang/String;", "characteristics", "Landroid/hardware/camera2/CameraCharacteristics;", "getCharacteristics", "()Landroid/hardware/camera2/CameraCharacteristics;", "setCharacteristics", "(Landroid/hardware/camera2/CameraCharacteristics;)V", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "Landroid/hardware/camera2/CameraDevice;", "Landroid/hardware/camera2/CameraCaptureSession;", "captureSession", "Landroid/hardware/camera2/CameraCaptureSession;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "layoutChangedListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroidx/camera/viewfinder/ViewfinderSurfaceRequest;", "viewfinderSurfaceRequest", "Landroidx/camera/viewfinder/ViewfinderSurfaceRequest;", "previewSurface", "Landroid/view/Surface;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Camera2WrapperImpl implements Camera2Wrapper {
    private CameraDevice cameraDevice;

    @NotNull
    private final Handler cameraHandler;

    /* JADX INFO: renamed from: cameraManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cameraManager;

    @NotNull
    private final HandlerThread cameraThread;
    private CameraCaptureSession captureSession;
    public CameraCharacteristics characteristics;

    @NotNull
    private final Context context;
    private ViewTreeObserver.OnGlobalLayoutListener layoutChangedListener;

    @NotNull
    private final SdkConfiguration.MotionCapture.MotionVideoSettings motionVideoSettings;
    private Surface previewSurface;
    private String selfieCameraId;

    @NotNull
    private final SurfaceSizeProvider surfaceSizeProvider;
    private ViewfinderSurfaceRequest viewfinderSurfaceRequest;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2WrapperImpl$createCaptureSession$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<Throwable, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((Throwable) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull Throwable it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2WrapperImpl$resetCaptureSession$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C19701 extends u implements Function0<Unit> {
        public C19701() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() throws CameraAccessException {
            m3669invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3669invoke() throws CameraAccessException {
            Camera2WrapperImpl.this.setPreviewMode();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2WrapperImpl$sendSurfaceRequest$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2WrapperImpl$sendSurfaceRequest$1", f = "Camera2WrapperImpl.kt", l = {LDSFile.EF_DG2_TAG}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C19711 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CameraViewfinder $cameraViewFinder;
        final /* synthetic */ Function0<Unit> $onPreviewSurfaceReady;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19711(CameraViewfinder cameraViewfinder, Function0<Unit> function0, Continuation<? super C19711> continuation) {
            super(2, continuation);
            this.$cameraViewFinder = cameraViewfinder;
            this.$onPreviewSurfaceReady = function0;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return Camera2WrapperImpl.this.new C19711(this.$cameraViewFinder, this.$onPreviewSurfaceReady, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            Camera2WrapperImpl camera2WrapperImpl;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                Camera2WrapperImpl camera2WrapperImpl2 = Camera2WrapperImpl.this;
                camera2WrapperImpl2.viewfinderSurfaceRequest = ViewfinderSurfaceRequestUtil.populateFromCharacteristics(new ViewfinderSurfaceRequest.Builder(camera2WrapperImpl2.surfaceSizeProvider.getPreviewSize(Camera2WrapperImpl.this.getCharacteristics()).getLandscape()), Camera2WrapperImpl.this.getCharacteristics()).build();
                Camera2WrapperImpl camera2WrapperImpl3 = Camera2WrapperImpl.this;
                CameraViewfinderExt cameraViewfinderExt = CameraViewfinderExt.INSTANCE;
                CameraViewfinder cameraViewfinder = this.$cameraViewFinder;
                ViewfinderSurfaceRequest viewfinderSurfaceRequest = camera2WrapperImpl3.viewfinderSurfaceRequest;
                Intrinsics.h(viewfinderSurfaceRequest);
                this.L$0 = camera2WrapperImpl3;
                this.label = 1;
                Object objRequestSurface = cameraViewfinderExt.requestSurface(cameraViewfinder, viewfinderSurfaceRequest, this);
                if (objRequestSurface == aVar) {
                    return aVar;
                }
                camera2WrapperImpl = camera2WrapperImpl3;
                obj2 = objRequestSurface;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                camera2WrapperImpl = (Camera2WrapperImpl) this.L$0;
                o.b(obj2);
            }
            camera2WrapperImpl.previewSurface = (Surface) obj2;
            this.$onPreviewSurfaceReady.invoke();
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19711) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2WrapperImpl$start$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C19721 extends u implements Function0<Unit> {
        final /* synthetic */ Function1<Throwable, Unit> $onError;
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ Surface $recorderSurface;

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2WrapperImpl$start$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C03571 extends u implements Function0<Unit> {
            final /* synthetic */ Function1<Throwable, Unit> $onError;
            final /* synthetic */ Function0<Unit> $onSuccess;
            final /* synthetic */ Surface $recorderSurface;
            final /* synthetic */ Camera2WrapperImpl this$0;

            /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2WrapperImpl$start$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C03581 extends u implements Function0<Unit> {
                final /* synthetic */ Function0<Unit> $onSuccess;
                final /* synthetic */ Camera2WrapperImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C03581(Camera2WrapperImpl camera2WrapperImpl, Function0<Unit> function0) {
                    super(0);
                    this.this$0 = camera2WrapperImpl;
                    this.$onSuccess = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() throws CameraAccessException {
                    m3672invoke();
                    return Unit.f186387a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3672invoke() throws CameraAccessException {
                    this.this$0.setPreviewMode();
                    this.$onSuccess.invoke();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03571(Camera2WrapperImpl camera2WrapperImpl, Surface surface, Function1<? super Throwable, Unit> function1, Function0<Unit> function0) {
                super(0);
                this.this$0 = camera2WrapperImpl;
                this.$recorderSurface = surface;
                this.$onError = function1;
                this.$onSuccess = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() throws CameraAccessException {
                m3671invoke();
                return Unit.f186387a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3671invoke() throws CameraAccessException {
                Camera2WrapperImpl camera2WrapperImpl = this.this$0;
                Surface surface = camera2WrapperImpl.previewSurface;
                if (surface != null) {
                    camera2WrapperImpl.createCaptureSession(v.k(surface, this.$recorderSurface), new C03581(this.this$0, this.$onSuccess), this.$onError);
                } else {
                    Intrinsics.r("previewSurface");
                    throw null;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19721(Function1<? super Throwable, Unit> function1, Surface surface, Function0<Unit> function0) {
            super(0);
            this.$onError = function1;
            this.$recorderSurface = surface;
            this.$onSuccess = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() throws CameraAccessException {
            m3670invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3670invoke() throws CameraAccessException {
            Camera2WrapperImpl camera2WrapperImpl = Camera2WrapperImpl.this;
            camera2WrapperImpl.openCamera(new C03571(camera2WrapperImpl, this.$recorderSurface, this.$onError, this.$onSuccess), this.$onError);
        }
    }

    public Camera2WrapperImpl(@ApplicationContext @NotNull Context context, @NotNull SurfaceSizeProvider surfaceSizeProvider, @NotNull SdkConfiguration.MotionCapture.MotionVideoSettings motionVideoSettings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(surfaceSizeProvider, "surfaceSizeProvider");
        Intrinsics.checkNotNullParameter(motionVideoSettings, "motionVideoSettings");
        this.context = context;
        this.surfaceSizeProvider = surfaceSizeProvider;
        this.motionVideoSettings = motionVideoSettings;
        HandlerThread handlerThread = new HandlerThread("CameraThread");
        handlerThread.start();
        this.cameraThread = handlerThread;
        this.cameraHandler = new Handler(handlerThread.getLooper());
        this.cameraManager = j.b(new Camera2WrapperImpl$cameraManager$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createCaptureSession(List<? extends Surface> surfaces, final Function0<Unit> onConfigured, final Function1<? super Throwable, Unit> onError) throws CameraAccessException {
        try {
            CameraDevice cameraDevice = this.cameraDevice;
            if (cameraDevice != null) {
                cameraDevice.createCaptureSession(surfaces, new CameraCaptureSession.StateCallback() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2WrapperImpl.createCaptureSession.2
                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public void onConfigureFailed(@NotNull CameraCaptureSession session) {
                        Intrinsics.checkNotNullParameter(session, "session");
                        Integer num = (Integer) Camera2WrapperImpl.this.getCharacteristics().get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                        StringBuilder sb6 = new StringBuilder("Camera ");
                        CameraDevice cameraDevice2 = Camera2WrapperImpl.this.cameraDevice;
                        sb6.append(cameraDevice2 != null ? cameraDevice2.getId() : null);
                        sb6.append(" session configuration failed. Hardware level: ");
                        sb6.append(num);
                        String string = sb6.toString();
                        Timber.INSTANCE.e(string, new Object[0]);
                        onError.invoke(new IllegalStateException(string));
                    }

                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public void onConfigured(@NotNull CameraCaptureSession session) {
                        Intrinsics.checkNotNullParameter(session, "session");
                        Camera2WrapperImpl.this.captureSession = session;
                        onConfigured.invoke();
                    }
                }, this.cameraHandler);
            }
        } catch (IllegalStateException e) {
            Timber.INSTANCE.e(e);
            onError.invoke(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createCaptureSession$default(Camera2WrapperImpl camera2WrapperImpl, List list, Function0 function0, Function1 function1, int i, Object obj2) throws CameraAccessException {
        if ((i & 4) != 0) {
            function1 = AnonymousClass1.INSTANCE;
        }
        camera2WrapperImpl.createCaptureSession(list, function0, function1);
    }

    private final CaptureRequest createPreviewRequest(Surface... surfaces) throws CameraAccessException {
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession == null) {
            Intrinsics.r("captureSession");
            throw null;
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraCaptureSession.getDevice().createCaptureRequest(3);
        for (Surface surface : surfaces) {
            builderCreateCaptureRequest.addTarget(surface);
        }
        CaptureRequest captureRequestBuild = builderCreateCaptureRequest.build();
        Intrinsics.checkNotNullExpressionValue(captureRequestBuild, "build(...)");
        return captureRequestBuild;
    }

    private final CaptureRequest createRecordRequest(Surface... surfaces) throws CameraAccessException {
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession == null) {
            Intrinsics.r("captureSession");
            throw null;
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraCaptureSession.getDevice().createCaptureRequest(3);
        for (Surface surface : surfaces) {
            builderCreateCaptureRequest.addTarget(surface);
        }
        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(30, 30));
        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AWB_LOCK, Boolean.TRUE);
        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(this.motionVideoSettings.getExposureLock()));
        CaptureRequest captureRequestBuild = builderCreateCaptureRequest.build();
        Intrinsics.checkNotNullExpressionValue(captureRequestBuild, "build(...)");
        return captureRequestBuild;
    }

    private final CameraManager getCameraManager() {
        return (CameraManager) this.cameraManager.getValue();
    }

    private final String getFrontFacingCamera() throws CameraAccessException {
        Object next;
        String[] cameraIdList = getCameraManager().getCameraIdList();
        Intrinsics.checkNotNullExpressionValue(cameraIdList, "getCameraIdList(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : cameraIdList) {
            CameraCharacteristics cameraCharacteristics = getCameraManager().getCameraCharacteristics(str);
            Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "getCameraCharacteristics(...)");
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null ? kotlin.collections.d.G(iArr, 0) : false) {
                arrayList.add(str);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            CameraCharacteristics cameraCharacteristics2 = getCameraManager().getCameraCharacteristics((String) next);
            Intrinsics.checkNotNullExpressionValue(cameraCharacteristics2, "getCameraCharacteristics(...)");
            Integer num = (Integer) cameraCharacteristics2.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == 0) {
                break;
            }
        }
        return (String) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openCamera(final Function0<Unit> onOpened, final Function1<? super Throwable, Unit> onError) throws CameraAccessException {
        CameraManager cameraManager = getCameraManager();
        String str = this.selfieCameraId;
        if (str != null) {
            cameraManager.openCamera(str, new CameraDevice.StateCallback() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2WrapperImpl.openCamera.1
                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onDisconnected(@NotNull CameraDevice device) {
                    Intrinsics.checkNotNullParameter(device, "device");
                    StringBuilder sb6 = new StringBuilder("Camera ");
                    String str2 = Camera2WrapperImpl.this.selfieCameraId;
                    if (str2 == null) {
                        Intrinsics.r("selfieCameraId");
                        throw null;
                    }
                    String strI = v0.a.i(sb6, str2, " has been disconnected");
                    Timber.INSTANCE.e(strI, new Object[0]);
                    onError.invoke(new IllegalStateException(strI));
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onError(@NotNull CameraDevice device, int error) {
                    Intrinsics.checkNotNullParameter(device, "device");
                    String str2 = error != 1 ? error != 2 ? error != 3 ? error != 4 ? error != 5 ? "Unknown" : "Fatal (service)" : "Fatal (device)" : "Device policy" : "Maximum cameras in use" : "Camera in use";
                    StringBuilder sb6 = new StringBuilder("Camera ");
                    String str3 = Camera2WrapperImpl.this.selfieCameraId;
                    if (str3 == null) {
                        Intrinsics.r("selfieCameraId");
                        throw null;
                    }
                    sb6.append(str3);
                    sb6.append(" error: (");
                    sb6.append(error);
                    sb6.append(") ");
                    sb6.append(str2);
                    String string = sb6.toString();
                    Timber.INSTANCE.e(string, new Object[0]);
                    onError.invoke(new IllegalStateException(string));
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onOpened(@NotNull CameraDevice device) {
                    Intrinsics.checkNotNullParameter(device, "device");
                    Camera2WrapperImpl.this.cameraDevice = device;
                    onOpened.invoke();
                }
            }, this.cameraHandler);
        } else {
            Intrinsics.r("selfieCameraId");
            throw null;
        }
    }

    private final void sendSurfaceRequest(CameraViewfinder cameraViewFinder, Function0<Unit> onPreviewSurfaceReady) {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleOwner lifecycleOwnerFindViewTreeLifecycleOwner = ViewKt.findViewTreeLifecycleOwner(cameraViewFinder);
        if (lifecycleOwnerFindViewTreeLifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerFindViewTreeLifecycleOwner)) == null) {
            return;
        }
        e0.C(lifecycleScope, null, null, new C19711(cameraViewFinder, onPreviewSurfaceReady, null), 3);
    }

    private final void setupCameraViewFinder(final CameraViewfinder cameraViewFinder, final Function0<Unit> onPreviewSurfaceReady) {
        ViewExtensionsKt.toVisible$default(cameraViewFinder, false, 1, null);
        this.layoutChangedListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Camera2WrapperImpl.setupCameraViewFinder$lambda$4$lambda$3(cameraViewFinder, this, onPreviewSurfaceReady);
            }
        };
        cameraViewFinder.getViewTreeObserver().addOnGlobalLayoutListener(this.layoutChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCameraViewFinder$lambda$4$lambda$3(CameraViewfinder this_with, Camera2WrapperImpl this$0, Function0 onPreviewSurfaceReady) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onPreviewSurfaceReady, "$onPreviewSurfaceReady");
        this_with.getViewTreeObserver().removeOnGlobalLayoutListener(this$0.layoutChangedListener);
        this$0.layoutChangedListener = null;
        this$0.sendSurfaceRequest(this_with, onPreviewSurfaceReady);
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2Wrapper
    public void cleanup() {
        this.cameraThread.quitSafely();
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2Wrapper
    public void closeCamera() {
        ViewfinderSurfaceRequest viewfinderSurfaceRequest = this.viewfinderSurfaceRequest;
        if (viewfinderSurfaceRequest != null) {
            viewfinderSurfaceRequest.markSurfaceSafeToRelease();
        }
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null) {
            cameraDevice.close();
        }
        this.cameraDevice = null;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2Wrapper
    public void findSelfieCamera(@NotNull Function1<? super CameraCharacteristics, Unit> onSuccess, @NotNull Function1<? super Throwable, Unit> onError) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        String frontFacingCamera = getFrontFacingCamera();
        Unit unit = null;
        if (frontFacingCamera != null) {
            this.selfieCameraId = frontFacingCamera;
            CameraManager cameraManager = getCameraManager();
            String str = this.selfieCameraId;
            if (str == null) {
                Intrinsics.r("selfieCameraId");
                throw null;
            }
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "getCameraCharacteristics(...)");
            setCharacteristics(cameraCharacteristics);
            onSuccess.invoke(getCharacteristics());
            unit = Unit.f186387a;
        }
        if (unit == null) {
            Timber.INSTANCE.e("No compatible cameras available on the device", new Object[0]);
            onError.invoke(new IllegalStateException("No compatible cameras available on the device"));
        }
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2Wrapper
    @NotNull
    public CameraCharacteristics getCharacteristics() {
        CameraCharacteristics cameraCharacteristics = this.characteristics;
        if (cameraCharacteristics != null) {
            return cameraCharacteristics;
        }
        Intrinsics.r("characteristics");
        throw null;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2Wrapper
    public void resetCaptureSession(@NotNull Surface recorderSurface) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(recorderSurface, "recorderSurface");
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession == null) {
            Intrinsics.r("captureSession");
            throw null;
        }
        cameraCaptureSession.abortCaptures();
        Surface surface = this.previewSurface;
        if (surface != null) {
            createCaptureSession$default(this, v.k(surface, recorderSurface), new C19701(), null, 4, null);
        } else {
            Intrinsics.r("previewSurface");
            throw null;
        }
    }

    public void setCharacteristics(@NotNull CameraCharacteristics cameraCharacteristics) {
        Intrinsics.checkNotNullParameter(cameraCharacteristics, "<set-?>");
        this.characteristics = cameraCharacteristics;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2Wrapper
    public void setPreviewMode() throws CameraAccessException {
        try {
            if (this.cameraDevice != null) {
                CameraCaptureSession cameraCaptureSession = this.captureSession;
                if (cameraCaptureSession == null) {
                    Intrinsics.r("captureSession");
                    throw null;
                }
                Surface surface = this.previewSurface;
                if (surface != null) {
                    cameraCaptureSession.setRepeatingRequest(createPreviewRequest(surface), null, this.cameraHandler);
                } else {
                    Intrinsics.r("previewSurface");
                    throw null;
                }
            }
        } catch (IllegalStateException e) {
            Timber.INSTANCE.e(e);
        }
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2Wrapper
    public void setRecordingMode(@NotNull Surface recorderSurface) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(recorderSurface, "recorderSurface");
        if (this.cameraDevice != null) {
            CameraCaptureSession cameraCaptureSession = this.captureSession;
            if (cameraCaptureSession == null) {
                Intrinsics.r("captureSession");
                throw null;
            }
            Surface surface = this.previewSurface;
            if (surface != null) {
                cameraCaptureSession.setRepeatingRequest(createRecordRequest(surface, recorderSurface), null, this.cameraHandler);
            } else {
                Intrinsics.r("previewSurface");
                throw null;
            }
        }
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2Wrapper
    public void start(@NotNull CameraViewfinder cameraViewfinder, @NotNull Surface recorderSurface, @NotNull Function0<Unit> onSuccess, @NotNull Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(cameraViewfinder, "cameraViewfinder");
        Intrinsics.checkNotNullParameter(recorderSurface, "recorderSurface");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        setupCameraViewFinder(cameraViewfinder, new C19721(onError, recorderSurface, onSuccess));
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2Wrapper
    public void stopPreview() throws CameraAccessException {
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession == null) {
            Intrinsics.r("captureSession");
            throw null;
        }
        cameraCaptureSession.stopRepeating();
        CameraCaptureSession cameraCaptureSession2 = this.captureSession;
        if (cameraCaptureSession2 != null) {
            cameraCaptureSession2.abortCaptures();
        } else {
            Intrinsics.r("captureSession");
            throw null;
        }
    }
}
