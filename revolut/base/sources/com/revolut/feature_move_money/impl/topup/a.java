package com.revolut.feature_move_money.impl.topup;

import aw0.f4;
import c8i.j0;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import h6i.e0;
import h6i.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ldd.b;
import m6i.j;
import n7i.k0;
import n87.r;
import n8i.g0;
import n8i.h1;
import n8i.k;
import n8i.n;
import n8i.p;
import n8i.q;
import n8i.u;
import n8i.u0;
import n8i.v0;
import n8i.z;
import nii.y0;
import od0.i;
import oki.h;
import vkm.j2;
import vkm.t0;
import w5i.d;
import x7i.e;
import yji.l;
import z5i.c;
import zhm.h0;
import zof.f;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements u {
    public final j A;
    public final f6i.a B;
    public final th5.a C;
    public final c D;
    public final d E;
    public final k0 F;
    public final b G;
    public final g0 H;
    public final z I;
    public final j0 J;
    public final e K;
    public final j8l.d L;
    public final y M;
    public final com.revolut.kompot.navigable.vc.modal.a N;
    public final MoveMoneyTopupScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f97419p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p56.a f97420q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f97421r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n60.b f97422s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o f97423t;
    public final w5i.a u;
    public final e0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v5i.a f97424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v5i.b f97425x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n8i.b f97426y;
    public final f z;

    public a(MoveMoneyTopupScreenContract$InputData inputData, w80.b amountFormatter, p56.a moveMoneyBalancesListInteractorFactory, i pickerBalancesFilterInteractor, n60.b keyboardViewControllerExtension, o moveMoneyAccountProvider, w5i.a allowedBalancePickerGroupsProvider, e0 moveMoneyAmountInteractor, v5i.a clicksControllerExtension, v5i.b footerClicksControllerExtension, n8i.b moveMoneyScheduleDelegate, f transferFeatureScreensProvider, j moveMoneyAmountPreselectedInfoProvider, f6i.a checksExtension, th5.a cryptoOnboardingModelExtension, c footerProvider, d quoteInteractor, k0 statusDialogMapper, b focusRequesterDelegate, g0 topupScreenModelExtension, z topupDataProvider, j0 scheduleDataInteractor, e moveMoneyControllerExtension, h1 stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moveMoneyBalancesListInteractorFactory, "moveMoneyBalancesListInteractorFactory");
        Intrinsics.checkNotNullParameter(pickerBalancesFilterInteractor, "pickerBalancesFilterInteractor");
        Intrinsics.checkNotNullParameter(keyboardViewControllerExtension, "keyboardViewControllerExtension");
        Intrinsics.checkNotNullParameter(moveMoneyAccountProvider, "moveMoneyAccountProvider");
        Intrinsics.checkNotNullParameter(allowedBalancePickerGroupsProvider, "allowedBalancePickerGroupsProvider");
        Intrinsics.checkNotNullParameter(moveMoneyAmountInteractor, "moveMoneyAmountInteractor");
        Intrinsics.checkNotNullParameter(clicksControllerExtension, "clicksControllerExtension");
        Intrinsics.checkNotNullParameter(footerClicksControllerExtension, "footerClicksControllerExtension");
        Intrinsics.checkNotNullParameter(moveMoneyScheduleDelegate, "moveMoneyScheduleDelegate");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(moveMoneyAmountPreselectedInfoProvider, "moveMoneyAmountPreselectedInfoProvider");
        Intrinsics.checkNotNullParameter(checksExtension, "checksExtension");
        Intrinsics.checkNotNullParameter(cryptoOnboardingModelExtension, "cryptoOnboardingModelExtension");
        Intrinsics.checkNotNullParameter(footerProvider, "footerProvider");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(statusDialogMapper, "statusDialogMapper");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(topupScreenModelExtension, "topupScreenModelExtension");
        Intrinsics.checkNotNullParameter(topupDataProvider, "topupDataProvider");
        Intrinsics.checkNotNullParameter(scheduleDataInteractor, "scheduleDataInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyControllerExtension, "moveMoneyControllerExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f97419p = amountFormatter;
        this.f97420q = moveMoneyBalancesListInteractorFactory;
        this.f97421r = pickerBalancesFilterInteractor;
        this.f97422s = keyboardViewControllerExtension;
        this.f97423t = moveMoneyAccountProvider;
        this.u = allowedBalancePickerGroupsProvider;
        this.v = moveMoneyAmountInteractor;
        this.f97424w = clicksControllerExtension;
        this.f97425x = footerClicksControllerExtension;
        this.f97426y = moveMoneyScheduleDelegate;
        this.z = transferFeatureScreensProvider;
        this.A = moveMoneyAmountPreselectedInfoProvider;
        this.B = checksExtension;
        this.C = cryptoOnboardingModelExtension;
        this.D = footerProvider;
        this.E = quoteInteractor;
        this.F = statusDialogMapper;
        this.G = focusRequesterDelegate;
        this.H = topupScreenModelExtension;
        this.I = topupDataProvider;
        this.J = scheduleDataInteractor;
        this.K = moveMoneyControllerExtension;
        this.L = j8l.d.BUY;
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        n8i.a aVarA = moveMoneyScheduleDelegate.a();
        n8i.o oVarC3 = topupScreenModelExtension.c3(null);
        this.M = mra.d.b(this, new q(data, data2, oVarC3 == null ? new n(aVarA.f213399a, false, p.CALENDAR) : oVarC3), stateMapper, null, false, 12);
        this.N = hx7.e.a(this, new n8i.e(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature_move_money.impl.topup.a r6, n8i.k r7, gim.i r8) {
        /*
            com.revolut.feature_move_money.api.model.AccountWrapper r0 = c8g.a.r(r7)
            s6i.e r1 = r7.f213439a
            j8l.a r0 = r0.f97224a
            j8l.a r2 = j8l.a.CREDIT_CARD
            if (r0 != r2) goto L20
            hd.e r0 = r1.d
            r2 = 0
            if (r0 == 0) goto L19
            java.lang.Object r0 = r0.f151343a
            dj0.d r0 = (dj0.d) r0
            long r4 = r0.f115082a
            goto L1a
        L19:
            r4 = r2
        L1a:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            boolean r1 = v13.d.r(r1)
            if (r1 != 0) goto L3c
            if (r0 == 0) goto L2f
            goto L3c
        L2f:
            r0 = 0
            java.lang.Object r6 = r6.K2(r7, r0, r8)
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            if (r6 != r7) goto L39
            return r6
        L39:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L3c:
            java.lang.Object r6 = r6.J2(r7, r8)
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            if (r6 != r7) goto L45
            return r6
        L45:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.topup.a.I2(com.revolut.feature_move_money.impl.topup.a, n8i.k, gim.i):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        b bVar = this.G;
        bVar.f194072c = false;
        bVar.b(new f4("CENTER_AMOUNT_TOPUP_ID", this.o.d));
        N2();
        n5k.c cVar = new n5k.c(28);
        y yVar = this.M;
        Continuation continuation = null;
        l.a1(this, vkm.q.Q(vkm.q.r(new r(7), new t0(yVar.B(cVar), 1)), new mk0.f(continuation, this, 19)), null, null, new v0(this, continuation, 5), 3);
        n1g.p pVar = new n1g.p(vkm.q.r(new r(6), new t0(yVar.B(new n5k.c(26)), 1)), this, 10);
        h0 h0Var = h0.f322473a;
        l.a1(this, rd0.e.d(pVar, h0Var), null, null, new v0(this, continuation, 1), 3);
        l.a1(this, new n1g.p(rd0.e.b(this.f97422s.d), this, 11), null, null, new v0(this, continuation, 2), 3);
        l.a1(this, rd0.e.n(this.I.a(vkm.q.r(new r(8), new t0(yVar.B(new n5k.c(29)), 1))), h0Var), null, null, new v0(this, continuation, 4), 3);
        l.a1(this, rd0.e.d(vkm.q.q(new n1g.p(new t0(yVar.B(new n5k.c(27)), 1), this, 12)), h0Var), null, null, new v0(this, continuation, 3), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(n8i.k r17, gim.c r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            boolean r2 = r0 instanceof n8i.p0
            if (r2 == 0) goto L18
            r2 = r0
            n8i.p0 r2 = (n8i.p0) r2
            int r3 = r2.A
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.A = r3
        L16:
            r7 = r2
            goto L1e
        L18:
            n8i.p0 r2 = new n8i.p0
            r2.<init>(r1, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r7.f213460y
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.A
            r9 = 1
            if (r2 == 0) goto L43
            if (r2 != r9) goto L3b
            long r2 = r7.f213459x
            com.revolut.feature_move_money.api.model.AccountWrapper r4 = r7.f213458w
            com.revolut.feature_move_money.api.model.AccountWrapper r5 = r7.v
            n8i.k r6 = r7.u
            yhm.o.b(r0)
            r10 = r6
            r6 = r0
            r0 = r10
            r10 = r2
            r13 = r4
            r12 = r5
            goto L77
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L43:
            yhm.o.b(r0)
            com.revolut.feature_move_money.api.model.AccountWrapper r2 = c8g.a.r(r17)
            com.revolut.feature_move_money.api.model.AccountWrapper r3 = c8g.a.t(r17)
            dj0.d r0 = c8g.a.m(r17)
            long r4 = r0.f115082a
            dfj.c4 r0 = new dfj.c4
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r6)
            r6 = r0
            r0 = r17
            r7.u = r0
            r7.v = r2
            r7.f213458w = r3
            r7.f213459x = r4
            r7.A = r9
            tji.f r9 = r1.X()
            java.lang.String r10 = "MOVE_MONEY_TOPUP_CTA_BUTTON_TAG"
            java.lang.Object r6 = zh9.u0.b0(r9, r10, r6, r7)
            if (r6 != r8) goto L74
            return r8
        L74:
            r12 = r2
            r13 = r3
            r10 = r4
        L77:
            r9 = r6
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r9 = (com.revolut.shared.feature.market_data.models.domain.models.OrderQuote) r9
            if (r9 == 0) goto L9e
            n8i.r r2 = new n8i.r
            com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState r3 = new com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState
            com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData r0 = r0.f213440b
            com.revolut.feature_move_money.api.model.OrderMode r8 = r1.L2(r0)
            com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo r7 = new com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo
            r15 = 0
            j8l.d r14 = r1.L
            r7.<init>(r8, r9, r10, r12, r13, r14, r15)
            com.revolut.feature_move_money.impl.topup.MoveMoneyTopupScreenContract$InputData r0 = r1.o
            boolean r0 = r0.e
            r4 = 58
            r3.<init>(r7, r0, r4)
            r2.<init>(r3, r9)
            r1.C2(r2)
            goto La1
        L9e:
            r1.O2()
        La1:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.topup.a.J2(n8i.k, gim.c):java.lang.Object");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.N;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(n8i.k r20, com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.topup.a.K2(n8i.k, com.revolut.shared.feature.market_data.models.domain.models.OrderQuote, gim.c):java.lang.Object");
    }

    public final OrderMode L2(TransferScheduleData scheduleData) {
        j0 j0Var = this.J;
        j0Var.getClass();
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        return n1l.b.d(scheduleData, ((l80.f) j0Var.f22203a).f()) ? new OrderMode.Scheduling(scheduleData, null) : new OrderMode.Market(null);
    }

    public final k M2() {
        return (k) zi0.c.I(((q) ((j2) this.M.f22677a).getValue()).f213461a);
    }

    public final void N2() {
        Continuation continuation = null;
        l.a1(this, rd0.e.n(nim.a.u(new n8a.r(this, continuation, 2), vkm.q.q(ngm.n.K(new u0(this, continuation, 0)))), h0.f322473a), null, null, new v0(this, continuation, 0), 3);
    }

    public final Flow O2() {
        return X1(new y0(null, this.F.a(), false, 5));
    }

    @Override // cli.z
    public final g getState() {
        return this.M;
    }
}
