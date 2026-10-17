package uag;

import com.revolut.feature_travel_hotels_models.campaign.TravelHotelsCampaign;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsCampaign f278643a;

    public j(TravelHotelsCampaign campaign) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        this.f278643a = campaign;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f278643a, ((j) obj2).f278643a);
    }

    public final int hashCode() {
        return this.f278643a.hashCode();
    }
}
