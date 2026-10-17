package he0;

import java.lang.reflect.Type;
import kg.s;
import kg.t;
import kg.u;
import kg.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k implements t {
    @Override // kg.t
    public final Object deserialize(u json, Type typeOfT, s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        json.getClass();
        if (json instanceof w) {
            String string = json.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        String strF = json.d().f();
        Intrinsics.checkNotNullExpressionValue(strF, "getAsString(...)");
        return strF;
    }
}
