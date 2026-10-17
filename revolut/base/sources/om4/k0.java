package om4;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp4.c1 f226612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al4.p f226613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al4.q f226614c;

    public k0(dp4.c1 creditCardRepository, al4.p creditCardProductFeatureTogglesInteractor, al4.q creditCardProductInteractor) {
        Intrinsics.checkNotNullParameter(creditCardRepository, "creditCardRepository");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        this.f226612a = creditCardRepository;
        this.f226613b = creditCardProductFeatureTogglesInteractor;
        this.f226614c = creditCardProductInteractor;
    }

    public final cxe.u a(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return n14.k.p(xam.a.h(new h0(zhm.f0.f322471a, null, this, facilityId, loadingStrategy, 0), ((qx4.f) this.f226613b).j()), new okk.d(25));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, yw4.f r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof om4.i0
            if (r0 == 0) goto L13
            r0 = r8
            om4.i0 r0 = (om4.i0) r0
            int r1 = r0.f226598w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226598w = r1
            goto L18
        L13:
            om4.i0 r0 = new om4.i0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226598w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L5f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r8)
            w4l.j r8 = w4l.j.f294644c
            akg.n r6 = r5.c(r6, r7, r8)
            zhm.h0 r7 = zhm.h0.f322473a
            vkm.q0 r6 = rd0.e.n(r6, r7)
            ol6.b r7 = new ol6.b
            r8 = 7
            r7.<init>(r8)
            r8 = 0
            jhi.b r6 = mo3.a.g(r6, r8, r7, r3)
            n28.b r7 = new n28.b
            r2 = 3
            r4 = 18
            r7.<init>(r2, r4, r8)
            vkm.y r8 = new vkm.y
            r8.<init>(r6, r7)
            r0.f226598w = r3
            java.lang.Object r8 = vkm.q.z(r8, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r8, r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.k0.b(java.lang.String, yw4.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final akg.n c(String facilityId, yw4.f feature, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(a(facilityId, loadingStrategy), new ok7.c(feature, 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, yw4.f r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof om4.j0
            if (r0 == 0) goto L13
            r0 = r9
            om4.j0 r0 = (om4.j0) r0
            int r1 = r0.f226606y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226606y = r1
            goto L18
        L13:
            om4.j0 r0 = new om4.j0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f226604w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226606y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L7d
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yw4.f r8 = r0.v
            java.lang.String r7 = r0.u
            yhm.o.b(r9)
            goto L4c
        L3a:
            yhm.o.b(r9)
            r0.u = r7
            r0.v = r8
            r0.f226606y = r4
            al4.q r9 = r6.f226614c
            java.lang.Object r9 = al4.q.c(r9, r0)
            if (r9 != r1) goto L4c
            goto L7c
        L4c:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L52:
            boolean r2 = r9.hasNext()
            r4 = 0
            if (r2 == 0) goto L69
            java.lang.Object r2 = r9.next()
            r5 = r2
            yw4.p r5 = (yw4.p) r5
            java.lang.String r5 = r5.f317326b
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r7, r5)
            if (r5 == 0) goto L52
            goto L6a
        L69:
            r2 = r4
        L6a:
            yw4.p r2 = (yw4.p) r2
            if (r2 == 0) goto L84
            java.lang.String r7 = r2.f317325a
            r0.u = r4
            r0.v = r4
            r0.f226606y = r3
            java.lang.Object r9 = r6.b(r7, r8, r0)
            if (r9 != r1) goto L7d
        L7c:
            return r1
        L7d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            goto L85
        L84:
            r7 = 0
        L85:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.k0.d(java.lang.String, yw4.f, gim.c):java.lang.Object");
    }

    public final Object e(yw4.f fVar, gim.c cVar) {
        return skm.e0.o(new nyd.j(this, fVar, (Continuation) null, 25), cVar);
    }
}
