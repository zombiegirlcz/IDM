package an4;

import al4.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f6566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wie.a f6567b;

    public k(q creditCardProductInteractor, wie.a creditAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(creditAccountDestinationResolver, "creditAccountDestinationResolver");
        this.f6566a = creditCardProductInteractor;
        this.f6567b = creditAccountDestinationResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof an4.j
            if (r0 == 0) goto L13
            r0 = r9
            an4.j r0 = (an4.j) r0
            int r1 = r0.f6565x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6565x = r1
            goto L18
        L13:
            an4.j r0 = new an4.j
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f6565x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r0 = r0.u
            yhm.o.b(r9)
            goto L81
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L34:
            yhm.o.b(r9)
            goto L46
        L38:
            yhm.o.b(r9)
            r0.f6565x = r4
            al4.q r9 = r8.f6566a
            java.lang.Object r9 = al4.q.c(r9, r0)
            if (r9 != r1) goto L46
            goto L7d
        L46:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L4c:
            boolean r2 = r9.hasNext()
            r4 = 0
            if (r2 == 0) goto L61
            java.lang.Object r2 = r9.next()
            r5 = r2
            yw4.p r5 = (yw4.p) r5
            yw4.l r5 = r5.f317331l
            yw4.l r6 = yw4.l.FULL_ACCESS
            if (r5 != r6) goto L4c
            goto L62
        L61:
            r2 = r4
        L62:
            yw4.p r2 = (yw4.p) r2
            if (r2 == 0) goto L89
            java.lang.String r9 = r2.f317325a
            if (r9 == 0) goto L89
            com.revolut.feature.credit.models.CreditAccountType$CreditCard r2 = new com.revolut.feature.credit.models.CreditAccountType$CreditCard
            r2.<init>(r9)
            r0.u = r9
            r0.f6565x = r3
            rie.a r5 = rie.b.Companion
            wie.a r5 = r8.f6567b
            java.lang.Object r0 = r5.c(r2, r4, r0)
            if (r0 != r1) goto L7e
        L7d:
            return r1
        L7e:
            r7 = r0
            r0 = r9
            r9 = r7
        L81:
            com.revolut.kompot.bridge.navigation.KompotDestination r9 = (com.revolut.kompot.bridge.navigation.KompotDestination) r9
            com.revolut.feature.credit.card.api.navigation.CreditCardTopupDestination r1 = new com.revolut.feature.credit.card.api.navigation.CreditCardTopupDestination
            r1.<init>(r0, r9, r3)
            return r1
        L89:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: an4.k.a(gim.c):java.lang.Object");
    }
}
