package com.fourthline.orca.internal;

import com.fourthline.orca.internal.u41;
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.document.DocumentValidationError;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface oo {
    g51 a(dp dpVar, DocumentScannerStepResult documentScannerStepResult, fd fdVar, DocumentScannerStep documentScannerStep);

    ko a(DocumentScannerResult documentScannerResult);

    default DocumentValidationError a(DocumentScannerStepResult documentScannerStepResult) {
        Intrinsics.checkNotNullParameter(documentScannerStepResult, "<this>");
        Set<DocumentValidationError> validationErrors = documentScannerStepResult.getValidationErrors();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : validationErrors) {
            if (!a().contains((DocumentValidationError) obj2)) {
                arrayList.add(obj2);
            }
        }
        return (DocumentValidationError) zhm.d0.d0(arrayList);
    }

    void a(dp dpVar, u41.a aVar, DocumentScannerStep documentScannerStep);

    default Set a() {
        DocumentValidationError[] elements = {DocumentValidationError.MRZ_NOT_VALID, DocumentValidationError.MRZ_NOT_DETECTED, DocumentValidationError.PHOTO_DETECTED, DocumentValidationError.PHOTO_NOT_DETECTED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }
}
