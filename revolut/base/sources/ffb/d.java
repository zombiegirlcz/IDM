package ffb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w39.b f134790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y80.a f134791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f134792c;

    public d(w39.b locationInteractor, y80.a permissionProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f134790a = locationInteractor;
        this.f134791b = permissionProvider;
        this.f134792c = featureToggleInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ffb.c
            if (r0 == 0) goto L13
            r0 = r9
            ffb.c r0 = (ffb.c) r0
            int r1 = r0.f134789w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134789w = r1
            goto L18
        L13:
            ffb.c r0 = new ffb.c
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f134789w
            w39.b r3 = r8.f134790a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            yhm.o.b(r9)     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            goto L71
        L2c:
            r9 = move-exception
            goto L99
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            yhm.o.b(r9)     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            goto L5c
        L3a:
            yhm.o.b(r9)
            y80.a r9 = r8.f134791b
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r9 = r9.c(r2)
            if (r9 != 0) goto L4a
            ffb.g r9 = ffb.g.f134795a
            return r9
        L4a:
            r9 = r3
            z39.b r9 = (z39.b) r9     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            c49.d r9 = r9.f319221b     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            rfm.m r9 = r9.c()     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            r0.f134789w = r5     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            java.lang.Object r9 = nim.a.i(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            if (r9 != r1) goto L5c
            goto L70
        L5c:
            com.revolut.feature.location.api.domain.models.location.LocationDomain r9 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r9     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            if (r9 != 0) goto L73
            z39.b r3 = (z39.b) r3     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            c49.d r9 = r3.f319221b     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            ufm.n r9 = r9.e()     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            r0.f134789w = r4     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            java.lang.Object r9 = nim.a.b(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            if (r9 != r1) goto L71
        L70:
            return r1
        L71:
            com.revolut.feature.location.api.domain.models.location.LocationDomain r9 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r9     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
        L73:
            ffb.e r0 = new ffb.e     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            kotlin.jvm.internal.Intrinsics.h(r9)     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            ffb.a r1 = new ffb.a     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            double r2 = r9.f78066a     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            r4 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r2 = r2 * r4
            double r2 = java.lang.Math.rint(r2)     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            double r2 = r2 / r4
            double r6 = r9.f78067b     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            double r6 = r6 * r4
            double r6 = java.lang.Math.rint(r6)     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            double r6 = r6 / r4
            r1.<init>(r2, r6)     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            r0.<init>(r1)     // Catch: java.util.concurrent.CancellationException -> L2c java.lang.Exception -> L96
            return r0
        L96:
            ffb.f r9 = ffb.f.f134794a
            return r9
        L99:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ffb.d.a(gim.c):java.lang.Object");
    }
}
