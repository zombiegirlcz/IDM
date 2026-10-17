package com.fourthline.orca.internal;

import com.fourthline.orca.internal.u41;
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.document.DocumentValidationError;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ye implements oo {
    @Override // com.fourthline.orca.internal.oo
    public void a(dp dpVar, u41.a result, DocumentScannerStep currentStep) {
        Intrinsics.checkNotNullParameter(dpVar, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(currentStep, "currentStep");
    }

    @Override // com.fourthline.orca.internal.oo
    public /* bridge */ Set a() {
        return super.a();
    }

    @Override // com.fourthline.orca.internal.oo
    public /* bridge */ DocumentValidationError a(DocumentScannerStepResult documentScannerStepResult) {
        return super.a(documentScannerStepResult);
    }

    @Override // com.fourthline.orca.internal.oo
    public g51 a(dp dpVar, DocumentScannerStepResult result, fd fdVar, DocumentScannerStep currentStep) {
        Intrinsics.checkNotNullParameter(dpVar, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(currentStep, "currentStep");
        return new g51(dpVar.f(), fdVar != null ? fdVar.c() : null, currentStep, result);
    }

    @Override // com.fourthline.orca.internal.oo
    public ko a(DocumentScannerResult documentScannerResult) {
        Intrinsics.checkNotNullParameter(documentScannerResult, "<this>");
        return new ko(documentScannerResult);
    }
}
