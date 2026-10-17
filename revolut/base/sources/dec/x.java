package dec;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.shared.R$string;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f113382a;

    public x(y pocketMapper) {
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        this.f113382a = pocketMapper;
    }

    public final aim.e a(u6c.s identifier, List pocketList, PaymentMethod paymentMethod, boolean z, u6c.y savingsAccountProductName) throws IOException {
        String strK0;
        Clause clauseM;
        int i;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(pocketList, "pocketList");
        Intrinsics.checkNotNullParameter(savingsAccountProductName, "savingsAccountProductName");
        aim.e eVarB = zhm.u.b();
        boolean z3 = identifier instanceof u6c.q;
        if (z3) {
            strK0 = "WALLET_POCKET_LIST_SUBHEADER_FAVOURITES";
        } else {
            if (!(identifier instanceof com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.l)) {
                throw new NoWhenBranchMatchedException();
            }
            aim.e eVarB2 = zhm.u.b();
            eVarB2.add("WALLET_POCKET_LIST_SUBHEADER");
            com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.l lVar = (com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.l) identifier;
            eVarB2.add(lVar.f84407a.name());
            eVarB2.add(lVar.f84408b.name());
            if (lVar.f84409c) {
                eVarB2.add("PRO");
            }
            strK0 = d0.k0(zhm.u.a(eVarB2), "_", null, null, 0, null, 62);
        }
        String str = strK0;
        if (identifier instanceof com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.l) {
            switch (w.f113381a[((com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.l) identifier).f84408b.ordinal()]) {
                case 1:
                    clauseM = new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_group_title_accounts, null, null, 14);
                    break;
                case 2:
                    clauseM = new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_group_title_pockets, null, null, 14);
                    break;
                case 3:
                    clauseM = new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_group_title_credit, null, null, 14);
                    break;
                case 4:
                    clauseM = new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_group_title_crypto, null, null, 14);
                    break;
                case 5:
                    clauseM = new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_group_title_commodities, null, null, 14);
                    break;
                case 6:
                    Intrinsics.checkNotNullParameter(savingsAccountProductName, "<this>");
                    if (Intrinsics.f(savingsAccountProductName, u6c.v.f277579a)) {
                        i = R$string.revolut_pay_order_summary_payment_method_interest;
                    } else if (Intrinsics.f(savingsAccountProductName, u6c.w.f277580a)) {
                        i = R$string.revolut_pay_order_summary_payment_method_savings;
                    } else {
                        if (!Intrinsics.f(savingsAccountProductName, u6c.x.f277581a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R$string.revolut_pay_order_summary_payment_method_savings_and_funds;
                    }
                    clauseM = new TextLocalisedClause(i, null, null, 14);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!z3) {
                throw new NoWhenBranchMatchedException();
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_section_title_favourites, null, null, 14);
            int i2 = R$drawable.uikit_icn_24_star_filled;
            ImageClauseTint.Color color = new ImageClauseTint.Color(R$attr.uikit_colorGreyTone50);
            Float fValueOf = Float.valueOf(16.0f);
            clauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(textLocalisedClause, new ImageClause(i2, color, fValueOf, fValueOf, 16)));
        }
        eVarB.add(new ListSubheaderDelegate.Model(str, (Image) null, clauseM, (Image) null, (Clause) new ImageClause(z ? R$drawable.uikit_icn_24_chevron_down : R$drawable.uikit_icn_24_chevron_up, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (Float) null, (Float) null, 28), (String) null, (ListSubheaderDelegate.Model.a) ListSubheaderDelegate.Model.a.C0411a.f52724a, false, false, z ? new bec.e(identifier) : new bec.d(identifier), (Parcelable) null, R$attr.uikit_dp12, 0, 0, 0, 60330));
        if (!z) {
            PaymentMethod.Pocket pocket = paymentMethod instanceof PaymentMethod.Pocket ? (PaymentMethod.Pocket) paymentMethod : null;
            String str2 = pocket != null ? pocket.f84376a : null;
            Iterator it8 = pocketList.iterator();
            while (it8.hasNext()) {
                PaymentMethod.Pocket pocket2 = (PaymentMethod.Pocket) it8.next();
                eVarB.add(this.f113382a.a(pocket2, Intrinsics.f(pocket2.f84376a, str2), new s(false, z3)));
            }
        }
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.k(eVarA, R$attr.uikit_dp8, R$attr.uikit_dp0, 0, 0, 28);
        return eVarA;
    }
}
