package fcf;

import ip0.v7;
import java.time.Period;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lbf.c f133733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f133734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Period f133735c;
    public final j d;

    public g(lbf.c billingCode, dj0.d price, Period period, j tProTerms) {
        Intrinsics.checkNotNullParameter(billingCode, "billingCode");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(tProTerms, "tProTerms");
        this.f133733a = billingCode;
        this.f133734b = price;
        this.f133735c = period;
        this.d = tProTerms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f133733a == gVar.f133733a && Intrinsics.f(this.f133734b, gVar.f133734b) && Intrinsics.f(this.f133735c, gVar.f133735c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f133733a.hashCode() * 31, 31, this.f133734b);
        Period period = this.f133735c;
        return this.d.hashCode() + ((iC + (period == null ? 0 : period.hashCode())) * 31);
    }
}
