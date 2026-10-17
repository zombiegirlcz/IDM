package lk9;

import kotlin.jvm.internal.Intrinsics;
import zh9.i0;
import zh9.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f196313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f196314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zh9.p f196315c;
    public final whf.p d;
    public final boolean e;

    public m(i0 management, r0 plan, zh9.p repayment, whf.p pVar, boolean z) {
        Intrinsics.checkNotNullParameter(management, "management");
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(repayment, "repayment");
        this.f196313a = management;
        this.f196314b = plan;
        this.f196315c = repayment;
        this.d = pVar;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f196313a, mVar.f196313a) && Intrinsics.f(this.f196314b, mVar.f196314b) && Intrinsics.f(this.f196315c, mVar.f196315c) && Intrinsics.f(this.d, mVar.d) && this.e == mVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f196315c.hashCode() + ((this.f196314b.hashCode() + (this.f196313a.hashCode() * 31)) * 31)) * 31;
        whf.p pVar = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31);
    }
}
