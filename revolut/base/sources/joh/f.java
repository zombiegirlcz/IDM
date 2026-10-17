package joh;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import jm4.z3;
import z0h.s1;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements fqh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uqh.r f176991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o5d.b f176992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eqh.g f176993c;
    public final w d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176995h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f176996j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f176997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f176998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f176999n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f177000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f177001q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f177002r;

    public f(w wVar, r rVar, eqh.g gVar, uqh.r rVar2, o5d.b bVar) {
        this.d = wVar;
        this.f176991a = rVar2;
        this.f176992b = bVar;
        this.f176993c = gVar;
        this.e = e4m.b.b(new z3(wVar, this, 1, 18));
        this.f = e4m.b.b(new z3(wVar, this, 0, 18));
        this.f176994g = e4m.b.b(new z3(wVar, this, 2, 18));
        this.f176995h = e4m.b.b(new z3(wVar, this, 3, 18));
        this.i = e4m.b.b(new z3(wVar, this, 5, 18));
        this.f176996j = e4m.b.b(new z3(wVar, this, 4, 18));
        this.k = e4m.b.b(new z3(wVar, this, 6, 18));
        this.f176997l = e4m.b.b(new z3(wVar, this, 7, 18));
        this.f176998m = e4m.b.b(new z3(wVar, this, 8, 18));
        this.f176999n = e4m.b.b(new z3(wVar, this, 10, 18));
        this.o = e4m.b.b(new z3(wVar, this, 11, 18));
        this.f177000p = e4m.b.b(new z3(wVar, this, 12, 18));
        this.f177001q = e4m.b.b(new z3(wVar, this, 13, 18));
        this.f177002r = e4m.b.b(new z3(wVar, this, 9, 18));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(4);
        builderBuilderWithExpectedSize.add(this.k.get());
        aah.h hVar = (aah.h) this.f176995h.get();
        a0k.b.n(hVar);
        builderBuilderWithExpectedSize.add(hVar);
        builderBuilderWithExpectedSize.add(this.f176997l.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f176998m.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVar = (yji.d) this.f.get();
        aah.i iVarD = ((u8h.b) this.d.f177071h).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(dVar, (yji.d) a0k.b.l(iVarD, (s1) this.f176994g.get(), (aah.h) this.f176995h.get()), (yji.d) this.f176996j.get());
    }
}
