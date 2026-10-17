package z0g;

import com.revolut.feature.travel.experiences.impl.network.search.TravelExperiencesSearchService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes9.dex */
public abstract class w0 implements e4m.e {
    public static TravelExperiencesSearchService a(Retrofit retrofit) {
        s0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(TravelExperiencesSearchService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TravelExperiencesSearchService travelExperiencesSearchService = (TravelExperiencesSearchService) objCreate;
        vc.s.k(travelExperiencesSearchService);
        return travelExperiencesSearchService;
    }
}
