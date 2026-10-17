package com.fourthline.vision.selfie;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.View;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.VisionFragment;
import com.fourthline.vision.internal.bb;
import com.fourthline.vision.internal.c0;
import com.fourthline.vision.internal.c2;
import com.fourthline.vision.internal.ff;
import com.fourthline.vision.internal.la;
import com.fourthline.vision.internal.pc;
import com.fourthline.vision.internal.s0;
import com.fourthline.vision.internal.sd;
import com.fourthline.vision.internal.uf;
import com.fourthline.vision.internal.yc;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import wim.o;
import yhm.j;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u000f\u0010\bR!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118PX\u0090\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0010X\u0090D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00178PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001bR\u0014\u0010)\u001a\u00020&8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/fourthline/vision/selfie/SelfieScannerFragment;", "Lcom/fourthline/vision/VisionFragment;", "Lcom/fourthline/vision/selfie/SelfieScannerStep;", "Lcom/fourthline/vision/selfie/SelfieScannerConfig;", "Lcom/fourthline/vision/selfie/SelfieScannerDataSource;", "Lcom/fourthline/vision/selfie/SelfieScannerCallback;", "Lcom/fourthline/vision/selfie/SelfieScanner;", "<init>", "()V", "Lcom/fourthline/vision/internal/ff;", "permission", "", "onPermissionNotGranted$fourthline_vision_release", "(Lcom/fourthline/vision/internal/ff;)V", "onPermissionNotGranted", "onNotSupportedDevice$fourthline_vision_release", "onNotSupportedDevice", "Lcom/fourthline/vision/internal/uf;", "c", "Lkotlin/Lazy;", "getSubcomponent$fourthline_vision_release", "()Lcom/fourthline/vision/internal/uf;", "subcomponent", "", "d", "Z", "isCameraInputMirrored$fourthline_vision_release", "()Z", "isCameraInputMirrored", "getStep", "()Lcom/fourthline/vision/selfie/SelfieScannerStep;", "step", "Lcom/fourthline/vision/RecordingType;", "getRecordingType$fourthline_vision_release", "()Lcom/fourthline/vision/RecordingType;", "recordingType", "getDebugModeEnabled$fourthline_vision_release", "debugModeEnabled", "Landroid/graphics/Rect;", "getDetectionArea$fourthline_vision_release", "()Landroid/graphics/Rect;", "detectionArea", "Landroid/view/View;", "getOverlayView$fourthline_vision_release", "()Landroid/view/View;", "overlayView", "Lcom/fourthline/vision/internal/pc;", "getScannerDataSource$fourthline_vision_release", "()Lcom/fourthline/vision/internal/pc;", "scannerDataSource", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SelfieScannerFragment extends VisionFragment<SelfieScannerStep, SelfieScannerConfig> implements SelfieScannerDataSource, SelfieScannerCallback, SelfieScanner {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy subcomponent = j.b(new com.fourthline.vision.selfie.b(this, 2));

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isCameraInputMirrored = true;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ff.values().length];
            try {
                iArr[ff.f36208a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ff.f36209b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ class a extends q implements Function0 {
        public a(Object obj2) {
            super(0, 0, SelfieScannerFragment.class, obj2, "getConfig", "getConfig()Lcom/fourthline/vision/selfie/SelfieScannerConfig;");
        }

        @Override // kotlin.jvm.functions.Function0
        public final SelfieScannerConfig invoke() {
            return ((SelfieScannerFragment) this.receiver).getConfig();
        }
    }

    public static final /* synthetic */ class b extends q implements Function0 {
        public b(Object obj2) {
            super(0, 0, o.class, obj2, "get", "get()Ljava/lang/Object;");
        }

        @Override // kotlin.jvm.functions.Function0
        public final pc invoke() {
            return (pc) ((o) this.receiver).get();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Matrix _get_scannerDataSource_$lambda$0(SelfieScannerFragment selfieScannerFragment) {
        Matrix imageToScreenCoordsMatrixAndTranslation$fourthline_vision_release = selfieScannerFragment.getImageToScreenCoordsMatrixAndTranslation$fourthline_vision_release();
        return imageToScreenCoordsMatrixAndTranslation$fourthline_vision_release == null ? new Matrix() : imageToScreenCoordsMatrixAndTranslation$fourthline_vision_release;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yc subcomponent_delegate$lambda$0(SelfieScannerFragment selfieScannerFragment) {
        c2.a aVarA = c2.a();
        Context contextRequireContext = selfieScannerFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return aVarA.a(new s0(contextRequireContext, la.f36486g.initFrom(selfieScannerFragment.getConfig()), null, null, null, 28, null)).a(c0.f36032b.selfieCamera$fourthline_vision_release()).a().selfieBuilder().selfieModule(new bb(new a(selfieScannerFragment), new com.fourthline.vision.selfie.b(selfieScannerFragment, 1), new b(new f0(selfieScannerFragment) { // from class: com.fourthline.vision.selfie.SelfieScannerFragment.c
            @Override // kotlin.jvm.internal.f0, wim.o
            public Object get() {
                return ((SelfieScannerFragment) this.receiver).getScannerDataSource$fourthline_vision_release();
            }
        }), selfieScannerFragment.getScannerDataSource$fourthline_vision_release(), null, null, 48, null)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelfieScannerCallback subcomponent_delegate$lambda$0$0(SelfieScannerFragment selfieScannerFragment) {
        return selfieScannerFragment;
    }

    @Override // com.fourthline.vision.VisionFragment
    public boolean getDebugModeEnabled$fourthline_vision_release() {
        return getConfig().getDebugModeEnabled();
    }

    @Override // com.fourthline.vision.VisionFragment
    @NotNull
    public Rect getDetectionArea$fourthline_vision_release() {
        return getFaceDetectionArea();
    }

    @Override // com.fourthline.vision.VisionFragment
    public View getOverlayView$fourthline_vision_release() {
        return getOverlayView();
    }

    @Override // com.fourthline.vision.VisionFragment
    @NotNull
    public RecordingType getRecordingType$fourthline_vision_release() {
        return getConfig().getRecordingType();
    }

    @Override // com.fourthline.vision.selfie.SelfieScanner
    public SelfieScannerStep getStep() {
        sd stepConfig = getVisionView$fourthline_vision_release().getStepConfig();
        if (stepConfig != null) {
            return (SelfieScannerStep) stepConfig.getStepType();
        }
        return null;
    }

    @Override // com.fourthline.vision.VisionFragment
    @NotNull
    public uf getSubcomponent$fourthline_vision_release() {
        return (uf) this.subcomponent.getValue();
    }

    @Override // com.fourthline.vision.VisionFragment
    /* JADX INFO: renamed from: isCameraInputMirrored$fourthline_vision_release, reason: from getter */
    public boolean getIsCameraInputMirrored() {
        return this.isCameraInputMirrored;
    }

    @Override // com.fourthline.vision.VisionFragment
    public void onNotSupportedDevice$fourthline_vision_release() {
        onFail(SelfieScannerError.UNKNOWN);
    }

    @Override // com.fourthline.vision.VisionFragment
    public void onPermissionNotGranted$fourthline_vision_release(@NotNull ff permission) {
        SelfieScannerError selfieScannerError;
        Intrinsics.checkNotNullParameter(permission, "permission");
        int i = WhenMappings.$EnumSwitchMapping$0[permission.ordinal()];
        if (i == 1) {
            selfieScannerError = SelfieScannerError.CAMERA_PERMISSION_NOT_GRANTED;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            selfieScannerError = SelfieScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED;
        }
        onFail(selfieScannerError);
    }

    @Override // com.fourthline.vision.VisionFragment
    @NotNull
    public pc getScannerDataSource$fourthline_vision_release() {
        return new pc(this, null, new com.fourthline.vision.selfie.b(this, 0), 2, null);
    }
}
