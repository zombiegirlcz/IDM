package z0g;

import com.revolut.feature.travel.experiences.impl.network.experience.TravelExperiencesService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes9.dex */
public abstract class u0 implements e4m.e {
    public static TravelExperiencesService a(Retrofit retrofit) {
        s0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(TravelExperiencesService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TravelExperiencesService travelExperiencesService = (TravelExperiencesService) objCreate;
        vc.s.k(travelExperiencesService);
        return travelExperiencesService;
    }
}
