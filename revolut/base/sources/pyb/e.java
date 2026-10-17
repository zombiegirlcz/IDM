package pyb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.feature.rev_points.models.RevPointsEarningRateCardAction;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements fub.d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final RowDelegate.Model a(RevPointsEarningRate earningRate, RevPointsEarningRateCardAction cardAction, do3.n user, boolean z, boolean z3) {
        int i;
        int i2;
        RowDelegate.Model.c pfVar;
        Intrinsics.checkNotNullParameter(earningRate, "earningRate");
        Intrinsics.checkNotNullParameter(cardAction, "cardAction");
        Intrinsics.checkNotNullParameter(user, "user");
        String strQ = j6.a.q("REV_POINTS_EARNING_RATE_ITEM_ID_", earningRate.f83975a.name());
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        f1 f1Var = earningRate.f83975a;
        int[] iArr = f.f240740a;
        int i3 = iArr[f1Var.ordinal()];
        if (i3 == 1) {
            i = R$drawable.uikit_icn_24_card;
        } else {
            if (i3 != 2) {
                throw new UnsupportedOperationException();
            }
            i = R$drawable.uikit_icn_24_credit_card;
        }
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(companion, i, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, Float.valueOf(24.0f), null, 32), null, null, false, null, false, 62);
        int i5 = iArr[f1Var.ordinal()];
        if (i5 == 1) {
            wi0.b.Companion.getClass();
            i2 = w.T(user, wi0.b.O0, wi0.b.f297734c) ? R$string.rev_points_earning_rates_debit_card_prepaid_title : R$string.rev_points_earning_rates_debit_card_title;
        } else {
            if (i5 != 2) {
                throw new UnsupportedOperationException();
            }
            i2 = R$string.rev_points_earning_rates_credit_card_title;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.rev_points_common_rates_spent, v.k(nub.a.q(earningRate.f83976b, null, null, null, 7), new MoneyClause(earningRate.f83977c, new MoneyClause.Format.Shorts(false, 63), null, null, 12)), null, 12);
        if (cardAction instanceof RevPointsEarningRateCardAction.NoAction) {
            pfVar = new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
            if (!z3) {
                pfVar = null;
            }
        } else {
            if (!(cardAction instanceof RevPointsEarningRateCardAction.OrderCard) && !(cardAction instanceof RevPointsEarningRateCardAction.ActivateCard)) {
                throw new NoWhenBranchMatchedException();
            }
            pfVar = new pf(new TextLocalisedClause(R$string.rev_points_earning_rates_action_get_card, null, null, 14), null, null, false, null, null, 510);
        }
        return new RowDelegate.Model(strQ, image40, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, z ? pfVar : null, z, null, false, z ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, null, null, null, null, earningRate, null, 0, 0, 0, 0, 532657112);
    }
}
