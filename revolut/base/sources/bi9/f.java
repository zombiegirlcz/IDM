package bi9;

import kotlin.jvm.internal.Intrinsics;
import zh9.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f15451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f15452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f15453c;

    public f(r0 plan, Integer num, dj0.d amount) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f15451a = plan;
        this.f15452b = num;
        this.f15453c = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f15451a, fVar.f15451a) && Intrinsics.f(this.f15452b, fVar.f15452b) && Intrinsics.f(this.f15453c, fVar.f15453c);
    }

    public final int hashCode() {
        int iHashCode = this.f15451a.hashCode() * 31;
        Integer num = this.f15452b;
        return this.f15453c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }
}
