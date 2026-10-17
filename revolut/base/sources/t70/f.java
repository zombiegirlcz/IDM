package t70;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f268389a = zhm.v.k("bank.details.", "bank.transfer.beneficiary.account.field.", "beneficiary_creation.field.", "business.error.api.", "business_sign_up.application.business_owners.role_in_company.", "card.brand.", "chat.agent.bio.", "common.error.title", "country_name_with_article.", "credit.card.cashback.transaction.disbursed", "credit.card.cashback.transaction.earned", "credit.refinancing.direct_disbursal.title", "credit.refinancing.internal_refinancing_excess.title", "credit.transaction.", "currency.", "error.api.", "error.generic", "error.topup.", "nationality.", "onboarding.application.step.", "onboarding.associates.corporate_structure_overview.", "onboarding.associates.create_popup.", "onboarding.associates.list.", "onboarding.associates.questionnaire.", "onboarding.associates.verify_details.", "onboarding.incorporation.company_tin.", "onboarding.incorporation.personal_tin.", "onboarding.incorporation.reg_number.", "onboarding.jurisdiction.", "price_plan.vat.input_", "region_", "revolut_pay.payment_method.savings.", "savings.mmf.interest.gained", "sign_up.incorporation.banner.", "sign_up.incorporation.registration_number.", "top_up.card.error.", "topup.decline_reason.", "transaction.description.", "transaction.list.reason.", "transaction.reason.", "transactionUI.transaction.pay_later.refund.title", "transactionUI.transaction.pay_later.repayment.generic_title", "vaults.saving_accounts.interest.gained", "wealth.trading.recurring_buy_hub_collections.security");

    public static final class a {
        private a() {
        }
    }

    public static void a(String stringResourceId) {
        Intrinsics.checkNotNullParameter(stringResourceId, "stringResourceId");
        try {
            List list = f268389a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    if (a0.H(stringResourceId, (String) it8.next(), false)) {
                        break;
                    }
                }
            }
            u uVar = new u(stringResourceId, 0);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, uVar, h0Var);
            Unit unit = Unit.f186387a;
        } catch (Exception e) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var2);
        }
    }
}
