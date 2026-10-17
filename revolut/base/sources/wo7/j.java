package wo7;

import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.insurance_car.impl.R$string;
import java.time.LocalDate;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl7.n;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LocalDate localDate = domainState.f298898a;
        LocalDate localDate2 = domainState.f298899b;
        boolean zIsBefore = localDate.isBefore(localDate2);
        LocalDate localDate3 = domainState.f298898a;
        boolean zF = Intrinsics.f(localDate3, localDate2);
        aim.e eVarB = u.b();
        LocalDate localDate4 = domainState.f298898a;
        g5 g5Var = new g5("DATE_PICKER_ITEM_ID", localDate4, localDate4, false, null, localDate2, localDate2.plusDays(30L), null, null, null, 0, 0, 1048376);
        yp0.b.l(g5Var, 0, 0, 0, 0, null, false, 63);
        eVarB.add(g5Var);
        return new g(u.a(eVarB), !zIsBefore, new CompositeClause(v.k(new TextLocalisedClause(R$string.car_insurance_common_continue, null, null, 14), n.e(localDate3, new TimeClause.Format.DayAndMonth(0))), new DotDividerClause((Integer) null), null, null, 12), zIsBefore ? new TextLocalisedClause(R$string.car_insurance_policy_start_date_input_past_date_error, null, null, 14) : zF ? new TextLocalisedClause(R$string.car_insurance_policy_start_date_input_today_hint, null, null, 14) : new TextLocalisedClause(R$string.car_insurance_policy_start_date_subtitle, null, null, 14));
    }
}
