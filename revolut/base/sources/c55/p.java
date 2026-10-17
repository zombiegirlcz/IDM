package c55;

import aw0.c7;
import aw0.ka;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements m35.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m35.q f21454a;

    public p(m35.q loanTransactionCategoryIconMapper) {
        Intrinsics.checkNotNullParameter(loanTransactionCategoryIconMapper, "loanTransactionCategoryIconMapper");
        this.f21454a = loanTransactionCategoryIconMapper;
    }

    public final RowDelegate.Model a(q35.j instalment, b95.a product) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(instalment, "instalment");
        Intrinsics.checkNotNullParameter(product, "product");
        LocalDate localDate = instalment.e;
        if (localDate != null) {
            int i = R$string.credit_loan_next_repayment_progress_schedule_completed_value;
            com.revolut.core.ui_kit.models.j jVar = c7.Companion;
            LocalDateClause$DateFormat.DayAndMonth dayAndMonth = new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT);
            jVar.getClass();
            textLocalisedClause = new TextLocalisedClause(i, zhm.u.c(com.revolut.core.ui_kit.models.j.a(localDate, dayAndMonth, null)), null, 12);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.loan_management_details_scheduled_on, zhm.u.c(sx4.g.a(oc.c.F(instalment.f241828c))), null, 12);
        }
        String str = instalment.f241826a;
        l0 l0Var = (l0) this.f21454a;
        Intrinsics.checkNotNullParameter(product, "product");
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(l0Var.a(product), null, null, false, null, false, 62), new TextLocalisedClause(R$string.credit_common_next_repayment, null, null, 14), null, 0, textLocalisedClause, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(instalment.f.l(), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8), instalment.f241829g.k() ? new TextLocalisedClause(R$string.loan_management_details_interest_only, null, null, 14) : null, null, false, 124), false, null, false, null, null, null, null, null, null, instalment, null, 0, 0, 0, 0, 532675544);
    }
}
