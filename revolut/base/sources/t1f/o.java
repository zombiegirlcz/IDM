package t1f;

import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration.TradeRevPointsAccountRegistrationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements b2f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f267333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f267334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TradeRevPointsAccountRegistrationScreenContract$InputData f267335c;

    public o(h hVar) {
        this.f267333a = hVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f267334b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f267334b, ViewController.class);
        vc.s.h(this.f267335c, TradeRevPointsAccountRegistrationScreenContract$InputData.class);
        return new n(this.f267333a, this.f267335c);
    }

    @Override // b2f.a
    public final b2f.a f(TradeRevPointsAccountRegistrationScreenContract$InputData tradeRevPointsAccountRegistrationScreenContract$InputData) {
        tradeRevPointsAccountRegistrationScreenContract$InputData.getClass();
        this.f267335c = tradeRevPointsAccountRegistrationScreenContract$InputData;
        return this;
    }
}
