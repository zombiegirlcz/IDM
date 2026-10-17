package b6d;

import a08.s;
import b4b.z;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xvh.a;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements xvh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e6d.r f12732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl2.a f12733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zjh.f f12734c;

    public r(e6d.r repository, dl2.a autoInvestOwnerIdProvider, zjh.f portfolioRepository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(autoInvestOwnerIdProvider, "autoInvestOwnerIdProvider");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        this.f12732a = repository;
        this.f12733b = autoInvestOwnerIdProvider;
        this.f12734c = portfolioRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r13 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r11, int r12, gim.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof b6d.e
            if (r0 == 0) goto L13
            r0 = r13
            b6d.e r0 = (b6d.e) r0
            int r1 = r0.f12715y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12715y = r1
            goto L18
        L13:
            b6d.e r0 = new b6d.e
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f12713w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12715y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            e6d.r r11 = r0.u
            yhm.o.b(r13)
            goto L6c
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            int r12 = r0.v
            yhm.o.b(r13)
            goto L5d
        L3a:
            yhm.o.b(r13)
            r0.v = r12
            r0.f12715y = r4
            e6d.s r4 = new e6d.s
            r9 = 0
            zjh.f r5 = r10.f12734c
            r8 = 0
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L57
            goto L59
        L57:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L59:
            if (r11 != r1) goto L5c
            goto L6b
        L5c:
            r12 = r7
        L5d:
            e6d.r r11 = r10.f12732a
            r0.u = r11
            r0.v = r12
            r0.f12715y = r3
            java.lang.Object r13 = r10.f(r0)
            if (r13 != r1) goto L6c
        L6b:
            return r1
        L6c:
            java.lang.String r13 = (java.lang.String) r13
            efm.b r11 = r11.c(r13)
            com.revolut.core.extensions.rx.BreadcrumbException r12 = new com.revolut.core.extensions.rx.BreadcrumbException
            r12.<init>()
            a2i.j r13 = new a2i.j
            r0 = 25
            r13.<init>(r12, r0)
            a08.s r12 = new a08.s
            r0 = 4
            r12.<init>(r0, r13)
            pfm.a r13 = new pfm.a
            r13.<init>(r11, r12, r3)
            java.lang.String r11 = "onErrorResumeNext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r11)
            b6d.d r11 = b6d.d.f12712a
            a08.r r12 = new a08.r
            r0 = 7
            r12.<init>(r0, r11)
            b6d.c r11 = b6d.c.f12711a
            ofm.h r11 = r13.w(r12, r11)
            java.lang.String r12 = "subscribe(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b6d.r.d(java.lang.String, int, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof b6d.h
            if (r0 == 0) goto L13
            r0 = r8
            b6d.h r0 = (b6d.h) r0
            int r1 = r0.f12719x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12719x = r1
            goto L18
        L13:
            b6d.h r0 = new b6d.h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12719x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            e6d.r r7 = r0.u
            yhm.o.b(r8)
            goto L63
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            goto L56
        L38:
            yhm.o.b(r8)
            r0.f12719x = r4
            e6d.t r8 = new e6d.t
            r2 = 0
            r4 = 0
            zjh.f r5 = r6.f12734c
            r8.<init>(r2, r7, r4, r5)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r8, r0)
            if (r7 != r1) goto L51
            goto L53
        L51:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L53:
            if (r7 != r1) goto L56
            goto L62
        L56:
            e6d.r r7 = r6.f12732a
            r0.u = r7
            r0.f12719x = r3
            java.lang.Object r8 = r6.f(r0)
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            java.lang.String r8 = (java.lang.String) r8
            efm.b r7 = r7.c(r8)
            com.revolut.core.extensions.rx.BreadcrumbException r8 = new com.revolut.core.extensions.rx.BreadcrumbException
            r8.<init>()
            a2i.j r0 = new a2i.j
            r1 = 26
            r0.<init>(r8, r1)
            a08.s r8 = new a08.s
            r1 = 4
            r8.<init>(r1, r0)
            pfm.a r0 = new pfm.a
            r0.<init>(r7, r8, r3)
            java.lang.String r7 = "onErrorResumeNext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)
            b6d.g r7 = b6d.g.f12717a
            a08.r r8 = new a08.r
            r1 = 7
            r8.<init>(r1, r7)
            b6d.f r7 = b6d.f.f12716a
            ofm.h r7 = r0.w(r8, r7)
            java.lang.String r8 = "subscribe(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b6d.r.e(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof b6d.i
            if (r0 == 0) goto L13
            r0 = r6
            b6d.i r0 = (b6d.i) r0
            int r1 = r0.f12720w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12720w = r1
            goto L18
        L13:
            b6d.i r0 = new b6d.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12720w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4e
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            efm.r r6 = r5.j()
            b6d.a r2 = new b6d.a
            r4 = 2
            r2.<init>(r4)
            r4 = 0
            efm.r r6 = m70.a.g(r6, r4, r2, r3)
            vkm.d r6 = rd0.e.b(r6)
            r0.f12720w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            java.lang.String r0 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b6d.r.f(gim.c):java.lang.Object");
    }

    public final ufm.i g(xvh.a filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        int i = 1;
        d0 d0VarFirstOrError = m70.a.g(m(filter), null, new a(i), 1).firstOrError();
        b0a.h hVar = new b0a.h(14, new b(this, filter, i));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, hVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof b6d.l
            if (r0 == 0) goto L13
            r0 = r8
            b6d.l r0 = (b6d.l) r0
            int r1 = r0.f12724x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12724x = r1
            goto L18
        L13:
            b6d.l r0 = new b6d.l
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12724x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            e6d.r r7 = r0.u
            yhm.o.b(r8)
            goto L62
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            goto L55
        L38:
            yhm.o.b(r8)
            r0.f12724x = r4
            e6d.t r8 = new e6d.t
            r2 = 0
            zjh.f r5 = r6.f12734c
            r8.<init>(r4, r7, r2, r5)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r8, r0)
            if (r7 != r1) goto L50
            goto L52
        L50:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L52:
            if (r7 != r1) goto L55
            goto L61
        L55:
            e6d.r r7 = r6.f12732a
            r0.u = r7
            r0.f12724x = r3
            java.lang.Object r8 = r6.f(r0)
            if (r8 != r1) goto L62
        L61:
            return r1
        L62:
            java.lang.String r8 = (java.lang.String) r8
            efm.b r7 = r7.c(r8)
            com.revolut.core.extensions.rx.BreadcrumbException r8 = new com.revolut.core.extensions.rx.BreadcrumbException
            r8.<init>()
            a2i.j r0 = new a2i.j
            r1 = 27
            r0.<init>(r8, r1)
            a08.s r8 = new a08.s
            r1 = 4
            r8.<init>(r1, r0)
            pfm.a r0 = new pfm.a
            r0.<init>(r7, r8, r3)
            java.lang.String r7 = "onErrorResumeNext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)
            b6d.k r7 = b6d.k.f12722a
            a08.r r8 = new a08.r
            r1 = 7
            r8.<init>(r1, r7)
            b6d.j r7 = b6d.j.f12721a
            ofm.h r7 = r0.w(r8, r7)
            java.lang.String r8 = "subscribe(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b6d.r.h(java.lang.String, gim.c):java.lang.Object");
    }

    public final efm.r i(xvh.a filter, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return pd.b.r(m(filter), new b4d.c(this, 4, filter, loadingStrategy));
    }

    public final efm.r j() {
        return rd0.e.c(nim.a.v(this.f12733b.f115694a.j(w4l.h.f294642c), new dkk.m(23)), kotlin.coroutines.g.f186406a);
    }

    public final void k() {
        a.b filter = a.b.f309269a;
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(filter, "filter");
        d0 d0VarFirstOrError = m70.a.g(m(filter), null, new a(3), 1).firstOrError();
        b0a.h hVar = new b0a.h(15, new z(this, 16));
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, hVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        pfm.a aVar2 = new pfm.a(ue0.e.v(aVar), new s(4, new a2i.j(new BreadcrumbException(), 28)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullExpressionValue(aVar2.w(new a08.r(7, n.f12726a), m.f12725a), "subscribe(...)");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ufm.n l(yvh.b r12) {
        /*
            r11 = this;
            java.lang.String r0 = "autoinvest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            e6d.r r1 = r11.f12732a
            r1.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            com.revolut.feature.shared.autoinvest.impl.network.AutoInvestService r0 = r1.f122986a
            java.lang.String r2 = r12.f317176a
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
            d6d.a r4 = new d6d.a
            boolean r5 = r12.f317177b
            java.lang.String r3 = r12.f317178c
            java.lang.String r6 = r12.d
            yvh.h r7 = r12.e
            r8 = 0
            if (r3 == 0) goto L34
            if (r7 == 0) goto L2a
            java.lang.String r7 = r7.b()
            goto L2b
        L2a:
            r7 = r8
        L2b:
            if (r7 == 0) goto L34
            d6d.e r9 = new d6d.e
            r9.<init>(r3, r6, r7)
            r6 = r9
            goto L35
        L34:
            r6 = r8
        L35:
            yvh.f r3 = r12.f
            d6d.d r7 = c6d.b.K(r3)
            dj0.d r3 = r12.f317179g
            if (r3 == 0) goto L43
            jo3.a r8 = mo3.a.p(r3)
        L43:
            java.lang.Float r9 = r12.i
            java.lang.Float r10 = r12.f317180h
            r4.<init>(r5, r6, r7, r8, r9, r10)
            efm.d0 r12 = r0.updateAutoInvest(r2, r4)
            ufm.i r12 = e6d.r.a(r12)
            e6d.k r0 = e6d.k.f
            dug.e r0 = new dug.e
            r2 = 8
            r0.<init>(r2)
            ufm.i r2 = new ufm.i
            r3 = 1
            r2.<init>(r12, r0, r3)
            java.lang.String r12 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r12)
            ufm.i r0 = r1.d(r2)
            e6d.m r2 = e6d.m.f
            dug.e r2 = new dug.e
            r4 = 7
            r2.<init>(r4)
            ufm.i r4 = new ufm.i
            r4.<init>(r0, r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r12)
            e6d.a r12 = new e6d.a
            r0 = 6
            r12.<init>(r1, r0)
            e31.e r0 = new e31.e
            r1 = 25
            r0.<init>(r1, r12)
            ufm.f r12 = new ufm.f
            r1 = 3
            r12.<init>(r4, r0, r1)
            java.lang.String r0 = "doOnSuccess(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            ufm.n r12 = te0.w.i0(r12)
            ufm.n r12 = te0.w.i0(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b6d.r.l(yvh.b):ufm.n");
    }

    public final efm.r m(xvh.a aVar) {
        if (!Intrinsics.f(aVar, a.C1716a.f309267a) && !Intrinsics.f(aVar, a.b.f309269a) && !Intrinsics.f(aVar, a.c.f309271a)) {
            if (aVar instanceof xvh.b) {
                return zi0.c.j(((xvh.b) aVar).f309273a);
            }
            throw new NoWhenBranchMatchedException();
        }
        return j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r13 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.String r11, int r12, gim.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof b6d.q
            if (r0 == 0) goto L13
            r0 = r13
            b6d.q r0 = (b6d.q) r0
            int r1 = r0.f12731y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12731y = r1
            goto L18
        L13:
            b6d.q r0 = new b6d.q
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f12729w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12731y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            e6d.r r11 = r0.u
            yhm.o.b(r13)
            goto L6c
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            int r12 = r0.v
            yhm.o.b(r13)
            goto L5d
        L3a:
            yhm.o.b(r13)
            r0.v = r12
            r0.f12731y = r4
            e6d.s r4 = new e6d.s
            r8 = 0
            r9 = 1
            zjh.f r5 = r10.f12734c
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L57
            goto L59
        L57:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L59:
            if (r11 != r1) goto L5c
            goto L6b
        L5c:
            r12 = r7
        L5d:
            e6d.r r11 = r10.f12732a
            r0.u = r11
            r0.v = r12
            r0.f12731y = r3
            java.lang.Object r13 = r10.f(r0)
            if (r13 != r1) goto L6c
        L6b:
            return r1
        L6c:
            java.lang.String r13 = (java.lang.String) r13
            efm.b r11 = r11.c(r13)
            com.revolut.core.extensions.rx.BreadcrumbException r12 = new com.revolut.core.extensions.rx.BreadcrumbException
            r12.<init>()
            a2i.j r13 = new a2i.j
            r0 = 29
            r13.<init>(r12, r0)
            a08.s r12 = new a08.s
            r0 = 4
            r12.<init>(r0, r13)
            pfm.a r13 = new pfm.a
            r13.<init>(r11, r12, r3)
            java.lang.String r11 = "onErrorResumeNext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r11)
            b6d.p r11 = b6d.p.f12728a
            a08.r r12 = new a08.r
            r0 = 7
            r12.<init>(r0, r11)
            b6d.o r11 = b6d.o.f12727a
            ofm.h r11 = r13.w(r12, r11)
            java.lang.String r12 = "subscribe(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b6d.r.n(java.lang.String, int, gim.c):java.lang.Object");
    }
}
