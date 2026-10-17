package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerStep;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class g91 implements bp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x71 f28811a;

    public g91(x71 taxationCountry) {
        Intrinsics.checkNotNullParameter(taxationCountry, "taxationCountry");
        this.f28811a = taxationCountry;
    }

    @Override // com.fourthline.orca.internal.bp
    public k70 a(DocumentType documentType, DocumentScannerStep step) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(step, "step");
        wz.a(documentType == DocumentType.TIN_REFERENCE_DOCUMENT, "Wrong document type (" + documentType + ") provided to TIN Scanner Mask Provider");
        if (this.f28811a == x71.d) {
            return k70.T;
        }
        return null;
    }

    @Override // com.fourthline.orca.internal.bp
    public f51 b(DocumentType documentType, DocumentScannerStep step) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(step, "step");
        wz.a(documentType == DocumentType.TIN_REFERENCE_DOCUMENT, "Wrong document type (" + documentType + ") provided to TIN Scanner Mask Provider");
        return a(step);
    }

    private final f51 a(DocumentScannerStep documentScannerStep) {
        if (this.f28811a == x71.d) {
            return new f51(r10.z, r10.A, r10.B);
        }
        return cp.j(documentScannerStep);
    }
}
