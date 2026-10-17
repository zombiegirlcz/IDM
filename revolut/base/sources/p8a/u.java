package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.automatico.PixAutomaticoContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements xki.c, s9a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixAutomaticoContract$InputData f234093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f234095c = this;
    public final e4m.e d = e4m.b.b(new p7c.a(this, 10));

    public u(d0 d0Var, PixAutomaticoContract$InputData pixAutomaticoContract$InputData) {
        this.f234094b = d0Var;
        this.f234093a = pixAutomaticoContract$InputData;
    }

    @Override // s9a.a
    public final d1 b() {
        return new d1(this.f234094b, this.f234095c, 1);
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
