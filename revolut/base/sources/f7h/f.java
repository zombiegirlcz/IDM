package f7h;

import androidx.sqlite.db.SimpleSQLiteQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import xzg.o;
import zh9.u0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class f {
    public abstract List a(o oVar);

    public abstract void b(ArrayList arrayList);

    public abstract int c(SimpleSQLiteQuery simpleSQLiteQuery);

    public void d(ArrayList collections, o assetType) {
        Intrinsics.checkNotNullParameter(collections, "collections");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        ArrayList arrayList = new ArrayList(w.t(collections, 10));
        Iterator it8 = collections.iterator();
        while (it8.hasNext()) {
            arrayList.add(((a) it8.next()).f132611a);
        }
        c(new SimpleSQLiteQuery(j6.a.s("DELETE FROM collections WHERE id NOT IN (", d0.k0(arrayList, "','", "'", "'", 0, null, 56), ") AND assetType == '", u0.J(assetType), "'")));
        b(collections);
    }
}
