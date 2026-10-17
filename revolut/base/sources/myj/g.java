package myj;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements dz8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f210550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f210551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f210552c;
    public final AnalyticsProduct.Retail d;
    public final AnalyticsProduct.Retail e;

    public g(e featureStateChecker, ang.f userInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureStateChecker, "featureStateChecker");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f210550a = featureStateChecker;
        this.f210551b = userInteractor;
        this.f210552c = featureToggleInteractor;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137509x;
        this.d = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        k9 k9Var2 = k9.Crypto;
        this.e = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof myj.f
            if (r0 == 0) goto L13
            r0 = r5
            myj.f r0 = (myj.f) r0
            int r1 = r0.f210549w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f210549w = r1
            goto L18
        L13:
            myj.f r0 = new myj.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f210549w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L27
            goto L46
        L27:
            r5 = move-exception
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            ang.f r5 = r4.f210551b     // Catch: java.lang.Throwable -> L27
            r2 = 0
            efm.d0 r5 = r5.f(r2)     // Catch: java.lang.Throwable -> L27
            r0.f210549w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = nim.a.b(r5, r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L46
            return r1
        L46:
            do3.n r5 = (do3.n) r5     // Catch: java.lang.Throwable -> L27
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L51
        L4b:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L51:
            boolean r0 = r5 instanceof yhm.n
            r1 = 0
            if (r0 == 0) goto L57
            r5 = r1
        L57:
            do3.n r5 = (do3.n) r5
            if (r5 == 0) goto L63
            com.revolut.feature.address.models.Address r5 = r5.k
            if (r5 == 0) goto L63
            java.lang.String r1 = r5.getCountry()
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: myj.g.a(gim.c):java.lang.Object");
    }
}
