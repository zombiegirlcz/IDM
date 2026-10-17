package d38;

import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestTransaction f110922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestTransactionsFilter f110923b;

    public b(InvestTransaction transaction, InvestTransactionsFilter filter) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f110922a = transaction;
        this.f110923b = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f110922a, bVar.f110922a) && Intrinsics.f(this.f110923b, bVar.f110923b);
    }

    public final int hashCode() {
        return this.f110923b.hashCode() + (this.f110922a.hashCode() * 31);
    }
}
