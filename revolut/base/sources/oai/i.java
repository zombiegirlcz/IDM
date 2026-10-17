package oai;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements xki.c, wai.a, bbi.a, tai.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EmailFlowInputData f223696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f223697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f223698c = this;
    public final e4m.e d;

    public i(i0 i0Var, EmailFlowInputData emailFlowInputData) {
        this.f223697b = i0Var;
        this.f223696a = emailFlowInputData;
        this.d = e4m.b.b(new nng.n(i0Var, this, 24));
    }

    @Override // bbi.a
    public final p0 b() {
        return new p0(this.f223697b, this.f223698c, 1);
    }

    @Override // wai.a
    public final n0 c() {
        return new n0(this.f223697b, this.f223698c, 4);
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
        return new l0(this.f223697b, this.f223698c, 1);
    }
}
