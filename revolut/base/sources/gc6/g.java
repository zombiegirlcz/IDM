package gc6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ba6.l f142349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yvh.b f142350b;

    public g(ba6.l charity, yvh.b autoInvest) {
        Intrinsics.checkNotNullParameter(charity, "charity");
        Intrinsics.checkNotNullParameter(autoInvest, "autoInvest");
        this.f142349a = charity;
        this.f142350b = autoInvest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f142349a, gVar.f142349a) && Intrinsics.f(this.f142350b, gVar.f142350b);
    }

    public final int hashCode() {
        return this.f142350b.hashCode() + (this.f142349a.hashCode() * 31);
    }
}
