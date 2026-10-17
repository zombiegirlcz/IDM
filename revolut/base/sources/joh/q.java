package joh;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import jm4.z3;
import z0h.s1;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements dqh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uqh.r f177040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o5d.b f177041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cqh.h f177042c;
    public final w d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f177043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f177044h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f177045j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f177046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f177047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f177048n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f177049p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f177050q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f177051r;

    public q(w wVar, cqh.h hVar, uqh.r rVar, o5d.b bVar) {
        this.d = wVar;
        this.f177040a = rVar;
        this.f177041b = bVar;
        this.f177042c = hVar;
        this.e = e4m.b.b(new z3(wVar, this, 1, 22));
        this.f = e4m.b.b(new z3(wVar, this, 0, 22));
        this.f177043g = e4m.b.b(new z3(wVar, this, 2, 22));
        this.f177044h = e4m.b.b(new z3(wVar, this, 3, 22));
        this.i = e4m.b.b(new z3(wVar, this, 5, 22));
        this.f177045j = e4m.b.b(new z3(wVar, this, 4, 22));
        this.k = e4m.b.b(new z3(wVar, this, 6, 22));
        this.f177046l = e4m.b.b(new z3(wVar, this, 7, 22));
        this.f177047m = e4m.b.b(new z3(wVar, this, 8, 22));
        this.f177048n = e4m.b.b(new z3(wVar, this, 10, 22));
        this.o = e4m.b.b(new z3(wVar, this, 11, 22));
        this.f177049p = e4m.b.b(new z3(wVar, this, 12, 22));
        this.f177050q = e4m.b.b(new z3(wVar, this, 13, 22));
        this.f177051r = e4m.b.b(new z3(wVar, this, 9, 22));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(4);
        builderBuilderWithExpectedSize.add(this.k.get());
        aah.h hVar = (aah.h) this.f177044h.get();
        a0k.b.n(hVar);
        builderBuilderWithExpectedSize.add(hVar);
        builderBuilderWithExpectedSize.add(this.f177046l.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f177047m.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVar = (yji.d) this.f.get();
        aah.i iVarD = ((u8h.b) this.d.f177071h).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(dVar, (yji.d) a0k.b.l(iVarD, (s1) this.f177043g.get(), (aah.h) this.f177044h.get()), (yji.d) this.f177045j.get());
    }
}
