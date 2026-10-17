package neg;

import com.revolut.feature_travel_hotels_models.property.search.LocationType;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends gim.c {
    public int A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c E;
    public int F;
    public String u;
    public dgi.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LocationType f214530w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public zfi.a f214531x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f214532y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c cVar, gim.c cVar2) {
        super(cVar2);
        this.E = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        return com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c.I2(this.E, null, null, this);
    }
}
