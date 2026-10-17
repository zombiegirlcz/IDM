package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ko implements ge1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f30347b = DocumentScannerResult.$stable;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerResult f30348a;

    public ko(DocumentScannerResult scannerResult) {
        Intrinsics.checkNotNullParameter(scannerResult, "scannerResult");
        this.f30348a = scannerResult;
    }

    public final DocumentScannerResult a() {
        return this.f30348a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ko) && Intrinsics.f(this.f30348a, ((ko) obj2).f30348a);
    }

    public int hashCode() {
        return this.f30348a.hashCode();
    }

    public String toString() {
        return "Result(scannerResult=" + this.f30348a + ")";
    }
}
