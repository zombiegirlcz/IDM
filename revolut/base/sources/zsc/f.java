package zsc;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f324868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f324869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f324870c;

    public f(h searchRules, m query) {
        Intrinsics.checkNotNullParameter(searchRules, "searchRules");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f324868a = searchRules;
        this.f324869b = query;
        this.f324870c = new LinkedHashSet();
    }

    @Override // zsc.d
    public final boolean a(Object obj2) {
        m mVar = this.f324869b;
        if (mVar != null && mVar.f324878a.isEmpty()) {
            return true;
        }
        for (String str : mVar.f324878a) {
            List<Pair> list = this.f324868a.f324874a;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (Pair pair : list) {
                atc.b bVar = (atc.b) pair.f186385a;
                p pVar = (p) pair.f186386b;
                LinkedHashSet linkedHashSet = this.f324870c;
                linkedHashSet.clear();
                bVar.a(obj2, linkedHashSet);
                if (pVar.a(str, linkedHashSet)) {
                    break;
                }
            }
            return false;
        }
        return true;
    }
}
