package jx2;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import rp0.t;
import rp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    @NotNull
    public static final C1020a Companion = new C1020a();

    /* JADX INFO: renamed from: jx2.a$a, reason: collision with other inner class name */
    public static final class C1020a {
        private C1020a() {
        }
    }

    public static RowDelegate.Model a(int i, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, String str) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }

    public static List b() {
        RowDelegate.Model[] elements = {a(R$drawable.uikit_icn_24_merchant, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_unknown_retailers_title, null, null, 14), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_unknown_retailers_description, null, null, 14), "ID_RETAILERS_TRUST_ITEM"), a(R$drawable.uikit_icn_24_card_shield, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_fraud_protection_title, null, null, 14), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_fraud_protection_description, null, null, 14), "ID_PROTECT_FROM_FRAUD_ITEM"), a(R$drawable.uikit_icn_24_info_outline, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_refunds_title, null, null, 14), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_refunds_description, null, null, 14), "ID_REFUNDS_ITEM")};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public static y c(a aVar) {
        aVar.getClass();
        t tVar = new t(new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_title, null, null, 14), null, null, 30);
        rp0.l lVar = rp0.l.WINDOW;
        List listK = v.k(d(), a(R$drawable.uikit_icn_24_cart, new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_taxes_item_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_taxes_item_description, null, null, 14), "ID_TAXES_ITEM"), a(R$drawable.uikit_icn_24_rates_converter, new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_exchange_item_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_exchange_item_description, null, null, 14), "ID_GLOBAL_EXCHANGE_ITEM"), a(R$drawable.uikit_icn_24_google_pay, new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_xpay_item_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_xpay_item_description_android, null, null, 14), "ID_GOOGLE_PAY_ITEM"));
        yp0.b.k(listK, 0, R$attr.uikit_dp24, 0, 0, 29);
        return new y(listK, tVar, lVar, null, null, null, null, null, null, null, 3832);
    }

    public static RowDelegate.Model d() {
        return a(R$drawable.uikit_icn_24_globe, new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_spend_item_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_spend_item_description, u.c(new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_spend_item_link, null, new Click(30, (Integer) null, (Object) null, "ID_GO_TO_LOCAL_BRAZIL_CARD_CLAUSE", false), 10)), null, 12), "ID_SPEND_ITEM");
    }

    public static RowDelegate.Model e() {
        return a(R$drawable.uikit_icn_24_map_point, new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_local_spend_item_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_local_spend_item_description, u.c(new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_local_spend_item_link, null, new Click(30, (Integer) null, (Object) null, "ID_GO_TO_GLOBAL_BRAZIL_CARD_CLAUSE", false), 10)), null, 12), "ID_SPEND_ITEM");
    }

    public static ArrayList f() {
        return yp0.b.g(v.k(new RowDelegate.Model("ID_SINGLE_USE_ITEM", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_cart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_single_use_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_single_use_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("ID_CAR_RENTAL_ITEM", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_reverted, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_car_rentals_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_car_rentals_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("ID_SAVE_AT_CHECKOUT_ITEM", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_cards, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_save_card_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_save_card_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)), new ListSubheaderDelegate.Model("ID_WHEN_TO_USE_ITEM", (Image) null, (Clause) new TextLocalisedClause(R$string.cards_home_widget_help_disposable_when_to_use, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, R$attr.uikit_dp24, LDSFile.EF_DG4_TAG);
    }
}
