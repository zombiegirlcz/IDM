package aqd;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8345w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f8345w |= Integer.MIN_VALUE;
        Object objB = this.v.b(null, null, null, this);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : new yhm.m(objB);
    }
}
