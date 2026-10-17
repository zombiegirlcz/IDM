package azb;

import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m1c.a0;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nd7.d f11425a;

    public e(nd7.d hyperTextClauseMapper) {
        Intrinsics.checkNotNullParameter(hyperTextClauseMapper, "hyperTextClauseMapper");
        this.f11425a = hyperTextClauseMapper;
    }

    public static LargeActionButton.ButtonStyle a(a0 a0Var, LargeActionButton.ButtonStyle.FilledButton filledButton) {
        int i = a0Var == null ? -1 : d.f11424a[a0Var.ordinal()];
        if (i == -1) {
            return filledButton;
        }
        if (i == 1) {
            return LargeActionButton.ButtonStyle.f58725a;
        }
        if (i == 2) {
            return LargeActionButton.ButtonStyle.f58726b;
        }
        if (i == 3) {
            return LargeActionButton.ButtonStyle.f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
