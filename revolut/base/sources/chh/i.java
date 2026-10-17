package chh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAccount.TaxAdvantageWealthAccount.JIsa f24239a;

    public i(WealthAccount.TaxAdvantageWealthAccount.JIsa taxAdvantagedWealthAccount) {
        Intrinsics.checkNotNullParameter(taxAdvantagedWealthAccount, "taxAdvantagedWealthAccount");
        this.f24239a = taxAdvantagedWealthAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f24239a, ((i) obj2).f24239a);
    }

    public final int hashCode() {
        return this.f24239a.hashCode();
    }
}
