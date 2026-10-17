package tb;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class p extends kotlin.jvm.internal.u implements Function3 {
    public static final p f = new p(3);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        w9m.b layoutInfo = (w9m.b) obj2;
        int iIntValue = ((Number) obj3).intValue();
        int iIntValue2 = ((Number) obj4).intValue();
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        return Integer.valueOf(kotlin.ranges.f.g(kotlin.ranges.f.g(iIntValue2, iIntValue - 1, iIntValue + 1), 0, layoutInfo.f295763a.getLayoutInfo().getTotalItemsCount() - 1));
    }
}
