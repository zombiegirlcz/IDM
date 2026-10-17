package j9g;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$plurals;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.campaign.TravelHotelsCampaign;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements q8g.b {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f172340a;

    public s(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f172340a = dateProvider;
    }

    public final TextLocalisedClause a(TravelHotelsCampaign campaign, q8g.a style) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Intrinsics.checkNotNullParameter(style, "style");
        l80.f fVar = (l80.f) this.f172340a;
        DateTime dateTimeG = fVar.g();
        DateTime dateTime = campaign.d;
        Days daysDaysBetween = Days.daysBetween(dateTimeG, dateTime);
        Hours hoursHoursBetween = Hours.hoursBetween(fVar.g(), dateTime.minusDays(daysDaysBetween.getDays()));
        int days = daysDaysBetween.getDays();
        int hours = hoursHoursBetween.getHours();
        int iB = style.b();
        return days > 30 ? new TextLocalisedClause(R$string.hotels_stays_badges_limited_offer_title, null, null, 14) : (1 > days || days >= 31) ? new TextLocalisedClause(R$string.hotels_stays_campaigns_time_left, zhm.u.c(new TextLocalisedQuantityClause(R$plurals.hotels_common_hours_count, Integer.valueOf(hours), zhm.u.c(Integer.valueOf(hours)), new Custom(Integer.valueOf(iB), false, null, false, null, 254), 8)), null, 12) : new TextLocalisedClause(R$string.hotels_stays_campaigns_time_left, zhm.u.c(new TextLocalisedQuantityClause(R$plurals.hotels_common_days_count, Integer.valueOf(days), zhm.u.c(Integer.valueOf(days)), new Custom(Integer.valueOf(iB), false, null, false, null, 254), 8)), null, 12);
    }

    public final TagViewData b(TravelHotelsCampaign campaign, q8g.a style) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Intrinsics.checkNotNullParameter(style, "style");
        TagViewData.Companion companion = TagViewData.INSTANCE;
        int i = R$drawable.uikit_icn_24_time;
        int iA = style.a();
        int iB = style.b();
        TextLocalisedClause textLocalisedClauseA = a(campaign, style);
        Integer numValueOf = Integer.valueOf(i);
        companion.getClass();
        return TagViewData.Companion.b(iA, iB, textLocalisedClauseA, numValueOf);
    }
}
