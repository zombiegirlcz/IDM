package t73;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f268499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f268500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f268501c;
    public final Map d;

    public p0(List juniorDataManagementConsents, List walletProfiles, Map juniorProfiles, Map juniorKycs) {
        Intrinsics.checkNotNullParameter(juniorDataManagementConsents, "juniorDataManagementConsents");
        Intrinsics.checkNotNullParameter(walletProfiles, "walletProfiles");
        Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
        Intrinsics.checkNotNullParameter(juniorKycs, "juniorKycs");
        this.f268499a = juniorDataManagementConsents;
        this.f268500b = walletProfiles;
        this.f268501c = juniorProfiles;
        this.d = juniorKycs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f268499a, p0Var.f268499a) && Intrinsics.f(this.f268500b, p0Var.f268500b) && Intrinsics.f(this.f268501c, p0Var.f268501c) && Intrinsics.f(this.d, p0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.e(p.a.d(this.f268499a.hashCode() * 31, 31, this.f268500b), 31, this.f268501c);
    }

    public /* synthetic */ p0(zhm.f0 f0Var, List list, Map map) {
        this(f0Var, list, map, zhm.r0.g());
    }
}
