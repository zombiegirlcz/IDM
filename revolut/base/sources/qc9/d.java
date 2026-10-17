package qc9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.onboarding.api.qes_terms.QesTermsFlowInputData;
import java.util.Set;
import prk.k0;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements xki.c, he9.k, sk3.b, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QesTermsFlowInputData f244632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f244633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f244634c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f244635g;

    public d(c cVar, QesTermsFlowInputData qesTermsFlowInputData) {
        this.f244633b = cVar;
        this.f244632a = qesTermsFlowInputData;
        int i = 17;
        this.d = e4m.b.b(new k0(cVar, this, 1, i));
        this.e = e4m.b.b(new k0(cVar, this, 0, i));
        this.f = e4m.b.b(new k0(cVar, this, 2, i));
        this.f244635g = e4m.b.b(new k0(cVar, this, 3, i));
    }

    @Override // he9.k
    public final he9.f b() {
        return new he9.f(this.f244633b, this.f244634c, 4);
    }

    @Override // sk3.b
    public final dd9.a c() {
        return new dd9.a(this.f244633b, this.f244634c, 2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // qc9.p
    public final dd9.c j() {
        return new dd9.c(this.f244633b, this.f244634c, 1);
    }
}
