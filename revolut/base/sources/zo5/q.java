package zo5;

import com.revolut.feature.crypto.withdraw.api.navigation.CryptoFeeBreakdownDialogInput;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements nq5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f323941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f323942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f323943c;
    public CryptoFeeBreakdownDialogInput d;

    public q(d dVar, f fVar) {
        this.f323941a = dVar;
        this.f323942b = fVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f323943c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f323943c, ViewController.class);
        vc.s.h(this.d, CryptoFeeBreakdownDialogInput.class);
        return new r(this.f323941a, this.f323942b, this.d);
    }

    @Override // nq5.a
    public final nq5.a v(CryptoFeeBreakdownDialogInput cryptoFeeBreakdownDialogInput) {
        cryptoFeeBreakdownDialogInput.getClass();
        this.d = cryptoFeeBreakdownDialogInput;
        return this;
    }
}
