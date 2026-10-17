package dh7;

import ch7.b;
import java.lang.reflect.Type;
import kg.s;
import kg.t;
import kg.u;
import kg.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements t {
    @Override // kg.t
    public final Object deserialize(u json, Type type, s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        w wVarC = json.c();
        u uVarI = wVarC.i("name");
        String strF = uVarI != null ? uVarI.f() : null;
        u uVarI2 = wVarC.i("value");
        String strF2 = uVarI2 != null ? uVarI2.f() : null;
        return (strF == null || strF2 == null) ? ch7.a.f24140a : new b(strF, strF2);
    }
}
