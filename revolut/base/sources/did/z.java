package did;

import com.revolut.feature.shops.impl.service.ShopsService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class z implements e4m.e {
    public static ShopsService a(Retrofit retrofit) {
        w.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ShopsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ShopsService shopsService = (ShopsService) objCreate;
        vc.s.k(shopsService);
        return shopsService;
    }
}
