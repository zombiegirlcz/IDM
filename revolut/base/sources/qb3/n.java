package qb3;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.c {
    public dj0.d u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f244098w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f244099x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.cash_topup.impl.ui.amount.c f244100y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.cash_topup.impl.ui.amount.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f244100y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f244099x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f244100y.z2(null, null, null, this);
    }
}
