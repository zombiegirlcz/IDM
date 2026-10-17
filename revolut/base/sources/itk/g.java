package itk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes12.dex */
public final class g {
    public static RowDelegate.Model a(bfl.g gVar, hdh.e eVar) {
        int i;
        int i2;
        int i3;
        String str = "trade-cfds-action-" + gVar;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int[] iArr = f.f168421a;
        int i5 = iArr[gVar.ordinal()];
        if (i5 == 1) {
            i = R$drawable.uikit_icn_24_arrow_rates;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_arrow_rates_down;
        }
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(companion.i(i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62);
        int i6 = iArr[gVar.ordinal()];
        if (i6 == 1) {
            i2 = R$string.wealth_widget_trade_cfds_long_title;
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.wealth_widget_trade_cfds_short_title;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, null, null, 14);
        int i21 = iArr[gVar.ordinal()];
        if (i21 == 1) {
            i3 = R$string.wealth_widget_trade_cfds_long_description;
        } else {
            if (i21 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = R$string.wealth_widget_trade_cfds_short_description;
        }
        return new RowDelegate.Model(str, image40, textLocalisedClause, null, 0, new TextLocalisedClause(i3, null, null, 14), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, new b(gVar, eVar), null, 0, 0, 0, 0, 532675544);
    }
}
