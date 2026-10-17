package fcf;

import ip0.v7;
import java.time.Period;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lbf.c f133730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f133731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Period f133732c;
    public final j d;

    public f(lbf.c billingCode, dj0.d price, Period period, j tProTerms) {
        Intrinsics.checkNotNullParameter(billingCode, "billingCode");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(tProTerms, "tProTerms");
        this.f133730a = billingCode;
        this.f133731b = price;
        this.f133732c = period;
        this.d = tProTerms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f133730a == fVar.f133730a && Intrinsics.f(this.f133731b, fVar.f133731b) && Intrinsics.f(this.f133732c, fVar.f133732c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f133730a.hashCode() * 31, 31, this.f133731b);
        Period period = this.f133732c;
        return this.d.hashCode() + ((iC + (period == null ? 0 : period.hashCode())) * 31);
    }
}
