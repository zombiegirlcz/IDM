package h1h;

import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestTransactionsFilter f148576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0h.a f148577b;

    public g(InvestTransactionsFilter filter, e0h.a transactionsPage) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(transactionsPage, "transactionsPage");
        this.f148576a = filter;
        this.f148577b = transactionsPage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f148576a, gVar.f148576a) && Intrinsics.f(this.f148577b, gVar.f148577b);
    }

    public final int hashCode() {
        return this.f148577b.hashCode() + (this.f148576a.hashCode() * 31);
    }
}
