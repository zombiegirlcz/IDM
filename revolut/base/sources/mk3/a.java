package mk3;

import kotlin.jvm.internal.Intrinsics;
import sh1.g;
import sh1.h;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static sh1.g a(sh1.g r6, gk3.a r7) {
        /*
            r0 = 3
            r1 = 0
            sh1.e r2 = sh1.e.f263343a
            if (r7 == 0) goto L3f
            boolean r3 = r7.a()
            if (r3 == 0) goto L17
            java.lang.String r3 = r6.f263344a
            boolean r3 = kotlin.text.d0.W(r3)
            if (r3 == 0) goto L17
            sh1.b r2 = sh1.b.f263340a
            goto L3a
        L17:
            java.lang.String r3 = r6.f263344a
            boolean r4 = kotlin.text.d0.W(r3)
            if (r4 != 0) goto L2d
            int r4 = r3.length()
            int r5 = r7.f144317b
            if (r4 >= r5) goto L2d
            sh1.d r2 = new sh1.d
            r2.<init>(r5)
            goto L3a
        L2d:
            int r3 = r3.length()
            int r7 = r7.f144318c
            if (r3 <= r7) goto L3a
            sh1.c r2 = new sh1.c
            r2.<init>(r7)
        L3a:
            sh1.g r6 = sh1.g.a(r6, r1, r2, r0)
            return r6
        L3f:
            sh1.g r6 = sh1.g.a(r6, r1, r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mk3.a.a(sh1.g, gk3.a):sh1.g");
    }

    public static h b(h fields, gk3.d config) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(config, "config");
        g gVarA = a(fields.f263348c, config.a());
        g gVarA2 = a(fields.e, config.e());
        g gVarA3 = a(fields.f263347b, config.f());
        g gVarA4 = a(fields.d, config.g());
        g gVarA5 = a(fields.k, config.i());
        g gVarA6 = a(fields.f263352l, config.j());
        return h.a(fields, gVarA3, gVarA, gVarA4, gVarA2, a(fields.f, config.k()), a(fields.f263349g, config.h()), a(fields.f263350h, config.c()), null, a(fields.f263351j, config.b()), gVarA5, gVarA6, null, 4353);
    }

    public static g c(g gVar, g gVar2, gk3.a aVar) {
        return !Intrinsics.f(gVar.f263344a, gVar2.f263344a) ? a(gVar2, aVar) : gVar2;
    }
}
