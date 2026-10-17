package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.adapter.CaptureConfigAdapter;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.CapturePipeline;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CaptureConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import phm.a;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 92\u00020\u0001:\u00019B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0015\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JT\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f0\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b!\u0010\"J(\u0010%\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u001b\u0010,\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0017R#\u00101\u001a\n -*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u00100R*\u00103\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u001b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006:"}, d2 = {"Landroidx/camera/camera2/compat/workaround/CapturePipelineTorchCorrection;", "Landroidx/camera/camera2/impl/CapturePipeline;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Lphm/a;", "Landroidx/camera/camera2/impl/CapturePipelineImpl;", "capturePipelineImplProvider", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/impl/TorchControl;", "torchControl", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Lphm/a;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/impl/TorchControl;)V", "", "Landroidx/camera/core/impl/CaptureConfig;", "captureConfigs", "Landroidx/camera/camera2/pipe/RequestTemplate;", "requestTemplate", "", "isCorrectionRequired-0UCm73U", "(Ljava/util/List;I)Z", "isCorrectionRequired", "isTorchOn", "()Z", "configs", "Landroidx/camera/core/impl/Config;", "sessionConfigOptions", "", "captureMode", "flashType", "flashMode", "Lskm/g0;", "Ljava/lang/Void;", "submitStillCaptures-BvXKQx0", "(Ljava/util/List;ILandroidx/camera/core/impl/Config;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitStillCaptures", "Landroidx/camera/core/imagecapture/CameraCapturePipeline;", "getCameraCapturePipeline", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lphm/a;", "Landroidx/camera/camera2/impl/UseCaseThreads;", "Landroidx/camera/camera2/impl/TorchControl;", "isLegacyDevice$delegate", "Lkotlin/Lazy;", "isLegacyDevice", "kotlin.jvm.PlatformType", "capturePipelineImpl$delegate", "getCapturePipelineImpl", "()Landroidx/camera/camera2/impl/CapturePipelineImpl;", "capturePipelineImpl", "value", "template", "I", "getTemplate", "()I", "setTemplate", "(I)V", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CapturePipelineTorchCorrection implements CapturePipeline {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean isEnabled;

    /* JADX INFO: renamed from: capturePipelineImpl$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy capturePipelineImpl;

    @NotNull
    private final a capturePipelineImplProvider;

    /* JADX INFO: renamed from: isLegacyDevice$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isLegacyDevice;
    private int template;

    @NotNull
    private final UseCaseThreads threads;

    @NotNull
    private final TorchControl torchControl;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/camera/camera2/compat/workaround/CapturePipelineTorchCorrection$Companion;", "", "<init>", "()V", "isEnabled", "", "()Z", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isEnabled() {
            return CapturePipelineTorchCorrection.isEnabled;
        }

        private Companion() {
        }
    }

    static {
        isEnabled = DeviceQuirks.INSTANCE.get(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public CapturePipelineTorchCorrection(@NotNull CameraProperties cameraProperties, @NotNull a capturePipelineImplProvider, @NotNull UseCaseThreads threads, @NotNull TorchControl torchControl) {
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(capturePipelineImplProvider, "capturePipelineImplProvider");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(torchControl, "torchControl");
        this.capturePipelineImplProvider = capturePipelineImplProvider;
        this.threads = threads;
        this.torchControl = torchControl;
        this.isLegacyDevice = j.b(new q.a(cameraProperties, 0));
        this.capturePipelineImpl = j.b(new pyc.a(this, 2));
        this.template = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CapturePipelineImpl capturePipelineImpl_delegate$lambda$0(CapturePipelineTorchCorrection capturePipelineTorchCorrection) {
        return (CapturePipelineImpl) capturePipelineTorchCorrection.capturePipelineImplProvider.get();
    }

    private final CapturePipelineImpl getCapturePipelineImpl() {
        return (CapturePipelineImpl) this.capturePipelineImpl.getValue();
    }

    /* JADX INFO: renamed from: isCorrectionRequired-0UCm73U, reason: not valid java name */
    private final boolean m10isCorrectionRequired0UCm73U(List<CaptureConfig> captureConfigs, int requestTemplate) {
        List<CaptureConfig> list = captureConfigs;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            if (CaptureConfigAdapter.INSTANCE.m5getStillCaptureTemplateCMLptTo$camera_camera2((CaptureConfig) it8.next(), requestTemplate, isLegacyDevice()) == 2) {
                return isTorchOn();
            }
        }
        return false;
    }

    private final boolean isLegacyDevice() {
        return ((Boolean) this.isLegacyDevice.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLegacyDevice_delegate$lambda$0(CameraProperties cameraProperties) {
        return CameraMetadata.INSTANCE.isHardwareLevelLegacy(cameraProperties.getMetadata());
    }

    private final boolean isTorchOn() {
        Integer value = this.torchControl.getTorchStateLiveData().getValue();
        return value != null && value.intValue() == 1;
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    public Object getCameraCapturePipeline(int i, int i2, int i3, @NotNull Continuation<? super CameraCapturePipeline> continuation) {
        return getCapturePipelineImpl().getCameraCapturePipeline(i, i2, i3, continuation);
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    public void setTemplate(int i) {
        getCapturePipelineImpl().setTemplate(i);
        this.template = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // androidx.camera.camera2.impl.CapturePipeline
    /* JADX INFO: renamed from: submitStillCaptures-BvXKQx0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo11submitStillCapturesBvXKQx0(@org.jetbrains.annotations.NotNull java.util.List<androidx.camera.core.impl.CaptureConfig> r11, int r12, @org.jetbrains.annotations.NotNull androidx.camera.core.impl.Config r13, int r14, int r15, int r16, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends skm.g0>> r17) {
        /*
            r10 = this;
            r0 = r17
            boolean r1 = r0 instanceof androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$1
            if (r1 == 0) goto L16
            r1 = r0
            androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$1 r1 = (androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r9 = r1
            goto L1c
        L16:
            androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$1 r1 = new androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$1
            r1.<init>(r10, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r9.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r1 = r9.Z$0
            yhm.o.b(r0)
            goto L54
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            yhm.o.b(r0)
            boolean r0 = r10.m10isCorrectionRequired0UCm73U(r11, r12)
            androidx.camera.camera2.impl.CapturePipelineImpl r2 = r10.getCapturePipelineImpl()
            r9.Z$0 = r0
            r9.label = r3
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            java.lang.Object r2 = r2.mo11submitStillCapturesBvXKQx0(r3, r4, r5, r6, r7, r8, r9)
            if (r2 != r1) goto L52
            return r1
        L52:
            r1 = r0
            r0 = r2
        L54:
            java.util.List r0 = (java.util.List) r0
            if (r1 == 0) goto L68
            androidx.camera.camera2.impl.UseCaseThreads r1 = r10.threads
            kotlinx.coroutines.CoroutineScope r1 = r1.getSequentialScope()
            androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$2 r2 = new androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$2
            r3 = 0
            r2.<init>(r0, r10, r3)
            r4 = 3
            skm.e0.C(r1, r3, r3, r2, r4)
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection.mo11submitStillCapturesBvXKQx0(java.util.List, int, androidx.camera.core.impl.Config, int, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
