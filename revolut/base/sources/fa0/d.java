package fa0;

import com.google.common.collect.ImmutableSet;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements ja0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFlowInput f133023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f133024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f133025c;
    public final e4m.e d;

    public d(k kVar, BackendFlowInput backendFlowInput) {
        this.f133023a = backendFlowInput;
        this.f133024b = e4m.b.b(new eyd.j(kVar, this, 1, 27));
        this.f133025c = e4m.b.b(new eyd.j(kVar, this, 0, 27));
        this.d = e4m.b.b(new eyd.j(kVar, this, 2, 27));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f133025c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
