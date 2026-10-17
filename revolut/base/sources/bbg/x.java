package bbg;

import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus;
import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;

/* JADX INFO: loaded from: classes9.dex */
public final class x extends gim.c {
    public ecg.g u;
    public HotelsPointsRedeemOption v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TravelHotelsBookingAmendmentStatus f14305w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f14306x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a f14307y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar, gim.c cVar) {
        super(cVar);
        this.f14307y = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f14306x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a.J2(this.f14307y, null, null, null, this);
    }
}
