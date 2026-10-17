package bd0;

import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.List;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f14512a;

    public b(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f14512a = uiKitResources;
    }

    public final boolean a(Clause clause, String str) {
        if (clause == null) {
            return false;
        }
        return d0.J(this.f14512a.b(clause), str, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(koi.j r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd0.b.b(koi.j, java.lang.String):boolean");
    }

    @Override // bd0.a
    public final List d(String searchQuery, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        if (searchQuery.length() == 0) {
            return items;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : items) {
            if (b((j) obj2, searchQuery)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
