package ji5;

import akg.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final li5.d f174362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f174363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd5.c f174364c;
    public final fk3.a d;
    public final hc5.a e;

    public i(li5.d repository, xoj.a featuresInteractor, sd5.c cryptoConfigInteractor, fk3.a configurationInteractor, hc5.a cryptoAccountInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(cryptoConfigInteractor, "cryptoConfigInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(cryptoAccountInteractor, "cryptoAccountInteractor");
        this.f174362a = repository;
        this.f174363b = featuresInteractor;
        this.f174364c = cryptoConfigInteractor;
        this.d = configurationInteractor;
        this.e = cryptoAccountInteractor;
    }

    public final n a(boolean z) {
        return nim.a.v(this.e.a(z ? w4l.i.f294643c : w4l.h.f294642c), new jhi.a(17));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(yh5.c r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ji5.f
            if (r0 == 0) goto L13
            r0 = r6
            ji5.f r0 = (ji5.f) r0
            int r1 = r0.f174359w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f174359w = r1
            goto L18
        L13:
            ji5.f r0 = new ji5.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f174359w
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L2b
            yhm.m r6 = (yhm.m) r6     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = r6.f314193a     // Catch: java.lang.Throwable -> L2b
            goto L45
        L2b:
            r5 = move-exception
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b
            li5.d r6 = r4.f174362a     // Catch: java.lang.Throwable -> L2b
            r0.f174359w = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = r6.a(r5, r0)     // Catch: java.lang.Throwable -> L2b
            if (r5 != r1) goto L45
            return r1
        L45:
            yhm.m r5 = new yhm.m     // Catch: java.lang.Throwable -> L2b
            goto L4d
        L48:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.o.a(r5)
        L4d:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ji5.i.b(yh5.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ec5.i r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ji5.g
            if (r0 == 0) goto L13
            r0 = r6
            ji5.g r0 = (ji5.g) r0
            int r1 = r0.f174360w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f174360w = r1
            goto L18
        L13:
            ji5.g r0 = new ji5.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f174360w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r6)
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r5 = r6.f314193a
            return r5
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            r0.f174360w = r3
            li5.d r6 = r4.f174362a
            java.lang.Object r5 = r6.b(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ji5.i.c(ec5.i, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (nim.a.a(r8, r0) != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ji5.h
            if (r0 == 0) goto L13
            r0 = r8
            ji5.h r0 = (ji5.h) r0
            int r1 = r0.f174361w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f174361w = r1
            goto L18
        L13:
            ji5.h r0 = new ji5.h
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f174361w
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L45
            if (r2 == r6) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            yhm.o.b(r8)
            goto L9f
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            yhm.o.b(r8)
            goto L8a
        L3d:
            yhm.o.b(r8)
            goto L6a
        L41:
            yhm.o.b(r8)
            goto L59
        L45:
            yhm.o.b(r8)
            hc5.a r8 = r7.e
            w4l.i r2 = w4l.i.f294643c
            vkm.d r8 = r8.a(r2)
            r0.f174361w = r6
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L59
            goto L9e
        L59:
            xoj.a r8 = r7.f174363b
            cpj.b r8 = (cpj.b) r8
            pfm.a r8 = r8.n()
            r0.f174361w = r5
            java.lang.Object r8 = nim.a.a(r8, r0)
            if (r8 != r1) goto L6a
            goto L9e
        L6a:
            sd5.c r8 = r7.f174364c
            efm.r r8 = r8.a(r6)
            efm.r r8 = mo3.a.n(r8)
            efm.b r8 = r8.ignoreElements()
            java.lang.String r2 = "ignoreElements(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            pfm.a r8 = ue0.e.v(r8)
            r0.f174361w = r4
            java.lang.Object r8 = nim.a.a(r8, r0)
            if (r8 != r1) goto L8a
            goto L9e
        L8a:
            fk3.a r8 = r7.d
            ik3.c r8 = (ik3.c) r8
            pfm.h r8 = r8.j()
            pfm.a r8 = ue0.e.v(r8)
            r0.f174361w = r3
            java.lang.Object r8 = nim.a.a(r8, r0)
            if (r8 != r1) goto L9f
        L9e:
            return r1
        L9f:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ji5.i.d(gim.c):java.lang.Object");
    }
}
