package jag;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.travel.hotels.api.R$plurals;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.cancellation.AmountAndNightsPenalties;
import com.revolut.feature_travel_hotels_models.property.cancellation.AmountAndPercentagePenalties;
import com.revolut.feature_travel_hotels_models.property.cancellation.AmountCancellationPenalty;
import com.revolut.feature_travel_hotels_models.property.cancellation.CancelPenalties;
import com.revolut.feature_travel_hotels_models.property.cancellation.NightsCancellationPenalty;
import com.revolut.feature_travel_hotels_models.property.cancellation.NoCancellationPenalty;
import com.revolut.feature_travel_hotels_models.property.cancellation.NoRefundPenalty;
import com.revolut.feature_travel_hotels_models.property.cancellation.PercentageCancellationPenalty;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m9g.b f172477a;

    public d(m9g.b bookingDatePrinter) {
        Intrinsics.checkNotNullParameter(bookingDatePrinter, "bookingDatePrinter");
        this.f172477a = bookingDatePrinter;
    }

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
            return new TextLocalisedClause(R$string.hotels_room_options_cancellation_window_penalty_amount_and_percentage, v.k(new MoneyClause(amountAndPercentagePenalties.f98078a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextClause(amountAndPercentagePenalties.f98079b + "%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        }
        if (cancelPenalties instanceof NightsCancellationPenalty) {
            int i3 = R$plurals.hotels_room_options_cancellation_window_penalty_nights;
            int i5 = ((NightsCancellationPenalty) cancelPenalties).f98081a;
            return new TextLocalisedQuantityClause(i3, Integer.valueOf(i5), u.c(Integer.valueOf(i5)), (Style) null, 24);
        }
        if (!(cancelPenalties instanceof PercentageCancellationPenalty)) {
            if (!(cancelPenalties instanceof NoCancellationPenalty) && !Intrinsics.f(cancelPenalties, NoRefundPenalty.f98083a)) {
                throw new NoWhenBranchMatchedException();
            }
            m70.a.c(t0.f186434a);
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new TextLocalisedClause(R$string.hotels_room_options_cancellation_window_penalty_percentage, u.c(new TextClause(((PercentageCancellationPenalty) cancelPenalties).f98084a + "%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    public static Clause b(TextLocalisedClause textLocalisedClause, HotelsProperty hotelsProperty) {
        if (hotelsProperty.u != fgi.a.VRBO) {
            return textLocalisedClause;
        }
        Clause[] elements = {textLocalisedClause, new TextClause(". ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.hotels_room_options_cancellation_window_timeline_in_between_service_fee_not_refunded, null, null, 14)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
    }
}
