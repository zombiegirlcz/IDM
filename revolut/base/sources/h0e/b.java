package h0e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.q;
import wxd.z;
import zhm.d0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f148375a = q.c(null);

    public static List a(z zVar, List list) {
        int i = a.f148374a[zVar.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return d0.V0(list, 1);
        }
        if (i == 5) {
            return d0.U(list);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final yxd.c b(z setting, List selectedOptionIds) {
        j2 j2Var;
        Object value;
        yxd.c cVarA;
        Set setI1;
        Intrinsics.checkNotNullParameter(setting, "setting");
        Intrinsics.checkNotNullParameter(selectedOptionIds, "selectedOptionIds");
        do {
            j2Var = this.f148375a;
            value = j2Var.getValue();
            cVarA = (yxd.c) value;
            if (cVarA == null) {
                throw new IllegalStateException("Statement settings are not initialised");
            }
            if (cVarA.f317662a.contains(setting) && !selectedOptionIds.isEmpty()) {
                List list = (List) cVarA.f317663b.get(setting);
                if (list != null) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((yxd.a) it8.next()).f317658a);
                    }
                    setI1 = d0.i1(arrayList);
                } else {
                    setI1 = null;
                }
                List listU = d0.U(selectedOptionIds);
                if (setI1 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listU) {
                        if (setI1.contains((String) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    listU = arrayList2;
                }
                List listA = a(setting, listU);
                if (!listA.isEmpty()) {
                    cVarA = yxd.c.a(cVarA, null, r0.q(cVarA.f317664c, new Pair(setting, listA)), false, 11);
                }
            }
        } while (!j2Var.h(value, cVarA));
        return cVarA;
    }
}
