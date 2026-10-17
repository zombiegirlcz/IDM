package i75;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import d9.t0;
import g75.m;
import g75.n;
import ip0.ak0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x35.e;
import x35.f;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c45.b f159187a;

    public a(c45.b accountMapper) {
        Intrinsics.checkNotNullParameter(accountMapper, "accountMapper");
        this.f159187a = accountMapper;
    }

    @Override // g75.n
    public final m a(e account, f disclaimer, LoanDetails loanDetails) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_button_title, null, null, 14);
        aim.e eVarB = u.b();
        boolean zI = t0.i(loanDetails.f70150l);
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("BENEFICIARY_NAME_LIST_ITEM_ID", new aw0.t0(new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_details_name, null, null, 14), !zI ? null : new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, zI, 20), new TextClause(account.a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
        aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_details_account, null, null, 14), (Image) null, 0, false, 30);
        c45.b bVar = this.f159187a;
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("account_details_id", t0Var, bVar.g(account), null, null, null, null, 0, bVar.d(account), false, false, null, null, 31736);
        aw0.t0 t0Var2 = new aw0.t0((Clause) new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_details_iban, null, null, 14), (Image) null, 0, false, 30);
        Intrinsics.checkNotNullParameter(account, "account");
        List listK = v.k(model, model2, new CellDetailsDelegate.Model("iban_id", t0Var2, c45.b.a(account, w35.a.FORMATTED), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        eVarB.add(new TextDelegate.Model("disclaimer", new TextClause(disclaimer.f302656a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
        return new m(textLocalisedClause, null, textLocalisedClause2, u.a(eVarB), true);
    }

    @Override // g75.n
    public final m b(List defaultItems) {
        Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
        return new m(new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_title, null, null, 14), null, new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_button_title, null, null, 14), defaultItems, false);
    }

    @Override // g75.n
    public final m c(List defaultItems) {
        Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
        return new m(new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_title, null, null, 14), null, new TextLocalisedClause(R$string.loan_management_create_mandate_confirmation_button_title, null, null, 14), defaultItems, false);
    }
}
