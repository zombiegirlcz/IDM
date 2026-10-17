package vab;

import a96.i;
import c4f.p;
import e4m.e;
import e79.j;
import et6.l0;
import kotlin.jvm.internal.Intrinsics;
import sf1.m;
import vc.s;
import xe0.f;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f287222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f287223b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f287222a = i;
        this.f287223b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f287222a) {
            case 0:
                b bVar = (b) this.f287223b;
                return new c06.a(bVar.f287224a, bVar.f287225b, 19);
            case 1:
                return new p(((vbf.a) this.f287223b).f287511a, 9);
            case 2:
                vbf.b bVar2 = (vbf.b) this.f287223b;
                return new m(bVar2.f287513a, bVar2.f287514b, bVar2.f287515c, bVar2.d, bVar2.e, bVar2.f, bVar2.f287516g, bVar2.f287517h, bVar2.i, bVar2.f287518j, bVar2.k, bVar2.f287519l, bVar2.f287520m, bVar2.f287521n, bVar2.o, bVar2.f287522p, bVar2.f287523q, bVar2.f287524r, bVar2.f287525s, 1);
            case 3:
                vi8.a aVar = (vi8.a) this.f287223b;
                return new i(aVar.f289523a, aVar.f289524b, aVar.f289525c, aVar.d, aVar.e, aVar.f, aVar.f289526g, 11);
            case 4:
                gte.a aVarB = ((vig.a) this.f287223b).f289596a.b();
                s.j(aVarB);
                return new uig.a(aVarB);
            case 5:
                return new awj.b(((vig.b) this.f287223b).f289598a, 20);
            case 6:
                vjf.b bVar3 = (vjf.b) this.f287223b;
                return new vbb.b(bVar3.f289723a, bVar3.f289724b, bVar3.f289725c, bVar3.d, bVar3.e, bVar3.f, bVar3.f289726g, bVar3.f289727h, bVar3.i, bVar3.f289728j, bVar3.k, bVar3.f289729l, bVar3.f289730m, bVar3.f289731n, bVar3.o, bVar3.f289732p, bVar3.f289733q, bVar3.f289734r, bVar3.f289735s, bVar3.f289736t, bVar3.u, bVar3.v, bVar3.f289737w, bVar3.f289738x, bVar3.f289739y, bVar3.z, bVar3.A, bVar3.B, bVar3.C, bVar3.D, 1);
            case 7:
                vk3.a aVar2 = (vk3.a) this.f287223b;
                return new db5.a(aVar2.f289858a, aVar2.f289859b, aVar2.f289860c, 13);
            case 8:
                vl2.b bVar4 = (vl2.b) this.f287223b;
                return new db5.a(bVar4.f290175a, bVar4.f290176b, bVar4.f290177c, 12);
            case 9:
                uo.s sVar = (uo.s) ((vn.a) this.f287223b).f290627a.H.get();
                s.j(sVar);
                return new yn.a(sVar);
            case 10:
                vwa.c cVar = (vwa.c) this.f287223b;
                return new j(cVar.f292680a, cVar.f292681b, cVar.f292682c, cVar.d, cVar.e, cVar.f, cVar.f292683g, cVar.f292684h);
            case 11:
                w13.b bVar5 = (w13.b) this.f287223b;
                return new x13.a(bVar5.f293779a, bVar5.f293780b, bVar5.f293781c, bVar5.d, bVar5.e, bVar5.f, bVar5.f293782g, bVar5.f293783h, bVar5.i, bVar5.f293784j, bVar5.k, bVar5.f293785l, bVar5.f293786m, bVar5.f293787n, bVar5.o, bVar5.f293788p, bVar5.f293789q, bVar5.f293790r, bVar5.f293791s, bVar5.f293792t, bVar5.u, bVar5.v, bVar5.f293793w, bVar5.f293794x, bVar5.f293795y, bVar5.z, bVar5.A, bVar5.B, bVar5.C, bVar5.D, bVar5.E, bVar5.F, bVar5.G, bVar5.H, bVar5.I, bVar5.J, bVar5.K, bVar5.L, bVar5.M, bVar5.N, bVar5.O, bVar5.P, bVar5.Q, bVar5.R, bVar5.S, bVar5.T);
            case 12:
                return new awj.b(((w2c.a) this.f287223b).f294023a, 21);
            case 13:
                w3e.a aVar3 = (w3e.a) this.f287223b;
                ee0.a aVar4 = aVar3.f294295a;
                je0.d mapper = aVar4.b();
                s.j(mapper);
                yk0.a databaseSessionProvider = aVar3.f294296b.b();
                s.j(databaseSessionProvider);
                f storageFactory = aVar4.f();
                s.j(storageFactory);
                y3e.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return f.f(storageFactory, databaseSessionProvider, "stories", mapper, 0, null, 56);
            case 14:
                return w40.c.A(((w9i.a) this.f287223b).f295734a);
            case 15:
                wak.a aVar5 = (wak.a) this.f287223b;
                h61.c cVar2 = (h61.c) aVar5.f295947a.f302823c.get();
                s.j(cVar2);
                l93.f fVarJ = aVar5.f295948b.j();
                s.j(fVarJ);
                tz1.b bVarA = aVar5.f295949c.a();
                s.j(bVarA);
                l80.e eVarH = aVar5.d.h();
                s.j(eVarH);
                gte.a aVarB2 = aVar5.e.b();
                s.j(aVarB2);
                sri.m mVarD = ((g8b.a) aVar5.f).d();
                s.j(mVarD);
                return new uak.f(cVar2, fVarJ, bVarA, eVarH, aVarB2, mVarD);
            case 16:
                wb1.b bVar6 = (wb1.b) this.f287223b;
                return new c06.a(bVar6.f295995a, bVar6.f295996b, 21);
            case 17:
                wb7.a aVar6 = (wb7.a) this.f287223b;
                return new h5c.b(aVar6.f296043a, aVar6.f296044b, aVar6.f296045c, aVar6.d, aVar6.e, aVar6.f, 11);
            case 18:
                wf3.a aVar7 = (wf3.a) this.f287223b;
                return new bq.a(aVar7.f296959a, aVar7.f296960b, aVar7.f296961c, aVar7.d);
            case 19:
                wi3.b bVar7 = (wi3.b) this.f287223b;
                return new e86.b(bVar7.f297795a, bVar7.f297796b, bVar7.f297797c, 4);
            case 20:
                wmg.b bVar8 = (wmg.b) this.f287223b;
                return new fw2.a(bVar8.f298657a, bVar8.f298658b, bVar8.f298659c, bVar8.d, bVar8.e, bVar8.f, bVar8.f298660g, bVar8.f298661h, bVar8.i, bVar8.f298662j, bVar8.k, bVar8.f298663l, bVar8.f298664m);
            case 21:
                wo6.b bVar9 = (wo6.b) this.f287223b;
                return new bwj.b(bVar9.f298894a, bVar9.f298895b, bVar9.f298896c, 14);
            case 22:
                wq6.b bVar10 = (wq6.b) this.f287223b;
                return new fh7.c(bVar10.f299416a, bVar10.f299417b, bVar10.f299418c, bVar10.d, 14);
            case 23:
                ws6.a aVar8 = (ws6.a) this.f287223b;
                xoj.a aVarA = aVar8.f299669a.a();
                s.j(aVarA);
                gte.a aVarB3 = aVar8.f299670b.b();
                s.j(aVarB3);
                return new l0(aVarA, aVarB3, aVar8.f299671c.a(), aVar8.d.a());
            case 24:
                wse.c cVar3 = (wse.c) this.f287223b;
                return new ayb.b(cVar3.f299706a, cVar3.f299707b, cVar3.f299708c, cVar3.d, 9);
            case 25:
                wv5.a aVar9 = (wv5.a) this.f287223b;
                return new i(aVar9.f300301a, aVar9.f300302b, aVar9.f300303c, aVar9.d, aVar9.e, aVar9.f, aVar9.f300304g, 10);
            case 26:
                wzl.b bVar11 = (wzl.b) this.f287223b;
                return new bwj.b(bVar11.f301431a, bVar11.f301432b, bVar11.f301433c, 15);
            case 27:
                x0g.b bVar12 = (x0g.b) this.f287223b;
                return new dwh.a(bVar12.f301631a, bVar12.f301632b, bVar12.f301633c, bVar12.d, bVar12.e, bVar12.f, bVar12.f301634g, bVar12.f301635h, bVar12.i, bVar12.f301636j, 4);
            case 28:
                x2d.a aVar10 = (x2d.a) this.f287223b;
                return new bwj.b(aVar10.f302539a, aVar10.f302540b, aVar10.f302541c, 16);
            default:
                x2d.c cVar4 = (x2d.c) this.f287223b;
                return new es8.b(cVar4.f302544a, cVar4.f302545b, cVar4.f302546c, cVar4.d, cVar4.e, cVar4.f, 6);
        }
    }
}
