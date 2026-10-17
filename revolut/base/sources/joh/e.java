package joh;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import jm4.z3;
import z0h.s1;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements kph.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uqh.r f176979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o5d.b f176980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jph.g f176981c;
    public final w d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176983h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f176984j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f176985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f176986m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f176987n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f176988p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f176989q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f176990r;

    public e(w wVar, jph.g gVar, uqh.r rVar, o5d.b bVar) {
        this.d = wVar;
        this.f176979a = rVar;
        this.f176980b = bVar;
        this.f176981c = gVar;
        this.e = e4m.b.b(new z3(wVar, this, 1, 17));
        this.f = e4m.b.b(new z3(wVar, this, 0, 17));
        this.f176982g = e4m.b.b(new z3(wVar, this, 2, 17));
        this.f176983h = e4m.b.b(new z3(wVar, this, 3, 17));
        this.i = e4m.b.b(new z3(wVar, this, 5, 17));
        this.f176984j = e4m.b.b(new z3(wVar, this, 4, 17));
        this.k = e4m.b.b(new z3(wVar, this, 6, 17));
        this.f176985l = e4m.b.b(new z3(wVar, this, 7, 17));
        this.f176986m = e4m.b.b(new z3(wVar, this, 8, 17));
        this.f176987n = e4m.b.b(new z3(wVar, this, 10, 17));
        this.o = e4m.b.b(new z3(wVar, this, 11, 17));
        this.f176988p = e4m.b.b(new z3(wVar, this, 12, 17));
        this.f176989q = e4m.b.b(new z3(wVar, this, 13, 17));
        this.f176990r = e4m.b.b(new z3(wVar, this, 9, 17));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(4);
        builderBuilderWithExpectedSize.add(this.k.get());
        aah.h hVar = (aah.h) this.f176983h.get();
        a0k.b.n(hVar);
        builderBuilderWithExpectedSize.add(hVar);
        builderBuilderWithExpectedSize.add(this.f176985l.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f176986m.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVar = (yji.d) this.f.get();
        aah.i iVarD = ((u8h.b) this.d.f177071h).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(dVar, (yji.d) a0k.b.l(iVarD, (s1) this.f176982g.get(), (aah.h) this.f176983h.get()), (yji.d) this.f176984j.get());
    }
}
