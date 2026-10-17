package dze;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f121339w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f121339w |= Integer.MIN_VALUE;
        return com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c.I2(this.v, null, this);
    }
}
