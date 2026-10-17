package gsh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f146506a = vkm.q.c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f146507b = new LinkedHashMap();

    public final void a(dsh.i contentValue) {
        Intrinsics.checkNotNullParameter(contentValue, "contentValue");
        j2 j2Var = this.f146506a;
        List list = (List) j2Var.getValue();
        ArrayList arrayListF1 = list != null ? zhm.d0.f1(list) : new ArrayList();
        arrayListF1.add(new dsh.p(b(contentValue.f117323a), contentValue.f117323a, contentValue.f117324b, contentValue.f117325c));
        j2Var.getClass();
        j2Var.g(null, arrayListF1);
    }

    public final String b(String str) {
        LinkedHashMap linkedHashMap = this.f146507b;
        Integer num = (Integer) linkedHashMap.get(str);
        int iIntValue = (num != null ? num.intValue() : -1) + 1;
        linkedHashMap.put(str, Integer.valueOf(iIntValue));
        return str + "-" + iIntValue;
    }

    public final boolean c(List widgetIds) {
        Intrinsics.checkNotNullParameter(widgetIds, "widgetIds");
        j2 j2Var = this.f146506a;
        List list = (List) j2Var.getValue();
        if (list == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!widgetIds.contains(((dsh.p) obj2).f117336a)) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() == list.size()) {
            return false;
        }
        j2Var.getClass();
        j2Var.g(null, arrayList);
        return true;
    }

    public final boolean d(List contentValues) {
        int iJ;
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        j2 j2Var = this.f146506a;
        List list = (List) j2Var.getValue();
        if (list != null) {
            boolean z = contentValues.size() != list.size();
            if (!z && (iJ = zhm.v.j(contentValues)) >= 0) {
                int i = 0;
                while (true) {
                    dsh.i iVar = (dsh.i) contentValues.get(i);
                    dsh.p pVar = (dsh.p) list.get(i);
                    if (!Intrinsics.f(iVar.f117323a, pVar.f117337b) || iVar.f117325c != pVar.d || !Intrinsics.f(iVar.f117324b, pVar.f117338c)) {
                        break;
                    }
                    if (i == iJ) {
                        break;
                    }
                    i++;
                }
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        ArrayList arrayListF1 = list != null ? zhm.d0.f1(list) : new ArrayList();
        List<dsh.i> list2 = contentValues;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (dsh.i iVar2 : list2) {
            int i2 = -1;
            if (!arrayListF1.isEmpty()) {
                Iterator it8 = arrayListF1.iterator();
                int i3 = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    dsh.p pVar2 = (dsh.p) it8.next();
                    if (Intrinsics.f(pVar2.f117337b, iVar2.f117323a) && Intrinsics.f(pVar2.f117338c, iVar2.f117324b)) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
            }
            arrayList.add(new dsh.p(i2 >= 0 ? ((dsh.p) arrayListF1.remove(i2)).f117336a : b(iVar2.f117323a), iVar2.f117323a, iVar2.f117324b, iVar2.f117325c));
        }
        j2Var.getClass();
        j2Var.g(null, arrayList);
        return true;
    }

    public final boolean e(String widgetId, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(config, "config");
        j2 j2Var = this.f146506a;
        List list = (List) j2Var.getValue();
        int i = 0;
        if (list == null) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.f(((dsh.p) it8.next()).f117336a, widgetId)) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            ArrayList arrayListF1 = zhm.d0.f1(list);
            arrayListF1.set(i, dsh.p.a((dsh.p) arrayListF1.get(i), config, null, 11));
            j2Var.getClass();
            j2Var.g(null, arrayListF1);
        }
        return true;
    }

    public final boolean f(dsh.t old2, dsh.t tVar) {
        Intrinsics.checkNotNullParameter(old2, "old");
        Intrinsics.checkNotNullParameter(tVar, "new");
        j2 j2Var = this.f146506a;
        List list = (List) j2Var.getValue();
        if (list == null) {
            return false;
        }
        List<dsh.p> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (dsh.p pVarA : list2) {
            if (pVarA.d == old2) {
                pVarA = dsh.p.a(pVarA, null, tVar, 7);
            }
            arrayList.add(pVarA);
        }
        if (list.equals(arrayList)) {
            return false;
        }
        j2Var.getClass();
        j2Var.g(null, arrayList);
        return true;
    }
}
