package cwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungesDisclaimerService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l implements e4m.e {
    public static AirportLoungesDisclaimerService a(h hVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(AirportLoungesDisclaimerService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AirportLoungesDisclaimerService airportLoungesDisclaimerService = (AirportLoungesDisclaimerService) objCreate;
        vc.s.k(airportLoungesDisclaimerService);
        return airportLoungesDisclaimerService;
    }
}
