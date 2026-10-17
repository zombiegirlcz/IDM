package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.Threads;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import fim.a;
import gim.d;
import gim.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.g0;
import skm.q;
import skm.r;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014*\b\u0012\u0004\u0012\u00020\u00110\u00142\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0013J\u001b\u0010\"\u001a\u00020\u00112\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0 ¢\u0006\u0004\b\"\u0010#J%\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110'2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$¢\u0006\u0004\b(\u0010)R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\"\u00105\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\u001b0\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R0\u0010<\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b<\u0010=\u0012\u0004\bB\u0010\u0013\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010H\u001a\u0004\u0018\u00010.2\b\u0010C\u001a\u0004\u0018\u00010.8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001b0I8F¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Landroidx/camera/camera2/impl/LowLightBoostControl;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "Landroidx/camera/camera2/impl/State3AControl;", "state3AControl", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/impl/ComboRequestListener;", "comboRequestListener", "<init>", "(Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/camera2/impl/State3AControl;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/impl/ComboRequestListener;)V", "", "Landroidx/camera/core/UseCase;", "Landroidx/camera/core/impl/SessionConfig;", "getSessionConfig", "(Ljava/util/Collection;)Landroidx/camera/core/impl/SessionConfig;", "", "stopRunningTaskInternal", "()V", "Lskm/q;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "createFailureResult", "(Lskm/q;Ljava/lang/Exception;)Lskm/q;", "Landroidx/lifecycle/MutableLiveData;", "", "state", "setLiveDataValue", "(Landroidx/lifecycle/MutableLiveData;I)V", "reset", "", "useCases", "onSessionConfigChanged", "(Ljava/util/List;)V", "", "lowLightBoost", "cancelPreviousTask", "Lskm/g0;", "setLowLightBoostAsync", "(ZZ)Lskm/g0;", "Landroidx/camera/camera2/pipe/CameraMetadata;", "Landroidx/camera/camera2/impl/State3AControl;", "Landroidx/camera/camera2/impl/UseCaseThreads;", "Landroidx/camera/camera2/impl/ComboRequestListener;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "_requestControl", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "isLowLightBoostSupported", "Z", "isLowLightBoostOn", "kotlin.jvm.PlatformType", "_lowLightBoostState", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/concurrent/atomic/AtomicInteger;", "lowLightBoostStateAtomic", "Ljava/util/concurrent/atomic/AtomicInteger;", "_updateSignal", "Lskm/q;", "checkFrameRateJob", "Lskm/g0;", "getCheckFrameRateJob$camera_camera2", "()Lskm/g0;", "setCheckFrameRateJob$camera_camera2", "(Lskm/g0;)V", "getCheckFrameRateJob$camera_camera2$annotations", "value", "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "setRequestControl", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "requestControl", "Landroidx/lifecycle/LiveData;", "getLowLightBoostStateLiveData", "()Landroidx/lifecycle/LiveData;", "lowLightBoostStateLiveData", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LowLightBoostControl implements UseCaseCameraControl {

    @NotNull
    private final MutableLiveData<Integer> _lowLightBoostState;
    private UseCaseCameraRequestControl _requestControl;
    private q _updateSignal;
    private final CameraMetadata cameraMetadata;
    private g0 checkFrameRateJob;

    @NotNull
    private final ComboRequestListener comboRequestListener;
    private boolean isLowLightBoostOn;
    private final boolean isLowLightBoostSupported;

    @NotNull
    private final AtomicInteger lowLightBoostStateAtomic;

    @NotNull
    private final State3AControl state3AControl;

    @NotNull
    private final UseCaseThreads threads;

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.LowLightBoostControl$onSessionConfigChanged$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.LowLightBoostControl$onSessionConfigChanged$1", f = "LowLightBoostControl.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18301 extends i implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ List<UseCase> $useCases;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C18301(List<? extends UseCase> list, Continuation<? super C18301> continuation) {
            super(2, continuation);
            this.$useCases = list;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return LowLightBoostControl.this.new C18301(this.$useCases, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return Boolean.valueOf(((Number) LowLightBoostControl.this.getSessionConfig(this.$useCases).getExpectedFrameRateRange().getUpper()).intValue() > 30);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C18301) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public LowLightBoostControl(CameraMetadata cameraMetadata, @NotNull State3AControl state3AControl, @NotNull UseCaseThreads threads, @NotNull ComboRequestListener comboRequestListener) {
        Intrinsics.checkNotNullParameter(state3AControl, "state3AControl");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(comboRequestListener, "comboRequestListener");
        this.cameraMetadata = cameraMetadata;
        this.state3AControl = state3AControl;
        this.threads = threads;
        this.comboRequestListener = comboRequestListener;
        boolean z = false;
        if (cameraMetadata != null && CameraMetadata.INSTANCE.getSupportsLowLightBoost(cameraMetadata)) {
            z = true;
        }
        this.isLowLightBoostSupported = z;
        this._lowLightBoostState = new MutableLiveData<>(-1);
        this.lowLightBoostStateAtomic = new AtomicInteger(-1);
        if (z) {
            comboRequestListener.addListener(new Request.Listener() { // from class: androidx.camera.camera2.impl.LowLightBoostControl.1
                @Override // androidx.camera.camera2.pipe.Request.Listener
                /* JADX INFO: renamed from: onTotalCaptureResult-CcXjc1I */
                public void mo8onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long frameNumber, FrameInfo totalCaptureResult) {
                    Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
                    Intrinsics.checkNotNullParameter(totalCaptureResult, "totalCaptureResult");
                    if (Build.VERSION.SDK_INT < 35 || LowLightBoostControl.this._requestControl == null || !LowLightBoostControl.this.isLowLightBoostOn) {
                        return;
                    }
                    FrameMetadata metadata = totalCaptureResult.getMetadata();
                    CaptureResult.Key CONTROL_LOW_LIGHT_BOOST_STATE = CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE;
                    Intrinsics.checkNotNullExpressionValue(CONTROL_LOW_LIGHT_BOOST_STATE, "CONTROL_LOW_LIGHT_BOOST_STATE");
                    Integer num = (Integer) metadata.get(CONTROL_LOW_LIGHT_BOOST_STATE);
                    if (num != null) {
                        LowLightBoostControl lowLightBoostControl = LowLightBoostControl.this;
                        lowLightBoostControl.setLiveDataValue(lowLightBoostControl._lowLightBoostState, num.intValue() != 1 ? 0 : 1);
                    }
                }
            }, threads.getSequentialExecutor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q createFailureResult(q qVar, Exception exc2) {
        r rVar = (r) qVar;
        rVar.h0(exc2);
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SessionConfig getSessionConfig(Collection<? extends UseCase> collection) {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        Iterator<T> it8 = collection.iterator();
        while (it8.hasNext()) {
            validatingBuilder.add(((UseCase) it8.next()).getSessionConfig());
        }
        SessionConfig sessionConfigBuild = validatingBuilder.build();
        Intrinsics.checkNotNullExpressionValue(sessionConfigBuild, "build(...)");
        return sessionConfigBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLiveDataValue(MutableLiveData<Integer> mutableLiveData, int i) {
        if (this.lowLightBoostStateAtomic.getAndSet(i) != i) {
            if (Threads.isMainThread()) {
                mutableLiveData.setValue(Integer.valueOf(i));
            } else {
                mutableLiveData.postValue(Integer.valueOf(i));
            }
        }
    }

    public static /* synthetic */ g0 setLowLightBoostAsync$default(LowLightBoostControl lowLightBoostControl, boolean z, boolean z3, int i, Object obj2) {
        if ((i & 2) != 0) {
            z3 = true;
        }
        return lowLightBoostControl.setLowLightBoostAsync(z, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopRunningTaskInternal() {
        q qVar = this._updateSignal;
        if (qVar != null) {
            createFailureResult(qVar, new CameraControl.OperationCanceledException("There is a new enableLowLightBoost being set"));
        }
        this._updateSignal = null;
    }

    /* JADX INFO: renamed from: getCheckFrameRateJob$camera_camera2, reason: from getter */
    public final g0 getCheckFrameRateJob() {
        return this.checkFrameRateJob;
    }

    @NotNull
    public final LiveData<Integer> getLowLightBoostStateLiveData() {
        return this._lowLightBoostState;
    }

    /* JADX INFO: renamed from: getRequestControl, reason: from getter */
    public UseCaseCameraRequestControl get_requestControl() {
        return this._requestControl;
    }

    public final void onSessionConfigChanged(@NotNull List<? extends UseCase> useCases) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        if (this.isLowLightBoostSupported) {
            if (useCases.isEmpty()) {
                this.checkFrameRateJob = e0.a(Boolean.FALSE);
            } else {
                this.checkFrameRateJob = e0.g(this.threads.getSequentialScope(), null, null, new C18301(useCases, null), 3);
            }
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        stopRunningTaskInternal();
        setLowLightBoostAsync$default(this, false, false, 2, null);
    }

    @NotNull
    public final g0 setLowLightBoostAsync(boolean lowLightBoost, boolean cancelPreviousTask) {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            String str = "LowLightBoostControl#setLowLightBoostAsync: lowLightBoost = " + lowLightBoost;
        }
        r rVarB = e0.b();
        if (!this.isLowLightBoostSupported) {
            return createFailureResult(rVarB, new IllegalStateException("Low Light Boost is not supported!"));
        }
        e0.C(this.threads.getSequentialScope(), null, null, new LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1(null, this, rVarB, lowLightBoost, cancelPreviousTask), 3);
        return rVarB;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        if (this.isLowLightBoostOn) {
            if (useCaseCameraRequestControl != null) {
                setLowLightBoostAsync(true, false);
            } else {
                setLiveDataValue(this._lowLightBoostState, 0);
            }
        }
    }
}
