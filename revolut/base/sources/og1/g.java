package og1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.GooglePayOtpLocationMismatchScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GooglePayOtpLocationMismatchScreenContract$InputData f224972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f224973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f224974c;

    public g(i iVar, e eVar, GooglePayOtpLocationMismatchScreenContract$InputData googlePayOtpLocationMismatchScreenContract$InputData) {
        this.f224972a = googlePayOtpLocationMismatchScreenContract$InputData;
        int i = 28;
        this.f224973b = e4m.b.b(new o41.b(iVar, this, 1, i));
        this.f224974c = e4m.b.b(new o41.b(iVar, this, 0, i));
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
