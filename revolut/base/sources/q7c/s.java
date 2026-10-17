package q7c;

import k7c.u0;
import k7c.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f242835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f242836b;

    public s(y0 shippingRepository, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(shippingRepository, "shippingRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f242835a = shippingRepository;
        this.f242836b = userInteractor;
    }

    public final vkm.d a(String orderToken, String shippingContactId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(shippingContactId, "shippingContactId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        y0 y0Var = this.f242835a;
        y0Var.getClass();
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(shippingContactId, "shippingContactId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return y0Var.e.b(new u0(orderToken, shippingContactId), loadingStrategy);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof q7c.r
            if (r0 == 0) goto L13
            r0 = r7
            q7c.r r0 = (q7c.r) r0
            int r1 = r0.f242834x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242834x = r1
            goto L18
        L13:
            q7c.r r0 = new q7c.r
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f242834x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L77
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact r6 = r0.u
            yhm.o.b(r7)
            goto L4c
        L38:
            yhm.o.b(r7)
            ang.f r7 = r5.f242836b
            efm.d0 r7 = r7.f(r4)
            r0.u = r6
            r0.f242834x = r4
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4c
            goto L76
        L4c:
            do3.n r7 = (do3.n) r7
            com.revolut.feature.address.models.Address r7 = r7.k
            if (r7 == 0) goto L7a
            com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact r6 = com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact.a(r6, r7)
            r7 = 0
            r0.u = r7
            r0.f242834x = r3
            k7c.y0 r2 = r5.f242835a
            r2.getClass()
            k3k.q0 r3 = new k3k.q0
            r4 = 28
            r3.<init>(r6, r2, r7, r4)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r6, r3, r0)
            if (r6 != r1) goto L72
            goto L74
        L72:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L74:
            if (r6 != r1) goto L77
        L76:
            return r1
        L77:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L7a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Required value was null."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q7c.s.b(com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact, gim.c):java.lang.Object");
    }
}
