package vw4;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m1c.y;
import m1c.z;

/* JADX INFO: loaded from: classes22.dex */
public final class i {
    public i(j1c.a assetsProvider) {
        Intrinsics.checkNotNullParameter(assetsProvider, "assetsProvider");
    }

    public static com.revolut.core.ui_kit.delegates.widgets.g a(z zVar) {
        if (zVar instanceof y) {
            int i = h.f292639a[((y) zVar).f201475a.f201471b.ordinal()];
            if (i == 1) {
                return com.revolut.core.ui_kit.delegates.widgets.g.REV_POINTS;
            }
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!(zVar instanceof z.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return com.revolut.core.ui_kit.delegates.widgets.g.REV_POINTS_LOCKED;
    }
}
