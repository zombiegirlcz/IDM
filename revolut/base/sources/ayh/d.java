package ayh;

import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements gyh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f11206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f11207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f11208c;
    public CryptoOrderDetailsInputData d;

    public d(b bVar, c cVar) {
        this.f11206a = bVar;
        this.f11207b = cVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f11208c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f11208c, ViewController.class);
        s.h(this.d, CryptoOrderDetailsInputData.class);
        return new k(this.f11206a, this.f11207b, this.f11208c, this.d);
    }

    @Override // gyh.a
    public final gyh.a t(CryptoOrderDetailsInputData cryptoOrderDetailsInputData) {
        cryptoOrderDetailsInputData.getClass();
        this.d = cryptoOrderDetailsInputData;
        return this;
    }
}
