package cwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungePassesCheckoutService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j implements e4m.e {
    public static AirportLoungePassesCheckoutService a(h hVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(AirportLoungePassesCheckoutService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AirportLoungePassesCheckoutService airportLoungePassesCheckoutService = (AirportLoungePassesCheckoutService) objCreate;
        vc.s.k(airportLoungePassesCheckoutService);
        return airportLoungePassesCheckoutService;
    }
}
