package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModelKt;
import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.u41;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.document.internal.domain.step.VisionDynamicStepsEvaluator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class d31 implements oo, VisionDynamicStepsEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerConfig f27636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj f27637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27638c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d31(DocumentScannerConfig scannerConfig, gj dataBundle) {
        Intrinsics.checkNotNullParameter(scannerConfig, "scannerConfig");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        this.f27636a = scannerConfig;
        this.f27637b = dataBundle;
        this.f27638c = true;
    }

    @Override // com.fourthline.orca.internal.oo
    public /* bridge */ DocumentValidationError a(DocumentScannerStepResult documentScannerStepResult) {
        return super.a(documentScannerStepResult);
    }

    @Override // com.fourthline.vision.document.internal.domain.step.VisionDynamicStepsEvaluator
    public boolean isDynamicStepsEnabled() {
        return this.f27638c;
    }

    @Override // com.fourthline.orca.internal.oo
    public void a(dp dpVar, u41.a result, DocumentScannerStep currentStep) {
        fo foVarB;
        Intrinsics.checkNotNullParameter(dpVar, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(currentStep, "currentStep");
        if (currentStep.getIndex() != 0 || (foVarB = result.b()) == null) {
            return;
        }
        this.f27637b.c(foVarB.getIssuingCountry());
        gj gjVar = this.f27637b;
        String documentType = foVarB.getDocumentType();
        gjVar.a(documentType != null ? CountryNetworkModelKt.toDocumentType(documentType, foVarB.getIssuingCountry()) : null);
    }

    @Override // com.fourthline.orca.internal.oo
    public g51 a(dp dpVar, DocumentScannerStepResult result, fd fdVar, DocumentScannerStep currentStep) {
        Intrinsics.checkNotNullParameter(dpVar, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(currentStep, "currentStep");
        gj gjVar = this.f27637b;
        DocumentType documentTypeM = gjVar.m();
        if (documentTypeM == null) {
            documentTypeM = dpVar.f();
        }
        String strL = gjVar.l();
        if (strL == null) {
            strL = fdVar != null ? fdVar.c() : null;
        }
        return new g51(documentTypeM, strL, currentStep, result);
    }

    @Override // com.fourthline.orca.internal.oo
    public ko a(DocumentScannerResult documentScannerResult) {
        Intrinsics.checkNotNullParameter(documentScannerResult, "<this>");
        DocumentType documentTypeM = this.f27637b.m();
        if (documentTypeM == null) {
            documentTypeM = documentScannerResult.getDocumentType();
        }
        return new ko(DocumentScannerResult.copy$default(documentScannerResult, null, null, documentTypeM, null, null, 27, null));
    }

    @Override // com.fourthline.vision.document.internal.domain.step.VisionDynamicStepsEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean isScannerCompleted(DocumentScannerStep currentStep) {
        Intrinsics.checkNotNullParameter(currentStep, "currentStep");
        if (isDynamicStepsEnabled()) {
            DocumentType documentTypeM = this.f27637b.m();
            if ((documentTypeM == null ? -1 : a.$EnumSwitchMapping$0[documentTypeM.ordinal()]) == 1) {
                if (this.f27636a.getIncludeAngledSteps()) {
                    return currentStep.getIndex() == 1;
                }
                if (currentStep.getIndex() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.fourthline.orca.internal.oo
    public Set a() {
        DocumentValidationError[] elements = {DocumentValidationError.MRZ_NOT_VALID, DocumentValidationError.MRZ_NOT_DETECTED, DocumentValidationError.PHOTO_DETECTED, DocumentValidationError.PHOTO_NOT_DETECTED, DocumentValidationError.ISSUING_COUNTRY_NOT_SUPPORTED, DocumentValidationError.DOCUMENT_TYPE_INVALID, DocumentValidationError.DOCUMENT_TYPE_NOT_SUPPORTED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }
}
