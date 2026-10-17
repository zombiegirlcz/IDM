package xmd;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.h2;
import com.revolut.core.ui_kit.delegates.i2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.SetupBudgetContract$InputData;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import ip0.b9;
import ip0.qc;
import ip0.tc;
import ip0.xc;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import mx0.k3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class v0 implements cli.n {

    @NotNull
    public static final t0 Companion = new t0();
    public static final long d;
    public static final long e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SetupBudgetContract$InputData f307211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f307212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a9e.a f307213c;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        pkm.e eVar = pkm.e.SECONDS;
        d = kotlin.time.c.g(1, eVar);
        e = kotlin.time.c.g(2, eVar);
    }

    public v0(SetupBudgetContract$InputData inputData, w80.b amountFormatter, a9e.a recurringPaymentItemMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(recurringPaymentItemMapper, "recurringPaymentItemMapper");
        this.f307211a = inputData;
        this.f307212b = amountFormatter;
        this.f307213c = recurringPaymentItemMapper;
    }

    public static lzi.v b(b bVar, dj0.d dVar) {
        Object next;
        lzi.v id10;
        if (dVar.f115082a < bVar.f307159b.f115082a) {
            return lzi.v.VERY_LOW;
        }
        double d5 = ((r0 - r2) / bVar.f307160c.f115082a) * ((double) 100);
        Iterator it8 = bVar.f.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            lzi.u uVar = (lzi.u) next;
            if (uVar instanceof lzi.t) {
                if (d5 <= ((lzi.t) uVar).f201005b) {
                    break;
                }
            } else if (uVar instanceof lzi.r) {
                lzi.r rVar = (lzi.r) uVar;
                if (d5 > rVar.f201000b && d5 <= rVar.f201001c) {
                    break;
                }
            } else {
                if (!(uVar instanceof lzi.s)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (d5 > ((lzi.s) uVar).f201003b) {
                    break;
                }
            }
        }
        lzi.u uVar2 = (lzi.u) next;
        return (uVar2 == null || (id10 = uVar2.getId()) == null) ? lzi.v.SUGGESTED : id10;
    }

    public static eyl.a d(a aVar) {
        TextLocalisedClause textLocalisedClause;
        int i = u0.f307206a[aVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.analytics_budgeting_intro_checking_average_spending, null, null, 14);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.analytics_budgeting_intro_considering_recurring_expenses, null, null, 14);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.analytics_budgeting_intro_rounding_numbers, null, null, 14);
        }
        return new eyl.a(textLocalisedClause, null, R$attr.uikit_colorGreyTone50, 0, 50);
    }

    public final t a(g gVar, dj0.d dVar, b bVar, r rVar) {
        int i;
        TextLocalisedClause textLocalisedClause;
        bw0.m mVar;
        aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(R$string.analytics_set_budget_screen_details_cell_recurring, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (Image) null, 0, false, 30);
        dj0.d dVar2 = bVar.f307159b;
        MoneyClause moneyClauseC = otd.f.c(3, null, null, dVar2);
        ArrayList arrayList = bVar.d;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((mae.o) this.f307213c).h((qua.p) it8.next(), zhm.r0.g()));
        }
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("recurring", t0Var, moneyClauseC, null, null, null, null, 0, null, false, false, new i2(arrayList2, h2.START), null, 22520);
        dj0.d dVarH = pyd.c.H(dVar, dVar2);
        aw0.t0 t0Var2 = new aw0.t0((Clause) new TextLocalisedClause(R$string.analytics_set_budget_screen_details_cell_left_to_spend, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (Image) null, 0, false, 30);
        long j2 = dVarH.f115082a;
        if (j2 < 0) {
            j2 = 0;
        }
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("left_to_spend", t0Var2, otd.f.c(3, null, null, new dj0.d(j2, dVarH.f115083b)), null, null, null, null, 0, null, false, false, null, null, 30712);
        yp0.b.k(zhm.v.k(model, model2), R$attr.uikit_dp32, R$attr.uikit_dp0, 0, 0, 28);
        lzi.v vVarB = b(bVar, dVar);
        int[] iArr = u0.f307207b;
        int i2 = iArr[vVarB.ordinal()];
        AnimatedBackgroundType.Base base = (i2 == 1 || i2 == 2) ? AnimatedBackgroundType.Base.STATUS_WARNING : AnimatedBackgroundType.Base.ACCENT;
        int i3 = iArr[b(bVar, dVar).ordinal()];
        if (i3 == 1) {
            i = R$string.analytics_set_budget_screen_amount_input_band_very_low;
        } else if (i3 == 2) {
            i = R$string.analytics_set_budget_screen_amount_input_band_too_high;
        } else if (i3 == 3) {
            i = R$string.analytics_set_budget_screen_amount_input_band_ambitious;
        } else if (i3 == 4) {
            i = R$string.analytics_set_budget_screen_amount_input_band_suggested;
        } else {
            if (i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.analytics_set_budget_screen_amount_input_band_comfortable;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, null, null, 14);
        bw0.h hVar = new bw0.h(this.f307212b.e(dVar), cp5.d.J(dVar.f115083b), null, true, null, null, false, false, bw0.e.None, null, null, bw0.c.Enabled, 15316);
        long j3 = dVar.f115082a;
        dj0.d dVar3 = bVar.f307160c;
        if (j3 < dVar2.f115082a) {
            mVar = new bw0.m(new TextLocalisedClause(R$string.analytics_set_budget_screen_amount_input_recurring_payments_warning, null, null, 14), bw0.l.WARNING, null, false, null, 28);
        } else {
            lzi.v vVarB2 = b(bVar, dVar);
            int i5 = iArr[vVarB2.ordinal()];
            if (i5 == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.analytics_set_budget_screen_amount_input_lower_than_suggested_format, zhm.u.c(otd.f.c(3, null, null, pyd.c.H(dVar3, dVar))), null, 12);
            } else if (i5 != 2) {
                int i6 = R$string.analytics_budget_overview_per_day;
                AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = bVar.e;
                dj0.d dVarK = pyd.c.k(dVar, ChronoUnit.DAYS.between(analyticsSpendingPeriod$Interval.f99210a, analyticsSpendingPeriod$Interval.f99211b) + 1);
                long jK = cp5.d.k(dVarK.f115083b);
                long j5 = (dVarK.f115082a / jK) * jK;
                if (j5 > 0) {
                    dVarK = dj0.d.c(dVarK, j5, null, 2);
                }
                textLocalisedClause = new TextLocalisedClause(i6, zhm.u.c(otd.f.c(3, null, null, dVarK)), null, 12);
            } else {
                textLocalisedClause = new TextLocalisedClause(R$string.analytics_set_budget_screen_amount_input_higher_than_suggested_format, zhm.u.c(otd.f.c(3, null, null, pyd.c.H(dVar, dVar3))), null, 12);
            }
            TextLocalisedClause textLocalisedClause3 = textLocalisedClause;
            int i21 = iArr[vVarB2.ordinal()];
            mVar = new bw0.m(textLocalisedClause3, (i21 == 1 || i21 == 2) ? bw0.l.WARNING : bw0.l.INFO, null, false, null, 28);
        }
        return new t(gVar, zhm.u.c(new xc("adjustment_container", zhm.v.k(new CenteredAmountDelegate.Model("adjustment_amount", textLocalisedClause2, hVar, null, mVar, null, b9.WRAP_CONTENT, null, null, null, k3.f209788a, null, null, 7080), model, model2), 0, new tc(qc.f165962a), null, 0, 0, 0, 1000)), rVar, new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.analytics_set_budget_screen_action_button_set_budget, null, null, 14), LargeActionButton.ButtonStyle.e, null, null, false, null, null, null, 1020), null, null, 53), base);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        g gVar = new g(new TextLocalisedClause(R$string.analytics_budgeting_intro_title, null, null, 14), this.f307211a.f87512a == qzi.i.Joint ? new TextLocalisedClause(R$string.analytics_budget_overview_toolbar_title_joint, null, null, 14) : null);
        return (x) iii.c.f(domainState.f307168a, new xe7.a(gVar, 20), new xif.k(gVar, 10), new wx6.k(this, gVar, 15));
    }
}
