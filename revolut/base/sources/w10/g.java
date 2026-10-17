package w10;

import java.lang.reflect.Type;
import kg.u;
import kotlin.jvm.internal.Intrinsics;
import v30.a0;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements kg.t {
    @Override // kg.t
    public final Object deserialize(u json, Type type, kg.s sVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        a0 a0Var = c0.Companion;
        String strF = json.f();
        Intrinsics.checkNotNullExpressionValue(strF, "getAsString(...)");
        a0Var.getClass();
        return a0.a(strF);
    }
}
