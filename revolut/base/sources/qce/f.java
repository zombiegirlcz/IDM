package qce;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import ip0.iq;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f244729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.b f244730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f244731c;

    public f(mae.h recurringPaymentsMapper, f01.c uiKitResources, t70.b currenciesLocalization, t0 unblockSubscriptionDialogProvider) {
        Intrinsics.checkNotNullParameter(recurringPaymentsMapper, "recurringPaymentsMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        Intrinsics.checkNotNullParameter(unblockSubscriptionDialogProvider, "unblockSubscriptionDialogProvider");
        this.f244729a = uiKitResources;
        this.f244730b = currenciesLocalization;
        this.f244731c = unblockSubscriptionDialogProvider;
    }

    public static List a(f fVar, String str, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, Object obj2, boolean z, int i) {
        Object obj3 = (i & 8) != 0 ? null : obj2;
        boolean z3 = (i & 16) != 0 ? true : z;
        fVar.getClass();
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        int i2 = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model(str, defaultFilledButton, null, textLocalisedClause, z3, null, obj3, R$attr.uikit_dp24, R$attr.uikit_dp8, i2, i2, 352);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
        int i3 = R$attr.uikit_dp16;
        return zhm.v.k(model, new LargeActionButtonDelegate.Model("BUTTON_CANCEL_LIST_ID", defaultFilledButton2, null, textLocalisedClause2, false, null, null, R$attr.uikit_dp8, R$attr.uikit_dp24, i3, i3, 496));
    }

    public static MoneyClause b(qua.p pVar) {
        Long l2 = pVar.f249323j;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        xi0.a aVar = xi0.b.Companion;
        String str = pVar.i;
        aVar.getClass();
        return new MoneyClause(new dj0.d(jLongValue, xi0.a.a(str)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }

    public final rp0.y c(qua.p subscription) {
        Pair pair;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        if (qua.u.C(subscription)) {
            pair = new Pair(new TextLocalisedClause(R$string.recurring_payment_details_dialog_cancel_pix_mandate_title, null, null, 14), new TextLocalisedClause(R$string.recurring_payment_details_dialog_cancel_pix_mandate_subtitle, null, null, 14));
        } else if (qua.u.x(subscription)) {
            List listC = zhm.u.c(hx7.l.f(subscription));
            pair = new Pair(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_cancel_subscription_confirmation_payto_title, listC, null, 12), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_cancel_subscription_confirmation_payto_subtitle, listC, null, 12));
        } else {
            List listC2 = zhm.u.c(hx7.l.f(subscription));
            pair = new Pair(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_cancel_subscription_confirmation_title, listC2, null, 12), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_cancel_subscription_confirmation_upi_subtitle, listC2, null, 12));
        }
        return new rp0.y(a(this, "BUTTON_CANCEL_SUBSCRIPTION_LIST_ID", new TextLocalisedClause(R$string.recurring_payment_details_dialog_cancel_pix_mandate_cta_button_positive, null, null, 14), new TextLocalisedClause(R$string.recurring_payment_details_dialog_cancel_pix_mandate_cta_button_negative, null, null, 14), null, false, 24), new rp0.t((Clause) pair.f186385a, (Clause) pair.f186386b, null, 28), null, null, null, null, "SUBSCRIPTION_ACTIONS_DELEGATES_KEY", null, null, null, 3836);
    }

    public final rp0.y d(qua.p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_action_cancel_direct_debit_title, null, null, 14);
        int i = R$string.recurring_payment_details_action_cancel_direct_debit_message;
        String str = subscription.k;
        if (str == null) {
            str = "";
        }
        return new rp0.y(a(this, "BUTTON_CANCEL_SUBSCRIPTION_LIST_ID", new TextLocalisedClause(R$string.recurring_payment_details_action_cancel_direct_debit_confirm, null, null, 14), new TextLocalisedClause(R$string.recurring_dialog_action_cancel, null, null, 14), null, false, 24), new rp0.t(textLocalisedClause, new TextLocalisedClause(i, zhm.u.c(str), null, 12), null, 28), null, null, null, null, "SUBSCRIPTION_ACTIONS_DELEGATES_KEY", null, null, null, 3836);
    }

    public final rp0.y e(qua.p subscription, boolean z) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        int i = R$string.recurring_payment_details_action_cancel_nz_direct_debit_title;
        String str = subscription.k;
        if (str == null) {
            str = "";
        }
        rp0.t tVar = new rp0.t(new TextLocalisedClause(i, zhm.u.c(str), null, 12), new TextLocalisedClause(R$string.recurring_payment_details_action_cancel_nz_direct_debit_description, null, null, 14), null, 28);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_action_cancel_nz_direct_debit_checkbox_title, null, null, 14);
        iq iqVar = iq.CHECK_BUTTON;
        int i2 = R$attr.uikit_dp16;
        return new rp0.y(zhm.d0.E0(a(this, "BUTTON_DEACTIVATE_NZ_DIRECT_DEBIT_LIST_ID", new TextLocalisedClause(R$string.recurring_payment_details_action_cancel_nz_direct_debit_confirm, null, null, 14), new TextLocalisedClause(R$string.recurring_payment_details_action_cancel_nz_direct_debit_decline, null, null, 14), null, z, 8), zhm.u.c(new InputChecklistDelegate.Model("CHECKBOX_NZ_DIRECT_DEBIT_CONTACTED_LIST_ID", textLocalisedClause, z, false, null, iqVar, null, null, null, null, 0, i2, i2, 511960))), tVar, null, null, null, null, "SUBSCRIPTION_ACTIONS_DELEGATES_KEY", null, null, null, 3836);
    }

    public final rp0.y f(qua.p subscription, boolean z) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.subscription_unblock_confirmation_nz_direct_debit_title, null, null, 14), null, null, 30);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.subscription_unblock_confirmation_nz_direct_debit_check_title, null, null, 14);
        iq iqVar = iq.CHECK_BUTTON;
        int i = R$attr.uikit_dp16;
        return new rp0.y(zhm.d0.E0(a(this, "BUTTON_ACTIVATE_NZ_DIRECT_DEBIT_LIST_ID", new TextLocalisedClause(R$string.subscription_unblock_confirmation_nz_direct_debit_unblock_button, null, null, 14), new TextLocalisedClause(R$string.subscription_unblock_confirmation_nz_direct_debit_go_back_button, null, null, 14), null, z, 8), zhm.u.c(new InputChecklistDelegate.Model("CHECKBOX_NZ_DIRECT_DEBIT_REACTIVATED_LIST_ID", textLocalisedClause, z, false, null, iqVar, null, null, null, null, 0, i, i, 511960))), tVar, null, null, null, null, "SUBSCRIPTION_ACTIONS_DELEGATES_KEY", null, null, null, 3836);
    }
}
