package g2f;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.of;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRate;
import com.revolut.feature.travel.miles.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class q {

    @NotNull
    public static final o Companion = new o();

    public static RowDelegate.Model b(List list, String str, int i, int i2, int i3) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i3, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(i, null, null, 14), of.SMALL, 0, !list.isEmpty() ? new TextLocalisedClause(i2, list, null, 12) : new TextLocalisedClause(i2, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868816);
    }

    public final RowDelegate.Model a(String str, TradeRevPointsRate rate) {
        TextLocalisedClause textLocalisedClauseA = v1f.c.a(rate.f91192c);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.miles_airline_details_howto_miles_transfer_title, null, null, 14);
        of ofVar = of.SMALL;
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_rev_points, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
        int i = R$string.miles_airline_details_howto_transfer_description;
        Intrinsics.checkNotNullParameter(rate, "rate");
        return new RowDelegate.Model("HOW_IT_WORKS_FIRST_ITEM_LIST_ID", image24, textLocalisedClause, ofVar, 0, new TextLocalisedClause(i, v.k(str, new CompositeClause(v.k(new NumberClause(v1f.c.b(rate), null, null, null, 14), new NumberClause(v1f.c.c(rate), null, null, null, 14)), new TextClause(":", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), textLocalisedClauseA), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868816);
    }
}
