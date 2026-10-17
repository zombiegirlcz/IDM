package zo5;

import com.revolut.feature.crypto.withdraw.api.navigation.CryptoBeneficiaryDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements hq5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f323928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f323929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f323930c;
    public CryptoBeneficiaryDetailsScreenContract$InputData d;

    public n(d dVar, f fVar) {
        this.f323928a = dVar;
        this.f323929b = fVar;
    }

    @Override // hq5.a
    public final hq5.a G(CryptoBeneficiaryDetailsScreenContract$InputData cryptoBeneficiaryDetailsScreenContract$InputData) {
        cryptoBeneficiaryDetailsScreenContract$InputData.getClass();
        this.d = cryptoBeneficiaryDetailsScreenContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f323930c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f323930c, ViewController.class);
        vc.s.h(this.d, CryptoBeneficiaryDetailsScreenContract$InputData.class);
        return new o(this.f323928a, this.f323929b, this.f323930c, this.d);
    }
}
