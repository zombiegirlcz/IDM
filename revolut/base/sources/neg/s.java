package neg;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c f214533w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f214534x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f214533w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f214534x |= Integer.MIN_VALUE;
        return com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c.J2(this.f214533w, null, this);
    }
}
