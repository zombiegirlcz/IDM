package u1g;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.experiences.api.R$string;
import ip0.tm0;
import ip0.um0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f276411a;

    public b(a experiencesBreakdownDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(experiencesBreakdownDisclaimerMapper, "experiencesBreakdownDisclaimerMapper");
        this.f276411a = experiencesBreakdownDisclaimerMapper;
    }

    public static CellDetailsDelegate.Model a(dj0.d dVar) {
        return new CellDetailsDelegate.Model("BOOKING_VALUE_ITEM_ID", new TextLocalisedClause(R$string.experiences_cancellation_sheet_booking_value, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static um0 b(jyf.a aVar) {
        return new um0("CONFIRMATION_BUTTONS_ITEM_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.experiences_common_back, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.experiences_common_action_confirm, null, null, 14), false, null, null, 56), (Object) aVar, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008);
    }

    public static CellDetailsDelegate.Model c(dj0.d dVar) {
        return new CellDetailsDelegate.Model("CANCELLATION_FEE_ITEM_ID", new TextLocalisedClause(R$string.experiences_cancellation_sheet_cancellation_fee, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model d(dj0.d dVar) {
        return new CellDetailsDelegate.Model("CASHBACK_REVERSAL_ITEM_ID", new TextLocalisedClause(R$string.experiences_cancellation_sheet_cashback_reversal, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model e(dj0.d dVar) {
        return new CellDetailsDelegate.Model("NET_REFUND_ITEM_ID", new TextLocalisedClause(R$string.experiences_cancellation_sheet_net_refund, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760);
    }
}
