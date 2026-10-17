package w10;

import java.lang.reflect.Type;
import kg.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements kg.t {
    @Override // kg.t
    public final Object deserialize(u json, Type type, kg.s sVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        v30.b bVar = v30.c.Companion;
        String ticketType = json.f();
        Intrinsics.checkNotNullExpressionValue(ticketType, "getAsString(...)");
        bVar.getClass();
        Intrinsics.checkNotNullParameter(ticketType, "ticketType");
        v30.c cVar = (v30.c) v30.c.mapping.get(ticketType);
        return cVar == null ? v30.c.TERMINATED : cVar;
    }
}
