package bbg;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14308w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f14308w |= Integer.MIN_VALUE;
        return com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a.K2(this.v, null, this);
    }
}
