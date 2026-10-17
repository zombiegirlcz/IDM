package kr1;

import com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult;
import g12.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PostalCheckQrScanResult f188634a;

    public f(PostalCheckQrScanResult scan) {
        Intrinsics.checkNotNullParameter(scan, "scan");
        this.f188634a = scan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f188634a, ((f) obj2).f188634a);
    }

    public final int hashCode() {
        return this.f188634a.hashCode();
    }
}
