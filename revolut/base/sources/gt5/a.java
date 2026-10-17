package gt5;

import ard.t;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import msb.c;
import msb.e;
import mu5.f;
import te0.w;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
public interface a {
    static r a(a aVar, b bVar, boolean z, int i) {
        b bVar2 = (i & 1) != 0 ? null : bVar;
        n9l.b bVar3 = n9l.b.SEC_10;
        boolean z3 = (i & 4) != 0 ? true : z;
        f fVar = (f) aVar;
        r map = m70.a.g(fVar.f208974b.k(false), null, new mqg.a(24), 1).map(new e(6, new c(19)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarSwitchMap = w.l(map, xv5.c.b(fVar.f)).switchMap(new e(8, new t(fVar, bVar2, z3, bVar3, 17)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    static /* synthetic */ r b(a aVar, r rVar, b bVar, n9l.b bVar2, int i) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        if ((i & 4) != 0) {
            bVar2 = n9l.b.SEC_3;
        }
        return ((f) aVar).e(rVar, bVar, bVar2);
    }
}
