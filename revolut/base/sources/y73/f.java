package y73;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_list.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f311324w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.card_screen.impl.kompot.cards_list.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f311324w |= Integer.MIN_VALUE;
        return com.revolut.feature.card_screen.impl.kompot.cards_list.c.O2(this.v, null, this);
    }
}
