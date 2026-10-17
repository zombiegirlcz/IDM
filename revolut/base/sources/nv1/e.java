package nv1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.breb.api.navigation.BrebNavigation$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements xki.c, rw1.a, kx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrebNavigation$InputData f219388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f219389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f219390c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f219391g;

    public e(g gVar, BrebNavigation$InputData brebNavigation$InputData) {
        this.f219389b = gVar;
        this.f219388a = brebNavigation$InputData;
        int i = 22;
        this.d = e4m.b.b(new nk7.k(gVar, this, 1, i));
        this.e = e4m.b.b(new nk7.k(gVar, this, 0, i));
        this.f = e4m.b.b(new nk7.k(gVar, this, 2, i));
        this.f219391g = e4m.b.b(new nk7.k(gVar, this, 3, i));
    }

    @Override // rw1.a
    public final t b() {
        return new t(this.f219389b, this.f219390c, 0);
    }

    @Override // kx1.a
    public final hc2.j c() {
        return new hc2.j(this.f219389b, this.f219390c, 3);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get(), (yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
