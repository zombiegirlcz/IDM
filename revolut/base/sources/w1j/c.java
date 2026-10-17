package w1j;

import djb.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l61.a f293875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f293876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f293877c;

    public c(l61.a userCompanyInteractor, n savingAccountsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(savingAccountsInteractor, "savingAccountsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f293875a = userCompanyInteractor;
        this.f293876b = savingAccountsInteractor;
        this.f293877c = featureToggleInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof w1j.a
            if (r0 == 0) goto L13
            r0 = r8
            w1j.a r0 = (w1j.a) r0
            int r1 = r0.f293872x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f293872x = r1
            goto L18
        L13:
            w1j.a r0 = new w1j.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f293872x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            goto L70
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L5a
        L39:
            yhm.o.b(r8)
            gte.a r8 = r6.f293877c
            com.revolut.feature.payments.api.PaymentsToggles$SavingsAsSourceDisclaimers r2 = com.revolut.feature.payments.api.PaymentsToggles$SavingsAsSourceDisclaimers.f79162c
            boolean r8 = r8.a(r2)
            if (r8 == 0) goto L47
            return r5
        L47:
            l61.a r8 = r6.f293875a
            ang.b r8 = (ang.b) r8
            efm.d0 r8 = r8.a()
            r0.u = r7
            r0.f293872x = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L5a
            goto L6f
        L5a:
            l71.d r8 = (l71.d) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            boolean r8 = l71.f.h(r8)
            if (r8 == 0) goto L7b
            r0.u = r5
            r0.f293872x = r3
            java.lang.Object r8 = r6.b(r7, r0)
            if (r8 != r1) goto L70
        L6f:
            return r1
        L70:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 == 0) goto L7b
            int r7 = com.revolut.retail.feature.balance.picker.impl.R$string.currency_picker_disclaimer_mmf
            goto L7d
        L7b:
            int r7 = com.revolut.retail.feature.balance.picker.impl.R$string.currency_picker_disclaimer_savings
        L7d:
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r0 = 14
            r8.<init>(r7, r5, r5, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w1j.c.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof w1j.b
            if (r0 == 0) goto L13
            r0 = r8
            w1j.b r0 = (w1j.b) r0
            int r1 = r0.f293874x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f293874x = r1
            goto L18
        L13:
            w1j.b r0 = new w1j.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f293874x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L64
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            w4l.j r8 = w4l.j.f294644c
            djb.n r2 = r6.f293876b
            rnb.i r2 = (rnb.i) r2
            djb.k$b r5 = djb.k.b.f115282a
            efm.r r8 = r2.f(r5, r8)
            efm.r r8 = zi0.c.J(r8)
            vv7.l r2 = new vv7.l
            r5 = 23
            r2.<init>(r5)
            efm.r r8 = m70.a.g(r8, r3, r2, r4)
            efm.d0 r8 = r8.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.u = r7
            r0.f293874x = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            ejb.b r8 = (ejb.b) r8
            java.util.List r8 = r8.f126837b
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L6e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r0 = r8.next()
            r1 = r0
            com.revolut.feature.shared.savings.models.SavingsAccountDetails r1 = (com.revolut.feature.shared.savings.models.SavingsAccountDetails) r1
            pcd.s r1 = r1.f86460a
            java.lang.String r1 = r1.f()
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r7)
            if (r1 == 0) goto L6e
            r3 = r0
        L88:
            com.revolut.feature.shared.savings.models.SavingsAccountDetails r3 = (com.revolut.feature.shared.savings.models.SavingsAccountDetails) r3
            r7 = 0
            if (r3 == 0) goto L9d
            com.revolut.feature.shared.savings.models.product.SavingsProductData r8 = r3.f86462c
            if (r8 == 0) goto L9d
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r8 = ocd.a.d(r8)
            if (r8 != r4) goto L9d
            goto L9e
        L9d:
            r4 = r7
        L9e:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w1j.c.b(java.lang.String, gim.c):java.lang.Object");
    }
}
