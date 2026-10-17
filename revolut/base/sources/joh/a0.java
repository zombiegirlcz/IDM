package joh;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import jm4.z3;
import z0h.s1;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 implements oqh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uqh.r f176958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o5d.b f176959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nqh.e f176960c;
    public final w d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176962h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f176963j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f176964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f176965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f176966n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f176967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f176968q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f176969r;

    public a0(w wVar, nqh.e eVar, uqh.r rVar, o5d.b bVar) {
        this.d = wVar;
        this.f176958a = rVar;
        this.f176959b = bVar;
        this.f176960c = eVar;
        int i = 24;
        this.e = e4m.b.b(new z3(wVar, this, 0, i));
        this.f = e4m.b.b(new z3(wVar, this, 1, i));
        this.f176961g = e4m.b.b(new z3(wVar, this, 3, i));
        this.f176962h = e4m.b.b(new z3(wVar, this, 2, i));
        this.i = e4m.b.b(new z3(wVar, this, 5, i));
        this.f176963j = e4m.b.b(new z3(wVar, this, 4, i));
        this.k = e4m.b.b(new z3(wVar, this, 6, i));
        this.f176964l = e4m.b.b(new z3(wVar, this, 7, i));
        this.f176965m = e4m.b.b(new z3(wVar, this, 8, i));
        this.f176966n = e4m.b.b(new z3(wVar, this, 10, i));
        this.o = e4m.b.b(new z3(wVar, this, 11, i));
        this.f176967p = e4m.b.b(new z3(wVar, this, 12, i));
        this.f176968q = e4m.b.b(new z3(wVar, this, 13, i));
        this.f176969r = e4m.b.b(new z3(wVar, this, 9, i));
    }

    @Override // oqh.b
    public final nqh.c d() {
        return (nqh.c) this.f176969r.get();
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(4);
        aah.h hVar = (aah.h) this.f.get();
        a0k.b.n(hVar);
        builderBuilderWithExpectedSize.add(hVar);
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f176964l.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f176965m.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.d.f177071h).d();
        vc.s.j(iVarD);
        return ImmutableSet.of((yji.d) a0k.b.l(iVarD, (s1) this.e.get(), (aah.h) this.f.get()), (yji.d) this.f176962h.get(), (yji.d) this.f176963j.get());
    }
}
