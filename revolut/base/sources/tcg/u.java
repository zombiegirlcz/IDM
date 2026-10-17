package tcg;

/* JADX INFO: loaded from: classes9.dex */
public final class u extends gim.c {
    public ffi.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a f269806w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f269807x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar, gim.c cVar) {
        super(cVar);
        this.f269806w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f269807x |= Integer.MIN_VALUE;
        return com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a.K2(this.f269806w, null, this);
    }
}
