package xb7;

import com.revolut.feature.home.nps.data.network.HomeNPSService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public abstract class d implements e4m.e {
    public static HomeNPSService a(Retrofit retrofit) {
        c.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(HomeNPSService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        HomeNPSService homeNPSService = (HomeNPSService) objCreate;
        s.k(homeNPSService);
        return homeNPSService;
    }
}
