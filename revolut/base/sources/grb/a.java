package grb;

import cte.b;
import gr2.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f145960a = j.b(new j0(1));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f145961b = j.b(new j0(2));

    public final wse.a a(String tipId) {
        Intrinsics.checkNotNullParameter(tipId, "tipId");
        for (wse.a aVar : (List) this.f145960a.getValue()) {
            if (aVar.c().f108659a.equals(tipId)) {
                return aVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final ArrayList b(String str) {
        cte.a aVar;
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-tips-domain-model-AppTipsHostScreenId$-screen$0");
        Iterable<String> iterable = (Iterable) r0.h(new b(str), (Map) this.f145961b.getValue());
        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
        for (String str2 : iterable) {
            Iterator it8 = ((List) this.f145960a.getValue()).iterator();
            do {
                aVar = null;
                if (!it8.hasNext()) {
                    break;
                }
                cte.a aVarC = ((wse.a) it8.next()).c();
                if (aVarC.f108659a.equals(str2)) {
                    aVar = aVarC;
                }
            } while (aVar == null);
            if (aVar == null) {
                throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
