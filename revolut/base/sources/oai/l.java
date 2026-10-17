package oai;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_retail_user_declarations.email_verification.otp_flow.EmailVerificationOtpFlowInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements xki.c, tai.a, wai.a, fbi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EmailVerificationOtpFlowInputData f223729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f223730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f223731c = this;
    public final e4m.e d;

    public l(i0 i0Var, EmailVerificationOtpFlowInputData emailVerificationOtpFlowInputData) {
        this.f223730b = i0Var;
        this.f223729a = emailVerificationOtpFlowInputData;
        this.d = e4m.b.b(new nng.n(i0Var, this, 26));
    }

    @Override // wai.a
    public final n0 c() {
        return new n0(this.f223730b, this.f223731c, 3);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // tai.a
    public final l0 j() {
        return new l0(this.f223730b, this.f223731c, 0);
    }

    @Override // fbi.a
    public final j0 q() {
        return new j0(this.f223730b, this.f223731c, 0);
    }
}
