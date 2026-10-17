package muj;

import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import f23.g0;
import go.g;
import jla.h;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import t38.e;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements f0j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ouj.a f209035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final toa.a f209036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f209037c;
    public final gte.a d;

    public c(ouj.a travelRepository, toa.a notificationSettingsInteractor, h productCatalogueInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(travelRepository, "travelRepository");
        Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f209035a = travelRepository;
        this.f209036b = notificationSettingsInteractor;
        this.f209037c = productCatalogueInteractor;
        this.d = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof muj.a
            if (r0 == 0) goto L13
            r0 = r5
            muj.a r0 = (muj.a) r0
            int r1 = r0.f209033w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f209033w = r1
            goto L18
        L13:
            muj.a r0 = new muj.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f209033w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            t38.e r5 = r4.b()
            r0.f209033w = r3
            java.lang.Object r5 = vkm.q.z(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L48
            boolean r5 = r5.booleanValue()
            goto L49
        L48:
            r5 = 0
        L49:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: muj.c.a(gim.c):java.lang.Object");
    }

    public final e b() {
        return new e(((d) this.d).c(AnalyticsFeatureApi$Toggles.AnalyticsTravelFeatures.f87390c) ? new g(Boolean.TRUE, 2) : new ae8.c(bla.b.b(this.f209037c, "TRAVEL_LIFECYCLE.travel_mode"), 15), 24, rd0.e.b(zi0.c.q(nim.a.w(this.f209036b.b(), new msb.c(26)), Boolean.FALSE)), new g0(3, 3, null));
    }
}
