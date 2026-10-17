package v6e;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.retail.core.navigation.FeatureCommand;
import cu8.r0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.i7;
import tof.q6;
import w38.t;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements g6e.g {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f286367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6e.d f286368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g48.r0 f286369c;
    public final o38.a d;
    public final t e;

    public r(r0 kycRequiredActionTransformer, g6e.d subaccountInteractor, g48.r0 jointAccountsInteractor, o38.a jointNavigationProvider, v8i.c moveMoneyRecurringPaymentMapper, t pendingAccountBottomSheetProvider) {
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(jointNavigationProvider, "jointNavigationProvider");
        Intrinsics.checkNotNullParameter(moveMoneyRecurringPaymentMapper, "moveMoneyRecurringPaymentMapper");
        Intrinsics.checkNotNullParameter(pendingAccountBottomSheetProvider, "pendingAccountBottomSheetProvider");
        this.f286367a = kycRequiredActionTransformer;
        this.f286368b = subaccountInteractor;
        this.f286369c = jointAccountsInteractor;
        this.d = jointNavigationProvider;
        this.e = pendingAccountBottomSheetProvider;
    }

    public final FeatureCommand c(String id10, ExtendedSubaccountType type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(id10, type), ProductId.SUBACCOUNT), null), null, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof v6e.m
            if (r0 == 0) goto L13
            r0 = r8
            v6e.m r0 = (v6e.m) r0
            int r1 = r0.f286361y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286361y = r1
            goto L18
        L13:
            v6e.m r0 = new v6e.m
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f286359w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286361y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            ks8.j r7 = r0.v
            java.lang.String r0 = r0.u
            yhm.o.b(r8)
            goto L63
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L4c
        L3c:
            yhm.o.b(r8)
            r0.u = r7
            r0.f286361y = r4
            cu8.r0 r8 = r6.f286367a
            java.lang.Object r8 = ks8.m.b(r8, r0)
            if (r8 != r1) goto L4c
            goto L5e
        L4c:
            ks8.j r8 = (ks8.j) r8
            r0.u = r7
            r0.v = r8
            r0.f286361y = r3
            g6e.d r2 = r6.f286368b
            s6e.z r2 = (s6e.z) r2
            java.lang.Object r0 = r2.h(r7, r0)
            if (r0 != r1) goto L5f
        L5e:
            return r1
        L5f:
            r5 = r0
            r0 = r7
            r7 = r8
            r8 = r5
        L63:
            java.util.List r8 = (java.util.List) r8
            boolean r1 = r7 instanceof ks8.i
            if (r1 == 0) goto L6e
            ks8.i r7 = (ks8.i) r7
            com.revolut.retail.core.navigation.FeatureCommand r7 = r7.f189312a
            return r7
        L6e:
            ks8.j$a r1 = ks8.j.a.f189313a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r1)
            if (r7 == 0) goto L81
            com.revolut.retail.core.navigation.FeatureCommand r7 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.subaccount.api.InviteMembersSubaccountFeatureConfig r1 = new com.revolut.feature.subaccount.api.InviteMembersSubaccountFeatureConfig
            r1.<init>(r0, r8)
            r7.<init>(r1)
            return r7
        L81:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v6e.r.d(java.lang.String, gim.c):java.lang.Object");
    }

    public final TransactionListDestination e(ProductAccountId productAccountId, i7 transactionsFilter, q6 scope, AccountId accountId) {
        Intrinsics.checkNotNullParameter(productAccountId, "productAccountId");
        Intrinsics.checkNotNullParameter(transactionsFilter, "transactionsFilter");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByAccounts(new ProductAccountDescriptor$Value.Main(productAccountId, ProductId.SUBACCOUNT), (TransactionContext) null), (String) null, accountId, (rhf.h) null, rhf.g.VAULT_DETAILS, (TransactionDestination) null, scope, (Set) null, com.revolut.feature.subscriptions.models.a.b(accountId), (RecurringPaymentFilter) null, false, 60079));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof v6e.n
            if (r0 == 0) goto L13
            r0 = r5
            v6e.n r0 = (v6e.n) r0
            int r1 = r0.f286362w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286362w = r1
            goto L18
        L13:
            v6e.n r0 = new v6e.n
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286362w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f286362w = r3
            java.lang.Object r5 = r4.g(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v6e.r.f(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
    
        if (r8 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r8) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v6e.r.g(gim.c):java.lang.Object");
    }
}
