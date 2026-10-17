package et6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 implements gr6.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wwa.b f129260a;

    public k1(wwa.b inviteCampaignHomeInteractor) {
        Intrinsics.checkNotNullParameter(inviteCampaignHomeInteractor, "inviteCampaignHomeInteractor");
        this.f129260a = inviteCampaignHomeInteractor;
    }

    public final Object a(boolean z, gim.c cVar) {
        return vkm.q.z(new a87.b(mo3.a.g(rd0.e.b(wwa.b.d(this.f129260a, z, null, 6)), null, new en6.a(22), 1), 18), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof et6.j1
            if (r0 == 0) goto L13
            r0 = r6
            et6.j1 r0 = (et6.j1) r0
            int r1 = r0.f129253w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129253w = r1
            goto L18
        L13:
            et6.j1 r0 = new et6.j1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129253w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L28
            goto L3e
        L28:
            r6 = move-exception
            goto L42
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            r0.f129253w = r4     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = r5.a(r4, r0)     // Catch: java.lang.Throwable -> L28
            if (r6 != r1) goto L3e
            return r1
        L3e:
            if (r6 == 0) goto L4c
            r3 = r4
            goto L4c
        L42:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.WARNING
            r2 = 0
            rd0.d.a(r1, r2, r2, r6, r0)
        L4c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.k1.b(gim.c):java.lang.Object");
    }
}
