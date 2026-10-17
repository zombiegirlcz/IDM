package q90;

import java.lang.reflect.Type;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements kg.z {
    @Override // kg.z
    public final kg.u serialize(Object obj2, Type type, kg.y context) {
        q0 src2 = (q0) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(context, "context");
        if (src2 instanceof a0) {
            kg.u uVarO = ((a31.a) context).o(src2, a0.class);
            Intrinsics.checkNotNullExpressionValue(uVarO, "serialize(...)");
            return uVarO;
        }
        if (src2 instanceof n2) {
            kg.u uVarO2 = ((a31.a) context).o(src2, n2.class);
            Intrinsics.checkNotNullExpressionValue(uVarO2, "serialize(...)");
            return uVarO2;
        }
        if (src2 instanceof b) {
            kg.u uVarO3 = ((a31.a) context).o(src2, b.class);
            Intrinsics.checkNotNullExpressionValue(uVarO3, "serialize(...)");
            return uVarO3;
        }
        if (!(src2 instanceof j4)) {
            throw new NoWhenBranchMatchedException();
        }
        kg.u uVarT = c6d.b.t(((j4) src2).f243379a);
        Intrinsics.checkNotNullExpressionValue(uVarT, "parse(...)");
        return uVarT;
    }
}
