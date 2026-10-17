package ivb;

import com.revolut.feature.rev_points.exclusive_store.impl.data.network.ExclusiveStoreService;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExclusiveStoreService f168818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f168819b;

    public l(ExclusiveStoreService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f168818a = service;
        this.f168819b = q.b(0, 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, java.lang.String r12, com.revolut.feature.store.core.api.model.StoreProductOption r13, com.revolut.feature.address.models.Address r14, java.lang.String r15, gim.c r16) {
        /*
            r10 = this;
            r1 = r16
            boolean r2 = r1 instanceof ivb.j
            if (r2 == 0) goto L16
            r2 = r1
            ivb.j r2 = (ivb.j) r2
            int r3 = r2.f168814w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f168814w = r3
        L14:
            r7 = r2
            goto L1c
        L16:
            ivb.j r2 = new ivb.j
            r2.<init>(r10, r1)
            goto L14
        L1c:
            java.lang.Object r1 = r7.u
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.f168814w
            r9 = 1
            if (r2 == 0) goto L33
            if (r2 != r9) goto L2b
            yhm.o.b(r1)
            goto L82
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            yhm.o.b(r1)
            hvb.u r1 = new hvb.u
            java.lang.String r2 = r13.f88638a
            if (r2 == 0) goto L88
            java.lang.String r3 = m70.a.l(r2)
            if (r3 == 0) goto L88
            int r4 = r13.f88639b
            if (r14 == 0) goto L50
            no3.b r0 = oo3.a.d(r14)
        L4a:
            r2 = r12
            r6 = r15
            r5 = r0
            r0 = r1
            r1 = r11
            goto L52
        L50:
            r0 = 0
            goto L4a
        L52:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.revolut.feature.rev_points.exclusive_store.impl.data.network.ExclusiveStoreService r1 = r10.f168818a
            efm.d0 r0 = r1.postPurchase(r0)
            iui.a r1 = new iui.a
            r2 = 16
            r1.<init>(r2)
            ivb.i r2 = new ivb.i
            r3 = 1
            r2.<init>(r1, r3)
            r0.getClass()
            ufm.i r1 = new ufm.i
            r1.<init>(r0, r2, r3)
            java.lang.String r0 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            ufm.n r0 = te0.w.i0(r1)
            r7.f168814w = r9
            java.lang.Object r1 = nim.a.b(r0, r7)
            if (r1 != r8) goto L82
            return r8
        L82:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L88:
            com.revolut.feature.rev_points.exclusive_store.impl.data.repository.ExclusiveStoreRepository$QuoteTokenIsNullException r0 = new com.revolut.feature.rev_points.exclusive_store.impl.data.repository.ExclusiveStoreRepository$QuoteTokenIsNullException
            java.lang.String r1 = "productId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            java.lang.String r1 = "quoteToken must not be null for purchasing "
            java.lang.String r3 = ". Try to refresh available options."
            java.lang.String r1 = p.a.p(r1, r12, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ivb.l.a(java.lang.String, java.lang.String, com.revolut.feature.store.core.api.model.StoreProductOption, com.revolut.feature.address.models.Address, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r17, java.lang.String r18, long r19, gim.c r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            r3 = r21
            boolean r4 = r3 instanceof ivb.k
            if (r4 == 0) goto L19
            r4 = r3
            ivb.k r4 = (ivb.k) r4
            int r5 = r4.f168817y
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L19
            int r5 = r5 - r6
            r4.f168817y = r5
            goto L1e
        L19:
            ivb.k r4 = new ivb.k
            r4.<init>(r0, r3)
        L1e:
            java.lang.Object r3 = r4.f168815w
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r4.f168817y
            r7 = 1
            r8 = 2
            if (r6 == 0) goto L41
            if (r6 == r7) goto L3b
            if (r6 != r8) goto L33
            java.lang.Object r1 = r4.u
            yhm.o.b(r3)
            goto La7
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            long r1 = r4.v
            yhm.o.b(r3)
            goto L91
        L41:
            yhm.o.b(r3)
            com.revolut.feature.rev_points.exclusive_store.impl.data.network.ExclusiveStoreService r3 = r0.f168818a
            r6 = r17
            efm.d0 r3 = r3.getPurchaseStatus(r6)
            ik3.a r6 = new ik3.a
            r9 = 11
            r11 = r18
            r6.<init>(r11, r9)
            ivb.i r9 = new ivb.i
            r10 = 0
            r9.<init>(r6, r10)
            r3.getClass()
            ufm.i r6 = new ufm.i
            r10 = 1
            r6.<init>(r3, r9, r10)
            java.lang.String r3 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            iui.b r3 = new iui.b
            r9 = 12
            r3.<init>(r9)
            ufm.i r3 = mra.d.H(r6, r1, r3)
            fvb.f r10 = new fvb.f
            fvb.e r12 = fvb.e.FAILED
            r14 = 0
            r15 = 0
            r13 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            pfm.z r3 = ue0.e.F(r3, r10)
            ufm.n r3 = te0.w.i0(r3)
            r4.v = r1
            r4.f168817y = r7
            java.lang.Object r3 = nim.a.b(r3, r4)
            if (r3 != r5) goto L91
            goto La5
        L91:
            r6 = r3
            fvb.f r6 = (fvb.f) r6
            kotlin.jvm.internal.Intrinsics.h(r6)
            r4.u = r3
            r4.v = r1
            r4.f168817y = r8
            vkm.z1 r1 = r0.f168819b
            java.lang.Object r1 = r1.emit(r6, r4)
            if (r1 != r5) goto La6
        La5:
            return r5
        La6:
            r1 = r3
        La7:
            java.lang.String r2 = "also(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ivb.l.b(java.lang.String, java.lang.String, long, gim.c):java.lang.Object");
    }
}
