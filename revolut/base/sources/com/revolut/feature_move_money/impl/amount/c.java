package com.revolut.feature_move_money.impl.amount;

import ahe.y0;
import akl.s1;
import au6.a3;
import aw0.f4;
import b4b.z;
import b4g.f0;
import b6i.a0;
import b6i.g0;
import b6i.l;
import b6i.n;
import b6i.w;
import c8i.j0;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.UnsettledDialogInputData;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$InputData;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$ModalStep;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$OutputData;
import com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.shared.feature.move_money.api.model.MoveMoneyRecurringPayment;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import h6i.e0;
import h6i.k0;
import h6i.o;
import h6i.s;
import ip0.v7;
import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m6i.j;
import od0.i;
import oki.h;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;
import q6i.t;
import q6i.v;
import qua.u;
import r10.r;
import vkm.j2;
import vkm.q;
import vkm.t0;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends h implements n {

    @NotNull
    public static final w Companion = new w();
    public final zof.f A;
    public final j B;
    public final mdd.b C;
    public final f6i.a D;
    public final ae5.a E;
    public final v5i.a F;
    public final v5i.b G;
    public final e H;
    public final z5i.c I;
    public final th5.a J;
    public final r K;
    public final d L;
    public final n7i.e M;
    public final j0 N;
    public final k0 O;
    public final b9k.f P;
    public final f Q;
    public final r10.a R;
    public final c6i.b S;
    public final t6i.b T;
    public final q7i.a U;
    public final c6i.c V;
    public final gte.a W;
    public final com.revolut.kompot.navigable.vc.modal.a X;
    public final y Y;
    public final MoveAmountScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f97286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f97287q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e0 f97288r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w80.b f97289s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s f97290t;
    public final o u;
    public final w5i.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n7i.k0 f97291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n60.a f97292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ldd.b f97293y;
    public final w5i.a z;

    public c(MoveAmountScreenContract$InputData inputData, i pickerBalancesFilterInteractor, i moveMoneyPairFilterInteractor, e0 amountInteractor, w80.b amountFormatter, s accountProvider, o moveMoneyAccountProvider, w5i.d quoteInteractor, n7i.k0 statusDialogMapper, n60.a keyboardExtension, ldd.b focusRequesterDelegate, w5i.a allowedBalancePickerGroupsProvider, zof.f transferFeatureScreensProvider, j moveMoneyAmountPreselectedInfoProvider, mdd.b inputChangeRequestDelegate, f6i.a checksExtension, ae5.a cryptoConvertDialogDisclaimerExtension, v5i.a clicksControllerExtension, v5i.b footerClicksControllerExtension, e optionsDelegate, z5i.c footerProvider, th5.a cryptoOnboardingModelExtension, r moveMoneyBalancesInteractorFactory, d moveMoneyExcludedPocketsProvider, n7i.e excludedBalanceProvider, j0 scheduleDataInteractor, k0 moveMoneyBalanceBreakdownDescriptorProvider, b9k.f newCurrenciesInteractor, cli.n stateMapper, f revXAccountHandler, r10.a balanceGroupsChecker, c6i.b accountIsSameCheckDelegate, t6i.b orderAutomationsDialogInputDataProvider, q7i.a noteDelegate, c6i.c nextButtonDelegate, gte.a featureToggleInteractor) {
        b6i.j jVar;
        OrderMode scheduling;
        jli.c cVarK;
        j8l.d dVarValueOf;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pickerBalancesFilterInteractor, "pickerBalancesFilterInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyPairFilterInteractor, "moveMoneyPairFilterInteractor");
        Intrinsics.checkNotNullParameter(amountInteractor, "amountInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(moveMoneyAccountProvider, "moveMoneyAccountProvider");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(statusDialogMapper, "statusDialogMapper");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(allowedBalancePickerGroupsProvider, "allowedBalancePickerGroupsProvider");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(moveMoneyAmountPreselectedInfoProvider, "moveMoneyAmountPreselectedInfoProvider");
        Intrinsics.checkNotNullParameter(inputChangeRequestDelegate, "inputChangeRequestDelegate");
        Intrinsics.checkNotNullParameter(checksExtension, "checksExtension");
        Intrinsics.checkNotNullParameter(cryptoConvertDialogDisclaimerExtension, "cryptoConvertDialogDisclaimerExtension");
        Intrinsics.checkNotNullParameter(clicksControllerExtension, "clicksControllerExtension");
        Intrinsics.checkNotNullParameter(footerClicksControllerExtension, "footerClicksControllerExtension");
        Intrinsics.checkNotNullParameter(optionsDelegate, "optionsDelegate");
        Intrinsics.checkNotNullParameter(footerProvider, "footerProvider");
        Intrinsics.checkNotNullParameter(cryptoOnboardingModelExtension, "cryptoOnboardingModelExtension");
        Intrinsics.checkNotNullParameter(moveMoneyBalancesInteractorFactory, "moveMoneyBalancesInteractorFactory");
        Intrinsics.checkNotNullParameter(moveMoneyExcludedPocketsProvider, "moveMoneyExcludedPocketsProvider");
        Intrinsics.checkNotNullParameter(excludedBalanceProvider, "excludedBalanceProvider");
        Intrinsics.checkNotNullParameter(scheduleDataInteractor, "scheduleDataInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyBalanceBreakdownDescriptorProvider, "moveMoneyBalanceBreakdownDescriptorProvider");
        Intrinsics.checkNotNullParameter(newCurrenciesInteractor, "newCurrenciesInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(revXAccountHandler, "revXAccountHandler");
        Intrinsics.checkNotNullParameter(balanceGroupsChecker, "balanceGroupsChecker");
        Intrinsics.checkNotNullParameter(accountIsSameCheckDelegate, "accountIsSameCheckDelegate");
        Intrinsics.checkNotNullParameter(orderAutomationsDialogInputDataProvider, "orderAutomationsDialogInputDataProvider");
        Intrinsics.checkNotNullParameter(noteDelegate, "noteDelegate");
        Intrinsics.checkNotNullParameter(nextButtonDelegate, "nextButtonDelegate");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f97286p = pickerBalancesFilterInteractor;
        this.f97287q = moveMoneyPairFilterInteractor;
        this.f97288r = amountInteractor;
        this.f97289s = amountFormatter;
        this.f97290t = accountProvider;
        this.u = moveMoneyAccountProvider;
        this.v = quoteInteractor;
        this.f97291w = statusDialogMapper;
        this.f97292x = keyboardExtension;
        this.f97293y = focusRequesterDelegate;
        this.z = allowedBalancePickerGroupsProvider;
        this.A = transferFeatureScreensProvider;
        this.B = moveMoneyAmountPreselectedInfoProvider;
        this.C = inputChangeRequestDelegate;
        this.D = checksExtension;
        this.E = cryptoConvertDialogDisclaimerExtension;
        this.F = clicksControllerExtension;
        this.G = footerClicksControllerExtension;
        this.H = optionsDelegate;
        this.I = footerProvider;
        this.J = cryptoOnboardingModelExtension;
        this.K = moveMoneyBalancesInteractorFactory;
        this.L = moveMoneyExcludedPocketsProvider;
        this.M = excludedBalanceProvider;
        this.N = scheduleDataInteractor;
        this.O = moveMoneyBalanceBreakdownDescriptorProvider;
        this.P = newCurrenciesInteractor;
        this.Q = revXAccountHandler;
        this.R = balanceGroupsChecker;
        this.S = accountIsSameCheckDelegate;
        this.T = orderAutomationsDialogInputDataProvider;
        this.U = noteDelegate;
        this.V = nextButtonDelegate;
        this.W = featureToggleInteractor;
        this.X = hx7.e.a(this, new av8.n(this, 23));
        Action action = moveMoneyAmountPreselectedInfoProvider.f203172l;
        if ((action instanceof Action.OpenBalanceAutomation) || (action instanceof Action.MoveMoney) || (action instanceof Action.Add) || (action instanceof Action.Withdraw) || (action instanceof Action.Deposit) || (action instanceof Action.Topup) || (action instanceof Action.MoveWithFixedAccount)) {
            jVar = b6i.j.BOTTOM;
        } else if (action instanceof Action.AddNewScheduledPayment) {
            jVar = ((Action.AddNewScheduledPayment) action).f104812b != null ? b6i.j.BOTTOM : b6i.j.TOP;
        } else if (action instanceof Action.EditScheduledPayment) {
            Action.EditScheduledPayment editScheduledPayment = (Action.EditScheduledPayment) action;
            if (editScheduledPayment.f104816b != null) {
                jVar = b6i.j.BOTTOM;
            } else {
                String str = editScheduledPayment.f104815a.e;
                int i = m6i.e.f203138a[((str == null || (dVarValueOf = j8l.d.valueOf(str)) == null) ? j8l.d.SELL : dVarValueOf).ordinal()];
                if (i == 1) {
                    jVar = b6i.j.BOTTOM;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar = b6i.j.TOP;
                }
            }
        } else {
            if (!(action instanceof Action.MoveMoneyWithAccountPair)) {
                if (!(action instanceof Action.EditScheduledAutomation)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Not relevant for automation");
            }
            int i2 = m6i.e.f203139b[((Action.MoveMoneyWithAccountPair) action).d.ordinal()];
            if (i2 == 1 || i2 == 2) {
                jVar = b6i.j.TOP;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                jVar = b6i.j.BOTTOM;
            }
        }
        l lVar = l.TOP_TO_BOTTOM;
        MoveAmountScreenContract$InputData moveAmountScreenContract$InputData = optionsDelegate.f97294a;
        if ((moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.MoveMoneyWithAccountPair) || (moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.Add) || (moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.MoveWithFixedAccount) || (moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.MoveMoney) || (moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.Withdraw) || (moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.Deposit)) {
            scheduling = null;
        } else if (moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.AddNewScheduledPayment) {
            scheduling = new OrderMode.Scheduling(((MoveAmountScreenContract$InputData.AddNewScheduledPayment) moveAmountScreenContract$InputData).f97240b, null);
        } else {
            if (!(moveAmountScreenContract$InputData instanceof MoveAmountScreenContract$InputData.EditScheduledPayment)) {
                throw new NoWhenBranchMatchedException();
            }
            MoveMoneyRecurringPayment moveMoneyRecurringPayment = ((MoveAmountScreenContract$InputData.EditScheduledPayment) moveAmountScreenContract$InputData).f97243a;
            long millis = u.e(moveMoneyRecurringPayment, ((l80.f) optionsDelegate.f97296c).g()).getMillis();
            Period period = moveMoneyRecurringPayment.f104804a.f160151b;
            scheduling = new OrderMode.Scheduling(new TransferScheduleData(millis, (period == null || (cVarK = jli.e.k(period)) == null) ? jli.c.PERIOD_SELECTION_NONE : cVarK, 4), moveMoneyRecurringPayment.i);
        }
        this.Y = mra.d.b(this, new b6i.h(null, jVar, lVar, new z5i.a(new Data(null, null, true, 3, null), null), false, false, b6i.b.f12760a, scheduling == null ? new OrderMode.Market(null) : scheduling, 0), stateMapper, null, false, 12);
    }

    public static final void I2(c cVar, s6i.e eVar) {
        Pair pairS2 = S2(cVar.Q2().f12785c, eVar);
        AccountWrapper accountWrapper = (AccountWrapper) pairS2.f186385a;
        AccountWrapper accountWrapper2 = (AccountWrapper) pairS2.f186386b;
        OrderMode orderMode = cVar.Q2().f12787h;
        long jT2 = cVar.T2(eVar);
        j8l.d dVarP2 = cVar.P2(cVar.Q2().f12784b);
        s6i.e eVar2 = cVar.Q2().f12783a;
        cVar.C2(new MoveAmountScreenContract$OutputData.ExecuteMoveMoney(new MoveMoneyOrderInfo(orderMode, eVar2 != null ? eVar2.e : null, jT2, accountWrapper, accountWrapper2, dVarP2, null), "MOVE_MONEY_AMOUNT_CTA_BUTTON_TAG"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [zhm.h0] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.HashSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature_move_money.impl.amount.c r19, b6i.j r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.amount.c.J2(com.revolut.feature_move_money.impl.amount.c, b6i.j, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature_move_money.impl.amount.c r7, k1j.a r8, b6i.j r9, java.lang.String r10, s6i.e r11, gim.c r12) {
        /*
            boolean r0 = r12 instanceof b6i.f0
            if (r0 == 0) goto L14
            r0 = r12
            b6i.f0 r0 = (b6i.f0) r0
            int r1 = r0.f12781w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f12781w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            b6i.f0 r0 = new b6i.f0
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f12781w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r12)
            goto L45
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r12)
            com.revolut.feature_move_money.impl.amount.f r1 = r7.Q
            if (r11 == 0) goto L6b
            r6.f12781w = r2
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r12 = r1.a(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L45
            return r0
        L45:
            r1 = r12
            s6i.e r1 = (s6i.e) r1
            b6i.h r8 = r7.Q2()
            b6i.l r8 = r8.f12785c
            kotlin.Pair r8 = S2(r8, r1)
            java.lang.Object r9 = r8.f186385a
            r3 = r9
            com.revolut.feature_move_money.api.model.AccountWrapper r3 = (com.revolut.feature_move_money.api.model.AccountWrapper) r3
            java.lang.Object r8 = r8.f186386b
            r4 = r8
            com.revolut.feature_move_money.api.model.AccountWrapper r4 = (com.revolut.feature_move_money.api.model.AccountWrapper) r4
            cli.y r8 = r7.Y
            b6i.u r0 = new b6i.u
            r5 = 0
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r2.H2(r8, r0)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L6b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Required value was null."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.amount.c.K2(com.revolut.feature_move_money.impl.amount.c, k1j.a, b6i.j, java.lang.String, s6i.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L2(com.revolut.feature_move_money.impl.amount.c r7, gim.c r8) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.amount.c.L2(com.revolut.feature_move_money.impl.amount.c, gim.c):java.lang.Object");
    }

    public static Pair S2(l lVar, s6i.e eVar) {
        int i = a0.f12757c[lVar.ordinal()];
        if (i == 1) {
            return new Pair(eVar.f260362a.f302980b, eVar.f260363b.f302980b);
        }
        if (i == 2) {
            return new Pair(eVar.f260363b.f302980b, eVar.f260362a.f302980b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final void I1() {
        ldd.b bVar = this.f97293y;
        bVar.f194072c = false;
        bVar.b(new f4(c8g.c.h(Q2().f12784b), true));
        String listId = c8g.c.h(Q2().f12784b);
        mdd.b bVar2 = this.C;
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        bVar2.f204554a = listId;
        Continuation continuation = null;
        l2(new g0(this, continuation, 0), new b6i.s(this, 2));
        f0 f0Var = new f0(11);
        y yVar = this.Y;
        yji.l.a1(this, new a35.d(yVar.B(f0Var), 28), null, null, new av7.l(this, continuation, 15), 3);
        t0 t0Var = new t0(yVar.B(new f0(14)), 1);
        t0 t0Var2 = new t0(yVar.B(new f0(this)), 1);
        t0 t0Var3 = new t0(yVar.B(new f0(13)), 1);
        Flow flowB = yVar.B(new f0(18));
        Flow flowB2 = yVar.B(new f0(17));
        yji.l.a1(this, q.Q(q.q(yh5.b.d(t0Var, t0Var2)), new y0(continuation, this, 2)), null, null, new b6i.k0(this, continuation, 0), 3);
        yji.l.a1(this, v7.w(yVar.B(new f0(12))), null, null, new b6i.k0(this, continuation, 1), 3);
        yji.l.a1(this, q.Q(q.q(yh5.b.e(t0Var3, flowB, flowB2)), new a3(continuation, this, 11)), null, null, new b6i.k0(this, continuation, 2), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.X;
    }

    public final Pair M2() {
        Pair pair;
        l lVar = Q2().f12785c;
        s6i.e eVar = Q2().f12783a;
        if (eVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Pair pairS2 = S2(lVar, eVar);
        AccountWrapper accountWrapper = (AccountWrapper) pairS2.f186385a;
        AccountWrapper accountWrapper2 = (AccountWrapper) pairS2.f186386b;
        j8l.d dVarP2 = P2(Q2().f12784b);
        int i = a0.f12755a[dVarP2.ordinal()];
        if (i == 1) {
            pair = new Pair(accountWrapper2.getCurrency(), accountWrapper.getCurrency());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(accountWrapper.getCurrency(), accountWrapper2.getCurrency());
        }
        xi0.b bVar = (xi0.b) pair.f186385a;
        xi0.b bVar2 = (xi0.b) pair.f186386b;
        OrderMode orderMode = Q2().f12787h;
        if (orderMode instanceof OrderMode.Threshold) {
            if (((OrderMode.Threshold) orderMode).d != dVarP2) {
                orderMode = null;
            }
        } else if (!(orderMode instanceof OrderMode.Market) && !(orderMode instanceof OrderMode.Scheduling) && !(orderMode instanceof OrderMode.Automation)) {
            throw new NoWhenBranchMatchedException();
        }
        return new Pair(new MoveAmountScreenContract$OrderContext(dVarP2, bVar, bVar2), orderMode);
    }

    public final void N2() {
        this.f97293y.b(new f4(c8g.c.h(Q2().f12784b), false));
    }

    public final x5i.a O2(b6i.j jVar) {
        s6i.e eVar = Q2().f12783a;
        if (eVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i = a0.e[jVar.ordinal()];
        if (i == 1) {
            return eVar.f260362a;
        }
        if (i == 2) {
            return eVar.f260363b;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r3 == b6i.j.TOP) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        return j8l.d.SELL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        return j8l.d.BUY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r3 == b6i.j.BOTTOM) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j8l.d P2(b6i.j r3) {
        /*
            r2 = this;
            b6i.h r0 = r2.Q2()
            b6i.l r0 = r0.f12785c
            int[] r1 = b6i.a0.f12757c
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L1f
            r1 = 2
            if (r0 != r1) goto L19
            b6i.j r0 = b6i.j.BOTTOM
            if (r3 != r0) goto L26
            goto L23
        L19:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L1f:
            b6i.j r0 = b6i.j.TOP
            if (r3 != r0) goto L26
        L23:
            j8l.d r3 = j8l.d.SELL
            return r3
        L26:
            j8l.d r3 = j8l.d.BUY
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.amount.c.P2(b6i.j):j8l.d");
    }

    public final b6i.h Q2() {
        return (b6i.h) ((j2) this.Y.f22677a).getValue();
    }

    public final x5i.d R2(b6i.j jVar) {
        int i = a0.f12757c[Q2().f12785c.ordinal()];
        if (i == 1) {
            return jVar == b6i.j.TOP ? x5i.d.SOURCE : x5i.d.TARGET;
        }
        if (i == 2) {
            return jVar == b6i.j.BOTTOM ? x5i.d.SOURCE : x5i.d.TARGET;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final void T1(long j2) {
        H2(this.Y, new f0(19));
    }

    public final long T2(s6i.e eVar) {
        int i = a0.e[Q2().f12784b.ordinal()];
        if (i == 1) {
            return eVar.f260362a.f302979a.f115082a;
        }
        if (i == 2) {
            return eVar.f260363b.f302979a.f115082a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void U2(v reason, b6i.j position) {
        s6i.e eVarA;
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(position, "position");
        boolean z = reason instanceof q6i.s;
        Continuation continuation = null;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.X;
        if (z) {
            AccountSource accountSource = ((q6i.s) reason).f242635a;
            if (((jte.d) this.W).c(FeatureWealthApi$Toggles.InvestUnsettledOrdersImprovements.f95163c) && (accountSource instanceof AccountSource.InvestCashHolding)) {
                h.v2(aVar, new MoveAmountScreenContract$ModalStep.UnsettledDialog(new UnsettledDialogInputData(((AccountSource.InvestCashHolding) accountSource).f97199b, pih.j.AvailableToWithdraw)), bottom_dialog);
                return;
            } else {
                n2(new av7.l(this, accountSource, continuation, 14), new whi.b(6));
                return;
            }
        }
        if (!(reason instanceof t)) {
            if (!(reason instanceof q6i.u)) {
                throw new NoWhenBranchMatchedException();
            }
            h.v2(aVar, new MoveAmountScreenContract$ModalStep.TaaInvestAllowanceDialog(((q6i.u) reason).f242637a), bottom_dialog);
            return;
        }
        s6i.e eVar = Q2().f12783a;
        if (eVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i = a0.e[position.ordinal()];
        if (i == 1) {
            x5i.a aVar2 = eVar.f260362a;
            eVarA = s6i.e.a(eVar, x5i.a.a(aVar2, aVar2.f302980b.getBalance(), null, 14), null, 30);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            x5i.a aVar3 = eVar.f260363b;
            eVarA = s6i.e.a(eVar, null, x5i.a.a(aVar3, aVar3.f302980b.getBalance(), null, 14), 29);
        }
        this.f97293y.b(new f4(c8g.c.h(position), true));
        String listId = c8g.c.h(position);
        mdd.b bVar = this.C;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        bVar.f204554a = listId;
        H2(this.Y, new b58.f(eVarA, position, 8));
    }

    public final void V2(b6i.j newInputPosition) {
        Intrinsics.checkNotNullParameter(newInputPosition, "newInputPosition");
        this.f97293y.b(new f4(c8g.c.h(newInputPosition), true));
        H2(this.Y, new z(newInputPosition, 17));
    }

    public final void W2(b6i.j jVar) {
        AccountWrapper accountWrapper;
        s6i.e eVar = Q2().f12783a;
        if (eVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i = a0.e[jVar.ordinal()];
        if (i == 1) {
            accountWrapper = eVar.f260363b.f302980b;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            accountWrapper = eVar.f260362a.f302980b;
        }
        l2(new s1(this, jVar, accountWrapper, (Continuation) null, 26), new yi5.b(26));
    }

    public final void X2(j8l.d dVar, BigDecimal bigDecimal, x5i.l lVar, xi0.b bVar, xi0.b bVar2) {
        Pair pair;
        int i = a0.f12755a[dVar.ordinal()];
        if (i == 1) {
            pair = new Pair(bVar2, bVar);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(bVar, bVar2);
        }
        H2(this.Y, new a5b.a((Object) lVar, pair.f186385a, (Serializable) pair.f186386b, (Object) dVar, (Object) bigDecimal, 2));
    }

    @Override // cli.z
    public final g getState() {
        return this.Y;
    }
}
