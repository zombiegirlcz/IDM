package wtc;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cuc.u f299907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f299908b;

    public t0(cuc.u securityHubRepository, ppk.f ratesInteractor) {
        Intrinsics.checkNotNullParameter(securityHubRepository, "securityHubRepository");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f299907a = securityHubRepository;
        this.f299908b = ratesInteractor;
    }

    public static dj0.d b(dj0.d dVar, xi0.b bVar, Map map) {
        if (Intrinsics.f(dVar.f115083b, bVar)) {
            return dVar;
        }
        qta.c cVar = (qta.c) zhm.r0.h(new Pair(dVar.f115083b, bVar), map);
        return pyd.c.L(dVar, cVar.f249048c, cVar.f249047b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(qtc.g r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wtc.t0.a(qtc.g, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(java.util.List r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof wtc.s0
            if (r0 == 0) goto L13
            r0 = r6
            wtc.s0 r0 = (wtc.s0) r0
            int r1 = r0.f299906w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f299906w = r1
            goto L18
        L13:
            wtc.s0 r0 = new wtc.s0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f299906w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            ppk.f r6 = r4.f299908b
            java.util.Collection r5 = (java.util.Collection) r5
            efm.r r5 = cpk.a.a(r6, r5)
            vkm.d r5 = rd0.e.b(r5)
            r6 = 3
            r2 = 0
            jhi.b r5 = mo3.a.g(r5, r2, r2, r6)
            r0.f299906w = r3
            java.lang.Object r6 = vkm.q.x(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r5 = 10
            int r5 = zhm.w.t(r6, r5)
            int r5 = zhm.q0.b(r5)
            r0 = 16
            if (r5 >= r0) goto L60
            r5 = r0
        L60:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        L69:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L83
            java.lang.Object r6 = r5.next()
            r1 = r6
            qta.c r1 = (qta.c) r1
            kotlin.Pair r2 = new kotlin.Pair
            xi0.b r3 = r1.f249046a
            xi0.b r1 = r1.f249047b
            r2.<init>(r3, r1)
            r0.put(r2, r6)
            goto L69
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wtc.t0.c(java.util.List, gim.c):java.io.Serializable");
    }
}
