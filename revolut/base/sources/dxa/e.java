package dxa;

import com.revolut.feature.referrals.common.data.impl.network.services.InviteFriendsMessagingService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InviteFriendsMessagingService f120928a;

    public e(InviteFriendsMessagingService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f120928a = service;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(pwa.n r5, java.util.List r6, gim.c r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof dxa.a
            if (r0 == 0) goto L13
            r0 = r7
            dxa.a r0 = (dxa.a) r0
            int r1 = r0.f120921w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120921w = r1
            goto L18
        L13:
            dxa.a r0 = new dxa.a
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f120921w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            dxa.b r7 = new dxa.b
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            skm.p0 r5 = skm.p0.f264001a
            elm.f r5 = elm.f.f127540b
            r0.f120921w = r3
            java.lang.Object r7 = skm.e0.J(r5, r7, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            yhm.m r7 = (yhm.m) r7
            java.lang.Object r5 = r7.f314193a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dxa.e.a(pwa.n, java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(pwa.n r11, java.lang.String r12, java.util.List r13, gim.c r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof dxa.c
            if (r0 == 0) goto L13
            r0 = r14
            dxa.c r0 = (dxa.c) r0
            int r1 = r0.f120924w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120924w = r1
            goto L18
        L13:
            dxa.c r0 = new dxa.c
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f120924w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r14)
            goto L49
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r14)
            dxa.d r4 = new dxa.d
            r9 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            r0.f120924w = r3
            java.lang.Object r14 = skm.e0.J(r11, r4, r0)
            if (r14 != r1) goto L49
            return r1
        L49:
            yhm.m r14 = (yhm.m) r14
            java.lang.Object r11 = r14.f314193a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dxa.e.b(pwa.n, java.lang.String, java.util.List, gim.c):java.lang.Object");
    }
}
