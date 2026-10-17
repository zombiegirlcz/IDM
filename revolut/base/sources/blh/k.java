package blh;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f16665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16666c;

    public /* synthetic */ k(n nVar, String str, int i) {
        this.f16664a = i;
        this.f16665b = nVar;
        this.f16666c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f16664a
            switch(r0) {
                case 0: goto L38;
                default: goto L5;
            }
        L5:
            nel.n r7 = (nel.n) r7
            java.lang.String r0 = "instrument"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = blh.j.a(r7)
            if (r0 == 0) goto L32
            nel.z r7 = r7.f214597c
            boolean r7 = io3.h.k(r7)
            if (r7 == 0) goto L32
            zsc.p r7 = zsc.p.WORD_PREFIX
            blh.n r0 = r6.f16665b
            kotlin.Lazy r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.String r1 = r6.f16666c
            boolean r7 = r7.a(r1, r0)
            if (r7 == 0) goto L32
            r7 = 1
            goto L33
        L32:
            r7 = 0
        L33:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L38:
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            java.lang.String r0 = "hasEtcOrEtnData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.Object r7 = r7.getContent()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L4c
            boolean r7 = r7.booleanValue()
            goto L4d
        L4c:
            r7 = 0
        L4d:
            if (r7 == 0) goto L52
            clh.w r7 = clh.w.ALL_ETPS
            goto L54
        L52:
            clh.w r7 = clh.w.ALL_ETFS
        L54:
            zsc.d$a r0 = zsc.d.Companion
            blh.k r1 = new blh.k
            r2 = 1
            blh.n r3 = r6.f16665b
            java.lang.String r4 = r6.f16666c
            r1.<init>(r3, r4, r2)
            r0.getClass()
            zsc.c r0 = zsc.d.a.a(r1)
            blh.i r1 = r3.f16676b
            blh.d r2 = new blh.d
            clh.m r4 = new clh.m
            java.lang.String r5 = "ALL_ETFS_LIST_ID"
            r4.<init>(r5, r7)
            o97.r r7 = r3.e
            r2.<init>(r4, r7)
            ble.z r7 = new ble.z
            r3 = 20
            r7.<init>(r3)
            efm.r r7 = blh.f.a(r1, r2, r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: blh.k.invoke(java.lang.Object):java.lang.Object");
    }
}
