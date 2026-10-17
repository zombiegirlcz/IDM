package cwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungeNewPassesService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class i implements e4m.e {
    public static AirportLoungeNewPassesService a(h hVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(AirportLoungeNewPassesService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AirportLoungeNewPassesService airportLoungeNewPassesService = (AirportLoungeNewPassesService) objCreate;
        vc.s.k(airportLoungeNewPassesService);
        return airportLoungeNewPassesService;
    }
}
