package zo5;

import com.revolut.feature.crypto.withdraw.api.navigation.CryptoFeeBreakdownDialogInput;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements nq5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f323947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f323948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CryptoFeeBreakdownDialogInput f323949c;

    public s(d dVar) {
        this.f323947a = dVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f323948b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f323948b, ViewController.class);
        vc.s.h(this.f323949c, CryptoFeeBreakdownDialogInput.class);
        return new r(this.f323947a, this.f323949c);
    }

    @Override // nq5.a
    public final nq5.a v(CryptoFeeBreakdownDialogInput cryptoFeeBreakdownDialogInput) {
        cryptoFeeBreakdownDialogInput.getClass();
        this.f323949c = cryptoFeeBreakdownDialogInput;
        return this;
    }
}
