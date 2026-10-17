package did;

import com.revolut.feature.shops.impl.service.AdvertisingService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class x implements e4m.e {
    public static AdvertisingService a(Retrofit retrofit) {
        w.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(AdvertisingService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AdvertisingService advertisingService = (AdvertisingService) objCreate;
        vc.s.k(advertisingService);
        return advertisingService;
    }
}
