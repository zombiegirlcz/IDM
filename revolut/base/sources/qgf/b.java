package qgf;

import com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlowContract$InputData;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f245792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rgf.y f245793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransactionsListFilterType f245794c;

    public b(com.revolut.domain.interactors.transactions.a transactionsInteractor, rgf.y allAccountsTransactionsScopeProvider, TransactionListFlowContract$InputData input) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(allAccountsTransactionsScopeProvider, "allAccountsTransactionsScopeProvider");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f245792a = transactionsInteractor;
        this.f245793b = allAccountsTransactionsScopeProvider;
        this.f245794c = input.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        if (nim.a.a(r9, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof qgf.a
            if (r0 == 0) goto L13
            r0 = r9
            qgf.a r0 = (qgf.a) r0
            int r1 = r0.f245791w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f245791w = r1
            goto L18
        L13:
            qgf.a r0 = new qgf.a
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f245791w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            goto Lb5
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            yhm.o.b(r9)
            goto L75
        L37:
            yhm.o.b(r9)
            com.revolut.feature.transactions.api.navigation.TransactionsListFilterType r9 = r8.f245794c
            boolean r2 = r9 instanceof com.revolut.feature.transactions.api.navigation.TransactionsListFilterType.ByAccounts
            r5 = 0
            if (r2 == 0) goto L44
            com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ByAccounts r9 = (com.revolut.feature.transactions.api.navigation.TransactionsListFilterType.ByAccounts) r9
            goto L45
        L44:
            r9 = r5
        L45:
            if (r9 == 0) goto L4d
            com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ConfigurableFilter$AccountFilters r9 = r9.f92007a
            if (r9 == 0) goto L4d
            java.util.Set r5 = r9.f92013b
        L4d:
            if (r5 != 0) goto L51
            zhm.h0 r5 = zhm.h0.f322473a
        L51:
            rgf.y r9 = r8.f245793b
            r9.getClass()
            java.lang.String r2 = "additionalFilters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            rgf.w r2 = r9.f254182a
            sfe.a r6 = sfe.a.FULL
            qfe.j r7 = qfe.j.f245295a
            kotlinx.coroutines.flow.Flow r2 = r2.a(r6, r7)
            mle.x r6 = new mle.x
            r7 = 21
            r6.<init>(r2, r9, r5, r7)
            r0.f245791w = r4
            java.lang.Object r9 = vkm.q.z(r6, r0)
            if (r9 != r1) goto L75
            goto Lb4
        L75:
            java.util.Set r9 = (java.util.Set) r9
            if (r9 != 0) goto L7c
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L7c:
            java.util.Collection r9 = (java.util.Collection) r9
            r2 = 0
            tof.q6[] r4 = new tof.q6[r2]
            java.lang.Object[] r4 = r9.toArray(r4)
            tof.q6[] r4 = (tof.q6[]) r4
            int r5 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            tof.q6[] r4 = (tof.q6[]) r4
            com.revolut.domain.interactors.transactions.a r5 = r8.f245792a
            mjf.b0 r5 = (mjf.b0) r5
            r5.t(r4)
            tof.q6[] r2 = new tof.q6[r2]
            java.lang.Object[] r9 = r9.toArray(r2)
            tof.q6[] r9 = (tof.q6[]) r9
            int r2 = r9.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r2)
            tof.q6[] r9 = (tof.q6[]) r9
            pfm.r r9 = r5.g(r9)
            pfm.a r9 = ue0.e.v(r9)
            r0.f245791w = r3
            java.lang.Object r9 = nim.a.a(r9, r0)
            if (r9 != r1) goto Lb5
        Lb4:
            return r1
        Lb5:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qgf.b.a(gim.c):java.lang.Object");
    }
}
