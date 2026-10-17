package joh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth_discovery.impl.screener.screens.collection.ScreenerCollectionScreenContract$InputData;
import java.util.Set;
import jm4.z3;
import z0h.s1;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements uph.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uqh.r f177012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o5d.b f177013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenerCollectionScreenContract$InputData f177014c;
    public final w d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f177015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f177016h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f177017j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f177018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f177019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f177020n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f177021p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f177022q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f177023r;

    public k(w wVar, x xVar, ScreenerCollectionScreenContract$InputData screenerCollectionScreenContract$InputData, uqh.r rVar, o5d.b bVar) {
        this.d = wVar;
        this.f177012a = rVar;
        this.f177013b = bVar;
        this.f177014c = screenerCollectionScreenContract$InputData;
        this.e = e4m.b.b(new z3(wVar, this, 1, 19));
        this.f = e4m.b.b(new z3(wVar, this, 0, 19));
        this.f177015g = e4m.b.b(new z3(wVar, this, 2, 19));
        this.f177016h = e4m.b.b(new z3(wVar, this, 3, 19));
        this.i = e4m.b.b(new z3(wVar, this, 5, 19));
        this.f177017j = e4m.b.b(new z3(wVar, this, 4, 19));
        this.k = e4m.b.b(new z3(wVar, this, 6, 19));
        this.f177018l = e4m.b.b(new z3(wVar, this, 7, 19));
        this.f177019m = e4m.b.b(new z3(wVar, this, 8, 19));
        this.f177020n = e4m.b.b(new z3(wVar, this, 10, 19));
        this.o = e4m.b.b(new z3(wVar, this, 11, 19));
        this.f177021p = e4m.b.b(new z3(wVar, this, 12, 19));
        this.f177022q = e4m.b.b(new z3(wVar, this, 13, 19));
        this.f177023r = e4m.b.b(new z3(wVar, this, 9, 19));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(4);
        builderBuilderWithExpectedSize.add(this.k.get());
        aah.h hVar = (aah.h) this.f177016h.get();
        a0k.b.n(hVar);
        builderBuilderWithExpectedSize.add(hVar);
        builderBuilderWithExpectedSize.add(this.f177018l.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f177019m.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVar = (yji.d) this.f.get();
        aah.i iVarD = ((u8h.b) this.d.f177071h).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(dVar, (yji.d) a0k.b.l(iVarD, (s1) this.f177015g.get(), (aah.h) this.f177016h.get()), (yji.d) this.f177017j.get());
    }
}
