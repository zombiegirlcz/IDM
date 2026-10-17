package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.portability_details.PortabilityDetailsContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class x0 implements xki.c, xca.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortabilityDetailsContract$InputData f234119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f234121c = this;
    public final e4m.e d;

    public x0(d0 d0Var, PortabilityDetailsContract$InputData portabilityDetailsContract$InputData) {
        this.f234120b = d0Var;
        this.f234119a = portabilityDetailsContract$InputData;
        this.d = e4m.b.b(new p2k.c(d0Var, this, 11));
    }

    @Override // xca.a
    public final o1 b() {
        return new o1(this.f234120b, this.f234121c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
