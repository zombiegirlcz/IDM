package a2d;

import android.content.Context;
import ecm.q;
import eyd.b0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class n extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f788c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f790h;
    public final a31.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a31.a f791j;
    public final a31.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a31.a f792l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a31.a f793m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a31.a f794n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f795p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f796q;

    public /* synthetic */ n(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, int i) {
        this.f787b = i;
        this.f788c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f789g = aVar5;
        this.f790h = aVar6;
        this.i = aVar7;
        this.f791j = aVar8;
        this.k = aVar9;
        this.f792l = aVar10;
        this.f793m = aVar11;
        this.f794n = aVar12;
        this.o = aVar13;
        this.f795p = aVar14;
        this.f796q = aVar15;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f787b) {
            case 0:
                sd0.c cVar = (sd0.c) ((phm.a) this.f788c.f955b).get();
                l70.e eVar = (l70.e) ((phm.a) this.d.f955b).get();
                vv5.e eVar2 = (vv5.e) ((phm.a) this.e.f955b).get();
                h77.a aVar = (h77.a) ((phm.a) this.f.f955b).get();
                bpj.a aVar2 = (bpj.a) ((phm.a) this.f789g.f955b).get();
                npk.a aVar3 = (npk.a) ((phm.a) this.f790h.f955b).get();
                jk3.c cVar2 = (jk3.c) ((phm.a) this.i.f955b).get();
                usg.a aVar4 = (usg.a) ((phm.a) this.f791j.f955b).get();
                f fVar = (f) ((phm.a) this.k.f955b).get();
                h hVar = (h) ((phm.a) this.f792l.f955b).get();
                h9h.a aVar5 = (h9h.a) ((phm.a) this.f793m.f955b).get();
                zdl.f fVar2 = (zdl.f) ((phm.a) this.f794n.f955b).get();
                u8h.c cVar3 = (u8h.c) ((phm.a) ((a31.a) this.o).f955b).get();
                zdl.c cVar4 = (zdl.c) ((phm.a) ((a31.a) this.f795p).f955b).get();
                whl.f fVar3 = (whl.f) ((phm.a) ((a31.a) this.f796q).f955b).get();
                cVar.getClass();
                eVar.getClass();
                eVar2.getClass();
                aVar.getClass();
                aVar2.getClass();
                aVar3.getClass();
                cVar2.getClass();
                aVar4.getClass();
                fVar.getClass();
                hVar.getClass();
                aVar5.getClass();
                fVar2.getClass();
                cVar3.getClass();
                cVar4.getClass();
                fVar3.getClass();
                return new j(cVar, eVar, eVar2, aVar, aVar3, aVar2, cVar2, aVar4, fVar, hVar, aVar5, fVar2, cVar3, cVar4, fVar3);
            case 1:
                jk3.c cVar5 = (jk3.c) ((phm.a) this.f788c.f955b).get();
                l70.e eVar3 = (l70.e) ((phm.a) this.d.f955b).get();
                nf0.a aVar6 = (nf0.a) ((phm.a) this.e.f955b).get();
                nj0.a aVar7 = (nj0.a) ((phm.a) this.f.f955b).get();
                g2j.f fVar4 = (g2j.f) ((phm.a) this.f789g.f955b).get();
                cri.b bVar = (cri.b) ((phm.a) this.f790h.f955b).get();
                ite.a aVar8 = (ite.a) ((phm.a) this.i.f955b).get();
                e48.a aVar9 = (e48.a) ((phm.a) this.f791j.f955b).get();
                pqi.a aVar10 = (pqi.a) ((phm.a) this.k.f955b).get();
                tib.b bVar2 = (tib.b) ((phm.a) this.f792l.f955b).get();
                vxd.b bVar3 = (vxd.b) ((phm.a) this.f793m.f955b).get();
                xmg.a aVar11 = (xmg.a) ((phm.a) this.f794n.f955b).get();
                usg.a aVar12 = (usg.a) ((phm.a) ((a31.a) this.o).f955b).get();
                oda.d dVar = (oda.d) ((phm.a) ((a31.a) this.f795p).f955b).get();
                fpg.c cVar6 = (fpg.c) ((phm.a) ((a31.a) this.f796q).f955b).get();
                cVar5.getClass();
                eVar3.getClass();
                aVar6.getClass();
                aVar7.getClass();
                fVar4.getClass();
                bVar.getClass();
                aVar8.getClass();
                aVar9.getClass();
                aVar10.getClass();
                bVar2.getClass();
                bVar3.getClass();
                aVar11.getClass();
                aVar12.getClass();
                dVar.getClass();
                cVar6.getClass();
                return new b0(cVar5, eVar3, aVar6, aVar7, fVar4, bVar, aVar8, aVar9, aVar10, bVar2, bVar3, aVar11, aVar12, dVar, cVar6);
            default:
                Context context = (Context) ((Function0) ((q) this.o).f124861b).invoke();
                kf3.a aVar13 = (kf3.a) ((Function0) ((q) this.f795p).f124861b).invoke();
                pqi.a aVar14 = (pqi.a) ((phm.a) this.f788c.f955b).get();
                c21.e eVar4 = (c21.e) ((phm.a) this.d.f955b).get();
                an0.c cVar7 = (an0.c) ((phm.a) this.e.f955b).get();
                xmg.a aVar15 = (xmg.a) ((phm.a) this.f.f955b).get();
                l70.e eVar5 = (l70.e) ((phm.a) this.f789g.f955b).get();
                nj0.a aVar16 = (nj0.a) ((phm.a) this.f790h.f955b).get();
                cri.b bVar4 = (cri.b) ((phm.a) this.i.f955b).get();
                u06.a aVar17 = (u06.a) ((phm.a) this.f791j.f955b).get();
                ite.a aVar18 = (ite.a) ((phm.a) this.k.f955b).get();
                th0.a aVar19 = (th0.a) ((Function0) ((q) this.f796q).f124861b).invoke();
                efk.a aVar20 = (efk.a) ((phm.a) this.f792l.f955b).get();
                e79.a aVar21 = (e79.a) ((phm.a) this.f793m.f955b).get();
                zc6.b bVar5 = (zc6.b) ((phm.a) this.f794n.f955b).get();
                context.getClass();
                aVar13.getClass();
                aVar14.getClass();
                eVar4.getClass();
                cVar7.getClass();
                aVar15.getClass();
                eVar5.getClass();
                aVar16.getClass();
                bVar4.getClass();
                aVar17.getClass();
                aVar18.getClass();
                aVar19.getClass();
                aVar20.getClass();
                aVar21.getClass();
                bVar5.getClass();
                return new of3.f(aVar14, eVar4, cVar7, aVar15, eVar5, aVar16, bVar4, aVar17, aVar18, aVar19, aVar20, aVar21, bVar5, aVar13);
        }
    }

    public n(q qVar, q qVar2, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, q qVar3, a31.a aVar10, a31.a aVar11, a31.a aVar12) {
        this.f787b = 2;
        this.o = qVar;
        this.f795p = qVar2;
        this.f788c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f789g = aVar5;
        this.f790h = aVar6;
        this.i = aVar7;
        this.f791j = aVar8;
        this.k = aVar9;
        this.f796q = qVar3;
        this.f792l = aVar10;
        this.f793m = aVar11;
        this.f794n = aVar12;
    }
}
