package bf6;

import af6.a;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static se6.b a(af6.a.c r8) {
        /*
            r1 = 0
            if (r8 == 0) goto L4d
            boolean r3 = r8.getMandateInitiation()
            java.lang.String r0 = r8.getTopUpSystem()
            if (r0 == 0) goto L22
            io3.n r0 = io3.n.valueOf(r0)     // Catch: java.lang.Exception -> L12
            goto L1d
        L12:
            r0 = move-exception
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            rd0.d.a(r4, r1, r1, r0, r2)
            r0 = r1
        L1d:
            if (r0 != 0) goto L20
            goto L22
        L20:
            r4 = r0
            goto L25
        L22:
            io3.n r0 = io3.n.NONE
            goto L20
        L25:
            java.lang.Boolean r0 = r8.getIbanRequired()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
            java.lang.Boolean r0 = r8.getHasActiveMandate()
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
            java.lang.String r8 = r8.getSupportedCurrencyCode()
            if (r8 == 0) goto L46
            xi0.a r0 = xi0.b.Companion
            r0.getClass()
            xi0.b r1 = xi0.a.a(r8)
        L46:
            r7 = r1
            se6.b r2 = new se6.b
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bf6.d.a(af6.a$c):se6.b");
    }

    public static a.c b(se6.b bVar) {
        if (bVar == null) {
            return null;
        }
        boolean z = bVar.f262122a;
        String string = bVar.f262123b.toString();
        Boolean boolValueOf = Boolean.valueOf(bVar.f262124c);
        Boolean boolValueOf2 = Boolean.valueOf(bVar.d);
        xi0.b bVar2 = bVar.e;
        return new a.c(z, string, boolValueOf, boolValueOf2, bVar2 != null ? bVar2.f306286a : null);
    }
}
