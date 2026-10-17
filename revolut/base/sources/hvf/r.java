package hvf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transport.impl.ui.hub.TransportHubFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements rji.a, ewf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransportHubFlowContract$InputData f155950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f155951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f155952c = this;
    public final e4m.e d;
    public final e4m.e e;

    public r(q qVar, TransportHubFlowContract$InputData transportHubFlowContract$InputData) {
        this.f155951b = qVar;
        this.f155950a = transportHubFlowContract$InputData;
        int i = 10;
        this.d = e4m.b.b(new hjg.b(qVar, this, 1, i));
        this.e = e4m.b.b(new hjg.b(qVar, this, 0, i));
    }

    @Override // ewf.b
    public final ewf.a b() {
        return new w(this.f155951b, this.f155952c);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
