package cwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungesPassActivityService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class m implements e4m.e {
    public static AirportLoungesPassActivityService a(h hVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(AirportLoungesPassActivityService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AirportLoungesPassActivityService airportLoungesPassActivityService = (AirportLoungesPassActivityService) objCreate;
        vc.s.k(airportLoungesPassActivityService);
        return airportLoungesPassActivityService;
    }
}
