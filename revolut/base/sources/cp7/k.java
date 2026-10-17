package cp7;

import android.os.Parcelable;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.appupdate.navigation.AppUpdateDestination;
import com.revolut.appupdate.ui.AppUpdateContract$InputData;
import com.revolut.core.ui_kit.internal.views.order_book.OrderBookChartView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.security_hub.api.models.DigitizedCards;
import com.revolut.feature.security_hub.api.models.StreetModeInfo;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.models.CategoryBudgetEditingInfo;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.StockFinancialsStatementsActivity;
import com.revolut.retail.feature.stockdetails.impl.ui.utils.TabNavigationId;
import cuc.e0;
import cuc.t;
import cul.v;
import d0j.b0;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import r10.w;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f107904b;

    public /* synthetic */ k(Object obj2, int i) {
        this.f107903a = i;
        this.f107904b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v81, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r9v2 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f107903a;
        int i2 = 0;
        boolean z = true;
        z = true;
        Object obj3 = this.f107904b;
        switch (i) {
            case 0:
                e updateState = (e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return e.a(updateState, com.revolut.feature.insurance_car.impl.data.model.a.c(updateState.f107890b, ((um7.c) obj3).f281264a), null, null, 29);
            case 1:
                e updateState2 = (e) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return e.a(updateState2, com.revolut.feature.insurance_car.impl.data.model.a.e(updateState2.f107890b, ((ym7.c) obj3).f314876a), null, null, 29);
            case 2:
                e updateState3 = (e) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return e.a(updateState3, ApplicationForm.a(updateState3.f107890b, null, null, null, ((ap7.e) ((ap7.g) obj3)).f8104a, null, 1007), null, null, 29);
            case 3:
                e updateState4 = (e) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return e.a(updateState4, ApplicationForm.a(updateState4.f107890b, null, null, null, null, ((ep7.f) ((ep7.g) obj3)).f128096a, 991), null, null, 29);
            case 4:
                e updateState5 = (e) obj2;
                Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                return e.a(updateState5, com.revolut.feature.insurance_car.impl.data.model.a.a(updateState5.f107890b, ((qm7.b) ((com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a) obj3)).f247775a), null, null, 29);
            case 5:
                e updateState6 = (e) obj2;
                Intrinsics.checkNotNullParameter(updateState6, "$this$updateState");
                return e.a(updateState6, com.revolut.feature.insurance_car.impl.data.model.a.b(updateState6.f107890b, ((sm7.c) obj3).f264383a), null, null, 29);
            case 6:
                e updateState7 = (e) obj2;
                Intrinsics.checkNotNullParameter(updateState7, "$this$updateState");
                return e.a(updateState7, ApplicationForm.a(updateState7.f107890b, null, ((km7.c) obj3).f185731a, null, null, null, 1019), null, null, 29);
            case 7:
                e updateState8 = (e) obj2;
                Intrinsics.checkNotNullParameter(updateState8, "$this$updateState");
                return e.a(updateState8, com.revolut.feature.insurance_car.impl.data.model.a.d(updateState8.f107890b, ((wm7.c) obj3).f298616a), null, null, 29);
            case 8:
                e updateState9 = (e) obj2;
                Intrinsics.checkNotNullParameter(updateState9, "$this$updateState");
                return e.a(updateState9, com.revolut.feature.insurance_car.impl.data.model.a.f(updateState9.f107890b, ((an7.c) obj3).f6571a), null, null, 29);
            case 9:
                e updateState10 = (e) obj2;
                Intrinsics.checkNotNullParameter(updateState10, "$this$updateState");
                return e.a(updateState10, ApplicationForm.a(updateState10.f107890b, ((wo7.e) ((wo7.f) obj3)).f298900a, null, null, null, null, 1021), null, null, 29);
            case 10:
                m1h.f fVar = (m1h.f) obj3;
                ilc.a roboContext = (ilc.a) obj2;
                Intrinsics.checkNotNullParameter(roboContext, "roboContext");
                int i3 = cpc.b.f107924a[roboContext.ordinal()];
                if (i3 != 1 && i3 != 2 && i3 != 3) {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean z3 = fVar.f201493a;
                    xi0.b bVar = fVar.f201494b;
                    if (z3 && !Intrinsics.f(bVar, fVar.f201495c)) {
                        return new cpc.e(bVar);
                    }
                }
                return cpc.d.f107927a;
            case 11:
                cq.b bVar2 = (cq.b) obj3;
                ue0.c cVar = bVar2.f107973l;
                zp.b bVar3 = (zp.b) obj2;
                ui0.d dVar = bVar3.f324084a;
                LocalDate localDate = bVar3.f324086c;
                ui0.d dVar2 = bVar3.f324085b;
                if (dVar.compareTo(dVar2) > 0 || (dVar.equals(dVar2) && LocalDate.now().plusWeeks(2L).compareTo((ChronoLocalDate) localDate) < 0)) {
                    return Unit.f186387a;
                }
                if (dVar.compareTo(dVar2) >= 0 && (!dVar.equals(dVar2) || LocalDate.now().compareTo((ChronoLocalDate) localDate) <= 0)) {
                    z = false;
                }
                Class cls = Long.TYPE;
                Long l2 = (Long) cVar.T2("SOFT_UPDATE_PROMPT_SHOWN_DATE", cls);
                LocalDate localDateNow = LocalDate.now(bVar2.f107974m);
                if (z || l2 == null || localDateNow.isAfter(Instant.ofEpochMilli(l2.longValue()).atZone(ZoneId.systemDefault()).toLocalDate())) {
                    Intrinsics.h(localDateNow);
                    cVar.G(Long.valueOf(oc.c.F(localDateNow)), "SOFT_UPDATE_PROMPT_SHOWN_DATE", cls);
                    bVar2.k.c(vhi.c.c(new AppUpdateDestination(new AppUpdateContract$InputData(z)), yhi.b.SOLID, null, false, 12));
                }
                return Unit.f186387a;
            case 12:
                cq6.l lVar = (cq6.l) obj3;
                if (((aq6.e) obj2) instanceof aq6.c) {
                    lVar.L2(lVar.f108015m.a(true));
                }
                return Unit.f186387a;
            case 13:
                com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.a aVar = (com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.a) obj3;
                dii.g output = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof dii.f) {
                    aVar.C2(cq9.i.f108052a);
                }
                return Unit.f186387a;
            case 14:
                return cqh.g.a((cqh.g) obj2, null, null, (poh.i) obj3, null, 11);
            case 15:
                cr0.n nVar = (cr0.n) obj3;
                WindowInsets windowInsets = (WindowInsets) obj2;
                int i5 = cr0.n.f108184c;
                Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
                WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
                Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
                Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
                int i6 = insets.top;
                if (nVar.getLayoutParams().height != i6) {
                    ViewGroup.LayoutParams layoutParams = nVar.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.height = i6;
                    nVar.setLayoutParams(layoutParams);
                }
                return Unit.f186387a;
            case 16:
                com.revolut.feature.spending_analytics.impl.ui.rev10.settings.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.settings.a) obj3;
                lpd.m result = (lpd.m) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.l2(new crd.j(aVar2, result, ValueOf, z ? 1 : 0), new yi5.b(26));
                aVar2.X1(new y0("CYCLE_UPDATE_SUCCESS_ID", new j0((Clause) new TextLocalisedClause(R$string.analytics_settings_cycle_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4));
                return Unit.f186387a;
            case 17:
                CategoryBudgetEditingInfo it8 = (CategoryBudgetEditingInfo) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((wjf.e) ((thf.c) ((w) obj3).f250866b)).k(it8.f101547a);
            case 18:
                return (csj.i) obj3;
            case 19:
                esk.b it9 = (esk.b) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                TabNavigationId navigationId = new TabNavigationId(z92.f.P(it9));
                StockFinancialsStatementsActivity stockFinancialsStatementsActivity = (StockFinancialsStatementsActivity) ((csk.g) obj3);
                Intrinsics.checkNotNullParameter(navigationId, "navigationId");
                Iterator it10 = stockFinancialsStatementsActivity.z0.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        i2 = -1;
                    } else if (!((pwk.a) it10.next()).f240486a.equals(navigationId)) {
                        i2++;
                    }
                }
                ValueOf = i2 != -1 ? Integer.valueOf(i2) : 0;
                if (ValueOf != 0) {
                    int iIntValue = ValueOf.intValue();
                    Tabs.u(stockFinancialsStatementsActivity.Z0(), navigationId.f104064a, false, false, false, 14);
                    stockFinancialsStatementsActivity.b1().setCurrentItem(iIntValue, true);
                }
                return Unit.f186387a;
            case 20:
                ct.e update = (ct.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                String pin = ((ct.g) ((ct.h) obj3)).f108554a;
                update.getClass();
                Intrinsics.checkNotNullParameter(pin, "pin");
                return new ct.e(pin);
            case 21:
                String campaignId = (String) obj2;
                Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                return (com.revolut.feature.raffle.impl.data.models.b) ((cta.c) obj3).f108654b.get(cta.c.b(campaignId));
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                ((com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b) obj3).f83408r.invoke(new od9.f(null));
                return Boolean.FALSE;
            case 23:
                OrderBookChartView orderBookChartView = (OrderBookChartView) obj3;
                eu0.b newData = (eu0.b) obj2;
                int i21 = OrderBookChartView.f57430g;
                Intrinsics.checkNotNullParameter(newData, "newData");
                du0.f fVar2 = orderBookChartView.f57431a;
                fVar2.M = newData;
                f0 f0Var = f0.f322471a;
                fVar2.C = f0Var;
                fVar2.D = f0Var;
                fVar2.E = f0Var;
                fVar2.e(orderBookChartView.getWidth(), orderBookChartView.getHeight(), orderBookChartView.getPaddingEnd() + orderBookChartView.getPaddingStart(), orderBookChartView.getPaddingBottom() + orderBookChartView.getPaddingTop());
                eu0.h hVar = orderBookChartView.currentTooltip;
                orderBookChartView.b(hVar != null ? Float.valueOf(hVar.f129460a) : null);
                orderBookChartView.invalidate();
                return Unit.f186387a;
            case 24:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (DigitizedCards) ((cuc.d) obj3).f108949c.get("LINKED_WALLETS_KEY");
            case 25:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) ((t) obj3).f108972b.get("SECURITY_HUB_CHECKLIST_COMPLETION_KEY");
            case 26:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (StreetModeInfo) ((e0) obj3).f108954b.get("STREET_MODE_INFO_KEY");
            case 27:
                String stepId = (String) obj2;
                Intrinsics.checkNotNullParameter(stepId, "stepId");
                return (String) ((cuh.b) obj3).f109000c.get(stepId);
            case 28:
                cuj.i update2 = (cuj.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return cuj.i.a(update2, null, (b0) obj3, 1);
            default:
                v update3 = (v) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return v.a(update3, null, null, null, null, null, null, null, null, null, null, ((hdf.b) obj3).f151428b, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -2049, 8191);
        }
    }
}
