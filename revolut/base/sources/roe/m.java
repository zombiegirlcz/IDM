package roe;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.tax_residency.impl.screens.tin.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f255990w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.tax_residency.impl.screens.tin.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f255990w |= Integer.MIN_VALUE;
        return com.revolut.feature.tax_residency.impl.screens.tin.c.y2(this.v, null, this);
    }
}
