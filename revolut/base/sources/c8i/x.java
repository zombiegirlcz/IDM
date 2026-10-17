package c8i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m6i.h0 f22231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8b.a f22232b;

    public x(m6i.h0 moveMoneyStartupAccountProvider, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(moveMoneyStartupAccountProvider, "moveMoneyStartupAccountProvider");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f22231a = moveMoneyStartupAccountProvider;
        this.f22232b = countryInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.shared.feature.move_money.api.navigation.StartUpPocket r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof c8i.w
            if (r0 == 0) goto L13
            r0 = r8
            c8i.w r0 = (c8i.w) r0
            int r1 = r0.f22230x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22230x = r1
            goto L18
        L13:
            c8i.w r0 = new c8i.w
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f22230x
            m6i.h0 r3 = r6.f22231a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            com.revolut.feature_move_money.api.model.AccountWrapper r7 = r0.u
            yhm.o.b(r8)
            goto L63
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            yhm.o.b(r8)
            goto L53
        L3a:
            yhm.o.b(r8)
            n8b.a r8 = r6.f22232b
            o8b.c r8 = (o8b.c) r8
            boolean r8 = r8.g()
            if (r8 != 0) goto L48
            goto L7f
        L48:
            x5i.d r8 = x5i.d.SOURCE
            r0.f22230x = r5
            java.lang.Object r8 = r3.b(r7, r8, r0)
            if (r8 != r1) goto L53
            goto L62
        L53:
            r7 = r8
            com.revolut.feature_move_money.api.model.AccountWrapper r7 = (com.revolut.feature_move_money.api.model.AccountWrapper) r7
            x5i.d r8 = x5i.d.SOURCE
            r0.u = r7
            r0.f22230x = r4
            java.io.Serializable r8 = r3.a(r7, r8, r0)
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            java.util.List r8 = (java.util.List) r8
            xi0.b r7 = r7.getCurrency()
            xi0.a r0 = xi0.b.Companion
            r0.getClass()
            xi0.b r0 = xi0.b.E
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r0)
            if (r7 == 0) goto L7f
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto L7f
            w5i.g r7 = w5i.g.f295277a
            return r7
        L7f:
            w5i.f r7 = w5i.f.f295276a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c8i.x.a(com.revolut.shared.feature.move_money.api.navigation.StartUpPocket, gim.c):java.lang.Object");
    }
}
