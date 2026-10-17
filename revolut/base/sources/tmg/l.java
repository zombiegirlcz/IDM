package tmg;

import com.revolut.core.ui_kit_resources.R$attr;
import fmg.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l {
    public static int a(x color) {
        Intrinsics.checkNotNullParameter(color, "color");
        int i = k.f272218b[color.ordinal()];
        if (i == 1) {
            return R$attr.uikit_colorOrange;
        }
        if (i == 2) {
            return R$attr.uikit_colorBlue;
        }
        if (i == 3) {
            return R$attr.uikit_colorGreen;
        }
        throw new NoWhenBranchMatchedException();
    }
}
