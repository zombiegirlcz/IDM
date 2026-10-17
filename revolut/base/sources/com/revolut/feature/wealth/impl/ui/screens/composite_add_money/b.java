package com.revolut.feature.wealth.impl.ui.screens.composite_add_money;

import ael.q0;
import boh.f;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature.wealth.api.navigation.models.RecurringDepositSchedule;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import ip0.v7;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import m1h.e;
import m1h.g;
import m1h.q;
import oki.h;
import ozg.c;
import rbh.d;
import tb4.t;
import te0.w;
import vkm.j2;
import vkm.v;
import y20.a1;
import ybh.a0;
import ybh.f0;
import ybh.g0;
import ybh.h0;
import ybh.i;
import ybh.j;
import ybh.k0;
import ybh.n;
import ybh.o;
import ybh.p;
import ybh.p0;
import ybh.r0;
import ybh.s;
import ybh.w0;
import ybl.k;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements s {
    public final q A;
    public final fah.b B;
    public final e C;
    public final k D;
    public final zrc.e E;
    public final cch.a F;
    public final cch.b G;
    public final xbh.a H;
    public final c I;
    public final Object J;
    public final y K;
    public final com.revolut.kompot.navigable.vc.modal.a L;
    public boolean M;
    public final CompositeAddMoneyScreenContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f0 f95589p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w80.b f95590q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k0 f95591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r60.b f95592s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t1j.b f95593t;
    public final d u;
    public final mbh.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n1h.b f95594w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m1h.k f95595x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t f95596y;
    public final g z;

    public b(n initialState, CompositeAddMoneyScreenContract$Input input, f0 mapper, w80.b amountFormatter, k0 contributionValidator, r60.b promptViewControllerExtension, t1j.b immediateKeyboardControllerUtil, d pocketPickerExtension, mbh.d currencyExchangeProvider, n1h.b currencyExchangeExtension, m1h.k portfolioInfoProvider, t verifyRecurringDepositEnabled, g disclaimerProvider, q toolbarProvider, fah.b networkConnectionErrorExtension, e parcelHandler, k tradingAccountsInteractor, zrc.e tradingScaInteractor, cch.a checkScaRequiredRequestProvider, cch.b stepProvider, xbh.a amountKeyboardSuggestionsProvider, c preAddMoneyHandler) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(contributionValidator, "contributionValidator");
        Intrinsics.checkNotNullParameter(promptViewControllerExtension, "promptViewControllerExtension");
        Intrinsics.checkNotNullParameter(immediateKeyboardControllerUtil, "immediateKeyboardControllerUtil");
        Intrinsics.checkNotNullParameter(pocketPickerExtension, "pocketPickerExtension");
        Intrinsics.checkNotNullParameter(currencyExchangeProvider, "currencyExchangeProvider");
        Intrinsics.checkNotNullParameter(currencyExchangeExtension, "currencyExchangeExtension");
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(verifyRecurringDepositEnabled, "verifyRecurringDepositEnabled");
        Intrinsics.checkNotNullParameter(disclaimerProvider, "disclaimerProvider");
        Intrinsics.checkNotNullParameter(toolbarProvider, "toolbarProvider");
        Intrinsics.checkNotNullParameter(networkConnectionErrorExtension, "networkConnectionErrorExtension");
        Intrinsics.checkNotNullParameter(parcelHandler, "parcelHandler");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingScaInteractor, "tradingScaInteractor");
        Intrinsics.checkNotNullParameter(checkScaRequiredRequestProvider, "checkScaRequiredRequestProvider");
        Intrinsics.checkNotNullParameter(stepProvider, "stepProvider");
        Intrinsics.checkNotNullParameter(amountKeyboardSuggestionsProvider, "amountKeyboardSuggestionsProvider");
        Intrinsics.checkNotNullParameter(preAddMoneyHandler, "preAddMoneyHandler");
        this.o = input;
        this.f95589p = mapper;
        this.f95590q = amountFormatter;
        this.f95591r = contributionValidator;
        this.f95592s = promptViewControllerExtension;
        this.f95593t = immediateKeyboardControllerUtil;
        this.u = pocketPickerExtension;
        this.v = currencyExchangeProvider;
        this.f95594w = currencyExchangeExtension;
        this.f95595x = portfolioInfoProvider;
        this.f95596y = verifyRecurringDepositEnabled;
        this.z = disclaimerProvider;
        this.A = toolbarProvider;
        this.B = networkConnectionErrorExtension;
        this.C = parcelHandler;
        this.D = tradingAccountsInteractor;
        this.E = tradingScaInteractor;
        this.F = checkScaRequiredRequestProvider;
        this.G = stepProvider;
        this.H = amountKeyboardSuggestionsProvider;
        this.I = preAddMoneyHandler;
        this.J = w.y0(new y99.c(this, 3));
        this.K = mra.d.b(this, initialState, mapper, null, false, 12);
        this.L = hx7.e.a(this, new y8a.g(this, 8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r12 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b r10, dj0.d r11, gim.c r12) {
        /*
            boolean r0 = r12 instanceof ybh.n0
            if (r0 == 0) goto L13
            r0 = r12
            ybh.n0 r0 = (ybh.n0) r0
            int r1 = r0.f312336y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f312336y = r1
            goto L18
        L13:
            ybh.n0 r0 = new ybh.n0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f312334w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f312336y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.revolut.feature.wealth.api.navigation.models.DepositInfo r11 = r0.v
            yhm.o.b(r12)
            goto L80
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            dj0.d r11 = r0.u
            yhm.o.b(r12)
        L39:
            r5 = r11
            goto L4b
        L3b:
            yhm.o.b(r12)
            rbh.d r12 = r10.u
            r0.u = r11
            r0.f312336y = r4
            java.lang.Object r12 = r12.e3(r0)
            if (r12 != r1) goto L39
            goto L7f
        L4b:
            r6 = r12
            com.revolut.retail.trading.core.domain.PocketInfo r6 = (com.revolut.retail.trading.core.domain.PocketInfo) r6
            cli.y r11 = r10.K
            java.lang.Object r11 = r11.f22677a
            vkm.j2 r11 = (vkm.j2) r11
            java.lang.Object r11 = r11.getValue()
            ybh.n r11 = (ybh.n) r11
            com.revolut.feature.wealth.api.navigation.models.RecurringDepositSchedule r11 = r11.f312326g
            if (r11 == 0) goto L6d
            com.revolut.feature.wealth.api.navigation.models.DepositInfo$RecurringDeposit r4 = new com.revolut.feature.wealth.api.navigation.models.DepositInfo$RecurringDeposit
            k4l.c0 r7 = r11.f95324a
            java.time.LocalDate r8 = r11.f95325b
            com.revolut.feature.wealth.impl.ui.screens.composite_add_money.CompositeAddMoneyScreenContract$Input r11 = r10.o
            java.lang.String r9 = r11.f
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = r4
            goto L72
        L6d:
            com.revolut.feature.wealth.api.navigation.models.DepositInfo$OneOffDeposit r11 = new com.revolut.feature.wealth.api.navigation.models.DepositInfo$OneOffDeposit
            r11.<init>(r5, r6)
        L72:
            r12 = 0
            r0.u = r12
            r0.v = r11
            r0.f312336y = r3
            java.lang.Object r12 = r10.J2(r5, r11, r0)
            if (r12 != r1) goto L80
        L7f:
            return r1
        L80:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L90
            ybh.q r12 = new ybh.q
            r12.<init>(r11)
            r10.C2(r12)
        L90:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b.I2(com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b, dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.l
    public final void I1() {
        CompositeAddMoneyScreenContract$Input compositeAddMoneyScreenContract$Input = this.o;
        TransferSubjectId transferSubjectId = compositeAddMoneyScreenContract$Input.f95583a;
        RecurringDepositSchedule recurringDepositSchedule = compositeAddMoneyScreenContract$Input.e;
        TransferSubjectId transferSubjectId2 = compositeAddMoneyScreenContract$Input.f95583a;
        m1h.k kVar = this.f95595x;
        Continuation continuation = null;
        jhi.b bVarG = mo3.a.g(kVar.g(transferSubjectId), null, new y65.n(19), 1);
        y yVar = this.K;
        if (((n) ((j2) yVar.f22677a).getValue()).f312327h == null) {
            l.a1(this, bVarG, null, null, new p0(3, this, continuation), 3);
        }
        l.a1(this, mo3.a.g(kVar.c(transferSubjectId2), null, new y65.n(20), 1), null, null, new w0(0, this, continuation), 3);
        l.a1(this, mo3.a.g(kVar.b(transferSubjectId2), null, new y65.n(21), 1), null, null, new w0(1, this, continuation), 3);
        d dVar = this.u;
        l.a1(this, dVar.c3(), null, null, new p0(5, this, continuation), 3);
        wkm.l lVarQ = vkm.q.Q(yh5.b.d(t1.h(v7.w(yVar.B(new a0(5))), 300L, new a0(6)), bVarG), new r0(0, this, continuation));
        l.a1(this, lVarQ, null, null, new p0(6, this, continuation), 3);
        l.a1(this, vkm.q.Q(lVarQ, new r0(1, this, continuation)), null, null, new p0(7, this, continuation), 3);
        if (recurringDepositSchedule != null) {
            H2(yVar, new h0(recurringDepositSchedule, 1));
        }
        if (compositeAddMoneyScreenContract$Input.f95587h == j0h.a.REQUIRE_RECURRING_DEPOSIT && recurringDepositSchedule == null) {
            l2(new y7i.h(this, continuation, 5), new yi5.b(26));
        }
        y5j.e eVar = new y5j.e((MutableStateFlow) this.J.getValue(), 6);
        Flow flowG = kVar.g(transferSubjectId2);
        y5j.e eVar2 = new y5j.e(dVar.c3(), 7);
        String f95657a = transferSubjectId2.getF95657a();
        k kVar2 = this.D;
        l.a1(this, f.e(nim.a.u(new xsd.a(2, 6, continuation), u0.m(u0.i(eVar, flowG, eVar2), ((q0) kVar2).o(f95657a, w4l.h.f294642c))), new g0(this, 2)), null, null, new p0(1, this, continuation), 3);
        l.a1(this, this.A.a(transferSubjectId2), null, null, new p0(2, this, continuation), 3);
        l.a1(this, ((q0) kVar2).o(transferSubjectId2.getF95657a(), w4l.h.f294642c), null, null, new p0(4, this, continuation), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(dj0.d r18, com.revolut.feature.wealth.api.navigation.models.DepositInfo r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b.J2(dj0.d, com.revolut.feature.wealth.api.navigation.models.DepositInfo, gim.c):java.lang.Object");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.L;
    }

    @Override // yji.l
    public final void K1() {
        e0m.e.c(((ViewController) this.f95593t.f267380b).m2());
    }

    @Override // yji.l
    public final void T1(long j2) {
        boolean z = this.M;
        this.M = true;
        y yVar = this.K;
        if (z && !((n) ((j2) yVar.f22677a).getValue()).f312329l) {
            H2(yVar, new a0(7));
        }
        Continuation continuation = null;
        l.b1(this, vkm.q.q(new wyd.f(yh5.b.d(new v(this.f95595x.a(this.o.f95583a), new wda.l(2, 14, continuation)), yVar.B(new a0(3))), this, 23)), null, new p0(0, this, continuation), 3);
    }

    @Override // od0.f
    public final void accept(Object obj2) {
        ybh.l action = (ybh.l) obj2;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof j) {
            C2(p.f312339a);
            return;
        }
        boolean z = action instanceof ybh.a;
        y yVar = this.K;
        if (z) {
            H2(yVar, new y7k.g0(this, ((ybh.a) action).f312289a, 8));
            return;
        }
        Continuation continuation = null;
        if (action instanceof ybh.e) {
            dj0.d dVar = ((n) ((j2) yVar.f22677a).getValue()).f312323a;
            if (dVar == null) {
                return;
            }
            l2(new a1(this, dVar, continuation, 20), new g0(this, 0));
            return;
        }
        if (action instanceof ybh.d) {
            n2(new a1(this, ((n) ((j2) yVar.f22677a).getValue()).f312326g, continuation, 19), new whi.b(6));
            return;
        }
        boolean z3 = action instanceof ybh.c;
        r60.b bVar = this.f95592s;
        t1j.b bVar2 = this.f95593t;
        if (z3) {
            usb.j jVar = ((ybh.c) action).f312296a;
            e0m.e.c(((ViewController) bVar2.f267380b).m2());
            dj0.d missingAmount = pyd.c.H(jVar.f282877a, jVar.f282878b);
            f0 f0Var = this.f95589p;
            f0Var.getClass();
            Intrinsics.checkNotNullParameter(missingAmount, "missingAmount");
            iah.k kVar = f0Var.e;
            Intrinsics.checkNotNullParameter(missingAmount, "missingAmount");
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_add_money_prompt_not_enough_money_title, null, null, 14);
            Clause clause = null;
            Clause clause2 = null;
            r60.d dVar2 = (r60.d) bVar;
            dVar2.R(new rp0.u0(textLocalisedClause, new TextLocalisedClause(((jte.d) kVar.f160035a).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? R$string.wealth_robo_add_money_strategies_prompt_not_enough_money_description : R$string.wealth_robo_add_money_prompt_not_enough_money_description, null, null, 14), clause, new rp0.r0(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D156", null, null, null, 30)), clause2, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(R$string.wealth_robo_add_money_prompt_not_enough_money_cta, null, null, 14), null, null, null, null, null, null, null, new o(missingAmount), null, null, 33029588));
            return;
        }
        if (action instanceof ybh.h) {
            this.f95594w.Z2(((ybh.h) action).f312311a, c4i.a.ROBO_TOPUP, this.o.f95584b);
            return;
        }
        if (action instanceof ybh.b) {
            H2(yVar, new a0(8));
            e0m.e.c(((ViewController) bVar2.f267380b).m2());
            this.u.f3();
            return;
        }
        if (action instanceof ybh.k) {
            dj0.d dVar3 = ((ybh.k) action).f312317a;
            ((r60.d) bVar).Q();
            C1(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, dVar3, null, null, 30)));
        } else {
            if (action instanceof i) {
                if (((i) action).f312314a) {
                    H2(yVar, new a0(9));
                    return;
                } else {
                    H2(yVar, new a0(1));
                    return;
                }
            }
            if (action instanceof ybh.f) {
                this.C.invoke(((ybh.f) action).f312303a);
            } else {
                if (!action.equals(ybh.g.f312308a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((n) ((j2) yVar.f22677a).getValue()).f312329l) {
                    return;
                }
                H2(yVar, new a0(2));
            }
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.K;
    }
}
