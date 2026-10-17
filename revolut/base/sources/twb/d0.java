package twb;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f274974w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f274974w |= Integer.MIN_VALUE;
        return com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a.J2(this.v, null, this);
    }
}
