package t18;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.z;

/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f267235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f267236b;

    public w() {
        f0 f0Var = f0.f322471a;
        this.f267235a = f0Var;
        this.f267236b = f0Var;
    }

    public final List a(List list) {
        boolean z;
        if (list.size() < this.f267235a.size()) {
            z = false;
            break;
        }
        Iterable iterableI = zhm.v.i(this.f267235a);
        if (!(iterableI instanceof Collection) || !((Collection) iterableI).isEmpty()) {
            vim.f it8 = iterableI.iterator();
            while (it8.f289625c) {
                int iNextInt = it8.nextInt();
                if (list.get(iNextInt) != this.f267235a.get(iNextInt)) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z && list.size() == this.f267235a.size()) {
            return this.f267236b;
        }
        int size = z ? this.f267235a.size() : 0;
        List listA = size == 0 ? f0.f322471a : this.f267236b;
        int size2 = list.size();
        while (size < size2) {
            List list2 = (List) list.get(size);
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : list2) {
                LocalDate localDate = ((x08.f) obj2).f301534c.atZone(zoneIdSystemDefault).toLocalDate();
                Object objU = linkedHashMap.get(localDate);
                if (objU == null) {
                    objU = h30.l.u(linkedHashMap, localDate);
                }
                ((List) objU).add(obj2);
            }
            aim.e eVar = new aim.e(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                LocalDate localDate2 = (LocalDate) entry.getKey();
                List list3 = (List) entry.getValue();
                Intrinsics.h(localDate2);
                eVar.add(new r(localDate2, list3));
            }
            if (eVar.size() > 1) {
                z.w(eVar, new v());
            }
            aim.e eVarA = zhm.u.a(eVar);
            if (listA.isEmpty()) {
                listA = eVarA;
            } else if (!eVarA.isEmpty()) {
                r rVar = (r) d0.m0(listA);
                r rVar2 = (r) d0.b0(eVarA);
                if (Intrinsics.f(rVar.f267226a, rVar2.f267226a)) {
                    aim.e eVar2 = new aim.e((eVarA.size() + listA.size()) - 1);
                    int iJ = zhm.v.j(listA);
                    for (int i = 0; i < iJ; i++) {
                        eVar2.add(listA.get(i));
                    }
                    ArrayList insights = d0.E0(rVar2.f267227b, rVar.f267227b);
                    LocalDate date = rVar.f267226a;
                    Intrinsics.checkNotNullParameter(date, "date");
                    Intrinsics.checkNotNullParameter(insights, "insights");
                    eVar2.add(new r(date, insights));
                    int size3 = eVarA.size();
                    for (int i2 = 1; i2 < size3; i2++) {
                        eVar2.add(eVarA.get(i2));
                    }
                    listA = zhm.u.a(eVar2);
                } else {
                    listA = d0.E0(eVarA, listA);
                }
            }
            size++;
        }
        this.f267235a = d0.d1(list);
        this.f267236b = listA;
        return listA;
    }
}
