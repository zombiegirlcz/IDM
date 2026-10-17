package l12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class g {
    /* JADX WARN: Multi-variable type inference failed */
    public static hrf.h a(List errors) {
        Object obj2;
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(errors, "errors");
        List list = errors;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (((yqi.b) obj3) instanceof srf.a) {
                arrayList.add(obj3);
            } else {
                arrayList2.add(obj3);
            }
        }
        yqi.b[] elements = new yqi.b[3];
        Iterator it8 = list.iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((yqi.b) next) instanceof urf.b) {
                break;
            }
        }
        elements[0] = next;
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (((yqi.b) next2) instanceof urf.a) {
                break;
            }
        }
        elements[1] = next2;
        Iterator it10 = list.iterator();
        while (true) {
            if (!it10.hasNext()) {
                break;
            }
            Object next3 = it10.next();
            if (((yqi.b) next3) instanceof b) {
                obj2 = next3;
                break;
            }
        }
        elements[2] = obj2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new hrf.h(arrayList2, arrayList, (yqi.b) d0.d0(kotlin.collections.d.L(elements)));
    }
}
