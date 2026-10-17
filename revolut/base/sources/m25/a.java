package m25;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.impl.ui.account.creditcard.events.actions.CreditCardAccountActionParcel;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    @NotNull
    public static final C1145a Companion = new C1145a();

    /* JADX INFO: renamed from: m25.a$a, reason: collision with other inner class name */
    public static final class C1145a {
        private C1145a() {
        }
    }

    public static ProductAccountWidgetAction a(x15.m mVar) {
        if (!(mVar.f302292s instanceof xr7.c)) {
            return null;
        }
        return new ProductAccountWidgetAction(364, null, new TextLocalisedClause(R$string.credit_common_action_add_insurance, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_insurance, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new CreditCardAccountActionParcel.AddInsurance(mVar.f302280a), "id_action_cc_add_insurance", null, null, false, false);
    }

    public static ProductAccountWidgetAction b(String str, xi0.b bVar, boolean z, boolean z3) {
        if (!z || z3) {
            return null;
        }
        return new ProductAccountWidgetAction(364, null, new TextLocalisedClause(R$string.credit_common_action_display_amount, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_credit_bag, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new CreditCardAccountActionParcel.DisplayAmount(str, bVar), "id_action_cc_balance_display_toggle", null, null, false, false);
    }

    public static ProductAccountWidgetAction c(String str, boolean z) {
        if (z) {
            return null;
        }
        return new ProductAccountWidgetAction(364, null, new TextLocalisedClause(R$string.credit_card_account_action_change_due_date, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_calendar_date, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new CreditCardAccountActionParcel.ChangeDueDate(str), "id_action_change_due_date", null, null, false, false);
    }

    public static ProductAccountWidgetAction d(String str) {
        return new ProductAccountWidgetAction(364, null, new TextLocalisedClause(R$string.credit_common_action_get_help, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_help_chat, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new CreditCardAccountActionParcel.GetHelp(str), "id_action_get_help", null, null, false, false);
    }

    public static ProductAccountWidgetAction e(String str, yw4.l lVar) {
        return ce9.m.N(ProductAccountListAction.a(sfe.d.f262408c, null, false, new CreditCardAccountActionParcel.Details(str, lVar), 383));
    }

    public static ProductAccountWidgetAction f(String str) {
        return new ProductAccountWidgetAction(364, null, new TextLocalisedClause(R$string.credit_account_action_instalments, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_calendar_quarter, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new CreditCardAccountActionParcel.Instalment(str), "id_action_cc_instalment", null, null, false, false);
    }

    public static ProductAccountWidgetAction g(x15.m mVar) {
        xr7.a aVar;
        xr7.f fVar = mVar.f302292s;
        xr7.e eVar = fVar instanceof xr7.e ? (xr7.e) fVar : null;
        if (eVar == null || (aVar = (xr7.a) d0.d0(eVar.f308291a)) == null) {
            return null;
        }
        return new ProductAccountWidgetAction(364, null, new TextLocalisedClause(R$string.credit_common_action_insurance, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_insurance, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new CreditCardAccountActionParcel.Insurance(mVar.f302280a, aVar.f308287a), "id_action_cc_insurance", null, null, false, false);
    }

    public static ProductAccountWidgetAction h(CreditCardAccountActionParcel.Move move) {
        return new ProductAccountWidgetAction(364, null, new TextLocalisedClause(R$string.credit_common_action_move, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_shuffle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), move, "id_action_cc_details", null, null, false, false);
    }

    public static ProductAccountWidgetAction i(dj0.d dVar, String str, String str2) {
        return new ProductAccountWidgetAction(364, null, new TextLocalisedClause(R$string.credit_common_repay, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new CreditCardAccountActionParcel.Repay(dVar, str, str2), "id_action_cc_pay", null, null, false, false);
    }

    public static ProductAccountWidgetAction j(String str, boolean z) {
        if (z) {
            return null;
        }
        return new ProductAccountWidgetAction(364, null, new TextLocalisedClause(R$string.credit_common_action_statements, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_statement, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new CreditCardAccountActionParcel.Statement(str), "id_action_cc_statement", null, null, false, false);
    }

    public static ProductAccountWidgetAction k(String str, AdditionalCardholdersState additionalCardholdersState) {
        if (additionalCardholdersState instanceof AdditionalCardholdersState.Available) {
            return new ProductAccountWidgetAction(364, null, new TextLocalisedClause(R$string.credit_account_action_additional_cards, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_contacts_add, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ((AdditionalCardholdersState.Available) additionalCardholdersState).f69810b > 0 ? new CreditCardAccountActionParcel.AdditionalCards(str) : new CreditCardAccountActionParcel.AdditionalCardsOnboarding(str), "id_action_cc_additional_cards", null, null, false, false);
        }
        if (Intrinsics.f(additionalCardholdersState, AdditionalCardholdersState.NotAvailable.f69812a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static ProductAccountWidgetAction l(TextLocalisedClause textLocalisedClause, CreditCardAccountActionParcel creditCardAccountActionParcel) {
        sfe.f fVar = null;
        return new ProductAccountWidgetAction(364, null, textLocalisedClause, new ResourceImage(R$drawable.uikit_icn_24_calendar_recurring, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), creditCardAccountActionParcel, "id_action_cc_schedule_payment", fVar, null, false, false);
    }

    public static ProductAccountWidgetAction m(String str, CreditCardAutopayPayments creditCardAutopayPayments, boolean z) {
        if (z || creditCardAutopayPayments == null) {
            return null;
        }
        List list = creditCardAutopayPayments.d;
        if (creditCardAutopayPayments.a() != null) {
            return l(new TextLocalisedClause(R$string.credit_common_action_autopay, null, null, 14), !list.isEmpty() ? new CreditCardAccountActionParcel.AutoPaySettings(str) : new CreditCardAccountActionParcel.SetupAutoPay(str));
        }
        return l(new TextLocalisedClause(R$string.credit_account_action_auto_pay, null, null, 14), !list.isEmpty() ? new CreditCardAccountActionParcel.AutoPaySettings(str) : new CreditCardAccountActionParcel.SetupAutoPay(str));
    }

    public static CreditCardAccountActionParcel.Move n(x15.m mVar) {
        List list = mVar.f302290q;
        wi0.b bVar = mVar.f302289p;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return null;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (((yw4.g) it8.next()).f317317a == yw4.f.MOVE_MONEY) {
                yw4.o oVar = mVar.i;
                switch (oVar == null ? -1 : b.f201698b[oVar.ordinal()]) {
                    case -1:
                        return new CreditCardAccountActionParcel.Move.Available(mVar.f302281b);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        return new CreditCardAccountActionParcel.Move.Forbearance(bVar);
                    case 2:
                        return new CreditCardAccountActionParcel.Move.Overdue(mVar.f302284h.f69795g, mVar.f302280a, bVar);
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return null;
                }
            }
        }
        return null;
    }

    public static boolean o(ll4.o oVar, ll4.m mVar) {
        ll4.l lVar;
        List list;
        if (oVar == null || (lVar = oVar.f196526b) == null || (list = lVar.f196524a) == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (((ll4.m) it8.next()) == mVar) {
                return true;
            }
        }
        return false;
    }
}
