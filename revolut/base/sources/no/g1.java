package no;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public final class g1 extends nri.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xg0.a f217773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.analytics.tracking.v3.d f217774c;
    public final gi0.a d;
    public final gpk.c e;
    public final com.revolut.retail.analytics.tracking.impl.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f217775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f217776h;

    public g1(Context context, xg0.a dynamicDelivery, com.revolut.analytics.tracking.v3.d diagnosticEventsTracker, gi0.a mobileServicesProvider, gpk.c coroutineScopeProvider, yf.c gpsStoreUriFactory, qi0.b hagStoreUriFactory, com.revolut.retail.analytics.tracking.impl.a analyticsToggles) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        Intrinsics.checkNotNullParameter(mobileServicesProvider, "mobileServicesProvider");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(gpsStoreUriFactory, "gpsStoreUriFactory");
        Intrinsics.checkNotNullParameter(hagStoreUriFactory, "hagStoreUriFactory");
        Intrinsics.checkNotNullParameter(analyticsToggles, "analyticsToggles");
        this.f217773b = dynamicDelivery;
        this.f217774c = diagnosticEventsTracker;
        this.d = mobileServicesProvider;
        this.e = coroutineScopeProvider;
        this.f = analyticsToggles;
        this.f217775g = yhm.j.b(new lu0.a(context, gpsStoreUriFactory, hagStoreUriFactory));
        this.f217776h = new LinkedHashMap();
    }

    @Override // nri.a
    public final void i3() {
        CoroutineScope coroutineScopeC = this.e.c();
        skm.p0 p0Var = skm.p0.f264001a;
        skm.e0.C(coroutineScopeC, elm.f.f127540b, null, new n68.x(this, null, 25), 2);
    }
}
