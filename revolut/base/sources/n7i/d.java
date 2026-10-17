package n7i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final usc.a f213107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gah.g f213108b;

    public d(usc.a wealthDisclaimersInteractor, gah.g wealthRemoteDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(wealthDisclaimersInteractor, "wealthDisclaimersInteractor");
        Intrinsics.checkNotNullParameter(wealthRemoteDisclaimersMapper, "wealthRemoteDisclaimersMapper");
        this.f213107a = wealthDisclaimersInteractor;
        this.f213108b = wealthRemoteDisclaimersMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof n7i.b
            if (r0 == 0) goto L13
            r0 = r8
            n7i.b r0 = (n7i.b) r0
            int r1 = r0.f213103w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213103w = r1
            goto L18
        L13:
            n7i.b r0 = new n7i.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213103w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L62
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            rdh.b r8 = rdh.b.CFD_WITHDRAWAL_CONFIRMATION
            java.util.List r8 = zhm.u.c(r8)
            w4l.h r2 = w4l.h.f294642c
            usc.a r4 = r7.f213107a
            kotlinx.coroutines.flow.Flow r8 = r4.l(r8, r2)
            mig.a r2 = new mig.a
            r4 = 25
            r2.<init>(r4)
            n33.l0 r4 = new n33.l0
            r5 = 26
            r4.<init>(r5)
            n33.l0 r5 = new n33.l0
            r6 = 27
            r5.<init>(r6)
            jhi.b r8 = mo3.a.f(r8, r4, r2, r5)
            r0.f213103w = r3
            java.lang.Object r8 = vkm.q.z(r8, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            od0.i r8 = (od0.i) r8
            if (r8 == 0) goto L6b
            java.lang.Object r8 = r8.f224257a
            rdh.a r8 = (rdh.a) r8
            return r8
        L6b:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n7i.d.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(j8l.l r25, gim.c r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n7i.d.b(j8l.l, gim.c):java.lang.Object");
    }
}
