package wx2;

import android.os.Parcelable;
import cli.j;
import cli.n;
import cli.o;
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
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f300744a;

    public h(a brazilStateProvider, b brazilRevampedStateProvider, c indiaStateProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(brazilStateProvider, "brazilStateProvider");
        Intrinsics.checkNotNullParameter(brazilRevampedStateProvider, "brazilRevampedStateProvider");
        Intrinsics.checkNotNullParameter(indiaStateProvider, "indiaStateProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f300744a = featureToggleInteractor;
    }

    @Override // cli.n
    public final o c(j jVar) {
        boolean z;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        hx2.h hVar = domainState.f300740b;
        String str = domainState.e;
        boolean z3 = domainState.d;
        boolean z4 = domainState.f300741c;
        c93.e eVar = domainState.f300739a;
        int i = g.f300742a[hVar.ordinal()];
        if (i == 1) {
            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.card_choose_india_info_dialog_global_title, null, null, 14), null, null, null, false, 30);
            List listK = v.k(c.a(R$drawable.uikit_icn_24_globe, new TextLocalisedClause(R$string.card_choose_india_info_dialog_global_spend_item_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_india_info_dialog_global_spend_item_description, u.c(new TextLocalisedClause(R$string.card_choose_india_info_dialog_global_spend_item_link, null, new Click(30, (Integer) null, (Object) null, "ID_GO_TO_LOCAL_INDIA_CARD_CLAUSE", false), 10)), null, 12), "ID_SPEND_ITEM"), c.a(R$drawable.uikit_icn_24_cart, new TextLocalisedClause(R$string.card_choose_india_info_dialog_global_save_item_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_india_info_dialog_global_save_item_description, null, null, 14), "ID_SAVE_ON_CHARGES"), c.a(R$drawable.uikit_icn_24_rates_converter, new TextLocalisedClause(R$string.card_choose_india_info_dialog_global_fx_item_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_india_info_dialog_global_fx_item_description, null, null, 14), "ID_SAVE_ON_FX"));
            yp0.b.k(listK, 0, R$attr.uikit_dp24, 0, 0, 29);
            return new cii.b(null, listK, aVar);
        }
        if (i == 2) {
            if (g.f300743b[eVar.ordinal()] != 1) {
                lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.card_choose_india_info_dialog_local_title, null, null, 14), null, null, null, false, 30);
                List listC = u.c(c.b(z4));
                yp0.b.k(listC, 0, R$attr.uikit_dp24, 0, 0, 29);
                return new cii.b(null, listC, aVar2);
            }
            lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.cards_home_widget_help_disposable_header, null, null, 14), null, null, null, false, 30);
            aim.e eVarB = u.b();
            List listQ = i2b.a.q(c.b(z4), v.k(c.a(R$drawable.uikit_icn_24_merchant, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_unknown_retailers_title, null, null, 14), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_unknown_retailers_description, null, null, 14), "ID_RETAILERS_TRUST_ITEM"), c.a(R$drawable.uikit_icn_24_card_shield, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_fraud_protection_title, null, null, 14), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_fraud_protection_description, null, null, 14), "ID_PROTECT_FROM_FRAUD_ITEM"), c.a(R$drawable.uikit_icn_24_info_outline, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_refunds_title, null, null, 14), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_refunds_description, null, null, 14), "ID_REFUNDS_ITEM")));
            yp0.b.k(listQ, 0, 0, 0, 0, 31);
            ArrayList arrayListG = yp0.b.g(v.k(new RowDelegate.Model("ID_SINGLE_USE_ITEM", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_cart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_single_use_india_local_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_single_use_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("ID_CAR_RENTAL_ITEM", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_reverted, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_car_rentals_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_car_rentals_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("ID_SAVE_AT_CHECKOUT_ITEM", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_cards, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_save_card_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_save_card_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)), new ListSubheaderDelegate.Model("ID_WHEN_TO_USE_ITEM", (Image) null, (Clause) new TextLocalisedClause(R$string.cards_home_widget_help_disposable_when_to_use, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, R$attr.uikit_dp24, LDSFile.EF_DG4_TAG);
            eVarB.addAll(listQ);
            eVarB.addAll(arrayListG);
            return new cii.b(null, u.a(eVarB), aVar3);
        }
        gte.a aVar4 = this.f300744a;
        if (i == 3) {
            if (eVar == c93.e.DISPOSABLE) {
                lw0.a aVar5 = new lw0.a(new TextLocalisedClause(R$string.cards_home_widget_help_disposable_header, null, null, 14), null, null, null, false, 30);
                aim.e eVarB2 = u.b();
                List listQ2 = i2b.a.q(a.c(), a.b());
                yp0.b.k(listQ2, 0, 0, 0, 0, 31);
                ArrayList arrayListE = a.e();
                eVarB2.addAll(listQ2);
                eVarB2.addAll(arrayListE);
                return new cii.b(null, u.a(eVarB2), aVar5);
            }
            if (!((jte.d) aVar4).c(CardsCoreApi$Toggles.LocalComboCardsImprovements.f65565c)) {
                lw0.a aVar6 = new lw0.a(new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_title, null, null, 14), null, null, null, false, 30);
                List listK2 = v.k(a.c(), a.a(R$drawable.uikit_icn_24_cart, new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_taxes_item_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_taxes_item_description, null, null, 14), "ID_TAXES_ITEM"), a.a(R$drawable.uikit_icn_24_rates_converter, new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_exchange_item_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_exchange_item_description, null, null, 14), "ID_GLOBAL_EXCHANGE_ITEM"), a.a(R$drawable.uikit_icn_24_google_pay, new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_xpay_item_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_xpay_item_description_android, null, null, 14), "ID_GOOGLE_PAY_ITEM"));
                yp0.b.k(listK2, 0, R$attr.uikit_dp24, 0, 0, 29);
                return new cii.b(null, listK2, aVar6);
            }
            z = str != null;
            lw0.a aVar7 = new lw0.a(new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_title, null, null, 14), null, null, null, false, 30);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(z3 ? R$string.card_choose_brazil_info_dialog_global_with_credit_spend_item_link : R$string.card_choose_brazil_info_dialog_global_no_credit_spend_item_link, null, new Click(30, (Integer) null, (Object) null, "ID_GO_TO_LOCAL_BRAZIL_CARD_CLAUSE", false), 10);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_spend_item_description_use_order, null, null, 14);
            if (z4) {
                textLocalisedClause2 = z ? new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_spend_item_description_use, v.k(textLocalisedClause2, textLocalisedClause), null, 12) : new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_spend_item_description_order, v.k(textLocalisedClause2, textLocalisedClause), null, 12);
            }
            RowDelegate.Model[] elements = {b.a(R$drawable.uikit_icn_24_globe, new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_spend_item_title, null, null, 14), textLocalisedClause2, "ID_SPEND_ITEM"), z3 ? b.a(R$drawable.uikit_icn_24_coins_earning, new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_with_credit_save_item_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_with_credit_save_item_description, null, null, 14), "ID_SAVE_WITH_DEBIT") : null, b.a(R$drawable.uikit_icn_24_rates_converter, new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_exchange_item_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_exchange_item_description, null, null, 14), "ID_GLOBAL_EXCHANGE_ITEM"), b.a(R$drawable.uikit_icn_24_google_pay, new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_xpay_item_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_global_xpay_item_description_android, null, null, 14), "ID_GOOGLE_PAY_ITEM")};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, R$attr.uikit_dp24, 0, 0, 29);
            return new cii.b(null, listL, aVar7);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (eVar == c93.e.DISPOSABLE) {
            lw0.a aVar8 = new lw0.a(new TextLocalisedClause(R$string.cards_home_widget_help_disposable_header, null, null, 14), null, null, null, false, 30);
            aim.e eVarB3 = u.b();
            List listQ3 = i2b.a.q(a.d(z4), a.b());
            yp0.b.k(listQ3, 0, 0, 0, 0, 31);
            ArrayList arrayListE2 = a.e();
            eVarB3.addAll(listQ3);
            eVarB3.addAll(arrayListE2);
            return new cii.b(null, u.a(eVarB3), aVar8);
        }
        if (!((jte.d) aVar4).c(CardsCoreApi$Toggles.LocalComboCardsImprovements.f65565c)) {
            lw0.a aVar9 = new lw0.a(new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_local_title, null, null, 14), null, null, null, false, 30);
            List listK3 = v.k(a.d(z4), a.a(R$drawable.uikit_icn_24_google_pay, new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_local_xpay_item_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_local_xpay_item_description_android, null, null, 14), "ID_GOOGLE_PAY_ITEM"), a.a(R$drawable.uikit_icn_24_suitcase, new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_local_credit_abroad_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_local_credit_abroad_description_android, null, null, 14), "ID_ENJOY_CREDIT_ABROAD"));
            yp0.b.k(listK3, 0, R$attr.uikit_dp24, 0, 0, 29);
            return new cii.b(null, listK3, aVar9);
        }
        z = str != null;
        lw0.a aVar10 = new lw0.a(new TextLocalisedClause(z3 ? R$string.card_choose_brazil_info_dialog_local_title : R$string.card_choose_brazil_info_dialog_local_debit_title, null, null, 14), null, null, null, false, 30);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(z3 ? R$string.card_choose_brazil_info_dialog_combo_spend_item_title : R$string.card_choose_brazil_info_dialog_local_spend_item_title, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_local_spend_item_link, null, new Click(30, (Integer) null, (Object) null, "ID_GO_TO_GLOBAL_BRAZIL_CARD_CLAUSE", false), 10);
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(z3 ? R$string.card_choose_brazil_info_dialog_combo_spend_item_description : R$string.card_choose_brazil_info_dialog_local_debit_spend_item_description, null, null, 14);
        if (z4) {
            textLocalisedClause5 = (z3 && z) ? new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_combo_spend_item_description_use, v.k(textLocalisedClause5, textLocalisedClause4), null, 12) : (!z3 || z) ? (z3 || !z) ? new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_local_debit_spend_item_description_order, v.k(textLocalisedClause5, textLocalisedClause4), null, 12) : new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_local_debit_spend_item_description_use, v.k(textLocalisedClause5, textLocalisedClause4), null, 12) : new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_combo_spend_item_description_order, v.k(textLocalisedClause5, textLocalisedClause4), null, 12);
        }
        List listK4 = v.k(b.a(R$drawable.uikit_icn_24_map_point, textLocalisedClause3, textLocalisedClause5, "ID_SPEND_ITEM"), b.a(R$drawable.uikit_icn_24_google_pay, new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_local_xpay_item_title, null, null, 14), new TextLocalisedClause(R$string.card_choose_brazil_info_dialog_local_xpay_item_description_android, null, null, 14), "ID_GOOGLE_PAY_ITEM"));
        yp0.b.k(listK4, 0, R$attr.uikit_dp24, 0, 0, 29);
        return new cii.b(null, listK4, aVar10);
    }
}
