package k8b;

import aw0.c7;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.corporate_events.common.R$string;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import iel.n;
import iel.o;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements a {
    @Override // k8b.a
    public final m8b.e a(iel.a aVar, String assetName, List instruments, Data data) {
        o event = (o) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        return new m8b.e(new TextLocalisedClause(R$string.feature_corporate_events_bubble_listing_status_change_title, u.c(new TextClause(assetName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.feature_corporate_events_bubble_listing_status_change_description, null, null, 14), new InstrumentImage(event.d, 30, null, null), new WhiteCircleBadge(dw0.a.Alert), 16);
    }

    @Override // k8b.a
    public final List b(iel.a aVar, BigDecimal userOwnership, boolean z, List instruments) {
        o event = (o) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(userOwnership, "userOwnership");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        kp3.a aVarH = j8b.k.h(event, instruments);
        String str = event.f160799a;
        return v.k(new CellDetailsDelegate.Model(j6.a.q("CORPORATE_EVENT_DESCRIPTION_ID__", str), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_type, null, null, 14), (Image) null, 0, false, 30), j8b.k.f(event, z), null, aVarH, null, null, 0, null, false, false, null, null, 32696), new CellDetailsDelegate.Model(a0.d.r(str, "_effective_date"), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_effective_date, null, null, 14), (Image) null, 0, false, 30), com.revolut.core.ui_kit.models.j.b(c7.Companion, event.f160800b, LocalDateClause$DateFormat.DateLong.f57804a), null, aVarH, null, null, 0, null, false, false, null, null, 32696));
    }

    @Override // k8b.a
    public final /* bridge */ qv0.i c(iel.a aVar) {
        super.c((o) aVar);
        return null;
    }

    @Override // k8b.a
    public final qv0.i d(iel.a aVar, boolean z, LocalDate currentDate, ArrayList instruments) {
        TextLocalisedClause textLocalisedClause;
        o event = (o) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        if (event.e == n.DELISTED) {
            return null;
        }
        TextLocalisedClause textLocalisedClause2 = z ? new TextLocalisedClause(R$string.wealth_trading_banner_corporate_events_delisting_title_after_event, u.c(new TextClause(event.f160801c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : new TextLocalisedClause(R$string.wealth_trading_banner_corporate_events_delisting_title_before_event, u.c(new TextClause(event.f160801c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_banner_corporate_events_delisting_description_after_event, null, null, 14);
        } else {
            int i = R$string.wealth_trading_banner_corporate_events_delisting_description_before_event;
            TextClause textClause = new TextClause(event.f160801c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            com.revolut.core.ui_kit.models.j jVar = c7.Companion;
            LocalDate localDate = event.f160800b;
            LocalDateClause$DateFormat.INSTANCE.getClass();
            textLocalisedClause = new TextLocalisedClause(i, v.k(textClause, com.revolut.core.ui_kit.models.j.b(jVar, localDate, LocalDateClause$DateFormat.Companion.f57815b), new TextClause(event.f160801c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        }
        BannerDelegate.Model model = new BannerDelegate.Model(j6.a.q("CORPORATE_EVENT_BANNER_LIST_ID_", event.f160799a), j8b.k.b(R$drawable.uikit_icn_16_exclamation_mark_sign, R$attr.uikit_colorRed), textLocalisedClause2, textLocalisedClause, false, z, j8b.k.h(event, instruments), null, null, null, null, 65424);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
