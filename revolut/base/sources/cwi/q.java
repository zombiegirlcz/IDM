package cwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportSavedLoungesService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class q implements e4m.e {
    public static AirportSavedLoungesService a(h hVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(AirportSavedLoungesService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AirportSavedLoungesService airportSavedLoungesService = (AirportSavedLoungesService) objCreate;
        vc.s.k(airportSavedLoungesService);
        return airportSavedLoungesService;
    }
}
