package m65;

import aw0.o9;
import aw0.t0;
import aw0.u0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import g75.m;
import g75.n;
import ip0.ej;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;
import mx0.d7;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c45.b f203010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ky4.c f203011b;

    public a(c45.b accountMapper, ky4.c numberFormatter) {
        Intrinsics.checkNotNullParameter(accountMapper, "accountMapper");
        Intrinsics.checkNotNullParameter(numberFormatter, "numberFormatter");
        this.f203010a = accountMapper;
        this.f203011b = numberFormatter;
    }

    @Override // g75.n
    public final m a(x35.e account, x35.f disclaimer, LoanDetails loanDetails) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_description, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_button_confirm, null, null, 14);
        aim.e eVarB = u.b();
        aim.e eVarB2 = u.b();
        eVarB2.add(new CellDetailsDelegate.Model("BENEFICIARY_NAME_LIST_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_details_name, null, null, 14), (Image) null, 0, false, 28), new TextClause(account.a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760));
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_details_bank, null, null, 14), (Image) null, 0, false, 30);
        c45.b bVar = this.f203010a;
        eVarB2.add(new CellDetailsDelegate.Model("account_details_id", t0Var, bVar.g(account), null, null, null, null, 0, bVar.d(account), false, false, null, null, 31736));
        t0 t0Var2 = new t0((Clause) new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_details_iban, null, null, 14), (Image) null, 0, false, 30);
        TextClause textClause = new TextClause(account.b().b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        u0 u0Var = u0.LARGE;
        eVarB2.add(new CellDetailsDelegate.Model("iban_id", t0Var2, textClause, null, null, null, u0Var, 0, null, false, false, null, null, 32504));
        if (account instanceof x35.b) {
            eVarB2.add(new CellDetailsDelegate.Model("list_id_mandate_reference", new t0((Clause) new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_details_mandate_reference, null, null, 14), (Image) null, 0, false, 28), new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_details_mandate_reference_value, u.c(((x35.b) account).e), null, 12), null, null, null, u0Var, 0, null, false, false, null, null, 32504));
        }
        eVarB2.add(new CellDetailsDelegate.Model("repayment_amount_id", new t0((Clause) new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_details_repayment_amount, null, null, 14), (Image) null, 0, false, 30), sx4.f.b(3, null, null, loanDetails.f70148h), null, null, null, null, 0, null, false, false, null, null, 32760));
        eVarB2.add(new CellDetailsDelegate.Model("repayment_day_id", new t0((Clause) new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_details_repayment_day, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.loan_management_account_repayment_date_detailed, u.c(new TextClause(this.f203011b.a(Integer.valueOf(loanDetails.f70146c)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        aim.e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        ej ejVar = new ej("dd_mandate_confirmation_disclaimer", new c7(new TextClause(disclaimer.f302656a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, d7.DEFAULT, 2));
        yp0.b.r(ejVar, 0, 0, 0, 0, 15);
        eVarB.add(ejVar);
        return new m(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, u.a(eVarB), true);
    }

    @Override // g75.n
    public final m b(List defaultItems) {
        Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
        return new m(new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_description, null, null, 14), null, defaultItems, false);
    }

    @Override // g75.n
    public final m c(List defaultItems) {
        Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
        return new m(new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_description, null, null, 14), null, defaultItems, false);
    }
}
