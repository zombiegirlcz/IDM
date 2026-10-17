package qvg;

import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b implements e {
    public static ComplexWealthAnalyticsService a(Retrofit retrofit) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ComplexWealthAnalyticsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ComplexWealthAnalyticsService complexWealthAnalyticsService = (ComplexWealthAnalyticsService) objCreate;
        s.k(complexWealthAnalyticsService);
        return complexWealthAnalyticsService;
    }
}
