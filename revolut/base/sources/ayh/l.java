package ayh;

import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements gyh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f11227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f11228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CryptoOrderDetailsInputData f11229c;

    public l(b bVar) {
        this.f11227a = bVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f11228b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f11228b, ViewController.class);
        s.h(this.f11229c, CryptoOrderDetailsInputData.class);
        return new p(this.f11227a, this.f11228b, this.f11229c);
    }

    @Override // gyh.a
    public final gyh.a t(CryptoOrderDetailsInputData cryptoOrderDetailsInputData) {
        cryptoOrderDetailsInputData.getClass();
        this.f11229c = cryptoOrderDetailsInputData;
        return this;
    }
}
