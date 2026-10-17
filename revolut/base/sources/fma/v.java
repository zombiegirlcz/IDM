package fma;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.DocumentSelectorScreenContract$InputData;
import g48.r0;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements hna.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentSelectorScreenContract$InputData f136225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f136226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f136227c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f136228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f136229h;

    public v(c0 c0Var, w wVar, DocumentSelectorScreenContract$InputData documentSelectorScreenContract$InputData) {
        this.f136226b = c0Var;
        this.f136225a = documentSelectorScreenContract$InputData;
        this.f136227c = e4m.b.b(new fa0.q(c0Var, this, 2, 20));
        this.d = e4m.b.b(new fa0.q(c0Var, this, 1, 20));
        this.e = e4m.b.b(new fa0.q(c0Var, this, 0, 20));
        this.f = e4m.b.b(new fa0.q(c0Var, this, 3, 20));
        this.f136228g = e4m.b.b(new fa0.q(c0Var, this, 4, 20));
        this.f136229h = e4m.b.b(new fa0.q(c0Var, this, 5, 20));
    }

    public final jna.b b() {
        c0 c0Var = this.f136226b;
        y91.b bVarA = c0Var.f136071s.a();
        zxd.c cVarA = ((eyd.b) c0Var.f136060j).a();
        vc.s.j(cVarA);
        return new jna.b(bVarA, cVarA, ((nj0.d) c0Var.f136078x).f216295c, new vyd.a());
    }

    public final fna.h c() {
        c0 c0Var = this.f136226b;
        gte.a aVarB = c0Var.e.b();
        vc.s.j(aVarB);
        xmg.a aVar = c0Var.i;
        ang.f fVarE = aVar.e();
        l61.a aVarB2 = aVar.b();
        vc.s.j(aVarB2);
        vxd.b bVar = c0Var.f136060j;
        zxd.c cVarA = ((eyd.b) bVar).a();
        vc.s.j(cVarA);
        vxd.c cVar = (vxd.c) ((eyd.b) bVar).B.get();
        vc.s.j(cVar);
        r0 r0VarC = c0Var.k.c();
        n8b.a aVarA = c0Var.f136062l.a();
        vc.s.j(aVarA);
        rnb.w wVarB = c0Var.f136063m.b();
        vc.s.j(wVarB);
        elb.b bVarE = ((blb.e) c0Var.f136064n).e();
        tzg.m mVarT = c0Var.o.t();
        vc.s.j(mVarT);
        am2.a aVarI = c0Var.f136067p.f136165a.i();
        gr6.a aVarA2 = c0Var.f136068q.a();
        vc.s.j(aVarA2);
        hc5.a aVarA3 = ((gc5.c) c0Var.f136069r).a();
        vc.s.j(aVarA3);
        y91.b bVarA = c0Var.f136071s.a();
        pre.c cVarA2 = c0Var.f136073t.a();
        vc.s.j(cVarA2);
        xqe.b bVarA2 = c0Var.u.a();
        vc.s.j(bVarA2);
        iw7.a aVar2 = (iw7.a) c0Var.v.f249799m.get();
        vc.s.j(aVar2);
        return new fna.h(aVarB, fVarE, aVarB2, cVarA, cVar, r0VarC, aVarA, wVarB, bVarE, mVarT, aVarI, aVarA2, aVarA3, bVarA, cVarA2, bVarA2, aVar2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get(), (yji.n) this.f136228g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
