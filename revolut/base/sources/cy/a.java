package cy;

import a96.i;
import android.content.Context;
import c21.f;
import c4f.p;
import com.revolut.analytics.tracking.v3.d;
import d9g.c;
import di5.h;
import e48.r;
import e48.t;
import e4m.e;
import e79.j;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f110008b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f110007a = i;
        this.f110008b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f110007a) {
            case 0:
                b bVar = (b) this.f110008b;
                return new i(bVar.f110009a, bVar.f110010b, bVar.f110011c, bVar.d, bVar.e, bVar.f, bVar.f110012g, 8);
            case 1:
                d dVarF = ((d21.a) this.f110008b).f110696a.f();
                s.j(dVarF);
                return new h31.b(dVarF);
            case 2:
                return new awj.b(((d21.b) this.f110008b).f110698a, 1);
            case 3:
                d79.b bVar2 = (d79.b) this.f110008b;
                return new j(bVar2.f111890a, bVar2.f111891b, bVar2.f111892c, bVar2.d, bVar2.e, bVar2.f, bVar2.f111893g, bVar2.f111894h, 0);
            case 4:
                d86.a aVar = (d86.a) this.f110008b;
                return new e86.b(aVar.f112130a, aVar.f112131b, aVar.f112132c, 0);
            case 5:
                c cVar = (c) this.f110008b;
                return new fy9.c(cVar.f112367a, cVar.f112368b, cVar.f112369c, cVar.d, cVar.e, 1);
            case 6:
                da9.a aVar2 = (da9.a) this.f110008b;
                return new c06.a(aVar2.f112492a, aVar2.f112493b, 1);
            case 7:
                return new awj.b(((dbj.b) this.f110008b).f112760a, 2);
            case 8:
                dd9.i iVar = (dd9.i) this.f110008b;
                return new f(iVar.f113151a, iVar.f113152b, iVar.f113153c, iVar.d, iVar.e, iVar.f, iVar.f113154g, iVar.f113155h, iVar.i, iVar.f113156j, iVar.k);
            case 9:
                dde.b bVar3 = (dde.b) this.f110008b;
                return new ede.f(bVar3.f113212a, bVar3.f113213b, bVar3.f113214c, bVar3.d, bVar3.e, bVar3.f, bVar3.f113215g, bVar3.f113216h, bVar3.i, bVar3.f113217j, bVar3.k, 0);
            case 10:
                de9.a aVar3 = (de9.a) this.f110008b;
                return new dm5.a(aVar3.f113316a, aVar3.f113317b, aVar3.f113318c, aVar3.d, aVar3.e, 3);
            case 11:
                dfk.a aVar4 = (dfk.a) this.f110008b;
                return new j(aVar4.f114172a, aVar4.f114173b, aVar4.f114174c, aVar4.d, aVar4.e, aVar4.f, aVar4.f114175g, aVar4.f114176h, 1);
            case 12:
                dg8.a aVar5 = (dg8.a) this.f110008b;
                return new bjf.b(aVar5.f114594b, aVar5.f114595c, aVar5.d, aVar5.e, aVar5.f, aVar5.f114596g, aVar5.f114597h, aVar5.i, aVar5.f114598j, aVar5.k, aVar5.f114599l, aVar5.f114600m, aVar5.f114601n, aVar5.o, aVar5.f114602p, aVar5.f114603q, aVar5.f114604r, aVar5.f114605s, aVar5.f114606t, aVar5.u, aVar5.v, aVar5.f114607w, aVar5.f114593a);
            case 13:
                h hVar = (h) this.f110008b;
                return new ei5.a(hVar.f114927a, hVar.f114928b, hVar.f114929c, hVar.d, hVar.e, hVar.f, hVar.f114930g, hVar.f114931h, hVar.i, hVar.f114932j, hVar.k, hVar.f114933l, 0);
            case 14:
                dj1.a aVar6 = (dj1.a) this.f110008b;
                return new bwj.b(aVar6.f115084a, aVar6.f115085b, aVar6.f115086c, 4);
            case 15:
                return new dj2.a(((dj2.b) this.f110008b).a());
            case 16:
                dj2.c cVar2 = (dj2.c) this.f110008b;
                return new db5.a(cVar2.f115092a, cVar2.f115093b, cVar2.f115094c, 1);
            case 17:
                djf.d dVar = (djf.d) this.f110008b;
                return new djf.f(dVar.f115346a, dVar.f115347b, dVar.f115348c, dVar.d, dVar.e, dVar.f, dVar.f115349g, dVar.f115350h, dVar.i, dVar.f115351j, dVar.k, dVar.f115352l, dVar.f115353m, dVar.f115354n, dVar.o, dVar.f115355p, dVar.f115356q, dVar.f115357r, dVar.f115358s, dVar.f115359t, dVar.u, dVar.v, dVar.f115360w, dVar.f115361x, dVar.f115362y, 0);
            case 18:
                djg.a aVar7 = (djg.a) this.f110008b;
                return new i(aVar7.f115379a, aVar7.f115380b, aVar7.f115381c, aVar7.d, aVar7.e, aVar7.f, aVar7.f115382g, 2);
            case 19:
                dm5.f fVar = (dm5.f) this.f110008b;
                return new dm5.a(fVar.f115870a, fVar.f115871b, fVar.f115872c, fVar.d, fVar.e, 0);
            case 20:
                do0.a aVar8 = (do0.a) this.f110008b;
                return new db5.a(aVar8.f116368a, aVar8.f116369b, aVar8.f116370c, 2);
            case 21:
                return new p(((dpa.a) this.f110008b).f116850a, 3);
            case 22:
                dre.a aVar9 = (dre.a) this.f110008b;
                return efk.j.b(aVar9.f117120b, aVar9.f117121c, aVar9.f117119a);
            case 23:
                drj.b bVar4 = (drj.b) this.f110008b;
                return new erj.f(bVar4.f117136a, bVar4.f117137b, bVar4.f117138c, bVar4.d, bVar4.e, bVar4.f, bVar4.f117139g, bVar4.f117140h, bVar4.i, bVar4.f117141j, bVar4.k, bVar4.f117142l, bVar4.f117143m, bVar4.f117144n, bVar4.o, bVar4.f117145p, bVar4.f117146q, bVar4.f117147r, bVar4.f117148s, bVar4.f117149t, bVar4.u);
            case 24:
                ds8.a aVar10 = (ds8.a) this.f110008b;
                return new es8.b(aVar10.f117271a, aVar10.f117272b, aVar10.f117273c, aVar10.d, aVar10.e, aVar10.f, 0);
            case 25:
                duh.a aVar11 = (duh.a) this.f110008b;
                return new euh.j(aVar11.f117980a, aVar11.f117981b, aVar11.f117982c, aVar11.d, aVar11.e, aVar11.f, aVar11.f117983g, 0);
            case 26:
                e1j.a aVar12 = (e1j.a) this.f110008b;
                Context context = aVar12.f121992a;
                ee0.a aVar13 = aVar12.f121993b;
                je0.d mapper = aVar13.b();
                s.j(mapper);
                yk0.a databaseSessionProvider = aVar12.f121994c.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar13.f();
                s.j(storageFactory);
                e1j.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return new d1j.a(context, xe0.f.g(storageFactory, databaseSessionProvider, "lf_prefs", mapper, 0, null, false, 56));
            case 27:
                r rVar = (r) this.f110008b;
                return new t(rVar.f122469a, rVar.f122470b, rVar.f122471c, rVar.d, rVar.e, rVar.f, rVar.f122472g, rVar.f122473h, rVar.i, rVar.f122474j, rVar.k, rVar.f122475l, rVar.f122476m, rVar.f122477n, rVar.o, rVar.f122478p, rVar.f122479q, rVar.f122480r, rVar.f122481s, rVar.f122482t, rVar.u, rVar.v, rVar.f122483w, rVar.f122484x, rVar.f122485y, rVar.z, 0);
            case 28:
                return ((phm.a) this.f110008b).get();
            default:
                ebd.a aVar14 = (ebd.a) this.f110008b;
                return new dm5.a(aVar14.f124312a, aVar14.f124313b, aVar14.f124314c, aVar14.d, aVar14.e, 2);
        }
    }
}
