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
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.corporate_events.common.R$string;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements a {
    @Override // k8b.a
    public final m8b.e a(iel.a aVar, String assetName, List instruments, Data data) {
        iel.b event = (iel.b) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        return new m8b.e(new TextLocalisedClause(R$string.feature_corporate_events_bubble_bankruptcy_title, u.c(new TextClause(assetName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (TextLocalisedClause) null, new InstrumentImage(event.d, 30, null, null), new DangerCircleBadge(dw0.a.Suspicious), 18);
    }

    @Override // k8b.a
    public final List b(iel.a aVar, BigDecimal userOwnership, boolean z, List instruments) {
        iel.b event = (iel.b) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(userOwnership, "userOwnership");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        return v.k(new CellDetailsDelegate.Model(j6.a.q("CORPORATE_EVENT_DESCRIPTION_ID__", event.f160769a), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_type, null, null, 14), (Image) null, 0, false, 30), j8b.k.f(event, z), null, j8b.k.h(event, instruments), null, null, 0, null, false, false, null, null, 32696), new CellDetailsDelegate.Model(a0.d.r(event.f160769a, "_declaration_date"), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_event_type_bankruptcy_date_key, null, null, 14), (Image) null, 0, false, 30), com.revolut.core.ui_kit.models.j.b(c7.Companion, event.f160770b, LocalDateClause$DateFormat.DateLong.f57804a), null, null, null, null, 0, null, false, false, null, null, 32760));
    }

    @Override // k8b.a
    public final /* bridge */ qv0.i c(iel.a aVar) {
        super.c((iel.b) aVar);
        return null;
    }

    @Override // k8b.a
    public final qv0.i d(iel.a aVar, boolean z, LocalDate currentDate, ArrayList instruments) {
        Object next;
        iel.b event = (iel.b) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Iterator it8 = instruments.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((n) next).f214596b, event.d)) {
                break;
            }
        }
        n nVar = (n) next;
        if (nVar == null) {
            return null;
        }
        BannerDelegate.Model model = new BannerDelegate.Model(j6.a.q("CORPORATE_EVENT_BANNER_LIST_ID_", event.f160769a), j8b.k.b(R$drawable.uikit_icn_16_exclamation_mark_sign, R$attr.uikit_colorRed), new TextLocalisedClause(R$string.wealth_trading_banner_corporate_events_bankruptcy_title, u.c(new TextClause(nVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.wealth_trading_banner_corporate_events_bankruptcy_description, u.c(new TextClause(event.f160771c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), false, false, j8b.k.h(event, instruments), null, null, null, null, 65424);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
