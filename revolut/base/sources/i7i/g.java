package i7i;

import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zq.a f159322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kbb.c f159323b;

    public g(zq.a balanceResolver, kbb.c recurringPaymentPreselectedAccountsProvider) {
        Intrinsics.checkNotNullParameter(balanceResolver, "balanceResolver");
        Intrinsics.checkNotNullParameter(recurringPaymentPreselectedAccountsProvider, "recurringPaymentPreselectedAccountsProvider");
        this.f159322a = balanceResolver;
        this.f159323b = recurringPaymentPreselectedAccountsProvider;
    }

    public static c7i.f b(AutomationLaunchMode launchMode) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        if (launchMode instanceof AutomationLaunchMode.NewAutomation) {
            return c7i.f.DropsBelow;
        }
        if (!(launchMode instanceof AutomationLaunchMode.EditingAutomation)) {
            throw new NoWhenBranchMatchedException();
        }
        WalletAutomation walletAutomation = ((AutomationLaunchMode.EditingAutomation) launchMode).f97310a.f104808h;
        if (walletAutomation == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (walletAutomation instanceof WalletAutomation.DropsBelow) {
            return c7i.f.DropsBelow;
        }
        if (walletAutomation instanceof WalletAutomation.Exceeds) {
            return c7i.f.Exceeds;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof i7i.c
            if (r0 == 0) goto L13
            r0 = r8
            i7i.c r0 = (i7i.c) r0
            int r1 = r0.f159313w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159313w = r1
            goto L18
        L13:
            i7i.c r0 = new i7i.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f159313w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2a
            goto L5f
        L2a:
            r0 = move-exception
            r7 = r0
            r2 = r7
            goto L72
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2a
            goto L4c
        L3a:
            yhm.o.b(r8)
            boolean r8 = r7 instanceof com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode.EditingAutomation     // Catch: java.lang.Exception -> L2a
            if (r8 == 0) goto L50
            com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode$EditingAutomation r7 = (com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode.EditingAutomation) r7     // Catch: java.lang.Exception -> L2a
            r0.f159313w = r4     // Catch: java.lang.Exception -> L2a
            java.lang.Object r8 = r6.d(r7, r0)     // Catch: java.lang.Exception -> L2a
            if (r8 != r1) goto L4c
            goto L5e
        L4c:
            c7i.p r8 = (c7i.p) r8     // Catch: java.lang.Exception -> L2a
        L4e:
            r1 = r8
            goto L62
        L50:
            boolean r8 = r7 instanceof com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode.NewAutomation     // Catch: java.lang.Exception -> L2a
            if (r8 == 0) goto L6c
            com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode$NewAutomation r7 = (com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode.NewAutomation) r7     // Catch: java.lang.Exception -> L2a
            r0.f159313w = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r8 = r6.e(r7, r0)     // Catch: java.lang.Exception -> L2a
            if (r8 != r1) goto L5f
        L5e:
            return r1
        L5f:
            c7i.p r8 = (c7i.p) r8     // Catch: java.lang.Exception -> L2a
            goto L4e
        L62:
            com.revolut.data.model.Data r0 = new com.revolut.data.model.Data     // Catch: java.lang.Exception -> L2a
            r3 = 0
            r2 = 0
            r4 = 6
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L2a
            return r0
        L6c:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L2a
            r7.<init>()     // Catch: java.lang.Exception -> L2a
            throw r7     // Catch: java.lang.Exception -> L2a
        L72:
            com.revolut.data.model.Data r0 = new com.revolut.data.model.Data
            r4 = 5
            r5 = 0
            r1 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i7i.g.a(com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature_move_money.api.model.AccountWrapper r7, com.revolut.feature_move_money.api.model.AccountWrapper r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof i7i.d
            if (r0 == 0) goto L13
            r0 = r9
            i7i.d r0 = (i7i.d) r0
            int r1 = r0.f159316y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159316y = r1
            goto L18
        L13:
            i7i.d r0 = new i7i.d
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f159314w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f159316y
            zq.a r3 = r6.f159322a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            c7i.o r7 = r0.v
            yhm.o.b(r9)
            goto L5f
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            com.revolut.feature_move_money.api.model.AccountWrapper r8 = r0.u
            yhm.o.b(r9)
            goto L4c
        L3c:
            yhm.o.b(r9)
            c7i.q r9 = c7i.q.Top
            r0.u = r8
            r0.f159316y = r5
            java.lang.Object r9 = r3.B(r7, r9, r0)
            if (r9 != r1) goto L4c
            goto L5e
        L4c:
            r7 = r9
            c7i.o r7 = (c7i.o) r7
            c7i.q r9 = c7i.q.Bottom
            r2 = 0
            r0.u = r2
            r0.v = r7
            r0.f159316y = r4
            java.lang.Object r9 = r3.B(r8, r9, r0)
            if (r9 != r1) goto L5f
        L5e:
            return r1
        L5f:
            c7i.o r9 = (c7i.o) r9
            c7i.p r8 = new c7i.p
            r8.<init>(r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i7i.g.c(com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.feature_move_money.api.model.AccountWrapper, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode.EditingAutomation r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof i7i.e
            if (r0 == 0) goto L13
            r0 = r7
            i7i.e r0 = (i7i.e) r0
            int r1 = r0.f159318x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159318x = r1
            goto L18
        L13:
            i7i.e r0 = new i7i.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f159318x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode$EditingAutomation r6 = r0.u
            yhm.o.b(r7)
            goto L4a
        L38:
            yhm.o.b(r7)
            com.revolut.shared.feature.move_money.api.model.MoveMoneyRecurringPayment r7 = r6.f97310a
            r0.u = r6
            r0.f159318x = r4
            kbb.c r2 = r5.f159323b
            java.lang.Object r7 = r2.v(r7, r0)
            if (r7 != r1) goto L4a
            goto L80
        L4a:
            m6i.i0 r7 = (m6i.i0) r7
            com.revolut.shared.feature.move_money.api.model.MoveMoneyRecurringPayment r6 = r6.f97310a
            com.revolut.feature.shared.recurring_payments.models.WalletAutomation r6 = r6.f104808h
            if (r6 == 0) goto L88
            boolean r2 = r6 instanceof com.revolut.feature.shared.recurring_payments.models.WalletAutomation.DropsBelow
            if (r2 == 0) goto L60
            com.revolut.feature_move_money.api.model.AccountWrapper r6 = r7.f203165b
            com.revolut.feature_move_money.api.model.AccountWrapper r7 = r7.f203164a
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r6, r7)
            goto L6d
        L60:
            boolean r6 = r6 instanceof com.revolut.feature.shared.recurring_payments.models.WalletAutomation.Exceeds
            if (r6 == 0) goto L82
            com.revolut.feature_move_money.api.model.AccountWrapper r6 = r7.f203164a
            com.revolut.feature_move_money.api.model.AccountWrapper r7 = r7.f203165b
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r6, r7)
        L6d:
            java.lang.Object r6 = r2.f186385a
            com.revolut.feature_move_money.api.model.AccountWrapper r6 = (com.revolut.feature_move_money.api.model.AccountWrapper) r6
            java.lang.Object r7 = r2.f186386b
            com.revolut.feature_move_money.api.model.AccountWrapper r7 = (com.revolut.feature_move_money.api.model.AccountWrapper) r7
            r2 = 0
            r0.u = r2
            r0.f159318x = r3
            java.lang.Object r6 = r5.c(r6, r7, r0)
            if (r6 != r1) goto L81
        L80:
            return r1
        L81:
            return r6
        L82:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L88:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Required value was null."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i7i.g.d(com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode$EditingAutomation, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode.NewAutomation r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof i7i.f
            if (r0 == 0) goto L13
            r0 = r9
            i7i.f r0 = (i7i.f) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            i7i.f r0 = new i7i.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f159320x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            c7i.p r8 = r0.f159319w
            yhm.o.b(r9)
            goto Lb6
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            com.revolut.feature_move_money.api.model.AccountWrapper r8 = r0.v
            com.revolut.feature_move_money.api.model.AccountWrapper r2 = r0.u
            yhm.o.b(r9)
            goto L7b
        L3d:
            yhm.o.b(r9)
            c7i.f r9 = b(r8)
            com.revolut.feature_move_money.api.model.AccountWrapper r2 = r8.f97312b
            com.revolut.feature_move_money.api.model.AccountWrapper r8 = r8.f97311a
            int[] r5 = i7i.b.f159312a
            int r9 = r9.ordinal()
            r9 = r5[r9]
            if (r9 == r4) goto L60
            if (r9 != r3) goto L5a
            kotlin.Pair r9 = new kotlin.Pair
            r9.<init>(r8, r2)
            goto L65
        L5a:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L60:
            kotlin.Pair r9 = new kotlin.Pair
            r9.<init>(r2, r8)
        L65:
            java.lang.Object r8 = r9.f186385a
            r2 = r8
            com.revolut.feature_move_money.api.model.AccountWrapper r2 = (com.revolut.feature_move_money.api.model.AccountWrapper) r2
            java.lang.Object r8 = r9.f186386b
            com.revolut.feature_move_money.api.model.AccountWrapper r8 = (com.revolut.feature_move_money.api.model.AccountWrapper) r8
            r0.u = r2
            r0.v = r8
            r0.z = r4
            java.lang.Object r9 = r7.c(r2, r8, r0)
            if (r9 != r1) goto L7b
            goto Lb2
        L7b:
            c7i.p r9 = (c7i.p) r9
            c7i.o r5 = r9.f22020a
            boolean r5 = r5 instanceof c7i.m
            if (r5 == 0) goto L8a
            c7i.o r5 = r9.f22021b
            boolean r5 = r5 instanceof c7i.m
            if (r5 == 0) goto L8a
            return r9
        L8a:
            if (r2 == 0) goto L97
            j8l.a r5 = r2.f97224a
            if (r5 == 0) goto L97
            boolean r5 = pw5.a.s(r5)
            if (r5 != r4) goto L97
            goto La3
        L97:
            if (r8 == 0) goto Lc6
            j8l.a r5 = r8.f97224a
            if (r5 == 0) goto Lc6
            boolean r5 = pw5.a.s(r5)
            if (r5 != r4) goto Lc6
        La3:
            r4 = 0
            r0.u = r4
            r0.v = r4
            r0.f159319w = r9
            r0.z = r3
            java.lang.Object r8 = r7.c(r8, r2, r0)
            if (r8 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            r6 = r9
            r9 = r8
            r8 = r6
        Lb6:
            c7i.p r9 = (c7i.p) r9
            c7i.o r0 = r9.f22020a
            boolean r0 = r0 instanceof c7i.m
            if (r0 == 0) goto Lc5
            c7i.o r0 = r9.f22021b
            boolean r0 = r0 instanceof c7i.m
            if (r0 == 0) goto Lc5
            return r9
        Lc5:
            return r8
        Lc6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i7i.g.e(com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode$NewAutomation, gim.c):java.lang.Object");
    }
}
