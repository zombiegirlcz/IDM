package qbg;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.travel.hotels.api.R$plurals;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.property.cancellation.AmountAndNightsPenalties;
import com.revolut.feature_travel_hotels_models.property.cancellation.AmountAndPercentagePenalties;
import com.revolut.feature_travel_hotels_models.property.cancellation.AmountCancellationPenalty;
import com.revolut.feature_travel_hotels_models.property.cancellation.CancelPenalties;
import com.revolut.feature_travel_hotels_models.property.cancellation.NightsCancellationPenalty;
import com.revolut.feature_travel_hotels_models.property.cancellation.NoCancellationPenalty;
import com.revolut.feature_travel_hotels_models.property.cancellation.NoRefundPenalty;
import com.revolut.feature_travel_hotels_models.property.cancellation.PercentageCancellationPenalty;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q97.q2;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements n {
    public static Clause a(CancelPenalties cancelPenalties) {
        if (cancelPenalties instanceof AmountCancellationPenalty) {
            return new MoneyClause(((AmountCancellationPenalty) cancelPenalties).f98080a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        }
        if (cancelPenalties instanceof AmountAndNightsPenalties) {
            int i = R$plurals.hotels_room_options_cancellation_window_penalty_amount_and_nights;
            AmountAndNightsPenalties amountAndNightsPenalties = (AmountAndNightsPenalties) cancelPenalties;
            int i2 = amountAndNightsPenalties.f98077b;
            return new TextLocalisedQuantityClause(i, Integer.valueOf(i2), v.k(new MoneyClause(amountAndNightsPenalties.f98076a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), Integer.valueOf(i2)), (Style) null, 24);
        }
        if (cancelPenalties instanceof AmountAndPercentagePenalties) {
            AmountAndPercentagePenalties amountAndPercentagePenalties = (AmountAndPercentagePenalties) cancelPenalties;
            return new TextLocalisedClause(R$string.hotels_room_options_cancellation_window_penalty_amount_and_percentage, v.k(new MoneyClause(amountAndPercentagePenalties.f98078a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new PercentageClause(amountAndPercentagePenalties.f98079b, (PercentageClause.Format) null, (Custom) null, 6)), null, 12);
        }
        if (cancelPenalties instanceof NightsCancellationPenalty) {
            int i3 = R$plurals.hotels_room_options_cancellation_window_penalty_nights;
            int i5 = ((NightsCancellationPenalty) cancelPenalties).f98081a;
            return new TextLocalisedQuantityClause(i3, Integer.valueOf(i5), u.c(Integer.valueOf(i5)), (Style) null, 24);
        }
        if (cancelPenalties instanceof PercentageCancellationPenalty) {
            return new TextLocalisedClause(R$string.hotels_room_options_cancellation_window_penalty_percentage, u.c(new PercentageClause(((PercentageCancellationPenalty) cancelPenalties).f98084a, (PercentageClause.Format) null, (Custom) null, 6)), null, 12);
        }
        if ((cancelPenalties instanceof NoCancellationPenalty) || Intrinsics.f(cancelPenalties, NoRefundPenalty.f98083a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Clause b(TextLocalisedClause textLocalisedClause, fgi.a aVar) {
        return aVar == fgi.a.VRBO ? new CompositeClause(v.k(textLocalisedClause, new TextLocalisedClause(R$string.hotels_room_options_cancellation_window_timeline_in_between_service_fee_not_refunded, null, null, 14)), new DotDividerClause((Integer) null), null, null, 12) : textLocalisedClause;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f244269a, new qb5.a(5), new q2(26), new j(this, domainState, 0));
    }
}
