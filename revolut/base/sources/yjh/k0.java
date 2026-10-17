package yjh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.feature.wealth.ui.impl.actions.handler.WealthTransferFlowControllerFactory$Descriptor;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$State;
import hih.b;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xzg.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 extends hih.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final iih.a f314490l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wzg.a f314491m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zjh.f f314492n;
    public final qmc.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qmc.b f314493p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tzg.m f314494q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ybl.l f314495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f314496s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map f314497t;
    public final tzg.h u;

    public k0(iih.a wealthActionTransferDestinationProvider, wzg.a cashHoldingsInteractor, zjh.f roboPortfolioInteractor, qmc.h roboPortfolioInfoProvider, qmc.b roboContextProvider, tzg.m wealthAccountsInteractor, ybl.l tradingConfigInteractor, c marginTransferAccountsProvider, Map productsExcludedFromUnspecifiedTransfersByRoboContext, tzg.h investWithdrawToMoveMoneyChecker) {
        Intrinsics.checkNotNullParameter(wealthActionTransferDestinationProvider, "wealthActionTransferDestinationProvider");
        Intrinsics.checkNotNullParameter(cashHoldingsInteractor, "cashHoldingsInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioInteractor, "roboPortfolioInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(marginTransferAccountsProvider, "marginTransferAccountsProvider");
        Intrinsics.checkNotNullParameter(productsExcludedFromUnspecifiedTransfersByRoboContext, "productsExcludedFromUnspecifiedTransfersByRoboContext");
        Intrinsics.checkNotNullParameter(investWithdrawToMoveMoneyChecker, "investWithdrawToMoveMoneyChecker");
        this.f314490l = wealthActionTransferDestinationProvider;
        this.f314491m = cashHoldingsInteractor;
        this.f314492n = roboPortfolioInteractor;
        this.o = roboPortfolioInfoProvider;
        this.f314493p = roboContextProvider;
        this.f314494q = wealthAccountsInteractor;
        this.f314495r = tradingConfigInteractor;
        this.f314496s = marginTransferAccountsProvider;
        this.f314497t = productsExcludedFromUnspecifiedTransfersByRoboContext;
        this.u = investWithdrawToMoveMoneyChecker;
    }

    public static iih.b g3(WealthAction wealthAction) {
        if (wealthAction instanceof WealthAction.AddMoney) {
            return iih.b.DEPOSIT;
        }
        if (wealthAction instanceof WealthAction.Withdraw) {
            return iih.b.WITHDRAW;
        }
        throw new IllegalArgumentException("WealthTransferActionHandler can't handle action " + wealthAction);
    }

    public static boolean h3(WealthAccount wealthAccount, hih.a aVar) {
        switch (c0.f314460a[aVar.ordinal()]) {
            case 1:
                return wealthAccount instanceof WealthAccount.Robo;
            case 2:
                return wealthAccount instanceof WealthAccount.Margin;
            case 3:
                return (wealthAccount instanceof WealthAccount.Securities) && ((WealthAccount.Securities) wealthAccount).f95239b == q0.PERSONAL;
            case 4:
                return (wealthAccount instanceof WealthAccount.Securities) && ((WealthAccount.Securities) wealthAccount).f95239b == q0.PERSONAL_JOINT;
            case 5:
                return wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Isa;
            case 6:
                return wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Pea;
            case 7:
                return wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // yji.n
    public final void D2() {
        if (r2().M0(new b.a()) != b.C0876b.f152604a) {
            r6.b.D("No host handles WealthActionEvent above WealthTransferActionHandler. The hosting model must handle WealthActionEvent.KompotNavigationDescriptorEvent (e.g. via ModalCoordinator).");
        }
    }

    @Override // hih.d
    public final boolean Z2(WealthAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return (action instanceof WealthAction.Withdraw) || (action instanceof WealthAction.AddMoney) || (action instanceof WealthAction.MoveMoney);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017d  */
    @Override // hih.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature.wealth.ui.api.actions.WealthAction r18, kotlin.coroutines.Continuation r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yjh.k0.b3(com.revolut.feature.wealth.ui.api.actions.WealthAction, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0202 -> B:74:0x0208). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c3(com.revolut.feature.wealth.ui.api.actions.WealthAction r17, java.util.ArrayList r18, yj2.b r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yjh.k0.c3(com.revolut.feature.wealth.ui.api.actions.WealthAction, java.util.ArrayList, yj2.b, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(com.revolut.feature.wealth.ui.api.actions.WealthAction r6, java.lang.String r7, boolean r8, java.lang.String r9, kotlin.jvm.functions.Function3 r10, gim.c r11) {
        /*
            r5 = this;
            boolean r0 = r11 instanceof yjh.g0
            if (r0 == 0) goto L13
            r0 = r11
            yjh.g0 r0 = (yjh.g0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            yjh.g0 r0 = new yjh.g0
            r0.<init>(r5, r11)
        L18:
            java.lang.Object r11 = r0.f314473y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r11)
            goto La4
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            boolean r8 = r0.f314472x
            kotlin.jvm.functions.Function3 r10 = r0.f314471w
            java.lang.String r9 = r0.v
            java.lang.String r7 = r0.u
            yhm.o.b(r11)
            goto L58
        L3f:
            yhm.o.b(r11)
            if (r7 == 0) goto Laa
            if (r8 != 0) goto L47
            goto Laa
        L47:
            r0.u = r7
            r0.v = r9
            r0.f314471w = r10
            r0.f314472x = r8
            r0.A = r4
            java.lang.Object r11 = r5.e3(r6, r7, r0)
            if (r11 != r1) goto L58
            goto La3
        L58:
            java.util.List r11 = (java.util.List) r11
            boolean r6 = r11.isEmpty()
            if (r6 == 0) goto L63
            zhm.f0 r6 = zhm.f0.f322471a
            return r6
        L63:
            ybl.l r6 = r5.f314495r
            akg.n r6 = ybl.l.d(r6)
            kotlin.coroutines.g r2 = kotlin.coroutines.g.f186406a
            efm.r r6 = rd0.e.c(r6, r2)
            soc.f r2 = new soc.f
            r4 = 19
            r2.<init>(r10, r4, r7, r11)
            yd8.a r7 = new yd8.a
            r10 = 29
            r7.<init>(r10)
            r10 = 0
            efm.r r6 = m70.a.h(r6, r2, r10, r7, r3)
            java.lang.String r7 = "WealthTransferActionHandler"
            java.util.Set r7 = m72.b.w(r7, r9)
            yi5.b r9 = new yi5.b
            r11 = 24
            r9.<init>(r11)
            efm.r r6 = ue0.e.H(r6, r7, r9)
            r0.u = r10
            r0.v = r10
            r0.f314471w = r10
            r0.f314472x = r8
            r0.A = r3
            java.lang.Object r11 = nim.a.c(r6, r0)
            if (r11 != r1) goto La4
        La3:
            return r1
        La4:
            java.lang.String r6 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r6)
            return r11
        Laa:
            zhm.f0 r6 = zhm.f0.f322471a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yjh.k0.d3(com.revolut.feature.wealth.ui.api.actions.WealthAction, java.lang.String, boolean, java.lang.String, kotlin.jvm.functions.Function3, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(com.revolut.feature.wealth.ui.api.actions.WealthAction r8, java.lang.String r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof yjh.h0
            if (r0 == 0) goto L13
            r0 = r10
            yjh.h0 r0 = (yjh.h0) r0
            int r1 = r0.f314479y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f314479y = r1
            goto L18
        L13:
            yjh.h0 r0 = new yjh.h0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f314477w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f314479y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yjh.k0 r8 = r0.v
            com.revolut.feature.wealth.ui.api.actions.WealthAction r9 = r0.u
            yhm.o.b(r10)
            goto L6c
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            yhm.o.b(r10)
            w4l.j r10 = w4l.j.f294644c
            wzg.a r2 = r7.f314491m
            c9h.k r2 = (c9h.k) r2
            akg.n r9 = r2.k(r9, r10)
            zfd.e r9 = zi0.c.w(r9)
            yjh.b0 r10 = new yjh.b0
            r2 = 0
            r10.<init>(r2)
            jhi.b r9 = mo3.a.g(r9, r4, r10, r3)
            x18.c r10 = new x18.c
            r2 = 3
            r5 = 23
            r10.<init>(r2, r5, r4)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r9 = rd0.e.e(r9, r2, r10)
            r0.u = r8
            r0.v = r7
            r0.f314479y = r3
            java.lang.Object r10 = vkm.q.x(r9, r0)
            if (r10 != r1) goto L6a
            return r1
        L6a:
            r9 = r8
            r8 = r7
        L6c:
            java.util.List r10 = (java.util.List) r10
            r8.getClass()
            boolean r8 = r9 instanceof com.revolut.feature.wealth.ui.api.actions.WealthAction.Withdraw
            if (r8 != 0) goto L7f
            boolean r8 = r9 instanceof com.revolut.feature.wealth.ui.api.actions.WealthAction.MoveMoney
            if (r8 == 0) goto Lb1
            com.revolut.feature.wealth.ui.api.actions.WealthAction$MoveMoney r9 = (com.revolut.feature.wealth.ui.api.actions.WealthAction.MoveMoney) r9
            boolean r8 = r9.f95878b
            if (r8 == 0) goto Lb1
        L7f:
            r8 = r10
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L8b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r0 = r8.next()
            r1 = r0
            com.revolut.shared.feature.wealth.models.holding.CashHoldingAvailability r1 = (com.revolut.shared.feature.wealth.models.holding.CashHoldingAvailability) r1
            kel.b r1 = r1.f105108a
            dj0.d r1 = r1.e
            long r1 = r1.f115082a
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L8b
            r9.add(r0)
            goto L8b
        La8:
            boolean r8 = r9.isEmpty()
            if (r8 != 0) goto Laf
            r4 = r9
        Laf:
            if (r4 != 0) goto Lb2
        Lb1:
            return r10
        Lb2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yjh.k0.e3(com.revolut.feature.wealth.ui.api.actions.WealthAction, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof yjh.i0
            if (r0 == 0) goto L13
            r0 = r6
            yjh.i0 r0 = (yjh.i0) r0
            int r1 = r0.f314482w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f314482w = r1
            goto L18
        L13:
            yjh.i0 r0 = new yjh.i0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f314482w
            java.util.Map r3 = r5.f314497t
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            yhm.o.b(r6)
            goto L56
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L3d
            zhm.h0 r6 = zhm.h0.f322473a
            return r6
        L3d:
            qmc.b r6 = r5.f314493p
            vkm.q0 r6 = r6.a()
            zfd.e r6 = zi0.c.w(r6)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r6 = rd0.e.d(r6, r2)
            r0.f314482w = r4
            java.lang.Object r6 = vkm.q.z(r6, r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            if (r6 == 0) goto L61
            java.lang.Object r6 = r6.getContent()
            ilc.a r6 = (ilc.a) r6
            goto L62
        L61:
            r6 = 0
        L62:
            java.lang.Object r6 = r3.get(r6)
            java.util.Set r6 = (java.util.Set) r6
            if (r6 != 0) goto L6c
            zhm.h0 r6 = zhm.h0.f322473a
        L6c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yjh.k0.f3(gim.c):java.lang.Object");
    }

    public final void i3(WealthTransferPickerControllerContract$State wealthTransferPickerControllerContract$State, WealthAction wealthAction) {
        r2().M0(new hih.c(new WealthTransferFlowControllerFactory$Descriptor(wealthTransferPickerControllerContract$State, wealthAction)));
    }
}
