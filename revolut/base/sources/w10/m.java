package w10;

import i20.h0;
import java.lang.reflect.Type;
import kg.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m implements kg.t {
    @Override // kg.t
    public final Object deserialize(u json, Type type, kg.s sVar) {
        h0 h0Var;
        Intrinsics.checkNotNullParameter(json, "json");
        h0[] h0VarArrValues = h0.values();
        int length = h0VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                h0Var = null;
                break;
            }
            h0Var = h0VarArrValues[i];
            if (Intrinsics.f(json.f(), h0Var.a())) {
                break;
            }
            i++;
        }
        return h0Var == null ? h0.UNKNOWN : h0Var;
    }
}
