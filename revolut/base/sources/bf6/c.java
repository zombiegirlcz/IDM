package bf6;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static se6.b a(ze6.a.b r9) {
        /*
            r1 = 0
            if (r9 == 0) goto L53
            java.lang.Boolean r0 = r9.getMandateInitiation()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
            java.lang.String r0 = r9.getTopUpSystem()
            if (r0 == 0) goto L28
            io3.n r0 = io3.n.valueOf(r0)     // Catch: java.lang.Exception -> L18
            goto L23
        L18:
            r0 = move-exception
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r3 = rd0.c.ERROR
            rd0.d.a(r3, r1, r1, r0, r2)
            r0 = r1
        L23:
            if (r0 != 0) goto L26
            goto L28
        L26:
            r5 = r0
            goto L2b
        L28:
            io3.n r0 = io3.n.NONE
            goto L26
        L2b:
            java.lang.Boolean r0 = r9.getIbanRequired()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
            java.lang.Boolean r0 = r9.getHasActiveMandate()
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
            java.lang.String r9 = r9.getSupportedCurrency()
            if (r9 == 0) goto L4c
            xi0.a r0 = xi0.b.Companion
            r0.getClass()
            xi0.b r1 = xi0.a.a(r9)
        L4c:
            r8 = r1
            se6.b r3 = new se6.b
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bf6.c.a(ze6.a$b):se6.b");
    }
}
