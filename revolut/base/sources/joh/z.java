package joh;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import jm4.z3;
import z0h.s1;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements oqh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uqh.r f177080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o5d.b f177081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nqh.e f177082c;
    public final w d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f177083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f177084h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f177085j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f177086l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f177087m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f177088n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f177089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f177090q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f177091r;

    public z(w wVar, t tVar, nqh.e eVar, uqh.r rVar, o5d.b bVar) {
        this.d = wVar;
        this.f177080a = rVar;
        this.f177081b = bVar;
        this.f177082c = eVar;
        int i = 23;
        this.e = e4m.b.b(new z3(wVar, this, 0, i));
        this.f = e4m.b.b(new z3(wVar, this, 1, i));
        this.f177083g = e4m.b.b(new z3(wVar, this, 3, i));
        this.f177084h = e4m.b.b(new z3(wVar, this, 2, i));
        this.i = e4m.b.b(new z3(wVar, this, 5, i));
        this.f177085j = e4m.b.b(new z3(wVar, this, 4, i));
        this.k = e4m.b.b(new z3(wVar, this, 6, i));
        this.f177086l = e4m.b.b(new z3(wVar, this, 7, i));
        this.f177087m = e4m.b.b(new z3(wVar, this, 8, i));
        this.f177088n = e4m.b.b(new z3(wVar, this, 10, i));
        this.o = e4m.b.b(new z3(wVar, this, 11, i));
        this.f177089p = e4m.b.b(new z3(wVar, this, 12, i));
        this.f177090q = e4m.b.b(new z3(wVar, this, 13, i));
        this.f177091r = e4m.b.b(new z3(wVar, this, 9, i));
    }

    @Override // oqh.b
    public final nqh.c d() {
        return (nqh.c) this.f177091r.get();
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(4);
        aah.h hVar = (aah.h) this.f.get();
        a0k.b.n(hVar);
        builderBuilderWithExpectedSize.add(hVar);
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f177086l.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f177087m.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.d.f177071h).d();
        vc.s.j(iVarD);
        return ImmutableSet.of((yji.d) a0k.b.l(iVarD, (s1) this.e.get(), (aah.h) this.f.get()), (yji.d) this.f177084h.get(), (yji.d) this.f177085j.get());
    }
}
