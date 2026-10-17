package xsl;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import xf6.t1;
import z0h.s1;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f308678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1h.j f308679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final odf.f f308680c;
    public final p d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f308681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f308682h;
    public final e4m.e i;

    public n(p pVar, odf.f fVar, s1 s1Var, d1h.j jVar) {
        this.d = pVar;
        this.f308678a = s1Var;
        this.f308679b = jVar;
        this.f308680c = fVar;
        int i = 28;
        this.e = e4m.b.b(new t1(pVar, this, 0, i));
        this.f = e4m.b.b(new t1(pVar, this, 1, i));
        this.f308681g = e4m.b.b(new t1(pVar, this, 3, i));
        this.f308682h = e4m.b.b(new t1(pVar, this, 4, i));
        this.i = e4m.b.b(new t1(pVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.e.get();
        a0k.b.n(hVar);
        return ImmutableSet.of((yji.n) hVar, dw3.l.m((d1h.e) this.f.get()));
    }

    @Override // xki.e
    public final Set g() {
        u8h.c cVar = this.d.f308703r;
        aah.i iVarD = ((u8h.b) cVar).d();
        vc.s.j(iVarD);
        aah.g gVarL = a0k.b.l(iVarD, this.f308678a, (aah.h) this.e.get());
        gah.f fVarA = ((u8h.b) cVar).a();
        vc.s.j(fVarA);
        return ImmutableSet.of(gVarL, dw3.l.l(fVarA, this.f308679b, (d1h.e) this.f.get()));
    }
}
