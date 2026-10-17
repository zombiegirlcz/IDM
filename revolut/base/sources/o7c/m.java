package o7c;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import m1i.t;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements z5c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f222767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q7c.g f222768b;

    public m(sri.m navigator, q7c.g topUpMethodsInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(topUpMethodsInteractor, "topUpMethodsInteractor");
        this.f222767a = navigator;
        this.f222768b = topUpMethodsInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "revolut-pay") && Intrinsics.f(cVar.e(2), "topup");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof o7c.l
            if (r0 == 0) goto L13
            r0 = r10
            o7c.l r0 = (o7c.l) r0
            int r1 = r0.f222766w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f222766w = r1
            goto L1a
        L13:
            o7c.l r0 = new o7c.l
            gim.c r10 = (gim.c) r10
            r0.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f222766w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r10)
            goto L77
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            yhm.o.b(r10)
            java.util.HashMap r10 = r9.d
            java.lang.String r2 = "minBalance"
            java.lang.Object r10 = r10.get(r2)
            java.lang.String r10 = (java.lang.String) r10
            r4 = 0
            if (r10 == 0) goto L47
            long r6 = java.lang.Long.parseLong(r10)
            goto L48
        L47:
            r6 = r4
        L48:
            java.util.HashMap r9 = r9.d
            java.lang.String r10 = "currency"
            java.lang.Object r9 = r9.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L9e
            boolean r10 = kotlin.text.d0.W(r9)
            if (r10 != 0) goto L9e
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 <= 0) goto L96
            xi0.a r10 = xi0.b.Companion
            r10.getClass()
            xi0.b r9 = xi0.a.a(r9)
            dj0.d r10 = new dj0.d
            r10.<init>(r6, r9)
            r0.f222766w = r3
            q7c.g r9 = r8.f222768b
            java.lang.Object r10 = r9.a(r10, r0)
            if (r10 != r1) goto L77
            return r1
        L77:
            dj0.d r10 = (dj0.d) r10
            q06.h r9 = new q06.h
            com.revolut.feature.topup_screen.api.destination.InitTopUpDestination r0 = new com.revolut.feature.topup_screen.api.destination.InitTopUpDestination
            com.revolut.feature.topup_screen.api.config.TopUpConfig$a r1 = com.revolut.feature.topup_screen.api.config.TopUpConfig.INSTANCE
            pte.a r2 = pte.a.REVOLUT_PAY
            r3 = 22
            r4 = 0
            com.revolut.feature.topup_screen.api.config.TopUpConfig r10 = com.revolut.feature.topup_screen.api.config.TopUpConfig.Companion.a(r1, r10, r4, r2, r3)
            r0.<init>(r10)
            q06.b r10 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.f160140a
            r10.<init>(r1, r4)
            r9.<init>(r0, r10)
            return r9
        L96:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Amount must be positive"
            r9.<init>(r10)
            throw r9
        L9e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Currency code cannot be null or empty"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o7c.m.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c cVar, boolean z) {
        if (!y.D(cVar, "deeplink", 1, "revolut-pay") || !Intrinsics.f(cVar.e(2), "topup")) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        ufm.i iVar = new ufm.i(new ufm.f(new ufm.i(new ufm.c(new t(cVar, this, 18), 0), new o5i.a(10, new o69.b(11)), 1), new o5i.a(11, new o3k.a(this, 15)), 3), new o5i.a(12, new o69.b(12)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
