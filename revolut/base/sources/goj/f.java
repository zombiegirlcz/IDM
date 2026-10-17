package goj;

import com.google.protobuf.w0;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.api.widgets.EsimWidgetClickData;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import dcl.q;
import grl.t9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4h.a f145180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zq.a f145181b;

    public f(f4h.a iconBuilder, zq.a titleBuilder, e subtitleBuilder, he2.b progressStyleBuilder, q badgeBuilder, joj.b installationResolver) {
        Intrinsics.checkNotNullParameter(iconBuilder, "iconBuilder");
        Intrinsics.checkNotNullParameter(titleBuilder, "titleBuilder");
        Intrinsics.checkNotNullParameter(subtitleBuilder, "subtitleBuilder");
        Intrinsics.checkNotNullParameter(progressStyleBuilder, "progressStyleBuilder");
        Intrinsics.checkNotNullParameter(badgeBuilder, "badgeBuilder");
        Intrinsics.checkNotNullParameter(installationResolver, "installationResolver");
        this.f145180a = iconBuilder;
        this.f145181b = titleBuilder;
    }

    public static ErrorWidgetDelegate.Model a(String listId, op0.q widgetSize) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
        w0 w0VarE = kii.e.e(RevPointsGenericWidgetContext.newBuilder(), t9.ERROR, AnalyticsContext.INSTANCE);
        return new ErrorWidgetDelegate.Model(listId, null, new TextLocalisedClause(R$string.esim_widget_error_state_title, null, null, 14), new TextLocalisedClause(R$string.esim_widget_error_state_try_again, null, null, 14), widgetSize, new AnalyticsContext(w0VarE), new EsimWidgetClickData.Reload(listId, listId, new AnalyticsContext(w0VarE), new ViewableRecordItem$Type.ViewableRecord(null)), 130);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final hoj.a b(eoj.a r31, java.util.List r32, java.lang.String r33, com.revolut.analytics.tracking.v3.AnalyticsContext r34) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: goj.f.b(eoj.a, java.util.List, java.lang.String, com.revolut.analytics.tracking.v3.AnalyticsContext):hoj.a");
    }
}
