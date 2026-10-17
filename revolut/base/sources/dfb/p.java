package dfb;

import com.revolut.feature.retail.reverywhere.impl.network.ReverywhereService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public abstract class p implements e4m.e {
    public static ReverywhereService a(ik0.b retrofitFactory, yeb.a reverywhereConfiguration, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(reverywhereConfiguration, "reverywhereConfiguration");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, reverywhereConfiguration.f312849a, converterFactory, null, 25).create(ReverywhereService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ReverywhereService reverywhereService = (ReverywhereService) objCreate;
        s.k(reverywhereService);
        return reverywhereService;
    }
}
