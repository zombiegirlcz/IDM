package ncc;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.models.EarningBadge;
import com.revolut.feature.revolutpay.promoted_merchants.models.merchants.PromotedMerchant;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static TagViewData a(PromotedMerchant merchant) {
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        EarningBadge earningBadge = merchant.f84693g;
        if (earningBadge == null) {
            return null;
        }
        String str = earningBadge.f83946b;
        int i = a.f214168a[earningBadge.f83945a.ordinal()];
        if (i == 1) {
            return TagViewData.Companion.f(TagViewData.INSTANCE, str, 4);
        }
        if (i != 2) {
            if (i == 3 || i == 4 || i == 5) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        TagViewData.Companion companion = TagViewData.INSTANCE;
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_revpoints);
        int i2 = R$attr.uikit_colorWhite_70;
        int i3 = R$attr.uikit_colorBlack;
        companion.getClass();
        return TagViewData.Companion.c(str, i2, i3, numValueOf);
    }
}
