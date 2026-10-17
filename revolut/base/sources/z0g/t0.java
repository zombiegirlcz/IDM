package z0g;

import com.revolut.feature.travel.experiences.impl.network.booking.TravelExperiencesBookingService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes9.dex */
public abstract class t0 implements e4m.e {
    public static TravelExperiencesBookingService a(Retrofit retrofit) {
        s0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(TravelExperiencesBookingService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TravelExperiencesBookingService travelExperiencesBookingService = (TravelExperiencesBookingService) objCreate;
        vc.s.k(travelExperiencesBookingService);
        return travelExperiencesBookingService;
    }
}
