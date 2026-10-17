package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet;

import aw0.wa;
import cli.j;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$plurals;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreenContract$RevPointsCardType;
import f0e.i;
import fmk.f;
import fmk.h;
import ia3.r;
import iii.c;
import java.math.RoundingMode;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m93.g;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f103542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f103543b;

    public b(r cardsContentDetailedMapper, g cardsSimplifiedItemMapper) {
        Intrinsics.checkNotNullParameter(cardsContentDetailedMapper, "cardsContentDetailedMapper");
        Intrinsics.checkNotNullParameter(cardsSimplifiedItemMapper, "cardsSimplifiedItemMapper");
        this.f103542a = cardsContentDetailedMapper;
        this.f103543b = cardsSimplifiedItemMapper;
    }

    public static TextLocalisedQuantityClause a(int i, RevPointsEarningRate revPointsEarningRate) {
        RevPoints revPoints = revPointsEarningRate.f83976b;
        return new TextLocalisedQuantityClause(i, Double.valueOf(revPoints.J()), v.k(Double.valueOf(revPoints.J()), new NumberClause(revPoints.b(), new NumberClause.Format.FixedDigitsAfterDot(2, 8, null, wa.STRIP_ALL_TRAILING_ZEROES, RoundingMode.HALF_EVEN), null, null, 12), new MoneyClause(revPointsEarningRate.f83977c, new MoneyClause.Format.Shorts(false, 63), null, null, 12)), (Style) null, 24);
    }

    @Override // cli.n
    public final o c(j jVar) {
        lw0.a aVar;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.e;
        Data data2 = domainState.f136467c;
        List list = (List) c.f(t1.v(data, domainState.f136466b, domainState.d, domainState.f), new fkh.f(this, 12), new fk4.r(14), new i(this, domainState, 15));
        PlanRevPointsCardsScreenContract$RevPointsCardType planRevPointsCardsScreenContract$RevPointsCardType = domainState.f136465a;
        if (Intrinsics.f(planRevPointsCardsScreenContract$RevPointsCardType, PlanRevPointsCardsScreenContract$RevPointsCardType.Credit.f103532a)) {
            RevPointsEarningRate revPointsEarningRate = (RevPointsEarningRate) data2.getContent();
            aVar = new lw0.a(new TextLocalisedClause(R$string.plan_hub_sheet_cards_credit_revpoints_title, null, null, 14), revPointsEarningRate != null ? a(R$plurals.plan_hub_sheet_cards_credit_revpoints_subtitle_fractional, revPointsEarningRate) : null, null, null, false, 28);
        } else {
            if (!Intrinsics.f(planRevPointsCardsScreenContract$RevPointsCardType, PlanRevPointsCardsScreenContract$RevPointsCardType.Debit.f103533a)) {
                throw new NoWhenBranchMatchedException();
            }
            RevPointsEarningRate revPointsEarningRate2 = (RevPointsEarningRate) data2.getContent();
            aVar = new lw0.a(new TextLocalisedClause(R$string.plan_hub_sheet_cards_debit_revpoints_title, null, null, 14), revPointsEarningRate2 != null ? a(R$plurals.plan_hub_sheet_cards_debit_revpoints_subtitle_fractional, revPointsEarningRate2) : null, null, null, false, 28);
        }
        return new h(list, aVar);
    }
}
