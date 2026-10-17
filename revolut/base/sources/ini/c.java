package ini;

import com.revolut.otp.input.flow.code.OtpCodeInputScreenContract$InputData;
import hc2.r;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OtpCodeInputScreenContract$InputData f162958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f162959b;

    public c(f fVar, b bVar, OtpCodeInputScreenContract$InputData otpCodeInputScreenContract$InputData) {
        this.f162958a = otpCodeInputScreenContract$InputData;
        this.f162959b = e4m.b.b(new r(fVar, this, 25));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
