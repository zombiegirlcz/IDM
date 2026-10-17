package pgf;

import android.content.Context;
import ecm.q;
import jge.j;
import jm4.r;
import kotlin.jvm.functions.Function0;
import ove.a0;
import ove.t;
import ove.w0;
import qve.k;
import qve.w;
import r7d.l;
import wfb.u;
import whc.s;
import xf6.n1;
import xf6.r1;
import zu8.c0;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends b60.a {
    public final a31.a A;
    public final a31.a B;
    public final a31.a C;
    public final a31.a D;
    public final a31.a E;
    public final a31.a F;
    public final a31.a G;
    public final a31.a H;
    public final a31.a I;
    public final a31.a J;
    public final a31.a K;
    public final a31.a L;
    public final a31.a M;
    public final a31.a N;
    public final a31.a O;
    public final a31.a P;
    public final a31.a Q;
    public final a31.a R;
    public final a31.a S;
    public final a31.a T;
    public final a31.a U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f235930b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f235931c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f235932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f235933h;
    public final a31.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a31.a f235934j;
    public final a31.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a31.a f235935l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a31.a f235936m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a31.a f235937n;
    public final a31.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a31.a f235938p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a31.a f235939q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a31.a f235940r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a31.a f235941s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a31.a f235942t;
    public final a31.a u;
    public final a31.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a31.a f235943w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a31.a f235944x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a31.a f235945y;
    public final a31.a z;

    public i(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, a31.a aVar23, a31.a aVar24, a31.a aVar25, a31.a aVar26, a31.a aVar27, a31.a aVar28, a31.a aVar29, a31.a aVar30, a31.a aVar31, a31.a aVar32, a31.a aVar33, a31.a aVar34, a31.a aVar35, a31.a aVar36, a31.a aVar37, a31.a aVar38, a31.a aVar39, phm.a aVar40, phm.a aVar41, phm.a aVar42, phm.a aVar43, a31.a aVar44, phm.a aVar45, a31.a aVar46, a31.a aVar47, a31.a aVar48, a31.a aVar49, a31.a aVar50) {
        this.f235931c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f235932g = aVar5;
        this.f235933h = aVar6;
        this.i = aVar7;
        this.f235934j = aVar8;
        this.k = aVar9;
        this.f235935l = aVar10;
        this.f235936m = aVar11;
        this.f235937n = aVar12;
        this.o = aVar13;
        this.f235938p = aVar14;
        this.f235939q = aVar15;
        this.f235940r = aVar16;
        this.f235941s = aVar17;
        this.f235942t = aVar18;
        this.u = aVar19;
        this.v = aVar20;
        this.f235943w = aVar21;
        this.f235944x = aVar22;
        this.f235945y = aVar23;
        this.z = aVar24;
        this.A = aVar25;
        this.B = aVar26;
        this.C = aVar27;
        this.D = aVar28;
        this.E = aVar29;
        this.F = aVar30;
        this.G = aVar31;
        this.H = aVar32;
        this.I = aVar33;
        this.J = aVar34;
        this.K = aVar35;
        this.L = aVar36;
        this.M = aVar37;
        this.N = aVar38;
        this.O = aVar39;
        this.V = aVar40;
        this.W = aVar41;
        this.X = aVar42;
        this.Y = aVar43;
        this.P = aVar44;
        this.Z = aVar45;
        this.Q = aVar46;
        this.R = aVar47;
        this.S = aVar48;
        this.T = aVar49;
        this.U = aVar50;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f235930b) {
            case 0:
                Context context = (Context) ((Function0) ((q) this.V).f124861b).invoke();
                izi.a aVar = (izi.a) ((phm.a) this.f235931c.f955b).get();
                sm1.d dVar = (sm1.d) ((phm.a) this.d.f955b).get();
                ctj.e eVar = (ctj.e) ((phm.a) this.e.f955b).get();
                l70.e eVar2 = (l70.e) ((phm.a) this.f.f955b).get();
                cri.b bVar = (cri.b) ((phm.a) this.f235932g.f955b).get();
                m41.c cVar = (m41.c) ((phm.a) this.f235933h.f955b).get();
                je6.g gVar = (je6.g) ((phm.a) this.i.f955b).get();
                ite.a aVar2 = (ite.a) ((phm.a) this.f235934j.f955b).get();
                y67.a aVar3 = (y67.a) ((phm.a) this.k.f955b).get();
                q8b.a aVar4 = (q8b.a) ((phm.a) this.f235935l.f955b).get();
                x9e.a aVar5 = (x9e.a) ((phm.a) this.f235936m.f955b).get();
                jhf.a aVar6 = (jhf.a) ((phm.a) this.f235937n.f955b).get();
                mlf.d dVar2 = (mlf.d) ((phm.a) this.o.f955b).get();
                djf.c cVar2 = (djf.c) ((phm.a) this.f235938p.f955b).get();
                fjf.a aVar7 = (fjf.a) ((phm.a) this.f235939q.f955b).get();
                okg.a aVar8 = (okg.a) ((phm.a) this.f235940r.f955b).get();
                vjf.a aVar9 = (vjf.a) ((phm.a) this.f235941s.f955b).get();
                ae9.b bVar2 = (ae9.b) ((phm.a) this.f235942t.f955b).get();
                usg.a aVar10 = (usg.a) ((phm.a) this.u.f955b).get();
                h9h.a aVar11 = (h9h.a) ((phm.a) this.v.f955b).get();
                yah.a aVar12 = (yah.a) ((phm.a) this.f235943w.f955b).get();
                e48.a aVar13 = (e48.a) ((phm.a) this.f235944x.f955b).get();
                r rVar = (r) ((phm.a) this.f235945y.f955b).get();
                pqi.a aVar14 = (pqi.a) ((phm.a) this.z.f955b).get();
                xmg.a aVar15 = (xmg.a) ((phm.a) this.A.f955b).get();
                r5a.c cVar3 = (r5a.c) ((phm.a) this.B.f955b).get();
                off.a aVar16 = (off.a) ((phm.a) this.C.f955b).get();
                l lVar = (l) ((phm.a) this.D.f955b).get();
                f7d.d dVar3 = (f7d.d) ((phm.a) this.E.f955b).get();
                ede.b bVar3 = (ede.b) ((phm.a) this.F.f955b).get();
                v7i.a aVar17 = (v7i.a) ((phm.a) this.G.f955b).get();
                t2j.a aVar18 = (t2j.a) ((phm.a) this.H.f955b).get();
                gg0.d dVar4 = (gg0.d) ((phm.a) this.I.f955b).get();
                vpa.b bVar4 = (vpa.b) ((phm.a) this.J.f955b).get();
                lpf.a aVar19 = (lpf.a) ((phm.a) this.K.f955b).get();
                ku5.g gVar2 = (ku5.g) ((phm.a) this.L.f955b).get();
                ei5.d dVar5 = (ei5.d) ((phm.a) this.M.f955b).get();
                ila.b bVar5 = (ila.b) ((phm.a) this.N.f955b).get();
                j jVar = (j) ((phm.a) this.O.f955b).get();
                w wVar = (w) ((phm.a) this.P.f955b).get();
                rb8.e eVar3 = (rb8.e) ((phm.a) this.Q.f955b).get();
                oda.d dVar6 = (oda.d) ((phm.a) this.R.f955b).get();
                zc6.b bVar6 = (zc6.b) ((phm.a) this.S.f955b).get();
                u5a.j jVar2 = (u5a.j) ((phm.a) this.T.f955b).get();
                efk.a aVar20 = (efk.a) ((phm.a) this.U.f955b).get();
                s sVar = (s) ((phm.a) ((a31.a) this.W).f955b).get();
                jmd.d dVar7 = (jmd.d) ((phm.a) ((a31.a) this.X).f955b).get();
                rkd.g gVar3 = (rkd.g) ((phm.a) ((a31.a) this.Y).f955b).get();
                i9l.a aVar21 = (i9l.a) ((phm.a) ((a31.a) this.Z).f955b).get();
                context.getClass();
                aVar.getClass();
                dVar.getClass();
                eVar.getClass();
                eVar2.getClass();
                bVar.getClass();
                cVar.getClass();
                gVar.getClass();
                aVar2.getClass();
                aVar3.getClass();
                aVar4.getClass();
                aVar5.getClass();
                aVar6.getClass();
                dVar2.getClass();
                cVar2.getClass();
                aVar7.getClass();
                aVar8.getClass();
                aVar9.getClass();
                bVar2.getClass();
                aVar10.getClass();
                aVar11.getClass();
                aVar12.getClass();
                aVar13.getClass();
                rVar.getClass();
                aVar14.getClass();
                aVar15.getClass();
                cVar3.getClass();
                aVar16.getClass();
                lVar.getClass();
                dVar3.getClass();
                bVar3.getClass();
                aVar17.getClass();
                aVar18.getClass();
                dVar4.getClass();
                bVar4.getClass();
                aVar19.getClass();
                gVar2.getClass();
                dVar5.getClass();
                bVar5.getClass();
                jVar.getClass();
                wVar.getClass();
                eVar3.getClass();
                dVar6.getClass();
                bVar6.getClass();
                jVar2.getClass();
                aVar20.getClass();
                sVar.getClass();
                dVar7.getClass();
                gVar3.getClass();
                aVar21.getClass();
                return new e(new xd9.a(), aVar, dVar, eVar, eVar2, bVar, cVar, gVar, aVar2, aVar3, aVar4, aVar5, aVar6, dVar2, cVar2, aVar7, aVar8, aVar9, bVar2, aVar10, aVar11, aVar12, aVar13, rVar, aVar14, aVar15, cVar3, aVar16, lVar, dVar3, bVar3, aVar17, aVar18, dVar4, bVar4, aVar19, gVar2, dVar5, bVar5, jVar, wVar, eVar3, dVar6, bVar6, jVar2, aVar20, sVar, dVar7, gVar3, aVar21);
            default:
                t2j.a aVar22 = (t2j.a) ((phm.a) this.f235931c.f955b).get();
                nv1.g gVar4 = (nv1.g) ((phm.a) this.d.f955b).get();
                zwh.c cVar4 = (zwh.c) ((phm.a) this.e.f955b).get();
                da3.j jVar3 = (da3.j) ((phm.a) this.f.f955b).get();
                mb3.i iVar = (mb3.i) ((phm.a) this.f235932g.f955b).get();
                vf3.a aVar23 = (vf3.a) ((phm.a) this.f235933h.f955b).get();
                jk3.c cVar5 = (jk3.c) ((phm.a) this.i.f955b).get();
                l70.e eVar4 = (l70.e) ((phm.a) this.f235934j.f955b).get();
                ee0.a aVar24 = (ee0.a) ((phm.a) this.k.f955b).get();
                nf0.a aVar25 = (nf0.a) ((phm.a) this.f235935l.f955b).get();
                nj0.a aVar26 = (nj0.a) ((phm.a) this.f235936m.f955b).get();
                g2j.f fVar = (g2j.f) ((phm.a) this.f235937n.f955b).get();
                c21.e eVar5 = (c21.e) ((phm.a) this.o.f955b).get();
                u06.c cVar6 = (u06.c) ((phm.a) this.f235938p.f955b).get();
                m41.c cVar7 = (m41.c) ((phm.a) this.f235939q.f955b).get();
                l89.b bVar7 = (l89.b) ((phm.a) this.f235940r.f955b).get();
                qth.g gVar5 = (qth.g) ((phm.a) this.f235941s.f955b).get();
                je6.g gVar6 = (je6.g) ((phm.a) this.f235942t.f955b).get();
                o3i.a aVar27 = (o3i.a) ((phm.a) this.u.f955b).get();
                n1 n1Var = (n1) ((phm.a) this.v.f955b).get();
                ite.a aVar28 = (ite.a) ((phm.a) this.f235943w.f955b).get();
                bpj.a aVar29 = (bpj.a) ((phm.a) this.f235944x.f955b).get();
                us6.q qVar = (us6.q) ((phm.a) this.f235945y.f955b).get();
                vs6.a aVar30 = (vs6.a) ((phm.a) this.z.f955b).get();
                p2k.a aVar31 = (p2k.a) ((phm.a) this.A.f955b).get();
                v2f.a aVar32 = (v2f.a) ((phm.a) this.B.f955b).get();
                c0 c0Var = (c0) ((phm.a) this.C.f955b).get();
                nt8.a aVar33 = (nt8.a) ((phm.a) this.D.f955b).get();
                r1 r1Var = (r1) ((phm.a) this.E.f955b).get();
                qye.b bVar8 = (qye.b) ((phm.a) this.F.f955b).get();
                v8k.a aVar34 = (v8k.a) ((phm.a) this.G.f955b).get();
                p8a.c cVar8 = (p8a.c) ((phm.a) this.H.f955b).get();
                oda.d dVar8 = (oda.d) ((phm.a) this.I.f955b).get();
                ika.f fVar2 = (ika.f) ((phm.a) this.J.f955b).get();
                npk.a aVar35 = (npk.a) ((phm.a) this.K.f955b).get();
                u uVar = (u) ((phm.a) this.L.f955b).get();
                nib.d dVar9 = (nib.d) ((phm.a) this.M.f955b).get();
                an0.c cVar9 = (an0.c) ((phm.a) this.N.f955b).get();
                co0.a aVar36 = (co0.a) ((phm.a) this.O.f955b).get();
                pve.a aVar37 = (pve.a) ((phm.a) this.V).get();
                a0 a0Var = (a0) ((phm.a) this.W).get();
                t tVar = (t) ((phm.a) this.X).get();
                ove.g gVar7 = (ove.g) ((phm.a) this.Y).get();
                qye.c cVar10 = (qye.c) ((phm.a) this.P.f955b).get();
                w wVar2 = (w) ((phm.a) this.Z).get();
                xmg.a aVar38 = (xmg.a) ((phm.a) this.Q.f955b).get();
                usg.a aVar39 = (usg.a) ((phm.a) this.R.f955b).get();
                u8h.c cVar11 = (u8h.c) ((phm.a) this.S.f955b).get();
                gvh.a aVar40 = (gvh.a) ((phm.a) this.T.f955b).get();
                q8b.a aVar41 = (q8b.a) ((phm.a) this.U.f955b).get();
                aVar22.getClass();
                gVar4.getClass();
                cVar4.getClass();
                jVar3.getClass();
                iVar.getClass();
                aVar23.getClass();
                cVar5.getClass();
                eVar4.getClass();
                aVar24.getClass();
                aVar25.getClass();
                aVar26.getClass();
                fVar.getClass();
                eVar5.getClass();
                cVar6.getClass();
                cVar7.getClass();
                bVar7.getClass();
                gVar5.getClass();
                gVar6.getClass();
                aVar27.getClass();
                n1Var.getClass();
                aVar28.getClass();
                aVar29.getClass();
                qVar.getClass();
                aVar30.getClass();
                aVar31.getClass();
                aVar32.getClass();
                c0Var.getClass();
                aVar33.getClass();
                r1Var.getClass();
                bVar8.getClass();
                aVar34.getClass();
                cVar8.getClass();
                dVar8.getClass();
                fVar2.getClass();
                aVar35.getClass();
                uVar.getClass();
                dVar9.getClass();
                cVar9.getClass();
                aVar36.getClass();
                aVar37.getClass();
                a0Var.getClass();
                tVar.getClass();
                gVar7.getClass();
                cVar10.getClass();
                wVar2.getClass();
                aVar38.getClass();
                aVar39.getClass();
                cVar11.getClass();
                aVar40.getClass();
                aVar41.getClass();
                return new k(new w0(), aVar22, gVar4, cVar4, jVar3, iVar, aVar23, cVar5, eVar4, aVar24, aVar25, aVar26, fVar, eVar5, cVar6, cVar7, bVar7, gVar6, aVar27, n1Var, aVar28, aVar29, qVar, aVar30, aVar31, aVar32, c0Var, aVar33, r1Var, bVar8, aVar34, cVar8, dVar8, fVar2, aVar35, uVar, dVar9, cVar9, aVar36, aVar37, a0Var, tVar, gVar7, cVar10, wVar2, aVar38, aVar39, cVar11, gVar5, aVar40, aVar41);
        }
    }

    public i(q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, a31.a aVar23, a31.a aVar24, a31.a aVar25, a31.a aVar26, a31.a aVar27, a31.a aVar28, a31.a aVar29, a31.a aVar30, a31.a aVar31, a31.a aVar32, a31.a aVar33, a31.a aVar34, a31.a aVar35, a31.a aVar36, a31.a aVar37, a31.a aVar38, a31.a aVar39, a31.a aVar40, a31.a aVar41, a31.a aVar42, a31.a aVar43, a31.a aVar44, a31.a aVar45, a31.a aVar46, a31.a aVar47, a31.a aVar48, a31.a aVar49) {
        this.V = qVar;
        this.f235931c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f235932g = aVar5;
        this.f235933h = aVar6;
        this.i = aVar7;
        this.f235934j = aVar8;
        this.k = aVar9;
        this.f235935l = aVar10;
        this.f235936m = aVar11;
        this.f235937n = aVar12;
        this.o = aVar13;
        this.f235938p = aVar14;
        this.f235939q = aVar15;
        this.f235940r = aVar16;
        this.f235941s = aVar17;
        this.f235942t = aVar18;
        this.u = aVar19;
        this.v = aVar20;
        this.f235943w = aVar21;
        this.f235944x = aVar22;
        this.f235945y = aVar23;
        this.z = aVar24;
        this.A = aVar25;
        this.B = aVar26;
        this.C = aVar27;
        this.D = aVar28;
        this.E = aVar29;
        this.F = aVar30;
        this.G = aVar31;
        this.H = aVar32;
        this.I = aVar33;
        this.J = aVar34;
        this.K = aVar35;
        this.L = aVar36;
        this.M = aVar37;
        this.N = aVar38;
        this.O = aVar39;
        this.P = aVar40;
        this.Q = aVar41;
        this.R = aVar42;
        this.S = aVar43;
        this.T = aVar44;
        this.U = aVar45;
        this.W = aVar46;
        this.X = aVar47;
        this.Y = aVar48;
        this.Z = aVar49;
    }
}
