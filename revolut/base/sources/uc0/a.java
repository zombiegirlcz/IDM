package uc0;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.tracking.v3.FormsFooterButtonContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a {
    public static final w0 a(BackendScreen backendScreen, String flowId, int i) {
        Intrinsics.checkNotNullParameter(backendScreen, "<this>");
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        FormsFooterButtonContext.a aVarNewBuilder = FormsFooterButtonContext.newBuilder();
        aVarNewBuilder.c();
        ((FormsFooterButtonContext) aVarNewBuilder.f49761b).setFlowId(flowId);
        String id10 = backendScreen.getId();
        aVarNewBuilder.c();
        ((FormsFooterButtonContext) aVarNewBuilder.f49761b).setScreenId(id10);
        Intrinsics.checkNotNullExpressionValue(aVarNewBuilder, "setScreenId(...)");
        String analyticsName = backendScreen.getAnalyticsName();
        if (analyticsName != null) {
            aVarNewBuilder.c();
            ((FormsFooterButtonContext) aVarNewBuilder.f49761b).setScreen(analyticsName);
        }
        aVarNewBuilder.c();
        ((FormsFooterButtonContext) aVarNewBuilder.f49761b).setIndex(i);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }
}
