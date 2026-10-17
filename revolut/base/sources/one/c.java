package one;

import com.revolut.feature.tax_residency.api.exemption.model.ValidityPeriod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f226942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f226943c;
    public final long d;
    public final ValidityPeriod e;

    public c(String code, a limits, String taxYear, long j2, ValidityPeriod validityPeriod) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(taxYear, "taxYear");
        Intrinsics.checkNotNullParameter(validityPeriod, "validityPeriod");
        this.f226941a = code;
        this.f226942b = limits;
        this.f226943c = taxYear;
        this.d = j2;
        this.e = validityPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f226941a, cVar.f226941a) && Intrinsics.f(this.f226942b, cVar.f226942b) && Intrinsics.f(this.f226943c, cVar.f226943c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a0.d.c(p.a.c((this.f226942b.hashCode() + (this.f226941a.hashCode() * 31)) * 31, 31, this.f226943c), 31, this.d);
    }
}
