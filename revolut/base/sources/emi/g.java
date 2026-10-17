package emi;

import android.content.Context;
import da3.j;
import ecm.q;
import fma.o;
import kotlin.jvm.functions.Function0;
import p12.l;
import pl1.i;
import pl1.m;
import retrofit2.Retrofit;
import t29.h;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f127672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f127673c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f127674g;

    public /* synthetic */ g(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, q qVar, int i) {
        this.f127672b = i;
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
        this.f127674g = aVar4;
        this.f127673c = qVar;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f127672b) {
            case 0:
                Context context = (Context) ((Function0) this.f127673c.f124861b).invoke();
                ee0.a aVar = (ee0.a) ((phm.a) this.d.f955b).get();
                rg0.e eVar = (rg0.e) ((phm.a) this.e.f955b).get();
                xdj.a aVar2 = (xdj.a) ((phm.a) this.f.f955b).get();
                ite.a aVar3 = (ite.a) ((phm.a) this.f127674g.f955b).get();
                context.getClass();
                aVar.getClass();
                eVar.getClass();
                aVar2.getClass();
                aVar3.getClass();
                return new a(aVar, eVar, aVar2, aVar3, context);
            case 1:
                Context context2 = (Context) ((Function0) this.f127673c.f124861b).invoke();
                q8b.a aVar4 = (q8b.a) ((phm.a) this.d.f955b).get();
                jk3.c cVar = (jk3.c) ((phm.a) this.e.f955b).get();
                e48.a aVar5 = (e48.a) ((phm.a) this.f.f955b).get();
                xmg.a aVar6 = (xmg.a) ((phm.a) this.f127674g.f955b).get();
                context2.getClass();
                aVar4.getClass();
                cVar.getClass();
                aVar5.getClass();
                aVar6.getClass();
                return new o(aVar4, cVar, aVar5, aVar6);
            case 2:
                Context context3 = (Context) ((Function0) this.f127673c.f124861b).invoke();
                l70.e eVar2 = (l70.e) ((phm.a) this.d.f955b).get();
                nj0.a aVar7 = (nj0.a) ((phm.a) this.e.f955b).get();
                j jVar = (j) ((phm.a) this.f.f955b).get();
                djf.c cVar2 = (djf.c) ((phm.a) this.f127674g.f955b).get();
                context3.getClass();
                eVar2.getClass();
                aVar7.getClass();
                jVar.getClass();
                cVar2.getClass();
                return new g92.e(eVar2, aVar7, jVar, cVar2);
            case 3:
                Context context4 = (Context) ((Function0) this.f127673c.f124861b).invoke();
                l70.e eVar3 = (l70.e) ((phm.a) this.d.f955b).get();
                an0.c cVar3 = (an0.c) ((phm.a) this.e.f955b).get();
                jqb.a aVar8 = (jqb.a) ((phm.a) this.f.f955b).get();
                hcb.a aVar9 = (hcb.a) ((phm.a) this.f127674g.f955b).get();
                context4.getClass();
                eVar3.getClass();
                cVar3.getClass();
                aVar8.getClass();
                aVar9.getClass();
                return new j51.a(eVar3, cVar3, aVar8, aVar9, context4);
            case 4:
                Retrofit retrofit = (Retrofit) ((Function0) this.f127673c.f124861b).invoke();
                ee0.a aVar10 = (ee0.a) ((phm.a) this.d.f955b).get();
                an0.c cVar4 = (an0.c) ((phm.a) this.e.f955b).get();
                isb.b bVar = (isb.b) ((phm.a) this.f.f955b).get();
                gff.c cVar5 = (gff.c) ((phm.a) this.f127674g.f955b).get();
                retrofit.getClass();
                aVar10.getClass();
                cVar4.getClass();
                bVar.getClass();
                cVar5.getClass();
                return new jef.e(aVar10, cVar4, bVar, cVar5, retrofit);
            case 5:
                Context context5 = (Context) ((Function0) this.f127673c.f124861b).invoke();
                ee0.a aVar11 = (ee0.a) ((phm.a) this.d.f955b).get();
                an0.c cVar6 = (an0.c) ((phm.a) this.e.f955b).get();
                rg0.e eVar4 = (rg0.e) ((phm.a) this.f.f955b).get();
                l70.e eVar5 = (l70.e) ((phm.a) this.f127674g.f955b).get();
                context5.getClass();
                aVar11.getClass();
                cVar6.getClass();
                eVar4.getClass();
                eVar5.getClass();
                return new kh7.a(aVar11, cVar6, eVar4, eVar5, context5);
            case 6:
                l70.e eVar6 = (l70.e) ((phm.a) this.d.f955b).get();
                ite.a aVar12 = (ite.a) ((phm.a) this.e.f955b).get();
                vwa.b bVar2 = (vwa.b) ((phm.a) this.f.f955b).get();
                xmg.a aVar13 = (xmg.a) ((phm.a) this.f127674g.f955b).get();
                Context context6 = (Context) ((Function0) this.f127673c.f124861b).invoke();
                eVar6.getClass();
                aVar12.getClass();
                bVar2.getClass();
                aVar13.getClass();
                context6.getClass();
                return new kxa.b(eVar6, aVar12, bVar2, aVar13, context6);
            case 7:
                Context context7 = (Context) ((Function0) this.f127673c.f124861b).invoke();
                ee0.a aVar14 = (ee0.a) ((phm.a) this.d.f955b).get();
                nj0.a aVar15 = (nj0.a) ((phm.a) this.e.f955b).get();
                c21.e eVar7 = (c21.e) ((phm.a) this.f.f955b).get();
                an0.c cVar7 = (an0.c) ((phm.a) this.f127674g.f955b).get();
                context7.getClass();
                aVar14.getClass();
                aVar15.getClass();
                eVar7.getClass();
                cVar7.getClass();
                return new l36.b(aVar14, aVar15, eVar7, cVar7, context7);
            case 8:
                Context context8 = (Context) ((Function0) this.f127673c.f124861b).invoke();
                uw1.b bVar3 = (uw1.b) ((phm.a) this.d.f955b).get();
                l lVar = (l) ((phm.a) this.e.f955b).get();
                l70.e eVar8 = (l70.e) ((phm.a) this.f.f955b).get();
                nj0.a aVar16 = (nj0.a) ((phm.a) this.f127674g.f955b).get();
                context8.getClass();
                bVar3.getClass();
                lVar.getClass();
                eVar8.getClass();
                aVar16.getClass();
                return new i(new pl1.e(), bVar3, lVar, eVar8, aVar16);
            case 9:
                Context context9 = (Context) ((Function0) this.f127673c.f124861b).invoke();
                uw1.b bVar4 = (uw1.b) ((phm.a) this.d.f955b).get();
                l lVar2 = (l) ((phm.a) this.e.f955b).get();
                l70.e eVar9 = (l70.e) ((phm.a) this.f.f955b).get();
                ika.f fVar = (ika.f) ((phm.a) this.f127674g.f955b).get();
                context9.getClass();
                bVar4.getClass();
                lVar2.getClass();
                eVar9.getClass();
                fVar.getClass();
                return new m(bVar4, lVar2, eVar9, fVar);
            case 10:
                Context context10 = (Context) ((Function0) this.f127673c.f124861b).invoke();
                ede.b bVar5 = (ede.b) ((phm.a) this.d.f955b).get();
                h30.a aVar17 = (h30.a) ((phm.a) this.e.f955b).get();
                nj0.a aVar18 = (nj0.a) ((phm.a) this.f.f955b).get();
                ite.a aVar19 = (ite.a) ((phm.a) this.f127674g.f955b).get();
                context10.getClass();
                bVar5.getClass();
                aVar17.getClass();
                aVar18.getClass();
                aVar19.getClass();
                return new qxc.a(bVar5, aVar17, aVar18, aVar19, context10);
            case 11:
                Context context11 = (Context) ((Function0) this.f127673c.f124861b).invoke();
                ee0.a aVar20 = (ee0.a) ((phm.a) this.d.f955b).get();
                nj0.a aVar21 = (nj0.a) ((phm.a) this.e.f955b).get();
                an0.c cVar8 = (an0.c) ((phm.a) this.f.f955b).get();
                e39.a aVar22 = (e39.a) ((phm.a) this.f127674g.f955b).get();
                context11.getClass();
                aVar20.getClass();
                aVar21.getClass();
                cVar8.getClass();
                aVar22.getClass();
                return new h(aVar20, aVar21, cVar8, aVar22);
            case 12:
                Context context12 = (Context) ((Function0) this.f127673c.f124861b).invoke();
                ei5.d dVar = (ei5.d) ((phm.a) this.d.f955b).get();
                v0i.b bVar6 = (v0i.b) ((phm.a) this.e.f955b).get();
                ite.a aVar23 = (ite.a) ((phm.a) this.f.f955b).get();
                xmg.a aVar24 = (xmg.a) ((phm.a) this.f127674g.f955b).get();
                context12.getClass();
                dVar.getClass();
                bVar6.getClass();
                aVar23.getClass();
                aVar24.getClass();
                return new u7i.c(dVar, bVar6, aVar23, aVar24);
            case 13:
                l70.e eVar10 = (l70.e) ((phm.a) this.d.f955b).get();
                ee0.a aVar25 = (ee0.a) ((phm.a) this.e.f955b).get();
                k5j.b bVar7 = (k5j.b) ((phm.a) this.f.f955b).get();
                k5j.c cVar9 = (k5j.c) ((phm.a) this.f127674g.f955b).get();
                th0.a aVar26 = (th0.a) ((Function0) this.f127673c.f124861b).invoke();
                eVar10.getClass();
                aVar25.getClass();
                bVar7.getClass();
                cVar9.getClass();
                aVar26.getClass();
                return new us2.j(eVar10, aVar25, bVar7, cVar9, aVar26);
            case 14:
                Context context13 = (Context) ((Function0) this.f127673c.f124861b).invoke();
                poi.b bVar8 = (poi.b) ((phm.a) this.d.f955b).get();
                rk0.c cVar10 = (rk0.c) ((phm.a) this.e.f955b).get();
                rg0.e eVar11 = (rg0.e) ((phm.a) this.f.f955b).get();
                ite.a aVar27 = (ite.a) ((phm.a) this.f127674g.f955b).get();
                context13.getClass();
                bVar8.getClass();
                cVar10.getClass();
                eVar11.getClass();
                aVar27.getClass();
                return new vxl.a(bVar8, cVar10, eVar11, aVar27);
            case 15:
                obd.a aVar28 = (obd.a) ((Function0) this.f127673c.f124861b).invoke();
                ee0.a aVar29 = (ee0.a) ((phm.a) this.d.f955b).get();
                nj0.a aVar30 = (nj0.a) ((phm.a) this.e.f955b).get();
                an0.c cVar11 = (an0.c) ((phm.a) this.f.f955b).get();
                anb.a aVar31 = (anb.a) ((phm.a) this.f127674g.f955b).get();
                aVar28.getClass();
                aVar29.getClass();
                aVar30.getClass();
                cVar11.getClass();
                aVar31.getClass();
                return new xbd.b(aVar29, aVar30, cVar11, aVar31, aVar28);
            case 16:
                Context context14 = (Context) ((Function0) this.f127673c.f124861b).invoke();
                rg0.e eVar12 = (rg0.e) ((phm.a) this.d.f955b).get();
                nj0.a aVar32 = (nj0.a) ((phm.a) this.e.f955b).get();
                c21.e eVar13 = (c21.e) ((phm.a) this.f.f955b).get();
                an0.c cVar12 = (an0.c) ((phm.a) this.f127674g.f955b).get();
                context14.getClass();
                eVar12.getClass();
                aVar32.getClass();
                eVar13.getClass();
                cVar12.getClass();
                return new z46.b(eVar12, aVar32, eVar13, cVar12, context14);
            default:
                x7l.a aVar33 = (x7l.a) ((Function0) this.f127673c.f124861b).invoke();
                cri.a aVar34 = (cri.a) ((phm.a) this.d.f955b).get();
                rg0.e eVar14 = (rg0.e) ((phm.a) this.e.f955b).get();
                ee0.a aVar35 = (ee0.a) ((phm.a) this.f.f955b).get();
                nj0.a aVar36 = (nj0.a) ((phm.a) this.f127674g.f955b).get();
                aVar33.getClass();
                aVar34.getClass();
                eVar14.getClass();
                aVar35.getClass();
                aVar36.getClass();
                return new z7l.a(new z7l.b(), aVar34, eVar14, aVar35, aVar36, aVar33);
        }
    }

    public /* synthetic */ g(q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, int i) {
        this.f127672b = i;
        this.f127673c = qVar;
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
        this.f127674g = aVar4;
    }
}
