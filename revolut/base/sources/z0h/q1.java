package z0h;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public interface q1 {
    static CompositeClause a(q1 q1Var, List disclaimers, hel.b bVar) {
        Object next;
        Object next2;
        aah.m mVar = (aah.m) q1Var;
        Map map = mVar.f2837c;
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        Comparator comparator = (bVar == null ? -1 : aah.l.f2834a[bVar.ordinal()]) == 1 ? (Comparator) map.get("UK_DISCLAIMER_COMPARATOR") : (Comparator) map.get("DEFAULT_DISCLAIMER_COMPARATOR");
        if (comparator == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        List listP0 = zhm.d0.P0(disclaimers, comparator);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listP0.iterator();
        while (true) {
            Clause clauseA = null;
            if (!it8.hasNext()) {
                break;
            }
            f1 f1Var = (f1) it8.next();
            Iterator it9 = mVar.f2835a.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                if (((pzg.a) next).b(f1Var)) {
                    break;
                }
            }
            pzg.a aVar = (pzg.a) next;
            Clause clauseA2 = aVar != null ? aVar.a(f1Var) : null;
            if (clauseA2 == null) {
                Iterator it10 = mVar.f2836b.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it10.next();
                    if (((pzg.a) next2).b(f1Var)) {
                        break;
                    }
                }
                pzg.a aVar2 = (pzg.a) next2;
                if (aVar2 != null) {
                    clauseA = aVar2.a(f1Var);
                }
            } else {
                clauseA = clauseA2;
            }
            if (clauseA != null) {
                arrayList.add(clauseA);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new CompositeClause(arrayList, new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 8);
    }
}
