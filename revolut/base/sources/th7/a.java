package th7;

import aah.g;
import aah.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import fi7.l;
import java.util.Set;
import tg5.h;
import vc.s;
import z0h.s1;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements gi7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5d.b f271302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1 f271303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f271304c;
    public final b d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f271305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f271306h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f271307j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f271308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f271309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f271310n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f271311p;

    public a(b bVar, ViewController viewController, l lVar, s1 s1Var, o5d.b bVar2) {
        this.d = bVar;
        this.f271302a = bVar2;
        this.f271303b = s1Var;
        this.f271304c = lVar;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 2;
        this.f = e4m.b.b(new h(bVar, this, 2, i));
        this.f271305g = e4m.b.b(new h(bVar, this, 1, i));
        this.f271306h = e4m.b.b(new h(bVar, this, 0, i));
        this.i = e4m.b.b(new h(bVar, this, 4, i));
        this.f271307j = e4m.b.b(new h(bVar, this, 3, i));
        this.k = e4m.b.b(new h(bVar, this, 5, i));
        this.f271308l = e4m.b.b(new h(bVar, this, 6, i));
        this.f271309m = e4m.b.b(new h(bVar, this, 7, i));
        this.f271310n = e4m.b.b(new h(bVar, this, 9, i));
        this.o = e4m.b.b(new h(bVar, this, 10, i));
        this.f271311p = e4m.b.b(new h(bVar, this, 8, i));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(3);
        builderBuilderWithExpectedSize.add(this.f271308l.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f271309m.get());
        aah.h hVar = (aah.h) this.k.get();
        a0k.b.n(hVar);
        builderBuilderWithExpectedSize.add(hVar);
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVar = (yji.d) this.f271306h.get();
        yji.d dVar2 = (yji.d) this.f271307j.get();
        i iVarD = ((u8h.b) this.d.k).d();
        s.j(iVarD);
        return ImmutableSet.of((g) dVar, (g) dVar2, a0k.b.l(iVarD, this.f271303b, (aah.h) this.k.get()));
    }
}
