package joh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.ScreenerEmbeddedFiltersControllerContract$InputData;
import java.util.Set;
import z0h.s1;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f177027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yph.g f177028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenerEmbeddedFiltersControllerContract$InputData f177029c;
    public final w d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f177030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f177031h;

    public m(w wVar, j jVar, ScreenerEmbeddedFiltersControllerContract$InputData screenerEmbeddedFiltersControllerContract$InputData, s1 s1Var, yph.g gVar) {
        this.d = wVar;
        this.f177027a = s1Var;
        this.f177028b = gVar;
        this.f177029c = screenerEmbeddedFiltersControllerContract$InputData;
        int i = 8;
        this.e = e4m.b.b(new il8.d(wVar, jVar, this, 0, i));
        this.f = e4m.b.b(new il8.d(wVar, jVar, this, 3, i));
        this.f177030g = e4m.b.b(new il8.d(wVar, jVar, this, 2, i));
        this.f177031h = e4m.b.b(new il8.d(wVar, jVar, this, 1, i));
    }

    public final kbb.c b() {
        w wVar = this.d;
        ugl.c cVarD = wVar.f.d();
        vc.s.j(cVarD);
        gte.a aVarB = wVar.e.b();
        vc.s.j(aVarB);
        return new kbb.c(cVarD, aVarB, new sph.o(), wVar.d());
    }

    public final jt0.b c() {
        w wVar = this.d;
        ugl.c cVarD = wVar.f.d();
        vc.s.j(cVarD);
        gte.a aVarB = wVar.e.b();
        vc.s.j(aVarB);
        return new jt0.b(cVarD, aVarB, new sph.o(), new toh.o(), wVar.d());
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.e.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.d.f177071h).d();
        vc.s.j(iVarD);
        return ImmutableSet.of((yji.d) a0k.b.l(iVarD, this.f177027a, (aah.h) this.e.get()), (yji.d) this.f177031h.get());
    }
}
