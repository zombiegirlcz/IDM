package zfl;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements p5d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5d.b f322031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsContext f322032b;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(vel.f r5) {
        /*
            r4 = this;
            java.lang.String r0 = "performanceAsset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r4.<init>()
            p5d.b r0 = new p5d.b
            java.lang.String r1 = r5.a()
            java.lang.String r2 = zi0.c.N(r5)
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.f322031a = r0
            boolean r0 = r5 instanceof vel.b
            if (r0 != 0) goto L20
            boolean r0 = r5 instanceof vel.c
            if (r0 == 0) goto L22
        L20:
            r0 = r3
            goto L4c
        L22:
            boolean r0 = r5 instanceof vel.d
            if (r0 == 0) goto L34
            grl.hd r0 = grl.hd.COMMODITY
            r1 = r5
            vel.d r1 = (vel.d) r1
            xi0.b r1 = r1.f288352a
            boolean r1 = cp5.d.y(r1)
            if (r1 == 0) goto L20
            goto L4c
        L34:
            boolean r0 = r5 instanceof vel.e
            if (r0 == 0) goto L46
            r0 = r5
            vel.e r0 = (vel.e) r0
            nel.a0 r0 = r0.f288355a
            nel.n r0 = r0.f214560a
            nel.z r0 = r0.f214597c
            grl.hd r0 = a.a.M(r0)
            goto L4c
        L46:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L4c:
            if (r0 == 0) goto L6e
            com.revolut.analytics.tracking.v3.AnalyticsContext$b r1 = com.revolut.analytics.tracking.v3.AnalyticsContext.INSTANCE
            com.revolut.tracking.v3.SwipeToTradeContext$a r2 = com.revolut.tracking.v3.SwipeToTradeContext.newBuilder()
            java.lang.String r5 = r5.a()
            r2.h(r5)
            r2.i(r0)
            com.google.protobuf.w0 r5 = r2.a()
            r1.getClass()
            com.google.protobuf.w0 r5 = com.revolut.analytics.tracking.v3.AnalyticsContext.Companion.a(r5)
            com.revolut.analytics.tracking.v3.AnalyticsContext r3 = new com.revolut.analytics.tracking.v3.AnalyticsContext
            r3.<init>(r5)
        L6e:
            r4.f322032b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zfl.a.<init>(vel.f):void");
    }

    @Override // p5d.a
    public final AnalyticsContext R() {
        return this.f322032b;
    }

    @Override // p5d.a
    public final AnimationRequest b() {
        return null;
    }

    @Override // p5d.a
    public final p5d.b c() {
        return this.f322031a;
    }
}
