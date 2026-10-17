package jck;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static ArrayList a(String searchQuery, List birthdays) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(birthdays, "birthdays");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : birthdays) {
            if (c(searchQuery, ((i0) obj2).f172850a)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList b(String searchQuery, List groups) {
        j0 j0Var;
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(groups, "groups");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = groups.iterator();
        while (it8.hasNext()) {
            j0 j0Var2 = (j0) it8.next();
            List upcomingBirthdays = (List) ue0.e.M(a(searchQuery, j0Var2.f172854b));
            if (upcomingBirthdays == null) {
                j0Var = null;
            } else {
                LocalDate firstBirthday = j0Var2.f172853a;
                Intrinsics.checkNotNullParameter(firstBirthday, "firstBirthday");
                Intrinsics.checkNotNullParameter(upcomingBirthdays, "upcomingBirthdays");
                j0Var = new j0(firstBirthday, upcomingBirthdays);
            }
            if (j0Var != null) {
                arrayList.add(j0Var);
            }
        }
        return arrayList;
    }

    public static boolean c(String str, zm3.l lVar) {
        if (!kotlin.text.d0.W(str)) {
            String string = kotlin.text.d0.F0(str).toString();
            if (!kotlin.text.d0.J(hx7.q.v(lVar), string, true) && !kotlin.text.d0.J(lVar.N0(), string, true) && !kotlin.text.d0.J(hx7.q.w(lVar), string, true) && !kotlin.text.d0.J(hx7.q.A(lVar), string, true)) {
                if (!kotlin.text.d0.J(hx7.q.w(lVar) + " " + hx7.q.A(lVar), string, true)) {
                    return false;
                }
            }
        }
        return true;
    }
}
