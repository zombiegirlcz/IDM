package com.revolut.feature_move_money.impl.automation.screen;

import bw4.s;
import c42.j;
import c7i.e0;
import c7i.i0;
import c7i.j0;
import c7i.k0;
import c7i.o;
import c7i.p;
import c7i.p0;
import c7i.r;
import c7i.u;
import c7i.x;
import c7i.y;
import c7i.z;
import ch.qos.logback.core.net.SyslogConstants;
import cli.n;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode;
import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$ExtraConfiguration;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import h7i.m;
import i7i.g;
import ip0.v7;
import k7i.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kpj.f;
import l7i.e;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import q6i.g0;
import vkm.j2;
import vkm.q;
import vkm.t0;
import yji.l;
import zhm.f0;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends h implements u {

    @NotNull
    public static final y Companion = new y();
    public final g0 A;
    public final v5i.b B;
    public final com.revolut.kompot.navigable.vc.modal.a C;
    public final cli.y D;
    public final MoveMoneyAutomationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f97336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z6i.c f97337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c7i.b f97338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zq.a f97339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e7i.b f97340t;
    public final f u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g f97341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i f97342x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n60.a f97343y;
    public final p0 z;

    public c(n stateMapper, MoveMoneyAutomationScreenContract$InputData inputData, w80.b amountFormatter, z6i.c automationInteractor, c7i.b balancePickerInputDataProvider, zq.a balanceResolver, e7i.b limitInputDataProvider, f errorValidator, e confirmationValidator, g preselectedInfoProvider, i recurringPaymentProvider, n60.a keyboardExtension, p0 wealthProtectionConfirmationBottomSheetFactory, g0 disclaimerProvider, v5i.b footerClicksControllerExtension) {
        long j2;
        WalletAutomation.Limit d;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(automationInteractor, "automationInteractor");
        Intrinsics.checkNotNullParameter(balancePickerInputDataProvider, "balancePickerInputDataProvider");
        Intrinsics.checkNotNullParameter(balanceResolver, "balanceResolver");
        Intrinsics.checkNotNullParameter(limitInputDataProvider, "limitInputDataProvider");
        Intrinsics.checkNotNullParameter(errorValidator, "errorValidator");
        Intrinsics.checkNotNullParameter(confirmationValidator, "confirmationValidator");
        Intrinsics.checkNotNullParameter(preselectedInfoProvider, "preselectedInfoProvider");
        Intrinsics.checkNotNullParameter(recurringPaymentProvider, "recurringPaymentProvider");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(wealthProtectionConfirmationBottomSheetFactory, "wealthProtectionConfirmationBottomSheetFactory");
        Intrinsics.checkNotNullParameter(disclaimerProvider, "disclaimerProvider");
        Intrinsics.checkNotNullParameter(footerClicksControllerExtension, "footerClicksControllerExtension");
        this.o = inputData;
        this.f97336p = amountFormatter;
        this.f97337q = automationInteractor;
        this.f97338r = balancePickerInputDataProvider;
        this.f97339s = balanceResolver;
        this.f97340t = limitInputDataProvider;
        this.u = errorValidator;
        this.v = confirmationValidator;
        this.f97341w = preselectedInfoProvider;
        this.f97342x = recurringPaymentProvider;
        this.f97343y = keyboardExtension;
        this.z = wealthProtectionConfirmationBottomSheetFactory;
        this.A = disclaimerProvider;
        this.B = footerClicksControllerExtension;
        this.C = hx7.e.a(this, new bwd.a(this, 27));
        Data data = new Data(null, null, true, 3, null);
        AutomationLaunchMode launchMode = inputData.f97328a;
        AutomationLaunchMode launchMode2 = inputData.f97328a;
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        if (launchMode instanceof AutomationLaunchMode.NewAutomation) {
            j2 = 5000;
        } else {
            if (!(launchMode instanceof AutomationLaunchMode.EditingAutomation)) {
                throw new NoWhenBranchMatchedException();
            }
            WalletAutomation walletAutomation = ((AutomationLaunchMode.EditingAutomation) launchMode).f97310a.f104808h;
            if (walletAutomation == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            j2 = walletAutomation.getF86446a().f115082a;
        }
        Intrinsics.checkNotNullParameter(launchMode2, "launchMode");
        long j3 = 10000;
        if (!(launchMode2 instanceof AutomationLaunchMode.NewAutomation)) {
            if (!(launchMode2 instanceof AutomationLaunchMode.EditingAutomation)) {
                throw new NoWhenBranchMatchedException();
            }
            WalletAutomation walletAutomation2 = ((AutomationLaunchMode.EditingAutomation) launchMode2).f97310a.f104808h;
            if (walletAutomation2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (walletAutomation2 instanceof WalletAutomation.DropsBelow) {
                j3 = ((WalletAutomation.DropsBelow) walletAutomation2).f86443a.f115082a;
            } else if (!(walletAutomation2 instanceof WalletAutomation.Exceeds)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        c7i.f fVarB = g.b(launchMode2);
        Intrinsics.checkNotNullParameter(launchMode2, "launchMode");
        if (launchMode2 instanceof AutomationLaunchMode.NewAutomation) {
            d = null;
        } else {
            if (!(launchMode2 instanceof AutomationLaunchMode.EditingAutomation)) {
                throw new NoWhenBranchMatchedException();
            }
            WalletAutomation walletAutomation3 = ((AutomationLaunchMode.EditingAutomation) launchMode2).f97310a.f104808h;
            if (walletAutomation3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            d = walletAutomation3.getD();
        }
        long j5 = j2;
        long j16 = j3;
        this.D = d.b(this, new r(data, j5, j16, fVarB, null, d, m.f149895a, f0.f322471a, null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature_move_money.impl.automation.screen.c r13, com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$CreationState r14, gim.c r15) {
        /*
            boolean r0 = r15 instanceof c7i.m0
            if (r0 == 0) goto L13
            r0 = r15
            c7i.m0 r0 = (c7i.m0) r0
            int r1 = r0.f22016x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22016x = r1
            goto L18
        L13:
            c7i.m0 r0 = new c7i.m0
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f22016x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$CreationState r14 = r0.u
            yhm.o.b(r15)
            goto L41
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            yhm.o.b(r15)
            l7i.e r15 = r13.v
            r0.u = r14
            r0.f22016x = r3
            java.lang.Object r15 = r15.a(r14, r0)
            if (r15 != r1) goto L41
            return r1
        L41:
            l7i.c r15 = (l7i.c) r15
            boolean r0 = r15 instanceof l7i.b
            if (r0 == 0) goto L58
            com.revolut.kompot.navigable.vc.modal.a r13 = r13.C
            com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$ModalStep$WealthProtectionConfirmation r0 = new com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$ModalStep$WealthProtectionConfirmation
            l7i.b r15 = (l7i.b) r15
            com.revolut.feature_move_money.api.model.AccountWrapper r15 = r15.f192663a
            r0.<init>(r14, r15)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r14 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.v2(r13, r0, r14)
            goto Lae
        L58:
            boolean r15 = r15 instanceof l7i.a
            if (r15 == 0) goto Lb1
            c7i.s r15 = new c7i.s
            com.revolut.feature.shared.recurring_payments.models.WalletAutomation r0 = r14.f97325a
            com.revolut.feature_move_money.api.model.AccountWrapper r9 = r14.f97326b
            com.revolut.feature_move_money.api.model.AccountWrapper r10 = r14.f97327c
            cli.y r14 = r13.D
            java.lang.Object r14 = r14.f22677a
            vkm.j2 r14 = (vkm.j2) r14
            java.lang.Object r14 = r14.getValue()
            c7i.r r14 = (c7i.r) r14
            c7i.f r1 = r14.d
            int[] r2 = c7i.z.f22036a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            if (r1 == r3) goto L97
            r2 = 2
            if (r1 != r2) goto L91
            com.revolut.feature_move_money.api.model.OrderMode$Automation r5 = new com.revolut.feature_move_money.api.model.OrderMode$Automation
            r5.<init>(r0)
            j8l.d r11 = j8l.d.SELL
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r6 = r14.e
            com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo r4 = new com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo
            r7 = 0
            r12 = 0
            r4.<init>(r5, r6, r7, r9, r10, r11, r12)
            goto La8
        L91:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L97:
            com.revolut.feature_move_money.api.model.OrderMode$Automation r5 = new com.revolut.feature_move_money.api.model.OrderMode$Automation
            r5.<init>(r0)
            long r7 = r14.f22024c
            j8l.d r11 = j8l.d.BUY
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r6 = r14.e
            com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo r4 = new com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo
            r12 = 0
            r4.<init>(r5, r6, r7, r9, r10, r11, r12)
        La8:
            r15.<init>(r4)
            r13.C2(r15)
        Lae:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        Lb1:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.automation.screen.c.I2(com.revolut.feature_move_money.impl.automation.screen.c, com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$CreationState, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new k0(this, null), new yi5.b(26));
        j jVar = new j(25);
        cli.y yVar = this.D;
        l.a1(this, q.Q(q.q(yVar.B(jVar)), new s(continuation, this, 9)), null, null, new j0(this, null), 3);
        l.a1(this, q.H(new btk.j(this, continuation, 29), v7.w(yVar.B(new j(26)))), null, null, new e0(this, null), 3);
    }

    public final void J2(c7i.q position) {
        Pair pair;
        x5i.d dVar;
        r rVar = (r) ((j2) this.D.f22677a).getValue();
        p pVarK2 = K2();
        o oVar = pVarK2.f22020a;
        o oVar2 = pVarK2.f22021b;
        int i = z.f22037b[position.ordinal()];
        if (i == 1) {
            pair = new Pair(oVar, oVar2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(oVar2, oVar);
        }
        o oVar3 = (o) pair.f186385a;
        o oVar4 = (o) pair.f186386b;
        c7i.f rule = rVar.d;
        w5i.a aVar = this.f97338r.f21985a;
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(rule, "rule");
        AccountWrapper accountWrapperA = oVar3 != null ? oVar3.a() : null;
        AccountWrapper accountWrapperA2 = oVar4 != null ? oVar4.a() : null;
        int i2 = c7i.a.f21983b[rule.ordinal()];
        if (i2 == 1) {
            int i3 = c7i.a.f21982a[position.ordinal()];
            if (i3 == 1) {
                dVar = x5i.d.TARGET;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = x5i.d.SOURCE;
            }
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = c7i.a.f21982a[position.ordinal()];
            if (i5 == 1) {
                dVar = x5i.d.SOURCE;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = x5i.d.TARGET;
            }
        }
        h.v2(this.C, new MoveMoneyAutomationScreenContract$ModalStep.BalancePicker(new MoveMoneyAutomationBalancePickerProvider$BalancePickerData(new BalanceSelector$InputData(accountWrapperA2 != null ? ((n7i.a) aVar).a(accountWrapperA2.f97224a, dVar) : ((n7i.a) aVar).b(), k1j.d.RETAIL, io3.l.CURRENT, null, null, null, null, accountWrapperA != null ? accountWrapperA.getPocketId() : null, y0.b(BalanceSelector$ExtraConfiguration.SearchEnabled.f99374a), SyslogConstants.LOG_CLOCK), dVar, accountWrapperA2, position)), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.C;
    }

    public final p K2() {
        Object content = ((r) ((j2) this.D.f22677a).getValue()).f22022a.getContent();
        if (content != null) {
            return (p) content;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // yji.l
    public final void T1(long j2) {
        j jVar = new j(23);
        cli.y yVar = this.D;
        l.b1(this, q.Q(q.q(yVar.B(jVar)), new c7i.g0(this, null)), null, new i0(this, null), 3);
        Flow input = q.q(new t0(yVar.B(new x(this, 0)), 1));
        f fVar = this.u;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        l.b1(this, q.H(new m75.i(fVar, null, 1), input), null, new c7i.f0(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.D;
    }
}
