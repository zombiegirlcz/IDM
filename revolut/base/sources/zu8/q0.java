package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import cu8.e1;
import cu8.f1;
import cu8.g1;
import cu8.i1;
import cu8.j1;
import cu8.n1;
import cu8.o1;
import grl.k9;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f325342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f325343c;

    public /* synthetic */ q0(u0 u0Var, int i, int i2) {
        this.f325341a = i2;
        this.f325342b = u0Var;
        this.f325343c = i;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f325341a) {
            case 0:
                u0 u0Var = this.f325342b;
                ta9.m mVar = u0Var.f325391h;
                q8b.a aVar = u0Var.f325397q;
                int i = this.f325343c;
                if (i == 0) {
                    g1 g1Var = (g1) u0Var.A.get();
                    n8b.a aVarA = aVar.a();
                    vc.s.j(aVarA);
                    q89.e eVarA = mVar.a();
                    vc.s.j(eVarA);
                    return new gu8.f(g1Var, aVarA, eVarA);
                }
                if (i == 1) {
                    g1 g1Var2 = (g1) u0Var.A.get();
                    n8b.a aVarA2 = aVar.a();
                    vc.s.j(aVarA2);
                    return new gu8.c(g1Var2, aVarA2, (fu8.c) u0Var.F.get());
                }
                if (i != 2) {
                    throw new AssertionError(i);
                }
                g1 g1Var3 = (g1) u0Var.A.get();
                n8b.a aVarA3 = aVar.a();
                vc.s.j(aVarA3);
                i1 i1Var = (i1) u0Var.F.get();
                q89.e eVarA2 = mVar.a();
                vc.s.j(eVarA2);
                return new gu8.j(g1Var3, aVarA3, i1Var, eVarA2);
            default:
                u0 u0Var2 = this.f325342b;
                int i2 = this.f325343c;
                switch (i2) {
                    case 0:
                        hri.b bVar = u0Var2.f325387a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar2 = u0Var2.f325387a;
                        return new iri.j();
                    case 2:
                        return new n1();
                    case 3:
                        gte.a aVarB = u0Var2.f325390g.b();
                        vc.s.j(aVarB);
                        return new dv8.a(aVarB);
                    case 4:
                        d1.Companion.getClass();
                        return new vw8.a();
                    case 5:
                        return new cn.e();
                    case 6:
                        return new um.c();
                    case 7:
                        i1 i1Var2 = (i1) u0Var2.F.get();
                        com.revolut.feature.kyc.impl.errorhandling.d dVar = (com.revolut.feature.kyc.impl.errorhandling.d) u0Var2.G.get();
                        g3l.a aVar2 = (g3l.a) u0Var2.E.get();
                        v60.e eVarA3 = u0Var2.f325394m.a();
                        vc.s.j(eVarA3);
                        return new du8.i(i1Var2, dVar, aVar2, eVarA3);
                    case 8:
                        return new com.revolut.feature.kyc.impl.f((j1) u0Var2.u.get(), (g1) u0Var2.A.get(), (ifm.b) u0Var2.f325399s.get(), (wm.e) u0Var2.B.get(), (e1) u0Var2.C.get(), (f1) u0Var2.D.get(), u0Var2.f325392j.a(), (g3l.a) u0Var2.E.get(), ((s41.a) u0Var2.k).d());
                    case 9:
                        ang.f fVarE = u0Var2.e.e();
                        ot8.a aVar3 = (ot8.a) u0Var2.f325389c.f218990q.get();
                        vc.s.j(aVar3);
                        q89.e eVarA4 = u0Var2.f325391h.a();
                        vc.s.j(eVarA4);
                        j1 j1Var = (j1) u0Var2.u.get();
                        ifm.b bVar3 = (ifm.b) u0Var2.f325399s.get();
                        mm.d dVar2 = (mm.d) u0Var2.z.get();
                        gte.a aVarB2 = u0Var2.f325390g.b();
                        vc.s.j(aVarB2);
                        fk3.a aVarA4 = u0Var2.i.a();
                        vc.s.j(aVarA4);
                        return new com.revolut.feature.kyc.impl.b(fVarE, aVar3, eVarA4, j1Var, bVar3, dVar2, aVarB2, aVarA4);
                    case 10:
                        return new mm.d();
                    case 11:
                        return new wm.a();
                    case 12:
                        g1 presentationModel = (g1) u0Var2.A.get();
                        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
                        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                        k9 k9Var = ((com.revolut.feature.kyc.impl.b) presentationModel).p3() ? frl.a.k : frl.a.f137499j;
                        return new eu8.b(com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var));
                    case 13:
                        e1 e1Var = (e1) u0Var2.C.get();
                        q89.e eVarA5 = u0Var2.f325391h.a();
                        vc.s.j(eVarA5);
                        return new o1(e1Var, eVarA5);
                    case 14:
                        return new g3l.g();
                    case 15:
                        ee0.a aVar4 = u0Var2.f325393l;
                        return new com.revolut.feature.kyc.impl.errorhandling.d(fe0.c.a());
                    case 16:
                        u0Var2.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 17:
                        return new ln.c();
                    case 18:
                        return new ym.d();
                    case 19:
                        mt8.d dVarB = u0Var2.f325389c.b();
                        vc.s.j(dVarB);
                        j1 j1Var2 = (j1) u0Var2.u.get();
                        i1 i1Var3 = (i1) u0Var2.F.get();
                        x80.a aVarQ = u0Var2.f325388b.q();
                        vc.s.j(aVarQ);
                        return new du8.e(dVarB, j1Var2, i1Var3, aVarQ, (g1) u0Var2.A.get(), (f1) u0Var2.D.get(), (ln.a) u0Var2.K.get(), (mm.d) u0Var2.z.get(), u0Var2.f325395n.a(), u0Var2.a());
                    case 20:
                        mt8.d dVarB2 = u0Var2.f325389c.b();
                        vc.s.j(dVarB2);
                        j1 j1Var3 = (j1) u0Var2.u.get();
                        x80.a aVarQ2 = u0Var2.f325388b.q();
                        vc.s.j(aVarQ2);
                        g1 g1Var4 = (g1) u0Var2.A.get();
                        gte.a aVarB3 = u0Var2.f325390g.b();
                        vc.s.j(aVarB3);
                        return new du8.k(dVarB2, j1Var3, aVarQ2, g1Var4, aVarB3, u0Var2.a());
                    case 21:
                        mt8.d dVarB3 = u0Var2.f325389c.b();
                        vc.s.j(dVarB3);
                        return new du8.b(dVarB3, (g1) u0Var2.A.get(), u0Var2.a());
                    case 22:
                        return new d4l.a();
                    case 23:
                        return new sm.e();
                    case 24:
                        return new om.c();
                    case 25:
                        return new qv8.b((g1) u0Var2.A.get(), (i1) u0Var2.F.get());
                    default:
                        throw new AssertionError(i2);
                }
        }
    }
}
