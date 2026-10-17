package hbg;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 extends gim.c {
    public k0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b f150698w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f150699x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar, gim.c cVar) {
        super(cVar);
        this.f150698w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f150699x |= Integer.MIN_VALUE;
        return com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b.J2(this.f150698w, null, this);
    }
}
