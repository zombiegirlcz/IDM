package com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details;

import boh.f;
import cli.g;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig;
import com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.RecurringDepositDetailsViewControllerContract$ModalStep;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import hpc.c;
import hx7.e;
import ip0.tm0;
import ip0.um0;
import k4l.d0;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import rbh.r;
import rp0.t;
import t1j.b;
import tcg.a0;
import tch.b0;
import tch.c0;
import tch.f0;
import tch.h0;
import tch.p;
import tch.q;
import tch.s;
import tch.v;
import tch.w;
import tch.x;
import tch.z;
import yhm.j;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements p {
    public final s o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f95639p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f95640q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f95641r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1h.b f95642s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RecurringDepositDetailsViewControllerContract$Input f95643t;
    public final r u;
    public final tch.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f95644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f95645x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Lazy f95646y;

    public a(q initialState, s mapper, c portfolioInfoProvider, j60.a bottomExpandableDialogControllerExtension, b portfolioRecurringOrdersInteractor, h1h.b transactionsWidgetControllerModelExtension, RecurringDepositDetailsViewControllerContract$Input input, r pocketPickerProvider, tch.b bottomSheetMapper) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(portfolioRecurringOrdersInteractor, "portfolioRecurringOrdersInteractor");
        Intrinsics.checkNotNullParameter(transactionsWidgetControllerModelExtension, "transactionsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(pocketPickerProvider, "pocketPickerProvider");
        Intrinsics.checkNotNullParameter(bottomSheetMapper, "bottomSheetMapper");
        this.o = mapper;
        this.f95639p = portfolioInfoProvider;
        this.f95640q = bottomExpandableDialogControllerExtension;
        this.f95641r = portfolioRecurringOrdersInteractor;
        this.f95642s = transactionsWidgetControllerModelExtension;
        this.f95643t = input;
        this.u = pocketPickerProvider;
        this.v = bottomSheetMapper;
        this.f95644w = d.b(this, initialState, mapper, null, false, 12);
        this.f95645x = e.a(this, new ta8.a(this, 8));
        this.f95646y = j.b(new t73.h(22));
    }

    @Override // yji.l
    public final void I1() {
        RecurringDepositDetailsViewControllerContract$Input recurringDepositDetailsViewControllerContract$Input = this.f95643t;
        efm.r rVarW = nim.a.w(b.m(this.f95641r, recurringDepositDetailsViewControllerContract$Input.f95636a), new a0(8));
        l.a1(this, rd0.e.b(rVarW), null, null, new h0(this, null, 0), 3);
        l.a1(this, this.f95642s.d3(c6d.b.i(rd0.e.b(rVarW), new f0(this, 0)), false), null, null, new h0(this, null, 1), 3);
        l.a1(this, f.e(rd0.e.b(rVarW), new f0(this, 1)), null, null, new h0(this, null, 2), 3);
        String portfolioId = recurringDepositDetailsViewControllerContract$Input.f95636a;
        c cVar = this.f95639p;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        l.a1(this, nim.a.v(glc.a.a(cVar.f154522a, portfolioId), new hp3.r(22)), null, null, new h0(this, null, 3), 3);
    }

    public final void I2(b0 parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (parcel instanceof tch.a0) {
            C1(new BridgeDestination(new FeatureCommand(new AddMoneyFeatureConfig.EditRecurringDeposit(WealthAccountType.ROBO, ((tch.a0) parcel).f269814a))));
            return;
        }
        boolean z = parcel instanceof w;
        Continuation continuation = null;
        j60.a aVar = this.f95640q;
        if (z) {
            PortfolioRecurringOrder recurringOrder = ((w) parcel).f269849a;
            ((tch.j) this.o).getClass();
            Intrinsics.checkNotNullParameter(recurringOrder, "recurringOrder");
            aVar.x(new rp0.y(u.c(new um0("LIST_ID_DELETE_CONFIRMATION_DIALOG_ACTIONS", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.wealth_robo_recurring_transfer_action_delete_dialog_cancel, null, null, 14), true, null, null, 48), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.wealth_robo_recurring_transfer_action_delete_dialog_delete, null, null, 14), true, null, null, 48), (Object) new c0(new tch.y(recurringOrder)), (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new t(new TextLocalisedClause(R$string.wealth_robo_recurring_transfer_action_delete_dialog_title, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_recurring_transfer_action_delete_dialog_subtitle, null, null, 14), null, 28), null, null, null, null, 1020));
            return;
        }
        if (parcel instanceof v) {
            h.v2(this.f95645x, new RecurringDepositDetailsViewControllerContract$ModalStep.DeactivationDialog(((v) parcel).f269848a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        if (parcel instanceof tch.u) {
            PortfolioRecurringOrder portfolioRecurringOrder = ((tch.u) parcel).f269847a;
            d0 d0Var = d0.ACTIVE;
            l2(new sma.f(this, portfolioRecurringOrder, d0Var, continuation, 16), new f0(this, 2));
            return;
        }
        if (!(parcel instanceof z)) {
            throw new NoWhenBranchMatchedException();
        }
        z zVar = (z) parcel;
        if (zVar instanceof tch.y) {
            j60.a.v(aVar, false, new sw6.a(this, parcel, 15), 1);
        } else {
            if (!(zVar instanceof x)) {
                throw new NoWhenBranchMatchedException();
            }
            j60.a.v(aVar, false, null, 3);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f95645x;
    }

    @Override // cli.z
    public final g getState() {
        return this.f95644w;
    }
}
