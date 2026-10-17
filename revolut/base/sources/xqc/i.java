package xqc;

import aw0.o9;
import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.salary_switch.impl.R$string;
import com.revolut.feature.salary_switch.impl.models.v2.PayrollSwitchCounterparty;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("CELL_DETAILS_EMPLOYER_NAME_ID", new t0((Clause) new TextLocalisedClause(R$string.salary_switch_br_review_details_item_employer_name, null, null, 14), (Image) null, 0, false, 30), new TextClause(domainState.f308147a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 28664);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("CELL_DETAILS_CNPJ_NUMBER_ID", new t0((Clause) new TextLocalisedClause(R$string.salary_switch_br_review_details_item_cnpj_number, null, null, 14), (Image) null, 0, false, 30), new TextClause(domainState.f308148b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 28664);
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.salary_switch_br_review_details_item_salary_bank, null, null, 14), (Image) null, 0, false, 30);
        PayrollSwitchCounterparty payrollSwitchCounterparty = domainState.f308149c;
        List listK = v.k(model, model2, new CellDetailsDelegate.Model("CELL_DETAILS_SALARY_BANK_NAME_ID", t0Var, new TextClause(payrollSwitchCounterparty.f85249b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, nqc.a.a(payrollSwitchCounterparty), false, false, null, null, 27640));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new f(listK);
    }
}
