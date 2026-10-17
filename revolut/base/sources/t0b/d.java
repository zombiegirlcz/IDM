package t0b;

import com.revolut.feature.retail.advanced_charts.impl.data.AdvancedChartsService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d implements e4m.e {
    public static AdvancedChartsService a(Retrofit retrofit) {
        c.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        AdvancedChartsService advancedChartsService = (AdvancedChartsService) retrofit.create(AdvancedChartsService.class);
        s.k(advancedChartsService);
        return advancedChartsService;
    }
}
