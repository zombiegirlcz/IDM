package zvd;

import dj0.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f325661c;
    public final d d;
    public final d e;

    public b(String id10, String productId, d stakingBalance, d fiatBalance, d unstakingLockedBalance) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(stakingBalance, "stakingBalance");
        Intrinsics.checkNotNullParameter(fiatBalance, "fiatBalance");
        Intrinsics.checkNotNullParameter(unstakingLockedBalance, "unstakingLockedBalance");
        this.f325659a = id10;
        this.f325660b = productId;
        this.f325661c = stakingBalance;
        this.d = fiatBalance;
        this.e = unstakingLockedBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f325659a, bVar.f325659a) && Intrinsics.f(this.f325660b, bVar.f325660b) && Intrinsics.f(this.f325661c, bVar.f325661c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(v7.c(p.a.c(this.f325659a.hashCode() * 31, 31, this.f325660b), 31, this.f325661c), 31, this.d);
    }
}
