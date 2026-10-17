package yxc;

import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements z9l.a {
    public final LargeActionButton.ButtonStyle a(fr2.d style) {
        Intrinsics.checkNotNullParameter(style, "style");
        switch (a.f317640a[style.ordinal()]) {
            case 1:
                return LargeActionButton.ButtonStyle.f58725a;
            case 2:
                return LargeActionButton.ButtonStyle.f58727c;
            case 3:
                return LargeActionButton.ButtonStyle.f58726b;
            case 4:
                return LargeActionButton.ButtonStyle.o;
            case 5:
                return LargeActionButton.ButtonStyle.f58734p;
            case 6:
                return LargeActionButton.ButtonStyle.d;
            case 7:
            case 8:
            case 9:
                return LargeActionButton.ButtonStyle.f58725a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
