package w10;

import java.lang.reflect.Type;
import kg.u;
import kotlin.jvm.internal.Intrinsics;
import v30.t0;
import v30.u0;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements kg.t {
    @Override // kg.t
    public final Object deserialize(u json, Type type, kg.s sVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        t0 t0Var = u0.Companion;
        String ticketType = json.f();
        Intrinsics.checkNotNullExpressionValue(ticketType, "getAsString(...)");
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(ticketType, "ticketType");
        u0 u0Var = (u0) u0.mapping.get(ticketType);
        return u0Var == null ? u0.Unknown : u0Var;
    }
}
