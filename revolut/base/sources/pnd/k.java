package pnd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$plurals;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.retail.feature.api.AnalyticsAccount;
import ip0.qd0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nnd.c1;
import nnd.w0;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f237700a;

    public k(c accountMapper) {
        Intrinsics.checkNotNullParameter(accountMapper, "accountMapper");
        this.f237700a = accountMapper;
    }

    /* JADX WARN: Type inference failed for: r15v8, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    public final List a(nnd.j selection) throws Throwable {
        Throwable th10;
        Object next;
        ArrayList arrayList;
        List listC;
        Object next2;
        ArrayList arrayList2;
        List listC2;
        int i;
        ArrayList arrayList3;
        TextLocalisedClause textLocalisedClause;
        ArrayList arrayList4;
        TextLocalisedClause textLocalisedClause2;
        int i2;
        List listC3;
        List list;
        Object next3;
        Iterator it8;
        ArrayList arrayList5;
        Iterable iterableC;
        Iterable iterable;
        Object next4;
        char c2;
        List listC4;
        Object obj2;
        List listC5;
        Object obj3;
        List listC6;
        Intrinsics.checkNotNullParameter(selection, "selection");
        nnd.l lVar = selection.f;
        Set set = selection.f217562c;
        List list2 = selection.d;
        Set set2 = selection.e;
        int i3 = g.f237699a[lVar.ordinal()];
        char c3 = 3;
        char c5 = 2;
        c cVar = this.f237700a;
        boolean z = true;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                List listP0 = d0.P0(list2, new j());
                List list3 = listP0;
                Iterator it9 = list3.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    Object next5 = it9.next();
                    if (((c1) next5).a() instanceof AnalyticsAccount.Pro.All) {
                        obj3 = next5;
                        break;
                    }
                }
                c1 c1Var = (c1) obj3;
                if (c1Var == null) {
                    return f0.f322471a;
                }
                boolean zContains = set2.contains(new nnd.d(c1Var.a()));
                qv0.l header = cVar.b(c1Var, selection, listP0);
                if (zContains) {
                    ArrayList arrayListA0 = d0.A0(list3, c1Var);
                    ArrayList arrayList6 = new ArrayList(w.t(arrayListA0, 10));
                    Iterator it10 = arrayListA0.iterator();
                    while (it10.hasNext()) {
                        arrayList6.add(cVar.b((c1) it10.next(), selection, listP0));
                    }
                    listC6 = i26.l.e(header, arrayList6);
                } else {
                    Intrinsics.checkNotNullParameter(header, "header");
                    listC6 = u.c(header);
                }
                List list4 = listC6;
                yp0.b.k(list4, 0, 0, 0, 0, 31);
                return list4;
            }
            Iterator it11 = list2.iterator();
            while (true) {
                if (!it11.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it11.next();
                if (((c1) next4).a() instanceof AnalyticsAccount.Savings.PersonalAll) {
                    break;
                }
            }
            c1 c1Var2 = (c1) next4;
            if (c1Var2 == null) {
                listC4 = f0.f322471a;
                c2 = 0;
            } else {
                boolean zContains2 = set2.contains(new nnd.d(c1Var2.a()));
                qv0.l header2 = cVar.b(c1Var2, selection, list2);
                if (zContains2) {
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj4 : list2) {
                        if (((c1) obj4).a() instanceof AnalyticsAccount.Savings.PersonalIndividual) {
                            arrayList7.add(obj4);
                        }
                    }
                    c2 = 0;
                    ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                    Iterator it12 = arrayList7.iterator();
                    while (it12.hasNext()) {
                        arrayList8.add(cVar.b((c1) it12.next(), selection, list2));
                    }
                    listC4 = i26.l.e(header2, arrayList8);
                } else {
                    c2 = 0;
                    Intrinsics.checkNotNullParameter(header2, "header");
                    listC4 = u.c(header2);
                }
            }
            Iterator it13 = list2.iterator();
            while (true) {
                if (!it13.hasNext()) {
                    obj2 = null;
                    break;
                }
                Object next6 = it13.next();
                if (((c1) next6).a() instanceof AnalyticsAccount.Savings.JointAll) {
                    obj2 = next6;
                    break;
                }
            }
            c1 c1Var3 = (c1) obj2;
            if (c1Var3 == null) {
                listC5 = f0.f322471a;
            } else {
                boolean zContains3 = set2.contains(new nnd.d(c1Var3.a()));
                qv0.l header3 = cVar.b(c1Var3, selection, list2);
                if (zContains3) {
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj5 : list2) {
                        if (((c1) obj5).a() instanceof AnalyticsAccount.Savings.JointIndividual) {
                            arrayList9.add(obj5);
                        }
                    }
                    ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                    Iterator it14 = arrayList9.iterator();
                    while (it14.hasNext()) {
                        arrayList10.add(cVar.b((c1) it14.next(), selection, list2));
                    }
                    listC5 = i26.l.e(header3, arrayList10);
                } else {
                    Intrinsics.checkNotNullParameter(header3, "header");
                    listC5 = u.c(header3);
                }
            }
            ArrayList arrayList11 = new ArrayList();
            for (Object obj6 : list2) {
                if (((c1) obj6).a() instanceof AnalyticsAccount.Savings.JuniorSaving) {
                    arrayList11.add(obj6);
                }
            }
            ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
            Iterator it15 = arrayList11.iterator();
            while (it15.hasNext()) {
                arrayList12.add(cVar.b((c1) it15.next(), selection, list2));
            }
            List[] listArr = new List[3];
            listArr[c2] = listC4;
            listArr[1] = listC5;
            listArr[2] = arrayList12;
            ArrayList arrayListU = w.u(v.k(listArr));
            yp0.b.k(arrayListU, 0, 0, 0, 0, 31);
            return arrayListU;
        }
        ArrayList arrayList13 = new ArrayList();
        for (Object obj7 : list2) {
            if (((c1) obj7).a() instanceof AnalyticsAccount.Personal) {
                arrayList13.add(obj7);
            }
        }
        ArrayList arrayList14 = new ArrayList();
        for (Object obj8 : list2) {
            char c6 = c3;
            if (((c1) obj8).a() instanceof AnalyticsAccount.Joint) {
                arrayList14.add(obj8);
            }
            c3 = c6;
        }
        char c7 = c3;
        ArrayList arrayList15 = new ArrayList();
        for (Object obj9 : list2) {
            char c16 = c5;
            if (obj9 instanceof w0) {
                arrayList15.add(obj9);
            }
            c5 = c16;
        }
        char c26 = c5;
        ArrayList arrayList16 = new ArrayList();
        for (Object obj10 : list2) {
            boolean z3 = z;
            if (((c1) obj10).a() instanceof AnalyticsAccount.Junior) {
                arrayList16.add(obj10);
            }
            z = z3;
        }
        boolean z4 = z;
        List listP02 = d0.P0(arrayList13, new i());
        List list5 = listP02;
        Iterator it16 = list5.iterator();
        while (true) {
            if (!it16.hasNext()) {
                th10 = null;
                next = null;
                break;
            }
            next = it16.next();
            th10 = null;
            if (((c1) next).a() instanceof AnalyticsAccount.Personal.All) {
                break;
            }
        }
        c1 c1Var4 = (c1) next;
        if (c1Var4 == null) {
            listC = f0.f322471a;
            arrayList = arrayList13;
        } else {
            boolean zContains4 = set2.contains(new nnd.d(c1Var4.a()));
            qv0.l header4 = cVar.b(c1Var4, selection, listP02);
            if (zContains4) {
                ArrayList arrayListA02 = d0.A0(list5, c1Var4);
                arrayList = arrayList13;
                ArrayList arrayList17 = new ArrayList(w.t(arrayListA02, 10));
                Iterator it17 = arrayListA02.iterator();
                while (it17.hasNext()) {
                    arrayList17.add(cVar.b((c1) it17.next(), selection, listP02));
                }
                listC = i26.l.e(header4, arrayList17);
            } else {
                arrayList = arrayList13;
                Intrinsics.checkNotNullParameter(header4, "header");
                listC = u.c(header4);
            }
        }
        List listP03 = d0.P0(arrayList14, new h());
        List list6 = listP03;
        Iterator it18 = list6.iterator();
        while (true) {
            if (!it18.hasNext()) {
                next2 = th10;
                break;
            }
            next2 = it18.next();
            if (((c1) next2).a() instanceof AnalyticsAccount.Joint.All) {
                break;
            }
        }
        c1 c1Var5 = (c1) next2;
        if (c1Var5 == null) {
            listC2 = f0.f322471a;
            arrayList2 = arrayList14;
        } else {
            boolean zContains5 = set2.contains(new nnd.d(c1Var5.a()));
            qv0.l header5 = cVar.b(c1Var5, selection, listP03);
            if (zContains5) {
                ArrayList arrayListA03 = d0.A0(list6, c1Var5);
                arrayList2 = arrayList14;
                ArrayList arrayList18 = new ArrayList(w.t(arrayListA03, 10));
                Iterator it19 = arrayListA03.iterator();
                while (it19.hasNext()) {
                    arrayList18.add(cVar.b((c1) it19.next(), selection, listP03));
                }
                listC2 = i26.l.e(header5, arrayList18);
            } else {
                arrayList2 = arrayList14;
                Intrinsics.checkNotNullParameter(header5, "header");
                listC2 = u.c(header5);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj11 : arrayList16) {
            AnalyticsAccount analyticsAccountA = ((c1) obj11).a();
            Intrinsics.i(analyticsAccountA, "null cannot be cast to non-null type com.revolut.retail.feature.api.AnalyticsAccount.Junior");
            String f99186a = ((AnalyticsAccount.Junior) analyticsAccountA).getF99186a();
            Object objO = linkedHashMap.get(f99186a);
            if (objO == null) {
                objO = v0.a.o(linkedHashMap, f99186a);
            }
            ((List) objO).add(obj11);
        }
        ArrayList arrayList19 = new ArrayList();
        Iterator it20 = linkedHashMap.entrySet().iterator();
        while (it20.hasNext()) {
            List list7 = (List) ((Map.Entry) it20.next()).getValue();
            List list8 = list7;
            Iterator it21 = list8.iterator();
            while (true) {
                if (!it21.hasNext()) {
                    list = listC2;
                    next3 = th10;
                    break;
                }
                next3 = it21.next();
                list = listC2;
                if (((c1) next3).a() instanceof AnalyticsAccount.Junior.All) {
                    break;
                }
                listC2 = list;
            }
            c1 c1Var6 = (c1) next3;
            if (c1Var6 == null) {
                iterable = f0.f322471a;
                it8 = it20;
                arrayList5 = arrayList16;
            } else {
                it8 = it20;
                boolean zContains6 = set2.contains(new nnd.d(c1Var6.a()));
                qv0.l header6 = cVar.b(c1Var6, selection, list7);
                if (zContains6) {
                    ArrayList arrayListA04 = d0.A0(list8, c1Var6);
                    arrayList5 = arrayList16;
                    ArrayList arrayList20 = new ArrayList(w.t(arrayListA04, 10));
                    Iterator it22 = arrayListA04.iterator();
                    while (it22.hasNext()) {
                        arrayList20.add(cVar.b((c1) it22.next(), selection, list7));
                    }
                    iterableC = i26.l.e(header6, arrayList20);
                } else {
                    arrayList5 = arrayList16;
                    Intrinsics.checkNotNullParameter(header6, "header");
                    iterableC = u.c(header6);
                }
                iterable = iterableC;
            }
            a0.x(iterable, arrayList19);
            it20 = it8;
            arrayList16 = arrayList5;
            listC2 = list;
        }
        List list9 = listC2;
        List listB0 = d0.B0(d0.B0(d0.B0(d0.B0(list2, d0.i1(arrayList)), d0.i1(arrayList2)), d0.i1(arrayList16)), d0.i1(arrayList15));
        List list10 = listB0;
        ArrayList arrayList21 = new ArrayList(w.t(list10, 10));
        Iterator it23 = list10.iterator();
        while (it23.hasNext()) {
            arrayList21.add(cVar.b((c1) it23.next(), selection, listB0));
        }
        if (arrayList15.isEmpty()) {
            listC3 = f0.f322471a;
            arrayList3 = arrayList21;
            arrayList4 = arrayList19;
        } else {
            if (arrayList15.isEmpty()) {
                i = 0;
            } else {
                Iterator it24 = arrayList15.iterator();
                i = 0;
                while (it24.hasNext()) {
                    if (set.contains(((w0) it24.next()).f217602a) && (i = i + 1) < 0) {
                        v.r();
                        throw th10;
                    }
                }
            }
            nnd.g gVar = new nnd.g(d0.i1(arrayList15));
            ?? r152 = th10;
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.analytics_account_picker_linked, r152, r152, 14);
            TextLocalisedQuantityClause textLocalisedQuantityClause = i > 0 ? new TextLocalisedQuantityClause(R$plurals.analytics_dashboard_account_multi_accounts, Integer.valueOf(i), u.c(Integer.valueOf(i)), (Style) null, 24) : null;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_link, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62);
            nnd.e eVar = nnd.e.f217542a;
            boolean zContains7 = set2.contains(eVar);
            ResourceImage resourceImage = new ResourceImage(zContains7 ? R$drawable.uikit_icn_24_chevron_up : R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
            if (zContains7) {
                arrayList3 = arrayList21;
                textLocalisedClause = textLocalisedClause3;
                arrayList4 = arrayList19;
                textLocalisedClause2 = new TextLocalisedClause(R$string.analytics_account_picker_accessibility_collapse, null, null, 14);
            } else {
                arrayList3 = arrayList21;
                textLocalisedClause = textLocalisedClause3;
                arrayList4 = arrayList19;
                textLocalisedClause2 = new TextLocalisedClause(R$string.analytics_account_picker_accessibility_expand, null, null, 14);
            }
            RowDelegate.Model model = new RowDelegate.Model("LINKED_ACCOUNTS_ID", image40, textLocalisedClause, null, 0, textLocalisedQuantityClause, null, null, 0, new tf(new yy0.h(textLocalisedClause2, resourceImage)), false, null, false, null, null, null, null, null, null, gVar, null, 0, 0, 0, 0, 532675544);
            ArrayList arrayList22 = new ArrayList(w.t(arrayList15, 10));
            Iterator it25 = arrayList15.iterator();
            while (it25.hasNext()) {
                arrayList22.add(((w0) it25.next()).f217602a);
            }
            Set setI1 = d0.i1(arrayList22);
            Set set3 = setI1;
            if ((set3 instanceof Collection) && set3.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it26 = set3.iterator();
                i2 = 0;
                while (it26.hasNext()) {
                    if (set.contains((AnalyticsAccount.Linked) it26.next()) && (i2 = i2 + 1) < 0) {
                        v.r();
                        throw null;
                    }
                }
            }
            SelectableDelegate.Model header7 = new SelectableDelegate.Model("SELECTABLE_LINKED_ACCOUNTS_ID", model, i2 == 0 ? qd0.UNSELECTED : i2 == setI1.size() ? qd0.SELECTED : qd0.INDETERMINATE, null, null, false, null, gVar, null, true, 31480);
            if (set2.contains(eVar)) {
                ArrayList arrayList23 = new ArrayList(w.t(arrayList15, 10));
                Iterator it27 = arrayList15.iterator();
                while (it27.hasNext()) {
                    arrayList23.add(cVar.b((w0) it27.next(), selection, arrayList15));
                }
                listC3 = i26.l.e(header7, arrayList23);
            } else {
                Intrinsics.checkNotNullParameter(header7, "header");
                listC3 = u.c(header7);
            }
        }
        List[] listArr2 = new List[5];
        listArr2[0] = listC;
        listArr2[z4 ? 1 : 0] = list9;
        listArr2[c26] = arrayList4;
        listArr2[c7] = arrayList3;
        listArr2[4] = listC3;
        ArrayList arrayListU2 = w.u(v.k(listArr2));
        yp0.b.k(arrayListU2, 0, 0, 0, 0, 31);
        return arrayListU2;
    }
}
