package ub3;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.feature.cash_topup.api.models.LockedStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h {
    public static Image a(CashTopUpLocationInfo location) {
        Intrinsics.checkNotNullParameter(location, "location");
        String str = location.k;
        if (str != null) {
            return new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(new CircleTransformation((Float) null, (Integer) null, false, 15), false, false, (Integer) null, (Integer) null, (Integer) null, 501), null, null, false, false, 507902);
        }
        LockedStatus lockedStatus = location.f65597m;
        if (!(lockedStatus instanceof LockedStatus.NotApplicable) && !(lockedStatus instanceof LockedStatus.Unlocked)) {
            if (lockedStatus instanceof LockedStatus.Locked) {
                return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_lock_closed, R$attr.uikit_colorGreyTone50, R$attr.uikit_colorGreyTone50_10);
            }
            throw new NoWhenBranchMatchedException();
        }
        return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_cash, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
    }
}
