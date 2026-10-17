package obg;

import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$plurals;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.campaign.TravelHotelsCampaign;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f223954a;

    public r(a itemMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f223954a = dateProvider;
    }

    public final l a(TravelHotelsCampaign travelHotelsCampaign) {
        TextClause textClause = new TextClause(travelHotelsCampaign.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        l80.f fVar = (l80.f) this.f223954a;
        DateTime dateTimeG = fVar.g();
        DateTime dateTime = travelHotelsCampaign.d;
        Days daysDaysBetween = Days.daysBetween(dateTimeG, dateTime);
        Hours hoursHoursBetween = Hours.hoursBetween(fVar.g(), dateTime.minusDays(daysDaysBetween.getDays()));
        TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.hotels_common_days_count, Integer.valueOf(daysDaysBetween.getDays()), u.c(Integer.valueOf(daysDaysBetween.getDays())), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
        if (daysDaysBetween.getDays() <= 0) {
            textLocalisedQuantityClause = null;
        }
        m70.a.t(t0.f186434a);
        Object[] elements = {textLocalisedQuantityClause, daysDaysBetween.getDays() > 0 ? new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextLocalisedQuantityClause(R$plurals.hotels_common_hours_count, Integer.valueOf(hoursHoursBetween.getHours()), u.c(Integer.valueOf(hoursHoursBetween.getHours())), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new l(textClause, new TextLocalisedClause(R$string.hotels_stays_campaigns_time_left, u.c(new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), new ResourceImage(R$drawable.uikit_icn_16_time, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (o) iii.c.f(t1.u(domainState.f223939a, domainState.f223940b, domainState.f223941c), new o54.a(this, domainState, 20), new kp0.m(this, domainState, 19), new p(this, 0));
    }
}
