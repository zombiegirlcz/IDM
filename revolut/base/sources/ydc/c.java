package ydc;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment_options.PayLaterOffer;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.shared.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import s6c.l;
import s6c.p;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public c(kdc.d expandableDisclaimerConfigurationMapper) {
        Intrinsics.checkNotNullParameter(expandableDisclaimerConfigurationMapper, "expandableDisclaimerConfigurationMapper");
    }

    public static CellDetailsDelegate.Model a(PayLaterOffer payLaterOffer) {
        TextLocalisedClause textLocalisedClause;
        int i = b.f312672a[payLaterOffer.f84354b.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_order_summary_amounts_due_today, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_order_summary_amounts_due_today_installment, u.c(Integer.valueOf(payLaterOffer.f84356g.size())), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
        }
        return new CellDetailsDelegate.Model("DUE_TODAY_AMOUNT_LIST_ID", textLocalisedClause, new MoneyClause(payLaterOffer.a(), new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public static boolean d(i iVar) {
        PaymentMethod paymentMethod = (PaymentMethod) iVar.f224257a;
        if ((paymentMethod instanceof PaymentMethod.RevolutAccount) || (paymentMethod instanceof PaymentMethod.Card) || (paymentMethod instanceof PaymentMethod.BankAccount) || paymentMethod == null) {
            return false;
        }
        if (!(paymentMethod instanceof PaymentMethod.Pocket)) {
            throw new NoWhenBranchMatchedException();
        }
        PaymentMethod.Pocket pocket = (PaymentMethod.Pocket) paymentMethod;
        return !Intrinsics.f(pocket.f84381j.f115083b, pocket.i.f115083b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qv0.i b(s6c.l r27, od0.i r28, n6c.a r29, com.revolut.feature.revolutpay.api.shared.domain.models.payment_options.PayLaterOffer r30) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ydc.c.b(s6c.l, od0.i, n6c.a, com.revolut.feature.revolutpay.api.shared.domain.models.payment_options.PayLaterOffer):qv0.i");
    }

    public final aim.e c(i paymentMethod, l amount, n6c.a userCompanyEntity) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(userCompanyEntity, "userCompanyEntity");
        aim.e eVarB = u.b();
        dj0.d dVarB = amount.b();
        if (dVarB != null) {
            eVarB.add(new CellDetailsDelegate.Model("SHIPPING_AMOUNT_LIST_ID", new TextLocalisedClause(R$string.revolut_pay_order_summary_amounts_shipping, null, null, 14), new MoneyClause(dVarB, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        }
        p pVarE = amount.e();
        if (pVarE != null && (dVar = pVarE.f260233b) != null) {
            eVarB.add(new CellDetailsDelegate.Model("DISCOUNT_AMOUNT_LIST_ID", new TextLocalisedClause(R$string.revolut_pay_order_summary_amounts_rev_points_discount, null, null, 14), new MoneyClause(dVar.l(), new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        }
        aim.e eVarA = u.a(eVarB);
        PayLaterOffer payLaterOfferG = amount.g();
        aim.e eVarB2 = u.b();
        if (!eVarA.isEmpty()) {
            eVarB2.add(new CellDetailsDelegate.Model("SUBTOTAL_AMOUNT_LIST_ID", new TextLocalisedClause(R$string.revolut_pay_order_summary_amounts_subtotal, null, null, 14), new MoneyClause(amount.c(), new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
            eVarB2.addAll(eVarA);
        }
        t6c.b bVar = payLaterOfferG != null ? payLaterOfferG.f84354b : null;
        int i = bVar == null ? -1 : b.f312672a[bVar.ordinal()];
        if (i != -1) {
            if (i == 1) {
                eVarB2.add(a(payLaterOfferG));
                eVarB2.add(b(amount, paymentMethod, userCompanyEntity, payLaterOfferG));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                eVarB2.add(b(amount, paymentMethod, userCompanyEntity, payLaterOfferG));
                eVarB2.add(a(payLaterOfferG));
            }
        } else if (!eVarA.isEmpty() || d(paymentMethod)) {
            eVarB2.add(b(amount, paymentMethod, userCompanyEntity, null));
        }
        return u.a(eVarB2);
    }
}
