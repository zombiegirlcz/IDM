package tgf;

import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionsListFilterType.TransactionFilterItem f271171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionsListFilterType.SelectableFilterSection f271172b;

    public f(TransactionsListFilterType.TransactionFilterItem item, TransactionsListFilterType.SelectableFilterSection section) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(section, "section");
        this.f271171a = item;
        this.f271172b = section;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f271171a, fVar.f271171a) && Intrinsics.f(this.f271172b, fVar.f271172b);
    }

    public final int hashCode() {
        return this.f271172b.hashCode() + (this.f271171a.hashCode() * 31);
    }
}
