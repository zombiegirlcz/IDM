package q90;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements kg.t {
    @Override // kg.t
    public final Object deserialize(kg.u json, Type type, kg.s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        String strI = boh.f.i("type", json);
        if (strI != null) {
            int iHashCode = strI.hashCode();
            if (iHashCode != 782694408) {
                if (iHashCode != 1047314052) {
                    if (iHashCode == 1657263294 && strI.equals("MONEY_RANGE")) {
                        Object objD = ((a31.a) context).d(json, n2.class);
                        Intrinsics.checkNotNullExpressionValue(objD, "deserialize(...)");
                        return (q0) objD;
                    }
                } else if (strI.equals("ACTION_SELECTED")) {
                    Object objD2 = ((a31.a) context).d(json, b.class);
                    Intrinsics.checkNotNullExpressionValue(objD2, "deserialize(...)");
                    return (q0) objD2;
                }
            } else if (strI.equals("BOOLEAN")) {
                Object objD3 = ((a31.a) context).d(json, a0.class);
                Intrinsics.checkNotNullExpressionValue(objD3, "deserialize(...)");
                return (q0) objD3;
            }
        }
        String string = json.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new j4(string);
    }
}
