package h08;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsContract$RenewalOptInUpdateSterilizedAction;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.action.PetRenewalActionContract$RenewalOptInAction;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.PetPlanBuilderFlowContract$PlanBuilderAction;
import java.util.Set;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements gsi.h {
    public final e4m.e A;
    public final e4m.e B;
    public final e C;
    public final e D;
    public final e4m.e E;
    public final e4m.e F;
    public final e4m.e G;
    public final e4m.e H;
    public final e4m.e I;
    public final e4m.e J;
    public final e4m.e K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoi.d f148262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f148263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f148264c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f148265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f148266h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f148267j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f148268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f148269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f148270n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f148271p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f148272q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f148273r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f148274s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f148275t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f148276w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f148277x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f148278y;
    public final e4m.e z;

    public g(h hVar, xoi.d dVar) {
        wpi.c cVar = wpi.d.Companion;
        ypi.g gVar = ypi.h.Companion;
        this.f148263b = hVar;
        this.f148262a = dVar;
        this.f148264c = e4m.b.b(new e(hVar, this, 0, 1));
        this.d = e4m.b.b(new e(hVar, this, 1, 1));
        this.e = e4m.b.b(new e(hVar, this, 3, 1));
        this.f = e4m.b.b(new e(hVar, this, 2, 1));
        this.f148265g = e4m.b.b(new e(hVar, this, 4, 1));
        this.f148266h = e4m.b.b(new e(hVar, this, 5, 1));
        this.i = e4m.b.b(new e(hVar, this, 7, 1));
        this.f148267j = e4m.b.b(new e(hVar, this, 6, 1));
        this.k = e4m.b.b(new e(hVar, this, 8, 1));
        this.f148268l = e4m.b.b(new e(hVar, this, 9, 1));
        this.f148269m = e4m.b.b(new e(hVar, this, 10, 1));
        this.f148270n = e4m.b.b(new e(hVar, this, 11, 1));
        this.o = e4m.b.b(new e(hVar, this, 12, 1));
        this.f148271p = e4m.b.b(new e(hVar, this, 14, 1));
        this.f148272q = e4m.b.b(new e(hVar, this, 13, 1));
        this.f148273r = e4m.b.b(new e(hVar, this, 16, 1));
        this.f148274s = e4m.b.b(new e(hVar, this, 15, 1));
        this.f148275t = e4m.b.b(new e(hVar, this, 17, 1));
        this.u = e4m.b.b(new e(hVar, this, 19, 1));
        this.v = e4m.b.b(new e(hVar, this, 18, 1));
        this.f148276w = e4m.b.b(new e(hVar, this, 20, 1));
        this.f148277x = e4m.b.b(new e(hVar, this, 22, 1));
        this.f148278y = e4m.b.b(new e(hVar, this, 21, 1));
        this.z = e4m.b.b(new e(hVar, this, 23, 1));
        this.A = e4m.b.b(new e(hVar, this, 25, 1));
        this.B = e4m.b.b(new e(hVar, this, 26, 1));
        this.C = new e(hVar, this, 27, 1);
        this.D = new e(hVar, this, 28, 1);
        this.E = e4m.b.b(new e(hVar, this, 24, 1));
        this.F = e4m.b.b(new e(hVar, this, 29, 1));
        this.G = e4m.b.b(new e(hVar, this, 31, 1));
        this.H = e4m.b.b(new e(hVar, this, 30, 1));
        this.I = e4m.b.b(new e(hVar, this, 34, 1));
        this.J = e4m.b.b(new e(hVar, this, 33, 1));
        this.K = e4m.b.b(new e(hVar, this, 32, 1));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return bq.i.j(this.f148262a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f148262a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f148262a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f148262a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f148262a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f148262a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f148262a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f148262a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f148262a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f148262a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f148262a);
    }

    public final nli.a e() {
        return new nli.a((t80.c) this.f148263b.J.get(), bq.i.b(this.f148262a));
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f148262a);
    }

    public final nli.e f() {
        h hVar = this.f148263b;
        l70.e eVar = hVar.f148280b;
        zk0.b bVarL = eVar.l();
        s.j(bVarL);
        t80.c cVar = (t80.c) hVar.J.get();
        f80.a aVarX = eVar.x();
        s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(25);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f148262a));
        builderBuilderWithExpectedSize.add(this.f148264c.get());
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f148265g.get());
        builderBuilderWithExpectedSize.add(this.f148266h.get());
        builderBuilderWithExpectedSize.add(this.f148267j.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f148268l.get());
        builderBuilderWithExpectedSize.add(this.f148269m.get());
        builderBuilderWithExpectedSize.add(this.f148270n.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        builderBuilderWithExpectedSize.add(this.f148272q.get());
        builderBuilderWithExpectedSize.add(this.f148274s.get());
        h hVar = this.f148263b;
        mm.d dVar = (mm.d) hVar.u.get();
        ImmutableMap.Builder builderBuilderWithExpectedSize2 = ImmutableMap.builderWithExpectedSize(8);
        builderBuilderWithExpectedSize2.put(PetRenewalActionContract$RenewalOptInAction.class, hVar.v.get());
        builderBuilderWithExpectedSize2.put(RenewalDetailsContract$RenewalOptInUpdateSterilizedAction.class, hVar.f148293w.get());
        builderBuilderWithExpectedSize2.put(mm.e.class, new mm.f());
        builderBuilderWithExpectedSize2.put(zx7.g.class, hVar.f148295y.get());
        builderBuilderWithExpectedSize2.put(zx7.h.class, hVar.C.get());
        builderBuilderWithExpectedSize2.put(PetPlanBuilderFlowContract$PlanBuilderAction.class, hVar.f148292t.get());
        builderBuilderWithExpectedSize2.put(f08.b.class, hVar.D.get());
        builderBuilderWithExpectedSize2.put(r08.a.class, hVar.E.get());
        builderBuilderWithExpectedSize.add(new en.c(dVar, builderBuilderWithExpectedSize2.build()));
        builderBuilderWithExpectedSize.add(this.f148275t.get());
        builderBuilderWithExpectedSize.add(this.v.get());
        builderBuilderWithExpectedSize.add(this.f148276w.get());
        builderBuilderWithExpectedSize.add(this.f148278y.get());
        builderBuilderWithExpectedSize.add(this.f148277x.get());
        builderBuilderWithExpectedSize.add(this.z.get());
        builderBuilderWithExpectedSize.add(this.E.get());
        builderBuilderWithExpectedSize.add(this.F.get());
        builderBuilderWithExpectedSize.add(this.H.get());
        return j6.a.g(this.G, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f148262a);
    }
}
