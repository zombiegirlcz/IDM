package ay2;

import e93.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o5l.u;
import o5l.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class r {
    public static final c93.e a(n10.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = q.e[bVar.ordinal()];
        if (i == 1) {
            return c93.e.VIRTUAL;
        }
        if (i == 2) {
            return c93.e.PHYSICAL;
        }
        if (i == 3) {
            return c93.e.DISPOSABLE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final o5l.i b(e93.f fVar) {
        o5l.k kVar;
        o5l.h hVar;
        o5l.j jVar;
        c93.j jVar2;
        c93.d dVar;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String title = fVar.getTitle();
        String str = fVar.c().f13615a;
        String strM = fVar.m();
        e93.m mVarD = fVar.d();
        o5l.p pVar = null;
        if (mVarD != null) {
            Intrinsics.checkNotNullParameter(mVarD, "<this>");
            kVar = new o5l.k(mVarD.f123880a, mVarD.f123881b);
        } else {
            kVar = null;
        }
        c93.j jVarP = fVar.p();
        Intrinsics.checkNotNullParameter(jVarP, "<this>");
        o5l.p pVar2 = new o5l.p(e(jVarP.f22288a), e(jVarP.f22289b));
        String strH = fVar.h();
        e93.b bVarB = fVar.b();
        Intrinsics.checkNotNullParameter(bVarB, "<this>");
        int i = q.f11053b[bVarB.ordinal()];
        if (i == 1) {
            hVar = o5l.h.VISA;
        } else if (i == 2) {
            hVar = o5l.h.MC;
        } else if (i == 3) {
            hVar = o5l.h.MAESTRO;
        } else if (i == 4) {
            hVar = o5l.h.MULTIBANCO;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            hVar = o5l.h.UNKNOWN;
        }
        boolean z = fVar instanceof e93.d;
        if (!z || (dVar = ((e93.d) fVar).k) == null) {
            jVar = null;
        } else {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            jVar = new o5l.j(dVar.f22271a, dVar.f22272b);
        }
        if (z && (jVar2 = ((e93.d) fVar).f123831l) != null) {
            Intrinsics.checkNotNullParameter(jVar2, "<this>");
            pVar = new o5l.p(e(jVar2.f22288a), e(jVar2.f22289b));
        }
        return new o5l.i(title, str, strM, hVar, kVar, pVar2, strH, jVar, pVar);
    }

    public static final n10.b c(c93.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i = q.d[eVar.ordinal()];
        if (i == 1) {
            return n10.b.VIRTUAL;
        }
        if (i == 2) {
            return n10.b.PHYSICAL;
        }
        if (i == 3) {
            return n10.b.DISPOSABLE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ArrayList d(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<e93.q> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (e93.q qVar : list2) {
            e93.p pVar = qVar.f123887a;
            Intrinsics.checkNotNullParameter(pVar, "<this>");
            String str = pVar.f123885a;
            List list3 = pVar.f123886b;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                arrayList2.add(b((e93.f) it8.next()));
            }
            arrayList.add(new o5l.n(new o5l.m(str, arrayList2), b(qVar.f123888b)));
        }
        return arrayList;
    }

    public static final o5l.r e(c93.l lVar) {
        ArrayList arrayList;
        u uVar;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        dj0.d dVar = lVar.f22290a;
        dj0.d dVar2 = lVar.f22291b;
        List list = lVar.f22292c;
        v vVar = null;
        if (list != null) {
            List<c93.m> list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            for (c93.m mVar : list2) {
                Intrinsics.checkNotNullParameter(mVar, "<this>");
                dj0.d dVar3 = mVar.f22293a;
                c93.o oVar = mVar.f22294b;
                Intrinsics.checkNotNullParameter(oVar, "<this>");
                switch (q.f11052a[oVar.ordinal()]) {
                    case 1:
                        uVar = u.VAT;
                        break;
                    case 2:
                        uVar = u.IGST;
                        break;
                    case 3:
                        uVar = u.CGST;
                        break;
                    case 4:
                        uVar = u.SGST;
                        break;
                    case 5:
                        uVar = u.GMF;
                        break;
                    case 6:
                        uVar = u.STAMP_DUTY;
                        break;
                    case 7:
                        uVar = u.UNKNOWN;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList.add(new o5l.s(dVar3, uVar));
            }
        } else {
            arrayList = null;
        }
        j0 j0Var = lVar.d;
        if (j0Var != null) {
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            vVar = new v(j0Var.f123876a, j0Var.f123877b, j0Var.f123878c);
        }
        return new o5l.r(dVar, dVar2, arrayList, vVar);
    }
}
