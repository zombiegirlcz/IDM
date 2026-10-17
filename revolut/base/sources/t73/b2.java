package t73;

/* JADX INFO: loaded from: classes21.dex */
public final class b2 extends gim.c {
    public h93.f0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g f268430w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f268431x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, gim.c cVar) {
        super(cVar);
        this.f268430w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f268431x |= Integer.MIN_VALUE;
        return com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g.I2(this.f268430w, null, this);
    }
}
