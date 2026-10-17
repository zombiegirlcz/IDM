package com.fourthline.orca.internal;

import com.fourthline.vision.selfie.SelfieScannerResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class b21 implements ge1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f26965b = SelfieScannerResult.$stable;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SelfieScannerResult f26966a;

    public b21(SelfieScannerResult scannerResult) {
        Intrinsics.checkNotNullParameter(scannerResult, "scannerResult");
        this.f26966a = scannerResult;
    }

    public final SelfieScannerResult a() {
        return this.f26966a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b21) && Intrinsics.f(this.f26966a, ((b21) obj2).f26966a);
    }

    public int hashCode() {
        return this.f26966a.hashCode();
    }

    public String toString() {
        return "Result(scannerResult=" + this.f26966a + ")";
    }
}
