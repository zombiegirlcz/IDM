package fw2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.single.GooglePayOtpVerificationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GooglePayOtpVerificationScreenContract$InputData f138552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f138553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f138554c;
    public final e4m.e d;
    public final e4m.e e;

    public k(d dVar, h hVar, ViewController viewController, GooglePayOtpVerificationScreenContract$InputData googlePayOtpVerificationScreenContract$InputData) {
        this.f138552a = googlePayOtpVerificationScreenContract$InputData;
        this.f138553b = viewController;
        this.f138554c = e4m.b.b(new fta.e(dVar, this, 1, 5));
        this.d = e4m.b.b(new fta.e(dVar, this, 2, 5));
        this.e = e4m.b.b(new fta.e(dVar, this, 0, 5));
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
