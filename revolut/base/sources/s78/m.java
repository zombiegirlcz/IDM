package s78;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ssi.o;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f260585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f260586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m78.d f260587c;
    public final ne0.j d;
    public final q78.e e;

    public m(wsg.b walletInteractor, o transactionsWidgetUiModel, m78.d juniorTransactionsInteractor, ne0.j memoryCache, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transactionsWidgetUiModel, "transactionsWidgetUiModel");
        Intrinsics.checkNotNullParameter(juniorTransactionsInteractor, "juniorTransactionsInteractor");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f260585a = walletInteractor;
        this.f260586b = transactionsWidgetUiModel;
        this.f260587c = juniorTransactionsInteractor;
        this.d = memoryCache;
        this.e = juniorAccountDestinationResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(s78.m r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, com.revolut.feature.tab.accounts.models.ProductAccountId r25, gim.c r26) {
        /*
            r0 = r21
            r1 = r22
            r2 = r26
            boolean r3 = r2 instanceof s78.j
            if (r3 == 0) goto L19
            r3 = r2
            s78.j r3 = (s78.j) r3
            int r4 = r3.f260580y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f260580y = r4
            goto L1e
        L19:
            s78.j r3 = new s78.j
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f260578w
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f260580y
            r6 = 1
            if (r5 == 0) goto L39
            if (r5 != r6) goto L31
            java.lang.String r0 = r3.v
            java.lang.String r1 = r3.u
            yhm.o.b(r2)
            goto L54
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            yhm.o.b(r2)
            r3.u = r1
            r2 = r23
            r3.v = r2
            r3.f260580y = r6
            r5 = r24
            r6 = r25
            java.lang.Object r0 = r0.b(r1, r5, r6, r3)
            if (r0 != r4) goto L4f
            return r4
        L4f:
            r20 = r2
            r2 = r0
            r0 = r20
        L54:
            r8 = r2
            com.revolut.feature.transactions.api.navigation.TransactionsListFilterType r8 = (com.revolut.feature.transactions.api.navigation.TransactionsListFilterType) r8
            rhf.g r12 = rhf.g.JUNIOR_HOME
            com.revolut.feature.subscriptions.models.RecurringPaymentAccount$Junior r2 = new com.revolut.feature.subscriptions.models.RecurringPaymentAccount$Junior
            r2.<init>(r1, r0)
            com.revolut.feature.transactions.api.navigation.TransactionListDestination$InputData r3 = new com.revolut.feature.transactions.api.navigation.TransactionListDestination$InputData
            r7 = 0
            r18 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 61167(0xeeef, float:8.5713E-41)
            r16 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.revolut.feature.transactions.api.navigation.TransactionListDestination r0 = new com.revolut.feature.transactions.api.navigation.TransactionListDestination
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s78.m.a(s78.m, java.lang.String, java.lang.String, java.lang.String, com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, java.lang.String r9, com.revolut.feature.tab.accounts.models.ProductAccountId r10, gim.c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof s78.k
            if (r0 == 0) goto L14
            r0 = r11
            s78.k r0 = (s78.k) r0
            int r1 = r0.f260581w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f260581w = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            s78.k r0 = new s78.k
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f260581w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r11)
            goto L44
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r11)
            r5.f260581w = r2
            q78.e r1 = r7.e
            r6 = 8
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.Object r11 = u68.b.a(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto L44
            return r0
        L44:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r11 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main) r11
            if (r11 == 0) goto L4f
            com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ByAccounts r8 = new com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ByAccounts
            r9 = 0
            r8.<init>(r11, r9)
            return r8
        L4f:
            com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$NoFilters r8 = com.revolut.feature.transactions.api.navigation.TransactionsListFilterType.NoFilters.f92015a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s78.m.b(java.lang.String, java.lang.String, com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }
}
