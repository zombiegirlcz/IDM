package cwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungesUserCapabilitiesService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class p implements e4m.e {
    public static AirportLoungesUserCapabilitiesService a(h hVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(AirportLoungesUserCapabilitiesService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AirportLoungesUserCapabilitiesService airportLoungesUserCapabilitiesService = (AirportLoungesUserCapabilitiesService) objCreate;
        vc.s.k(airportLoungesUserCapabilitiesService);
        return airportLoungesUserCapabilitiesService;
    }
}
