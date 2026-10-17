package u63;

import aw0.ka;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.i;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$plurals;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.youTransactor.uCube.rpc.Constants;
import do3.n;
import grl.b4;
import h93.f0;
import h93.l0;
import ip0.m00;
import ip0.y10;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import mx0.d;
import org.jetbrains.annotations.NotNull;
import sx4.f;
import te0.w;
import yy0.l;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements p63.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CdnImage f277469c = new CdnImage("flag_br", "mobile/flags", null, new ImageTransformations(null, new CircleTransformation(Float.valueOf(8.0f), Integer.valueOf(R$attr.uikit_colorAccentNeutral_10), false, 8), null, gz0.b.CenterInside, null, 24, 24, 21), null, null, Constants.TAG_E4_CUSTOMER_DATA);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j63.a f277470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m93.a f277471b;

    public c(j63.a selectedCardUiConfigProvider, m93.a cardComponentItemMapper) {
        Intrinsics.checkNotNullParameter(selectedCardUiConfigProvider, "selectedCardUiConfigProvider");
        Intrinsics.checkNotNullParameter(cardComponentItemMapper, "cardComponentItemMapper");
        this.f277470a = selectedCardUiConfigProvider;
        this.f277471b = cardComponentItemMapper;
    }

    public static CdnImage a(String str) {
        return com.revolut.core.ui_kit_core.displayers.image.models.b.c(str, new ImageTransformations(null, null, null, null, null, 60, 60, 31), null, null, 28);
    }

    public static j d(int i, String str) {
        m00 m00Var = new m00("UNBLOCK_CARD_LIST_ITEM_ID", new TextLocalisedClause(R$string.card_unblock_pin_cvv_prompt_title, null, null, 14), new TextLocalisedClause(i, null, null, 14), a("3D015"), null, v.k(new ActionsView.Item(str, d.ACCENT, false, null, null, new TextLocalisedClause(R$string.card_unblock_pin_cvv_prompt_action_unblock, null, null, 14), null, null, null, null, false, null, null, null, null, 32668), new ActionsView.Item("UNBLOCK_CARD_REJECT_ACTION_ID", d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.card_unblock_pin_cvv_prompt_action_no, null, null, 14), null, null, null, null, false, null, null, null, null, 32668)), null, b4.EXPIRED_OR_INVALID_KEY_VALUE);
        yp0.b.l(m00Var, 0, 0, 0, 0, null, false, 63);
        return m00Var;
    }

    public static m00 u(String str) {
        return new m00(str, new TextLocalisedClause(R$string.card_banner_kyc_required_title, null, null, 14), new TextLocalisedClause(R$string.card_banner_kyc_required_description, null, null, 14), a("3D117"), new TextLocalisedClause(R$string.card_banner_kyc_required_button, null, null, 14), null, null, YearClass.CLASS_2016);
    }

    public final j b() {
        Intrinsics.checkNotNullParameter("AUTO_REISSUE_PHYSICAL_CARD_BANNER_ID", "id");
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("AUTO_REISSUE_PHYSICAL_CARD_BANNER_ID", new TextLocalisedClause(R$string.card_banner_physical_card_auto_reissue_title, null, null, 14), new TextLocalisedClause(R$string.card_banner_physical_card_auto_reissue_subtitle, null, null, 14), new m(new GlyphImage(R$drawable.uikit_icn_24_refinancing_card, null, null, 6), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), ActionWidgetDelegate.Model.b.C0394b.f51606a, new i(14, new TextLocalisedClause(R$string.card_banner_physical_card_auto_reissue_button, null, null, 14), null, false), null, null, null, false, 8128);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final j c() {
        Intrinsics.checkNotNullParameter("AUTO_RENEWAL_VIRTUAL_CARD_BANNER_ID", "id");
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("AUTO_RENEWAL_VIRTUAL_CARD_BANNER_ID", new TextLocalisedClause(R$string.card_banner_virtual_card_auto_renewal_title, null, null, 14), new TextLocalisedClause(R$string.card_banner_virtual_card_auto_renewal_subtitle, null, null, 14), new m(new GlyphImage(R$drawable.uikit_icn_24_refinancing_card, null, null, 6), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), new ActionWidgetDelegate.Model.b.a(null), new i(14, new TextLocalisedClause(R$string.card_banner_virtual_card_auto_renewal_button, null, null, 14), null, false), null, null, null, false, 8128);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final j e(f0 card) {
        Intrinsics.checkNotNullParameter("CARD_CUSTOMISATION_REJECTION_LIST_ID", "id");
        Intrinsics.checkNotNullParameter(card, "card");
        m00 m00Var = new m00("CARD_CUSTOMISATION_REJECTION_LIST_ID", new TextLocalisedClause(R$string.card_action_design_rejected_title, null, null, 14), this.f277470a.e(card), a("3D083"), new TextLocalisedClause(R$string.card_action_design_rejected_button, null, null, 14), null, null, YearClass.CLASS_2016);
        yp0.b.l(m00Var, 0, 0, 0, 0, null, false, 63);
        return m00Var;
    }

    public final j f(CheckoutOrder checkoutOrder, dj0.d requiredTopUpAmount) {
        l0 l0Var;
        String str;
        List listK;
        TextLocalisedClause textLocalisedClause;
        CheckoutOrder checkoutOrder2 = checkoutOrder;
        Intrinsics.checkNotNullParameter("PENDING_CHECKOUT_TOPUP_REQUIRED", "listId");
        Intrinsics.checkNotNullParameter("PENDING_CHECKOUT_CANCEL_ORDER", "cancelOrderActionId");
        Intrinsics.checkNotNullParameter(checkoutOrder2, "checkoutOrder");
        Intrinsics.checkNotNullParameter(requiredTopUpAmount, "requiredTopUpAmount");
        pi3.d dVar = checkoutOrder2.d;
        l0 l0Var2 = dVar != null ? dVar.f236396n : null;
        l0 l0Var3 = l0.INDIA_GLOBAL;
        if (l0Var2 == l0Var3) {
            listK = zhm.f0.f322471a;
            str = "PENDING_CHECKOUT_TOPUP_REQUIRED";
            l0Var = l0Var3;
        } else {
            l0Var = l0Var3;
            str = "PENDING_CHECKOUT_TOPUP_REQUIRED";
            checkoutOrder2 = checkoutOrder;
            listK = v.k(new ActionsView.Item("PENDING_CHECKOUT_TOPUP_REQUIRED", null, false, null, null, new TextLocalisedClause(R$string.card_banner_checkout_card_preordered_complete_order, null, null, 14), null, null, null, null, false, null, null, checkoutOrder2, null, 24478), new ActionsView.Item("PENDING_CHECKOUT_CANCEL_ORDER", d.NEGATIVE, false, null, null, new TextLocalisedClause(R$string.card_banner_checkout_card_preordered_cancel, null, null, 14), null, null, null, null, false, null, null, checkoutOrder2, null, 24476));
        }
        List list = listK;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.card_banner_checkout_card_preordered_title, null, null, 14);
        pi3.d dVar2 = checkoutOrder2.d;
        Instant instant = dVar2 != null ? dVar2.k : null;
        if ((dVar2 != null ? dVar2.f236396n : null) == l0Var) {
            textLocalisedClause = new TextLocalisedClause(R$string.card_banner_checkout_card_preordered_india_global_info, null, null, 14);
        } else if (instant != null) {
            textLocalisedClause = new TextLocalisedClause(R$string.card_banner_checkout_card_preordered_add_money_to_complete, u.c(new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12);
        } else {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "CardsItemProviderImpl", "preorderEndDate or card is null", null, h0Var);
            textLocalisedClause = new TextLocalisedClause(R$string.card_banner_checkout_payment_required_description, u.c(f.b(3, null, null, requiredTopUpAmount)), null, 12);
        }
        m00 m00Var = new m00(str, textLocalisedClause2, textLocalisedClause, a("3D362"), null, list, checkoutOrder2, 1936);
        yp0.b.l(m00Var, 0, 0, 0, 0, null, false, 63);
        return m00Var;
    }

    public final j g() {
        Intrinsics.checkNotNullParameter("COMPROMISED_WARNING_LIST_ACTION_ID", "id");
        m00 m00Var = new m00("COMPROMISED_WARNING_LIST_ACTION_ID", new TextLocalisedClause(R$string.cards_home_item_terminate_widget_title, null, null, 14), new TextLocalisedClause(R$string.cards_home_item_terminate_widget_subtilte, null, null, 14), a("3D018"), new TextLocalisedClause(R$string.card_alert_cancel_alert_title, null, null, 14), null, null, YearClass.CLASS_2016);
        yp0.b.l(m00Var, 0, 0, 0, 0, null, false, 63);
        return m00Var;
    }

    public final sa h() {
        Intrinsics.checkNotNullParameter("CARD_DAMAGED_LIST_ID", "id");
        return new sa("CARD_DAMAGED_LIST_ID", (Clause) new TextLocalisedClause(R$string.card_banner_damaged_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.card_banner_damaged_description, null, null, 14), u.c(new ActionsView.Item("CARD_DAMAGED_LIST_ID", d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.card_banner_damaged_button, null, null, 14), null, null, null, null, false, null, null, null, null, 32668)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4048);
    }

    public final List i(String clickId, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(clickId, "clickId");
        return v.k(new RowDelegate.Model("single_use", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_cart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(z3 ? R$string.cards_home_widget_help_disposable_single_use_india_local_title : R$string.cards_home_widget_help_disposable_single_use_title, null, null, 14), null, 0, z ? new TextLocalisedClause(R$string.cards_home_widget_help_disposable_single_use_description_link, u.c(new TextLocalisedClause(R$string.cards_home_widget_help_disposable_single_use_learn_more, null, new Click(30, (Integer) null, (Object) null, clickId, false), 10)), null, 12) : new TextLocalisedClause(R$string.cards_home_widget_help_disposable_single_use_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("rental_or_hotel", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_reverted, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_car_rentals_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_car_rentals_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("save_at_checkout", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_cards, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_save_card_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_save_card_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
    }

    public final j j() {
        Intrinsics.checkNotNullParameter("kycInProgress", "id");
        m00 m00Var = new m00("kycInProgress", new TextLocalisedClause(R$string.card_banner_kyc_title, null, null, 14), new TextLocalisedClause(R$string.card_banner_kyc_description, null, null, 14), a("3D028"), null, null, null, 2032);
        yp0.b.l(m00Var, 0, 0, 0, 0, null, false, 63);
        return m00Var;
    }

    public final j k() {
        Intrinsics.checkNotNullParameter("kycRequired", "id");
        m00 m00VarU = u("kycRequired");
        yp0.b.l(m00VarU, 0, 0, 0, 0, null, false, 63);
        return m00VarU;
    }

    public final j l() {
        Intrinsics.checkNotNullParameter("NEW_PHYSICAL_CARD_READY_BANNER_ID", "id");
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("NEW_PHYSICAL_CARD_READY_BANNER_ID", new TextLocalisedClause(R$string.card_banner_new_physical_card_ready_title, null, null, 14), new TextLocalisedClause(R$string.card_banner_new_physical_card_ready_subtitle, null, null, 14), new m(new GlyphImage(R$drawable.uikit_icn_24_refinancing_card, null, null, 6), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), ActionWidgetDelegate.Model.b.C0394b.f51606a, new com.revolut.core.ui_kit.delegates.j(new TextLocalisedClause(R$string.card_banner_new_physical_card_ready_button, null, null, 14), null, 14), null, null, null, false, 8128);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final j m() {
        Intrinsics.checkNotNullParameter("REISSUE_EXPIRED_PHYSICAL_CARD_BANNER_ID", "id");
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("REISSUE_EXPIRED_PHYSICAL_CARD_BANNER_ID", new TextLocalisedClause(R$string.card_banner_expired_physical_card_reissue_title, null, null, 14), new TextLocalisedClause(R$string.card_banner_expired_physical_card_reissue_subtitle, null, null, 14), new m(new GlyphImage(R$drawable.uikit_icn_24_refinancing_card, null, null, 6), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), ActionWidgetDelegate.Model.b.C0394b.f51606a, new i(14, new TextLocalisedClause(R$string.card_banner_expired_physical_card_reissue_button, null, null, 14), null, false), null, null, null, false, 8128);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final j n() {
        Intrinsics.checkNotNullParameter("REISSUED_PHYSICAL_CARD_BANNER_ID", "id");
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("REISSUED_PHYSICAL_CARD_BANNER_ID", new TextLocalisedClause(R$string.card_banner_physical_card_reissued_title, null, null, 14), new TextLocalisedClause(R$string.card_banner_physical_card_reissued_subtitle, null, null, 14), new m(new GlyphImage(R$drawable.uikit_icn_24_refinancing_card, null, null, 6), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), new ActionWidgetDelegate.Model.b.a(null), new com.revolut.core.ui_kit.delegates.j(new TextLocalisedClause(R$string.card_banner_physical_card_reissued_button, null, null, 14), null, 14), null, null, null, false, 8128);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final j o() {
        Intrinsics.checkNotNullParameter("RENEWED_VIRTUAL_CARD_BANNER_ID", "id");
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("RENEWED_VIRTUAL_CARD_BANNER_ID", new TextLocalisedClause(R$string.card_banner_virtual_card_renewed_title, null, null, 14), new TextLocalisedClause(R$string.card_banner_virtual_card_renewed_subtitle, null, null, 14), new m(new GlyphImage(R$drawable.uikit_icn_24_refinancing_card, null, null, 6), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), new ActionWidgetDelegate.Model.b.a(null), new com.revolut.core.ui_kit.delegates.j(new TextLocalisedClause(R$string.card_banner_virtual_card_renewed_button, null, null, 14), null, 14), null, null, null, false, 8128);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final j p(n nVar, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        boolean z = false;
        if (nVar != null) {
            wi0.b.Companion.getClass();
            if (w.S(nVar, wi0.b.f297770q3)) {
                z = true;
            }
        }
        m00 m00Var = new m00(id10, new TextLocalisedClause(R$string.card_banner_expired_title, null, null, 14), z ? new TextLocalisedClause(R$string.card_banner_expired_description_complimentary, null, null, 14) : new TextLocalisedClause(R$string.card_banner_expired_description, null, null, 14), a("3D015"), z ? new TextLocalisedClause(R$string.card_banner_expired_button_complimentary, null, null, 14) : new TextLocalisedClause(R$string.card_banner_expired_button, null, null, 14), null, null, YearClass.CLASS_2016);
        yp0.b.l(m00Var, 0, 0, 0, 0, null, false, 63);
        return m00Var;
    }

    public final j q(String id10, int i, n nVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        boolean z = false;
        if (nVar != null) {
            wi0.b.Companion.getClass();
            if (w.S(nVar, wi0.b.f297770q3)) {
                z = true;
            }
        }
        m00 m00Var = new m00(id10, new TextLocalisedQuantityClause(R$plurals.card_banner_preexpired_title, Integer.valueOf(i), (List) null, (Style) null, 28), z ? new TextLocalisedClause(R$string.card_banner_preexpired_description_complimentary, null, null, 14) : new TextLocalisedClause(R$string.card_banner_preexpired_description, null, null, 14), a("3D015"), z ? new TextLocalisedClause(R$string.card_banner_preexpired_button_complimentary, null, null, 14) : new TextLocalisedClause(R$string.card_banner_preexpired_button, null, null, 14), null, null, YearClass.CLASS_2016);
        yp0.b.l(m00Var, 0, 0, 0, 0, null, false, 63);
        return m00Var;
    }

    public final RowDelegate.Model r() {
        Intrinsics.checkNotNullParameter("REVOLUT_PAY_MANAGEMENT_ITEM_ID", "listId");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_revolut_pay_management_title, null, null, 14);
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_logo_revolut, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.card_revolut_pay_management_subtitle, null, null, 14);
        yy0.i iVar = l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar.getClass();
        return new RowDelegate.Model("REVOLUT_PAY_MANAGEMENT_ITEM_ID", image24, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
    }

    public final j s() {
        Intrinsics.checkNotNullParameter("SUSPICIOUS_TRANSACTION_LIST_ID", "id");
        m00 m00Var = new m00("SUSPICIOUS_TRANSACTION_LIST_ID", new TextLocalisedClause(R$string.card_home_item_frozen_title, null, null, 14), new TextLocalisedClause(R$string.card_home_item_frozen_subtitle, null, null, 14), a("3D018"), new TextLocalisedClause(R$string.card_home_item_frozen_action, null, null, 14), null, null, YearClass.CLASS_2016);
        yp0.b.l(m00Var, 0, 0, 0, 0, null, false, 63);
        return m00Var;
    }

    public final RowDelegate.Model t() {
        Intrinsics.checkNotNullParameter("TERMINATE_EXPIRED_CARD_ROW_ID", "id");
        return new RowDelegate.Model("TERMINATE_EXPIRED_CARD_ROW_ID", null, new TextLocalisedClause(R$string.card_action_remove_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorPerformanceNegative), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
    }
}
