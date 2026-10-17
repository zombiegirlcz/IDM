package ylg;

import ang.d;
import ang.f;
import hng.q;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.t;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public interface b {
    static t c(b bVar, List data) {
        f fVar = (f) bVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(data, "updates");
        q qVar = (q) fVar.f7769a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        pfm.a aVar = new pfm.a(qVar.f154114a.updateUserDetails(vmg.f.a(data), false).e(new h(new hng.h(qVar, 1), 2)), qVar.f154117g.g(Unit.f186387a, false), 0);
        Intrinsics.checkNotNullExpressionValue(aVar, "concatWith(...)");
        t tVarL = w.g0(aVar).l(new d(fVar, 0));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return tVarL;
    }
}
