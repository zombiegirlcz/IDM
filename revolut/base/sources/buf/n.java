package buf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f18819a;

    public n(ang.f userInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                this.f18819a = userInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                this.f18819a = userInteractor;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof buf.m
            if (r0 == 0) goto L13
            r0 = r7
            buf.m r0 = (buf.m) r0
            int r1 = r0.f18817y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18817y = r1
            goto L18
        L13:
            buf.m r0 = new buf.m
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f18815w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18817y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r6 = r0.v
            java.lang.String r5 = r0.u
            yhm.o.b(r7)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            ang.f r7 = r4.f18819a
            r2 = 0
            efm.d0 r7 = r7.f(r2)
            r0.u = r5
            r0.v = r6
            r0.f18817y = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            do3.n r7 = (do3.n) r7
            wi0.b r7 = do3.q.y(r7)
            boolean r7 = com.bumptech.glide.d.u(r7)
            r0 = 0
            if (r7 == 0) goto L93
            xi0.a r7 = xi0.b.Companion
            r7.getClass()
            xi0.b r7 = xi0.b.z
            java.lang.String r1 = r7.f306286a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r6, r1)
            if (r1 != 0) goto L93
            java.lang.String r7 = r7.f306286a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r5, r7)
            r1 = 12
            if (r7 == 0) goto L82
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r7 = 2131984089(0x7f137ed9, float:1.9605515E38)
            java.util.List r6 = zhm.u.c(r6)
            r5.<init>(r7, r6, r0, r1)
            return r5
        L82:
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            java.util.List r5 = zhm.v.k(r5)
            r6 = 2131984090(0x7f137eda, float:1.9605517E38)
            r7.<init>(r6, r5, r0, r1)
            return r7
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: buf.n.a(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
