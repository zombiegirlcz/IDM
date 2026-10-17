package jlk;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pricingplans.models.cancel.PricingPlanCancelScreenConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.PlanDowngradeFeesAndTermsScreen;
import ip0.tm0;
import ip0.um0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanDowngradeFeesAndTermsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PlanDowngradeFeesAndTermsScreen planDowngradeFeesAndTermsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planDowngradeFeesAndTermsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((PricingPlanCancelScreenConfig.FeeAndRefundItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model;
        PricingPlanCancelScreenConfig.FeeAndRefundItem feeAndRefunds = (PricingPlanCancelScreenConfig.FeeAndRefundItem) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVar = (p) this.v.R2();
        pVar.getClass();
        Intrinsics.checkNotNullParameter(feeAndRefunds, "feeAndRefunds");
        PricingPlanCancelScreenConfig.DetailDialogScreenConfig screen = feeAndRefunds.f81171c;
        Object um0Var = null;
        if (screen == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Fee and Refund is null");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "PlanDowngradeTermsScreenModel", null, illegalArgumentException, h0Var);
        } else {
            j60.a aVar2 = pVar.f175866q;
            pVar.f175865p.getClass();
            Intrinsics.checkNotNullParameter(screen, "screen");
            TextClause textClause = new TextClause(screen.f81166a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = screen.f81167b;
            t tVar = new t(textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, 28);
            rp0.l lVar = rp0.l.WINDOW;
            aim.e eVarB = u.b();
            List<PricingPlanCancelScreenConfig.SimpleTextItem> list = screen.f81168c;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (PricingPlanCancelScreenConfig.SimpleTextItem simpleTextItem : list) {
                String str2 = simpleTextItem.f81175a;
                TextClause textClause2 = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str3 = simpleTextItem.f81176b;
                arrayList.add(new CellDetailsDelegate.Model(str2, textClause2, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayList);
            PricingPlanCancelScreenConfig.ActionButton actionButton = screen.d;
            PricingPlanCancelScreenConfig.ActionButton actionButton2 = screen.e;
            if (actionButton == null || actionButton2 == null) {
                if (actionButton != null) {
                    model = new LargeActionButtonDelegate.Model("DIALOG_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextClause(actionButton.f81164b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, actionButton, null, 744);
                    yp0.b.r(model, 0, 0, 0, 0, 15);
                } else if (actionButton2 != null) {
                    model = new LargeActionButtonDelegate.Model("DIALOG_BUTTON_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextClause(actionButton2.f81164b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, actionButton2, null, 744);
                    yp0.b.r(model, 0, 0, 0, 0, 15);
                }
                um0Var = model;
            } else {
                eVarB = eVarB;
                um0Var = new um0("DIALOG_TWIN_BUTTON_ID", new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextClause(actionButton.f81164b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextClause(actionButton2.f81164b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, 56), (Object) screen, (AnalyticsContext) null, (AnalyticsContext) null, R$attr.uikit_dp16, 0, 0, 880);
            }
            if (um0Var != null) {
                eVarB.add(um0Var);
            }
            aVar2.x(new y(u.a(eVarB), tVar, lVar, null, null, null, 1016));
        }
        return Unit.f186387a;
    }
}
