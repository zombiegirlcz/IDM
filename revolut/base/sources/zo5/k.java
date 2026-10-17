package zo5;

import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements cq5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f323919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f323920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f323921c;
    public CryptoCreateBeneficiaryScreenContract$InputData d;

    public k(d dVar, f fVar) {
        this.f323919a = dVar;
        this.f323920b = fVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f323921c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f323921c, ViewController.class);
        vc.s.h(this.d, CryptoCreateBeneficiaryScreenContract$InputData.class);
        return new l(this.f323919a, this.f323920b, this.d);
    }

    @Override // cq5.a
    public final cq5.a f0(CryptoCreateBeneficiaryScreenContract$InputData cryptoCreateBeneficiaryScreenContract$InputData) {
        cryptoCreateBeneficiaryScreenContract$InputData.getClass();
        this.d = cryptoCreateBeneficiaryScreenContract$InputData;
        return this;
    }
}
