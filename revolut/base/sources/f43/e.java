package f43;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.card_payment_method.impl.flows.link_card.flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f132001w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.card_payment_method.impl.flows.link_card.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f132001w |= Integer.MIN_VALUE;
        return com.revolut.feature.card_payment_method.impl.flows.link_card.flow.b.J2(this.v, this);
    }
}
