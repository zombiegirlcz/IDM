package vgf;

import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionsListFilterType.ConfigurableFilter f289131b;

    public s(String searchQuery, TransactionsListFilterType.ConfigurableFilter configurableFilter) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f289130a = searchQuery;
        this.f289131b = configurableFilter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f289130a, sVar.f289130a) && Intrinsics.f(this.f289131b, sVar.f289131b);
    }

    public final int hashCode() {
        int iHashCode = this.f289130a.hashCode() * 31;
        TransactionsListFilterType.ConfigurableFilter configurableFilter = this.f289131b;
        return iHashCode + (configurableFilter == null ? 0 : configurableFilter.hashCode());
    }
}
