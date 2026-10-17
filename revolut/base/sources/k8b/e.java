package k8b;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.corporate_events.common.R$string;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f182104a;

    public e(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f182104a = languageProvider;
    }

    @Override // k8b.a
    public final m8b.e a(iel.a aVar, String assetName, List instruments, Data data) {
        iel.h event = (iel.h) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        return new m8b.e(new TextLocalisedClause(R$string.feature_corporate_events_bubble_earnings_call_title_v2, u.c(new TextClause(assetName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.feature_corporate_events_bubble_earnings_call_description, null, null, 14), new InstrumentImage(event.d, 30, null, null), new WhiteCircleBadge(dw0.a.Megaphone), 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0196  */
    @Override // k8b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(iel.a r32, java.math.BigDecimal r33, boolean r34, java.util.List r35) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k8b.e.b(iel.a, java.math.BigDecimal, boolean, java.util.List):java.util.List");
    }

    @Override // k8b.a
    public final /* bridge */ qv0.i c(iel.a aVar) {
        super.c((iel.h) aVar);
        return null;
    }

    @Override // k8b.a
    public final qv0.i d(iel.a aVar, boolean z, LocalDate currentDate, ArrayList instruments) {
        ZonedDateTime zonedDateTimeG;
        LocalDate localDate;
        ZonedDateTime zonedDateTimeG2;
        LocalDate localDate2;
        iel.h event = (iel.h) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        DateTime dateTime = event.f160787h;
        boolean z3 = (dateTime == null || (zonedDateTimeG2 = jli.b.g(dateTime)) == null || (localDate2 = zonedDateTimeG2.toLocalDate()) == null || !localDate2.isBefore(currentDate)) ? false : true;
        DateTime dateTime2 = event.f160786g;
        boolean z4 = (dateTime2 == null || (zonedDateTimeG = jli.b.g(dateTime2)) == null || (localDate = zonedDateTimeG.toLocalDate()) == null || localDate.isAfter(currentDate) || z3) ? false : true;
        BannerDelegate.Model model = new BannerDelegate.Model(j6.a.q("CORPORATE_EVENT_BANNER_LIST_ID_", event.f160783a), j8b.k.b(R$drawable.uikit_icn_24_megaphone, R$attr.uikit_colorDeepPurple), new TextLocalisedClause(R$string.wealth_trading_banner_corporate_events_earnings_call_title, u.c(new TextClause(event.f160785c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), z4 ? new TextLocalisedClause(R$string.wealth_trading_banner_corporate_events_earnings_call_description_during_event, null, null, 14) : (z3 || z) ? new TextLocalisedClause(R$string.wealth_trading_corporate_events_earnings_call_description_after_event, u.c(new TextClause(event.f160785c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : new TextLocalisedClause(R$string.wealth_trading_banner_corporate_events_earnings_call_description_before_event, v.k(new TextClause(event.f160785c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TimeClause(oc.c.F(event.f160784b), new TimeClause.Format.Pretty(0), null, null, 12)), null, 12), false, !z4 && z, j8b.k.h(event, instruments), null, null, null, null, 65424);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
