package esl;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static LargeActionButtonDelegate.Model a(LargeActionButtonDelegate.Model model, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = R$attr.uikit_dp24;
        }
        int i5 = i;
        if ((i3 & 2) != 0) {
            i2 = R$attr.uikit_dp24;
        }
        int i6 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(model, "<this>");
        return LargeActionButtonDelegate.Model.e(model, null, i5, i2, i6, i6, 557055);
    }
}
