package oai;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationPromptContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class q0 implements xki.e, wai.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EmailVerificationPromptContract$InputData f223762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f223763c;
    public final e4m.e d;
    public final Object e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223761a = 1;
    public final q0 f = this;

    public q0(i0 i0Var, i iVar, EmailVerificationPromptContract$InputData emailVerificationPromptContract$InputData) {
        this.f223763c = i0Var;
        this.e = iVar;
        this.f223762b = emailVerificationPromptContract$InputData;
        this.d = e4m.b.b(new v(i0Var, this, 12));
    }

    @Override // wai.a
    public final n0 c() {
        switch (this.f223761a) {
            case 0:
                return new n0(this.f223763c, (k) this.e, this.f, 2);
            default:
                return new n0(this.f223763c, (i) this.e, this.f, 0);
        }
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f223761a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f223761a) {
        }
        return ImmutableSet.of();
    }

    public q0(i0 i0Var, k kVar, EmailVerificationPromptContract$InputData emailVerificationPromptContract$InputData) {
        this.f223763c = i0Var;
        this.e = kVar;
        this.f223762b = emailVerificationPromptContract$InputData;
        this.d = e4m.b.b(new v(i0Var, this, 11));
    }
}
