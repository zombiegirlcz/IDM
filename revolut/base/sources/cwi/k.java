package cwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungePassesService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class k implements e4m.e {
    public static AirportLoungePassesService a(h hVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(AirportLoungePassesService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AirportLoungePassesService airportLoungePassesService = (AirportLoungePassesService) objCreate;
        vc.s.k(airportLoungePassesService);
        return airportLoungePassesService;
    }
}
