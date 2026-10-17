package hg2;

import kotlin.jvm.internal.Intrinsics;
import uy1.o;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final co9.b f152067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f152068b;

    public e(co9.b paymentCounterpartyInteractor, o aliasResolveInteractor) {
        Intrinsics.checkNotNullParameter(paymentCounterpartyInteractor, "paymentCounterpartyInteractor");
        Intrinsics.checkNotNullParameter(aliasResolveInteractor, "aliasResolveInteractor");
        this.f152067a = paymentCounterpartyInteractor;
        this.f152068b = aliasResolveInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof hg2.d
            if (r0 == 0) goto L13
            r0 = r8
            hg2.d r0 = (hg2.d) r0
            int r1 = r0.f152066w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f152066w = r1
            goto L18
        L13:
            hg2.d r0 = new hg2.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f152066w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L8c
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            goto L44
        L36:
            yhm.o.b(r8)
            r0.f152066w = r4
            uy1.o r8 = r6.f152068b
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L44
            goto L8b
        L44:
            a02.i r8 = (a02.i) r8
            a02.c r7 = a02.c.f109a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r8, r7)
            if (r7 != 0) goto La9
            boolean r7 = r8 instanceof a02.g
            if (r7 != 0) goto La2
            boolean r7 = r8 instanceof a02.h
            if (r7 == 0) goto L9c
            a02.h r8 = (a02.h) r8
            a02.b r7 = r8.f113a
            com.revolut.feature.apm.core.models.alias.beneficiary.AliasMerchant r2 = r7.f108c
            if (r2 == 0) goto L64
            hg2.a r7 = new hg2.a
            r7.<init>(r2)
            return r7
        L64:
            co9.b r2 = r6.f152067a
            java.lang.String r7 = r7.f107b
            kotlinx.coroutines.flow.Flow r7 = r2.d(r7)
            hb6.g r2 = new hb6.g
            r5 = 20
            r2.<init>(r5)
            r5 = 0
            jhi.b r7 = mo3.a.g(r7, r5, r2, r4)
            hcj.o r2 = new hcj.o
            r2.<init>(r6, r8, r5)
            zhm.h0 r8 = zhm.h0.f322473a
            vkm.y r7 = rd0.e.e(r7, r8, r2)
            r0.f152066w = r3
            java.lang.Object r8 = vkm.q.z(r7, r0)
            if (r8 != r1) goto L8c
        L8b:
            return r1
        L8c:
            com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo r8 = (com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo) r8
            if (r8 == 0) goto L96
            hg2.b r7 = new hg2.b
            r7.<init>(r8)
            return r7
        L96:
            com.revolut.feature.apm.core.models.alias.error.AliasNotFoundException r7 = new com.revolut.feature.apm.core.models.alias.error.AliasNotFoundException
            r7.<init>()
            throw r7
        L9c:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        La2:
            a02.g r8 = (a02.g) r8
            java.lang.Throwable r7 = r8.getError()
            throw r7
        La9:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "UPI should require Alias Resolve"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hg2.e.a(com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias, gim.c):java.lang.Object");
    }
}
