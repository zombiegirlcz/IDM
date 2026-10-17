package z0g;

import com.revolut.feature.travel.experiences.impl.network.options.TravelExperiencesOptionsService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes9.dex */
public abstract class v0 implements e4m.e {
    public static TravelExperiencesOptionsService a(Retrofit retrofit) {
        s0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(TravelExperiencesOptionsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TravelExperiencesOptionsService travelExperiencesOptionsService = (TravelExperiencesOptionsService) objCreate;
        vc.s.k(travelExperiencesOptionsService);
        return travelExperiencesOptionsService;
    }
}
