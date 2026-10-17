package mx4;

import android.graphics.drawable.GradientDrawable;
import aw0.o9;
import com.google.android.material.internal.ViewUtils;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.gradients.UiKitGradient;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import dx4.h2;
import dx4.i2;
import ip0.an;
import ip0.lm;
import ip0.pm;
import ip0.tm;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h0 {
    public static List a(i2 item) {
        tm pmVar;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f120623a;
        ResourceImage resourceImage = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_constructor_highlight_title, zhm.u.c(new TextClause(item.f120624b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        Image imageT1 = item.f120625c.T1();
        h2 h2Var = item.e;
        int[] iArr = g0.f210180a;
        int i = iArr[h2Var.ordinal()];
        if (i == 1) {
            resourceImage = new ResourceImage(R$drawable.uikit_icn_16_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = iArr[h2Var.ordinal()];
        if (i2 == 1) {
            pmVar = new pm(an.ITEMS_ONLY);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = R$attr.uikit_colorPurple;
            int i5 = R$attr.uikit_colorIndigo;
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
            UiKitGradient uiKitGradient = new UiKitGradient(i3, i5);
            int i6 = R$attr.uikit_colorAccentNeutral_5;
            pmVar = new lm(new UiKitGradient(i6, i6, 0), uiKitGradient);
        }
        return zhm.u.c(new HighlightTileDelegate.Model(str, textLocalisedClause, imageT1, true, item.d, new AnalyticsContext(zw4.a.a(item.f120623a)), resourceImage, null, pmVar, ViewUtils.EDGE_TO_EDGE_FLAGS));
    }
}
