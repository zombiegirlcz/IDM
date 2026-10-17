package vu0;

import com.revolut.core.ui_kit_resources.R$attr;
import ip0.xh0;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes19.dex */
public abstract class l {
    public static final int a(xh0 xh0Var) {
        int i = k.f292171a[xh0Var.ordinal()];
        if (i == 1) {
            return R$attr.uikit_colorAccentNeutral;
        }
        if (i == 2) {
            return R$attr.uikit_colorGreyTone8;
        }
        if (i == 3) {
            return R$attr.uikit_colorStatusDanger;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int b(xh0 xh0Var) {
        int i = k.f292171a[xh0Var.ordinal()];
        if (i == 1) {
            return R$attr.uikit_colorOnAccentNeutral;
        }
        if (i == 2) {
            return R$attr.uikit_colorForeground;
        }
        if (i == 3) {
            return R$attr.uikit_colorOnAccent;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final xh0 c(m mVar) {
        xh0 xh0Var = mVar.f292172a.d;
        return (xh0Var != xh0.PRIMARY || mVar.d) ? xh0Var : xh0.NEUTRAL;
    }
}
