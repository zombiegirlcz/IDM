package eok;

import c8g.c;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.k;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.feature.pricingplans.models.PricingPlanNextPlanInfo;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.widget.b;
import com.youTransactor.uCube.rpc.Constants;
import gim.i;
import hha.d;
import hha.s;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import sjk.h;
import yhm.o;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ boolean u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PricingPlanSubscription f127993w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, PricingPlanSubscription pricingPlanSubscription, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f127993w = pricingPlanSubscription;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, this.f127993w, continuation);
        aVar.u = ((Boolean) obj2).booleanValue();
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((a) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TimeClause timeClause;
        Long l2;
        boolean z = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (z) {
            return f0.f322471a;
        }
        PricingPlanSubscription pricingPlanSubscription = this.f127993w;
        Clause clauseA = h.a(pricingPlanSubscription);
        Clause clauseC = h.c(pricingPlanSubscription);
        PricingPlanNextPlanInfo pricingPlanNextPlanInfo = pricingPlanSubscription.f81134j;
        if (pricingPlanNextPlanInfo == null || (l2 = pricingPlanNextPlanInfo.d) == null) {
            timeClause = null;
        } else {
            long jLongValue = l2.longValue();
            TimeClause.Format.INSTANCE.getClass();
            timeClause = new TimeClause(jLongValue, TimeClause.Format.f57959a, null, null, 12);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cancel_downgrade_home_widget_title, v.k(clauseA, c.p(timeClause)), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.cancel_downgrade_home_widget_subtitle, v.k(clauseC, clauseA), null, 12);
        d dVar = pricingPlanSubscription.f81129a;
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("LIST_ID_CANCEL_DOWNGRADE_ITEM", textLocalisedClause, textLocalisedClause2, new m((dVar == null || !s.o(dVar)) ? (dVar == null || !s.p(dVar)) ? (dVar == null || !s.j(dVar)) ? (dVar == null || !s.n(dVar)) ? ez0.c.a("standard_cards") : ez0.c.a("premium_green_cards") : ez0.c.a("metal_bronze_cards") : ez0.c.a("ultra_cards") : ez0.c.a("private_banking_cards"), (NewBadgeContent.WithNumber) null, new AccentCircleBadge(dw0.a.Pending), 10), new ActionWidgetDelegate.Model.b.a(null), new k(new TextLocalisedClause(R$string.cancel_downgrade_home_widget_cta_keep, u.c(clauseA), null, 12), new TextLocalisedClause(R$string.cancel_downgrade_home_widget_cta_view_benefits, null, null, 14), null, null, Constants.TAG_OS_VERSION), null, pricingPlanSubscription, null, false, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }
}
