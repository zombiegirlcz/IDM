package je9;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import kotlin.jvm.internal.Intrinsics;
import mx0.n8;
import skm.e0;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.analytics.tracking.v3.d f173244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f173245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final in0.a f173246c;

    public g(com.revolut.analytics.tracking.v3.d diagnosticEventsTracker, f tipDisplayer, in0.a accessibilityServicesTrustManager) {
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        Intrinsics.checkNotNullParameter(tipDisplayer, "tipDisplayer");
        Intrinsics.checkNotNullParameter(accessibilityServicesTrustManager, "accessibilityServicesTrustManager");
        this.f173244a = diagnosticEventsTracker;
        this.f173245b = tipDisplayer;
        this.f173246c = accessibilityServicesTrustManager;
    }

    @Override // je9.d
    public final void a(PinCodeView pinCodeView) {
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(pinCodeView, "pinCodeView");
        in0.d dVar = (in0.d) this.f173246c;
        Boolean bool = (Boolean) dVar.f162574a.get("security_manager_key");
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = ((Boolean) e0.E(kotlin.coroutines.g.f186406a, new in0.c(dVar, null, 2))).booleanValue();
        }
        if (!zBooleanValue) {
            pinCodeView.setKeypadMode(n8.DEFAULT);
            return;
        }
        pinCodeView.setPinCodeTipDisplayer(this.f173245b);
        pinCodeView.setKeypadMode(n8.SECURE);
        com.revolut.analytics.tracking.v3.f.g((com.revolut.analytics.tracking.v3.f) this.f173244a, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new nme.c(21), 14);
    }
}
