package q90;

import java.lang.reflect.Type;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q90.x2;

/* JADX INFO: loaded from: classes19.dex */
public final class w2 implements kg.z {
    @Override // kg.z
    public final kg.u serialize(Object obj2, Type type, kg.y context) {
        x2.a src2 = (x2.a) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(context, "context");
        if (src2 instanceof x2.a.C1336a) {
            kg.u uVarO = ((a31.a) context).o(src2, x2.a.C1336a.class);
            Intrinsics.checkNotNullExpressionValue(uVarO, "serialize(...)");
            return uVarO;
        }
        if (!(src2 instanceof x2.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        kg.u uVarO2 = ((a31.a) context).o(src2, x2.a.b.class);
        Intrinsics.checkNotNullExpressionValue(uVarO2, "serialize(...)");
        return uVarO2;
    }
}
