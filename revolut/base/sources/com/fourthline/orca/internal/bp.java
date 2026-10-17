package com.fourthline.orca.internal;

import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerStep;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface bp {
    default k70 a(DocumentType documentType, DocumentScannerStep step) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(step, "step");
        DocumentFileSide fileSide = step.getFileSide();
        DocumentFileSide documentFileSide = DocumentFileSide.BACK;
        return (fileSide == documentFileSide && step.isAngled()) ? cp.d(step, documentType) : step.getFileSide() == documentFileSide ? cp.e(step, documentType) : step.isAngled() ? cp.f(step, documentType) : cp.g(step, documentType);
    }

    f51 b(DocumentType documentType, DocumentScannerStep documentScannerStep);
}
