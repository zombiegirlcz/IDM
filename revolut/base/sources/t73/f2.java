package t73;

/* JADX INFO: loaded from: classes21.dex */
public final class f2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f268466w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, gim.c cVar) {
        super(cVar);
        this.v = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f268466w |= Integer.MIN_VALUE;
        return com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g.M2(this.v, this);
    }
}
