package js4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f178139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f178140b;

    public o(dj0.d interest, Double d) {
        Intrinsics.checkNotNullParameter(interest, "interest");
        this.f178139a = interest;
        this.f178140b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f178139a, oVar.f178139a) && Intrinsics.f(this.f178140b, oVar.f178140b);
    }

    public final int hashCode() {
        int iHashCode = this.f178139a.hashCode() * 31;
        Double d = this.f178140b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }
}
