package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.otp.input.flow.push.OtpPushScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OtpPushScreenContract$InputData f195925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f195926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f195927c = e4m.b.b(new y(this, 1, 2));
    public final e4m.e d = e4m.b.b(new y(this, 0, 2));
    public final e4m.e e = e4m.b.b(new y(this, 2, 2));

    public e0(q0 q0Var, c cVar, OtpPushScreenContract$InputData otpPushScreenContract$InputData) {
        this.f195926b = cVar;
        this.f195925a = otpPushScreenContract$InputData;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f195926b.Q.get(), (yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f195926b.P.get());
    }
}
