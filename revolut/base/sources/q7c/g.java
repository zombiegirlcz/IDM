package q7c;

import k7c.z;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pig.y;
import vkm.v1;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements k6c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f242813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y7c.b f242814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final elb.b f242815c;

    public g(wsg.n walletInteractor, y7c.b paymentMethodsRepository, elb.b savingsConfigInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(paymentMethodsRepository, "paymentMethodsRepository");
        Intrinsics.checkNotNullParameter(savingsConfigInteractor, "savingsConfigInteractor");
        this.f242813a = walletInteractor;
        this.f242814b = paymentMethodsRepository;
        this.f242815c = savingsConfigInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dj0.d r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof q7c.f
            if (r0 == 0) goto L13
            r0 = r12
            q7c.f r0 = (q7c.f) r0
            int r1 = r0.f242812x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242812x = r1
            goto L18
        L13:
            q7c.f r0 = new q7c.f
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f242812x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            dj0.d r11 = r0.u
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L29
            goto L51
        L29:
            r0 = move-exception
            r12 = r0
            goto L5f
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            yhm.o.b(r12)
            yhm.m$a r12 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29
            wsg.n r4 = r10.f242813a     // Catch: java.lang.Throwable -> L29
            xi0.b r5 = r11.f115083b     // Catch: java.lang.Throwable -> L29
            r8 = 0
            r9 = 62
            r6 = 0
            r7 = 0
            efm.d0 r12 = osg.b.r(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L29
            r0.u = r11     // Catch: java.lang.Throwable -> L29
            r0.f242812x = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r12 = nim.a.b(r12, r0)     // Catch: java.lang.Throwable -> L29
            if (r12 != r1) goto L51
            return r1
        L51:
            io3.d r12 = (io3.d) r12     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.internal.Intrinsics.h(r12)     // Catch: java.lang.Throwable -> L29
            dj0.d r12 = io3.h.e(r12)     // Catch: java.lang.Throwable -> L29
            dj0.d r11 = pyd.c.H(r11, r12)     // Catch: java.lang.Throwable -> L29
            return r11
        L5f:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.o.a(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: q7c.g.a(dj0.d, gim.c):java.lang.Object");
    }

    public final akg.n b(u6c.n paymentMethodParams, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(e(paymentMethodParams, loadingStrategy), new q75.n(11));
    }

    public final akg.n c(u6c.p paymentMethodParams, String str, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        z zVar = (z) this.f242814b;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(zVar.f182029h.b(paymentMethodParams, loadingStrategy), new y(this, str, 23));
    }

    public final akg.n d(u6c.n paymentMethodParams) {
        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(u0.m(e(paymentMethodParams, loadingStrategy), nim.a.v(this.f242815c.a(w4l.j.f294644c), new q75.n(9))), new q75.n(8));
    }

    public final akg.n e(u6c.n paymentMethodParams, w4l.k loadingStrategy) {
        z zVar = (z) this.f242814b;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(zVar.f182028g.b(paymentMethodParams, loadingStrategy), new q75.n(paymentMethodParams, 10));
    }

    public final vkm.f f(u6c.p paymentMethodParams, String pocketId, dj0.d previousBalance) {
        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(previousBalance, "previousBalance");
        z zVar = (z) this.f242814b;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
        v1 v1VarR = vkm.q.R(nim.a.v(nim.a.v(rd0.e.b(jpf.a.u(zVar.i, paymentMethodParams, 3L)), new y(this, pocketId, 24)), new ar3.a(24, previousBalance)), new q7b.j(previousBalance, (Continuation) null, 1));
        k6c.b.Companion.getClass();
        return zi0.c.L(v1VarR, previousBalance, k6c.a.f181679c);
    }
}
