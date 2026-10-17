package f1h;

import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestTransaction f131269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestTransactionsFilter f131270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f131271c;

    public d(InvestTransaction transaction, InvestTransactionsFilter filter, boolean z) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f131269a = transaction;
        this.f131270b = filter;
        this.f131271c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f131269a, dVar.f131269a) && Intrinsics.f(this.f131270b, dVar.f131270b) && this.f131271c == dVar.f131271c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131271c) + ((this.f131270b.hashCode() + (this.f131269a.hashCode() * 31)) * 31);
    }
}
