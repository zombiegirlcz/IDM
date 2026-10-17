package w88;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u98.a f295605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295606b;

    public b(u98.a ageEligibility, String str) {
        Intrinsics.checkNotNullParameter(ageEligibility, "ageEligibility");
        this.f295605a = ageEligibility;
        this.f295606b = str;
    }

    @Override // w88.e
    public final u98.a a() {
        return this.f295605a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f295605a == bVar.f295605a && Intrinsics.f(this.f295606b, bVar.f295606b);
    }

    public final int hashCode() {
        int iHashCode = this.f295605a.hashCode() * 31;
        String str = this.f295606b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
