package xr6;

import com.revolut.feature.freelancer.common.models.FreelancerTaxAllocation;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;
import xr6.p;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends hx7.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f308258c;
    public final FreelancerTaxAllocation d;
    public final boolean e;

    public f(n source, FreelancerTaxAllocation freelancerTaxAllocation, boolean z) {
        p.f.a eventType = p.f.a.f308284a;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f308258c = source;
        this.d = freelancerTaxAllocation;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        Object obj3 = p.f.a.f308284a;
        return obj3.equals(obj3) && this.f308258c.equals(fVar.f308258c) && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e;
    }

    public final int hashCode() {
        int iF = y.f(this.f308258c.f308266a, p.f.a.f308284a.hashCode() * 31, 31);
        FreelancerTaxAllocation freelancerTaxAllocation = this.d;
        return Boolean.hashCode(this.e) + ((iF + (freelancerTaxAllocation == null ? 0 : freelancerTaxAllocation.hashCode())) * 31);
    }

    @Override // hx7.i
    public final p l() {
        return p.f.a.f308284a;
    }

    @Override // hx7.i
    public final o q() {
        return this.f308258c;
    }
}
