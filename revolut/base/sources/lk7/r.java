package lk7;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance.api.models.details.CFACExcess;
import com.revolut.feature.insurance.api.models.details.CFACProductDetails;
import com.revolut.feature.insurance.api.models.details.CFACReimbursement;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementLimits;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import com.revolut.feature.insurance.impl.R$string;
import ip0.pb0;
import ip0.s7;
import java.math.BigDecimal;
import java.util.AbstractList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, dj0.d dVar, Integer num) {
        Clause percentageClause;
        if (dVar != null) {
            percentageClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        } else {
            if (num == null) {
                throw new IllegalStateException("CFAC excess must have money or percentage value");
            }
            percentageClause = new PercentageClause(new BigDecimal(num.intValue()), (PercentageClause.Format) null, (Style) null, 6);
        }
        return new CellDetailsDelegate.Model(str, textLocalisedClause, percentageClause, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public static AbstractList c(CFACReimbursementType reimbursementType, ListSubheaderDelegate.Model model) {
        String str;
        Intrinsics.checkNotNullParameter(reimbursementType, "reimbursementType");
        int i = s.f196296a[reimbursementType.ordinal()];
        if (i == 1) {
            str = "ID_FULL_REIMBURSEMENT_HEADER";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "ID_PARTIAL_REIMBURSEMENT_HEADER";
        }
        aim.e eVarB = zhm.u.b();
        eVarB.add(new pb0(str));
        for (int i2 = 0; i2 < 4; i2++) {
            eVarB.add(new s7(a0.d.n("loading_limit_cell_", i2), 0, 0, 0, 0, false, null, 126));
        }
        aim.e eVarA = zhm.u.a(eVarB);
        if (model != null) {
            return yp0.b.g(eVarA, model, null, 0, 0, 126);
        }
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    public final AbstractList b(CFACProductDetails productDetails, CFACReimbursementType reimbursementType, boolean z, ListSubheaderDelegate.Model model) {
        CFACReimbursement cFACReimbursement;
        String str;
        CFACReimbursement cFACReimbursement2;
        aim.e eVar;
        int i;
        CFACReimbursementLimits cFACReimbursementLimits;
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        Intrinsics.checkNotNullParameter(reimbursementType, "reimbursementType");
        int[] iArr = s.f196296a;
        int i2 = iArr[reimbursementType.ordinal()];
        if (i2 == 1) {
            cFACReimbursement = productDetails.e;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cFACReimbursement = productDetails.f;
        }
        int i3 = iArr[reimbursementType.ordinal()];
        if (i3 == 1) {
            str = "ID_FULL_REIMBURSEMENT_HEADER";
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "ID_PARTIAL_REIMBURSEMENT_HEADER";
        }
        String str2 = str;
        aim.e eVarB = zhm.u.b();
        int i5 = R$string.cfac_policy_details_limits_group_title;
        long j2 = cFACReimbursement.f75007a;
        CFACReimbursementLimits cFACReimbursementLimits2 = cFACReimbursement.f75008b;
        eVarB.add(new RowDelegate.Model(str2, null, new TextLocalisedClause(i5, zhm.u.c(new PercentageClause(new BigDecimal(j2), (PercentageClause.Format) null, (Style) null, 6)), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868858));
        if (z) {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.cfac_policy_limit_cancellation_reason_title, null, null, 14);
            int i6 = iArr[reimbursementType.ordinal()];
            if (i6 == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.cfac_policy_details_limits_cancellation_reason_eligibility_list, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.cfac_policy_details_limits_cancellation_reason_any, null, null, 14);
            }
            cFACReimbursement2 = cFACReimbursement;
            i = 14;
            TextLocalisedClause textLocalisedClause3 = textLocalisedClause;
            eVar = eVarB;
            cFACReimbursementLimits = cFACReimbursementLimits2;
            eVar.add(new CellDetailsDelegate.Model("ID_ITEM_CANCELLATION_REASON", textLocalisedClause2, textLocalisedClause3, null, null, false, 0, null, reimbursementType, null, null, 0, null, false, null, 0, 0, 0, 0, 1048040));
        } else {
            cFACReimbursement2 = cFACReimbursement;
            eVar = eVarB;
            i = 14;
            cFACReimbursementLimits = cFACReimbursementLimits2;
        }
        CFACReimbursementLimits cFACReimbursementLimits3 = cFACReimbursementLimits;
        eVar.add(a(a0.d.r(reimbursementType.name(), "_per_claim"), new TextLocalisedClause(R$string.cfac_policy_details_limits_refund_limit_per_claim, null, null, i), cFACReimbursementLimits3.f75012b, null));
        eVar.add(a(a0.d.r(reimbursementType.name(), "_per_year"), new TextLocalisedClause(R$string.cfac_policy_details_limits_yearly_limit, null, null, i), cFACReimbursementLimits3.f75011a, null));
        String strR = a0.d.r(reimbursementType.name(), "_excess");
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.cfac_policy_details_limits_excess_payable, null, null, i);
        CFACExcess cFACExcess = cFACReimbursement2.f75009c;
        eVar.add(a(strR, textLocalisedClause4, cFACExcess.f74986a, cFACExcess.f74987b));
        aim.e eVarA = zhm.u.a(eVar);
        if (model != null) {
            return yp0.b.g(eVarA, model, null, 0, 0, 126);
        }
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }
}
