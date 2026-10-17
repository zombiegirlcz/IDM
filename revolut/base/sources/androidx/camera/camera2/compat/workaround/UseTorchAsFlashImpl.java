package androidx.camera.camera2.compat.workaround;

import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk;
import androidx.camera.camera2.internal.IntrinsicZoomCalculator;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.core.Log;
import gim.c;
import gim.d;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pyc.a;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ.\u0010\u0010\u001a\u00020\u000b2\u001e\u0010\u0011\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0012H\u0096@¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000b*\u00020\u0014H\u0003¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Landroidx/camera/camera2/compat/workaround/UseTorchAsFlashImpl;", "Landroidx/camera/camera2/compat/workaround/UseTorchAsFlash;", "cameraQuirks", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "cameraDevices", "Landroidx/camera/camera2/pipe/CameraDevices;", "intrinsicZoomCalculator", "Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;", "<init>", "(Landroidx/camera/camera2/compat/quirk/CameraQuirks;Landroidx/camera/camera2/pipe/CameraDevices;Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;)V", "hasUwCameraUnderexposedFlashCaptureQuirk", "", "getHasUwCameraUnderexposedFlashCaptureQuirk", "()Z", "hasUwCameraUnderexposedFlashCaptureQuirk$delegate", "Lkotlin/Lazy;", "shouldUseTorchAsFlash", "frameMetadata", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isUltraWideCamera", "(Landroidx/camera/camera2/pipe/FrameMetadata;)Ljava/lang/Boolean;", "shouldDisableAePrecapture", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UseTorchAsFlashImpl implements UseTorchAsFlash {

    @NotNull
    private final CameraDevices cameraDevices;

    @NotNull
    private final CameraQuirks cameraQuirks;

    /* JADX INFO: renamed from: hasUwCameraUnderexposedFlashCaptureQuirk$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hasUwCameraUnderexposedFlashCaptureQuirk;

    @NotNull
    private final IntrinsicZoomCalculator intrinsicZoomCalculator;

    /* JADX INFO: renamed from: androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl$shouldUseTorchAsFlash$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl", f = "UseTorchAsFlash.kt", l = {113}, m = "shouldUseTorchAsFlash", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return UseTorchAsFlashImpl.this.shouldUseTorchAsFlash(null, this);
        }
    }

    public UseTorchAsFlashImpl(@NotNull CameraQuirks cameraQuirks, @NotNull CameraDevices cameraDevices, @NotNull IntrinsicZoomCalculator intrinsicZoomCalculator) {
        Intrinsics.checkNotNullParameter(cameraQuirks, "cameraQuirks");
        Intrinsics.checkNotNullParameter(cameraDevices, "cameraDevices");
        Intrinsics.checkNotNullParameter(intrinsicZoomCalculator, "intrinsicZoomCalculator");
        this.cameraQuirks = cameraQuirks;
        this.cameraDevices = cameraDevices;
        this.intrinsicZoomCalculator = intrinsicZoomCalculator;
        this.hasUwCameraUnderexposedFlashCaptureQuirk = j.b(new a(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasUwCameraUnderexposedFlashCaptureQuirk() {
        return ((Boolean) this.hasUwCameraUnderexposedFlashCaptureQuirk.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasUwCameraUnderexposedFlashCaptureQuirk_delegate$lambda$0(UseTorchAsFlashImpl useTorchAsFlashImpl) {
        return useTorchAsFlashImpl.cameraQuirks.getQuirks().contains(UltraWideFlashCaptureUnderexposureQuirk.class);
    }

    private final Boolean isUltraWideCamera(FrameMetadata frameMetadata) {
        CaptureResult.Key LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID = CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID;
        Intrinsics.checkNotNullExpressionValue(LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID, "LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID");
        String str = (String) frameMetadata.get(LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        if (str != null) {
            CameraMetadata cameraMetadataM122awaitCameraMetadataFpsL5FU$default = CameraDevices.m122awaitCameraMetadataFpsL5FU$default(this.cameraDevices, CameraId.m182constructorimpl(str), null, 2, null);
            if (cameraMetadataM122awaitCameraMetadataFpsL5FU$default != null) {
                Float fCalculateIntrinsicZoomRatio = this.intrinsicZoomCalculator.calculateIntrinsicZoomRatio(cameraMetadataM122awaitCameraMetadataFpsL5FU$default);
                if (fCalculateIntrinsicZoomRatio != null) {
                    float fFloatValue = fCalculateIntrinsicZoomRatio.floatValue();
                    if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                        String str2 = "isUltraWideCamera: cameraId = " + str + ", intrinsicZoomRatio = " + fFloatValue;
                    }
                    return Boolean.valueOf(fFloatValue < 1.0f);
                }
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                }
            } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
                "isUltraWideCamera: failed to get CameraMetadata for ".concat(str);
                return null;
            }
        } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
            return null;
        }
        return null;
    }

    @Override // androidx.camera.camera2.compat.workaround.UseTorchAsFlash
    public boolean shouldDisableAePrecapture() {
        return !getHasUwCameraUnderexposedFlashCaptureQuirk();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.camera.camera2.compat.workaround.UseTorchAsFlash
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object shouldUseTorchAsFlash(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.FrameMetadata>, ? extends java.lang.Object> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl$shouldUseTorchAsFlash$1 r0 = (androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl$shouldUseTorchAsFlash$1 r0 = new androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl$shouldUseTorchAsFlash$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            java.lang.String r3 = "CXCP"
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            yhm.o.b(r8)
            goto L73
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            androidx.camera.camera2.pipe.core.Log r8 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r2 = r8.getDEBUG_LOGGABLE()
            if (r2 == 0) goto L4f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "shouldUseTorchAsFlash: hasUwCameraUnderexposedFlashCaptureQuirk = "
            r2.<init>(r5)
            boolean r5 = access$getHasUwCameraUnderexposedFlashCaptureQuirk(r6)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
        L4f:
            boolean r2 = r6.getHasUwCameraUnderexposedFlashCaptureQuirk()
            if (r2 != 0) goto L58
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L58:
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r2 >= r5) goto L6a
            boolean r7 = r8.getWARN_LOGGABLE()
            if (r7 == 0) goto L67
            java.lang.String r7 = "shouldUseTorchAsFlash: API level is too low to know if it's ultra wide camera, defaulting to workaround for safety."
        L67:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L6a:
            r0.label = r4
            java.lang.Object r8 = r7.invoke(r0)
            if (r8 != r1) goto L73
            return r1
        L73:
            androidx.camera.camera2.pipe.FrameMetadata r8 = (androidx.camera.camera2.pipe.FrameMetadata) r8
            if (r8 != 0) goto L85
            androidx.camera.camera2.pipe.core.Log r7 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r7 = r7.getWARN_LOGGABLE()
            if (r7 == 0) goto L82
            java.lang.String r7 = "shouldUseTorchAsFlash: frameMetadata is null, defaulting to workaround for safety."
        L82:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L85:
            java.lang.Boolean r7 = r6.isUltraWideCamera(r8)
            if (r7 == 0) goto L8f
            boolean r4 = r7.booleanValue()
        L8f:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl.shouldUseTorchAsFlash(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
