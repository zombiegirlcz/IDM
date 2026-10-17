package ini;

import com.revolut.otp.input.flow.code.flow.confirm_with_otp_code.ConfirmWithOtpCodeFlowContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements xki.c, oni.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmWithOtpCodeFlowContract$InputData f162955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f162956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f162957c = this;
    public final e4m.e d = e4m.b.b(new idb.b(this, 22));

    public b(f fVar, ConfirmWithOtpCodeFlowContract$InputData confirmWithOtpCodeFlowContract$InputData) {
        this.f162956b = fVar;
        this.f162955a = confirmWithOtpCodeFlowContract$InputData;
    }

    @Override // oni.a
    public final g b() {
        return new g(this.f162956b, this.f162957c, 1);
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
