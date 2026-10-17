package tcg;

import com.revolut.feature_travel_hotels_models.property.search.LocationType;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends gim.c {
    public LocationType u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a f269804w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f269805x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar, gim.c cVar) {
        super(cVar);
        this.f269804w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f269805x |= Integer.MIN_VALUE;
        return com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a.J2(this.f269804w, null, this);
    }
}
