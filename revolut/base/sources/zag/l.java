package zag;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f320702w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f320702w |= Integer.MIN_VALUE;
        return com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a.I2(this.v, null, null, this);
    }
}
