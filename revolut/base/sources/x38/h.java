package x38;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements pfe.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r38.b f302711a;

    public h(r38.b interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f302711a = interactor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Set r6, gim.c r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof x38.f
            if (r6 == 0) goto L13
            r6 = r7
            x38.f r6 = (x38.f) r6
            int r0 = r6.f302708w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f302708w = r0
            goto L18
        L13:
            x38.f r6 = new x38.f
            r6.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f302708w
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L28
            yhm.o.b(r7)
            goto L54
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            r6.f302708w = r3
            r38.b r7 = r5.f302711a
            kotlinx.coroutines.flow.Flow r7 = r38.b.c(r7)
            wyg.s r1 = new wyg.s
            r4 = 29
            r1.<init>(r4)
            jhi.b r7 = mo3.a.g(r7, r2, r1, r3)
            vvh.e r1 = new vvh.e
            r3 = 8
            r1.<init>(r7, r3)
            java.lang.Object r7 = vkm.q.z(r1, r6)
            if (r7 != r0) goto L54
            return r0
        L54:
            v38.a r7 = (v38.a) r7
            if (r7 == 0) goto L69
            tof.hc r6 = new tof.hc
            n38.a r7 = r7.f285854a
            java.lang.String r7 = r7.f211924b
            r6.<init>(r7, r2)
            java.util.Set r6 = zhm.y0.b(r6)
            if (r6 != 0) goto L68
            goto L69
        L68:
            return r6
        L69:
            zhm.h0 r6 = zhm.h0.f322473a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x38.h.a(java.util.Set, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.Set r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x38.h.b(java.util.Set, gim.c):java.lang.Object");
    }
}
