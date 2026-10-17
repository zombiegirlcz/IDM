package ljl;

import android.app.Activity;
import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.hcaptcha.sdk.HCaptchaConfig;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import java.util.Collection;
import lp.l9;

/* JADX INFO: loaded from: classes13.dex */
public final class t0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f196102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f196103c;
    public final Object d;

    public /* synthetic */ t0(Object obj2, Object obj3, int i, int i2) {
        this.f196101a = i2;
        this.f196103c = obj2;
        this.d = obj3;
        this.f196102b = i;
    }

    @Override // phm.a
    public final Object get() {
        Object cVar;
        switch (this.f196101a) {
            case 0:
                q0 q0Var = (q0) this.f196103c;
                u0 u0Var = (u0) this.d;
                int i = this.f196102b;
                switch (i) {
                    case 0:
                        return db5.e.s((col.c) u0Var.f.get());
                    case 1:
                        com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) u0Var.e.get();
                        wl0.c cVarA = q0Var.f.a();
                        ph0.d dVarA = t2d.c.a(q0Var.i.f271230a);
                        l80.e eVarH = q0Var.f196062g.h();
                        vc.s.j(eVarH);
                        return new col.i(aVar, cVarA, dVarA, eVarH);
                    case 2:
                        akl.d dVar = (akl.d) q0Var.f196060d0.get();
                        gu2.e eVar = (gu2.e) u0Var.k.get();
                        xjl.i iVar = (xjl.i) q0Var.Z.get();
                        col.c cVar2 = (col.c) u0Var.f.get();
                        akl.i0 i0VarF = q0Var.f();
                        uil.a aVarA = q0Var.f196057b.a();
                        vc.s.j(aVarA);
                        return new com.revolut.sso.impl.ui.signin_sessions_flow.a(dVar, eVar, iVar, cVar2, i0VarF, aVarA, (bjl.p0) q0Var.H.get());
                    case 3:
                        hu2.a aVar2 = (hu2.a) u0Var.f196111h.get();
                        com.hcaptcha.sdk.a aVarL = jr9.h.l((Activity) u0Var.i.get());
                        HCaptchaConfig hCaptchaConfigM = jr9.h.m((String) u0Var.f196112j.get());
                        aoi.c cVarA2 = aoi.f.a();
                        dm0.d dVarD = u0Var.f196109c.f196068m.d();
                        vc.s.j(dVarD);
                        return jr9.h.x(aVar2, new ku2.h(aVarL, hCaptchaConfigM, cVarA2, dVarD));
                    case 4:
                        return new hu2.d();
                    case 5:
                        return jr9.h.e((com.revolut.kompot.navigable.a) u0Var.e.get());
                    case 6:
                        return dqj.d.p(u0Var.f196107a, (bjl.p0) q0Var.H.get());
                    case 7:
                        gu2.e eVar2 = (gu2.e) u0Var.k.get();
                        jr9.h.h(eVar2);
                        return eVar2;
                    default:
                        throw new AssertionError(i);
                }
            case 1:
                rza.b bVar = (rza.b) this.f196103c;
                rza.a aVar3 = (rza.a) this.d;
                int i2 = this.f196102b;
                switch (i2) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(aVar3.f258528a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar3.f258528a);
                        t70.g gVarO = bVar.f258544b.o();
                        vc.s.j(gVarO);
                        cVar = new npi.c(contextI, baseDelegatesActivityF, gVarO);
                        break;
                    case 2:
                        return new tpi.i((rpi.c) aVar3.f.get(), gsi.c.a(aVar3.f258528a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar3.f258528a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar3.f258528a));
                    case 5:
                        cVar = new iri.g((iri.j) bVar.f258548j.get(), (iri.m) bVar.f258550m.get(), bq.i.f(aVar3.f258528a), bq.i.l(aVar3.f258528a));
                        break;
                    case 6:
                        cVar = new iri.l((iri.m) bVar.f258550m.get(), bq.i.f(aVar3.f258528a), (iri.d) aVar3.f258533j.get());
                        break;
                    case 7:
                        return new iri.d(bq.i.f(aVar3.f258528a));
                    case 8:
                        return new opi.b(bq.i.f(aVar3.f258528a));
                    case 9:
                        aVar3.getClass();
                        cVar = new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar.f258551n.get(), bVar.c());
                        break;
                    case 10:
                        um.c cVar3 = (um.c) bVar.f258549l.get();
                        aVar3.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                        rza.b bVar2 = aVar3.f258530c;
                        l70.e eVar3 = bVar2.f258544b;
                        hn.h hVar = (hn.h) bVar2.o.get();
                        t70.g gVarO2 = eVar3.o();
                        vc.s.j(gVarO2);
                        builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO2));
                        builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize.add(bVar2.d());
                        builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(aVar3.f258536n)));
                        hn.h hVar2 = (hn.h) bVar2.o.get();
                        t70.g gVarO3 = eVar3.o();
                        vc.s.j(gVarO3);
                        builderBuilderWithExpectedSize.add(new qza.k(hVar2, new mp.r(gVarO3), (qza.g) bVar2.f258550m.get()));
                        cVar = new in.e(cVar3, builderBuilderWithExpectedSize.build(), bVar.c());
                        break;
                    case 11:
                        return bq.i.t(aVar3.f258528a);
                    case 12:
                        aVar3.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(4);
                        builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize2.add(aVar3.f258537p.get());
                        builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(aVar3.f258531g)));
                        builderBuilderWithExpectedSize2.add(new qza.l((qza.g) aVar3.f258530c.f258550m.get()));
                        cVar = new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) bVar.f258553q.get(), bVar.c());
                        break;
                    case 13:
                        return new zm.a();
                    case 14:
                        aVar3.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                        rza.b bVar3 = aVar3.f258530c;
                        builderBuilderWithExpectedSize3.add(bVar3.d());
                        builderBuilderWithExpectedSize3.add(new qza.j((ln.a) bVar3.f258552p.get()));
                        cVar = new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) bVar.o.get(), (npi.f) aVar3.e.get());
                        break;
                    case 15:
                        return new en.c(ImmutableSet.of((ln.d) aVar3.f258530c.f258552p.get()), bq.i.l(aVar3.f258528a));
                    case 16:
                        cVar = new gn.c((lpi.e) aVar3.f258541t.get(), (sm.e) bVar.f258555s.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar.c());
                        break;
                    case 17:
                        return new lpi.b(bq.i.i(aVar3.f258528a), bq.i.j(aVar3.f258528a));
                    case 18:
                        aVar3.getClass();
                        cVar = new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar.f258556t.get(), bVar.c());
                        break;
                    case 19:
                        return new k3l.d(bq.i.b(aVar3.f258528a));
                    default:
                        throw new AssertionError(i2);
                }
                return cVar;
            default:
                rza.b bVar4 = (rza.b) this.f196103c;
                rza.d dVar2 = (rza.d) this.d;
                int i3 = this.f196102b;
                switch (i3) {
                    case 0:
                        ypi.h hVar3 = dVar2.f258563b;
                        fsi.g gVar = dVar2.f258562a;
                        return new ypi.e(hVar3, bq.i.b(gVar), bq.i.o(gVar), bq.i.g(gVar));
                    case 1:
                        return new hqi.f(dVar2.f258564c, bq.i.b(dVar2.f258562a));
                    case 2:
                        return new in.e(ImmutableSet.of((d4e.b) dVar2.d.k.get()), ImmutableSet.of(), bVar4.c());
                    case 3:
                        return new aqi.d(bq.i.b(dVar2.f258562a), new y80.b());
                    case 4:
                        Context contextI2 = bq.i.i(dVar2.f258562a);
                        BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(dVar2.f258562a);
                        t70.g gVarO4 = bVar4.f258544b.o();
                        vc.s.j(gVarO4);
                        return new npi.c(contextI2, baseDelegatesActivityF2, gVarO4);
                    case 5:
                        return new iri.g((iri.j) bVar4.f258548j.get(), (iri.m) bVar4.f258550m.get(), bq.i.f(dVar2.f258562a), bq.i.l(dVar2.f258562a));
                    case 6:
                        return new iri.l((iri.m) bVar4.f258550m.get(), bq.i.f(dVar2.f258562a), (iri.d) dVar2.k.get());
                    case 7:
                        return new iri.d(bq.i.f(dVar2.f258562a));
                    case 8:
                        return kpi.f.a();
                    case 9:
                        return new tpi.i((rpi.c) dVar2.f258570n.get(), gsi.c.a(dVar2.f258562a));
                    case 10:
                        return new rpi.b(bq.i.b(dVar2.f258562a));
                    case 11:
                        return new rpi.h(bq.i.b(dVar2.f258562a));
                    case 12:
                        return new opi.b(bq.i.f(dVar2.f258562a));
                    case 13:
                        dVar2.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar4.f258551n.get(), bVar4.c());
                    case 14:
                        um.c cVar4 = (um.c) bVar4.f258549l.get();
                        dVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(5);
                        rza.b bVar5 = dVar2.d;
                        hn.h hVar4 = (hn.h) bVar5.o.get();
                        t70.g gVarO5 = bVar5.f258544b.o();
                        vc.s.j(gVarO5);
                        builderBuilderWithExpectedSize4.add(new jn.a(hVar4, gVarO5));
                        builderBuilderWithExpectedSize4.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize4.add(bVar5.d());
                        builderBuilderWithExpectedSize4.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize4.add(new jn.d(e4m.b.a(dVar2.f258574s)));
                        return new in.e(cVar4, builderBuilderWithExpectedSize4.build(), bVar4.c());
                    case 15:
                        return bq.i.t(dVar2.f258562a);
                    case 16:
                        dVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize5 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize5.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize5.add(dVar2.u.get());
                        builderBuilderWithExpectedSize5.add(new kn.h(e4m.b.a(dVar2.o)));
                        return new kn.e(builderBuilderWithExpectedSize5.build(), (ym.d) bVar4.f258553q.get(), bVar4.c());
                    case 17:
                        return new zm.a();
                    case 18:
                        dVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize6 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize6.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize6.add(dVar2.d.d());
                        return new hn.d(builderBuilderWithExpectedSize6.build(), (hn.h) bVar4.o.get(), (npi.f) dVar2.i.get());
                    case 19:
                        return new en.c(ImmutableSet.of((ln.d) dVar2.d.f258552p.get()), bq.i.l(dVar2.f258562a));
                    case 20:
                        return new gn.c((lpi.e) dVar2.f258578y.get(), (sm.e) bVar4.f258555s.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar4.c());
                    case 21:
                        return new lpi.b(bq.i.i(dVar2.f258562a), bq.i.j(dVar2.f258562a));
                    case 22:
                        dVar2.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar4.f258556t.get(), bVar4.c());
                    case 23:
                        s3l.f fVar = (s3l.f) bVar4.u.get();
                        dVar2.getClass();
                        return new com.revolut.retail.retail_shot.mediator.a(fVar, ImmutableSet.copyOf((Collection) s3l.e.a()), (r3l.a) dVar2.C.get(), bVar4.c());
                    case 24:
                        return new r3l.c((rp0.g1) dVar2.B.get());
                    case 25:
                        return l9.k(bq.i.b(dVar2.f258562a));
                    case 26:
                        return new k3l.d(bq.i.b(dVar2.f258562a));
                    case 27:
                        v3e.d dVar3 = (v3e.d) bVar4.f258550m.get();
                        e4m.e eVar4 = dVar2.f258574s;
                        fsi.g gVar2 = dVar2.f258562a;
                        f9b.f fVar2 = (f9b.f) eVar4.get();
                        sri.m mVarL = bq.i.l(gVar2);
                        v3e.b bVar6 = (v3e.b) bVar4.f258557w.get();
                        v3e.k kVar = new v3e.k();
                        z3e.c cVarA3 = ((w3e.a) bVar4.f).a();
                        npi.f fVar3 = (npi.f) dVar2.i.get();
                        f80.a aVarX = bVar4.f258544b.x();
                        vc.s.j(aVarX);
                        return new v3e.d0(dVar3, fVar2, mVarL, bVar6, kVar, cVarA3, fVar3, aVarX, ImmutableSet.of((d4e.b) dVar2.d.k.get()), bq.i.e(gVar2), (s3l.f) bVar4.u.get());
                    default:
                        throw new AssertionError(i3);
                }
        }
    }
}
