package ms1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.bizum.impl.ui.registration.BizumRegistrationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements qji.a, kx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumRegistrationFlowContract$InputData f208559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f208560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f208561c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f208562g;

    public n(j jVar, BizumRegistrationFlowContract$InputData bizumRegistrationFlowContract$InputData) {
        this.f208560b = jVar;
        this.f208559a = bizumRegistrationFlowContract$InputData;
        int i = 28;
        this.d = e4m.b.b(new mjl.b(jVar, this, 1, i));
        this.e = e4m.b.b(new mjl.b(jVar, this, 0, i));
        this.f = e4m.b.b(new mjl.b(jVar, this, 2, i));
        this.f208562g = e4m.b.b(new mjl.b(jVar, this, 3, i));
    }

    @Override // kx1.a
    public final hc2.j c() {
        return new hc2.j(this.f208560b, this.f208561c, 1);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
