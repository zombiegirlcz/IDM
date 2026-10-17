package lge;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pie.v;

/* JADX INFO: loaded from: classes8.dex */
public final class j {
    public static LayeredImage a(v identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        switch (i.f195105a[identifier.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("No subspace icon for the " + v.FLAT_ROOT);
            case 2:
                return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue);
            case 3:
                return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_lock_closed, R$attr.uikit_colorWhite, R$attr.uikit_colorTerracotta);
            case 4:
                return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue);
            case 5:
                return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_vaults_generic, R$attr.uikit_colorWhite, R$attr.uikit_colorTerracotta);
            case 6:
                return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_credit_bag, R$attr.uikit_colorWhite, R$attr.uikit_colorTeal);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
