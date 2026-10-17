package zo5;

import com.revolut.feature.crypto.withdraw.api.navigation.CryptoBeneficiaryDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements hq5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f323938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f323939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CryptoBeneficiaryDetailsScreenContract$InputData f323940c;

    public p(d dVar) {
        this.f323938a = dVar;
    }

    @Override // hq5.a
    public final hq5.a G(CryptoBeneficiaryDetailsScreenContract$InputData cryptoBeneficiaryDetailsScreenContract$InputData) {
        cryptoBeneficiaryDetailsScreenContract$InputData.getClass();
        this.f323940c = cryptoBeneficiaryDetailsScreenContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f323939b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f323939b, ViewController.class);
        vc.s.h(this.f323940c, CryptoBeneficiaryDetailsScreenContract$InputData.class);
        return new o(this.f323938a, this.f323939b, this.f323940c);
    }
}
