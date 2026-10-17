package foj;

import com.google.protobuf.w0;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.ke;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.EsimCarouselWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.s0;
import com.revolut.core.ui_kit.delegates.widgets.t0;
import com.revolut.core.ui_kit.delegates.widgets.u0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.esim.api.widgets.EsimWidgetClickData;
import com.revolut.retail.feature.esim.impl.R$plurals;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import dej.a4;
import dej.l;
import dej.m;
import dej.x3;
import goj.f;
import grl.t9;
import ip0.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import op0.q;
import org.jetbrains.annotations.NotNull;
import ynj.e;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zq.a f137006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f137007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final goj.d f137008c;

    public b(zq.a titleBuilder, f uiModelBuilder, goj.d emptyStateBuilder, goj.a analyticsContextBuilder, eoj.b subscriptionItemsFactory) {
        Intrinsics.checkNotNullParameter(titleBuilder, "titleBuilder");
        Intrinsics.checkNotNullParameter(uiModelBuilder, "uiModelBuilder");
        Intrinsics.checkNotNullParameter(emptyStateBuilder, "emptyStateBuilder");
        Intrinsics.checkNotNullParameter(analyticsContextBuilder, "analyticsContextBuilder");
        Intrinsics.checkNotNullParameter(subscriptionItemsFactory, "subscriptionItemsFactory");
        this.f137006a = titleBuilder;
        this.f137007b = uiModelBuilder;
        this.f137008c = emptyStateBuilder;
    }

    @Override // foj.d
    public final ErrorWidgetDelegate.Model a(String widgetId) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return f.a(widgetId, q.MEDIUM);
    }

    @Override // foj.d
    public final BaseDraggableWidgetDelegate.Model b(String widgetId, ArrayList mobilePlans) {
        Clause textLocalisedClause;
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(mobilePlans, "mobilePlans");
        boolean zIsEmpty = mobilePlans.isEmpty();
        goj.d dVar = this.f137008c;
        if (zIsEmpty) {
            return dVar.e(widgetId, q.MEDIUM);
        }
        w0 w0VarA = goj.a.a();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(mobilePlans, "mobilePlans");
        List listP0 = d0.P0(mobilePlans, new goj.c());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        Iterator it8 = listP0.iterator();
        while (it8.hasNext()) {
            a4 a4Var = ((x3) it8.next()).f113692a;
            String strQ = j6.a.q("EMPTY_STATE_ITEM_", a4Var.f113486a);
            l lVar = a4Var.f113488c;
            l lVar2 = l.LOW_SPEED;
            if (lVar == lVar2) {
                textLocalisedClause = new TextLocalisedClause(R$string.esim_subscriptions_item_label_messaging_pass_title, null, null, 14);
            } else if (a4Var.f113487b == m.MOBILE_PLAN || a4Var.f) {
                textLocalisedClause = new TextLocalisedClause(R$string.esim_widget_empty_state_unlimited_plan_title, null, null, 14);
            } else {
                Long l2 = a4Var.e;
                CompositeClause compositeClauseA = l2 != null ? gej.a.a(dVar.f145177a, l2.longValue(), null, 6) : null;
                int days = a4Var.d.getDays();
                int i = R$plurals.esim_subscriptions_item_validity_data_for_days;
                Object[] elements = {Integer.valueOf(days), compositeClauseA};
                Intrinsics.checkNotNullParameter(elements, "elements");
                textLocalisedClause = new TextLocalisedQuantityClause(i, Integer.valueOf(days), kotlin.collections.d.L(elements), (Style) null, 24);
            }
            arrayList.add(new u0(strQ, textLocalisedClause, (a4Var.f113490h != null || lVar == lVar2) ? new TextLocalisedClause(R$string.esim_widget_empty_state_plan_benefit_subtitle, null, null, 14) : e.b(a4Var.f113489g, null), new t0(dVar.d(a4Var), dVar.a(a4Var)), new s0(hx7.l.l(a4Var) ? new TextLocalisedClause(R$string.esim_checkout_actions_claim, null, null, 14) : new TextLocalisedClause(R$string.esim_widget_empty_state_action_get, null, null, 14)), goj.d.b(widgetId, w0VarA, a4Var)));
        }
        return new EsimCarouselWidgetDelegate.Model(dVar.f145178b.e(), widgetId, arrayList);
    }

    @Override // foj.d
    public final BaseDraggableWidgetDelegate.Model c(String widgetId, ArrayList subscriptions, List installationStates) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        Intrinsics.checkNotNullParameter(installationStates, "installationStates");
        w0 w0VarA = goj.a.a();
        List<eoj.a> listA = eoj.b.a(subscriptions);
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        for (eoj.a aVar : listA) {
            hoj.a aVarB = this.f137007b.b(aVar, installationStates, aVar.f127985a, new AnalyticsContext(w0VarA));
            arrayList.add(new ReferralContactDelegate.Model(aVar.f127985a, aVarB.f154344a, aVarB.f154345b, aVarB.f154346c, aVarB.f, null, false, aVarB.d, aVarB.e, 376016));
        }
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        TextLocalisedClause actionText = new TextLocalisedClause(R$string.esim_widget_empty_state_add_data, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10);
        EsimWidgetClickData.PurchaseDataPlan clickParcel = new EsimWidgetClickData.PurchaseDataPlan(null, null, widgetId, new AnalyticsContext(w0VarA), new ViewableRecordItem$Type.ViewableRecord(null));
        Intrinsics.checkNotNullParameter(actionText, "actionText");
        Intrinsics.checkNotNullParameter(clickParcel, "clickParcel");
        ReferralContactDelegate.Model model = new ReferralContactDelegate.Model("ADD_DATA_WIDGET_ITEM", joj.a.f177144a, actionText, null, null, ke.MATCH_PARENT, false, null, clickParcel, 375248);
        TextLocalisedClause textLocalisedClauseE = this.f137006a.e();
        return new ContactsWidgetDelegate.Model(widgetId, d0.F0(model, arrayList), textLocalisedClauseE, false, new AnalyticsContext(w0VarA), new zn.b(widgetId, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarA)), 8);
    }

    @Override // foj.d
    public final BaseDraggableWidgetDelegate.Model d(String widgetId) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        w0 w0VarE = kii.e.e(RevPointsGenericWidgetContext.newBuilder(), t9.LOADING, AnalyticsContext.INSTANCE);
        ContactsWidgetDelegate.Model.Companion companion = ContactsWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.esim_widget_title, null, null, 14);
        c2 c2Var = c2.CIRCLE;
        zn.b bVar = new zn.b(widgetId, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarE));
        AnalyticsContext analyticsContext = new AnalyticsContext(w0VarE);
        companion.getClass();
        return ContactsWidgetDelegate.Model.Companion.a(widgetId, textLocalisedClause, c2Var, analyticsContext, bVar);
    }

    @Override // foj.d
    public final AvatarWidgetDelegate.Model e(String widgetId) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return goj.d.c(widgetId, q.MEDIUM);
    }
}
