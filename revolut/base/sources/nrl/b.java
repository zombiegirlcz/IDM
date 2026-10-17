package nrl;

import kg.t;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements t {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    @Override // kg.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deserialize(kg.u r8, java.lang.reflect.Type r9, kg.s r10) {
        /*
            r7 = this;
            r9 = 0
            if (r8 == 0) goto Lb7
            kg.w r8 = r8.c()
            java.lang.String r0 = "accountType"
            java.lang.String r0 = boh.f.i(r0, r8)
            r1 = 1
            if (r0 == 0) goto L28
            orl.n[] r2 = orl.n.values()
            int r3 = r2.length
            r4 = 0
        L16:
            if (r4 >= r3) goto L28
            r5 = r2[r4]
            java.lang.String r6 = r5.name()
            boolean r6 = kotlin.text.a0.z(r6, r0, r1)
            if (r6 == 0) goto L25
            goto L29
        L25:
            int r4 = r4 + 1
            goto L16
        L28:
            r5 = r9
        L29:
            java.lang.String r2 = "instrumentType"
            java.lang.String r2 = boh.f.i(r2, r8)
            r3 = -1
            if (r5 != 0) goto L34
            r4 = r3
            goto L3c
        L34:
            int[] r4 = nrl.a.f218674a
            int r5 = r5.ordinal()
            r4 = r4[r5]
        L3c:
            if (r4 == r3) goto L95
            if (r4 == r1) goto L58
            r0 = 2
            if (r4 == r0) goto L55
            r0 = 3
            if (r4 == r0) goto L52
            r0 = 4
            if (r4 != r0) goto L4c
            java.lang.Class<orl.i> r0 = orl.i.class
            goto Laa
        L4c:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L52:
            java.lang.Class<orl.f> r0 = orl.f.class
            goto Laa
        L55:
            java.lang.Class<orl.q> r0 = orl.q.class
            goto Laa
        L58:
            if (r2 == 0) goto L92
            int r0 = r2.hashCode()
            r1 = -1956807563(0xffffffff8b5d7c75, float:-4.2656683E-32)
            if (r0 == r1) goto L86
            r1 = -18492400(0xfffffffffee5d410, float:-1.5274715E38)
            if (r0 == r1) goto L7a
            r1 = 2169541(0x211ac5, float:3.040174E-39)
            if (r0 == r1) goto L6e
            goto L92
        L6e:
            java.lang.String r0 = "FUND"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L77
            goto L92
        L77:
            java.lang.Class<orl.h> r0 = orl.h.class
            goto Laa
        L7a:
            java.lang.String r0 = "MUTUAL_FUND"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L83
            goto L92
        L83:
            java.lang.Class<orl.k> r0 = orl.k.class
            goto Laa
        L86:
            java.lang.String r0 = "OPTION"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L8f
            goto L92
        L8f:
            java.lang.Class<orl.l> r0 = orl.l.class
            goto Laa
        L92:
            java.lang.Class<orl.p> r0 = orl.p.class
            goto Laa
        L95:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = " is not supported"
            java.lang.String r0 = a0.d.r(r0, r2)
            r1.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r9, r9, r1, r0)
            r0 = r9
        Laa:
            if (r0 == 0) goto Lb7
            if (r10 == 0) goto Lb7
            a31.a r10 = (a31.a) r10
            java.lang.Object r8 = r10.d(r8, r0)
            orl.o r8 = (orl.o) r8
            return r8
        Lb7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nrl.b.deserialize(kg.u, java.lang.reflect.Type, kg.s):java.lang.Object");
    }
}
