package goj;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import grl.t9;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static w0 a() {
        RevPointsGenericWidgetContext.a aVarNewBuilder = RevPointsGenericWidgetContext.newBuilder();
        aVarNewBuilder.h(t9.DATA);
        RevPointsGenericWidgetContext revPointsGenericWidgetContext = (RevPointsGenericWidgetContext) aVarNewBuilder.a();
        AnalyticsContext.INSTANCE.getClass();
        return AnalyticsContext.Companion.a(revPointsGenericWidgetContext);
    }
}
