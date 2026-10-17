package tyg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import efm.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kwg.l f275575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f275576b;

    public f(kwg.l complexAnalyticsInteractor, j widgetisedProductConfigInteractor) {
        Intrinsics.checkNotNullParameter(complexAnalyticsInteractor, "complexAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(widgetisedProductConfigInteractor, "widgetisedProductConfigInteractor");
        this.f275575a = complexAnalyticsInteractor;
        this.f275576b = widgetisedProductConfigInteractor;
    }

    public final vkm.d a(WidgetisedAnalyticsType analyticsType, vyg.c selectedTimeframe) {
        r rVarE;
        Intrinsics.checkNotNullParameter(analyticsType, "selectedAnalyticsType");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        j jVar = this.f275576b;
        boolean zG = jVar.g(analyticsType);
        kwg.l lVar = this.f275575a;
        if (zG) {
            eel.c timeSpan = selectedTimeframe.b();
            List analyticsProductTypes = jVar.b(analyticsType);
            Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            rVarE = lVar.f(new kwg.h(lVar, analyticsProductTypes, timeSpan, 0));
        } else {
            eel.c timeSpan2 = selectedTimeframe.b();
            Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
            Intrinsics.checkNotNullParameter(timeSpan2, "timeSpan");
            rVarE = lVar.e(analyticsType, new kwg.d(lVar, analyticsType, timeSpan2, 0));
        }
        return rd0.e.b(rVarE);
    }
}
