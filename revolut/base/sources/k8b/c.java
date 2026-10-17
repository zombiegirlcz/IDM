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
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.corporate_events.common.R$string;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import ip0.ej;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements a {
    @Override // k8b.a
    public final m8b.e a(iel.a aVar, String assetName, List instruments, Data data) {
        iel.c event = (iel.c) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        return new m8b.e(new TextLocalisedClause(R$string.feature_corporate_events_bubble_bond_coupon_title, u.c(new TextClause(assetName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.feature_corporate_events_bubble_bond_coupon_description, null, null, 14), new InstrumentImage(event.d, 30, null, null), (CircleIconBadge) null, 16);
    }

    @Override // k8b.a
    public final List b(iel.a aVar, BigDecimal userOwnership, boolean z, List instruments) {
        iel.c event = (iel.c) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(userOwnership, "userOwnership");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        kp3.a aVarH = j8b.k.h(event, instruments);
        String str = event.f160772a;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model(j6.a.q("CORPORATE_EVENT_DESCRIPTION_ID__", str), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_type, null, null, 14), (Image) null, 0, false, 30), j8b.k.f(event, z), null, aVarH, null, null, 0, null, false, false, null, null, 32696);
        String strR = a0.d.r(str, "_payment_date");
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_bond_coupon_date, null, null, 14), (Image) null, 0, false, 30);
        com.revolut.core.ui_kit.models.j jVar = c7.Companion;
        LocalDate localDate = event.e;
        LocalDateClause$DateFormat.INSTANCE.getClass();
        return v.k(model, new CellDetailsDelegate.Model(strR, t0Var, com.revolut.core.ui_kit.models.j.b(jVar, localDate, LocalDateClause$DateFormat.Companion.f57815b), null, aVarH, null, null, 0, null, false, false, null, null, 32696), new CellDetailsDelegate.Model(a0.d.r(str, "_amount"), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_bond_coupon_amount, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.feature_corporate_events_event_type_bond_coupon_amount_per_unit, u.c(new MoneyClause(mif.a.Q(event.f), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, aVarH, null, null, 0, null, false, false, null, null, 32696));
    }

    @Override // k8b.a
    public final qv0.i c(iel.a aVar) {
        iel.c event = (iel.c) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        return new ej(a0.d.r(event.f160772a, "_footer"), new mx0.c7(new TextLocalisedClause(R$string.feature_corporate_events_bubble_bond_coupon_footer, null, null, 14), false, null, 6));
    }

    @Override // k8b.a
    public final qv0.i d(iel.a aVar, boolean z, LocalDate currentDate, ArrayList instruments) {
        iel.c event = (iel.c) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        return null;
    }
}
