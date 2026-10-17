package lxe;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.c {
    public dj0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.a f200564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f200565x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.a aVar, gim.c cVar) {
        super(cVar);
        this.f200564w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f200565x |= Integer.MIN_VALUE;
        return this.f200564w.I2(null, null, this);
    }
}
