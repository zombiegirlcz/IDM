package ini;

import com.revolut.otp.input.flow.email.OtpEmailScreenContract$InputData;
import hc2.r;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OtpEmailScreenContract$InputData f162962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f162963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f162964c;

    public e(f fVar, a aVar, OtpEmailScreenContract$InputData otpEmailScreenContract$InputData) {
        this.f162963b = fVar;
        this.f162962a = otpEmailScreenContract$InputData;
        this.f162964c = e4m.b.b(new r(fVar, this, 26));
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
