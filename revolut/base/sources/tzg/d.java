package tzg;

import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestTransactionsFilter f275960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestTransaction f275961b;

    public d(InvestTransaction transaction, InvestTransactionsFilter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f275960a = filter;
        this.f275961b = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f275960a, dVar.f275960a) && Intrinsics.f(this.f275961b, dVar.f275961b);
    }

    public final int hashCode() {
        return Integer.hashCode(10) + ((this.f275961b.hashCode() + (this.f275960a.hashCode() * 31)) * 31);
    }
}
