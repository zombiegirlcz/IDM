package nvg;

import java.util.List;
import jel.a3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class n0 {
    public abstract void a(List list);

    public abstract void b(List list);

    public void c(List allocations, List assets) {
        Intrinsics.checkNotNullParameter(allocations, "allocations");
        Intrinsics.checkNotNullParameter(assets, "assets");
        b(allocations);
        a(assets);
    }

    public abstract List d(iwg.a aVar, a3 a3Var, String str);
}
