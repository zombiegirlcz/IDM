package cwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungesProductArticleService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class n implements e4m.e {
    public static AirportLoungesProductArticleService a(h hVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(AirportLoungesProductArticleService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AirportLoungesProductArticleService airportLoungesProductArticleService = (AirportLoungesProductArticleService) objCreate;
        vc.s.k(airportLoungesProductArticleService);
        return airportLoungesProductArticleService;
    }
}
