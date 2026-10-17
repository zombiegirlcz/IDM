package z84;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q84.b;

/* JADX INFO: loaded from: classes22.dex */
public final class a {
    public static LayeredImage a(b debt) {
        int i;
        Intrinsics.checkNotNullParameter(debt, "debt");
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i2 = R$attr.uikit_colorAccent_10;
        int i3 = R$attr.uikit_colorAccent;
        debt.getClass();
        int i5 = q84.a.f242970a[debt.ordinal()];
        if (i5 == 1) {
            i = R$drawable.uikit_icn_24_mortgage;
        } else if (i5 == 2) {
            i = R$drawable.uikit_icn_24_credit;
        } else if (i5 == 3) {
            i = R$drawable.uikit_icn_24_credit_card;
        } else {
            if (i5 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_credit_bag;
        }
        return LayeredImage.Companion.b(companion, i, Integer.valueOf(i3), i2, 8.0f, null, null, 48);
    }
}
