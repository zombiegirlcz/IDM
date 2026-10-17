package uda;

import com.revolut.feature.pockets.api.details_v2.domain.AccountDetailsQrCode;
import dda.b;
import dda.c;
import dda.e;
import dda.g;
import dda.h;
import dda.j;
import dda.k;
import dda.m;
import dda.n;
import dda.p;
import dda.q;
import dda.s;
import dda.t;
import dda.y;
import dda.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import v13.d;
import zda.b1;
import zda.d0;
import zda.e1;
import zda.f;
import zda.g0;
import zda.i;
import zda.j0;
import zda.l;
import zda.m0;
import zda.o;
import zda.p0;
import zda.r;
import zda.s0;
import zda.u;
import zda.v0;
import zda.x;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v17, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v26, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v18, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.util.ArrayList] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v3 java.lang.Object, still in use, count: 2, list:
          (r9v3 java.lang.Object) from 0x02a5: MOVE (r18v0 java.lang.Object) = (r9v3 java.lang.Object)
          (r9v3 java.lang.Object) from 0x0226: PHI (r9v5 java.lang.Object) = (r9v3 java.lang.Object), (r9v6 java.lang.Object) binds: [B:84:0x0215, B:95:0x0283] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static dda.a a(xda.u r27) {
        /*
            Method dump skipped, instruction units count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uda.a.a(xda.u):dda.a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.ArrayList] */
    public static dda.a b(o entity) {
        ArrayList arrayList;
        Iterator it8;
        Object eVar;
        n nVar;
        n nVar2;
        q oVar;
        String str;
        String str2;
        Iterator it9;
        t tVar;
        g gVar;
        ?? arrayList2;
        z zVar;
        b bVar;
        j jVar;
        c cVar;
        Intrinsics.checkNotNullParameter(entity, "entity");
        List list = entity.f321402a;
        ArrayList arrayList3 = new ArrayList();
        Iterator it10 = list.iterator();
        while (it10.hasNext()) {
            i iVar = (i) it10.next();
            String str3 = iVar.f321383a;
            j0 j0Var = iVar.f321389l;
            String str4 = iVar.f321385c;
            String str5 = iVar.f321384b;
            if (str3 != null) {
                xi0.b.Companion.getClass();
                xi0.b bVarA = xi0.a.a(str5);
                String str6 = iVar.d;
                String str7 = iVar.e;
                l lVar = iVar.f321386g;
                if (lVar != null) {
                    String str8 = lVar.f321396a;
                    List<r> list2 = lVar.f321397b;
                    ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                    for (r rVar : list2) {
                        String str9 = rVar.f321409a;
                        String str10 = rVar.f321410b;
                        String str11 = rVar.f321411c;
                        if (str11 == null) {
                            str11 = str10;
                        }
                        arrayList4.add(new h(str9, str10, str11));
                    }
                    gVar = new g(str8, arrayList4);
                } else {
                    gVar = null;
                }
                wi0.b.Companion.getClass();
                wi0.b bVarA2 = wi0.a.a(str4);
                e1 e1Var = iVar.f321387h;
                if (e1Var != null) {
                    String str12 = e1Var.f321372a;
                    List list3 = e1Var.f321373b;
                    ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
                    Iterator it11 = list3.iterator();
                    while (it11.hasNext()) {
                        arrayList5.add(d.E((b1) it11.next()));
                    }
                    zVar = new z(str12, arrayList5);
                } else {
                    List list4 = iVar.i;
                    if (list4 != null) {
                        List list5 = list4;
                        arrayList2 = new ArrayList(w.t(list5, 10));
                        Iterator it12 = list5.iterator();
                        while (it12.hasNext()) {
                            arrayList2.add(d.E((b1) it12.next()));
                        }
                    } else {
                        arrayList2 = f0.f322471a;
                    }
                    zVar = new z(null, arrayList2);
                }
                z zVar2 = zVar;
                f fVar = iVar.f321388j;
                if (fVar != null) {
                    String str13 = fVar.f321374a;
                    String str14 = fVar.f321375b;
                    zda.c cVar2 = fVar.f321376c;
                    if (cVar2 != null) {
                        it8 = it10;
                        cVar = new c(cVar2.f321364a, cVar2.f321365b);
                    } else {
                        it8 = it10;
                        cVar = null;
                    }
                    List list6 = fVar.d;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it13 = list6.iterator();
                    while (it13.hasNext()) {
                        dda.w wVarD = d.D((v0) it13.next());
                        if (wVarD != null) {
                            arrayList6.add(wVarD);
                        }
                    }
                    bVar = new b(str13, str14, cVar, arrayList6);
                } else {
                    it8 = it10;
                    bVar = null;
                }
                List list7 = iVar.k;
                ArrayList arrayList7 = new ArrayList(w.t(list7, 10));
                Iterator it14 = list7.iterator();
                while (it14.hasNext()) {
                    u uVar = (u) it14.next();
                    String str15 = uVar.f321417a;
                    j[] jVarArrValues = j.values();
                    Iterator it15 = it14;
                    int length = jVarArrValues.length;
                    String str16 = str3;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            jVar = null;
                            break;
                        }
                        jVar = jVarArrValues[i];
                        int i2 = length;
                        int i3 = i;
                        if (a0.z(jVar.name(), str15, true)) {
                            break;
                        }
                        i = i3 + 1;
                        length = i2;
                    }
                    if (jVar == null) {
                        jVar = j.UNKNOWN;
                    }
                    arrayList7.add(new AccountDetailsQrCode(jVar, uVar.f321418b));
                    it14 = it15;
                    str3 = str16;
                }
                eVar = new dda.d(str3, bVarA, str6, str7, bVarA2, iVar.f, gVar, zVar2, bVar, arrayList7);
            } else {
                it8 = it10;
                if (j0Var != null) {
                    xi0.b.Companion.getClass();
                    xi0.b bVarA3 = xi0.a.a(str5);
                    String str17 = iVar.d;
                    String str18 = iVar.e;
                    wi0.b.Companion.getClass();
                    wi0.b bVarA4 = wi0.a.a(str4);
                    String str19 = j0Var.f321391a;
                    String str20 = j0Var.f321392b;
                    String str21 = j0Var.f321393c;
                    List list8 = j0Var.d;
                    ArrayList arrayList8 = new ArrayList(w.t(list8, 10));
                    Iterator it16 = list8.iterator();
                    while (it16.hasNext()) {
                        m0 m0Var = (m0) it16.next();
                        String str22 = m0Var.f321399a;
                        s0 s0Var = m0Var.f321400b;
                        String str23 = str19;
                        if (s0Var != null) {
                            String str24 = s0Var.f321414a;
                            List list9 = s0Var.f321415b;
                            str = str20;
                            str2 = str21;
                            it9 = it16;
                            ArrayList arrayList9 = new ArrayList(w.t(list9, 10));
                            for (Iterator it17 = list9.iterator(); it17.hasNext(); it17 = it17) {
                                p0 p0Var = (p0) it17.next();
                                arrayList9.add(new s(p0Var.f321406a, p0Var.f321407b));
                            }
                            tVar = new t(str24, arrayList9);
                        } else {
                            str = str20;
                            str2 = str21;
                            it9 = it16;
                            tVar = null;
                        }
                        arrayList8.add(new dda.r(str22, tVar));
                        it16 = it9;
                        str19 = str23;
                        str20 = str;
                        str21 = str2;
                    }
                    String str25 = str19;
                    String str26 = str20;
                    String str27 = str21;
                    g0 g0Var = j0Var.e;
                    if (g0Var != null) {
                        Map map = g0Var.f321379b;
                        if (map != null) {
                            oVar = new p(map);
                        } else {
                            String str28 = g0Var.f321380c;
                            if (str28 != null) {
                                oVar = new dda.o(str28);
                            } else {
                                r6.b.D("EmptyStateButton must have either workflow parameters or deeplink");
                                nVar2 = null;
                                nVar = nVar2;
                            }
                        }
                        nVar2 = new n(g0Var.f321378a, oVar);
                        nVar = nVar2;
                    } else {
                        nVar = null;
                    }
                    eVar = new e(bVarA3, str17, str18, bVarA4, new m(str25, str26, str27, arrayList8, nVar));
                } else {
                    eVar = null;
                }
            }
            if (eVar != null) {
                arrayList3.add(eVar);
            }
            it10 = it8;
        }
        x xVar = entity.f321403b;
        wi0.a aVar = wi0.b.Companion;
        String str29 = xVar.f321424a;
        aVar.getClass();
        wi0.b bVarA5 = wi0.a.a(str29);
        wi0.b bVarA6 = wi0.a.a(xVar.f321425b);
        List list10 = xVar.f321426c;
        ArrayList arrayList10 = new ArrayList(w.t(list10, 10));
        Iterator it18 = list10.iterator();
        while (it18.hasNext()) {
            arrayList10.add(wi0.a.a((String) it18.next()));
        }
        List list11 = xVar.d;
        wi0.a aVar2 = wi0.b.Companion;
        ArrayList arrayList11 = new ArrayList(w.t(list11, 10));
        Iterator it19 = list11.iterator();
        while (it19.hasNext()) {
            kii.e.B(aVar2, (String) it19.next(), arrayList11);
        }
        k kVar = new k(bVarA5, bVarA6, arrayList10, arrayList11);
        String str30 = entity.f321404c;
        String str31 = entity.d;
        List list12 = entity.e;
        if (list12 != null) {
            List<d0> list13 = list12;
            ArrayList arrayList12 = new ArrayList(w.t(list13, 10));
            for (d0 d0Var : list13) {
                arrayList12.add(new dda.l(d0Var.f321368a, d0Var.f321369b));
            }
            arrayList = arrayList12;
        } else {
            arrayList = null;
        }
        return new dda.a(arrayList3, kVar, str30, str31, arrayList);
    }

    public static o c(dda.a accountDetails) {
        ArrayList arrayList;
        Iterator it8;
        g0 g0Var;
        i iVar;
        String str;
        String str2;
        String str3;
        s0 s0Var;
        l lVar;
        f fVar;
        Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
        ArrayList arrayList2 = accountDetails.f113159a;
        int i = 10;
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            dda.f fVar2 = (dda.f) it9.next();
            if (fVar2 instanceof dda.d) {
                dda.d dVar = (dda.d) fVar2;
                String str4 = dVar.f113167a;
                String str5 = dVar.f113168b.f306286a;
                String str6 = dVar.e.f297794a;
                String str7 = dVar.f113169c;
                String str8 = dVar.d;
                g gVar = dVar.f113170g;
                if (gVar != null) {
                    String str9 = gVar.f113176a;
                    ArrayList<h> arrayList4 = gVar.f113177b;
                    ArrayList arrayList5 = new ArrayList(w.t(arrayList4, i));
                    for (h hVar : arrayList4) {
                        arrayList5.add(new r(hVar.f113178a, hVar.f113179b, hVar.f113180c));
                    }
                    lVar = new l(str9, arrayList5);
                } else {
                    lVar = null;
                }
                z zVar = dVar.f113171h;
                String str10 = zVar.f113209a;
                List list = zVar.f113210b;
                ArrayList arrayList6 = new ArrayList(w.t(list, 10));
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    y yVar = (y) it10.next();
                    String str11 = yVar.f113206a;
                    String str12 = yVar.f113207b;
                    Iterator it11 = it9;
                    String str13 = yVar.f113208c;
                    List list2 = yVar.d;
                    Iterator it12 = it10;
                    String str14 = str4;
                    String str15 = str5;
                    ArrayList arrayList7 = new ArrayList(w.t(list2, 10));
                    Iterator it13 = list2.iterator();
                    while (it13.hasNext()) {
                        arrayList7.add(d.Y((dda.w) it13.next()));
                    }
                    arrayList6.add(new b1(str11, str12, str13, arrayList7));
                    it10 = it12;
                    it9 = it11;
                    str4 = str14;
                    str5 = str15;
                }
                it8 = it9;
                String str16 = str4;
                String str17 = str5;
                e1 e1Var = new e1(str10, arrayList6);
                b bVar = dVar.i;
                if (bVar != null) {
                    String str18 = bVar.f113162a;
                    String str19 = bVar.f113163b;
                    c cVar = bVar.f113164c;
                    zda.c cVar2 = cVar != null ? new zda.c(cVar.f113165a, cVar.f113166b) : null;
                    List list3 = bVar.d;
                    ArrayList arrayList8 = new ArrayList(w.t(list3, 10));
                    Iterator it14 = list3.iterator();
                    while (it14.hasNext()) {
                        arrayList8.add(d.Y((dda.w) it14.next()));
                    }
                    fVar = new f(str18, str19, cVar2, arrayList8);
                } else {
                    fVar = null;
                }
                List<AccountDetailsQrCode> list4 = dVar.f113172j;
                ArrayList arrayList9 = new ArrayList(w.t(list4, 10));
                for (AccountDetailsQrCode accountDetailsQrCode : list4) {
                    arrayList9.add(new u(accountDetailsQrCode.f80767a.b(), accountDetailsQrCode.f80768b));
                }
                iVar = new i(str16, str17, str6, str7, str8, dVar.f, lVar, e1Var, fVar, arrayList9, null);
            } else {
                it8 = it9;
                if (!(fVar2 instanceof e)) {
                    throw new NoWhenBranchMatchedException();
                }
                e eVar = (e) fVar2;
                String str20 = eVar.f113173a.f306286a;
                String str21 = eVar.d.f297794a;
                String str22 = eVar.f113174b;
                String str23 = eVar.f113175c;
                m mVar = eVar.e;
                String str24 = mVar.f113186a;
                String str25 = mVar.f113187b;
                String str26 = mVar.f113188c;
                List<dda.r> list5 = mVar.d;
                ArrayList arrayList10 = new ArrayList(w.t(list5, 10));
                for (dda.r rVar : list5) {
                    String str27 = rVar.f113193a;
                    t tVar = rVar.f113194b;
                    if (tVar != null) {
                        String str28 = tVar.f113197a;
                        ArrayList arrayList11 = tVar.f113198b;
                        str = str20;
                        str2 = str21;
                        str3 = str22;
                        ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                        for (Iterator it15 = arrayList11.iterator(); it15.hasNext(); it15 = it15) {
                            s sVar = (s) it15.next();
                            arrayList12.add(new p0(sVar.f113195a, sVar.f113196b));
                        }
                        s0Var = new s0(str28, arrayList12);
                    } else {
                        str = str20;
                        str2 = str21;
                        str3 = str22;
                        s0Var = null;
                    }
                    arrayList10.add(new m0(str27, s0Var));
                    str20 = str;
                    str21 = str2;
                    str22 = str3;
                }
                String str29 = str20;
                String str30 = str21;
                String str31 = str22;
                n nVar = mVar.e;
                if (nVar != null) {
                    String str32 = nVar.f113189a;
                    q qVar = nVar.f113190b;
                    p pVar = qVar instanceof p ? (p) qVar : null;
                    Map map = pVar != null ? pVar.f113192a : null;
                    dda.o oVar = qVar instanceof dda.o ? (dda.o) qVar : null;
                    g0Var = new g0(str32, oVar != null ? oVar.f113191a : null, map);
                } else {
                    g0Var = null;
                }
                iVar = new i(null, str29, str30, str31, str23, null, null, null, null, f0.f322471a, new j0(str24, str25, str26, arrayList10, g0Var));
            }
            arrayList3.add(iVar);
            it9 = it8;
            i = 10;
        }
        k kVar = accountDetails.f113160b;
        String str33 = kVar.f113181a.f297794a;
        String str34 = kVar.f113182b.f297794a;
        ArrayList arrayList13 = kVar.f113183c;
        ArrayList arrayList14 = new ArrayList(w.t(arrayList13, 10));
        Iterator it16 = arrayList13.iterator();
        while (it16.hasNext()) {
            arrayList14.add(((wi0.b) it16.next()).f297794a);
        }
        List list6 = kVar.d;
        ArrayList arrayList15 = new ArrayList(w.t(list6, 10));
        Iterator it17 = list6.iterator();
        while (it17.hasNext()) {
            arrayList15.add(((wi0.b) it17.next()).f297794a);
        }
        x xVar = new x(str33, str34, arrayList14, arrayList15);
        String str35 = accountDetails.f113161c;
        String str36 = accountDetails.d;
        List list7 = accountDetails.e;
        if (list7 != null) {
            List<dda.l> list8 = list7;
            ArrayList arrayList16 = new ArrayList(w.t(list8, 10));
            for (dda.l lVar2 : list8) {
                arrayList16.add(new d0(lVar2.f113184a, lVar2.f113185b));
            }
            arrayList = arrayList16;
        } else {
            arrayList = null;
        }
        return new o(arrayList3, xVar, str35, str36, arrayList);
    }
}
