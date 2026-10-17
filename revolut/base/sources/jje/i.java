package jje;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import ip0.v7;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import qje.m;
import rp0.l0;
import vc.s;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements oje.a {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;
    public final e4m.e G;
    public final e4m.e H;
    public final e4m.e I;
    public final e4m.e J;
    public final e4m.e K;
    public final e4m.e L;
    public final e4m.e M;
    public final e4m.e N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f174902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bi5.e f174903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pr5.c f174904c;
    public final qr5.b d;
    public final ut5.l e;
    public final rr5.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ash.j f174905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gfd.c f174906h;
    public final mkd.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f174907j;
    public final d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f174908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f174909m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f174910n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f174911p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f174912q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f174913r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f174914s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f174915t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f174916w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f174917x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f174918y;
    public final e4m.e z;

    public i(c cVar, d dVar, rr5.c cVar2, BaseScreen baseScreen, gfd.c cVar3, mkd.g gVar, bi5.e eVar, ash.j jVar, ut5.l lVar, pr5.c cVar4, qr5.b bVar) {
        this.f174907j = cVar;
        this.k = dVar;
        this.f174902a = baseScreen;
        this.f174903b = eVar;
        this.f174904c = cVar4;
        this.d = bVar;
        this.e = lVar;
        this.f = cVar2;
        this.f174905g = jVar;
        this.f174906h = cVar3;
        this.i = gVar;
        this.f174908l = v7.o(cVar, this, 2);
        this.f174909m = v7.o(cVar, this, 3);
        this.f174910n = v7.o(cVar, this, 1);
        this.o = v7.o(cVar, this, 0);
        this.f174911p = v7.o(cVar, this, 5);
        this.f174912q = v7.o(cVar, this, 4);
        this.f174913r = e4m.b.b(e4m.c.a(baseScreen));
        this.f174914s = v7.o(cVar, this, 8);
        this.f174915t = v7.o(cVar, this, 7);
        this.u = v7.o(cVar, this, 6);
        this.v = v7.o(cVar, this, 10);
        this.f174916w = v7.o(cVar, this, 9);
        this.f174917x = v7.o(cVar, this, 12);
        this.f174918y = v7.o(cVar, this, 11);
        this.z = v7.o(cVar, this, 15);
        this.A = v7.o(cVar, this, 14);
        this.B = v7.o(cVar, this, 13);
        this.C = v7.o(cVar, this, 16);
        this.D = v7.o(cVar, this, 17);
        this.E = v7.o(cVar, this, 18);
        this.F = v7.o(cVar, this, 19);
        this.G = v7.o(cVar, this, 20);
        this.H = v7.o(cVar, this, 21);
        this.I = v7.o(cVar, this, 22);
        this.J = v7.o(cVar, this, 23);
        this.K = v7.o(cVar, this, 26);
        this.L = v7.o(cVar, this, 27);
        int i = 12;
        this.M = e4m.b.b(new jdi.i(cVar, this, 25, i));
        this.N = e4m.b.b(new jdi.i(cVar, this, 24, i));
    }

    @Override // oje.a
    public final nje.e a() {
        return (nje.e) this.N.get();
    }

    @Override // oje.a
    public final j60.a b() {
        return (j60.a) this.f174915t.get();
    }

    @Override // oje.a
    public final l0 c() {
        return (l0) this.z.get();
    }

    @Override // sji.b
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(18);
        d dVar = this.k;
        Object extension = (m) dVar.f174853j.get();
        fke.a aVar = fke.b.Companion;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        n nVar = (n) extension;
        s.k(nVar);
        builderBuilderWithExpectedSize.add(nVar);
        j5c.a extension2 = dVar.f174849b.f174847y.a();
        s.j(extension2);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(extension2, "extension");
        builderBuilderWithExpectedSize.add(extension2);
        Object extension3 = (qje.n) dVar.k.get();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(extension3, "extension");
        n nVar2 = (n) extension3;
        s.k(nVar2);
        builderBuilderWithExpectedSize.add(nVar2);
        builderBuilderWithExpectedSize.add(dVar.f174859r.get());
        builderBuilderWithExpectedSize.add(dVar.i.get());
        builderBuilderWithExpectedSize.add(dVar.o.get());
        rr5.b modelExtensionHolder = (rr5.b) this.C.get();
        Intrinsics.checkNotNullParameter(modelExtensionHolder, "modelExtensionHolder");
        Set set = modelExtensionHolder.f256695b;
        s.k(set);
        builderBuilderWithExpectedSize.addAll((Iterable) set);
        builderBuilderWithExpectedSize.addAll((Iterable) this.D.get());
        builderBuilderWithExpectedSize.add(this.E.get());
        builderBuilderWithExpectedSize.add(this.F.get());
        builderBuilderWithExpectedSize.add(this.G.get());
        builderBuilderWithExpectedSize.add(this.f174909m.get());
        builderBuilderWithExpectedSize.add(this.f174911p.get());
        builderBuilderWithExpectedSize.add(this.H.get());
        builderBuilderWithExpectedSize.add(this.I.get());
        builderBuilderWithExpectedSize.add(this.J.get());
        builderBuilderWithExpectedSize.add(this.v.get());
        return j6.a.g(this.f174917x, builderBuilderWithExpectedSize);
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.o.get(), (yji.d) this.f174912q.get(), (yji.d) this.u.get(), (yji.d) this.f174916w.get(), (yji.d) this.f174918y.get(), (yji.d) this.B.get(), new yji.d[0]);
    }
}
