package nvg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public abstract void a(List list);

    public abstract void b(List list);

    public abstract void c(List list);

    public void d(List allocations, List cash, List assets) {
        Intrinsics.checkNotNullParameter(allocations, "allocations");
        Intrinsics.checkNotNullParameter(cash, "cash");
        Intrinsics.checkNotNullParameter(assets, "assets");
        c(allocations);
        b(cash);
        a(assets);
    }

    public abstract List e(iwg.a aVar, boolean z, String str, String str2);
}
