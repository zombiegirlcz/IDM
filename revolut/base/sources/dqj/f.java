package dqj;

import com.revolut.retail.feature.impl.travel.network.TravelService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f implements e4m.e {
    public static TravelService a(ik0.b retrofitFactory, Converter.Factory converterFactory) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(TravelService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TravelService travelService = (TravelService) objCreate;
        vc.s.k(travelService);
        return travelService;
    }
}
