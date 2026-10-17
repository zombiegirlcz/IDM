package xg8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uil.a f305639a;

    public n(uil.a revolutAccountsManager) {
        Intrinsics.checkNotNullParameter(revolutAccountsManager, "revolutAccountsManager");
        this.f305639a = revolutAccountsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(xg8.n r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof xg8.m
            if (r0 == 0) goto L13
            r0 = r8
            xg8.m r0 = (xg8.m) r0
            int r1 = r0.f305638w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f305638w = r1
            goto L18
        L13:
            xg8.m r0 = new xg8.m
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f305638w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L3f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            uil.a r7 = r7.f305639a
            r0.f305638w = r3
            pjl.z0 r7 = (pjl.z0) r7
            java.lang.Object r8 = r7.h(r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r8.iterator()
        L4a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r8.next()
            r1 = r0
            com.revolut.sso.api.accounts.RevolutAccount r1 = (com.revolut.sso.api.accounts.RevolutAccount) r1
            com.revolut.sso.impl.domain.models.RevolutAccountImpl r1 = (com.revolut.sso.impl.domain.models.RevolutAccountImpl) r1
            cjl.b r2 = r1.f106158b
            cjl.b r4 = cjl.b.YOUTH
            if (r2 != r4) goto L4a
            java.lang.String r1 = r1.f106159c
            java.lang.String r2 = "com.revolut.sso"
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r1 == 0) goto L4a
            r7.add(r0)
            goto L4a
        L6d:
            boolean r8 = r7.isEmpty()
            r0 = 0
            if (r8 == 0) goto L84
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r1 = rd0.c.DEBUG
            r5 = 0
            r6 = 16
            java.lang.String r2 = "JuniorPersonalisation"
            java.lang.String r3 = "There are no Youth SSO accounts. No personalisation."
            r4 = 0
            rd0.d.b(r1, r2, r3, r4, r5, r6)
            return r0
        L84:
            int r8 = r7.size()
            if (r8 <= r3) goto L9a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r1 = rd0.c.WARNING
            r5 = 0
            r6 = 16
            java.lang.String r2 = "JuniorPersonalisation"
            java.lang.String r3 = "There are more than one Youth SSO accounts. No personalisation because of ambiguity."
            r4 = 0
            rd0.d.b(r1, r2, r3, r4, r5, r6)
            return r0
        L9a:
            java.lang.Object r7 = zhm.d0.b0(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xg8.n.a(xg8.n, gim.c):java.lang.Object");
    }
}
