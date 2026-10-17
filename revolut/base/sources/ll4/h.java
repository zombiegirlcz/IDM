package ll4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class h {
    public static final Integer a(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        switch (g.f196522a[fVar.f196518c.ordinal()]) {
            case 1:
                return Integer.valueOf(R$drawable.uikit_icn_16_status_clock_arrows);
            case 2:
            case 3:
                return Integer.valueOf(R$drawable.uikit_icn_16_sand_watch);
            case 4:
            case 5:
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final TextLocalisedClause b(f fVar) {
        int i;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String str = fVar.d;
        if (str == null) {
            str = "";
        }
        int i2 = g.f196523b[fVar.f196519g.ordinal()];
        if (i2 == 1) {
            i = R$string.credit_application_entry_points_cards_list_button;
        } else if (i2 == 2) {
            i = R$string.credit_application_entry_points_cards_widget_button;
        } else if (i2 == 3) {
            i = R$string.credit_application_entry_points_products_for_you_widget_button;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.credit_application_entry_points_card_ordering_button;
        }
        return new TextLocalisedClause(i, zhm.u.c(str), null, 12);
    }

    public static final TextLocalisedClause c(f fVar) {
        int i;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i2 = g.f196523b[fVar.f196519g.ordinal()];
        if (i2 == 1) {
            i = R$string.credit_application_entry_points_cards_list_subtitle;
        } else if (i2 == 2) {
            i = R$string.credit_application_entry_points_cards_widget_subtitle;
        } else if (i2 == 3) {
            i = R$string.credit_application_entry_points_products_for_you_widget_subtitle;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.credit_application_entry_points_card_ordering_subtitle;
        }
        return new TextLocalisedClause(i, zhm.u.c(fVar.f196517b), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
    }

    public static final int d(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        switch (g.f196522a[fVar.f196518c.ordinal()]) {
            case 1:
                return R$attr.uikit_colorForeground;
            case 2:
            case 4:
            case 5:
            case 6:
                return R$attr.uikit_colorGreyTone50;
            case 3:
                return R$attr.uikit_colorOrange;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Image e(f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String str = fVar.e;
        return str != null ? new UrlImage(str, (String) null, (UrlImageDrawable) new UrlImageDrawable.ResDrawable(i, null), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, (ImageTransformations) null, (Integer) null, (Integer) null, false, false, (Clause) null, 524282) : new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
    }

    public static final TextLocalisedClause f(f fVar) {
        int i;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i2 = g.f196523b[fVar.f196519g.ordinal()];
        if (i2 == 1) {
            i = R$string.credit_application_entry_points_cards_list_title;
        } else if (i2 == 2) {
            i = R$string.credit_application_entry_points_cards_widget_title;
        } else if (i2 == 3) {
            i = R$string.credit_application_entry_points_products_for_you_widget_title;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.credit_application_entry_points_card_ordering_title;
        }
        return new TextLocalisedClause(i, zhm.u.c(fVar.f196516a), null, 12);
    }
}
