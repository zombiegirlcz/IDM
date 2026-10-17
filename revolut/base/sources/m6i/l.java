package m6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f203176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n6i.o f203177b;

    public l(fk3.a configurationInteractor, n6i.o nonExistingAccountProvider) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(nonExistingAccountProvider, "nonExistingAccountProvider");
        this.f203176a = configurationInteractor;
        this.f203177b = nonExistingAccountProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature_move_money.api.model.AccountWrapper r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof m6i.k
            if (r0 == 0) goto L13
            r0 = r9
            m6i.k r0 = (m6i.k) r0
            int r1 = r0.f203175x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f203175x = r1
            goto L18
        L13:
            m6i.k r0 = new m6i.k
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203175x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            return r9
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            com.revolut.feature_move_money.api.model.AccountWrapper r8 = r0.u
            yhm.o.b(r9)
            goto L66
        L39:
            yhm.o.b(r9)
            w4l.j r9 = w4l.j.f294644c
            fk3.a r2 = r7.f203176a
            ik3.c r2 = (ik3.c) r2
            e7l.g$b r6 = e7l.g.b.f123407a
            efm.r r9 = r2.l(r6, r9)
            m56.g r2 = new m56.g
            r6 = 5
            r2.<init>(r6)
            efm.r r9 = m70.a.g(r9, r5, r2, r4)
            efm.d0 r9 = r9.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            r0.u = r8
            r0.f203175x = r4
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L66
            goto Lac
        L66:
            e7l.f r9 = (e7l.f) r9
            xi0.b r9 = r9.J0
            boolean r2 = m6i.a.a(r8)
            if (r2 == 0) goto L77
            xi0.b r8 = r8.getCurrency()
            java.lang.String r8 = r8.f306286a
            goto L9e
        L77:
            if (r9 == 0) goto L86
            xi0.b r2 = r8.getCurrency()
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r9)
            if (r2 != 0) goto L86
            java.lang.String r8 = r9.f306286a
            goto L9e
        L86:
            xi0.b r8 = r8.getCurrency()
            xi0.a r9 = xi0.b.Companion
            r9.getClass()
            xi0.b r9 = xi0.b.i
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r9)
            if (r8 != 0) goto L9a
            java.lang.String r8 = r9.f306286a
            goto L9e
        L9a:
            xi0.b r8 = xi0.b.f306272g
            java.lang.String r8 = r8.f306286a
        L9e:
            k1j.a r9 = k1j.a.NON_EXISTING_CURRENCY
            r0.u = r5
            r0.f203175x = r3
            n6i.o r2 = r7.f203177b
            java.lang.Object r8 = r2.c(r0, r8, r9)
            if (r8 != r1) goto Lad
        Lac:
            return r1
        Lad:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m6i.l.a(com.revolut.feature_move_money.api.model.AccountWrapper, gim.c):java.lang.Object");
    }
}
