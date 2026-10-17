package edb;

import a2d.n;
import a5h.g;
import a96.i;
import android.content.Context;
import c4f.p;
import e4m.e;
import ecm.q;
import epa.d;
import ey1.f;
import eyd.j0;
import eyd.m0;
import ezj.m;
import ffk.t;
import fma.k;
import hd.r;
import hzj.j;
import java.util.Set;
import retrofit2.Retrofit;
import vc.s;
import yj2.l;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f124964b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f124963a = i;
        this.f124964b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f124963a) {
            case 0:
                b bVar = (b) this.f124964b;
                return new bwj.b(bVar.f124965a, bVar.f124966b, bVar.f124967c, 5);
            case 1:
                edj.c cVar = (edj.c) this.f124964b;
                return new i(cVar.f125027a, cVar.f125028b, cVar.f125029c, cVar.d, cVar.e, cVar.f, cVar.f125030g, 3);
            case 2:
                ef3.a aVar = (ef3.a) this.f124964b;
                return new c06.a(aVar.f125266a, aVar.f125267b, 2);
            case 3:
                egd.a aVar2 = (egd.a) this.f124964b;
                return f9f.b.a(aVar2.f125628a, aVar2.f125629b, aVar2.f125630c, aVar2.d, aVar2.e);
            case 4:
                ehd.a aVar3 = (ehd.a) this.f124964b;
                return new fh7.c(aVar3.f125929a, aVar3.f125930b, aVar3.f125931c, aVar3.d, 1);
            case 5:
                el0.a aVar4 = (el0.a) this.f124964b;
                Context context = aVar4.f127227a;
                fl0.c cVar2 = (fl0.c) aVar4.f127228b.e.get();
                s.j(cVar2);
                return new dl0.a(context, cVar2);
            case 6:
                el0.b bVar2 = (el0.b) this.f124964b;
                return new c63.a(bVar2.f127230a, bVar2.f127231b, 1);
            case 7:
                o80.b bVarA = d.a();
                epa.a aVar5 = (epa.a) this.f124964b;
                epa.b bVar3 = epa.c.Companion;
                Context context2 = aVar5.f128127a;
                bVar3.getClass();
                return new cpa.a(bVarA, epa.b.a(context2));
            case 8:
                esg.c cVar3 = (esg.c) this.f124964b;
                return fp8.c.d(cVar3.f128938b, cVar3.f128939c, cVar3.d, cVar3.e, cVar3.f, cVar3.f128940g, cVar3.f128941h, cVar3.i, cVar3.f128942j, cVar3.k, cVar3.f128943l, cVar3.f128944m, cVar3.f128945n, cVar3.o, cVar3.f128946p, cVar3.f128937a);
            case 9:
                f fVar = (f) this.f124964b;
                return new dwh.a(fVar.f130534a, fVar.f130535b, fVar.f130536c, fVar.d, fVar.e, fVar.f, fVar.f130537g, fVar.f130538h, fVar.i, fVar.f130539j, 1);
            case 10:
                ey2.b bVar4 = (ey2.b) this.f124964b;
                a31.a aVar6 = bVar4.f130546a;
                a31.a aVar7 = bVar4.f130547b;
                a31.a aVar8 = bVar4.f130548c;
                a31.a aVar9 = bVar4.d;
                a31.a aVar10 = bVar4.e;
                a31.a aVar11 = bVar4.f;
                a31.a aVar12 = bVar4.f130549g;
                a31.a aVar13 = bVar4.f130550h;
                a31.a aVar14 = bVar4.i;
                a31.a aVar15 = bVar4.f130551j;
                a31.a aVar16 = bVar4.k;
                a31.a aVar17 = bVar4.f130552l;
                a31.a aVar18 = bVar4.f130553m;
                q qVar = bVar4.f130554n;
                return gsi.d.d(aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, bVar4.o, bVar4.f130555p, bVar4.f130556q, bVar4.f130557r, bVar4.f130558s, bVar4.u, bVar4.v, bVar4.f130560w, bVar4.f130561x, qVar, bVar4.f130559t);
            case 11:
                eyd.c cVar4 = (eyd.c) this.f124964b;
                return new m0(cVar4.f130712a, cVar4.f130713b, cVar4.f130714c, cVar4.d, cVar4.e, cVar4.f, cVar4.f130715g, cVar4.f130716h, cVar4.i, cVar4.f130717j, cVar4.k, cVar4.f130718l, cVar4.f130719m, cVar4.f130720n, cVar4.o, cVar4.f130721p, 0);
            case 12:
                j0 j0Var = (j0) this.f124964b;
                return new n(j0Var.f130765a, j0Var.f130766b, j0Var.f130767c, j0Var.d, j0Var.e, j0Var.f, j0Var.f130768g, j0Var.f130769h, j0Var.i, j0Var.f130770j, j0Var.k, j0Var.f130771l, j0Var.f130772m, j0Var.f130773n, j0Var.o, 1);
            case 13:
                ezj.a aVar19 = (ezj.a) this.f124964b;
                hzj.e eVarA = aVar19.a();
                ite.a aVar20 = aVar19.f130947b;
                gte.a aVarB = aVar20.b();
                s.j(aVarB);
                j jVar = new j(eVarA, aVarB);
                efk.a aVar21 = aVar19.f130948c;
                t tVarF = aVar21.f();
                s.j(tVarF);
                wsg.n nVarB = aVar19.d.b();
                l lVarA = aVar19.e.a();
                nt8.a aVar22 = aVar19.f;
                mt8.d dVarB = aVar22.b();
                s.j(dVarB);
                Set setA = m.a();
                zyj.a aVarA = ezj.n.a();
                xmg.a aVar23 = aVar19.f130949g;
                l61.a aVarB2 = aVar23.b();
                s.j(aVarB2);
                r rVar = new r(tVarF, nVarB, lVarA, dVarB, setA, aVarA, aVarB2);
                t tVarF2 = aVar21.f();
                s.j(tVarF2);
                ffk.j jVarG = aVar21.g();
                s.j(jVarG);
                mt8.d dVarB2 = aVar22.b();
                s.j(dVarB2);
                hzj.m mVar = new hzj.m(aVar19.a(), ezj.n.a());
                l61.a aVarB3 = aVar23.b();
                s.j(aVarB3);
                g gVar = new g(tVarF2, jVarG, dVarB2, mVar, aVarB3);
                zj2.a aVar24 = new zj2.a();
                gte.a aVarB4 = aVar20.b();
                s.j(aVarB4);
                return new gzj.f(jVar, rVar, gVar, new mzj.g(aVar24, aVarB4));
            case 14:
                return new p(((ezj.f) this.f124964b).f130963a, 4);
            case 15:
                f2j.b bVar5 = (f2j.b) this.f124964b;
                return new g2j.a(bVar5.f131822a, bVar5.f131823b, bVar5.f131824c, bVar5.d, bVar5.e, bVar5.f, bVar5.f131825g, bVar5.f131826h, bVar5.i, bVar5.f131827j, bVar5.k, bVar5.f131828l, bVar5.f131829m, bVar5.f131830n, bVar5.o, bVar5.f131831p, bVar5.f131832q, bVar5.f131833r, bVar5.f131834s, bVar5.f131835t, bVar5.u, bVar5.v, bVar5.f131836w, bVar5.f131837x, bVar5.f131838y, bVar5.z, bVar5.A, bVar5.B, bVar5.C, bVar5.D, bVar5.E, bVar5.F, bVar5.G, bVar5.H, bVar5.I, bVar5.J);
            case 16:
                f5c.a aVar25 = (f5c.a) this.f124964b;
                return new h5c.b(aVar25.f132298a, aVar25.f132299b, aVar25.f132300c, aVar25.d, aVar25.e, aVar25.f);
            case 17:
                f98.b bVar6 = (f98.b) this.f124964b;
                return new es8.b(bVar6.f132857a, bVar6.f132858b, bVar6.f132859c, bVar6.d, bVar6.e, bVar6.f, 8);
            case 18:
                Retrofit retrofitF = ((nj0.d) ((ff3.a) this.f124964b).f134702a).f();
                f9f.b.r(retrofitF);
                return retrofitF;
            case 19:
                fh7.b bVar7 = (fh7.b) this.f124964b;
                return new fh7.c(bVar7.f135182a, bVar7.f135183b, bVar7.f135184c, bVar7.d, 0);
            case 20:
                k kVar = (k) this.f124964b;
                return new fh7.c(kVar.f136198a, kVar.f136199b, kVar.f136200c, kVar.d, 2);
            case 21:
                fqk.b bVar8 = (fqk.b) this.f124964b;
                return new e48.t(bVar8.f137292a, bVar8.f137293b, bVar8.f137294c, bVar8.d, bVar8.e, bVar8.f, bVar8.f137295g, bVar8.f137296h, bVar8.i, bVar8.f137297j, bVar8.k, bVar8.f137298l, bVar8.f137299m, bVar8.f137300n, bVar8.o, bVar8.f137301p, bVar8.f137302q, bVar8.f137303r, bVar8.f137304s, bVar8.f137305t, bVar8.u, bVar8.v, bVar8.f137306w, bVar8.f137307x, bVar8.f137308y, bVar8.z, 1);
            case 22:
                ftg.a aVar26 = (ftg.a) this.f124964b;
                return new fh7.c(aVar26.f138016a, aVar26.f138017b, aVar26.f138018c, aVar26.d, 3);
            case 23:
                fvh.a aVar27 = (fvh.a) this.f124964b;
                return new fh7.c(aVar27.f138423a, aVar27.f138424b, aVar27.f138425c, aVar27.d, 4);
            case 24:
                return new l24.c(((fw3.a) this.f124964b).f138569a.e());
            case 25:
                fwg.b bVar9 = (fwg.b) this.f124964b;
                return new djf.f(bVar9.f138639a, bVar9.f138640b, bVar9.f138641c, bVar9.d, bVar9.e, bVar9.f, bVar9.f138642g, bVar9.f138643h, bVar9.i, bVar9.f138644j, bVar9.k, bVar9.f138645l, bVar9.f138646m, bVar9.f138647n, bVar9.o, bVar9.f138648p, bVar9.f138649q, bVar9.f138650r, bVar9.f138651s, bVar9.f138652t, bVar9.u, bVar9.v, bVar9.f138653w, bVar9.f138654x, bVar9.f138655y, 1);
            case 26:
                fxj.d dVar = (fxj.d) this.f124964b;
                return gsi.d.c(dVar.f138834a, dVar.f138835b, dVar.f138836c);
            case 27:
                return fp8.c.a(((fy2.d) this.f124964b).e);
            case 28:
                fy9.a aVar28 = (fy9.a) this.f124964b;
                return new fy9.c(aVar28.f138965a, aVar28.f138966b, aVar28.f138967c, aVar28.d, aVar28.e, 0);
            default:
                fz5.a aVar29 = (fz5.a) this.f124964b;
                return new c06.a(aVar29.f139106a, aVar29.f139107b, 3);
        }
    }
}
