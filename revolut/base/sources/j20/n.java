package j20;

import java.lang.reflect.Type;
import kg.s;
import kg.t;
import kg.u;
import kg.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements t {
    @Override // kg.t
    public final Object deserialize(u json, Type typeOfT, s context) {
        String strF;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        w wVarC = json.c();
        u uVarI = wVarC.i("type");
        if (uVarI == null || (strF = uVarI.f()) == null) {
            strF = "";
        }
        String string = wVarC.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new m(strF, string);
    }
}
