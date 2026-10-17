package zxf;

import com.revolut.feature.travel.common.impl.network.TravelService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e implements e4m.e {
    public static TravelService a(Retrofit retrofit) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(TravelService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TravelService travelService = (TravelService) objCreate;
        s.k(travelService);
        return travelService;
    }
}
