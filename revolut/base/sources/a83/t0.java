package a83;

/* JADX INFO: loaded from: classes21.dex */
public final class t0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2086w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f2086w |= Integer.MIN_VALUE;
        return com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a.I2(this.v, this);
    }
}
