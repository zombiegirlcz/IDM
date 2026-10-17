package og1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GooglePayMultipleOtpVerificationScreenContract$InputData f224969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f224970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f224971c;

    public f(i iVar, e eVar, GooglePayMultipleOtpVerificationScreenContract$InputData googlePayMultipleOtpVerificationScreenContract$InputData) {
        this.f224969a = googlePayMultipleOtpVerificationScreenContract$InputData;
        int i = 27;
        this.f224970b = e4m.b.b(new o41.b(iVar, this, 1, i));
        this.f224971c = e4m.b.b(new o41.b(iVar, this, 0, i));
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
