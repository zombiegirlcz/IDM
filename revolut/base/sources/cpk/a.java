package cpk;

import efm.r;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import pd.b;
import ppk.e;
import ppk.f;

/* JADX INFO: loaded from: classes13.dex */
public interface a {
    static r a(a aVar, Collection currencyPairs) {
        f fVar = (f) aVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
        return b.r(fVar.f(currencyPairs), new e(fVar, 0));
    }
}
