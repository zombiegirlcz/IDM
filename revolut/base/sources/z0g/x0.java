package z0g;

import com.revolut.feature.travel.experiences.impl.network.reviews.TravelExperiencesReviewsService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes9.dex */
public abstract class x0 implements e4m.e {
    public static TravelExperiencesReviewsService a(Retrofit retrofit) {
        s0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(TravelExperiencesReviewsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TravelExperiencesReviewsService travelExperiencesReviewsService = (TravelExperiencesReviewsService) objCreate;
        vc.s.k(travelExperiencesReviewsService);
        return travelExperiencesReviewsService;
    }
}
