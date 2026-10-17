package ow9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.aani.impl.data.network.AaniQrCodeService;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import kl.c0;
import p7c.r;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f230391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f230392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.c f230393c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f230394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f230395h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f230396j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f230397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f230398m;

    public j(e eVar, f fVar, BaseScreen baseScreen) {
        this.f230391a = eVar;
        this.f230392b = fVar;
        e4m.c cVarA = e4m.c.a(baseScreen);
        this.f230393c = cVarA;
        this.d = e4m.b.b(cVarA);
        this.e = e4m.b.b(new ned.h(eVar, fVar, this, 1, 15));
        int i = 15;
        this.f = e4m.b.b(new ned.h(eVar, fVar, this, 0, i));
        this.f230394g = e4m.b.b(new ned.h(eVar, fVar, this, 3, i));
        this.f230395h = e4m.b.b(new ned.h(eVar, fVar, this, 2, i));
        this.i = e4m.g.a(new ned.h(eVar, fVar, this, 6, i));
        this.f230396j = e4m.b.b(this.f230393c);
        this.k = e4m.b.b(new ned.h(eVar, fVar, this, 5, i));
        this.f230397l = e4m.b.b(new ned.h(eVar, fVar, this, 7, i));
        this.f230398m = e4m.b.b(new ned.h(eVar, fVar, this, 4, i));
    }

    public final i4b.f d() {
        f fVar = this.f230392b;
        xo9.i iVar = (xo9.i) fVar.f230372w.get();
        e3j.a aVar = new e3j.a();
        e eVar = fVar.f230359b;
        d3j.b bVarE = ((b3j.p) eVar.f230346j).e();
        x2j.c cVar = (x2j.c) fVar.f230373x.get();
        wt9.b bVar = (wt9.b) ((ut9.a) eVar.k).f283048t.get();
        s.j(bVar);
        vo1.c cVarA = ((up1.e) eVar.i).a();
        s.j(cVarA);
        e3j.f fVar2 = new e3j.f(aVar, bVarE, cVar, bVar, cVarA);
        e eVar2 = this.f230391a;
        pl1.i iVar2 = eVar2.f230347l;
        uw1.c cVarD = ((lz1.m) iVar2.f237250a).d();
        s.j(cVarD);
        tl1.c cVar2 = new tl1.c(cVarD, new ql1.d(new c0((AaniQrCodeService) iVar2.e.get())));
        m52.a aVar2 = (m52.a) eVar2.f230348m.k.get();
        s.j(aVar2);
        ang.f fVarE = eVar.f230343c.e();
        y2c.c cVar3 = (y2c.c) eVar.f230349n.f302538c.get();
        s.j(cVar3);
        rw9.g gVar = new rw9.g(fVarE, cVar3);
        if2.f fVar3 = eVar2.o;
        uw1.c cVarD2 = ((lz1.m) fVar3.f160852b).d();
        s.j(cVarD2);
        jg2.c cVar4 = new jg2.c(cVarD2, fVar3.c());
        ir1.b bVar2 = (ir1.b) eVar2.f230350p;
        fr1.b bVar3 = (fr1.b) bVar2.k.get();
        fx1.a aVarF = ((lz1.m) bVar2.f).f();
        s.j(aVarF);
        pre.c cVarA2 = bVar2.f167953g.a();
        s.j(cVarA2);
        kr1.e eVar3 = new kr1.e(new jr1.e(bVar3, aVarF, cVarA2), (er1.b) bVar2.f167954h.get());
        s52.a aVar3 = (s52.a) eVar2.f230351q.f.get();
        s.j(aVar3);
        gh2.a aVar4 = (gh2.a) eVar2.f230352r.f215304g.get();
        s.j(aVar4);
        r rVar = eVar2.f230353s;
        q06.d dVarA = rVar.f233670b.a();
        s.j(dVarA);
        xcc.b bVarF = rVar.f();
        j6c.b bVar4 = (j6c.b) rVar.f233677h0.get();
        gte.a aVarB = rVar.f233687r.b();
        s.j(aVarB);
        ImmutableSet immutableSetOf = ImmutableSet.of((jg2.c) iVar, (jg2.c) fVar2, (jg2.c) cVar2, (jg2.c) aVar2, (jg2.c) gVar, cVar4, (jg2.c[]) new xo9.i[]{eVar3, aVar3, aVar4, new d8c.c(dVarA, bVarF, bVar4, aVarB)});
        q06.l lVarA = eVar2.f230354t.a();
        s.j(lVarA);
        return new i4b.f(immutableSetOf, new rw9.a(lVarA));
    }

    public final ax9.i e() {
        e eVar = this.f230391a;
        vq1.e eVar2 = (vq1.e) eVar.f230345h.f.get();
        s.j(eVar2);
        v60.e eVarA = eVar.f.a();
        s.j(eVarA);
        return new ax9.i(eVar2, eVarA);
    }

    @Override // sji.b
    public final Set f() {
        f fVar = this.f230392b;
        yji.n nVar = (yji.n) fVar.v.get();
        i4b.f fVarD = d();
        ax9.i iVarE = e();
        xq2.d dVar = (xq2.d) fVar.f230374y.get();
        e eVar = this.f230391a;
        uc.d dVar2 = new uc.d(dVar, eVar.u.e(), new ar2.e(), new zq2.k(), new zq2.j());
        q06.l lVarA = eVar.f230354t.a();
        s.j(lVarA);
        return ImmutableSet.of((com.revolut.feature.payments.profile.impl.ui_kompot.scanner.b) nVar, new com.revolut.feature.payments.profile.impl.ui_kompot.scanner.b(fVarD, iVarE, dVar2, lVarA, (e60.a) fVar.o.get()));
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f230395h.get());
    }
}
