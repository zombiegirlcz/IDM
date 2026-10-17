package k8b;

import aw0.c7;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.corporate_events.common.R$string;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements a {
    @Override // k8b.a
    public final m8b.e a(iel.a aVar, String assetName, List instruments, Data data) {
        iel.k event = (iel.k) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        return new m8b.e(new TextLocalisedClause(R$string.feature_corporate_events_bubble_ex_dividend_title, u.c(new TextClause(assetName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.feature_corporate_events_bubble_ex_dividend_short_description, null, null, 14), new InstrumentImage(event.d, 30, null, null), new WhiteCircleBadge(dw0.a.Fees), 16);
    }

    @Override // k8b.a
    public final List b(iel.a aVar, BigDecimal userOwnership, boolean z, List instruments) {
        iel.k event = (iel.k) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(userOwnership, "userOwnership");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model(j6.a.q("CORPORATE_EVENT_DESCRIPTION_ID__", event.f160789a), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_type, null, null, 14), (Image) null, 0, false, 30), j8b.k.f(event, z), null, j8b.k.h(event, instruments), null, null, 0, null, false, false, null, null, 32696);
        String str = event.f160789a;
        String strR = a0.d.r(str, "_ex_dividend_date");
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_ex_dividend_date, null, null, 14), (Image) null, 0, false, 30);
        com.revolut.core.ui_kit.models.j jVar = c7.Companion;
        LocalDate localDate = event.f160790b;
        LocalDateClause$DateFormat.DateLong dateLong = LocalDateClause$DateFormat.DateLong.f57804a;
        return v.k(model, new CellDetailsDelegate.Model(strR, t0Var, com.revolut.core.ui_kit.models.j.b(jVar, localDate, dateLong), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model(a0.d.r(str, "_payment_date"), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_payment_date, null, null, 14), (Image) null, 0, false, 30), com.revolut.core.ui_kit.models.j.a(event.e, dateLong, null), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model(a0.d.r(str, "_amount"), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_amount, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.feature_corporate_events_bubble_amount_value, u.c(new MoneyClause(event.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
    }

    @Override // k8b.a
    public final /* bridge */ qv0.i c(iel.a aVar) {
        super.c((iel.k) aVar);
        return null;
    }

    @Override // k8b.a
    public final qv0.i d(iel.a aVar, boolean z, LocalDate currentDate, ArrayList instruments) {
        iel.k event = (iel.k) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        return null;
    }
}
