package urf;

import srf.h;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements h {
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yqi.d a(urf.e r8) {
        /*
            java.lang.String r0 = "validationData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            urf.c r0 = r8.a()
            com.revolut.data.model.Data r1 = r0.f282307a
            xi0.b r2 = r0.f282309c
            java.lang.Object r1 = r1.getContent()
            urf.d r1 = (urf.d) r1
            r3 = 0
            if (r1 == 0) goto L2f
            dj0.d r4 = r1.f282310a
            dj0.d r5 = r1.f282311b
            if (r4 == 0) goto L24
            xi0.b r4 = r4.f115083b
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r2)
            if (r4 == 0) goto L2f
        L24:
            if (r5 == 0) goto L30
            xi0.b r4 = r5.f115083b
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r2)
            if (r4 == 0) goto L2f
            goto L30
        L2f:
            r1 = r3
        L30:
            com.revolut.data.model.Data r3 = r0.f282307a
            boolean r3 = r3.getLoading()
            if (r3 != 0) goto L89
            if (r1 != 0) goto L3b
            goto L89
        L3b:
            dj0.d r3 = r1.f282310a
            dj0.d r1 = r1.f282311b
            long r4 = r0.f282308b
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4f
            yqi.d r0 = new yqi.d
            urf.g r1 = urf.g.f282312a
            r0.<init>(r8, r1)
            return r0
        L4f:
            if (r3 == 0) goto L67
            long r6 = r3.f115082a
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L67
            yqi.d r0 = new yqi.d
            urf.b r1 = new urf.b
            dj0.d r3 = new dj0.d
            r3.<init>(r6, r2)
            r1.<init>(r3)
            r0.<init>(r8, r1)
            return r0
        L67:
            if (r1 == 0) goto L7f
            long r0 = r1.f115082a
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 <= 0) goto L7f
            yqi.d r3 = new yqi.d
            urf.a r4 = new urf.a
            dj0.d r5 = new dj0.d
            r5.<init>(r0, r2)
            r4.<init>(r5)
            r3.<init>(r8, r4)
            return r3
        L7f:
            yqi.c r0 = yqi.d.Companion
            r0.getClass()
            yqi.d r8 = yqi.c.a(r8)
            return r8
        L89:
            yqi.d r0 = new yqi.d
            trf.a r1 = trf.a.f273792a
            r0.<init>(r8, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: urf.f.a(urf.e):yqi.d");
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((e) obj2);
    }
}
