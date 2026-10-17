package rgf;

import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionsListFilterType.ConfigurableFilter.AccountFilters f254155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f254156b;

    public g(TransactionsListFilterType.ConfigurableFilter.AccountFilters accounts, boolean z) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        this.f254155a = accounts;
        this.f254156b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f254155a, gVar.f254155a) && this.f254156b == gVar.f254156b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f254156b) + (this.f254155a.hashCode() * 31);
    }
}
