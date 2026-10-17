package q5g;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.travel.flights.impl.ui.screen.checkout.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f242383w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f242383w |= Integer.MIN_VALUE;
        return com.revolut.feature.travel.flights.impl.ui.screen.checkout.b.I2(this.v, this);
    }
}
