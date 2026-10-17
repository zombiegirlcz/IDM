package com.fourthline.vision.document;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.View;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.VisionFragment;
import com.fourthline.vision.internal.c0;
import com.fourthline.vision.internal.c2;
import com.fourthline.vision.internal.ff;
import com.fourthline.vision.internal.k5;
import com.fourthline.vision.internal.la;
import com.fourthline.vision.internal.na;
import com.fourthline.vision.internal.o3;
import com.fourthline.vision.internal.s0;
import com.fourthline.vision.internal.sd;
import com.fourthline.vision.internal.uf;
import com.fourthline.vision.internal.v5;
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
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\bR!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158PX\u0090\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0010X\u0090D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u001b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001fR\u0014\u00101\u001a\u00020.8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00105\u001a\u0004\u0018\u0001028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0003068PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerFragment;", "Lcom/fourthline/vision/VisionFragment;", "Lcom/fourthline/vision/document/DocumentScannerStep;", "Lcom/fourthline/vision/document/DocumentScannerConfig;", "Lcom/fourthline/vision/document/DocumentScannerDataSource;", "Lcom/fourthline/vision/document/DocumentScannerCallback;", "Lcom/fourthline/vision/document/DocumentScanner;", "<init>", "()V", "Lcom/fourthline/vision/internal/ff;", "permission", "", "onPermissionNotGranted$fourthline_vision_release", "(Lcom/fourthline/vision/internal/ff;)V", "onPermissionNotGranted", "onNotSupportedDevice$fourthline_vision_release", "onNotSupportedDevice", "takeSnapshot", "resetCurrentStep", "moveToNextStep", "startScanner", "Lcom/fourthline/vision/internal/uf;", "c", "Lkotlin/Lazy;", "getSubcomponent$fourthline_vision_release", "()Lcom/fourthline/vision/internal/uf;", "subcomponent", "", "d", "Z", "isCameraInputMirrored$fourthline_vision_release", "()Z", "isCameraInputMirrored", "getStep", "()Lcom/fourthline/vision/document/DocumentScannerStep;", "step", "", "getStepsCount", "()Ljava/lang/Integer;", "stepsCount", "Lcom/fourthline/vision/RecordingType;", "getRecordingType$fourthline_vision_release", "()Lcom/fourthline/vision/RecordingType;", "recordingType", "getDebugModeEnabled$fourthline_vision_release", "debugModeEnabled", "Landroid/graphics/Rect;", "getDetectionArea$fourthline_vision_release", "()Landroid/graphics/Rect;", "detectionArea", "Landroid/view/View;", "getOverlayView$fourthline_vision_release", "()Landroid/view/View;", "overlayView", "Lcom/fourthline/vision/internal/na;", "getScannerDataSource$fourthline_vision_release", "()Lcom/fourthline/vision/internal/na;", "scannerDataSource", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DocumentScannerFragment extends VisionFragment<DocumentScannerStep, DocumentScannerConfig> implements DocumentScannerDataSource, DocumentScannerCallback, DocumentScanner {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy subcomponent = j.b(new com.fourthline.vision.document.b(this, 2));

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isCameraInputMirrored;

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
            super(0, 0, DocumentScannerFragment.class, obj2, "getConfig", "getConfig()Lcom/fourthline/vision/document/DocumentScannerConfig;");
        }

        @Override // kotlin.jvm.functions.Function0
        public final DocumentScannerConfig invoke() {
            return ((DocumentScannerFragment) this.receiver).getConfig();
        }
    }

    public static final /* synthetic */ class b extends q implements Function0 {
        public b(Object obj2) {
            super(0, 0, o.class, obj2, "get", "get()Ljava/lang/Object;");
        }

        @Override // kotlin.jvm.functions.Function0
        public final na invoke() {
            return (na) ((o) this.receiver).get();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Matrix _get_scannerDataSource_$lambda$0(DocumentScannerFragment documentScannerFragment) {
        Matrix imageToScreenCoordsMatrixAndTranslation$fourthline_vision_release = documentScannerFragment.getImageToScreenCoordsMatrixAndTranslation$fourthline_vision_release();
        return imageToScreenCoordsMatrixAndTranslation$fourthline_vision_release == null ? new Matrix() : imageToScreenCoordsMatrixAndTranslation$fourthline_vision_release;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v5 subcomponent_delegate$lambda$0(DocumentScannerFragment documentScannerFragment) {
        c2.a aVarA = c2.a();
        Context contextRequireContext = documentScannerFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return aVarA.a(new s0(contextRequireContext, la.f36486g.initFrom(documentScannerFragment.getConfig(), documentScannerFragment.getShouldStartAutomatically()), null, null, null, 28, null)).a(c0.f36032b.documentCamera$fourthline_vision_release()).a().documentBuilder().documentModule(new o3(new a(documentScannerFragment), new com.fourthline.vision.document.b(documentScannerFragment, 0), new b(new f0(documentScannerFragment) { // from class: com.fourthline.vision.document.DocumentScannerFragment.c
            @Override // kotlin.jvm.internal.f0, wim.o
            public Object get() {
                return ((DocumentScannerFragment) this.receiver).getScannerDataSource$fourthline_vision_release();
            }
        }), documentScannerFragment.getScannerDataSource$fourthline_vision_release())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentScannerCallback subcomponent_delegate$lambda$0$0(DocumentScannerFragment documentScannerFragment) {
        return documentScannerFragment;
    }

    @Override // com.fourthline.vision.VisionFragment
    public boolean getDebugModeEnabled$fourthline_vision_release() {
        return getConfig().getDebugModeEnabled();
    }

    @Override // com.fourthline.vision.VisionFragment
    @NotNull
    public Rect getDetectionArea$fourthline_vision_release() {
        return getDocumentDetectionArea();
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

    @Override // com.fourthline.vision.VisionFragment
    @NotNull
    public na getScannerDataSource$fourthline_vision_release() {
        return new k5(this, new com.fourthline.vision.document.b(this, 1));
    }

    @Override // com.fourthline.vision.document.DocumentScanner
    public DocumentScannerStep getStep() {
        sd stepConfig = getVisionView$fourthline_vision_release().getStepConfig();
        if (stepConfig != null) {
            return (DocumentScannerStep) stepConfig.getStepType();
        }
        return null;
    }

    @Override // com.fourthline.vision.document.DocumentScanner
    public Integer getStepsCount() {
        return Integer.valueOf(getVisionView$fourthline_vision_release().getStepsCount());
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

    @Override // com.fourthline.vision.document.DocumentScanner
    public void moveToNextStep() {
        getVisionView$fourthline_vision_release().moveToNextStep();
    }

    @Override // com.fourthline.vision.VisionFragment
    public void onNotSupportedDevice$fourthline_vision_release() {
        onFail(DocumentScannerError.UNKNOWN);
    }

    @Override // com.fourthline.vision.VisionFragment
    public void onPermissionNotGranted$fourthline_vision_release(@NotNull ff permission) {
        DocumentScannerError documentScannerError;
        Intrinsics.checkNotNullParameter(permission, "permission");
        int i = WhenMappings.$EnumSwitchMapping$0[permission.ordinal()];
        if (i == 1) {
            documentScannerError = DocumentScannerError.CAMERA_PERMISSION_NOT_GRANTED;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            documentScannerError = DocumentScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED;
        }
        onFail(documentScannerError);
    }

    @Override // com.fourthline.vision.document.DocumentScannerCallback
    public /* bridge */ void onStepsCountUpdate(int i) {
        super.onStepsCountUpdate(i);
    }

    @Override // com.fourthline.vision.document.DocumentScanner
    public void resetCurrentStep() {
        getVisionView$fourthline_vision_release().resetCurrentStep();
    }

    @Override // com.fourthline.vision.document.DocumentScanner
    public void startScanner() {
        getVisionView$fourthline_vision_release().start();
    }

    @Override // com.fourthline.vision.document.DocumentScanner
    public void takeSnapshot() {
        getVisionView$fourthline_vision_release().takeSnapshot();
    }
}
