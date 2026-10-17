package qb3;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.c {
    public dj0.d u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f244095w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.cash_topup.impl.ui.amount.c f244096x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f244097y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.cash_topup.impl.ui.amount.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f244096x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f244095w = obj2;
        this.f244097y |= Integer.MIN_VALUE;
        return this.f244096x.y2(null, this, null);
    }
}
