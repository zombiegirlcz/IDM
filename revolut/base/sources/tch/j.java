package tch;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f269835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bdh.e f269836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f269837c;

    public j(i infoRowsMapper, bdh.e helpWidgetMapper, g headerMapper) {
        Intrinsics.checkNotNullParameter(infoRowsMapper, "infoRowsMapper");
        Intrinsics.checkNotNullParameter(helpWidgetMapper, "helpWidgetMapper");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        this.f269835a = infoRowsMapper;
        this.f269836b = helpWidgetMapper;
        this.f269837c = headerMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r12) {
        /*
            r11 = this;
            tch.q r12 = (tch.q) r12
            java.lang.String r0 = "domainState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            tch.e0 r1 = new tch.e0
            com.revolut.data.model.Data r2 = r12.d
            com.revolut.data.model.Data r3 = r12.f269843a
            r4 = 0
            if (r3 == 0) goto L17
            if (r2 == 0) goto L17
            com.revolut.data.model.Data r2 = com.google.crypto.tink.shaded.protobuf.t1.t(r3, r2)
            goto L18
        L17:
            r2 = r4
        L18:
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L35
            tcg.a0 r4 = new tcg.a0
            r4.<init>(r6)
            tc6.b r7 = new tc6.b
            r8 = 4
            r7.<init>(r8)
            tch.c r8 = new tch.c
            tch.g r9 = r11.f269837c
            r8.<init>(r9, r5)
            java.lang.Object r2 = iii.c.f(r2, r4, r7, r8)
            r4 = r2
            tch.d0 r4 = (tch.d0) r4
        L35:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 2
            if (r3 == 0) goto L57
            tcg.a0 r2 = new tcg.a0
            tch.i r7 = r11.f269835a
            r2.<init>(r7, r0)
            tc6.b r8 = new tc6.b
            r9 = 5
            r8.<init>(r9)
            si5.c r9 = new si5.c
            r10 = 18
            r9.<init>(r7, r12, r10)
            java.lang.Object r2 = iii.c.f(r3, r2, r8, r9)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L59
        L57:
            zhm.f0 r2 = zhm.f0.f322471a
        L59:
            java.util.List r12 = r12.f269845c
            bdh.e r3 = r11.f269836b
            java.util.List r3 = r3.a()
            r7 = 3
            java.util.List[] r7 = new java.util.List[r7]
            r7[r5] = r2
            r7[r6] = r12
            r7[r0] = r3
            java.lang.String r12 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r12)
            java.util.List r12 = kotlin.collections.d.L(r7)
            java.util.ArrayList r12 = zhm.w.u(r12)
            r1.<init>(r4, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tch.j.c(cli.j):cli.o");
    }
}
