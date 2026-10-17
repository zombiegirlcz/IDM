package f43;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_payment_method.impl.flows.link_card.flow.b f131999w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f132000x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.card_payment_method.impl.flows.link_card.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.f131999w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f132000x |= Integer.MIN_VALUE;
        return com.revolut.feature.card_payment_method.impl.flows.link_card.flow.b.I2(this.f131999w, this);
    }
}
