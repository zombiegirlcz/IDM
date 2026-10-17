package tcg;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f269808w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f269808w |= Integer.MIN_VALUE;
        return com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a.L2(this.v, null, this);
    }
}
