package owi;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.flows.home.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f230455w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.retail.feature.airportlounges.impl.ui.flows.home.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f230455w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.airportlounges.impl.ui.flows.home.b.I2(this.v, this);
    }
}
