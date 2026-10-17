package cwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungesService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class o implements e4m.e {
    public static AirportLoungesService a(h hVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(AirportLoungesService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AirportLoungesService airportLoungesService = (AirportLoungesService) objCreate;
        vc.s.k(airportLoungesService);
        return airportLoungesService;
    }
}
