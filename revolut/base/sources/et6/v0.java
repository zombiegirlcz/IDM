package et6;

import java.math.BigDecimal;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f129352a = new v0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        rr6.n nVar = (rr6.n) pair.f186385a;
        od0.i iVar = (od0.i) pair.f186386b;
        BigDecimal value = iVar.d() ? ((rr6.o) iVar.c()).getValue() : BigDecimal.ZERO;
        BigDecimal bigDecimal = nVar.f256724a;
        Intrinsics.h(value);
        BigDecimal value2 = bigDecimal.add(value);
        Intrinsics.checkNotNullExpressionValue(value2, "add(...)");
        Intrinsics.checkNotNullParameter(value2, "value");
        if (value2 != null) {
            return new rr6.o(value2);
        }
        return null;
    }
}
