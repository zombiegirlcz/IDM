package fik;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.revolut.feature_fourthline_impl.R;
import hx7.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nii.z;
import pck.i;
import zhm.d0;
import zhm.f0;
import zhm.w;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
public final class d {
    public static z a(int i, int i2, List list, List list2) {
        return b(i, new TextLocalisedClause(i2, list2, null, 12), list);
    }

    public static z b(int i, Clause clause, List list) {
        return new z(new TextLocalisedClause(i, list, null, 12), clause, null, null, null, null, false, null, null, null, null, null, null, 32764);
    }

    public static z c(d dVar, int i, List list, int i2, List list2, int i3) {
        if ((i3 & 2) != 0) {
            list = f0.f322471a;
        }
        if ((i3 & 8) != 0) {
            list2 = f0.f322471a;
        }
        dVar.getClass();
        return a(i, i2, list, list2);
    }

    public static TextClause d(List list, List list2) {
        List list3 = list;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        Iterator it8 = list3.iterator();
        while (it8.hasNext()) {
            arrayList.add(f((i) it8.next(), list2));
        }
        return new TextClause(d0.k0(arrayList, ", ", null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static z e() {
        return new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
    }

    public static String f(i iVar, List list) {
        Object next;
        String strW;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((l) next).N0(), iVar.f234929a)) {
                break;
            }
        }
        l lVar = (l) next;
        if (lVar != null && (strW = q.w(lVar)) != null) {
            String str = kotlin.text.d0.W(strW) ? null : strW;
            if (str != null) {
                return str;
            }
        }
        return iVar.f234929a;
    }
}
