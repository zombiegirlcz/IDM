package h1h;

import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f148572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestTransactionsListContract$Disclaimers f148573b;

    public c() {
        this((InvestTransactionsListContract$Disclaimers) null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f148572a == cVar.f148572a && Intrinsics.f(this.f148573b, cVar.f148573b);
    }

    public final int hashCode() {
        return this.f148573b.hashCode() + (Boolean.hashCode(this.f148572a) * 31);
    }

    public c(boolean z, InvestTransactionsListContract$Disclaimers transactionsScreenDisclaimers) {
        Intrinsics.checkNotNullParameter(transactionsScreenDisclaimers, "transactionsScreenDisclaimers");
        this.f148572a = z;
        this.f148573b = transactionsScreenDisclaimers;
    }

    public c(InvestTransactionsListContract$Disclaimers investTransactionsListContract$Disclaimers, int i) {
        if ((i & 2) != 0) {
            InvestTransactionsListContract$Disclaimers.INSTANCE.getClass();
            investTransactionsListContract$Disclaimers = new InvestTransactionsListContract$Disclaimers(true, true, true, true);
        }
        this(true, investTransactionsListContract$Disclaimers);
    }
}
