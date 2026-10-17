package ini;

import com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlowContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements xki.c, oni.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmEmailWithOtpFlowContract$InputData f162952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f162953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f162954c = this;
    public final e4m.e d = e4m.b.b(new idb.b(this, 21));

    public a(f fVar, ConfirmEmailWithOtpFlowContract$InputData confirmEmailWithOtpFlowContract$InputData) {
        this.f162953b = fVar;
        this.f162952a = confirmEmailWithOtpFlowContract$InputData;
    }

    @Override // oni.a
    public final g b() {
        return new g(this.f162953b, this.f162954c, 0);
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
