package foj;

import com.google.protobuf.w0;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import dej.a4;
import dej.l;
import dej.m;
import dej.x3;
import goj.f;
import grl.t9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import op0.q;
import ynj.e;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f137009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final goj.d f137010b;

    public c(f uiModelBuilder, goj.d emptyStateBuilder, goj.a analyticsContextBuilder, eoj.b subscriptionItemsFactory) {
        Intrinsics.checkNotNullParameter(uiModelBuilder, "uiModelBuilder");
        Intrinsics.checkNotNullParameter(emptyStateBuilder, "emptyStateBuilder");
        Intrinsics.checkNotNullParameter(analyticsContextBuilder, "analyticsContextBuilder");
        Intrinsics.checkNotNullParameter(subscriptionItemsFactory, "subscriptionItemsFactory");
        this.f137009a = uiModelBuilder;
        this.f137010b = emptyStateBuilder;
    }

    @Override // foj.d
    public final ErrorWidgetDelegate.Model a(String widgetId) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return f.a(widgetId, q.SMALL);
    }

    @Override // foj.d
    public final BaseDraggableWidgetDelegate.Model b(String str, ArrayList mobilePlans) {
        Object next;
        TextLocalisedClause textLocalisedClause;
        String widgetId = str;
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(mobilePlans, "mobilePlans");
        Iterator it8 = mobilePlans.iterator();
        if (it8.hasNext()) {
            next = it8.next();
            if (it8.hasNext()) {
                int i = ((x3) next).f113693b;
                while (true) {
                    Object next2 = it8.next();
                    int i2 = ((x3) next2).f113693b;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                    if (!it8.hasNext()) {
                        break;
                    }
                    widgetId = str;
                }
            }
        } else {
            next = null;
        }
        x3 plan = (x3) next;
        goj.d dVar = this.f137010b;
        if (plan == null) {
            return dVar.e(widgetId, q.SMALL);
        }
        a4 a4Var = plan.f113692a;
        w0 w0VarA = goj.a.a();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(plan, "plan");
        LayeredImage layeredImageD = dVar.d(a4Var);
        if (a4Var.f113488c == l.LOW_SPEED) {
            textLocalisedClause = new TextLocalisedClause(R$string.esim_subscriptions_item_label_messaging_pass_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        } else if (a4Var.f113487b == m.MOBILE_PLAN || a4Var.f) {
            textLocalisedClause = new TextLocalisedClause(R$string.esim_widget_empty_state_validity_get_unlimited, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        } else {
            Long l2 = a4Var.e;
            textLocalisedClause = new TextLocalisedClause(R$string.esim_widget_empty_state_validity_get_data_for_days, v.k(gej.a.a(dVar.f145177a, l2 != null ? l2.longValue() : 0L, null, 6), Integer.valueOf(a4Var.d.getDays())), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
        }
        return new AvatarWidgetDelegate.Model(widgetId, layeredImageD, null, textLocalisedClause, hx7.l.l(a4Var) ? new TextLocalisedClause(R$string.esim_widget_empty_state_subtitle_claim_now, null, null, 14) : e.b(a4Var.f113489g, null), null, null, null, dVar.a(a4Var), goj.d.b(widgetId, w0VarA, a4Var), null, 10196);
    }

    @Override // foj.d
    public final BaseDraggableWidgetDelegate.Model c(String widgetId, ArrayList subscriptions, List installationStates) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        Intrinsics.checkNotNullParameter(installationStates, "installationStates");
        w0 w0VarA = goj.a.a();
        eoj.a aVar = (eoj.a) d0.d0(eoj.b.a(subscriptions));
        if (aVar == null) {
            return a(widgetId);
        }
        hoj.a aVarB = this.f137009a.b(aVar, installationStates, widgetId, new AnalyticsContext(w0VarA));
        return new AvatarWidgetDelegate.Model(widgetId, aVarB.f154344a, aVarB.f154345b, aVarB.f154346c, null, aVarB.d, null, null, aVarB.f, aVarB.e, new AnalyticsContext(w0VarA), 1968);
    }

    @Override // foj.d
    public final BaseDraggableWidgetDelegate.Model d(String widgetId) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        w0 w0VarE = kii.e.e(RevPointsGenericWidgetContext.newBuilder(), t9.LOADING, AnalyticsContext.INSTANCE);
        return new AvatarWidgetLoadingDelegate.Model(widgetId, new AnalyticsContext(w0VarE), new zn.b(widgetId, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarE)));
    }

    @Override // foj.d
    public final AvatarWidgetDelegate.Model e(String widgetId) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return goj.d.c(widgetId, q.SMALL);
    }
}
