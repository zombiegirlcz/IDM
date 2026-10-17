package g6e;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s6e.z;
import w4l.h;
import w4l.k;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public interface a {
    static Flow a(a aVar, List pockets, h6e.f subaccountFilter, k loadingStrategy, boolean z, int i) {
        if ((i & 4) != 0) {
            loadingStrategy = h.f294642c;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        n6e.b bVar = (n6e.b) aVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(subaccountFilter, "subaccountFilter");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return pockets.isEmpty() ? new go.g(new Data(f0.f322471a, null, false, 6, null), 2) : nim.a.v(((z) bVar.f212773b).w(subaccountFilter, loadingStrategy), new l1.e(bVar, pockets, z, 17));
    }
}
