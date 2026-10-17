package ic8;

import akg.n;
import i98.e;
import jc8.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface b {
    static n a(b bVar, String juniorId, boolean z) {
        c cardRequestType = c.PHYSICAL;
        e eVar = (e) bVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(cardRequestType, "cardRequestType");
        return nim.a.v(eVar.c(z), new i25.e(juniorId, cardRequestType, 7));
    }
}
