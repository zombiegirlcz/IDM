package q90;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v1 implements kg.z {
    @Override // kg.z
    public final kg.u serialize(Object obj2, Type type, kg.y context) {
        u1 src2 = (u1) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(context, "context");
        kg.u uVarO = ((a31.a) context).o(src2, v.class);
        Intrinsics.checkNotNullExpressionValue(uVarO, "serialize(...)");
        return uVarO;
    }
}
