package fl6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static a a(String str, List popularInstitutions, List remainingInstitutions, h0 idSelector) {
        Intrinsics.checkNotNullParameter(popularInstitutions, "popularInstitutions");
        Intrinsics.checkNotNullParameter(remainingInstitutions, "remainingInstitutions");
        Intrinsics.checkNotNullParameter(idSelector, "idSelector");
        if (str == null) {
            return new a(popularInstitutions, remainingInstitutions);
        }
        if (popularInstitutions.isEmpty()) {
            return new a(popularInstitutions, b(str, remainingInstitutions, idSelector));
        }
        Iterator it8 = popularInstitutions.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it8.hasNext()) {
                i2 = -1;
                break;
            }
            if (Intrinsics.f(idSelector.invoke(it8.next()), str)) {
                break;
            }
            i2++;
        }
        if (i2 == 0) {
            return new a(popularInstitutions, remainingInstitutions);
        }
        if (i2 != -1) {
            ArrayList arrayListF1 = d0.f1(popularInstitutions);
            arrayListF1.addFirst(arrayListF1.remove(i2));
            return new a(arrayListF1, remainingInstitutions);
        }
        Iterator it9 = remainingInstitutions.iterator();
        while (true) {
            if (!it9.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.f(idSelector.invoke(it9.next()), str)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return new a(popularInstitutions, remainingInstitutions);
        }
        ArrayList arrayListF12 = d0.f1(remainingInstitutions);
        Object objRemove = arrayListF12.remove(i);
        ArrayList arrayListF13 = d0.f1(popularInstitutions);
        arrayListF13.addFirst(objRemove);
        return new a(arrayListF13, arrayListF12);
    }

    public static List b(String str, List institutions, h0 idSelector) {
        Intrinsics.checkNotNullParameter(institutions, "institutions");
        Intrinsics.checkNotNullParameter(idSelector, "idSelector");
        if (str == null) {
            return institutions;
        }
        Iterator it8 = institutions.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.f(idSelector.invoke(it8.next()), str)) {
                break;
            }
            i++;
        }
        if (i == -1 || i == 0) {
            return institutions;
        }
        ArrayList arrayListF1 = d0.f1(institutions);
        arrayListF1.addFirst(arrayListF1.remove(i));
        return arrayListF1;
    }
}
