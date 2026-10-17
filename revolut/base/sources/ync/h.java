package ync;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {
    public static a a(ilc.a roboContext, wnc.l templateSelectionMode) {
        Intrinsics.checkNotNullParameter(roboContext, "roboContext");
        Intrinsics.checkNotNullParameter(templateSelectionMode, "templateSelectionMode");
        int i = g.f315434a[roboContext.ordinal()];
        if (i == 1 || i == 2) {
            return a.MULTIPLE_TABS;
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (templateSelectionMode instanceof wnc.i) {
            return a.MULTIPLE_TABS;
        }
        if ((templateSelectionMode instanceof wnc.j) || (templateSelectionMode instanceof wnc.k)) {
            return a.SINGLE_TAB;
        }
        throw new NoWhenBranchMatchedException();
    }
}
