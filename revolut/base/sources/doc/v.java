package doc;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        hoc.h pointAdapter = (hoc.h) obj2;
        Intrinsics.checkNotNullParameter(pointAdapter, "pointAdapter");
        if (pointAdapter instanceof hoc.f) {
            return new d0(new koc.e(((hoc.f) pointAdapter).f154274a));
        }
        if (pointAdapter instanceof hoc.g) {
            return new d0(new koc.f(((hoc.g) pointAdapter).f154275a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
