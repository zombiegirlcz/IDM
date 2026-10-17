package qgf;

import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.tab.accounts.models.NonProductAccountFilter;
import com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlowContract$InputData;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.i7;
import tof.k2;
import zhm.c0;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements s {

    @NotNull
    public static final t Companion = new t();
    public static final TransactionContext e = new TransactionContext(new Priority.HIGH("Transactions List screen - transactions"), null, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mhf.b f245824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionListFlowContract$InputData f245825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qfe.a f245826c;
    public final gte.a d;

    public x(mhf.b transactionsFilterInteractor, TransactionListFlowContract$InputData inputData, qfe.a accountsTransactionsFilterProvider, rkg.b investFilterMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(transactionsFilterInteractor, "transactionsFilterInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountsTransactionsFilterProvider, "accountsTransactionsFilterProvider");
        Intrinsics.checkNotNullParameter(investFilterMapper, "investFilterMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f245824a = transactionsFilterInteractor;
        this.f245825b = inputData;
        this.f245826c = accountsTransactionsFilterProvider;
        this.d = featureToggleInteractor;
    }

    public static TransactionContext g(TransactionListFlowContract$InputData transactionListFlowContract$InputData) {
        TransactionsListFilterType transactionsListFilterType = transactionListFlowContract$InputData.e;
        if (transactionsListFilterType instanceof TransactionsListFilterType.ByTransactionsFilter) {
            return ((TransactionsListFilterType.ByTransactionsFilter) transactionsListFilterType).f92010b;
        }
        if (transactionsListFilterType instanceof TransactionsListFilterType.ByAccounts) {
            TransactionContext transactionContext = ((TransactionsListFilterType.ByAccounts) transactionsListFilterType).f92008b;
            if (transactionContext != null) {
                return transactionContext;
            }
        } else if (!(transactionsListFilterType instanceof TransactionsListFilterType.NoFilters)) {
            throw new NoWhenBranchMatchedException();
        }
        return e;
    }

    public final i7 a(i7 i7Var, Set set) {
        i7 i7VarA = mhf.b.a(this.f245824a, i7Var, null, set, 2);
        if (i7VarA != null) {
            return i7VarA;
        }
        throw new IllegalArgumentException("Transaction list is not supposed to work with NULL transaction filter");
    }

    public final InvestTransactionsFilter.InvestTransactionsFilterImpl b(Set set) {
        WealthAccountType wealthAccountType;
        ArrayList<NonProductAccountFilter.Invest> arrayList = new ArrayList();
        for (Object obj2 : set) {
            if (obj2 instanceof NonProductAccountFilter.Invest) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList accountTypes = new ArrayList(zhm.w.t(arrayList, 10));
        for (NonProductAccountFilter.Invest invest : arrayList) {
            Intrinsics.checkNotNullParameter(invest, "invest");
            if (Intrinsics.f(invest, NonProductAccountFilter.Invest.Securities.f89724a) || Intrinsics.f(invest, NonProductAccountFilter.Invest.JointSecurities.f89720a)) {
                wealthAccountType = WealthAccountType.SECURITIES;
            } else if (Intrinsics.f(invest, NonProductAccountFilter.Invest.Cfd.f89716a)) {
                wealthAccountType = WealthAccountType.MARGIN;
            } else if (Intrinsics.f(invest, NonProductAccountFilter.Invest.Commodities.f89717a)) {
                wealthAccountType = WealthAccountType.COMMODITIES;
            } else if (Intrinsics.f(invest, NonProductAccountFilter.Invest.Robo.f89723a)) {
                wealthAccountType = WealthAccountType.ROBO;
            } else {
                if (!Intrinsics.f(invest, NonProductAccountFilter.Invest.Isa.f89719a) && !Intrinsics.f(invest, NonProductAccountFilter.Invest.Pea.f89721a) && !Intrinsics.f(invest, NonProductAccountFilter.Invest.PersonalJisa.f89722a) && !(invest instanceof NonProductAccountFilter.Invest.CustodianJisa)) {
                    throw new NoWhenBranchMatchedException();
                }
                wealthAccountType = WealthAccountType.TAA;
            }
            accountTypes.add(wealthAccountType);
        }
        InvestTransactionsFilter.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(accountTypes, "accountTypes");
        return new InvestTransactionsFilter.InvestTransactionsFilterImpl(c0.O(accountTypes), null, null, null, null, null, null, 126);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.transactions.api.navigation.TransactionsListFilterType.ConfigurableFilter.AccountFilters r5, boolean r6, boolean r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof qgf.u
            if (r0 == 0) goto L13
            r0 = r8
            qgf.u r0 = (qgf.u) r0
            int r1 = r0.f245819x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f245819x = r1
            goto L18
        L13:
            qgf.u r0 = new qgf.u
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f245819x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ConfigurableFilter$AccountFilters r5 = r0.u
            yhm.o.b(r8)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r8)
            aim.o r6 = r4.e(r6, r7)
            r0.u = r5
            r0.f245819x = r3
            java.io.Serializable r8 = r4.d(r5, r6, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            tof.i7 r8 = (tof.i7) r8
            if (r8 == 0) goto L53
            com.revolut.feature.transactions.api.filter.TransactionsFilterWithContext r6 = new com.revolut.feature.transactions.api.filter.TransactionsFilterWithContext
            com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlowContract$InputData r7 = r4.f245825b
            com.revolut.domain.interactors.transactions.TransactionContext r7 = g(r7)
            r6.<init>(r8, r7)
            goto L54
        L53:
            r6 = 0
        L54:
            java.util.Set r5 = r5.f92013b
            com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter$InvestTransactionsFilterImpl r5 = r4.b(r5)
            com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter r7 = new com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter
            r7.<init>(r6, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qgf.x.c(com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ConfigurableFilter$AccountFilters, boolean, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(com.revolut.feature.transactions.api.navigation.TransactionsListFilterType.ConfigurableFilter.AccountFilters r9, aim.o r10, gim.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof qgf.v
            if (r0 == 0) goto L13
            r0 = r11
            qgf.v r0 = (qgf.v) r0
            int r1 = r0.f245822y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f245822y = r1
            goto L18
        L13:
            qgf.v r0 = new qgf.v
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f245820w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f245822y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            aim.o r10 = r0.v
            com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ConfigurableFilter$AccountFilters r9 = r0.u
            yhm.o.b(r11)
            goto L55
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            yhm.o.b(r11)
            r11 = r3
            java.util.Set r3 = r9.f92012a
            java.util.Set r4 = r9.f92013b
            r0.u = r9
            r0.v = r10
            r0.f245822y = r11
            qfe.a r11 = r8.f245826c
            r5 = r11
            rhe.m r5 = (rhe.m) r5
            rhe.k r2 = new rhe.k
            r7 = 0
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r11 = skm.e0.G(r2, r0)
            if (r11 != r1) goto L54
            return r1
        L54:
            r10 = r6
        L55:
            tof.i7 r11 = (tof.i7) r11
            if (r11 == 0) goto L5a
            return r11
        L5a:
            com.revolut.feature.transactions.api.kompot.TransactionListApi$Toggles$UnifiedTransactionList r11 = com.revolut.feature.transactions.api.kompot.TransactionListApi$Toggles$UnifiedTransactionList.f91964c
            gte.a r0 = r8.d
            jte.d r0 = (jte.d) r0
            boolean r11 = r0.c(r11)
            r0 = 0
            if (r11 == 0) goto L68
            return r0
        L68:
            tof.i7 r10 = r8.a(r0, r10)
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.util.Set r9 = r9.f92012a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "failed to get filter for: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r11.<init>(r9)
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r0, r0, r11, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qgf.x.d(com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ConfigurableFilter$AccountFilters, aim.o, gim.c):java.io.Serializable");
    }

    public final aim.o e(boolean z, boolean z3) {
        boolean z4 = this.f245825b.i == rhf.g.CHARITY_DETAILS || z;
        aim.o oVar = new aim.o();
        if (z4) {
            oVar.add(k2.NOT_SPARE_CHANGE);
        }
        if (z || z3) {
            oVar.add(k2.NOT_HIDDEN);
        }
        return y0.a(oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r7, boolean r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof qgf.w
            if (r0 == 0) goto L13
            r0 = r9
            qgf.w r0 = (qgf.w) r0
            int r1 = r0.f245823w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f245823w = r1
            goto L18
        L13:
            qgf.w r0 = new qgf.w
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f245823w
            com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlowContract$InputData r3 = r6.f245825b
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r9)
            goto L62
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r9)
            aim.o r7 = r6.e(r7, r8)
            com.revolut.feature.transactions.api.navigation.TransactionsListFilterType r8 = r3.e
            boolean r9 = r8 instanceof com.revolut.feature.transactions.api.navigation.TransactionsListFilterType.ByTransactionsFilter
            if (r9 == 0) goto L48
            com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ByTransactionsFilter r8 = (com.revolut.feature.transactions.api.navigation.TransactionsListFilterType.ByTransactionsFilter) r8
            tof.i7 r8 = r8.f92009a
            tof.i7 r7 = r6.a(r8, r7)
            goto L65
        L48:
            boolean r9 = r8 instanceof com.revolut.feature.transactions.api.navigation.TransactionsListFilterType.NoFilters
            if (r9 == 0) goto L51
            tof.i7 r7 = r6.a(r5, r7)
            goto L65
        L51:
            boolean r9 = r8 instanceof com.revolut.feature.transactions.api.navigation.TransactionsListFilterType.ByAccounts
            if (r9 == 0) goto L8c
            com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ByAccounts r8 = (com.revolut.feature.transactions.api.navigation.TransactionsListFilterType.ByAccounts) r8
            com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ConfigurableFilter$AccountFilters r8 = r8.f92007a
            r0.f245823w = r4
            java.io.Serializable r9 = r6.d(r8, r7, r0)
            if (r9 != r1) goto L62
            return r1
        L62:
            r7 = r9
            tof.i7 r7 = (tof.i7) r7
        L65:
            com.revolut.feature.transactions.api.navigation.TransactionsListFilterType r8 = r3.e
            boolean r9 = r8 instanceof com.revolut.feature.transactions.api.navigation.TransactionsListFilterType.ByAccounts
            if (r9 == 0) goto L6e
            com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ByAccounts r8 = (com.revolut.feature.transactions.api.navigation.TransactionsListFilterType.ByAccounts) r8
            goto L6f
        L6e:
            r8 = r5
        L6f:
            if (r8 == 0) goto L7a
            com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ConfigurableFilter$AccountFilters r8 = r8.f92007a
            java.util.Set r8 = r8.f92013b
            com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter$InvestTransactionsFilterImpl r8 = r6.b(r8)
            goto L7b
        L7a:
            r8 = r5
        L7b:
            if (r7 == 0) goto L86
            com.revolut.feature.transactions.api.filter.TransactionsFilterWithContext r5 = new com.revolut.feature.transactions.api.filter.TransactionsFilterWithContext
            com.revolut.domain.interactors.transactions.TransactionContext r9 = g(r3)
            r5.<init>(r7, r9)
        L86:
            com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter r7 = new com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter
            r7.<init>(r5, r8)
            return r7
        L8c:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qgf.x.f(boolean, boolean, gim.c):java.lang.Object");
    }
}
