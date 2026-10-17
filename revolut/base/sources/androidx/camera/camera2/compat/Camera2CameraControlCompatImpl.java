package androidx.camera.camera2.compat;

import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.ComboRequestListenerKt;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.Config;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.g0;
import skm.q;
import skm.r;
import zhm.q0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J)\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\"\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010)R \u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R \u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010+¨\u0006-"}, d2 = {"Landroidx/camera/camera2/compat/Camera2CameraControlCompatImpl;", "Landroidx/camera/camera2/compat/Camera2CameraControlCompat;", "<init>", "()V", "Lskm/q;", "Ljava/lang/Void;", "", "msg", "cancelSignal", "(Lskm/q;Ljava/lang/String;)Lskm/q;", "Landroidx/camera/camera2/interop/CaptureRequestOptions;", "bundle", "", "addRequestOption", "(Landroidx/camera/camera2/interop/CaptureRequestOptions;)V", "getRequestOption", "()Landroidx/camera/camera2/interop/CaptureRequestOptions;", "clearRequestOption", "cancelCurrentTask", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "", "cancelPreviousTask", "Lskm/g0;", "applyAsync", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;Z)Lskm/g0;", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "Landroidx/camera/camera2/pipe/FrameInfo;", "result", "onComplete-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameInfo;)V", "onComplete", "", "lock", "Ljava/lang/Object;", "updateSignalLock", "Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "configBuilder", "Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "updateSignal", "Lskm/q;", "pendingSignal", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CameraControlCompatImpl implements Camera2CameraControlCompat {
    private q pendingSignal;
    private q updateSignal;

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private final Object updateSignalLock = new Object();

    @NotNull
    private Camera2ImplConfig.Builder configBuilder = new Camera2ImplConfig.Builder();

    private final q cancelSignal(q qVar, String str) {
        r rVar = (r) qVar;
        rVar.h0(new CameraControl.OperationCanceledException(str));
        return rVar;
    }

    public static /* synthetic */ q cancelSignal$default(Camera2CameraControlCompatImpl camera2CameraControlCompatImpl, q qVar, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = "Camera2CameraControl was updated with new options.";
        }
        return camera2CameraControlCompatImpl.cancelSignal(qVar, str);
    }

    @Override // androidx.camera.camera2.compat.Camera2CameraControlCompat
    public void addRequestOption(@NotNull CaptureRequestOptions bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        synchronized (this.lock) {
            try {
                for (Config.Option<?> option : bundle.listOptions()) {
                    Intrinsics.i(option, "null cannot be cast to non-null type androidx.camera.core.impl.Config.Option<kotlin.Any>");
                    this.configBuilder.getMutableConfig().insertOption(option, Config.OptionPriority.ALWAYS_OVERRIDE, bundle.retrieveOption(option));
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // androidx.camera.camera2.compat.Camera2CameraControlCompat
    @NotNull
    public g0 applyAsync(UseCaseCameraRequestControl requestControl, boolean cancelPreviousTask) {
        Camera2ImplConfig camera2ImplConfigBuild;
        r rVarB = e0.b();
        synchronized (this.lock) {
            camera2ImplConfigBuild = this.configBuilder.build();
        }
        synchronized (this.updateSignalLock) {
            try {
                if (requestControl != null) {
                    if (cancelPreviousTask) {
                        q qVar = this.updateSignal;
                        if (qVar != null) {
                            cancelSignal$default(this, qVar, null, 1, null);
                        }
                    } else {
                        q qVar2 = this.updateSignal;
                        if (qVar2 != null) {
                            CoroutineAdaptersKt.propagateTo(rVarB, qVar2);
                        }
                    }
                    this.updateSignal = rVarB;
                    requestControl.updateCamera2ConfigAsync(camera2ImplConfigBuild, q0.c(new Pair("Camera2CameraControl.tag", Integer.valueOf(rVarB.hashCode()))));
                } else {
                    q qVar3 = this.pendingSignal;
                    if (qVar3 != null) {
                        cancelSignal$default(this, qVar3, null, 1, null);
                    }
                    this.pendingSignal = rVarB;
                    Unit unit = Unit.f186387a;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return rVarB;
    }

    @Override // androidx.camera.camera2.compat.Camera2CameraControlCompat
    public void cancelCurrentTask() {
        synchronized (this.updateSignalLock) {
            try {
                q qVar = this.updateSignal;
                if (qVar != null) {
                    this.updateSignal = null;
                    cancelSignal(qVar, "The camera control has became inactive.");
                }
                q qVar2 = this.pendingSignal;
                if (qVar2 != null) {
                    this.pendingSignal = null;
                    cancelSignal(qVar2, "The camera control has became inactive.");
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // androidx.camera.camera2.compat.Camera2CameraControlCompat
    public void clearRequestOption() {
        synchronized (this.lock) {
            this.configBuilder = new Camera2ImplConfig.Builder();
            Unit unit = Unit.f186387a;
        }
    }

    @Override // androidx.camera.camera2.compat.Camera2CameraControlCompat
    @NotNull
    public CaptureRequestOptions getRequestOption() {
        CaptureRequestOptions captureRequestOptionsBuild;
        synchronized (this.lock) {
            captureRequestOptionsBuild = CaptureRequestOptions.Builder.INSTANCE.from(this.configBuilder.build()).build();
        }
        return captureRequestOptionsBuild;
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* JADX INFO: renamed from: onComplete-CcXjc1I */
    public void mo6onCompleteCcXjc1I(@NotNull RequestMetadata requestMetadata, long frameNumber, @NotNull FrameInfo result) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        Intrinsics.checkNotNullParameter(result, "result");
        synchronized (this.updateSignalLock) {
            try {
                q qVar = this.updateSignal;
                if (qVar != null && ComboRequestListenerKt.containsTag(requestMetadata, "Camera2CameraControl.tag", Integer.valueOf(qVar.hashCode()))) {
                    ((r) qVar).U(null);
                    this.updateSignal = null;
                    q qVar2 = this.pendingSignal;
                    if (qVar2 != null) {
                        ((r) qVar2).U(null);
                        this.pendingSignal = null;
                    }
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
