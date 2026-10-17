package qgk;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class z implements khk.b, xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk.a f246343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rhk.c f246344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f246345c;
    public final z d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246347h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f246348j;
    public final e4m.e k;

    public z(i0 i0Var, agk.a aVar, rhk.c cVar) {
        this.f246345c = i0Var;
        this.f246343a = aVar;
        this.f246344b = cVar;
        int i = 6;
        this.e = e4m.b.b(new m(i0Var, this, 2, i));
        this.f = e4m.b.b(new m(i0Var, this, 3, i));
        this.f246346g = e4m.b.b(new m(i0Var, this, 4, i));
        this.f246347h = e4m.b.b(new m(i0Var, this, 1, i));
        this.i = e4m.b.b(new m(i0Var, this, 5, i));
        this.f246348j = e4m.b.b(new m(i0Var, this, 0, i));
        this.k = e4m.b.b(new m(i0Var, this, 6, i));
    }

    @Override // khk.b
    public final c2 b() {
        return new c2(this.f246345c, this.d, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.copyOf((Collection) this.f246348j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
