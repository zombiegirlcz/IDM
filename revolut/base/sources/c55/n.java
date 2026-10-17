package c55;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.t0;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.list.CreditBottomSheetListItemsController;
import com.revolut.feature.credit.loan.api.mapper.LoanInterestRateTypeInfo;
import com.revolut.feature.credit.loan.api.models.rev10.LoanStampDuty;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements m35.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f21452a;

    public n(m loanCommonItemFactory) {
        Intrinsics.checkNotNullParameter(loanCommonItemFactory, "loanCommonItemFactory");
        this.f21452a = loanCommonItemFactory;
    }

    public final ActionsBottomSheetController a(LoanInterestRateTypeInfo rate) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedQuantityClause textLocalisedQuantityClause;
        Intrinsics.checkNotNullParameter(rate, "rate");
        boolean z = rate instanceof LoanInterestRateTypeInfo.TemporaryFixed;
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.loan_management_account_rate_temporary_fixed_term_info_title, zhm.u.c(Integer.valueOf(((LoanInterestRateTypeInfo.TemporaryFixed) rate).f70071a)), null, 12);
        } else {
            if (!(rate instanceof LoanInterestRateTypeInfo.Variable)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.loan_management_account_variable_interest_euribor_info_title, zhm.u.c(Integer.valueOf(((LoanInterestRateTypeInfo.Variable) rate).f70072a)), null, 12);
        }
        lw0.a aVar = new lw0.a(textLocalisedClause, null, null, null, false, 30);
        if (z) {
            int i = R$plurals.loan_management_account_rate_temporary_fixed_term_info_description;
            int i2 = ((LoanInterestRateTypeInfo.TemporaryFixed) rate).f70071a;
            textLocalisedQuantityClause = new TextLocalisedQuantityClause(i, Integer.valueOf(i2), zhm.v.k(Integer.valueOf(i2), Integer.valueOf(i2)), new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 8);
        } else {
            if (!(rate instanceof LoanInterestRateTypeInfo.Variable)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.loan_management_account_variable_interest_euribor_info_description, Integer.valueOf(((LoanInterestRateTypeInfo.Variable) rate).f70072a), (List) null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 12);
        }
        dii.i iVar = new dii.i(textLocalisedQuantityClause);
        aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
        k9 value = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, new AnalyticsProduct.Retail(value), null, iVar, 8));
    }

    public final CreditBottomSheetListItemsController b(LoanStampDuty stampDuty) {
        Intrinsics.checkNotNullParameter(stampDuty, "stampDuty");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.loan_management_details_stamp_duty, null, null, 14), new TextLocalisedClause(R$string.loan_management_details_stamp_duty_description, null, null, 14), null, null, false, 28);
        aim.e eVarB = zhm.u.b();
        aim.e eVarB2 = zhm.u.b();
        dj0.d dVar = stampDuty.f70182a;
        if (dVar != null) {
            eVarB2.add(new CellDetailsDelegate.Model("STAMP_DUTY_OVER_ACCRUED_INTEREST", new t0((Clause) new TextLocalisedClause(R$string.loan_management_details_stamp_duty_accrued_interest, null, null, 14), (Image) null, 0, false, 30), sx4.f.b(3, null, null, dVar), null, null, null, null, 0, null, false, false, null, null, 32760));
        }
        dj0.d dVar2 = stampDuty.f70183b;
        if (dVar2 != null) {
            eVarB2.add(new CellDetailsDelegate.Model("STAMP_DUTY_OVER_LATE_INTEREST", new t0((Clause) new TextLocalisedClause(R$string.loan_management_details_stamp_duty_late_repayment_interest, null, null, 14), (Image) null, 0, false, 30), sx4.f.b(3, null, null, dVar2), null, null, null, null, 0, null, false, false, null, null, 32760));
        }
        dj0.d dVar3 = stampDuty.f70184c;
        if (dVar3 != null) {
            eVarB2.add(new CellDetailsDelegate.Model("STAMP_DUTY_OVER_LATE_FEE", new t0((Clause) new TextLocalisedClause(R$string.loan_management_details_stamp_duty_late_fee, null, null, 14), (Image) null, 0, false, 30), sx4.f.b(3, null, null, dVar3), null, null, null, null, 0, null, false, false, null, null, 32760));
        }
        aim.e eVarA = zhm.u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        qv0.i iVarA = this.f21452a.a("STAMP_DUTY_BREAKDOWN_GOT_IT");
        yp0.b.r(iVarA, R$attr.uikit_dp16, 0, 0, 0, 14);
        eVarB.addAll(eVarA);
        eVarB.add(iVarA);
        aim.e eVarA2 = zhm.u.a(eVarB);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new CreditBottomSheetListItemsController(new cy4.a(aVar, eVarA2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
    }
}
