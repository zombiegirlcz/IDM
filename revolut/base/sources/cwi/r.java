package cwi;

import com.revolut.retail.feature.airportlounges.impl.network.SchemeAirportLoungesService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class r implements e4m.e {
    public static SchemeAirportLoungesService a(h hVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(SchemeAirportLoungesService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        SchemeAirportLoungesService schemeAirportLoungesService = (SchemeAirportLoungesService) objCreate;
        vc.s.k(schemeAirportLoungesService);
        return schemeAirportLoungesService;
    }
}
