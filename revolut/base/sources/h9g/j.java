package h9g;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_resources.R$attr;
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
import com.revolut.feature_travel_hotels_models.property.room.CancellationPolicy;
import com.revolut.feature_travel_hotels_models.property.room.CancellationWindow;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.joda.time.DateTime;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public abstract class j {
    public static final Clause a(m9g.b bookingDatePrinter, l80.e dateProvider, CancellationPolicy cancellationPolicy, String cancellationPolicyDatePattern, boolean z, int i) {
        char c2;
        Clause textLocalisedClause;
        Intrinsics.checkNotNullParameter(bookingDatePrinter, "bookingDatePrinter");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(cancellationPolicy, "cancellationPolicy");
        Intrinsics.checkNotNullParameter(cancellationPolicyDatePattern, "cancellationPolicyDatePattern");
        if (qk.d.t(cancellationPolicy, dateProvider) instanceof xfi.c) {
            return new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        }
        Clause[] elements = new Clause[4];
        CancellationWindow cancellationWindow = (CancellationWindow) d0.b0(cancellationPolicy.f98094c);
        Intrinsics.checkNotNullParameter(cancellationWindow, "<this>");
        Intrinsics.checkNotNullParameter(bookingDatePrinter, "bookingDatePrinter");
        Intrinsics.checkNotNullParameter(cancellationPolicyDatePattern, "cancellationPolicyDatePattern");
        cgi.b bVar = cancellationWindow.f98097c;
        DateTime endDate = cancellationWindow.f98096b;
        CancelPenalties cancelPenalties = cancellationWindow.d;
        int i2 = i.f150254a[bVar.ordinal()];
        if (i2 != 1) {
            c2 = 1;
            if (i2 == 2) {
                Intrinsics.i(endDate, "null cannot be cast to non-null type org.joda.time.DateTime");
                Intrinsics.checkNotNullParameter(cancellationWindow, "<this>");
                Intrinsics.checkNotNullParameter(bookingDatePrinter, "bookingDatePrinter");
                Intrinsics.checkNotNullParameter(endDate, "endDate");
                Intrinsics.checkNotNullParameter(cancellationPolicyDatePattern, "cancellationPolicyDatePattern");
                if (cancelPenalties instanceof NoCancellationPenalty) {
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.hotels_room_option_free_cancellation, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreen), false, null, false, null, 254), 10);
                    m70.a.t(t0.f186434a);
                    textLocalisedClause = new CompositeClause(v.k(textLocalisedClause2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.hotels_common_before, u.c(new TextClause(bookingDatePrinter.a(endDate, cancellationPolicyDatePattern), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8)), null, null, null, 14);
                } else {
                    textLocalisedClause = new TextLocalisedClause(R$string.hotels_room_options_cancellation_window_before_with_penalties, u.c(new TextClause(bookingDatePrinter.a(endDate, cancellationPolicyDatePattern), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
                }
            } else if (i2 == 3) {
                DateTime startDate = cancellationWindow.f98095a;
                Intrinsics.i(startDate, "null cannot be cast to non-null type org.joda.time.DateTime");
                Intrinsics.i(endDate, "null cannot be cast to non-null type org.joda.time.DateTime");
                Intrinsics.checkNotNullParameter(cancellationWindow, "<this>");
                Intrinsics.checkNotNullParameter(bookingDatePrinter, "bookingDatePrinter");
                Intrinsics.checkNotNullParameter(startDate, "startDate");
                Intrinsics.checkNotNullParameter(endDate, "endDate");
                Intrinsics.checkNotNullParameter(cancellationPolicyDatePattern, "cancellationPolicyDatePattern");
                textLocalisedClause = new TextLocalisedClause(R$string.hotels_room_options_cancellation_window_timeline_in_between_with_penalties, v.k(c(cancelPenalties), new TextClause(bookingDatePrinter.a(startDate, cancellationPolicyDatePattern), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), new TextClause(bookingDatePrinter.a(endDate, cancellationPolicyDatePattern), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullParameter(cancellationWindow, "<this>");
                textLocalisedClause = cancelPenalties instanceof NoRefundPenalty ? new TextLocalisedClause(R$string.hotels_room_options_cancellation_window_after_no_refund, null, null, 14) : new TextLocalisedClause(R$string.hotels_room_options_cancellation_window_after_with_penalty, u.c(c(cancelPenalties)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
            }
        } else {
            c2 = 1;
            Intrinsics.checkNotNullParameter(cancellationWindow, "<this>");
            textLocalisedClause = cancelPenalties instanceof NoCancellationPenalty ? new TextLocalisedClause(R$string.hotels_room_options_cancellation_window_anytime_free_cancellation, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10) : new TextLocalisedClause(R$string.hotels_room_options_cancellation_window_anytime_with_penalties, u.c(c(cancelPenalties)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
        }
        elements[0] = textLocalisedClause;
        TextClause textClause = new TextClause("•", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (!z) {
            textClause = null;
        }
        elements[c2] = textClause;
        m70.a.t(t0.f186434a);
        TextClause textClause2 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (!z) {
            textClause2 = null;
        }
        elements[2] = textClause2;
        elements[3] = z ? new TextLocalisedClause(R$string.hotels_room_options_cancellation_window_learn_more, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10) : null;
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
    }

    public static final Clause c(CancelPenalties cancelPenalties) {
        Intrinsics.checkNotNullParameter(cancelPenalties, "<this>");
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
}
