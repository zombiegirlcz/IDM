package zsc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f324871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f324872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f324873c;

    public g(h entitySearchRules, h subEntitySearchRules) {
        Intrinsics.checkNotNullParameter(entitySearchRules, "entitySearchRules");
        Intrinsics.checkNotNullParameter(subEntitySearchRules, "subEntitySearchRules");
        this.f324871a = entitySearchRules;
        this.f324872b = subEntitySearchRules;
        this.f324873c = new LinkedHashSet();
    }

    public final q a(m query, Object obj2, List subEntities) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(subEntities, "subEntities");
        ArrayList<String> arrayList = query.f324878a;
        if (!arrayList.isEmpty()) {
            for (String str : arrayList) {
                List<Pair> list = this.f324871a.f324874a;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (Pair pair : list) {
                        atc.b bVar = (atc.b) pair.f186385a;
                        p pVar = (p) pair.f186386b;
                        LinkedHashSet linkedHashSet = this.f324873c;
                        linkedHashSet.clear();
                        bVar.a(obj2, linkedHashSet);
                        if (pVar.a(str, linkedHashSet)) {
                            break;
                        }
                    }
                }
                List list2 = subEntities;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return null;
                }
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    if (c(it8.next(), str)) {
                        break;
                    }
                }
                return null;
            }
        }
        return new q(obj2, subEntities, b(subEntities, query));
    }

    public final ArrayList b(List list, m mVar) {
        ArrayList arrayList = mVar.f324878a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!arrayList.isEmpty()) {
                Iterator it8 = arrayList.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    if (c(obj2, (String) it8.next())) {
                        arrayList2.add(obj2);
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public final boolean c(Object obj2, String str) {
        List<Pair> list = this.f324872b.f324874a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (Pair pair : list) {
            atc.b bVar = (atc.b) pair.f186385a;
            p pVar = (p) pair.f186386b;
            LinkedHashSet linkedHashSet = this.f324873c;
            linkedHashSet.clear();
            bVar.a(obj2, linkedHashSet);
            if (pVar.a(str, linkedHashSet)) {
                return true;
            }
        }
        return false;
    }
}
