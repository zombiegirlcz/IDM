package cya;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesRewardInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d {
    public static final LayeredImage a() {
        return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_check_circle, Integer.valueOf(R$attr.uikit_colorStatusSuccess), R$attr.uikit_colorBackground, 2.0f, null, null, 48);
    }

    public static final LayeredImage b(pwa.b bVar, boolean z, ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (c.f110071a[bVar.ordinal()]) {
            case 1:
            case 2:
                return a();
            case 3:
            case 4:
                if (z) {
                    return null;
                }
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_time, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorBackground, 2.0f, null, null, 48);
            case 5:
            case 6:
                return (!z || activeOrPastInvitesRewardInfo == null) ? LayeredImage.Companion.a(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_revolut, new Color.Solid(R$attr.uikit_colorBlack), new Color.Solid(R$attr.uikit_colorWhite), 6.0f, null, 48) : a();
            case 7:
                if (z && activeOrPastInvitesRewardInfo != null) {
                    return a();
                }
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i = R$drawable.uikit_icn_16_canceled;
                int i2 = R$attr.uikit_colorGreyTone50;
                int i3 = R$attr.uikit_colorBackground;
                return LayeredImage.Companion.f(companion, i, i2, i3, Integer.valueOf(i3), 2.0f, 4.0f, null, 64);
            case 8:
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_exclamation_mark, Integer.valueOf(R$attr.uikit_colorOrange), R$attr.uikit_colorBackground, 2.0f, null, null, 48);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
