package qr4;

import aw0.c7;
import aw0.ka;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import hha.w0;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final egk.e f248653a;

    public f(egk.e pricingPlanUiInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanUiInteractor, "pricingPlanUiInteractor");
        this.f248653a = pricingPlanUiInteractor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        w0 w0Var = domainState.f248647a;
        LocalDate localDate = domainState.d;
        Clause clauseB = egk.e.b(this.f248653a, w0Var);
        if (!domainState.e) {
            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.credit_card_fee_waiver_sheet_title, u.c(clauseB), null, 12), new TextLocalisedClause(R$string.credit_card_fee_waiver_sheet_subtitle, u.c(clauseB), null, 12), null, null, false, 28);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14);
            List listK = v.k(new RowDelegate.Model("id_spending_goal", null, new TextLocalisedClause(R$string.credit_card_fee_waiver_sheet_cell_spending_goal, null, null, 14), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(domainState.f248648b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882), new RowDelegate.Model("id_spent", null, new TextLocalisedClause(R$string.credit_card_fee_waiver_sheet_cell_spent, null, null, 14), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(domainState.f248649c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882), new RowDelegate.Model("id_statement", null, new TextLocalisedClause(R$string.credit_card_fee_waiver_sheet_cell_statement_close, null, null, 14), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(com.revolut.core.ui_kit.models.j.b(c7.Companion, localDate, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT)), 0 == true ? 1 : 0, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            return new d(textLocalisedClause, listK, aVar);
        }
        dj0.d dVar = domainState.f248648b;
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.credit_card_fee_waiver_sheet_progress_reached_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_fee_waiver_sheet_progress_reached_subtitle, v.k(clauseB, com.revolut.core.ui_kit.models.j.b(c7.Companion, localDate, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT))), null, 12), null, null, false, 28);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14);
        List listC = u.c(new RowDelegate.Model("id_spending_goal", null, new TextLocalisedClause(R$string.credit_card_fee_waiver_sheet_progress_reached_title, null, null, 14), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new d(textLocalisedClause2, listC, aVar2);
    }
}
