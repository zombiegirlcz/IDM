package qd2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.spin.api.navigation.SpinNavigation$InputData;
import java.util.Set;
import prk.k0;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements xki.c, kx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpinNavigation$InputData f244847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f244848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f244849c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f244850g;

    public h(f fVar, SpinNavigation$InputData spinNavigation$InputData) {
        this.f244848b = fVar;
        this.f244847a = spinNavigation$InputData;
        int i = 20;
        this.d = e4m.b.b(new k0(fVar, this, 1, i));
        this.e = e4m.b.b(new k0(fVar, this, 0, i));
        this.f = e4m.b.b(new k0(fVar, this, 2, i));
        this.f244850g = e4m.b.b(new k0(fVar, this, 3, i));
    }

    @Override // kx1.a
    public final hc2.j c() {
        return new hc2.j(this.f244848b, this.f244849c, 5);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.e.get(), (n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
