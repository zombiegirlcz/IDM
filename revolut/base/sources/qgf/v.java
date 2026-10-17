package qgf;

import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends gim.c {
    public TransactionsListFilterType.ConfigurableFilter.AccountFilters u;
    public aim.o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f245820w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x f245821x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f245822y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, gim.c cVar) {
        super(cVar);
        this.f245821x = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f245820w = obj2;
        this.f245822y |= Integer.MIN_VALUE;
        return this.f245821x.d(null, null, this);
    }
}
