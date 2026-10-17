package qgf;

import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends gim.c {
    public TransactionsListFilterType.ConfigurableFilter.AccountFilters u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f245818w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f245819x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, gim.c cVar) {
        super(cVar);
        this.f245818w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f245819x |= Integer.MIN_VALUE;
        return this.f245818w.c(null, false, false, this);
    }
}
