package com.fourthline.vision.internal;

import com.fourthline.core.mrz.IdlMrzInfo;
import com.fourthline.core.mrz.IdlMrzInfoValidationError;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerError;
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepError;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.document.DocumentValidationError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerConfig f36097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pe f36098b;

    public static final /* synthetic */ class a {
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

    public d6(@NotNull DocumentScannerConfig config, @NotNull pe scannerContext) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(scannerContext, "scannerContext");
        this.f36097a = config;
        this.f36098b = scannerContext;
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.c(scannerContext);
        }
        u9.f36980a.flushToScannerIfPresent();
    }

    private final void clearScannerContext() {
        u9.f36980a.clear();
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.a(ib.b.Scanner);
        }
    }

    private final String getNameLowerCased(Enum<?> r3) {
        String strName = r3.name();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final void onStepFail(DocumentScannerStep documentScannerStep, DocumentScannerStepError documentScannerStepError, Throwable th10) {
        we weVar = new we(getNameLowerCased(documentScannerStep.getFileSide()), documentScannerStep.getIndex(), documentScannerStep.isAngled(), documentScannerStep.isAutoDetectAvailable(), documentScannerStepError, th10);
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(weVar);
        }
    }

    private final Pair<String, String> toDocumentFlowAttr(String str) {
        return new Pair<>("document_flow", str);
    }

    private final Pair<String, String> toDocumentTypeAttr(DocumentScannerConfig documentScannerConfig) {
        return new Pair<>("document_type", getNameLowerCased(documentScannerConfig.getType()));
    }

    private final Pair<String, String> toFileSideAttr(DocumentScannerStep documentScannerStep) {
        return new Pair<>("fileside", getNameLowerCased(documentScannerStep.getFileSide()));
    }

    private final Pair<String, Boolean> toIsAngledAttr(DocumentScannerStep documentScannerStep) {
        return new Pair<>("is_angled", Boolean.valueOf(documentScannerStep.isAngled()));
    }

    private final Pair<String, Boolean> toIsAutodetectAvailableAttr(DocumentScannerStep documentScannerStep) {
        return new Pair<>("is_autodetect_available", Boolean.valueOf(documentScannerStep.isAutoDetectAvailable()));
    }

    private final Pair<String, Boolean> toIsMrzExtractedAttr(MrzInfo mrzInfo) {
        return new Pair<>("is_mrz_extracted", Boolean.valueOf(mrzInfo != null));
    }

    private final Map<String, Object> toStepAttrs(DocumentScannerStep documentScannerStep, DocumentScannerConfig documentScannerConfig) {
        return zhm.r0.k(toDocumentTypeAttr(documentScannerConfig), toFileSideAttr(documentScannerStep), toIsAngledAttr(documentScannerStep), toIsAutodetectAvailableAttr(documentScannerStep), toStepIndexAttr(documentScannerStep));
    }

    private final Pair<String, Integer> toStepIndexAttr(DocumentScannerStep documentScannerStep) {
        return new Pair<>("index", Integer.valueOf(documentScannerStep.getIndex()));
    }

    private final Pair<String, List<String>> toValidationErrorsAttr(List<String> list) {
        return new Pair<>("validation_errors", list);
    }

    public final void onFail(@NotNull DocumentScannerStep scannerStep, @NotNull DocumentScannerError scannerError, Throwable th10) {
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        Intrinsics.checkNotNullParameter(scannerError, "scannerError");
        te teVar = new te(getNameLowerCased(scannerStep.getFileSide()), scannerStep.getIndex(), scannerStep.isAngled(), scannerStep.isAutoDetectAvailable(), scannerError, th10);
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(teVar);
        }
        clearScannerContext();
    }

    public final void onMoveToNextStep() {
    }

    public final void onPermissionNotGranted(@NotNull ff permission) {
        DocumentScannerError documentScannerError;
        Intrinsics.checkNotNullParameter(permission, "permission");
        int i = a.$EnumSwitchMapping$0[permission.ordinal()];
        if (i == 1) {
            documentScannerError = DocumentScannerError.CAMERA_PERMISSION_NOT_GRANTED;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            documentScannerError = DocumentScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED;
        }
        re reVar = new re(documentScannerError);
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(reVar);
        }
        clearScannerContext();
    }

    public final void onReset() {
        clearScannerContext();
    }

    public final void onResetCurrentStep(@NotNull DocumentScannerStep scannerStep) {
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        xe xeVar = new xe(getNameLowerCased(scannerStep.getFileSide()), scannerStep.getIndex(), scannerStep.isAngled(), scannerStep.isAutoDetectAvailable());
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(xeVar);
        }
    }

    public final void onStart() {
        ue ueVar = ue.f36989a;
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(ueVar);
        }
    }

    public final void onStepSuccess(@NotNull DocumentScannerStep scannerStep, @NotNull DocumentScannerStepResult stepResult) {
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        Intrinsics.checkNotNullParameter(stepResult, "stepResult");
        Set<DocumentValidationError> validationErrors = stepResult.getValidationErrors();
        ArrayList arrayList = new ArrayList(zhm.w.t(validationErrors, 10));
        Iterator<T> it8 = validationErrors.iterator();
        while (it8.hasNext()) {
            arrayList.add(getNameLowerCased((DocumentValidationError) it8.next()));
        }
        ib.h hVar = hb.a.f150532a;
        hb.a.c(zhm.r0.q(zhm.r0.q(zhm.r0.q(toStepAttrs(scannerStep, this.f36097a), toValidationErrorsAttr(arrayList)), toIsMrzExtractedAttr(null)), toDocumentFlowAttr("document_step_success")), "document_step_success", 2);
        ve veVar = new ve(getNameLowerCased(scannerStep.getFileSide()), scannerStep.getIndex(), scannerStep.isAngled(), scannerStep.isAutoDetectAvailable(), false, arrayList);
        ib.h hVar2 = hb.a.f150532a;
        if (hVar2 != null) {
            hVar2.f(veVar);
        }
    }

    public final void onStepUpdate(@NotNull DocumentScannerStep scannerStep) {
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        ye yeVar = new ye(getNameLowerCased(scannerStep.getFileSide()), scannerStep.getIndex(), scannerStep.isAngled(), scannerStep.isAutoDetectAvailable());
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(yeVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public final void onSuccess(@NotNull DocumentScannerResult result) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(result, "result");
        MrzInfo mrzInfo = result.getMrzInfo();
        if (mrzInfo instanceof MrtdMrzInfo) {
            List<MrtdMrzInfoValidationError> validationErrors = ((MrtdMrzInfo) mrzInfo).getValidationErrors();
            arrayList = new ArrayList(zhm.w.t(validationErrors, 10));
            Iterator it8 = validationErrors.iterator();
            while (it8.hasNext()) {
                arrayList.add(getNameLowerCased((MrtdMrzInfoValidationError) it8.next()));
            }
        } else if (mrzInfo instanceof IdlMrzInfo) {
            List<IdlMrzInfoValidationError> validationErrors2 = ((IdlMrzInfo) mrzInfo).getValidationErrors();
            arrayList = new ArrayList(zhm.w.t(validationErrors2, 10));
            Iterator it9 = validationErrors2.iterator();
            while (it9.hasNext()) {
                arrayList.add(getNameLowerCased((IdlMrzInfoValidationError) it9.next()));
            }
        } else {
            if (mrzInfo != null) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList = zhm.f0.f322471a;
        }
        se seVar = new se(mrzInfo != null, arrayList, result.getMetadata().getMotionData());
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(seVar);
        }
        clearScannerContext();
    }

    public final void onTakeSnapshot(@NotNull DocumentScannerStep scannerStep) {
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        ze zeVar = ze.f37201a;
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(zeVar);
        }
    }
}
