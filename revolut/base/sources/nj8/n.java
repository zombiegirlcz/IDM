package nj8;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n33.r0;
import nhg.f0;
import pfm.z;
import r10.q;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class n implements hj8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f216409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qj8.b f216410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jla.h f216411c;
    public final q d;

    public n(ang.f userInteractor, qj8.b repository, jla.h productCatalogueInteractor, q userRegisteredIdentitiesInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        this.f216409a = userInteractor;
        this.f216410b = repository;
        this.f216411c = productCatalogueInteractor;
        this.d = userRegisteredIdentitiesInteractor;
    }

    public final r0 f(w4l.k kVar) {
        return new r0(mo3.a.g(this.f216409a.j(kVar), null, new nij.d(1), 1), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (((qj8.j) r5.f216410b).b(r6, (java.lang.String) r8, r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r6, w4l.h r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof nj8.d
            if (r0 == 0) goto L13
            r0 = r8
            nj8.d r0 = (nj8.d) r0
            int r1 = r0.f216387y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f216387y = r1
            goto L18
        L13:
            nj8.d r0 = new nj8.d
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f216385w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f216387y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            w4l.h r7 = r0.v
            java.lang.String r6 = r0.u
            yhm.o.b(r8)
            goto L50
        L3a:
            yhm.o.b(r8)
            w4l.h r8 = w4l.h.f294642c
            n33.r0 r8 = r5.f(r8)
            r0.u = r6
            r0.v = r7
            r0.f216387y = r4
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L50
            goto L63
        L50:
            java.lang.String r8 = (java.lang.String) r8
            r2 = 0
            r0.u = r2
            r0.v = r2
            r0.f216387y = r3
            qj8.b r2 = r5.f216410b
            qj8.j r2 = (qj8.j) r2
            java.lang.Object r6 = r2.b(r6, r8, r7, r0)
            if (r6 != r1) goto L64
        L63:
            return r1
        L64:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nj8.n.g(java.lang.String, w4l.h, gim.c):java.lang.Object");
    }

    public final z h() {
        d0 d0VarFirstOrError = rd0.e.c(mo3.a.e(nim.a.v(l(w4l.h.f294642c), new f0(11)), new nij.d(2), new nij.d(3)), kotlin.coroutines.g.f186406a).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return ue0.e.F(d0VarFirstOrError, h0.f322473a);
    }

    public final ufm.i i(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        d0 d0VarFirstOrError = zi0.c.q(rd0.e.c(vkm.q.Q(f(w4l.h.f294642c), new e(null, this, 0)), kotlin.coroutines.g.f186406a), zhm.f0.f322471a).firstOrError();
        nd3.a aVar = new nd3.a(new b(code, 1), 20);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final Flow j() {
        w4l.j loadingStrategy = w4l.j.f294644c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return boh.f.e(nim.a.v(q.j0(this.d, do3.f.BANKING, null, 2), new f0(12)), new nfj.l(this, 15));
    }

    public final wkm.l k(String str, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.Q(str != null ? new go.g(str, 2) : f(loadingStrategy), new h(null, this, loadingStrategy, 0));
    }

    public final wkm.l l(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.Q(new ae8.c(bla.b.b(this.f216411c, ne8.a.f214420c.a()), 16), new h(null, this, loadingStrategy, 1));
    }

    public final akg.n m(String str, w4l.k kVar) {
        return nim.a.v(((qj8.j) this.f216410b).c(str, kVar), new f0(this, 10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(boolean r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof nj8.k
            if (r0 == 0) goto L13
            r0 = r7
            nj8.k r0 = (nj8.k) r0
            int r1 = r0.f216402y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f216402y = r1
            goto L18
        L13:
            nj8.k r0 = new nj8.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f216400w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f216402y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L6b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            boolean r6 = r0.u
            qj8.b r2 = r0.v
            yhm.o.b(r7)
            goto L52
        L3a:
            yhm.o.b(r7)
            w4l.i r7 = w4l.i.f294643c
            n33.r0 r7 = r5.f(r7)
            qj8.b r2 = r5.f216410b
            r0.v = r2
            r0.u = r6
            r0.f216402y = r4
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L52
            goto L6a
        L52:
            java.lang.String r7 = (java.lang.String) r7
            r4 = 0
            r0.v = r4
            r0.u = r6
            r0.f216402y = r3
            qj8.j r2 = (qj8.j) r2
            x4l.c r2 = r2.f246792h
            java.lang.Object r6 = r2.d(r7, r6, r0)
            if (r6 != r1) goto L66
            goto L68
        L66:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L68:
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nj8.n.n(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r12 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r12, ij8.d r13, kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof nj8.l
            if (r0 == 0) goto L13
            r0 = r14
            nj8.l r0 = (nj8.l) r0
            int r1 = r0.f216405y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f216405y = r1
            goto L18
        L13:
            nj8.l r0 = new nj8.l
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f216403w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f216405y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r14)
            goto L7b
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            ij8.d r13 = r0.v
            java.lang.String r12 = r0.u
            yhm.o.b(r14)
        L39:
            r6 = r12
            r7 = r13
            goto L52
        L3c:
            yhm.o.b(r14)
            w4l.h r14 = w4l.h.f294642c
            n33.r0 r14 = r11.f(r14)
            r0.u = r12
            r0.v = r13
            r0.f216405y = r4
            java.lang.Object r14 = vkm.q.x(r14, r0)
            if (r14 != r1) goto L39
            goto L7a
        L52:
            r8 = r14
            java.lang.String r8 = (java.lang.String) r8
            r12 = 0
            r0.u = r12
            r0.v = r12
            r0.f216405y = r3
            qj8.b r12 = r11.f216410b
            r5 = r12
            qj8.j r5 = (qj8.j) r5
            r5.getClass()
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            qg7.p r4 = new qg7.p
            r9 = 0
            r10 = 1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.Object r12 = skm.e0.J(r12, r4, r0)
            if (r12 != r1) goto L76
            goto L78
        L76:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L78:
            if (r12 != r1) goto L7b
        L7a:
            return r1
        L7b:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: nj8.n.o(java.lang.String, ij8.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r12 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r12, ij8.c r13, gim.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof nj8.m
            if (r0 == 0) goto L13
            r0 = r14
            nj8.m r0 = (nj8.m) r0
            int r1 = r0.f216408y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f216408y = r1
            goto L18
        L13:
            nj8.m r0 = new nj8.m
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f216406w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f216408y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r14)
            goto L7b
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            ij8.c r13 = r0.v
            java.lang.String r12 = r0.u
            yhm.o.b(r14)
        L39:
            r6 = r12
            r7 = r13
            goto L52
        L3c:
            yhm.o.b(r14)
            w4l.h r14 = w4l.h.f294642c
            n33.r0 r14 = r11.f(r14)
            r0.u = r12
            r0.v = r13
            r0.f216408y = r4
            java.lang.Object r14 = vkm.q.x(r14, r0)
            if (r14 != r1) goto L39
            goto L7a
        L52:
            r8 = r14
            java.lang.String r8 = (java.lang.String) r8
            r12 = 0
            r0.u = r12
            r0.v = r12
            r0.f216408y = r3
            qj8.b r12 = r11.f216410b
            r5 = r12
            qj8.j r5 = (qj8.j) r5
            r5.getClass()
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            qg7.p r4 = new qg7.p
            r9 = 0
            r10 = 2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.Object r12 = skm.e0.J(r12, r4, r0)
            if (r12 != r1) goto L76
            goto L78
        L76:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L78:
            if (r12 != r1) goto L7b
        L7a:
            return r1
        L7b:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: nj8.n.p(java.lang.String, ij8.c, gim.c):java.lang.Object");
    }
}
