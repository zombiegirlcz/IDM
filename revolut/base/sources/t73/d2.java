package t73;

/* JADX INFO: loaded from: classes21.dex */
public final class d2 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g f268439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f268440x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, gim.c cVar) {
        super(cVar);
        this.f268439w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f268440x |= Integer.MIN_VALUE;
        return com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g.J2(this.f268439w, null, this);
    }
}
