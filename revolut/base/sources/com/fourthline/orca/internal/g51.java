package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class g51 {
    public static final int e = DocumentScannerStepResult.$stable | DocumentScannerStep.$stable;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentType f28760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DocumentScannerStep f28762c;
    private final DocumentScannerStepResult d;

    public g51(DocumentType documentType, String str, DocumentScannerStep scannerStep, DocumentScannerStepResult stepResult) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
        Intrinsics.checkNotNullParameter(stepResult, "stepResult");
        this.f28760a = documentType;
        this.f28761b = str;
        this.f28762c = scannerStep;
        this.d = stepResult;
    }

    public final DocumentType a() {
        return this.f28760a;
    }

    public final String b() {
        return this.f28761b;
    }

    public final DocumentScannerStep c() {
        return this.f28762c;
    }

    public final DocumentScannerStepResult d() {
        return this.d;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g51)) {
            return false;
        }
        g51 g51Var = (g51) obj2;
        return this.f28760a == g51Var.f28760a && Intrinsics.f(this.f28761b, g51Var.f28761b) && Intrinsics.f(this.f28762c, g51Var.f28762c) && Intrinsics.f(this.d, g51Var.d);
    }

    public int hashCode() {
        int iHashCode = this.f28760a.hashCode() * 31;
        String str = this.f28761b;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f28762c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "StepResultConfirmation(documentType=" + this.f28760a + ", issuingCountry=" + this.f28761b + ", scannerStep=" + this.f28762c + ", stepResult=" + this.d + ")";
    }
}
