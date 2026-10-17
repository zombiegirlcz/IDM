package dcl;

import androidx.sqlite.db.SimpleSQLiteQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a0 {
    public abstract int a(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract List b(Set set);

    public abstract void c(ArrayList arrayList);

    public void d(ArrayList refs, ArrayList tickers) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tickers, "tickers");
        a(new SimpleSQLiteQuery(p.a.p("DELETE FROM instrument_tickers WHERE ref IN (", zhm.d0.k0(refs, "','", "'", "'", 0, null, 56), ")")));
        c(tickers);
    }
}
