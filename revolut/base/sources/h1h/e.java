package h1h;

import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestTransactionsFilter f148574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestTransactionsListContract$Disclaimers f148575b;

    public e(InvestTransactionsFilter filter, InvestTransactionsListContract$Disclaimers transactionsScreenDisclaimers) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(transactionsScreenDisclaimers, "transactionsScreenDisclaimers");
        this.f148574a = filter;
        this.f148575b = transactionsScreenDisclaimers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f148574a, eVar.f148574a) && Intrinsics.f(this.f148575b, eVar.f148575b);
    }

    public final int hashCode() {
        return this.f148575b.hashCode() + (this.f148574a.hashCode() * 31);
    }
}
