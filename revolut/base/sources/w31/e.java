package w31;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import pkm.k;
import tnb.g0;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f294137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.analytics.tracking.v3.d f294138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f294139c;
    public final z31.c d;
    public final g0 e;
    public final b41.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c41.c f294140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f294141h;

    public e(Context context, com.revolut.analytics.tracking.v3.d diagnosticEventsTracker, gte.a featureToggleInteractor, z31.c revolutDeviceFingerprintProvider, g0 revolutDeviceFingerprintService, b41.e seonDeviceFingerprintProvider, c41.c seonSdkInstanceProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revolutDeviceFingerprintProvider, "revolutDeviceFingerprintProvider");
        Intrinsics.checkNotNullParameter(revolutDeviceFingerprintService, "revolutDeviceFingerprintService");
        Intrinsics.checkNotNullParameter(seonDeviceFingerprintProvider, "seonDeviceFingerprintProvider");
        Intrinsics.checkNotNullParameter(seonSdkInstanceProvider, "seonSdkInstanceProvider");
        k timeSource = k.f237220a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revolutDeviceFingerprintProvider, "revolutDeviceFingerprintProvider");
        Intrinsics.checkNotNullParameter(revolutDeviceFingerprintService, "revolutDeviceFingerprintService");
        Intrinsics.checkNotNullParameter(seonDeviceFingerprintProvider, "seonDeviceFingerprintProvider");
        Intrinsics.checkNotNullParameter(seonSdkInstanceProvider, "seonSdkInstanceProvider");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        this.f294137a = context;
        this.f294138b = diagnosticEventsTracker;
        this.f294139c = featureToggleInteractor;
        this.d = revolutDeviceFingerprintProvider;
        this.e = revolutDeviceFingerprintService;
        this.f = seonDeviceFingerprintProvider;
        this.f294140g = seonSdkInstanceProvider;
        this.f294141h = timeSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof w31.b
            if (r0 == 0) goto L13
            r0 = r6
            w31.b r0 = (w31.b) r0
            int r1 = r0.f294134w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f294134w = r1
            goto L18
        L13:
            w31.b r0 = new w31.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f294134w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            w31.c r6 = new w31.c
            r2 = 0
            r4 = 0
            r6.<init>(r5, r4, r2)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            r0.f294134w = r3
            java.lang.Object r6 = skm.e0.J(r2, r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            u31.b r6 = (u31.b) r6
            java.util.Map r6 = r6.f276737a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w31.e.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof w31.d
            if (r0 == 0) goto L13
            r0 = r6
            w31.d r0 = (w31.d) r0
            int r1 = r0.f294136w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f294136w = r1
            goto L18
        L13:
            w31.d r0 = new w31.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f294136w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r6)
            goto L45
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            yhm.o.b(r6)
            w31.c r6 = new w31.c
            r6.<init>(r5, r4, r3)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            r0.f294136w = r3
            java.lang.Object r6 = skm.e0.J(r2, r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            u31.d r6 = (u31.d) r6
            if (r6 == 0) goto L4c
            java.lang.String r6 = r6.f276738a
            return r6
        L4c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w31.e.b(gim.c):java.lang.Object");
    }
}
