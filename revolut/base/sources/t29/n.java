package t29;

import com.revolut.feature.lifestyle.core.impl.network.LifestyleHomeService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n implements e4m.e {
    public static LifestyleHomeService a(ik0.b retrofitFactory, Converter.Factory converterFactory) {
        m.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(LifestyleHomeService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        LifestyleHomeService lifestyleHomeService = (LifestyleHomeService) objCreate;
        vc.s.k(lifestyleHomeService);
        return lifestyleHomeService;
    }
}
