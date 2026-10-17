package i9e;

import aw0.j0;
import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.models.SubscriptionPaymentFromParcelData;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import ip0.pb0;
import ip0.y10;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import ms0.e4;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements a9e.b {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.l f159671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.c f159672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mae.h f159673c;
    public final f01.a d;
    public final l80.e e;
    public final nr2.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z f159674g;

    public f(thf.l transactionsItemMapper, thf.c transactionResourceMapper, mae.h recurringPaymentsMapper, f01.a uiKitResources, l80.e dateProvider, nr2.d blockedMerchantWidgetProvider, jla.h productCatalogueInteractor, z editPaymentSourceInfoProvider) {
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        Intrinsics.checkNotNullParameter(transactionResourceMapper, "transactionResourceMapper");
        Intrinsics.checkNotNullParameter(recurringPaymentsMapper, "recurringPaymentsMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(blockedMerchantWidgetProvider, "blockedMerchantWidgetProvider");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(editPaymentSourceInfoProvider, "editPaymentSourceInfoProvider");
        this.f159671a = transactionsItemMapper;
        this.f159672b = transactionResourceMapper;
        this.f159673c = recurringPaymentsMapper;
        this.d = uiKitResources;
        this.e = dateProvider;
        this.f = blockedMerchantWidgetProvider;
        this.f159674g = editPaymentSourceInfoProvider;
    }

    public static CellDetailsDelegate.Model e(qua.p pVar) {
        return new CellDetailsDelegate.Model("ID_PAYMENT_SOURCE", new TextLocalisedClause(R$string.recurring_payment_details_payment_from_title, null, null, 14), new TextClause(j6.a.q("Revolut · ", pVar.f249322h), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), qua.u.x(pVar) ? R$drawable.uikit_icn_24_info_outline : 0, null, null, null, null, null, false, 0, 0, 32752);
    }

    public static TimeClause q(LocalDate localDate) {
        long jB = jli.b.b(localDate);
        TimeClause.Format.INSTANCE.getClass();
        return new TimeClause(jB, TimeClause.Format.f57959a, null, null, 12);
    }

    public final CellDetailsDelegate.Model A(qua.p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        qua.s sVar = subscription.f249315a0;
        return sVar != null ? B(sVar, subscription) : e(subscription);
    }

    public final CellDetailsDelegate.Model B(qua.s fundsSource, qua.p subscription) {
        Pair pair;
        Float fValueOf = Float.valueOf(20.0f);
        Intrinsics.checkNotNullParameter(fundsSource, "fundsSource");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        int i = e.f159668a[fundsSource.f249336b.ordinal()];
        if (i == 1) {
            pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_24_vault), Integer.valueOf(R$string.recurring_payment_details_payment_from_savings));
        } else {
            if (i != 2) {
                if (i == 3) {
                    return e(subscription);
                }
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_24_invest), Integer.valueOf(R$string.recurring_payment_details_payment_from_investments));
        }
        int iIntValue = ((Number) pair.f186385a).intValue();
        int iIntValue2 = ((Number) pair.f186386b).intValue();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_payment_from_title, null, null, 14);
        ImageClause imageClause = new ImageClause(iIntValue, (Integer) null, fValueOf, fValueOf, 18);
        String str = subscription.f249322h;
        if (str == null) {
            str = "";
        }
        List listK = zhm.v.k(imageClause, new TextLocalisedClause(iIntValue2, zhm.u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
        m70.a.t(t0.f186434a);
        return new CellDetailsDelegate.Model("ID_PAYMENT_SOURCE", textLocalisedClause, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public final CompositeClause C() {
        m70.a.t(t0.f186434a);
        TextClause textClause = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_header_subtitle_pix, null, null, 14);
        int i = R$drawable.uikit_icn_24_calendar_recurring;
        Float fValueOf = Float.valueOf(16.0f);
        return new CompositeClause(zhm.v.k(textLocalisedClause, new ImageClause(i, ImageClauseTint.TextColor.f57790a, fValueOf, fValueOf, 16)), textClause, null, null, 12);
    }

    public final CellDetailsNoteDelegate.Model D(String str) {
        if (str != null) {
            return new CellDetailsNoteDelegate.Model("ID_COMMENT", new TextLocalisedClause(R$string.recurring_payments_account_reference, null, null, 14), null, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060);
        }
        return null;
    }

    public final ArrayList E(List referenceFields) {
        Intrinsics.checkNotNullParameter(referenceFields, "referenceFields");
        List list = referenceFields;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            qua.a0 a0Var = (qua.a0) obj2;
            CellDetailsNoteDelegate.Model model = new CellDetailsNoteDelegate.Model(a0.d.n("ID_REFERENCE_FIELD_", i), new TextClause(a0Var.f249282a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextClause(a0Var.f249283b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
            i = i2;
        }
        return arrayList;
    }

    public final CellDetailsDelegate.Model F(LocalDate localDate) {
        l80.e eVar = this.e;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause((localDate == null || localDate.isAfter(((l80.f) eVar).g().toLocalDate())) ? R$string.recurring_payment_details_start_date_starts_on_title : R$string.recurring_payment_details_started_on_title, null, null, 14);
        if (localDate == null) {
            localDate = ((l80.f) eVar).g().toLocalDate();
        }
        Intrinsics.h(localDate);
        return new CellDetailsDelegate.Model("ID_STARTED_ON", textLocalisedClause, q(localDate), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public final sa G(String listId, String str, qua.p subscription, String str2) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        TextLocalisedClause textLocalisedClause2 = str2 != null ? new TextLocalisedClause(R$string.recurring_payment_details_blocked_warning_someones_title, zhm.u.c(str2), null, 12) : new TextLocalisedClause(R$string.recurring_payment_details_blocked_warning_title, zhm.v.l(str), null, 12);
        if (str2 != null) {
            int i = R$string.recurring_payment_details_blocked_warning_someones_subtitle;
            String[] elements = {str, str2};
            Intrinsics.checkNotNullParameter(elements, "elements");
            textLocalisedClause = new TextLocalisedClause(i, kotlin.collections.d.L(elements), null, 12);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_blocked_warning_subtitle, zhm.v.l(str), null, 12);
        }
        return new sa(listId, (Clause) textLocalisedClause2, (Clause) textLocalisedClause, zhm.u.c(new ActionsView.Item(listId, null, false, null, null, new TextLocalisedClause(R$string.recurring_payment_details_action_unblock_future_payments, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_lock_opened, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, subscription, null, 24478)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4048);
    }

    public final List H(qua.p subscription, kr2.h hVar) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        ActionsView.Item item = new ActionsView.Item("ID_BLOCK_FUTURE_PAYMENTS_ACTION", mx0.d.SEMIACCENT, this.d.b(new TextLocalisedClause(R$string.recurring_payment_details_action_block_future_payments, null, null, 14)).toString(), new ResourceImage(R$drawable.uikit_icn_24_decline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        if (qua.u.k(subscription) || !qua.u.a(subscription) || (hVar instanceof kr2.f)) {
            item = null;
        }
        return zhm.v.l(item);
    }

    public final List I(UltimateDebtor ultimateDebtor) {
        Intrinsics.checkNotNullParameter(ultimateDebtor, "ultimateDebtor");
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ID_ULTIMATE_DEBTOR_NAME", new TextLocalisedClause(R$string.recurring_payment_details_ultimate_debtor_name, null, null, 14), new TextClause(ultimateDebtor.f64085a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_ultimate_debtor_address, null, null, 14);
        Address address = ultimateDebtor.f64086b;
        Address address2 = o51.a.f222306a;
        Intrinsics.checkNotNullParameter(address, "<this>");
        List listK = zhm.v.k(model, new CellDetailsNoteDelegate.Model("ID_ULTIMATE_DEBTOR_ADDRESS", textLocalisedClause, null, new TextClause(o51.a.c(address, "\n", null), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    public final CellDetailsDelegate.Model J(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        return new CellDetailsDelegate.Model("ID_USERNAME", new TextLocalisedClause(R$string.recurring_payment_details_username_title, null, null, 14), new TextClause(j6.a.q("@", username), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public final ip0.z c(List actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f159673c.getClass();
        return new ip0.z("ID_ACTIONS", actions, j0.TRANSPARENT, null, 0, 0, SyslogConstants.LOG_CLOCK);
    }

    public final List d(Data transactionsData, k71.q qVar, dj0.d dVar) {
        MoneyClause moneyClause;
        List listV0;
        List listN;
        dj0.d dVarL = dVar;
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.home_feed.api.R$string.scheduled_payments_widget_transactions_feed_title, null, null, 14);
        if (dVarL != null) {
            if (dVarL.f(dj0.d.e)) {
                dVarL = dVarL.l();
            }
            moneyClause = new MoneyClause(dVarL, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        } else {
            moneyClause = null;
        }
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("ID_ALL_TRANSACTIONS", null, textLocalisedClause, null, moneyClause, null, j0.TRANSPARENT, null, null, false, false, null, null, R$attr.uikit_dp32, R$attr.uikit_dp4, 0, 0, 13631402);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_ALL_TRANSACTIONS", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.recurring_payment_details_payment_history_see_all_title, null, null, 14), false, null, null, null, null, 1000);
        List list = (List) transactionsData.getContent();
        if (!((list != null ? list.size() : 0) > 3)) {
            model2 = null;
        }
        if (transactionsData.getContent() == null && transactionsData.getLoading()) {
            IntRange intRange = new IntRange(0, 2, 1);
            ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
            vim.f it8 = intRange.iterator();
            while (it8.f289625c) {
                arrayList.add(new pb0(a0.d.n("shimmer_row", it8.nextInt())));
            }
            return i2b.a.q(model, arrayList);
        }
        List list2 = (List) transactionsData.getContent();
        if (list2 == null || (listV0 = d0.V0(list2, 3)) == null || (listN = c6d.b.N(listV0)) == null || qVar == null) {
            return null;
        }
        List listO = i2b.a.o(thf.l.e(this.f159671a, listN, qVar, new thf.k(1022, false, false, false, false, false), null, 24), zhm.v.l(model2));
        yp0.b.k(listO, 0, 0, 0, 0, 31);
        return i2b.a.q(model, listO);
    }

    public final LayeredImage f(b9e.a badgeType) {
        Float fValueOf = Float.valueOf(20.0f);
        Intrinsics.checkNotNullParameter(badgeType, "badgeType");
        int i = e.d[badgeType.ordinal()];
        if (i == 1) {
            return LayeredImage.INSTANCE.d(R$drawable.uikit_icn_16_arrow_recurring, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorPopoverBackground, Integer.valueOf(R$attr.uikit_colorWidgetBackground), 4.0f, 2.0f, fValueOf);
        }
        if (i == 2) {
            int i2 = R$drawable.uikit_icn_24_pause;
            int i3 = R$attr.uikit_colorGreyTone50;
            int i5 = R$attr.uikit_colorWidgetBackground;
            return LayeredImage.INSTANCE.d(i2, i3, i5, Integer.valueOf(i5), 4.0f, 2.0f, fValueOf);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = R$drawable.uikit_icn_16_canceled;
        int i21 = R$attr.uikit_colorGreyTone50;
        int i22 = R$attr.uikit_colorWidgetBackground;
        return LayeredImage.INSTANCE.d(i6, i21, i22, Integer.valueOf(i22), 4.0f, 2.0f, fValueOf);
    }

    public final LayeredImage g(boolean z) {
        return z ? f(b9e.a.PAUSED) : f(b9e.a.ACTIVE);
    }

    public final CellDetailsActionDelegate.Model h(o61.a billAccount, qua.p recurringPayment, io3.d dVar, AccountId accountId) {
        Intrinsics.checkNotNullParameter(billAccount, "billAccount");
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_payment_from_title, null, null, 14);
        TextClause textClause = new TextClause(billAccount.f222488b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        CellDetailsActionDelegate.Model model = new CellDetailsActionDelegate.Model("ID_PAYMENT_SOURCE", textLocalisedClause, qua.u.x(recurringPayment) ? R$drawable.uikit_icn_24_info_outline : 0, new ResourceImage(R$drawable.uikit_icn_24_wallet, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), textClause, false, false, null, new SubscriptionPaymentFromParcelData.SubscriptionPaymentFromBillAccount(billAccount, this.f159674g.a(recurringPayment, dVar, accountId)), 0, 0, 32224);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final ActionsView.Item i() {
        return new ActionsView.Item("ID_CANCEL_ACTION", mx0.d.SEMIACCENT, this.d.b(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14)).toString(), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    public final CellDetailsDelegate.Model j(kq2.c chargeBearer) {
        int i;
        Intrinsics.checkNotNullParameter(chargeBearer, "chargeBearer");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_swift_fee_option, null, null, 14);
        int i2 = e.f159669b[chargeBearer.ordinal()];
        if (i2 == 1) {
            i = R$string.recurring_payment_details_swift_share_fees;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.recurring_payment_details_swift_pay_fees;
        }
        return new CellDetailsDelegate.Model("ID_CHARGE_BEARER", textLocalisedClause, new TextLocalisedClause(i, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public final ActionsView.Item k() {
        return new ActionsView.Item("ID_DELETE_ACTION", mx0.d.SEMIACCENT, this.d.b(new TextLocalisedClause(R$string.recurring_payment_details_action_delete, null, null, 14)).toString(), new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    public final CellDetailsChevronDelegate.Model l(int i) {
        return new CellDetailsChevronDelegate.Model("ID_DELETE_ACTION", new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), R$attr.uikit_colorRed, false, null, null, null, 2032);
    }

    public final ActionsView.Item m() {
        return new ActionsView.Item("ID_EDIT_ACTION", mx0.d.SEMIACCENT, this.d.b(new TextLocalisedClause(R$string.recurring_payment_details_action_edit, null, null, 14)).toString(), new ResourceImage(R$drawable.uikit_icn_24_edit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    public final CellDetailsActionDelegate.Model n(qua.p subscription) {
        Clause textLocalisedClause;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.recurring_payment_details_subscription_label_title, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
        String str = subscription.f249324l;
        if (str == null || str.length() <= 0) {
            textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_subscription_label_add, null, null, 14);
        } else {
            String str2 = subscription.f249324l;
            if (str2 == null) {
                str2 = "";
            }
            textLocalisedClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new CellDetailsActionDelegate.Model("ID_LABEL_SUBSCRIPTION", textLocalisedClause2, 0, resourceImage, textLocalisedClause, null, false, false, null, null, subscription, 0, 0, 0, 0, 4192228);
    }

    public final qv0.i o(qua.p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        String str = subscription.f249325m;
        if (str == null || kotlin.text.d0.W(str)) {
            return new CellDetailsActionDelegate.Model("ID_EDITABLE_COMMENT", new TextLocalisedClause(R$string.recurring_payments_details_note, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.common_action_add, null, null, 14), false, false, null, subscription, 0, 0, 32224);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_payments_details_note, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R.string.common_action_edit, null, null, 14);
        return new CellDetailsNoteDelegate.Model("ID_EDITABLE_COMMENT", textLocalisedClause, null, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), textLocalisedClause2, null, subscription, null, 0, 128628);
    }

    public final CellDetailsDelegate.Model p(LocalDate endDate) {
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        return new CellDetailsDelegate.Model("ID_ENDED_ON", new TextLocalisedClause(endDate.isBefore(((l80.f) this.e).g().toLocalDate()) ? R$string.recurring_payment_details_ended_on_title : R$string.recurring_payment_details_ends_on_title, null, null, 14), q(endDate), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public final qv0.i r(qua.p subscription, boolean z) {
        int i;
        Integer numValueOf;
        int i2;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        boolean zV = qua.u.v(subscription);
        fva.e eVar = subscription.K;
        ibd.e eVar2 = subscription.f249314a;
        if (zV) {
            numValueOf = null;
        } else {
            if (eVar2.f160152c.d()) {
                switch (eVar != null ? e.f[eVar.ordinal()] : -1) {
                    case 1:
                        i2 = R$string.recurring_period_weekly;
                        break;
                    case 2:
                        i2 = R$string.recurring_period_bi_weekly;
                        break;
                    case 3:
                        i2 = R$string.recurring_period_monthly;
                        break;
                    case 4:
                        i2 = R$string.recurring_period_quarterly;
                        break;
                    case 5:
                        i2 = R$string.recurring_period_half_yearly;
                        break;
                    case 6:
                        i2 = R$string.recurring_period_yearly;
                        break;
                    case 7:
                        i2 = R$string.recurring_payments_frequency_daily;
                        break;
                    case 8:
                        i2 = R$string.recurring_payments_frequency_twice_weekly;
                        break;
                    case 9:
                        i2 = R$string.recurring_payments_frequency_ten_days;
                        break;
                    case 10:
                        i2 = R$string.recurring_payments_frequency_every_two_months;
                        break;
                    case 11:
                        i2 = R$string.recurring_payments_frequency_trimester;
                        break;
                    default:
                        i2 = R$string.recurring_payments_details_frequency_value_unknown;
                        break;
                }
                numValueOf = Integer.valueOf(i2);
            } else {
                ibd.h hVar = eVar2.f160152c;
                hVar.getClass();
                if (hVar == ibd.h.CREDIT_CARD_PAYMENT) {
                    numValueOf = Integer.valueOf((eVar != null ? e.f[eVar.ordinal()] : -1) == 3 ? R$string.recurring_period_monthly : R$string.recurring_payments_details_frequency_value_one_off);
                } else {
                    if (ofm.q.H(subscription)) {
                        i = R$string.recurring_payments_details_frequency_value_one_off;
                    } else {
                        Intrinsics.checkNotNullParameter(subscription, "<this>");
                        i = jli.e.g(subscription.L()) ? R$string.recurring_period_yearly : ofm.q.F(subscription) ? R$string.recurring_period_quarterly : ofm.q.x(subscription) ? R$string.recurring_period_monthly : ofm.q.q(subscription) ? R$string.recurring_period_bi_weekly : ofm.q.I(subscription) ? R$string.recurring_period_weekly : ofm.q.r(subscription) ? R$string.recurring_period_daily : R$string.recurring_payments_details_frequency_value_unknown;
                    }
                    numValueOf = Integer.valueOf(i);
                }
            }
        }
        if (numValueOf == null) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        return z ? new CellDetailsActionDelegate.Model("ID_FREQUENCY", new TextLocalisedClause(R$string.recurring_payment_details_frequency_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(iIntValue, null, null, 14), null, false, false, null, null, null, 0, 0, 0, 0, 4194276) : new CellDetailsDelegate.Model("ID_FREQUENCY", new TextLocalisedClause(R$string.recurring_payment_details_frequency_title, null, null, 14), new TextLocalisedClause(iIntValue, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public final CellDetailsChevronDelegate.Model s() {
        return new CellDetailsChevronDelegate.Model("ID_GO_TO_ISSUES_LIST", new TextLocalisedClause(R$string.subscriptions_action_get_help, null, null, 14), 0, false, null, null, null, 2044);
    }

    public final CellDetailsDelegate.Model t(qua.o oVar, String str) {
        if (oVar == null || str == null) {
            return null;
        }
        return new CellDetailsDelegate.Model("ID_INITIATED_BY_SOURCE", new TextLocalisedClause(R$string.recurring_payment_details_made_by_title, null, null, 14), Intrinsics.f(oVar.f249312a, str) ? new TextLocalisedClause(R$string.recurring_payment_details_made_by_you, null, null, 14) : new TextClause(oVar.f249313b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public final MoneyClause u(dj0.d money, boolean z) {
        Intrinsics.checkNotNullParameter(money, "money");
        return new MoneyClause(money, new MoneyClause.Format.Defaults(null, null, false, false, 15), z ? null : new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), true, null, false, null, Constants.TAG_FC_SPEED_MODE), null, 8);
    }

    public final CellDetailsDelegate.Model v(LocalDate localDate, qua.p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        boolean z = qua.u.G(subscription) || qua.u.q(subscription);
        if (!z && localDate == null) {
            return null;
        }
        return new CellDetailsDelegate.Model("ID_NEXT_PAYMENT", new TextLocalisedClause((z && localDate == null) ? R$string.recurring_payment_details_estimated_next_payment : R$string.recurring_payment_details_next_payment_title, null, null, 14), localDate != null ? q(localDate) : null, null, z ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, z, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520);
    }

    public final CellDetailsNoteDelegate.Model w(String str) {
        if (str != null) {
            return new CellDetailsNoteDelegate.Model("ID_COMMENT", new TextLocalisedClause(R$string.recurring_payments_details_note, null, null, 14), null, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060);
        }
        return null;
    }

    public final ActionsView.Item x() {
        mx0.e eVar = null;
        ms0.m mVar = null;
        String str = null;
        Float f = null;
        return new ActionsView.Item("ID_PAUSE_ACTION", null, false, null, null, new TextLocalisedClause(R$string.recurring_payment_details_action_pause, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_pause, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, eVar, mVar, false, str, f, null, null, 32670);
    }

    public final sa y(TextLocalisedClause title, TextLocalisedClause subtitle, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246);
        ActionsView.Item item = null;
        if (z) {
            ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_play, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
            String str = "ID_ACTIVATE_ACTION";
            mx0.d dVar = null;
            boolean z3 = false;
            e4 e4Var = null;
            Clause clause = null;
            Image image = null;
            boolean z4 = false;
            item = new ActionsView.Item(str, dVar, z3, e4Var, clause, new TextLocalisedClause(R$string.recurring_payment_details_paused_action, null, null, 14), resourceImage2, image, null, null, z4, null, null, null, null, 32670);
        }
        return new sa("ID_PAUSED_WARNING", (Clause) title, (Clause) subtitle, zhm.v.l(item), false, (Image) resourceImage, (y10) null, (Object) null, 4032);
    }

    public final sa z(String str) {
        return y(new TextLocalisedClause(R$string.recurring_payment_details_paused_title, null, null, 14), str != null ? new TextLocalisedClause(R$string.recurring_payment_details_paused_subtitle, zhm.u.c(str), null, 12) : new TextLocalisedClause(R$string.recurring_payment_details_paused_subtitle_no_name, null, null, 14), true);
    }
}
