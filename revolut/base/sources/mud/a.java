package mud;

import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f209018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.b f209019c;
    public final jo3.b d;
    public final jo3.b e;

    public a(String id10, String productId, jo3.b stakingBalance, jo3.b fiatBalance, jo3.b unstakingLockedBalance) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(stakingBalance, "stakingBalance");
        Intrinsics.checkNotNullParameter(fiatBalance, "fiatBalance");
        Intrinsics.checkNotNullParameter(unstakingLockedBalance, "unstakingLockedBalance");
        this.f209017a = id10;
        this.f209018b = productId;
        this.f209019c = stakingBalance;
        this.d = fiatBalance;
        this.e = unstakingLockedBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f209017a, aVar.f209017a) && Intrinsics.f(this.f209018b, aVar.f209018b) && Intrinsics.f(this.f209019c, aVar.f209019c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + y.e(this.d, y.e(this.f209019c, p.a.c(this.f209017a.hashCode() * 31, 31, this.f209018b), 31), 31);
    }
}
