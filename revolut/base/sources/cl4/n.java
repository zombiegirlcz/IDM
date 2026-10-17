package cl4;

/* JADX INFO: loaded from: classes22.dex */
public final class n {
    private n() {
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static cl4.o a(java.util.List r7, wi0.b r8) {
        /*
            java.lang.String r0 = "facilities"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "countryCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r0 = r7 instanceof java.util.Collection
            r2 = 0
            if (r0 == 0) goto L23
            r3 = r7
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L23
            goto L40
        L23:
            java.util.Iterator r3 = r7.iterator()
        L27:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L40
            java.lang.Object r4 = r3.next()
            yw4.p r4 = (yw4.p) r4
            yw4.h r5 = r4.i
            yw4.h r6 = yw4.h.SECURED
            if (r5 != r6) goto L27
            yw4.l r4 = r4.f317331l
            yw4.l r5 = yw4.l.FULL_ACCESS
            if (r4 != r5) goto L27
            r2 = 1
        L40:
            if (r0 == 0) goto L4c
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4c
            goto L64
        L4c:
            java.util.Iterator r7 = r7.iterator()
        L50:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r7.next()
            yw4.p r0 = (yw4.p) r0
            yw4.l r0 = r0.f317331l
            yw4.l r3 = yw4.l.SPEND_ONLY
            if (r0 != r3) goto L50
            h93.j0 r1 = h93.j0.FAMILY
        L64:
            if (r2 == 0) goto L76
            wi0.a r7 = wi0.b.Companion
            r7.getClass()
            wi0.b r7 = wi0.b.f297770q3
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r8, r7)
            if (r7 == 0) goto L76
            h93.l0 r7 = h93.l0.US_SECURED_CREDIT
            goto L78
        L76:
            h93.l0 r7 = h93.l0.CREDIT
        L78:
            cl4.o r8 = new cl4.o
            r8.<init>(r1, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cl4.n.a(java.util.List, wi0.b):cl4.o");
    }
}
