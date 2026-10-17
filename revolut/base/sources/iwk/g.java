package iwk;

import afl.a0;
import afl.q;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public interface g {
    static void d(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        yp0.b.k(list, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
    }

    default List a(a0 stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        return f0.f322471a;
    }

    default List b(afl.f stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        return f0.f322471a;
    }

    default List c(q stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        return f0.f322471a;
    }
}
