package gcg;

import com.revolut.feature_travel_hotels_models.campaign.TravelHotelsCampaign;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsCampaign f142463a;

    public o(TravelHotelsCampaign campaign) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        this.f142463a = campaign;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f142463a, ((o) obj2).f142463a);
    }

    public final int hashCode() {
        return this.f142463a.hashCode();
    }
}
