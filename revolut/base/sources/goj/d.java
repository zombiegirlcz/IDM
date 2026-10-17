package goj;

import com.google.protobuf.w0;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.RawCutoutImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.api.widgets.EsimWidgetClickData;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import dcl.q;
import dej.a4;
import dej.m;
import grl.t9;
import hx7.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gej.a f145177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zq.a f145178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cej.b f145179c;

    public d(gej.a bytesFormatter, ynj.e commonUiBuilder, q widgetBadgeBuilder, zq.a widgetTitleBuilder, cej.b mobilePlansFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(bytesFormatter, "bytesFormatter");
        Intrinsics.checkNotNullParameter(commonUiBuilder, "commonUiBuilder");
        Intrinsics.checkNotNullParameter(widgetBadgeBuilder, "widgetBadgeBuilder");
        Intrinsics.checkNotNullParameter(widgetTitleBuilder, "widgetTitleBuilder");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        this.f145177a = bytesFormatter;
        this.f145178b = widgetTitleBuilder;
        this.f145179c = mobilePlansFeatureAvailabilityInteractor;
    }

    public static EsimWidgetClickData b(String str, w0 w0Var, a4 a4Var) {
        return l.l(a4Var) ? new EsimWidgetClickData.EsimHome(str, new AnalyticsContext(w0Var), new ViewableRecordItem$Type.ViewableRecord(null)) : new EsimWidgetClickData.PurchaseDataPlan(a4Var.f113489g.getF100209b().f100235a, a4Var.f113487b, str, new AnalyticsContext(w0Var), new ViewableRecordItem$Type.ViewableRecord(null));
    }

    public static AvatarWidgetDelegate.Model c(String widgetId, op0.q widgetSize) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
        w0 w0VarE = kii.e.e(RevPointsGenericWidgetContext.newBuilder(), t9.EMPTY, AnalyticsContext.INSTANCE);
        return AvatarWidgetDelegate.Model.E(new AvatarWidgetDelegate.Model(widgetId, joj.a.f177145b, null, new TextLocalisedClause(R$string.esim_widget_empty_state_esim_not_available, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, null, null, null, null, new EsimWidgetClickData.EsimHome(widgetId, new AnalyticsContext(w0VarE), new ViewableRecordItem$Type.ViewableRecord(null)), new AnalyticsContext(w0VarE), 4064), widgetSize);
    }

    public final RawCutoutImageBadge a(a4 a4Var) {
        Image imageK;
        EsimCoverage coverage = a4Var.f113489g;
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        if (coverage instanceof EsimCoverage.Country) {
            imageK = ynj.e.a(((EsimCoverage.Country) coverage).f100204a);
        } else if (coverage instanceof EsimCoverage.Regional) {
            imageK = ynj.e.k(ynj.e.m(((EsimCoverage.Regional) coverage).f100209b));
        } else {
            if (!(coverage instanceof EsimCoverage.Global) && !(coverage instanceof EsimCoverage.Undefined)) {
                throw new NoWhenBranchMatchedException();
            }
            imageK = ynj.e.k(R$drawable.uikit_icn_96_region_global);
        }
        return new RawCutoutImageBadge(imageK);
    }

    public final LayeredImage d(a4 a4Var) {
        int i;
        LayeredImage.Companion companion;
        Color.Solid solid;
        Color.Solid solid2;
        if (a4Var.f113488c == dej.l.LOW_SPEED) {
            return ynj.e.j();
        }
        if (a4Var.f113487b == m.MOBILE_PLAN) {
            i = R$drawable.uikit_icn_24_call;
            companion = LayeredImage.INSTANCE;
            int i2 = R$attr.uikit_colorAccentNeutral;
            solid = new Color.Solid(i2);
            solid2 = new Color.Solid(i2);
        } else {
            i = R$drawable.uikit_icn_24_data;
            companion = LayeredImage.INSTANCE;
            int i3 = R$attr.uikit_colorAccentNeutral;
            solid = new Color.Solid(i3);
            solid2 = new Color.Solid(i3);
        }
        return y.h(solid2, 0.1f, companion, i, solid);
    }

    public final AvatarWidgetDelegate.Model e(String widgetId, op0.q widgetSize) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
        w0 w0VarE = kii.e.e(RevPointsGenericWidgetContext.newBuilder(), t9.EMPTY, AnalyticsContext.INSTANCE);
        return AvatarWidgetDelegate.Model.E(new AvatarWidgetDelegate.Model(widgetId, joj.a.f177144a, null, new TextLocalisedClause(((efj.d) this.f145179c).a() ? R$string.esim_widget_empty_state_get_mobile_plan : R$string.esim_widget_empty_state_get_esim_data_plan, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10), null, null, null, null, null, new EsimWidgetClickData.EsimHome(widgetId, new AnalyticsContext(w0VarE), new ViewableRecordItem$Type.ViewableRecord(null)), new AnalyticsContext(w0VarE), 4016), widgetSize);
    }
}
