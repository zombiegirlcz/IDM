package com.fourthline.orca.internal;

import com.fourthline.nfc.NfcScannerResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class bd0 implements ad0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f27099b = NfcScannerResult.$stable;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NfcScannerResult f27100a;

    public bd0(NfcScannerResult scannerResult) {
        Intrinsics.checkNotNullParameter(scannerResult, "scannerResult");
        this.f27100a = scannerResult;
    }

    public final NfcScannerResult a() {
        return this.f27100a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof bd0) && Intrinsics.f(this.f27100a, ((bd0) obj2).f27100a);
    }

    public int hashCode() {
        return this.f27100a.hashCode();
    }

    public String toString() {
        return "NfcCapabilityResultFromModule(scannerResult=" + this.f27100a + ")";
    }
}
