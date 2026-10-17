package e76;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f123086c;

    public b(String feeBreakdownId, String displayCurrency) {
        Intrinsics.checkNotNullParameter(feeBreakdownId, "feeBreakdownId");
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        this.f123084a = feeBreakdownId;
        this.f123085b = displayCurrency;
        this.f123086c = a0.d.s("DEFI_FEE_BREAKDOWN_", feeBreakdownId, "_", displayCurrency);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f123084a, bVar.f123084a) && Intrinsics.f(this.f123085b, bVar.f123085b);
    }

    public final int hashCode() {
        return this.f123085b.hashCode() + (this.f123084a.hashCode() * 31);
    }
}
