package chh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAccount.TaxAdvantageWealthAccount.JIsa f24236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f24237b;

    public g(WealthAccount.TaxAdvantageWealthAccount.JIsa taxAdvantagedWealthAccount, d juniorInfo) {
        Intrinsics.checkNotNullParameter(taxAdvantagedWealthAccount, "taxAdvantagedWealthAccount");
        Intrinsics.checkNotNullParameter(juniorInfo, "juniorInfo");
        this.f24236a = taxAdvantagedWealthAccount;
        this.f24237b = juniorInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f24236a, gVar.f24236a) && Intrinsics.f(this.f24237b, gVar.f24237b);
    }

    public final int hashCode() {
        return this.f24237b.hashCode() + (this.f24236a.hashCode() * 31);
    }
}
