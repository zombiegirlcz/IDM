package com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog;

import aw0.e;
import aw0.f;
import aw0.g;
import aw0.h;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.SubscriptionDetailsDialogControllerContract$SubscriptionOwner;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import dj0.d;
import fce.a0;
import fce.i;
import fce.k;
import fce.l;
import fce.m;
import fce.q;
import fce.r;
import fce.s;
import fce.t;
import fce.v;
import fce.w;
import fce.x;
import fce.y;
import ip0.iq;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import qua.p;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static MoneyClause a(p pVar) {
        Long l2 = pVar.f249323j;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        xi0.a aVar = xi0.b.Companion;
        String str = pVar.i;
        aVar.getClass();
        return new MoneyClause(new d(jLongValue, xi0.a.a(str)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }

    public static h b(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, boolean z) {
        m6 m6Var = n6.Companion;
        return new h(false, m6.c(m6Var, textLocalisedClause, LargeActionButton.ButtonStyle.f58725a, null, null, z, null, null, null, 988), m6.c(m6Var, textLocalisedClause2, LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Integer numValueOf;
        Pair pair;
        TextLocalisedClause textLocalisedClause3;
        y domainState = (y) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState instanceof x) {
            p pVar = ((x) domainState).f133726a;
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.subscriptions_dialog_unblock_future_payments_title, null, null, 14);
            int i = R$string.subscriptions_dialog_unblock_future_payments_subtitle;
            String str = pVar.k;
            return new cii.b(b(new TextLocalisedClause(R$string.subscriptions_dialog_unblock_future_payments_positive, null, null, 14), new TextLocalisedClause(R$string.subscriptions_dialog_unblock_future_payments_negative, null, null, 14), true), f0.f322471a, new lw0.a(textLocalisedClause4, new TextLocalisedClause(i, u.c(str != null ? str : ""), null, 12), null, null, false, 28));
        }
        if (domainState instanceof fce.h) {
            p pVar2 = ((fce.h) domainState).f133705a;
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.subscriptions_dialog_block_future_payments_title, null, null, 14);
            int i2 = R$string.subscriptions_dialog_block_future_payments_description;
            String str2 = pVar2.k;
            return new cii.b(b(new TextLocalisedClause(R$string.subscriptions_dialog_block_future_payments_positive, null, null, 14), new TextLocalisedClause(R$string.subscriptions_dialog_block_future_payments_negative, null, null, 14), true), f0.f322471a, new lw0.a(textLocalisedClause5, new TextLocalisedClause(i2, u.c(str2 != null ? str2 : ""), null, 12), null, null, false, 28));
        }
        if (domainState instanceof v) {
            p pVar3 = ((v) domainState).f133723a;
            TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.subscriptions_dialog_unblock_future_payments_title, null, null, 14);
            int i3 = R$string.subscriptions_dialog_unblock_future_payments_subtitle;
            String str3 = pVar3.k;
            return new cii.b(b(new TextLocalisedClause(R$string.subscriptions_dialog_unblock_future_payments_positive, null, null, 14), new TextLocalisedClause(R$string.subscriptions_dialog_unblock_future_payments_negative, null, null, 14), true), f0.f322471a, new lw0.a(textLocalisedClause6, new TextLocalisedClause(i3, u.c(str3 != null ? str3 : ""), null, 12), null, null, false, 28));
        }
        if (domainState instanceof k) {
            p pVar4 = ((k) domainState).f133709a;
            TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.recurring_payment_details_action_cancel_direct_debit_title, null, null, 14);
            int i5 = R$string.recurring_payment_details_action_cancel_direct_debit_message;
            String str4 = pVar4.k;
            return new cii.b(b(new TextLocalisedClause(R$string.recurring_payment_details_action_cancel_direct_debit_confirm, null, null, 14), new TextLocalisedClause(R$string.recurring_dialog_action_cancel, null, null, 14), true), f0.f322471a, new lw0.a(textLocalisedClause7, new TextLocalisedClause(i5, u.c(str4 != null ? str4 : ""), null, 12), null, null, false, 28));
        }
        if (domainState instanceof i) {
            i iVar = (i) domainState;
            p pVar5 = iVar.f133706a;
            boolean z = iVar.f133707b;
            int i6 = R$string.recurring_payment_details_action_cancel_nz_direct_debit_title;
            String str5 = pVar5.k;
            lw0.a aVar = new lw0.a(new TextLocalisedClause(i6, u.c(str5 != null ? str5 : ""), null, 12), new TextLocalisedClause(R$string.recurring_payment_details_action_cancel_nz_direct_debit_description, null, null, 14), null, null, false, 28);
            h hVarB = b(new TextLocalisedClause(R$string.recurring_payment_details_action_cancel_nz_direct_debit_confirm, null, null, 14), new TextLocalisedClause(R$string.recurring_payment_details_action_cancel_nz_direct_debit_decline, null, null, 14), z);
            TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(R$string.recurring_payment_details_action_cancel_nz_direct_debit_checkbox_title, null, null, 14);
            iq iqVar = iq.CHECK_BUTTON;
            int i21 = R$attr.uikit_dp16;
            return new cii.b(hVarB, u.c(new InputChecklistDelegate.Model("CHECKBOX_NZ_DIRECT_DEBIT_CONTACTED_LIST_ID", textLocalisedClause8, z, false, null, iqVar, null, null, null, null, 0, i21, i21, 511960)), aVar);
        }
        if (domainState instanceof w) {
            boolean z3 = ((w) domainState).f133725b;
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.subscription_unblock_confirmation_nz_direct_debit_title, null, null, 14), null, null, null, false, 30);
            h hVarB2 = b(new TextLocalisedClause(R$string.subscription_unblock_confirmation_nz_direct_debit_unblock_button, null, null, 14), new TextLocalisedClause(R$string.subscription_unblock_confirmation_nz_direct_debit_go_back_button, null, null, 14), z3);
            TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(R$string.subscription_unblock_confirmation_nz_direct_debit_check_title, null, null, 14);
            iq iqVar2 = iq.CHECK_BUTTON;
            int i22 = R$attr.uikit_dp16;
            return new cii.b(hVarB2, u.c(new InputChecklistDelegate.Model("CHECKBOX_NZ_DIRECT_DEBIT_REACTIVATED_LIST_ID", textLocalisedClause9, z3, false, null, iqVar2, null, null, null, null, 0, i22, i22, 511960)), aVar2);
        }
        if (domainState instanceof m) {
            p pVar6 = ((m) domainState).f133711a;
            int i32 = R$string.recurring_dialog_deactivate_title;
            String str6 = pVar6.k;
            return new cii.b(b(new TextLocalisedClause(R$string.recurring_dialog_action_deactivate, null, null, 14), new TextLocalisedClause(R$string.recurring_dialog_action_cancel, null, null, 14), true), f0.f322471a, new lw0.a(new TextLocalisedClause(i32, u.c(str6 != null ? str6 : ""), null, 12), new TextLocalisedClause(R$string.recurring_dialog_deactivate_text, u.c(a(pVar6)), null, 12), null, null, false, 28));
        }
        if (domainState instanceof s) {
            SubscriptionDetailsDialogControllerContract$SubscriptionOwner subscriptionDetailsDialogControllerContract$SubscriptionOwner = ((s) domainState).f133718b;
            if (subscriptionDetailsDialogControllerContract$SubscriptionOwner instanceof SubscriptionDetailsDialogControllerContract$SubscriptionOwner.Other) {
                textLocalisedClause3 = new TextLocalisedClause(R$string.subscriptions_remove_dialog_subtitle, null, null, 14);
            } else {
                if (!(subscriptionDetailsDialogControllerContract$SubscriptionOwner instanceof SubscriptionDetailsDialogControllerContract$SubscriptionOwner.Junior)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause3 = new TextLocalisedClause(R$string.subscriptions_junior_remove_dialog_subtitle, u.c(((SubscriptionDetailsDialogControllerContract$SubscriptionOwner.Junior) subscriptionDetailsDialogControllerContract$SubscriptionOwner).f89296a), null, 12);
            }
            lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.subscriptions_remove_dialog_title, null, null, 14), textLocalisedClause3, null, null, false, 28);
            m6 m6Var = n6.Companion;
            return new cii.b(new g(m6.c(m6Var, new TextLocalisedClause(R$string.subscriptions_remove_dialog_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.subscriptions_remove_dialog_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), (Clause) null, (f) null, 25), f0.f322471a, aVar3);
        }
        if (domainState instanceof r) {
            p pVar7 = ((r) domainState).f133716a;
            int i33 = R$string.scheduled_payment_delete_alert_title_format;
            String str7 = pVar7.k;
            return new cii.b(b(new TextLocalisedClause(R$string.recurring_dialog_action_delete, null, null, 14), new TextLocalisedClause(R$string.recurring_dialog_action_cancel, null, null, 14), true), f0.f322471a, new lw0.a(new TextLocalisedClause(i33, u.c(str7 != null ? str7 : ""), null, 12), new TextLocalisedClause(R$string.scheduled_payment_delete_alert_message_format, u.c(a(pVar7)), null, 12), null, null, false, 28));
        }
        if (domainState instanceof q) {
            p pVar8 = ((q) domainState).f133715a;
            int i43 = R$string.scheduled_payment_bottom_sheet_delete_title;
            String str8 = pVar8.k;
            return new cii.b(b(new TextLocalisedClause(R$string.recurring_dialog_action_delete, null, null, 14), new TextLocalisedClause(R$string.recurring_dialog_action_cancel, null, null, 14), true), f0.f322471a, new lw0.a(new TextLocalisedClause(i43, u.c(str8 != null ? str8 : ""), null, 12), new TextLocalisedClause(R$string.scheduled_payment_bottom_sheet_delete_subtitle, u.c(a(pVar8)), null, 12), null, null, false, 28));
        }
        if (domainState instanceof fce.o) {
            p pVar9 = ((fce.o) domainState).f133713a;
            TextLocalisedClause textLocalisedClause10 = new TextLocalisedClause(R$string.junior_allowance_delete_confirmation_title, null, null, 14);
            int i59 = R$string.junior_allowance_delete_confirmation_description;
            MoneyClause moneyClauseA = a(pVar9);
            vua.a aVar4 = pVar9.f249330s;
            Object[] elements = {moneyClauseA, aVar4 != null ? aVar4.f292280b : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return new cii.b(b(new TextLocalisedClause(R$string.junior_allowance_delete_confirmation_cta_primary, null, null, 14), new TextLocalisedClause(R$string.junior_allowance_delete_confirmation_cta_secondary, null, null, 14), true), f0.f322471a, new lw0.a(textLocalisedClause10, new TextLocalisedClause(i59, kotlin.collections.d.L(elements), null, 12), null, null, false, 28));
        }
        if (domainState instanceof fce.n) {
            p pVar10 = ((fce.n) domainState).f133712a;
            int i66 = R$string.recurring_dialog_cancel_title;
            uua.a aVar5 = pVar10.f249331t;
            String str9 = aVar5 != null ? aVar5.f283189b : null;
            if (str9 == null) {
                str9 = "";
            }
            TextLocalisedClause textLocalisedClause11 = new TextLocalisedClause(i66, u.c(str9), null, 12);
            int i74 = R$string.recurring_dialog_cancel_message;
            MoneyClause moneyClauseA2 = a(pVar10);
            uua.a aVar6 = pVar10.f249331t;
            String str10 = aVar6 != null ? aVar6.f283189b : null;
            return new cii.b(b(new TextLocalisedClause(R$string.recurring_list_action_cancel_direct_debit, null, null, 14), new TextLocalisedClause(R$string.recurring_dialog_cancel_negative, null, null, 14), true), f0.f322471a, new lw0.a(textLocalisedClause11, new TextLocalisedClause(i74, zhm.v.k(moneyClauseA2, str10 != null ? str10 : ""), null, 12), null, null, false, 28));
        }
        if (domainState instanceof fce.p) {
            p pVar11 = ((fce.p) domainState).f133714a;
            int i92 = R$string.scheduled_payment_bottom_sheet_delete_title;
            String str11 = pVar11.k;
            return new cii.b(b(new TextLocalisedClause(R$string.recurring_dialog_action_delete, null, null, 14), new TextLocalisedClause(R$string.recurring_dialog_action_cancel, null, null, 14), true), f0.f322471a, new lw0.a(new TextLocalisedClause(i92, u.c(str11 != null ? str11 : ""), null, 12), new TextLocalisedClause(R$string.scheduled_payment_bottom_sheet_delete_subtitle, u.c(a(pVar11)), null, 12), null, null, false, 28));
        }
        if (domainState instanceof fce.u) {
            p pVar12 = ((fce.u) domainState).f133722a;
            LocalDate localDate = pVar12.f249314a.f;
            if (localDate != null) {
                TextLocalisedClause textLocalisedClause12 = new TextLocalisedClause(R$string.recurring_payment_next_payment_info_title, null, null, 14);
                int i96 = R$string.recurring_payment_next_payment_info_text;
                String str12 = pVar12.k;
                pair = new Pair(textLocalisedClause12, new TextLocalisedClause(i96, zhm.v.k(str12 != null ? str12 : "", new TimeClause(jli.b.b(localDate), new TimeClause.Format.DayAndMonth(0), null, null, 12)), null, 12));
            } else {
                pair = new Pair(new TextLocalisedClause(R$string.recurring_payment_details_estimated_next_payment, null, null, 14), new TextLocalisedClause(R$string.recurring_payment_next_payment_unknown_info, null, null, 14));
            }
            return new cii.b(new e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), f0.f322471a, new lw0.a((TextLocalisedClause) pair.f186385a, (TextLocalisedClause) pair.f186386b, null, null, false, 28));
        }
        if (domainState instanceof fce.g) {
            return new cii.b(b(new TextLocalisedClause(R$string.recurring_payment_details_dialog_cancel_pix_mandate_cta_button_positive, null, null, 14), new TextLocalisedClause(R$string.recurring_payment_details_dialog_cancel_pix_mandate_cta_button_negative, null, null, 14), true), f0.f322471a, new lw0.a(new TextLocalisedClause(R$string.recurring_payment_details_dialog_cancel_pix_mandate_title, null, null, 14), new TextLocalisedClause(R$string.recurring_payment_details_dialog_cancel_pix_mandate_subtitle, null, null, 14), null, null, false, 28));
        }
        if (!(domainState instanceof t)) {
            if (domainState instanceof l) {
                return new cii.b(new e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.recurring_payment_details_action_confim_subaccount_source_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), u.c(new AccountCellItemDelegate.Model("ROW_SUBACCOUNT_SOURCE_LIST_ID", true, (Image) LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue), (Clause) new TextClause(((l) domainState).f133710a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (com.revolut.core.ui_kit.delegates.c) null, false, (Clause) null, (RowDelegate.Model.c) null, (CircleIconBadge) null, (Object) null, (AnalyticsContext) null, 130512)), new lw0.a(new TextLocalisedClause(R$string.recurring_payment_details_action_confim_subaccount_source_title, null, null, 14), new TextLocalisedClause(R$string.recurring_payment_details_action_confim_subaccount_source_description_short, null, null, 14), null, null, false, 28));
            }
            if (!(domainState instanceof fce.j)) {
                throw new NoWhenBranchMatchedException();
            }
            RecurringSplit recurringSplit = ((fce.j) domainState).f133708a;
            a2a.g gVar = recurringSplit.f79921b.f79929a;
            int[] iArr = a0.f133701a;
            int i99 = iArr[gVar.ordinal()];
            if (i99 == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.recurring_payments_split_subscription_cancel_dialog_title, null, null, 14);
            } else if (i99 == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.recurring_payments_split_direct_debit_cancel_dialog_title, null, null, 14);
            } else {
                if (i99 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.recurring_payments_split_external_transfer_cancel_dialog_title, null, null, 14);
            }
            TextLocalisedClause textLocalisedClause13 = textLocalisedClause;
            int i100 = iArr[recurringSplit.f79921b.f79929a.ordinal()];
            if (i100 == 1) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.recurring_payments_split_subscription_cancel_dialog_subtitle, null, null, 14);
            } else if (i100 == 2) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.recurring_payments_split_direct_debit_cancel_dialog_subtitle, null, null, 14);
            } else {
                if (i100 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause2 = new TextLocalisedClause(R$string.recurring_payments_split_external_transfer_cancel_dialog_subtitle, null, null, 14);
            }
            return new cii.b(b(new TextLocalisedClause(R$string.recurring_payments_split_cancel_dialog_confirm_button_title, null, null, 14), new TextLocalisedClause(R$string.recurring_payments_split_cancel_dialog_no_button_title, null, null, 14), true), f0.f322471a, new lw0.a(textLocalisedClause13, textLocalisedClause2, null, null, false, 28));
        }
        t tVar = (t) domainState;
        fva.e eVar = tVar.f133719a;
        List<fva.e> list = tVar.f133720b;
        p pVar13 = tVar.f133721c;
        ArrayList arrayList = new ArrayList();
        for (fva.e eVar2 : list) {
            switch (a0.f133702b[eVar2.ordinal()]) {
                case 1:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_weekly);
                    break;
                case 2:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_every_two_weeks);
                    break;
                case 3:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_monthly);
                    break;
                case 4:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_quarterly);
                    break;
                case 5:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_every_six_months);
                    break;
                case 6:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_yearly);
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    numValueOf = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            SingleChoiceDelegate.Model model = numValueOf != null ? new SingleChoiceDelegate.Model(eVar2.name(), new TextLocalisedClause(numValueOf.intValue(), null, null, 14), eVar2 == eVar, null, eVar2, 1992) : null;
            if (model != null) {
                arrayList.add(model);
            }
        }
        TextLocalisedClause textLocalisedClause14 = new TextLocalisedClause(R$string.subscriptions_change_frequency_title, null, null, 14);
        int i101 = R$string.subscriptions_change_frequency_caption_merchant;
        String str13 = pVar13.k;
        return new cii.b(new e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.subscriptions_change_frequency_save_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, eVar != null, null, null, null, 988), null, null, 55), arrayList, new lw0.a(textLocalisedClause14, new TextLocalisedClause(i101, u.c(str13 != null ? str13 : ""), null, 12), null, null, false, 28));
    }
}
