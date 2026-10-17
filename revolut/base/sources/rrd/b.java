package rrd;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static LayeredImage a(vzi.b category, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(category, "category");
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        switch (a.f256811a[category.ordinal()]) {
            case 1:
                i = R$drawable.uikit_icn_24_utilities;
                break;
            case 2:
                i = R$drawable.uikit_icn_24_driving_licence;
                break;
            case 3:
                i = R$drawable.uikit_icn_24_palette;
                break;
            case 4:
                i = R$drawable.uikit_icn_24_toy;
                break;
            case 5:
                i = R$drawable.uikit_icn_24_watch;
                break;
            case 6:
                i = R$drawable.uikit_icn_24_premium;
                break;
            case 7:
                i = R$drawable.uikit_icn_24_business_basic;
                break;
            case 8:
                i = R$drawable.uikit_icn_24_business_basic;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return companion.k(i, z ? R$attr.uikit_colorAccentNeutral : R$attr.uikit_colorOnAccent, z ? R$attr.uikit_colorAccentNeutral_10 : R$attr.uikit_colorBrown);
    }
}
