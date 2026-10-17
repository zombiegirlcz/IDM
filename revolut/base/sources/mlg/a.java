package mlg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.us_send_checks.impl.ui.address_verification.SendChecksAddressVerificationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendChecksAddressVerificationScreenContract$InputData f206939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f206940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f206941c;

    public a(b bVar, c cVar, SendChecksAddressVerificationScreenContract$InputData sendChecksAddressVerificationScreenContract$InputData) {
        this.f206939a = sendChecksAddressVerificationScreenContract$InputData;
        int i = 17;
        this.f206940b = e4m.b.b(new mjl.b(bVar, this, 1, i));
        this.f206941c = e4m.b.b(new mjl.b(bVar, this, 0, i));
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
