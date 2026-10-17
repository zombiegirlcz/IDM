package cl3;

import efm.r;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import wl3.h;

/* JADX INFO: loaded from: classes13.dex */
public interface a {
    static r a(a aVar) {
        h hVar = (h) aVar;
        Map map = hVar.e;
        r rVarDistinctUntilChanged = (!map.isEmpty() ? ((r) hVar.f.getValue()).startWith(map) : (r) hVar.f.getValue()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }
}
