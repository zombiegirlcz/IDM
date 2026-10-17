package oai;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_retail_user_declarations.email_verification.EmailVerificationFlowInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements xki.c, bbi.a, wai.a, fbi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EmailVerificationFlowInputData f223723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f223724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f223725c = this;
    public final e4m.e d;

    public k(i0 i0Var, EmailVerificationFlowInputData emailVerificationFlowInputData) {
        this.f223724b = i0Var;
        this.f223723a = emailVerificationFlowInputData;
        this.d = e4m.b.b(new nng.n(i0Var, this, 25));
    }

    @Override // bbi.a
    public final p0 b() {
        return new p0(this.f223724b, this.f223725c, 0);
    }

    @Override // wai.a
    public final n0 c() {
        return new n0(this.f223724b, this.f223725c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // fbi.a
    public final j0 q() {
        return new j0(this.f223724b, this.f223725c, 1);
    }
}
