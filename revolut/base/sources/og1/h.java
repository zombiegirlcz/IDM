package og1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.single.GooglePayOtpVerificationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GooglePayOtpVerificationScreenContract$InputData f224975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f224976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f224977c;
    public final e4m.e d;
    public final e4m.e e;

    public h(i iVar, e eVar, ViewController viewController, GooglePayOtpVerificationScreenContract$InputData googlePayOtpVerificationScreenContract$InputData) {
        this.f224975a = googlePayOtpVerificationScreenContract$InputData;
        this.f224976b = viewController;
        this.f224977c = e4m.b.b(new o41.b(iVar, this, 1, 29));
        this.d = e4m.b.b(new o41.b(iVar, this, 2, 29));
        this.e = e4m.b.b(new o41.b(iVar, this, 0, 29));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
