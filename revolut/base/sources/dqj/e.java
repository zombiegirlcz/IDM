package dqj;

import com.revolut.retail.feature.impl.custom_assets.network.CustomAssetsApiService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e implements e4m.e {
    public static CustomAssetsApiService a(ik0.b retrofitFactory, Converter.Factory converterFactory) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(CustomAssetsApiService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CustomAssetsApiService customAssetsApiService = (CustomAssetsApiService) objCreate;
        vc.s.k(customAssetsApiService);
        return customAssetsApiService;
    }
}
