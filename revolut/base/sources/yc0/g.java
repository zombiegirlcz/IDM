package yc0;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.WidgetProgressionItem;
import com.revolut.tracking.v3.FormsContext;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements no.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ no.m f312422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final la0.c f312423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f312424c;

    public g(no.m productProvider, la0.c flowProvider, Map saturators) {
        Intrinsics.checkNotNullParameter(productProvider, "productProvider");
        Intrinsics.checkNotNullParameter(flowProvider, "flowProvider");
        Intrinsics.checkNotNullParameter(saturators, "saturators");
        this.f312422a = productProvider;
        this.f312423b = flowProvider;
        this.f312424c = saturators;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return this.f312422a.getL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final w0 a(BackendScreen screen) {
        List<BackendItem> listE;
        Intrinsics.checkNotNullParameter(screen, "screen");
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        FormsContext.a contextBuilder = FormsContext.newBuilder();
        String strB = screen.getF63427a();
        contextBuilder.c();
        ((FormsContext) contextBuilder.f49761b).setId(strB);
        String str = this.f312423b.a().f63264b;
        contextBuilder.c();
        ((FormsContext) contextBuilder.f49761b).setFlowId(str);
        Intrinsics.checkNotNullExpressionValue(contextBuilder, "setFlowId(...)");
        String strD = screen.getI();
        if (strD != null) {
            contextBuilder.c();
            ((FormsContext) contextBuilder.f49761b).setScreen(strD);
        }
        xl2.v vVar = screen instanceof xl2.v ? (xl2.v) screen : null;
        if (vVar != null && (listE = vVar.getF63468b()) != null) {
            for (BackendItem backendItem : listE) {
                Object obj2 = this.f312424c.get(backendItem.getClass());
                if ((obj2 instanceof z90.a ? (z90.a) obj2 : null) != null) {
                    WidgetProgressionItem item = (WidgetProgressionItem) backendItem;
                    Intrinsics.checkNotNullParameter(item, "item");
                    Intrinsics.checkNotNullParameter(contextBuilder, "contextBuilder");
                    String str2 = item.f63721b;
                    contextBuilder.c();
                    ((FormsContext) contextBuilder.f49761b).setTicketId(str2);
                    Intrinsics.checkNotNullExpressionValue(contextBuilder, "setTicketId(...)");
                }
            }
        }
        w0 w0VarA = contextBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }
}
