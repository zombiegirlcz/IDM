package w88;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u98.a f295603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f295604b;

    public a(u98.a ageEligibility, dj0.d balance) {
        Intrinsics.checkNotNullParameter(ageEligibility, "ageEligibility");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f295603a = ageEligibility;
        this.f295604b = balance;
    }

    @Override // w88.e
    public final u98.a a() {
        return this.f295603a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f295603a == aVar.f295603a && Intrinsics.f(this.f295604b, aVar.f295604b);
    }

    public final int hashCode() {
        return this.f295604b.hashCode() + (this.f295603a.hashCode() * 31);
    }
}
