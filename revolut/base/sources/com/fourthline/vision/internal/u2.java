package com.fourthline.vision.internal;

import com.fourthline.core.mrz.IdlMrzInfo;
import com.fourthline.core.mrz.IdlMrzInfoValidationError;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerError;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepError;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.internal.r5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class u2 implements ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerConfig f36975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qa f36976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qa f36977c;
    private final pe d;

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

    public static final class b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f36978a = new b();

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj2) {
            return Boolean.valueOf(obj2 instanceof r5.b);
        }
    }

    public u2(@NotNull DocumentScannerConfig config, @NotNull qa scannerErrorMapper, @NotNull qa stepErrorMapper, @NotNull pe scannerContext) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(scannerErrorMapper, "scannerErrorMapper");
        Intrinsics.checkNotNullParameter(stepErrorMapper, "stepErrorMapper");
        Intrinsics.checkNotNullParameter(scannerContext, "scannerContext");
        this.f36975a = config;
        this.f36976b = scannerErrorMapper;
        this.f36977c = stepErrorMapper;
        this.d = scannerContext;
    }

    private final void clearScannerContext() {
        u9.f36980a.clear();
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.a(ib.b.Scanner);
        }
    }

    private final Pair<String, String> country(String str) {
        return new Pair<>("country", str);
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
        ib.h hVar = hb.a.f150532a;
        hb.a.a("document_step_fail", th10, zhm.r0.q(zhm.r0.p(zhm.q0.c(toFatalErrorAttr(documentScannerStepError)), toStepAttrs(documentScannerStep, this.f36975a)), toDocumentFlowAttr("document_step_fail")));
        we weVar = new we(getNameLowerCased(documentScannerStep.getFileSide()), documentScannerStep.getIndex(), documentScannerStep.isAngled(), documentScannerStep.isAutoDetectAvailable(), documentScannerStepError, th10);
        ib.h hVar2 = hb.a.f150532a;
        if (hVar2 != null) {
            hVar2.f(weVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MrzInfo onSuccess$lambda$0(r5.b it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.getMrz();
    }

    private final Pair<String, String> toDocumentFlowAttr(String str) {
        return new Pair<>("document_flow", str);
    }

    private final Pair<String, String> toDocumentTypeAttr(DocumentScannerConfig documentScannerConfig) {
        return new Pair<>("document_type", getNameLowerCased(documentScannerConfig.getType()));
    }

    private final Pair<String, String> toFatalErrorAttr(DocumentScannerError documentScannerError) {
        return new Pair<>("fatal_error", getNameLowerCased(documentScannerError));
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

    private final Pair<String, Boolean> toIsVideoAvailableAttr(ua uaVar) {
        return new Pair<>("is_video_url_available", Boolean.valueOf(uaVar.getVideoUrl() != null));
    }

    private final Pair<String, String> toMrzPolicyAttr(DocumentScannerConfig documentScannerConfig) {
        return new Pair<>("mrz_policy", getNameLowerCased(documentScannerConfig.getMrzValidationPolicy()));
    }

    private final Pair<String, String> toShouldRecordVideoAttr(DocumentScannerConfig documentScannerConfig) {
        return new Pair<>("record_video", getNameLowerCased(documentScannerConfig.getRecordingType()));
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

    private final Pair<String, String> toVideoDurationAttr(DocumentScannerConfig documentScannerConfig) {
        return new Pair<>("video_duration", documentScannerConfig.getVideoDuration().getAlias());
    }

    private final Pair<String, String> toVideoGravityAttr(DocumentScannerConfig documentScannerConfig) {
        return new Pair<>("preview_gravity", "resize_aspect_fill");
    }

    @Override // com.fourthline.vision.internal.ne
    public void onMoveToNextStep() {
        ib.h hVar = hb.a.f150532a;
        hb.a.c(zhm.q0.c(toDocumentFlowAttr("document_step_next")), "document_step_next", 2);
    }

    @Override // com.fourthline.vision.internal.ne
    public void onPermissionNotGranted(@NotNull ff permission) {
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
        ib.h hVar = hb.a.f150532a;
        hb.a.b(2, "document_fail", null, zhm.r0.k(toFatalErrorAttr(documentScannerError), toDocumentFlowAttr("document_fail")));
        re reVar = new re(documentScannerError);
        ib.h hVar2 = hb.a.f150532a;
        if (hVar2 != null) {
            hVar2.f(reVar);
        }
        clearScannerContext();
    }

    @Override // com.fourthline.vision.internal.ne
    public void onReset() {
        hb.a.c(null, "document_reset", 6);
        clearScannerContext();
    }

    @Override // com.fourthline.vision.internal.ne
    public void onStart() {
        ib.h hVar = hb.a.f150532a;
        DocumentScannerConfig documentScannerConfig = this.f36975a;
        hb.a.c(zhm.r0.k(toMrzPolicyAttr(documentScannerConfig), toVideoGravityAttr(documentScannerConfig), toDocumentTypeAttr(documentScannerConfig), toShouldRecordVideoAttr(documentScannerConfig), toVideoDurationAttr(documentScannerConfig), toDocumentFlowAttr("document_start")), "document_start", 2);
        ib.h hVar2 = hb.a.f150532a;
        if (hVar2 != null) {
            hVar2.c(this.d);
        }
        u9.f36980a.flushToScannerIfPresent();
        ue ueVar = ue.f36989a;
        ib.h hVar3 = hb.a.f150532a;
        if (hVar3 != null) {
            hVar3.f(ueVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.fourthline.vision.internal.u2] */
    /* JADX WARN: Type inference failed for: r5v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    @Override // com.fourthline.vision.internal.ne
    public void onSuccess(@NotNull ua result) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(result, "result");
        MrzInfo mrzInfo = (MrzInfo) nkm.y.r(nkm.y.x(nkm.y.n(zhm.d0.Q(result.getStepResults()), b.f36978a), new aem.d(29)));
        boolean z = mrzInfo instanceof MrtdMrzInfo;
        String issuingCountry = z ? ((MrtdMrzInfo) mrzInfo).getIssuingCountry() : null;
        if (z) {
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
        ib.h hVar = hb.a.f150532a;
        Pair[] elements = {toDocumentTypeAttr(this.f36975a), issuingCountry != null ? country(issuingCountry) : null, toIsVideoAvailableAttr(result), toValidationErrorsAttr(arrayList), toIsMrzExtractedAttr(mrzInfo), toDocumentFlowAttr("document_success")};
        Intrinsics.checkNotNullParameter(elements, "elements");
        hb.a.c(zhm.r0.t(kotlin.collections.d.L(elements)), "document_success", 2);
        se seVar = new se(mrzInfo != null, arrayList, result.getMetadata().getMotionData());
        ib.h hVar2 = hb.a.f150532a;
        if (hVar2 != null) {
            hVar2.f(seVar);
        }
        clearScannerContext();
    }

    @Override // com.fourthline.vision.internal.ne
    public void onFail(@NotNull DocumentScannerStep scannerStep, @NotNull pa scannerError, Throwable th10) {
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        Intrinsics.checkNotNullParameter(scannerError, "scannerError");
        try {
            onStepFail(scannerStep, (DocumentScannerStepError) this.f36977c.convertError(scannerError), th10);
        } catch (IllegalArgumentException unused) {
            DocumentScannerError documentScannerError = (DocumentScannerError) this.f36976b.convertError(scannerError);
            ib.h hVar = hb.a.f150532a;
            hb.a.a("document_fail", th10, zhm.r0.q(zhm.r0.p(zhm.q0.c(toFatalErrorAttr(documentScannerError)), toStepAttrs(scannerStep, this.f36975a)), toDocumentFlowAttr("document_fail")));
            te teVar = new te(getNameLowerCased(scannerStep.getFileSide()), scannerStep.getIndex(), scannerStep.isAngled(), scannerStep.isAutoDetectAvailable(), documentScannerError, th10);
            ib.h hVar2 = hb.a.f150532a;
            if (hVar2 != null) {
                hVar2.f(teVar);
            }
            clearScannerContext();
        }
    }

    @Override // com.fourthline.vision.internal.ne
    public void onResetCurrentStep(@NotNull DocumentScannerStep scannerStep) {
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        ib.h hVar = hb.a.f150532a;
        hb.a.c(zhm.r0.q(toStepAttrs(scannerStep, this.f36975a), toDocumentFlowAttr("document_step_reset")), "document_step_reset", 2);
        xe xeVar = new xe(getNameLowerCased(scannerStep.getFileSide()), scannerStep.getIndex(), scannerStep.isAngled(), scannerStep.isAutoDetectAvailable());
        ib.h hVar2 = hb.a.f150532a;
        if (hVar2 != null) {
            hVar2.f(xeVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.fourthline.vision.internal.u2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    @Override // com.fourthline.vision.internal.ne
    public void onStepSuccess(@NotNull DocumentScannerStep scannerStep, @NotNull ud stepResult) {
        ?? arrayList;
        Set<DocumentValidationError> validationErrors;
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        Intrinsics.checkNotNullParameter(stepResult, "stepResult");
        r5 r5Var = stepResult instanceof r5 ? (r5) stepResult : null;
        if (r5Var == null || (validationErrors = r5Var.getValidationErrors()) == null) {
            arrayList = zhm.f0.f322471a;
        } else {
            arrayList = new ArrayList(zhm.w.t(validationErrors, 10));
            Iterator it8 = validationErrors.iterator();
            while (it8.hasNext()) {
                arrayList.add(getNameLowerCased((DocumentValidationError) it8.next()));
            }
        }
        ?? r92 = arrayList;
        r5.b bVar = stepResult instanceof r5.b ? (r5.b) stepResult : null;
        MrzInfo mrz = bVar != null ? bVar.getMrz() : null;
        ib.h hVar = hb.a.f150532a;
        hb.a.c(zhm.r0.q(zhm.r0.q(zhm.r0.q(toStepAttrs(scannerStep, this.f36975a), toValidationErrorsAttr(r92)), toIsMrzExtractedAttr(mrz)), toDocumentFlowAttr("document_step_success")), "document_step_success", 2);
        ve veVar = new ve(getNameLowerCased(scannerStep.getFileSide()), scannerStep.getIndex(), scannerStep.isAngled(), scannerStep.isAutoDetectAvailable(), mrz != null, r92);
        ib.h hVar2 = hb.a.f150532a;
        if (hVar2 != null) {
            hVar2.f(veVar);
        }
    }

    @Override // com.fourthline.vision.internal.ne
    public void onStepUpdate(@NotNull DocumentScannerStep scannerStep) {
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        ib.h hVar = hb.a.f150532a;
        hb.a.c(zhm.r0.q(toStepAttrs(scannerStep, this.f36975a), toDocumentFlowAttr("document_step_update")), "document_step_update", 2);
        ye yeVar = new ye(getNameLowerCased(scannerStep.getFileSide()), scannerStep.getIndex(), scannerStep.isAngled(), scannerStep.isAutoDetectAvailable());
        ib.h hVar2 = hb.a.f150532a;
        if (hVar2 != null) {
            hVar2.f(yeVar);
        }
    }

    @Override // com.fourthline.vision.internal.ne
    public void onTakeSnapshot(@NotNull DocumentScannerStep scannerStep) {
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        ib.h hVar = hb.a.f150532a;
        hb.a.c(zhm.r0.q(toStepAttrs(scannerStep, this.f36975a), toDocumentFlowAttr("document_take_snapshot")), "document_take_snapshot", 2);
        ze zeVar = ze.f37201a;
        ib.h hVar2 = hb.a.f150532a;
        if (hVar2 != null) {
            hVar2.f(zeVar);
        }
    }

    private final Pair<String, String> toFatalErrorAttr(DocumentScannerStepError documentScannerStepError) {
        return new Pair<>("fatal_error", getNameLowerCased(documentScannerStepError));
    }
}
