package p8a;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class k0 implements xki.c, nba.a, pba.a, vba.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kba.c f234004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f234006c = this;
    public final e4m.e d;
    public final e4m.e e;

    public k0(d0 d0Var, kba.c cVar) {
        this.f234005b = d0Var;
        this.f234004a = cVar;
        this.d = e4m.b.b(new m(d0Var, this, 0, 9));
        this.e = e4m.b.b(new m(d0Var, this, 1, 9));
    }

    @Override // pba.a
    public final k1 b() {
        return new k1(this.f234005b, this.f234006c, 1);
    }

    @Override // vba.a
    public final m1 c() {
        return new m1(this.f234005b, this.f234006c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // nba.a
    public final i1 j() {
        return new i1(this.f234005b, this.f234006c, 1);
    }
}
