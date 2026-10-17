package vkb;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.common.sole_tax_residency.SoleTaxResidencyConfirmationContract$TaxResidencyParcel;
import com.revolut.revolut.feature_fourthline_impl.R;
import do3.n;
import do3.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.common.sole_tax_residency.b f289897b;

    public /* synthetic */ b(com.revolut.feature.retail.savings.impl.common.sole_tax_residency.b bVar, int i) {
        this.f289896a = i;
        this.f289897b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f289896a) {
            case 0:
                n user = (n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                com.revolut.feature.retail.savings.impl.common.sole_tax_residency.b bVar = this.f289897b;
                j60.a aVar = bVar.f83209m;
                com.revolut.feature.retail.savings.impl.common.sole_tax_residency.a aVar2 = bVar.f83210n;
                wi0.b countryCode = q.y(user);
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                t tVar = new t(new TextLocalisedClause(R$string.tax_residency_provide_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_strongbox_sole_tax_bottom_sheet_description, u.c(countryCode.f297794a), null, 12), null, 28);
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ADD_TAX_RESIDENCY_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_add, null, null, 14), false, null, null, SoleTaxResidencyConfirmationContract$TaxResidencyParcel.SetTaxResidency.f83206a, null, 744);
                yp0.b.r(model, 0, 0, 0, 0, 15);
                LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("CANCEL_DIALOG_BUTTON_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), false, null, null, SoleTaxResidencyConfirmationContract$TaxResidencyParcel.Cancel.f83205a, null, 744);
                yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
                return aVar.G(new y(v.k(model, model2), tVar, null, null, null, null, "SOLE_TAX_RESIDENCY_DIALOG_ID", null, null, null, 3836));
            default:
                n user2 = (n) obj2;
                Intrinsics.checkNotNullParameter(user2, "user");
                com.revolut.feature.retail.savings.impl.common.sole_tax_residency.b bVar2 = this.f289897b;
                j60.a aVar3 = bVar2.f83209m;
                com.revolut.feature.retail.savings.impl.common.sole_tax_residency.a aVar4 = bVar2.f83210n;
                wi0.b countryCode2 = q.y(user2);
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("OPEN_SETTINGS_DIALOG_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_add, null, null, 14), false, null, null, new SoleTaxResidencyConfirmationContract$TaxResidencyParcel.SetTin(countryCode2), null, 744);
                yp0.b.r(model3, 0, 0, 0, 0, 15);
                LargeActionButtonDelegate.Model model4 = new LargeActionButtonDelegate.Model("CANCEL_DIALOG_BUTTON_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), false, null, null, SoleTaxResidencyConfirmationContract$TaxResidencyParcel.Cancel.f83205a, null, 744);
                yp0.b.r(model4, 0, R$attr.uikit_dp24, 0, 0, 13);
                return aVar3.G(new y(v.k(model3, model4), new t(new TextLocalisedClause(R$string.savings_eligibility_tin_number_provide_title, null, null, 14), new TextLocalisedClause(R$string.savings_eligibility_tin_number_provide_explanation, v.k(new TextLocalisedClause(R$string.savings_eligibility_tin_number_provide_learn_more, null, new Click(30, (Integer) null, (Object) null, "TIN_FAQ_ID", false), 10), new TextLocalisedClause(R$string.savings_eligibility_tin_number_provide_learn_how, null, new Click(30, (Integer) null, (Object) null, "PRIVACY_POLICY_ID", false), 10)), null, 12), null, 28), null, null, null, null, "SOLE_TAX_RESIDENCY_DIALOG_ID", null, null, null, 3836));
        }
    }
}
