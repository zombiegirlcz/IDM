package nw9;

import kotlin.jvm.internal.Intrinsics;
import s6e.b0;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f219809a;

    public f(b0 subaccountLinkInteractor) {
        Intrinsics.checkNotNullParameter(subaccountLinkInteractor, "subaccountLinkInteractor");
        this.f219809a = subaccountLinkInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, java.lang.String r10, gim.c r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof nw9.e
            if (r0 == 0) goto L13
            r0 = r11
            nw9.e r0 = (nw9.e) r0
            int r1 = r0.f219808w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219808w = r1
            goto L18
        L13:
            nw9.e r0 = new nw9.e
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f219808w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r11)
            goto L55
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r11)
            if (r10 != 0) goto L37
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount$PersonalAccount r9 = com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount.PersonalAccount.f102259a
            return r9
        L37:
            r0.f219808w = r3
            s6e.b0 r11 = r8.f219809a
            o6e.a r3 = r11.f260265a
            r3.getClass()
            mtj.i r2 = new mtj.i
            r6 = 0
            r7 = 27
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r9, r2, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            h6e.e r11 = (h6e.e) r11
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount$Subaccount r9 = new com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount$Subaccount
            java.lang.String r10 = r11.f149631a
            java.lang.String r11 = r11.f149632b
            r9.<init>(r10, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nw9.f.a(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
