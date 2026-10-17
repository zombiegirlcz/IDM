package x49;

import a2d.j;
import b3j.h;
import com.google.common.collect.ImmutableSet;
import com.revolut.data.network.services.ThreeDSService;
import e4m.e;
import jdi.v;
import kotlin.jvm.internal.Intrinsics;
import q38.d;
import qr0.i;
import retrofit2.Retrofit;
import sf1.m;
import vc.s;
import wsg.n;
import z0g.f1;
import zsb.f;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f302820b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f302819a = i;
        this.f302820b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        int i = this.f302819a;
        int i2 = 2;
        int i3 = 0;
        Object obj2 = this.f302820b;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                d31.c cVar = new d31.c((ThreeDSService) ((c21.b) bVar.f302821a).f20575o0.get(), new i(new bm0.a()));
                zm0.c cVarJ = bVar.f302822b.j();
                s.j(cVarJ);
                return new h61.c(cVar, cVarJ);
            case 1:
                c cVar2 = (c) obj2;
                return new c06.a(cVar2.f302824a, cVar2.f302825b, 20);
            case 2:
                x5k.a aVar = (x5k.a) obj2;
                return new fh7.c(aVar.f302997a, aVar.f302998b, aVar.f302999c, aVar.d, 15);
            case 3:
                xf8.a aVar2 = (xf8.a) obj2;
                return new v(aVar2.f305194a, aVar2.f305195b, aVar2.f305196c, aVar2.d, aVar2.e, aVar2.f, aVar2.f305197g, aVar2.f305198h, 5);
            case 4:
                xfc.a aVar3 = (xfc.a) obj2;
                return new fh7.c(aVar3.f305230a, aVar3.f305231b, aVar3.f305232c, aVar3.d, 16);
            case 5:
                xh1.b bVar2 = (xh1.b) obj2;
                return new fh7.c(bVar2.f305795a, bVar2.f305796b, bVar2.f305797c, bVar2.d, 17);
            case 6:
                xh3.b bVar3 = (xh3.b) obj2;
                return new m(bVar3.f305813a, bVar3.f305814b, bVar3.f305815c, bVar3.d, bVar3.e, bVar3.f, bVar3.f305816g, bVar3.f305817h, bVar3.i, bVar3.f305818j, bVar3.k, bVar3.f305819l, bVar3.f305821n, bVar3.o, bVar3.f305822p, bVar3.f305823q, bVar3.f305824r, bVar3.f305825s, bVar3.f305820m);
            case 7:
                xha.a aVar4 = (xha.a) obj2;
                return new kde.c(aVar4.f305836a, aVar4.f305837b, aVar4.f305838c, aVar4.d, aVar4.e, aVar4.f, aVar4.f305839g, aVar4.f305840h, aVar4.i, aVar4.f305841j, aVar4.k, aVar4.f305842l, aVar4.f305843m, aVar4.f305844n, aVar4.o, aVar4.f305845p, aVar4.f305846q, aVar4.f305847r, 1);
            case 8:
                xj3.a aVar5 = (xj3.a) obj2;
                return new nl5.a(aVar5.f306493a, aVar5.f306494b, aVar5.f306495c, aVar5.d, aVar5.e, aVar5.f, aVar5.f306496g, aVar5.f306497h, aVar5.i, aVar5.f306498j, 2);
            case 9:
                xj4.a aVar6 = (xj4.a) obj2;
                return new db5.a(aVar6.f306499a, aVar6.f306500b, aVar6.f306501c, 14);
            case 10:
                xk9.a aVar7 = (xk9.a) obj2;
                return new db5.a(aVar7.f306622a, aVar7.f306623b, aVar7.f306624c, 15);
            case 11:
                return new awj.b(((xog.a) obj2).f307829a, 22);
            case 12:
                xp.b bVar4 = (xp.b) obj2;
                return new c63.a(bVar4.f307869a, bVar4.f307870b, i2);
            case 13:
                xre.a aVar8 = (xre.a) obj2;
                return new d(aVar8.f308321a, aVar8.f308322b, aVar8.f308323c, aVar8.d, aVar8.e, aVar8.f, aVar8.f308324g, aVar8.f308325h, aVar8.i, aVar8.f308326j, aVar8.k, aVar8.f308327l, aVar8.f308328m, aVar8.f308329n, aVar8.o, aVar8.f308330p, aVar8.f308331q, aVar8.f308332r, aVar8.f308333s, aVar8.f308334t, aVar8.u, 1);
            case 14:
                xsc.a aVar9 = (xsc.a) obj2;
                return new cxj.c(aVar9.f308444a, aVar9.f308445b, 9);
            case 15:
                return new awj.b(((xu8.a) obj2).f308975a, 26);
            case 16:
                xxb.c cVar3 = (xxb.c) obj2;
                return new ayb.b(cVar3.f309497a, cVar3.f309498b, cVar3.f309499c, cVar3.d, 0);
            case 17:
                xy5.a aVar10 = (xy5.a) obj2;
                return new yy5.a(aVar10.f309600a, aVar10.f309601b, aVar10.f309602c, aVar10.d, aVar10.e, aVar10.f, aVar10.f309603g, aVar10.f309604h, aVar10.i, aVar10.f309605j, aVar10.k, aVar10.f309606l, aVar10.f309607m, aVar10.f309608n, aVar10.o, aVar10.f309609p, aVar10.f309610q, aVar10.f309611r, aVar10.f309612s, aVar10.f309613t, aVar10.u, aVar10.v, aVar10.f309614w, aVar10.f309615x, aVar10.f309616y, aVar10.z, aVar10.A, aVar10.B, aVar10.C);
            case 18:
                y0e.a aVar11 = (y0e.a) obj2;
                return a0k.b.a(aVar11.f310200b, aVar11.f310201c, aVar11.d, aVar11.e, aVar11.f, aVar11.f310202g, aVar11.f310203h, aVar11.i, aVar11.f310204j, aVar11.k, aVar11.f310199a);
            case 19:
                y2d.a aVar12 = (y2d.a) obj2;
                j jVar = (j) aVar12.f310621a;
                ImmutableSet immutableSetOf = ImmutableSet.of((x3d.a) jVar.o.get(), (x3d.a) jVar.f765p.get(), (x3d.a) jVar.f766q.get(), (x3d.a) jVar.f768s.get(), (x3d.a) jVar.f769t.get(), (x3d.a) jVar.u.get(), (x3d.a) jVar.v.get(), (x3d.a) jVar.f770w.get(), (x3d.a) jVar.f771x.get());
                s.j(immutableSetOf);
                return new m3d.d(immutableSetOf, aVar12.f310622b.b(), aVar12.f310623c.a());
            case 20:
                y8i.a aVar13 = (y8i.a) obj2;
                return new bwj.b(aVar13.f311660a, aVar13.f311661b, aVar13.f311662c, 17);
            case 21:
                yia.a aVar14 = (yia.a) obj2;
                return new fy9.c(aVar14.f314272a, aVar14.f314273b, aVar14.f314274c, aVar14.d, aVar14.e, 13);
            case 22:
                yla.a aVar15 = (yla.a) obj2;
                return f1.b(aVar15.f314680b, aVar15.f314681c, aVar15.d, aVar15.e, aVar15.f, aVar15.f314679a);
            case 23:
                ym8.a aVar16 = (ym8.a) obj2;
                return new bwa.b(aVar16.f314877a, aVar16.f314878b, aVar16.f314879c, aVar16.d, aVar16.e, aVar16.f, aVar16.f314880g, aVar16.f314881h, aVar16.i, 2);
            case 24:
                yo.a aVar17 = (yo.a) obj2;
                return new fy9.c(aVar17.f315502a, aVar17.f315503b, aVar17.f315504c, aVar17.d, aVar17.e, 14);
            case 25:
                ypc.a aVar18 = (ypc.a) obj2;
                return new h(aVar18.f315814a, aVar18.f315815b, aVar18.f315816c, aVar18.d, aVar18.e, aVar18.f, aVar18.f315817g, aVar18.f315818h, aVar18.i, aVar18.f315819j, aVar18.k, aVar18.f315820l, aVar18.f315821m, aVar18.f315822n, aVar18.o, aVar18.f315823p, aVar18.f315824q, aVar18.f315825r, aVar18.f315826s, aVar18.f315827t, aVar18.u);
            case 26:
                Retrofit retrofit = ((nj0.d) ((ysb.a) obj2).f316430a).f();
                f.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                return retrofit;
            case 27:
                ytf.a aVar19 = (ytf.a) obj2;
                n nVarB = aVar19.f316720a.b();
                ang.f fVarE = aVar19.f316721b.e();
                m2j.j jVarC = aVar19.f316722c.c();
                fk3.a aVarA = aVar19.d.a();
                s.j(aVarA);
                return new vtf.f(nVarB, fVarE, jVarC, aVarA, aVar19.e.a(), aVar19.f.a());
            case 28:
                ytg.a aVar20 = (ytg.a) obj2;
                return new nu9.e(aVar20.f316801a, aVar20.f316802b, aVar20.f316803c, aVar20.d, aVar20.e, aVar20.f, aVar20.f316804g, aVar20.f316805h, aVar20.i, aVar20.f316806j, aVar20.k, aVar20.f316807l, aVar20.f316808m, 4);
            default:
                return new awj.b(((yvj.a) obj2).f317187a, i3);
        }
    }
}
