package hwl;

import com.google.common.collect.ImmutableSet;
import e4m.e;
import e79.j;
import ecm.q;
import eub.i;
import h30.n;
import i15.g;
import i3d.d;
import i9e.a0;
import i9e.y;
import ine.z;
import jr9.h;
import k2d.f;
import sf1.m;
import vc.s;
import zxb.k0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f156290b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f156289a = i;
        this.f156290b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f156289a) {
            case 0:
                gte.a aVarB = ((b) this.f156290b).f156291a.b();
                s.j(aVarB);
                return new c(aVarB);
            case 1:
                g gVar = (g) this.f156290b;
                return new es8.b(gVar.f157571a, gVar.f157572b, gVar.f157573c, gVar.d, gVar.e, gVar.f, 2);
            case 2:
                i2d.a aVar = (i2d.a) this.f156290b;
                return new f(aVar.f157906a, aVar.f157907b, aVar.f157908c, aVar.d, aVar.e, aVar.f);
            case 3:
                i2d.b bVar = (i2d.b) this.f156290b;
                return new h5c.b(bVar.f157910a, bVar.f157911b, bVar.f157912c, bVar.d, bVar.e, bVar.f, 2);
            case 4:
                return new awj.b(((i3d.b) this.f156290b).f158167a, 9);
            case 5:
                d dVar = (d) this.f156290b;
                return new dm5.a(dVar.f158170a, dVar.f158171b, dVar.f158172c, dVar.d, dVar.e, 4);
            case 6:
                i3d.e eVar = (i3d.e) this.f156290b;
                return new bfc.c(eVar.f158173a, eVar.f158174b, eVar.f158175c, eVar.d, eVar.e, eVar.f, eVar.f158176g, eVar.f158177h, eVar.i, 4);
            case 7:
                i78.b bVar2 = (i78.b) this.f156290b;
                return h.d(bVar2.f159196a, bVar2.f159197b, bVar2.f159198c, bVar2.d, bVar2.e, bVar2.f, bVar2.f159199g, bVar2.f159200h, bVar2.i, bVar2.f159201j, bVar2.k, bVar2.f159202l, bVar2.f159203m, bVar2.f159204n, bVar2.o, bVar2.f159205p, bVar2.f159206q, bVar2.f159207r, bVar2.f159208s, bVar2.f159209t, bVar2.u, bVar2.v, bVar2.f159210w, bVar2.f159211x, bVar2.f159212y, bVar2.z, bVar2.A, bVar2.B, bVar2.C, bVar2.D, bVar2.E, bVar2.F, bVar2.G, bVar2.H, bVar2.I, bVar2.J, bVar2.K, bVar2.L, bVar2.M, bVar2.N, bVar2.O, bVar2.P, bVar2.Q, bVar2.R);
            case 8:
                y yVar = (y) this.f156290b;
                return new a0(yVar.f159758a, yVar.f159759b, yVar.f159760c, yVar.d, yVar.e, yVar.f, yVar.f159761g, yVar.f159762h, yVar.i, yVar.f159763j, yVar.k, yVar.f159764l, yVar.f159765m, yVar.f159766n, yVar.o, yVar.f159767p, yVar.f159768q, yVar.f159769r, yVar.f159770s, yVar.f159771t, yVar.u, yVar.v, yVar.f159772w, yVar.f159773x, yVar.f159774y, yVar.z, yVar.A, yVar.B, yVar.C, yVar.D, yVar.E, yVar.F, yVar.G);
            case 9:
                iei.a aVar2 = (iei.a) this.f156290b;
                return new fh7.c(aVar2.f160748a, aVar2.f160749b, aVar2.f160750c, aVar2.d, 5);
            case 10:
                ige.b bVar3 = (ige.b) this.f156290b;
                return new db5.a(bVar3.f161164a, bVar3.f161165b, bVar3.f161166c, 4);
            case 11:
                ijl.a aVar3 = (ijl.a) this.f156290b;
                return new e86.b(aVar3.f161829a, aVar3.f161830b, aVar3.f161831c, 1);
            case 12:
                ijl.c cVar = (ijl.c) this.f156290b;
                return new e86.b(cVar.f161842a, cVar.f161843b, cVar.f161844c, 2);
            case 13:
                ijl.d dVar2 = (ijl.d) this.f156290b;
                q qVar = dVar2.f161845a;
                return new did.a0(dVar2.f161846b, dVar2.f161847c, dVar2.d, dVar2.e, dVar2.f, dVar2.f161848g, dVar2.f161849h, dVar2.i, dVar2.f161850j, dVar2.k, dVar2.f161851l, dVar2.f161852m, dVar2.f161853n, dVar2.o, dVar2.f161855q, dVar2.f161856r, dVar2.f161857s, dVar2.f161858t, dVar2.u, dVar2.v, dVar2.f161859w, dVar2.f161860x, dVar2.f161861y, dVar2.z, qVar, dVar2.f161854p);
            case 14:
                in2.c cVar2 = (in2.c) this.f156290b;
                return in2.b.a(cVar2.f162615a.e(), ((n) cVar2.f162616b).k());
            case 15:
                in9.a aVar4 = (in9.a) this.f156290b;
                return new h5c.b(aVar4.f162694a, aVar4.f162695b, aVar4.f162696c, aVar4.d, aVar4.e, aVar4.f, 3);
            case 16:
                z zVar = (z) this.f156290b;
                return new ei5.a(zVar.f162925a, zVar.f162926b, zVar.f162927c, zVar.d, zVar.e, zVar.f, zVar.f162928g, zVar.f162929h, zVar.i, zVar.f162930j, zVar.k, zVar.f162931l, 1);
            case 17:
                iq.d dVar3 = (iq.d) this.f156290b;
                return new iq.a(dVar3.f167784a, dVar3.f167785b, dVar3.f167786c, dVar3.d, dVar3.e, dVar3.f, dVar3.f167787g, dVar3.f167788h, dVar3.i, dVar3.f167789j, dVar3.k, dVar3.f167790l);
            case 18:
                thf.c cVarC = ((isb.a) this.f156290b).f168169a.c();
                s.j(cVarC);
                return new jsb.b(cVarC);
            case 19:
                return new awj.b(((iwl.a) this.f156290b).f169198a, 5);
            case 20:
                j1b.a aVar5 = (j1b.a) this.f156290b;
                return new j(aVar5.f170356a, aVar5.f170357b, aVar5.f170358c, aVar5.d, aVar5.e, aVar5.f, aVar5.f170359g, aVar5.f170360h, 5);
            case 21:
                j67.b bVar4 = (j67.b) this.f156290b;
                return new ayb.b(bVar4.f171678a, bVar4.f171679b, bVar4.f171680c, bVar4.d, 2);
            case 22:
                ja1.a aVar6 = (ja1.a) this.f156290b;
                return new j(aVar6.f172402a, aVar6.f172403b, aVar6.f172404c, aVar6.d, aVar6.e, aVar6.f, aVar6.f172405g, aVar6.f172406h, 6);
            case 23:
                jdi.c cVar3 = (jdi.c) this.f156290b;
                k0 k0Var = cVar3.f173079a;
                i iVarE = k0Var.e();
                s.j(iVarE);
                eub.a aVarA = k0Var.a();
                s.j(aVarA);
                ldi.f fVarA = cVar3.f173080b.a();
                s.j(fVarA);
                ImmutableSet immutableSetOf = ImmutableSet.of(new idi.b(iVarE, aVarA, fVarA));
                edi.a aVar7 = (edi.a) cVar3.f173081c.f173127b.get();
                s.j(aVar7);
                return new hdi.f(immutableSetOf, aVar7);
            case 24:
                i iVarE2 = ((jdi.n) this.f156290b).f173126a.e();
                s.j(iVarE2);
                return new ndi.b(iVarE2);
            case 25:
                je3.a aVar8 = (je3.a) this.f156290b;
                return new m(aVar8.f173193a, aVar8.f173194b, aVar8.f173195c, aVar8.d, aVar8.e, aVar8.f, aVar8.f173196g, aVar8.f173197h, aVar8.i, aVar8.f173198j, aVar8.k, aVar8.f173199l, aVar8.f173200m, aVar8.f173201n, aVar8.o, aVar8.f173202p, aVar8.f173203q, aVar8.f173204r, aVar8.f173205s);
            case 26:
                jff.a aVar9 = (jff.a) this.f156290b;
                return new c06.a(aVar9.f173870a, aVar9.f173871b, 4);
            case 27:
                jj1.a aVar10 = (jj1.a) this.f156290b;
                return new dm5.a(aVar10.f174624a, aVar10.f174625b, aVar10.f174626c, aVar10.d, aVar10.e, 5);
            case 28:
                jk3.d dVar4 = (jk3.d) this.f156290b;
                return new fy9.c(dVar4.f175063a, dVar4.f175064b, dVar4.f175065c, dVar4.d, dVar4.e, 6);
            default:
                jl2.a aVar11 = (jl2.a) this.f156290b;
                return new euh.j(aVar11.f175585a, aVar11.f175586b, aVar11.f175587c, aVar11.d, aVar11.e, aVar11.f, aVar11.f175588g, 2);
        }
    }
}
