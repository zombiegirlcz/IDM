package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerStepResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerStepResult f36067a;

    public c6(@NotNull DocumentScannerStepResult scannerStepResult) {
        Intrinsics.checkNotNullParameter(scannerStepResult, "scannerStepResult");
        this.f36067a = scannerStepResult;
    }

    public static /* synthetic */ c6 copy$default(c6 c6Var, DocumentScannerStepResult documentScannerStepResult, int i, Object obj2) {
        if ((i & 1) != 0) {
            documentScannerStepResult = c6Var.f36067a;
        }
        return c6Var.copy(documentScannerStepResult);
    }

    @NotNull
    public final DocumentScannerStepResult component1() {
        return this.f36067a;
    }

    @NotNull
    public final c6 copy(@NotNull DocumentScannerStepResult scannerStepResult) {
        Intrinsics.checkNotNullParameter(scannerStepResult, "scannerStepResult");
        return new c6(scannerStepResult);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c6) && Intrinsics.f(this.f36067a, ((c6) obj2).f36067a);
    }

    @NotNull
    public final DocumentScannerStepResult getScannerStepResult() {
        return this.f36067a;
    }

    public int hashCode() {
        return this.f36067a.hashCode();
    }

    @NotNull
    public String toString() {
        return "DocumentVisionStepResult(scannerStepResult=" + this.f36067a + ")";
    }
}
