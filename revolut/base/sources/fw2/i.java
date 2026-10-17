package fw2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GooglePayMultipleOtpVerificationScreenContract$InputData f138546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f138547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f138548c;

    public i(d dVar, h hVar, GooglePayMultipleOtpVerificationScreenContract$InputData googlePayMultipleOtpVerificationScreenContract$InputData) {
        this.f138546a = googlePayMultipleOtpVerificationScreenContract$InputData;
        this.f138547b = e4m.b.b(new fta.e(dVar, this, 1, 3));
        this.f138548c = e4m.b.b(new fta.e(dVar, this, 0, 3));
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
