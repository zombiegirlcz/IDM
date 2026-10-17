package axi;

/* JADX INFO: loaded from: classes10.dex */
public final class x extends gim.c {
    public svi.k u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c f10978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10979x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f10978w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f10979x |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c.I2(this.f10978w, this);
    }
}
