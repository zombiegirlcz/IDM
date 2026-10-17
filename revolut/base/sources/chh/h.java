package chh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAccount.TaxAdvantageWealthAccount f24238a;

    public h(WealthAccount.TaxAdvantageWealthAccount taxAdvantagedWealthAccount) {
        Intrinsics.checkNotNullParameter(taxAdvantagedWealthAccount, "taxAdvantagedWealthAccount");
        this.f24238a = taxAdvantagedWealthAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f24238a, ((h) obj2).f24238a);
    }

    public final int hashCode() {
        return this.f24238a.hashCode();
    }
}
