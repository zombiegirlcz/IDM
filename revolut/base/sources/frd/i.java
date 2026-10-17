package frd;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.junior.isa.api.navigation.JuniorIsaDestination;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import ft3.q0;
import grl.r2;
import io3.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final clc.b f137465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ai5.b f137466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mjb.a f137467c;
    public final xsd.d d;
    public final com.revolut.feature.external_accounts.api.navigation.a e;
    public final a2b.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final an8.b f137468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c1l.e f137469h;
    public final n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nxk.a f137470j;
    public final q78.e k;

    public i(clc.b roboOnboardingEntryCommandFactory, ai5.b cryptoNavigationInterceptor, mjb.a savingsNavigationProvider, xsd.d loanApplicationNavigationProvider, com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory, a2b.b cfdsOnboardingConfigProvider, an8.b juniorSavingProductInteractor, c1l.e tradingOnboardingStartCommandProvider, n walletInteractor, nxk.a productCommsCommandProvider, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(roboOnboardingEntryCommandFactory, "roboOnboardingEntryCommandFactory");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        Intrinsics.checkNotNullParameter(savingsNavigationProvider, "savingsNavigationProvider");
        Intrinsics.checkNotNullParameter(loanApplicationNavigationProvider, "loanApplicationNavigationProvider");
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        Intrinsics.checkNotNullParameter(cfdsOnboardingConfigProvider, "cfdsOnboardingConfigProvider");
        Intrinsics.checkNotNullParameter(juniorSavingProductInteractor, "juniorSavingProductInteractor");
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(productCommsCommandProvider, "productCommsCommandProvider");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f137465a = roboOnboardingEntryCommandFactory;
        this.f137466b = cryptoNavigationInterceptor;
        this.f137467c = savingsNavigationProvider;
        this.d = loanApplicationNavigationProvider;
        this.e = externalPocketNavigationFactory;
        this.f = cfdsOnboardingConfigProvider;
        this.f137468g = juniorSavingProductInteractor;
        this.f137469h = tradingOnboardingStartCommandProvider;
        this.i = walletInteractor;
        this.f137470j = productCommsCommandProvider;
        this.k = juniorAccountDestinationResolver;
    }

    public static FeatureCommand a(q0 q0Var) {
        return new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(r2.TOTAL_WEALTH, q0Var, null, null, null, null, 16378));
    }

    public static FeatureCommand b() {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)));
    }

    public static BridgeDestination d(AccountId accountId, io3.d dVar) {
        ProductId productId;
        if (accountId instanceof AccountId.Personal) {
            productId = ProductId.CURRENCY;
        } else {
            if (!(accountId instanceof AccountId.Joint)) {
                throw new NoWhenBranchMatchedException();
            }
            productId = dVar.e == l.INHERITANCE ? ProductId.BEREAVEMENT : ProductId.JOINT;
        }
        return j(new ProductAccountId(dVar.f163145a, null), productId);
    }

    public static BridgeDestination j(ProductAccountId productAccountId, ProductId productId) {
        return new BridgeDestination(jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(productAccountId, productId), null), null, null, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof frd.b
            if (r0 == 0) goto L13
            r0 = r8
            frd.b r0 = (frd.b) r0
            int r1 = r0.f137457x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f137457x = r1
            goto L18
        L13:
            frd.b r0 = new frd.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f137457x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.String r7 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L54
        L2a:
            r7 = move-exception
            goto L69
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            an8.b r8 = r6.f137468g     // Catch: java.lang.Throwable -> L2a
            w4l.h r2 = w4l.h.f294642c     // Catch: java.lang.Throwable -> L2a
            kotlinx.coroutines.flow.Flow r8 = r8.a(r7, r2)     // Catch: java.lang.Throwable -> L2a
            fq7.j r2 = new fq7.j     // Catch: java.lang.Throwable -> L2a
            r5 = 4
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2a
            jhi.b r8 = mo3.a.g(r8, r3, r2, r4)     // Catch: java.lang.Throwable -> L2a
            r0.u = r7     // Catch: java.lang.Throwable -> L2a
            r0.f137457x = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r8 = vkm.q.x(r8, r0)     // Catch: java.lang.Throwable -> L2a
            if (r8 != r1) goto L54
            return r1
        L54:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L2a
            mjb.a r0 = r6.f137467c     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r8 = zhm.d0.b0(r8)     // Catch: java.lang.Throwable -> L2a
            com.revolut.feature.shared.savings.models.product.SavingsProductData r8 = (com.revolut.feature.shared.savings.models.product.SavingsProductData) r8     // Catch: java.lang.Throwable -> L2a
            com.revolut.feature.shared.savings.models.product.SavingsProduct r8 = r8.f86683a     // Catch: java.lang.Throwable -> L2a
            java.lang.String r8 = r8.f86617a     // Catch: java.lang.Throwable -> L2a
            hob.d r0 = (hob.d) r0     // Catch: java.lang.Throwable -> L2a
            com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Destination r7 = r0.b(r7, r8)     // Catch: java.lang.Throwable -> L2a
            return r7
        L69:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r3, r3, r7, r8)
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.DummyCommand r8 = com.revolut.retail.core.navigation.DummyCommand.f98635a
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: frd.i.c(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r11 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r11 == r1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(amd.b r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: frd.i.e(amd.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(amd.j r12, com.revolut.feature.spending_analytics.api.models.NetWorthAccount.Personal r13, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof frd.d
            if (r0 == 0) goto L13
            r0 = r14
            frd.d r0 = (frd.d) r0
            int r1 = r0.f137459w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f137459w = r1
            goto L18
        L13:
            frd.d r0 = new frd.d
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f137459w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r14)
            goto L43
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            yhm.o.b(r14)
            boolean r14 = mra.d.y(r12)
            amd.b r7 = r12.f6332a
            if (r14 == 0) goto L4b
            r0.f137459w = r3
            java.lang.Object r14 = r11.e(r7, r0)
            if (r14 != r1) goto L43
            return r1
        L43:
            com.revolut.retail.core.navigation.NaviCommand r14 = (com.revolut.retail.core.navigation.NaviCommand) r14
            emd.b r12 = new emd.b
            r12.<init>(r14)
            return r12
        L4b:
            emd.a r12 = new emd.a
            com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$TotalWealthScreen$Destination r4 = new com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$TotalWealthScreen$Destination
            yld.g r5 = r7.b()
            r9 = 0
            r10 = 24
            r8 = 0
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12.<init>(r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: frd.i.f(amd.j, com.revolut.feature.spending_analytics.api.models.NetWorthAccount$Personal, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof frd.e
            if (r0 == 0) goto L13
            r0 = r5
            frd.e r0 = (frd.e) r0
            int r1 = r0.f137460w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f137460w = r1
            goto L18
        L13:
            frd.e r0 = new frd.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f137460w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            com.revolut.feature.external_accounts.api.navigation.a r5 = r4.e
            r2 = 0
            ufm.i r5 = com.revolut.feature.external_accounts.api.navigation.a.a(r5, r2)
            r0.f137460w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: frd.i.g(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.spending_analytics.api.models.NetWorthAccount r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof frd.f
            if (r0 == 0) goto L13
            r0 = r9
            frd.f r0 = (frd.f) r0
            int r1 = r0.f137462x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f137462x = r1
            goto L18
        L13:
            frd.f r0 = new frd.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f137462x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.spending_analytics.api.models.NetWorthAccount$Junior r8 = r0.u
            yhm.o.b(r9)
            goto L5f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r9)
            boolean r9 = r8 instanceof com.revolut.feature.spending_analytics.api.models.NetWorthAccount.Junior
            if (r9 == 0) goto L7c
            r9 = r8
            com.revolut.feature.spending_analytics.api.models.NetWorthAccount$Junior r9 = (com.revolut.feature.spending_analytics.api.models.NetWorthAccount.Junior) r9
            java.lang.String r2 = r9.f87454a
            w4l.h r4 = w4l.h.f294642c
            wsg.n r5 = r7.i
            efm.r r2 = r5.Z(r2, r4)
            vkm.d r2 = rd0.e.b(r2)
            fq7.j r4 = new fq7.j
            r5 = 3
            r4.<init>(r5)
            r5 = 0
            jhi.b r2 = mo3.a.g(r2, r5, r4, r3)
            r0.u = r9
            r0.f137462x = r3
            java.lang.Object r9 = vkm.q.x(r2, r0)
            if (r9 != r1) goto L5f
            return r1
        L5f:
            fo3.c r9 = (fo3.c) r9
            xi0.b r9 = r9.d
            com.revolut.feature.subaccount.api.navigation.CreateSubaccountWithTypeScreenDestination r0 = new com.revolut.feature.subaccount.api.navigation.CreateSubaccountWithTypeScreenDestination
            com.revolut.feature.subaccount.api.models.SubaccountType$Junior r1 = com.revolut.feature.subaccount.api.models.SubaccountType.Junior.f88962a
            java.util.Set r1 = zhm.y0.b(r1)
            com.revolut.feature.spending_analytics.api.models.NetWorthAccount$Junior r8 = (com.revolut.feature.spending_analytics.api.models.NetWorthAccount.Junior) r8
            java.lang.String r3 = r8.f87454a
            com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CurrencySelectionMode$Specific r4 = new com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CurrencySelectionMode$Specific
            r4.<init>(r9)
            r5 = 0
            r6 = 18
            r2 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L7c:
            com.revolut.feature.spending_analytics.api.models.NetWorthAccount$Personal r9 = com.revolut.feature.spending_analytics.api.models.NetWorthAccount.Personal.f87455a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r9)
            if (r8 == 0) goto L96
            com.revolut.feature.subaccount.api.navigation.CreateSubaccountWithTypeScreenDestination r0 = new com.revolut.feature.subaccount.api.navigation.CreateSubaccountWithTypeScreenDestination
            com.revolut.feature.subaccount.api.models.SubaccountType$Personal r8 = com.revolut.feature.subaccount.api.models.SubaccountType.Personal.f88963a
            java.util.Set r1 = zhm.y0.b(r8)
            r5 = 0
            r6 = 30
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L96:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: frd.i.h(com.revolut.feature.spending_analytics.api.models.NetWorthAccount, gim.c):java.lang.Object");
    }

    public final BridgeDestination i(NetWorthAccount netWorthAccount) {
        if (netWorthAccount instanceof NetWorthAccount.Junior) {
            return u0.b(((wxk.g) this.f137470j).b(u0.f(new JuniorIsaDestination.ChildDetailsDestination(((NetWorthAccount.Junior) netWorthAccount).f87454a))));
        }
        if (Intrinsics.f(netWorthAccount, NetWorthAccount.Personal.f87455a)) {
            return u0.b(b());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof frd.g
            if (r0 == 0) goto L13
            r0 = r5
            frd.g r0 = (frd.g) r0
            int r1 = r0.f137463w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f137463w = r1
            goto L18
        L13:
            frd.g r0 = new frd.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f137463w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            clc.b r5 = r4.f137465a
            r2 = 3
            ufm.f r5 = clc.b.a(r5, r2)
            r0.f137463w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: frd.i.k(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(gim.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof frd.h
            if (r0 == 0) goto L13
            r0 = r11
            frd.h r0 = (frd.h) r0
            int r1 = r0.f137464w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f137464w = r1
            goto L18
        L13:
            frd.h r0 = new frd.h
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f137464w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r11)
            goto L6c
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L2f:
            yhm.o.b(r11)
            com.revolut.retail.core.navigation.FeatureCommand r11 = b()
            com.revolut.retail.core.navigation.FeatureCommand r5 = b()
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccountType r6 = new com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccountType
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType$Taa r2 = com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType.Taa.f105275a
            r6.<init>(r2)
            grl.k9 r2 = grl.k9.Trading
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r4 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r4 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams r8 = new com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType r4 = com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType.TRADING
            r8.<init>(r3, r4)
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig r4 = new com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r9 = new com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail
            r9.<init>(r2)
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r2 = 0
            c1l.e r5 = r10.f137469h
            ufm.b r11 = r5.b(r11, r4, r2)
            r0.f137464w = r3
            java.lang.Object r11 = nim.a.b(r11, r0)
            if (r11 != r1) goto L6c
            return r1
        L6c:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            com.revolut.retail.core.navigation.NaviCommand r11 = (com.revolut.retail.core.navigation.NaviCommand) r11
            com.revolut.kompot.bridge.navigation.BridgeDestination r11 = zh9.u0.b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: frd.i.l(gim.c):java.lang.Object");
    }
}
