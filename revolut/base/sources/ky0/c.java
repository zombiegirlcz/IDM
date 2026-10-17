package ky0;

import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.u;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.c0;
import ip0.yl;
import ip0.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import mx0.l;
import my0.e;
import my0.f;
import my0.g;
import my0.h;
import my0.i;
import my0.j;
import my0.k;
import qv0.o;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public interface c {
    static ArrayList a(c cVar, d widgetId, Function1 fabricatorMethod) {
        o model;
        int i;
        l lVar;
        int i2 = R$attr.uikit_dp8;
        e eVar = (e) cVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(fabricatorMethod, "fabricatorMethod");
        my0.c cVar2 = new my0.c();
        fabricatorMethod.invoke(cVar2);
        ArrayList arrayList = new ArrayList();
        my0.b bVar = eVar.f210285a;
        k kVar = cVar2.f210283c;
        Object zVar = null;
        if (kVar == null) {
            model = null;
        } else if (kVar.equals(k.a.f210294a)) {
            bVar.getClass();
            model = new yl(my0.b.a(widgetId, "ID_MONEY_HEADER"), 0, 30);
        } else {
            if (!(kVar instanceof my0.l)) {
                throw new NoWhenBranchMatchedException();
            }
            HeaderDelegate.a.b bVar2 = new HeaderDelegate.a.b(true, true, true, false);
            bVar.getClass();
            my0.l lVar2 = (my0.l) kVar;
            model = new HeaderDelegate.Model(my0.b.a(widgetId, "ID_MONEY_HEADER"), lVar2.f210296b, lVar2.f210295a, null, lVar2.f210297c, null, cVar2.f210282b, bVar2, null, null, null, 123096);
            Intrinsics.checkNotNullParameter(model, "<this>");
        }
        if (model != null) {
            arrayList.add(model);
        }
        bVar.getClass();
        String strA = my0.b.a(widgetId, "ID_ACTIONS");
        g gVar = cVar2.f210281a;
        if (gVar == null) {
            i = i2;
        } else if (gVar instanceof g.a) {
            g.a aVar = (g.a) gVar;
            i = i2;
            zVar = new c0(strA, new u.a(aVar.f210289a, aVar.f210290b), 0, 0, 60);
        } else {
            if (!(gVar instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            i iVar = (i) gVar;
            j jVar = iVar.f210293b;
            h hVar = iVar.f210292a;
            List<List> list = hVar.f210291a;
            int i3 = 10;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            for (List<f> list2 : list) {
                ArrayList arrayList3 = new ArrayList(w.t(list2, i3));
                for (f fVar : list2) {
                    String str = fVar.f210286a;
                    boolean z = fVar.e;
                    ArrayList arrayList4 = arrayList2;
                    ArrayList arrayList5 = arrayList3;
                    arrayList5.add(new ActionsView.Item(str, !fVar.f ? mx0.d.SEMIACCENT : mx0.d.ACCENT, false, fVar.d ? z ? e4.EnabledClickable : e4.EnabledNonClickable : z ? e4.DisabledClickable : e4.DisabledNonClickable, null, fVar.f210287b, fVar.f210288c, null, str, null, null, 14996));
                    arrayList3 = arrayList5;
                    arrayList2 = arrayList4;
                    i3 = 10;
                    i2 = i2;
                }
                arrayList2.add(arrayList3);
                i2 = i2;
            }
            i = i2;
            ArrayList arrayList6 = arrayList2;
            int i5 = my0.d.f210284a[jVar.ordinal()];
            if (i5 == 1) {
                lVar = l.DYNAMIC_CIRCLE_ACTIONS;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                lVar = l.NON_SCROLLABLE;
            }
            l lVar3 = lVar;
            Iterator it8 = hVar.f210291a.iterator();
            while (it8.hasNext()) {
                ((List) it8.next()).size();
            }
            j jVar2 = j.NON_SCROLLABLE;
            zVar = new z(strA, arrayList6, null, lVar3, false, false, 0, R$attr.uikit_dp16, 0, null, 61396);
        }
        if (zVar != null) {
            arrayList.add(zVar);
        }
        yp0.b.k(arrayList, 0, i, 0, 0, 29);
        return arrayList;
    }
}
