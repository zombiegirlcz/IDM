package b4j;

import kotlin.jvm.internal.Intrinsics;
import rfm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f12397a;

    public g(ang.f userInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                this.f12397a = userInteractor;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                this.f12397a = userInteractor;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                this.f12397a = userInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                this.f12397a = userInteractor;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof mqf.b
            if (r0 == 0) goto L13
            r0 = r6
            mqf.b r0 = (mqf.b) r0
            int r1 = r0.f207992w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207992w = r1
            goto L18
        L13:
            mqf.b r0 = new mqf.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207992w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L55
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            ang.f r6 = r5.f12397a
            w4l.j r2 = w4l.j.f294644c
            akg.n r6 = r6.j(r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.q0 r6 = rd0.e.n(r6, r2)
            mh1.e r2 = new mh1.e
            r4 = 29
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            r0.f207992w = r3
            java.lang.Object r6 = vkm.q.z(r6, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            do3.n r6 = (do3.n) r6
            if (r6 == 0) goto L69
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r0 = wi0.b.X0
            boolean r6 = te0.w.S(r6, r0)
            if (r6 != r3) goto L69
            mqf.c r6 = mqf.c.f207993a
            return r6
        L69:
            mqf.d r6 = mqf.d.f207994a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b4j.g.a(gim.c):java.lang.Object");
    }

    public f0 b() {
        efm.k kVarC = this.f12397a.d.c();
        dqg.i iVar = dqg.i.f;
        rfm.m mVar = new rfm.m(kVarC, new cie.b(28), 1);
        Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
        f0 f0VarO = ue0.e.G(mVar, "").e("").o();
        Intrinsics.checkNotNullExpressionValue(f0VarO, "toSingle(...)");
        return f0VarO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof b4j.f
            if (r0 == 0) goto L13
            r0 = r5
            b4j.f r0 = (b4j.f) r0
            int r1 = r0.f12396w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12396w = r1
            goto L18
        L13:
            b4j.f r0 = new b4j.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12396w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f12397a
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f12396w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            do3.n r5 = (do3.n) r5
            n3j.o r0 = new n3j.o
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b4j.g.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof x76.a
            if (r0 == 0) goto L13
            r0 = r5
            x76.a r0 = (x76.a) r0
            int r1 = r0.f303143w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f303143w = r1
            goto L18
        L13:
            x76.a r0 = new x76.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303143w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f12397a
            zmg.d r5 = r5.d
            efm.k r5 = r5.c()
            r0.f303143w = r3
            java.lang.Object r5 = nim.a.i(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            do3.n r5 = (do3.n) r5
            if (r5 == 0) goto L51
            l0i.a r0 = new l0i.a
            java.lang.String r1 = r5.f116409b
            java.lang.String r5 = r5.f116408a
            r0.<init>(r1, r5)
            return r0
        L51:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b4j.g.d(gim.c):java.lang.Object");
    }
}
