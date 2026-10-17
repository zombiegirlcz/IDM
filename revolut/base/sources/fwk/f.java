package fwk;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import mel.j0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static int a(j0 j0Var) {
        int i = j0Var == null ? -1 : g.f138708a[j0Var.ordinal()];
        if (i == -1) {
            return R$attr.uikit_colorGreyTone10;
        }
        if (i == 1 || i == 2) {
            return R$attr.uikit_colorPerformancePositive;
        }
        if (i == 3) {
            return R$attr.uikit_colorPerformanceStatic;
        }
        if (i == 4 || i == 5) {
            return R$attr.uikit_colorPerformanceNegative;
        }
        throw new NoWhenBranchMatchedException();
    }
}
