package pr8;

import androidx.sqlite.db.SimpleSQLiteQuery;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public abstract void a(ArrayList arrayList);

    public abstract d0 b(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract List c();

    public abstract void d(ArrayList arrayList);

    public void e(ArrayList requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        Set setQ0 = zhm.d0.Q0(c(), requests);
        ArrayList arrayList = new ArrayList(w.t(setQ0, 10));
        Iterator it8 = setQ0.iterator();
        while (it8.hasNext()) {
            arrayList.add(((xr8.b) it8.next()).f308295a);
        }
        if (!arrayList.isEmpty()) {
            a(arrayList);
        }
        if (requests.isEmpty()) {
            return;
        }
        d(requests);
    }
}
