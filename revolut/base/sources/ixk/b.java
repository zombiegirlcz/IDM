package ixk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.trading_hours.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import nel.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements vwk.a {
    public static ResourceImage a(p0 p0Var) {
        int i = a.f169572a[p0Var.ordinal()];
        if (i == 1) {
            return new ResourceImage(R$drawable.uikit_icn_24_sun, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorYellow), (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
        if (i == 2) {
            return new ResourceImage(R$drawable.uikit_icn_24_sun, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorDeepPurple), (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
        if (i == 3) {
            return new ResourceImage(R$drawable.uikit_icn_24_sunrise, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
        if (i == 4 || i == 5) {
            return new ResourceImage(R$drawable.uikit_icn_24_moon, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorDeepGrey), (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int b(p0 p0Var) {
        int i = a.f169572a[p0Var.ordinal()];
        if (i == 1) {
            return R$attr.uikit_colorPopoverBackground;
        }
        if (i == 2) {
            return R$attr.uikit_colorDeepPurple_10;
        }
        if (i == 3) {
            return R$attr.uikit_colorTerracotta_10;
        }
        if (i == 4 || i == 5) {
            return R$attr.uikit_colorDeepGrey_10;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TextLocalisedClause c(p0 p0Var) {
        int i = a.f169572a[p0Var.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.wealthcore_trading_asset_details_market_state_open, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.wealthcore_trading_asset_details_market_state_after_hours, null, new Custom(Integer.valueOf(R$attr.uikit_colorDeepPurple), false, null, false, null, 254), 10);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.wealthcore_trading_asset_details_market_state_pre_market, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10);
        }
        if (i == 4 || i == 5) {
            return new TextLocalisedClause(R$string.wealthcore_trading_asset_details_market_state_closed, null, new Custom(Integer.valueOf(R$attr.uikit_colorDeepGrey), false, null, false, null, 254), 10);
        }
        throw new NoWhenBranchMatchedException();
    }
}
