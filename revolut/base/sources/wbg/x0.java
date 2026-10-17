package wbg;

import com.revolut.feature_travel_hotels_models.booking.request.HotelsPropertyBookingRequestStatus;
import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;

/* JADX INFO: loaded from: classes9.dex */
public final class x0 extends gim.c {
    public ecg.j u;
    public HotelsPointsRedeemOption v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public HotelsPropertyBookingRequestStatus f296213w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f296214x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a f296215y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar, gim.c cVar) {
        super(cVar);
        this.f296215y = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f296214x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a.I2(this.f296215y, null, null, null, this);
    }
}
