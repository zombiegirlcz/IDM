package oai;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_retail_user_declarations.identity_declarations.IdentityDeclarationsFlowInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements xki.c, aog.b, tng.b, cai.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentityDeclarationsFlowInputData f223758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f223759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f223760c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public q(i0 i0Var, IdentityDeclarationsFlowInputData identityDeclarationsFlowInputData) {
        this.f223759b = i0Var;
        this.f223758a = identityDeclarationsFlowInputData;
        int i = 16;
        this.d = e4m.b.b(new o41.b(i0Var, this, 1, i));
        this.e = e4m.b.b(new o41.b(i0Var, this, 0, i));
        this.f = e4m.b.b(new o41.b(i0Var, this, 2, i));
    }

    @Override // aog.b
    public final aog.a b() {
        return new r(this.f223759b, this.f223760c, 0);
    }

    @Override // cai.a
    public final b c() {
        return new b(this.f223759b, this.f223760c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // tng.b
    public final tng.a q() {
        return new h(this.f223759b, this.f223760c, 0);
    }
}
