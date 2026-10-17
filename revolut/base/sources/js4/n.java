package js4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f178137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f178138b;

    public n(dj0.d dailyInterest, Double d) {
        Intrinsics.checkNotNullParameter(dailyInterest, "dailyInterest");
        this.f178137a = dailyInterest;
        this.f178138b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f178137a, nVar.f178137a) && Intrinsics.f(this.f178138b, nVar.f178138b);
    }

    public final int hashCode() {
        int iHashCode = this.f178137a.hashCode() * 31;
        Double d = this.f178138b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }
}
