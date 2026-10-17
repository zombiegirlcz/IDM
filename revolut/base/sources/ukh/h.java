package ukh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAccount.TaxAdvantageWealthAccount f280758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f280759b;

    public h(WealthAccount.TaxAdvantageWealthAccount taxAdvantageAccount, UUID portfolioId) {
        Intrinsics.checkNotNullParameter(taxAdvantageAccount, "taxAdvantageAccount");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f280758a = taxAdvantageAccount;
        this.f280759b = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f280758a, hVar.f280758a) && Intrinsics.f(this.f280759b, hVar.f280759b);
    }

    public final int hashCode() {
        return this.f280759b.hashCode() + (this.f280758a.hashCode() * 31);
    }
}
