package hvf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transport.impl.ui.hub.transit.TransportHubTransitScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransportHubTransitScreenContract$InputData f155962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f155963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f155964c;
    public final e4m.e d;

    public t(q qVar, r rVar, TransportHubTransitScreenContract$InputData transportHubTransitScreenContract$InputData) {
        this.f155963b = qVar;
        this.f155962a = transportHubTransitScreenContract$InputData;
        this.f155964c = e4m.b.b(new ehe.o(qVar, rVar, this, 1, 25));
        this.d = e4m.b.b(new ehe.o(qVar, rVar, this, 0, 25));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f155963b.f155949n.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
