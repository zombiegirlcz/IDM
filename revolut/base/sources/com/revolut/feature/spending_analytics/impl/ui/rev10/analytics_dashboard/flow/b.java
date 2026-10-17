package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowanceDestination;
import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowanceLaunchMode;
import com.revolut.feature.payments_migration.api.navigation.PaymentsMigrationDestination;
import com.revolut.feature.retail.goals.api.navigation.GoalsContract$Account;
import com.revolut.feature.retail.goals.api.navigation.GoalsDestination;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.AnalyticsDashboardFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.AnalyticsDashboardFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import dce.s0;
import dod.b;
import dod.c;
import dod.e;
import dod.f;
import dod.g;
import dod.k;
import dod.m;
import frd.i;
import java.util.Set;
import kge.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lzi.j;
import oki.h;
import wsg.n;
import xnd.l;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements m {
    public final mjb.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f87598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f87599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f87600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f87601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f87602t;

    public b(AnalyticsDashboardFlowContract$InputData inputData, mjb.a savingsNavigationProvider, d customPeriodProvider, gte.a featureToggleInteractor, i totalWealthEventRouter, n walletInteractor) {
        FlowStep budgetCreation;
        qzi.i iVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsNavigationProvider, "savingsNavigationProvider");
        Intrinsics.checkNotNullParameter(customPeriodProvider, "customPeriodProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(totalWealthEventRouter, "totalWealthEventRouter");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.o = savingsNavigationProvider;
        this.f87598p = customPeriodProvider;
        this.f87599q = featureToggleInteractor;
        this.f87600r = totalWealthEventRouter;
        this.f87601s = walletInteractor;
        AnalyticsDashboardFlowContract$InputData.DefaultScreen defaultScreen = inputData.f87571a;
        if (defaultScreen instanceof AnalyticsDashboardFlowContract$InputData.DefaultScreen.Dashboard) {
            budgetCreation = new AnalyticsDashboardFlowContract$Step.Dashboard(new AnalyticsDashboardContract$InputData(((AnalyticsDashboardFlowContract$InputData.DefaultScreen.Dashboard) defaultScreen).f87577a));
        } else if (defaultScreen instanceof AnalyticsDashboardFlowContract$InputData.DefaultScreen.AnalyticsDetails) {
            AnalyticsDashboardFlowContract$InputData.DefaultScreen.AnalyticsDetails analyticsDetails = (AnalyticsDashboardFlowContract$InputData.DefaultScreen.AnalyticsDetails) defaultScreen;
            budgetCreation = new AnalyticsDashboardFlowContract$Step.AnalyticsDetails(new AnalyticsDetailsContract$InputData(analyticsDetails.f87573b, analyticsDetails.f87572a, null, new AnalyticsDetailsContract$InputData.Deeplink(analyticsDetails.f87574c, analyticsDetails.d)));
        } else {
            if (!(defaultScreen instanceof AnalyticsDashboardFlowContract$InputData.DefaultScreen.Budget)) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticsDashboardFlowContract$InputData.DefaultScreen.Budget budget = (AnalyticsDashboardFlowContract$InputData.DefaultScreen.Budget) defaultScreen;
            AccountId accountId = budget.f87575a;
            if (budget.f87576b) {
                if (accountId instanceof AccountId.Personal) {
                    iVar = qzi.i.Personal;
                } else {
                    if (!(accountId instanceof AccountId.Joint)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar = qzi.i.Joint;
                }
                budgetCreation = new AnalyticsDashboardFlowContract$Step.BudgetOverview(iVar);
            } else {
                budgetCreation = new AnalyticsDashboardFlowContract$Step.BudgetCreation(accountId);
            }
        }
        this.f87602t = cp5.d.a(this, budgetCreation, f0.f322471a, new dgj.h(this, 16));
    }

    @Override // yji.l
    public final aii.n o2(aii.m event) {
        qzi.i iVar;
        lzi.i iVar2;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof b.g;
        ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
        yki.a aVar = this.f87602t;
        if (z) {
            h.w2(aVar, AnalyticsDashboardFlowContract$Step.Settings.f87591a, fullscreen_fade);
            return null;
        }
        if (event instanceof b.a) {
            h.w2(aVar, AnalyticsDashboardFlowContract$Step.AccountPicker.f87578a, fullscreen_fade);
            return null;
        }
        if (event instanceof g) {
            g gVar = (g) event;
            yld.d dVar = gVar.f116545b;
            l lVar = gVar.f116546c;
            xnd.h hVar = gVar.d;
            AnalyticsAccountsSelection analyticsAccountsSelection = lVar.f307416a;
            Set set = lVar.f;
            Set set2 = lVar.d;
            xi0.b bVar = lVar.e;
            String str = lVar.f307417b;
            Set set3 = lVar.f307418c;
            j jVar = hVar.f307401b;
            AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = jVar.f200981b;
            lzi.h hVar2 = hVar.f307400a;
            lzi.i iVar3 = jVar.f200980a;
            int i = dod.n.f116555a[iVar3.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                iVar2 = iVar3;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                iVar2 = null;
            }
            h.t2(this, this.f87602t, new AnalyticsDashboardFlowContract$Step.AnalyticsDetails(new AnalyticsDetailsContract$InputData(analyticsAccountsSelection, dVar, new AnalyticsDetailsContract$InputData.Configuration(set, set2, bVar, str, set3, analyticsSpendingPeriod$Interval, hVar2, iVar2), null)), true, null, false, 12);
            return null;
        }
        if (event instanceof dod.l) {
            h.t2(this, this.f87602t, new AnalyticsDashboardFlowContract$Step.BudgetCreation(((dod.l) event).f116554b), true, null, false, 12);
            return null;
        }
        boolean z3 = event instanceof e;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z3) {
            h.w2(aVar, new AnalyticsDashboardFlowContract$Step.BudgetSetupAccountPicker(((e) event).f116541b), bottom_dialog);
            return null;
        }
        if (event instanceof dod.d) {
            AccountId accountId = ((dod.d) event).f116540b;
            if (accountId instanceof AccountId.Joint) {
                iVar = qzi.i.Joint;
            } else {
                if (!(accountId instanceof AccountId.Personal)) {
                    throw new NoWhenBranchMatchedException();
                }
                iVar = qzi.i.Personal;
            }
            if (iVar == null) {
                return null;
            }
            h.t2(this, this.f87602t, new AnalyticsDashboardFlowContract$Step.BudgetOverview(iVar), true, null, false, 12);
            return null;
        }
        if (event instanceof b.e) {
            h.t2(this, this.f87602t, AnalyticsDashboardFlowContract$Step.IncomeSorter.f87590a, true, null, false, 12);
            return null;
        }
        Continuation continuation = null;
        if (event instanceof dod.j) {
            n2(new s0(this, event, continuation, 9), new whi.b(6));
            return null;
        }
        if (event instanceof k) {
            h.w2(aVar, new AnalyticsDashboardFlowContract$Step.SpareChange(((k) event).f116552b), bottom_dialog);
            return null;
        }
        if (event instanceof dod.h) {
            dod.h hVar3 = (dod.h) event;
            h.t2(this, this.f87602t, new AnalyticsDashboardFlowContract$Step.TotalWealth(hVar3.f116547b, hVar3.f116548c), true, null, false, 12);
            return null;
        }
        if (event instanceof b.h) {
            h.t2(this, this.f87602t, AnalyticsDashboardFlowContract$Step.Trips.f87595a, true, null, false, 12);
            return null;
        }
        if (event instanceof b.c) {
            n2(new dlk.k(this, (Continuation) null, 8), new whi.b(6));
            return null;
        }
        if (event instanceof b.C0691b) {
            n2(new a(this, null), new whi.b(6));
            return null;
        }
        if (event instanceof b.d) {
            h.t2(this, this.f87602t, AnalyticsDashboardFlowContract$Step.AddTrip.f87580a, true, null, false, 12);
            return null;
        }
        if (event instanceof dod.i) {
            return C1(new GoalsDestination(new GoalsContract$Account.SavingsAccount(((dod.i) event).f116549b, null)));
        }
        if (event instanceof c) {
            return C1(new JuniorAllowanceDestination(((c) event).f116539b, null, JuniorAllowanceLaunchMode.AsDestination.f76816a, null));
        }
        if (event instanceof b.f) {
            return C1(PaymentsMigrationDestination.f80204b);
        }
        if (!(event instanceof f)) {
            return super.o2(event);
        }
        f fVar = (f) event;
        h.t2(this, this.f87602t, new AnalyticsDashboardFlowContract$Step.CustomPeriodSelect(fVar.f116542b, fVar.f116543c, fVar.d, fVar.e, fVar.f, true, fVar.f116544g), true, null, false, 12);
        return null;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f87602t;
    }
}
