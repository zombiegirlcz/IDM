package eog;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jli.g;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s7a.c0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends x7a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f127910a;

    public d(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f127910a = uiKitResources;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        String str = (String) d0.c0(ids);
        Object obj3 = null;
        if (str == null) {
            return new b(null);
        }
        Iterator<E> it8 = gog.b.b().iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((gog.b) next).name(), str)) {
                obj3 = next;
                break;
            }
        }
        return new b((gog.b) obj3);
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        return (List) iii.c.f(data, new elb.a(26), new en6.a(6), new a(selectedModelIds));
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        EnumEntries<gog.b> enumEntriesB = gog.b.b();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesB, 10));
        for (gog.b bVar : enumEntriesB) {
            arrayList.add(new c(bVar, this.f127910a.b(new TextLocalisedClause(bVar.a(), (List) null, (Style) null, (Clause) null, 30)).toString()));
        }
        if (!kotlin.text.d0.W(query)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (g.h(((c) obj3).f127909b, query)) {
                    arrayList2.add(obj3);
                }
            }
            arrayList = arrayList2;
        }
        return new go.g(zi0.c.P(arrayList, false, null, 3), 2);
    }
}
