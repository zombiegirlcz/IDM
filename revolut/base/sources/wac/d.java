package wac;

import ash.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tul.b f295863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f295864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f295865c;

    public d(tul.b trackingInteractor, gte.a featureToggleInteractor, i widgetsInteractor) {
        Intrinsics.checkNotNullParameter(trackingInteractor, "trackingInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        this.f295863a = trackingInteractor;
        this.f295864b = featureToggleInteractor;
        this.f295865c = widgetsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(wac.d r4, boolean r5, kotlin.coroutines.Continuation r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof wac.c
            if (r0 == 0) goto L16
            r0 = r6
            wac.c r0 = (wac.c) r0
            int r1 = r0.f295862w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f295862w = r1
            goto L1b
        L16:
            wac.c r0 = new wac.c
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f295862w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L52
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r6)
            if (r5 == 0) goto L3a
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L3a:
            ash.i r4 = r4.f295865c
            com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$Personal$a r5 = com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext.Personal.INSTANCE
            r5.getClass()
            com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$Personal r5 = com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext.Personal.Companion.a()
            r0.f295862w = r3
            ish.z r4 = (ish.z) r4
            java.lang.String r6 = "OrderTrackingMedium"
            java.lang.Object r6 = r4.f(r5, r6, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            r4 = r4 ^ r3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wac.d.a(wac.d, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
