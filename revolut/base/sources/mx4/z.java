package mx4;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit_resources.R$attr;
import dx4.g2;
import dx4.x1;
import ip0.ak0;
import ip0.xk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f210206a;

    public z(x contentListItemMapper) {
        Intrinsics.checkNotNullParameter(contentListItemMapper, "contentListItemMapper");
        this.f210206a = contentListItemMapper;
    }

    public final TextDelegate.Model a(String disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return new TextDelegate.Model("ID_CREDIT_DISCLAIMER", new HtmlClause(1, 28, (Integer) null, (Object) null, disclaimer), false, new ak0(null, null, 3), null, null, R$attr.uikit_dp16, 0, 0, 0, 1908);
    }

    public final ArrayList b(List contentItems, ax4.b constructorDomainState) {
        RandomAccess randomAccessU;
        Intrinsics.checkNotNullParameter(contentItems, "contentItems");
        Intrinsics.checkNotNullParameter(constructorDomainState, "constructorDomainState");
        List list = contentItems;
        ArrayList<koi.j> arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            zhm.a0.x(this.f210206a.b((dx4.e1) it8.next(), constructorDomainState), arrayList);
        }
        ArrayList<CounterTextDelegate.Model> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof CounterTextDelegate.Model) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.size() > 1) {
            CounterTextDelegate.Model model = (CounterTextDelegate.Model) zhm.d0.b0(arrayList2);
            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
            for (CounterTextDelegate.Model model2 : arrayList2) {
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                arrayList3.add(model2);
            }
            int i = arrayList.indexOf(model) == 0 ? R$attr.uikit_dp0 : R$attr.uikit_dp8;
            int i2 = R$attr.uikit_dp4;
            xk xkVar = new xk("ID_CREDIT_TILES", arrayList3, null, null, null, i, R$attr.uikit_dp8, i2, i2, 63612);
            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList, 10));
            for (Object obj3 : arrayList) {
                if (Intrinsics.f((koi.j) obj3, model)) {
                    obj3 = xkVar;
                }
                arrayList4.add(obj3);
            }
            arrayList = new ArrayList();
            for (Object obj4 : arrayList4) {
                if (!(((koi.j) obj4) instanceof CounterTextDelegate.Model)) {
                    arrayList.add(obj4);
                }
            }
        }
        Set set = constructorDomainState.f10857b;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list) {
            if (obj5 instanceof g2) {
                arrayList5.add(obj5);
            }
        }
        ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
        Iterator it9 = arrayList5.iterator();
        while (it9.hasNext()) {
            List list2 = ((g2) it9.next()).d;
            ArrayList arrayList7 = new ArrayList();
            for (Object obj6 : list2) {
                if (obj6 instanceof x1) {
                    arrayList7.add(obj6);
                }
            }
            ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
            Iterator it10 = arrayList7.iterator();
            while (it10.hasNext()) {
                arrayList8.add(((x1) it10.next()).f120827a);
            }
            arrayList6.add(arrayList8);
        }
        ArrayList arrayListU = zhm.w.u(arrayList6);
        ArrayList<List> arrayListN = zhm.v.n(new ArrayList());
        for (koi.j jVar : arrayList) {
            List list3 = (List) zhm.d0.m0(arrayListN);
            koi.j jVar2 = (koi.j) zhm.d0.o0(list3);
            boolean z = (jVar instanceof ExpandableCellDelegate.Model) && arrayListU.contains(((ExpandableCellDelegate.Model) jVar).f52256a);
            if (!list3.isEmpty()) {
                if (!Intrinsics.f(jVar2 != null ? jVar2.getClass() : null, jVar.getClass()) || !z) {
                    arrayListN.add(zhm.v.n(jVar));
                }
            }
            list3.add(jVar);
        }
        ArrayList<List> arrayList9 = new ArrayList(zhm.w.t(arrayListN, 10));
        for (List list4 : arrayListN) {
            ArrayList arrayList10 = new ArrayList();
            for (Object obj7 : list4) {
                if (obj7 instanceof ExpandableCellDelegate.Model) {
                    arrayList10.add(obj7);
                }
            }
            arrayList9.add(arrayList10);
        }
        ArrayList<List> arrayList11 = new ArrayList(zhm.w.t(arrayList9, 10));
        for (List<ExpandableCellDelegate.Model> list5 : arrayList9) {
            ArrayList arrayList12 = new ArrayList(zhm.w.t(list5, 10));
            for (ExpandableCellDelegate.Model model3 : list5) {
                arrayList12.add(set.contains(model3.f52256a) ? ExpandableCellDelegate.Model.e(model3, 4079) : ExpandableCellDelegate.Model.e(model3, 4095));
            }
            arrayList11.add(arrayList12);
        }
        ArrayList arrayList13 = new ArrayList(zhm.w.t(arrayList11, 10));
        for (List list6 : arrayList11) {
            Intrinsics.checkNotNullParameter(list6, "<this>");
            if (list6.isEmpty()) {
                randomAccessU = zhm.f0.f322471a;
            } else {
                List list7 = list6;
                ArrayList<ExpandableCellDelegate.Model> arrayList14 = new ArrayList(zhm.w.t(list7, 10));
                Iterator it11 = list7.iterator();
                while (it11.hasNext()) {
                    arrayList14.add(ExpandableCellDelegate.Model.e((ExpandableCellDelegate.Model) it11.next(), 4095));
                }
                ArrayList<List> arrayListN2 = zhm.v.n(new ArrayList());
                for (ExpandableCellDelegate.Model model4 : arrayList14) {
                    List list8 = (List) zhm.d0.m0(arrayListN2);
                    ExpandableCellDelegate.Model model5 = (ExpandableCellDelegate.Model) zhm.d0.o0(list8);
                    if (list8.isEmpty() || (!model4.e && (model5 == null || !model5.e))) {
                        list8.add(model4);
                    } else {
                        arrayListN2.add(zhm.v.n(model4));
                    }
                }
                ArrayList arrayList15 = new ArrayList(zhm.w.t(arrayListN2, 10));
                for (List list9 : arrayListN2) {
                    yp0.b.k(list9, 0, 0, 0, 0, 31);
                    arrayList15.add(list9);
                }
                randomAccessU = zhm.w.u(arrayList15);
            }
            arrayList13.add(randomAccessU);
        }
        ArrayList arrayListU2 = zhm.w.u(arrayList13);
        ArrayList arrayListF1 = zhm.d0.f1(arrayList);
        for (Object obj8 : arrayListU2) {
            Iterator it12 = arrayListF1.iterator();
            int i3 = 0;
            while (true) {
                if (!it12.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (Intrinsics.f(((koi.j) it12.next()).getF52256a(), ((koi.j) obj8).getF52256a())) {
                    break;
                }
                i3++;
            }
            if (i3 >= 0) {
                arrayListF1.set(i3, obj8);
            } else {
                arrayListF1.add(obj8);
            }
        }
        return arrayListF1;
    }
}
