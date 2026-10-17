package t1f;

import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration.TradeRevPointsAccountRegistrationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements b2f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f267327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f267328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f267329c;
    public TradeRevPointsAccountRegistrationScreenContract$InputData d;

    public m(h hVar, e eVar) {
        this.f267327a = hVar;
        this.f267328b = eVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f267329c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f267329c, ViewController.class);
        vc.s.h(this.d, TradeRevPointsAccountRegistrationScreenContract$InputData.class);
        return new n(this.f267327a, this.f267328b, this.d);
    }

    @Override // b2f.a
    public final b2f.a f(TradeRevPointsAccountRegistrationScreenContract$InputData tradeRevPointsAccountRegistrationScreenContract$InputData) {
        tradeRevPointsAccountRegistrationScreenContract$InputData.getClass();
        this.d = tradeRevPointsAccountRegistrationScreenContract$InputData;
        return this;
    }
}
