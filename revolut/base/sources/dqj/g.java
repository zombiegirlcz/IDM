package dqj;

import com.revolut.retail.feature.impl.trips.network.TripsApiService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes11.dex */
public abstract class g implements e4m.e {
    public static TripsApiService a(ik0.b retrofitFactory, Converter.Factory converterFactory) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(TripsApiService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TripsApiService tripsApiService = (TripsApiService) objCreate;
        vc.s.k(tripsApiService);
        return tripsApiService;
    }
}
