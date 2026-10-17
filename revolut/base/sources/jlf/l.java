package jlf;

import elf.s0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r10.r f175746l;

    public l(r10.r paymentLinkContactProvider) {
        Intrinsics.checkNotNullParameter(paymentLinkContactProvider, "paymentLinkContactProvider");
        this.f175746l = paymentLinkContactProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r5 = r7 instanceof jlf.k
            if (r5 == 0) goto L13
            r5 = r7
            jlf.k r5 = (jlf.k) r5
            int r0 = r5.f175745x
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f175745x = r0
            goto L1a
        L13:
            jlf.k r5 = new jlf.k
            gim.c r7 = (gim.c) r7
            r5.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r5.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f175745x
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2c
            jlf.l r5 = r5.u
            yhm.o.b(r7)
            goto L4d
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r7)
            java.lang.String r7 = "ID_NAV_BAR_ICON"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L59
            r5.u = r4
            r5.f175745x = r3
            r10.r r6 = r4.f175746l
            java.lang.Object r7 = r6.p(r5)
            if (r7 != r0) goto L4c
            return r0
        L4c:
            r5 = r4
        L4d:
            zm3.a r7 = (zm3.a) r7
            com.revolut.feature.payments.social.api.navigation.PeerToPeerChatDestination r6 = new com.revolut.feature.payments.social.api.navigation.PeerToPeerChatDestination
            r0 = 0
            r6.<init>(r7, r0, r2)
            r5.A2(r6)
            r2 = r3
        L59:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jlf.l.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
