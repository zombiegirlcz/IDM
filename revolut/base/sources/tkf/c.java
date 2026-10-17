package tkf;

import kotlin.jvm.internal.Intrinsics;
import tof.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f271953b;

    public c(String transactionId, r0 feesBreakdownItem) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(feesBreakdownItem, "feesBreakdownItem");
        this.f271952a = transactionId;
        this.f271953b = feesBreakdownItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f271952a, cVar.f271952a) && Intrinsics.f(this.f271953b, cVar.f271953b);
    }

    public final int hashCode() {
        return this.f271953b.hashCode() + (this.f271952a.hashCode() * 31);
    }
}
