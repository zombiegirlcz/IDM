package qwe;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.checkout.flow.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f249898w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f249898w |= Integer.MIN_VALUE;
        return com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.K2(this.v, null, this);
    }
}
