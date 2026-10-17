package zo5;

import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements cq5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f323925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f323926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CryptoCreateBeneficiaryScreenContract$InputData f323927c;

    public m(d dVar) {
        this.f323925a = dVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f323926b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f323926b, ViewController.class);
        vc.s.h(this.f323927c, CryptoCreateBeneficiaryScreenContract$InputData.class);
        return new l(this.f323925a, this.f323927c);
    }

    @Override // cq5.a
    public final cq5.a f0(CryptoCreateBeneficiaryScreenContract$InputData cryptoCreateBeneficiaryScreenContract$InputData) {
        cryptoCreateBeneficiaryScreenContract$InputData.getClass();
        this.f323927c = cryptoCreateBeneficiaryScreenContract$InputData;
        return this;
    }
}
