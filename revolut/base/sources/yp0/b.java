package yp0;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.gu;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public abstract class b {
    public static final void a(ListSubheaderDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "<this>");
        ListSubheaderDelegate.INSTANCE.getClass();
        model.u = ListSubheaderDelegate.f52706h;
        model.v = ListSubheaderDelegate.i;
    }

    public static final void b(int i, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        qv0.n nVar = (qv0.n) zhm.d0.o0(list);
        if (nVar != null) {
            c(nVar, i);
        }
    }

    public static final void c(qv0.n nVar, int i) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        nVar.u(new sq0.b(i));
    }

    public static final ArrayList d(List list, ListSubheaderDelegate.Model subheader, e0 subheaderPosition, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(subheader, "subheader");
        Intrinsics.checkNotNullParameter(subheaderPosition, "subheaderPosition");
        int i6 = a.f315714a[subheaderPosition.ordinal()];
        if (i6 == 1) {
            ArrayList arrayList = new ArrayList();
            a(subheader);
            arrayList.add(subheader);
            f(list, R$attr.uikit_dp0, i2, i3, i5, false);
            zhm.a0.x(list, arrayList);
            return arrayList;
        }
        if (i6 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList2 = new ArrayList();
        ListSubheaderDelegate.INSTANCE.getClass();
        int i21 = ListSubheaderDelegate.i;
        subheader.u = i21;
        subheader.v = i21;
        arrayList2.add(subheader);
        zhm.a0.x(list, arrayList2);
        f(arrayList2, i, i2, i3, i5, false);
        return arrayList2;
    }

    public static final ArrayList e(List list, gu loadingSubheader, e0 loadingSubheaderPosition, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(loadingSubheader, "loadingSubheader");
        Intrinsics.checkNotNullParameter(loadingSubheaderPosition, "loadingSubheaderPosition");
        int i6 = a.f315714a[loadingSubheaderPosition.ordinal()];
        if (i6 == 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadingSubheader);
            f(list, R$attr.uikit_dp0, i2, i3, i5, false);
            zhm.a0.x(list, arrayList);
            return arrayList;
        }
        if (i6 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(loadingSubheader);
        zhm.a0.x(list, arrayList2);
        f(arrayList2, i, i2, i3, i5, false);
        return arrayList2;
    }

    public static final void f(List list, int i, int i2, int i3, int i5, boolean z) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            l((qv0.i) zhm.d0.b0(list), i, i2, i3, i5, null, z, 16);
            return;
        }
        if (list.size() > 1) {
            qv0.i iVar = (qv0.i) zhm.d0.b0(list);
            qv0.h hVar = qv0.h.EXTRA_LARGE;
            iVar.j(new c.f(hVar, z));
            qv0.i iVar2 = iVar;
            iVar2.l(new sq0.h(i3));
            iVar2.s(new sq0.m(i));
            iVar2.w(new sq0.l(i5));
            if (iVar2.getF53027h() instanceof sq0.j) {
                iVar2.u(null);
            }
            qv0.i iVar3 = (qv0.i) zhm.d0.m0(list);
            iVar3.j(new c.a(hVar));
            qv0.i iVar4 = iVar3;
            iVar4.l(new sq0.h(i3));
            if (iVar4.getK() instanceof sq0.j) {
                iVar4.s(null);
            }
            iVar4.w(new sq0.l(i5));
            iVar4.u(new sq0.b(i2));
            int iJ = zhm.v.j(list);
            for (int i6 = 1; i6 < iJ; i6++) {
                qv0.i iVar5 = (qv0.i) list.get(i6);
                iVar5.j(c.b.f249511a);
                qv0.i iVar6 = iVar5;
                iVar6.l(new sq0.h(i3));
                if (iVar6.getK() instanceof sq0.j) {
                    iVar6.s(null);
                }
                iVar6.w(new sq0.l(i5));
                if (iVar6.getF53027h() instanceof sq0.j) {
                    iVar6.u(null);
                }
            }
        }
    }

    public static /* synthetic */ ArrayList g(List list, ListSubheaderDelegate.Model model, e0 e0Var, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            e0Var = e0.OUTSIDE_BOX;
        }
        e0 e0Var2 = e0Var;
        if ((i3 & 4) != 0) {
            i = R$attr.uikit_dp8;
        }
        int i5 = i;
        if ((i3 & 8) != 0) {
            i2 = R$attr.uikit_dp8;
        }
        int i6 = R$attr.uikit_dp16;
        return d(list, model, e0Var2, i5, i2, i6, i6);
    }

    public static /* synthetic */ ArrayList h(List list, gu guVar, e0 e0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            e0Var = e0.OUTSIDE_BOX;
        }
        e0 e0Var2 = e0Var;
        int i3 = R$attr.uikit_dp8;
        int i5 = (i2 & 8) != 0 ? i3 : i;
        int i6 = R$attr.uikit_dp16;
        return e(list, guVar, e0Var2, i3, i5, i6, i6);
    }

    public static List i(qv0.i iVar, ListSubheaderDelegate.Model subheader, e0 subheaderPosition, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            subheaderPosition = e0.OUTSIDE_BOX;
        }
        if ((i3 & 4) != 0) {
            i = R$attr.uikit_dp8;
        }
        int i5 = i;
        if ((i3 & 8) != 0) {
            i2 = R$attr.uikit_dp8;
        }
        int i6 = i2;
        int i21 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(subheader, "subheader");
        Intrinsics.checkNotNullParameter(subheaderPosition, "subheaderPosition");
        int i22 = a.f315714a[subheaderPosition.ordinal()];
        if (i22 == 1) {
            a(subheader);
            l(iVar, R$attr.uikit_dp0, i6, i21, i21, null, false, 16);
            return zhm.v.k(subheader, iVar);
        }
        if (i22 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList = new ArrayList();
        ListSubheaderDelegate.INSTANCE.getClass();
        int i32 = ListSubheaderDelegate.i;
        subheader.u = i32;
        subheader.v = i32;
        arrayList.add(subheader);
        arrayList.add(iVar);
        f(arrayList, i5, i6, i21, i21, false);
        return arrayList;
    }

    public static List j(qv0.i iVar, gu loadingSubheader, e0 loadingSubheaderPosition, int i) {
        if ((i & 2) != 0) {
            loadingSubheaderPosition = e0.OUTSIDE_BOX;
        }
        int i2 = R$attr.uikit_dp8;
        int i3 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(loadingSubheader, "loadingSubheader");
        Intrinsics.checkNotNullParameter(loadingSubheaderPosition, "loadingSubheaderPosition");
        int i5 = a.f315714a[loadingSubheaderPosition.ordinal()];
        if (i5 == 1) {
            l(iVar, R$attr.uikit_dp0, i2, i3, i3, null, false, 16);
            return zhm.v.k(loadingSubheader, iVar);
        }
        if (i5 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(loadingSubheader);
        arrayList.add(iVar);
        f(arrayList, i2, i2, i3, i3, false);
        return arrayList;
    }

    public static /* synthetic */ void k(List list, int i, int i2, int i3, int i5, int i6) {
        if ((i6 & 1) != 0) {
            i = R$attr.uikit_dp8;
        }
        int i21 = i;
        if ((i6 & 2) != 0) {
            i2 = R$attr.uikit_dp8;
        }
        int i22 = i2;
        if ((i6 & 4) != 0) {
            i3 = R$attr.uikit_dp16;
        }
        int i32 = i3;
        if ((i6 & 8) != 0) {
            i5 = R$attr.uikit_dp16;
        }
        f(list, i21, i22, i32, i5, (i6 & 16) == 0);
    }

    public static void l(qv0.i iVar, int i, int i2, int i3, int i5, qv0.h cornerRadius, boolean z, int i6) {
        if ((i6 & 1) != 0) {
            i = R$attr.uikit_dp8;
        }
        if ((i6 & 2) != 0) {
            i2 = R$attr.uikit_dp8;
        }
        if ((i6 & 4) != 0) {
            i3 = R$attr.uikit_dp16;
        }
        if ((i6 & 8) != 0) {
            i5 = R$attr.uikit_dp16;
        }
        if ((i6 & 16) != 0) {
            cornerRadius = qv0.h.EXTRA_LARGE;
        }
        if ((i6 & 32) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        iVar.j(new c.e(cornerRadius, z));
        qv0.i iVar2 = iVar;
        iVar2.s(new sq0.m(i));
        iVar2.u(new sq0.b(i2));
        iVar2.l(new sq0.h(i3));
        iVar2.w(new sq0.l(i5));
    }

    public static void m(qv0.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        int i = R$attr.uikit_dp0;
        l(iVar, i, i, i, i, null, false, 16);
    }

    public static final void n(ArrayList arrayList, int i, int i2) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 < zhm.v.j(arrayList)) {
                ((qv0.n) arrayList.get(i3)).u(new sq0.a(i, i2));
            }
        }
    }

    public static final void o(int i, int i2, int i3, int i5, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            p((qv0.n) zhm.d0.b0(list), i, i2, i3, i5);
            return;
        }
        if (list.size() > 1) {
            qv0.n nVar = (qv0.n) zhm.d0.b0(list);
            qv0.i iVar = nVar instanceof qv0.i ? (qv0.i) nVar : null;
            c.d dVar = c.d.f249513a;
            if (iVar != null) {
                iVar.j(dVar);
            }
            nVar.l(new sq0.h(i3));
            nVar.s(new sq0.m(i));
            nVar.w(new sq0.l(i5));
            if (nVar.getF53027h() instanceof sq0.j) {
                nVar.u(null);
            }
            qv0.n nVar2 = (qv0.n) zhm.d0.m0(list);
            qv0.i iVar2 = nVar2 instanceof qv0.i ? (qv0.i) nVar2 : null;
            if (iVar2 != null) {
                iVar2.j(dVar);
            }
            nVar2.l(new sq0.h(i3));
            if (nVar2.getK() instanceof sq0.j) {
                nVar2.s(null);
            }
            nVar2.w(new sq0.l(i5));
            nVar2.u(new sq0.b(i2));
            int iJ = zhm.v.j(list);
            for (int i6 = 1; i6 < iJ; i6++) {
                qv0.n nVar3 = (qv0.n) list.get(i6);
                qv0.i iVar3 = nVar3 instanceof qv0.i ? (qv0.i) nVar3 : null;
                if (iVar3 != null) {
                    iVar3.j(dVar);
                }
                nVar3.l(new sq0.h(i3));
                if (nVar3.getK() instanceof sq0.j) {
                    nVar3.s(null);
                }
                nVar3.w(new sq0.l(i5));
                if (nVar3.getF53027h() instanceof sq0.j) {
                    nVar3.u(null);
                }
            }
        }
    }

    public static final void p(qv0.n nVar, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        qv0.i iVar = nVar instanceof qv0.i ? (qv0.i) nVar : null;
        if (iVar != null) {
            iVar.j(c.d.f249513a);
        }
        nVar.s(new sq0.m(i));
        nVar.u(new sq0.b(i2));
        nVar.l(new sq0.h(i3));
        nVar.w(new sq0.l(i5));
    }

    public static /* synthetic */ void q(List list, int i, int i2, int i3, int i5, int i6) {
        if ((i6 & 1) != 0) {
            i = R$attr.uikit_dp8;
        }
        if ((i6 & 2) != 0) {
            i2 = R$attr.uikit_dp8;
        }
        if ((i6 & 4) != 0) {
            i3 = R$attr.uikit_dp16;
        }
        if ((i6 & 8) != 0) {
            i5 = R$attr.uikit_dp16;
        }
        o(i, i2, i3, i5, list);
    }

    public static /* synthetic */ void r(qv0.n nVar, int i, int i2, int i3, int i5, int i6) {
        if ((i6 & 1) != 0) {
            i = R$attr.uikit_dp8;
        }
        if ((i6 & 2) != 0) {
            i2 = R$attr.uikit_dp8;
        }
        if ((i6 & 4) != 0) {
            i3 = R$attr.uikit_dp16;
        }
        if ((i6 & 8) != 0) {
            i5 = R$attr.uikit_dp16;
        }
        p(nVar, i, i2, i3, i5);
    }
}
