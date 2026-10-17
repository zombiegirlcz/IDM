package ob1;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.s4;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.order.api.model.CardReaderOrderProductDetails;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreenContract$ProductDetailsDashboardState;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreenContract$ProductDetailsWidgetType;
import com.revolut.feature.revpro.card_reader.order.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import gfc.a;
import ip0.pb0;
import ip0.r4;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements jki.p {
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f223847a;
        Data data2 = domainState.f223849c;
        if (data.getLoading()) {
            pb0 pb0Var = new pb0("LOADING_1");
            yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
            pb0 pb0Var2 = new pb0("LOADING_2");
            yp0.b.l(pb0Var2, 0, 0, 0, 0, null, false, 63);
            pb0 pb0Var3 = new pb0("LOADING_3");
            yp0.b.l(pb0Var3, 0, 0, 0, 0, null, false, 63);
            return new j(v.k(pb0Var, pb0Var2, pb0Var3));
        }
        if (data.getContent() == null || data2.getContent() == null) {
            return new i(u.c(new FullScreenStateDelegate.Model("ERROR", null, new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), null, h4.ACCENT), zj.REGULAR, true, null, null, null, 1858)));
        }
        Object content = data.getContent();
        Intrinsics.h(content);
        Object content2 = data2.getContent();
        Intrinsics.h(content2);
        dj0.d fee2 = (dj0.d) content2;
        ArrayList arrayList = new ArrayList();
        BigTileDelegate.Model model = new BigTileDelegate.Model("PRODUCT_IMAGE", null, null, new r4(new UrlVideo("https://assets.revolut.com/published-assets-v3/873b2df0-1f4e-406e-a2fc-e724f6f67411/b6ad7f41-4a3e-4e5f-9a27-446a8886daf4.mp4", (String) null, false, (oz0.b) null, false, (oz0.c) null, 126)), null, null, null, null, null, false, false, null, null, null, null, null, 67107568);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        arrayList.add(model);
        Intrinsics.checkNotNullParameter(fee2, "fee");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_monthly_fees, null, null, 14);
        MoneyClause moneyClause = new MoneyClause(fee2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        s4 s4Var = s4.FIXED_SMALL;
        CounterTextDelegate.Model model2 = new CounterTextDelegate.Model("MONTHLY_FEE", textLocalisedClause, new t4(moneyClause, s4Var), null, false, null, null, 0, 0, 0, 0, 2040);
        yp0.b.l(model2, 0, R$attr.uikit_dp0, 0, 0, null, false, 61);
        arrayList.add(model2);
        double d = ((CardReaderOrderProductDetails) content).d;
        CounterTextDelegate.Model model3 = new CounterTextDelegate.Model("TRANSACTION_FEE", new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_per_transaction, null, null, 14), new t4(new TextClause(d + "%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), s4Var), null, false, null, null, 0, 0, 0, 0, 2040);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        arrayList.add(model3);
        List listK = v.k(new ListCellDelegate.Model("PAYMENTS_ANYWHERE", new j8(new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_payments_anywhere_title, null, null, 14), new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_payments_anywhere_google_pay_description, null, null, 14), false, null, null, 0, 0, 0, 0, 4064), new ListCellDelegate.Model("TRANSACTION_FEE", new j8(new ResourceImage(R$drawable.uikit_icn_24_cash, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_fee_title, u.c(d + "%"), null, 12), new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_fee_description, null, null, 14), false, null, null, 0, 0, 0, 0, 4064), new ListCellDelegate.Model("EASY_SET_UP", new j8(new ResourceImage(R$drawable.uikit_icn_24_arrow_exchange, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_easy_setup_title, null, null, 14), new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_easy_setup_description, null, null, 14), false, null, null, 0, 0, 0, 0, 4064), new ListCellDelegate.Model("ACCESS_TO_EARNINGS", new j8(new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_access_earnings_title, null, null, 14), new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_access_earnings_description, null, null, 14), false, null, null, 0, 0, 0, 0, 4064), new ListCellDelegate.Model("BATTERY", new j8(new ResourceImage(R$drawable.uikit_icn_24_lightning, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_battery_title, null, null, 14), new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_battery_description, null, null, 14), false, null, null, 0, 0, 0, 0, 4064), new ListCellDelegate.Model("COMPATIBILITY", new j8(new ResourceImage(R$drawable.uikit_icn_24_logo_revolut, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246)), new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_app_compatibility_title, null, null, 14), new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_app_compatibility_description, null, null, 14), false, null, null, 0, 0, 0, 0, 4064));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        arrayList.addAll(listK);
        ListSubheaderDelegate.Model model4 = new ListSubheaderDelegate.Model("SPECIFICATIONS", (Image) null, (Clause) new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_specifications, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        CardReaderProductDetailsScreenContract$ProductDetailsDashboardState cardReaderProductDetailsScreenContract$ProductDetailsDashboardState = domainState.f223848b;
        CardReaderProductDetailsScreenContract$ProductDetailsWidgetType cardReaderProductDetailsScreenContract$ProductDetailsWidgetType = CardReaderProductDetailsScreenContract$ProductDetailsWidgetType.IN_THE_BOX;
        com.revolut.core.ui_kit.widget.dashboard.a aVarA = b.a(cardReaderProductDetailsScreenContract$ProductDetailsWidgetType, cardReaderProductDetailsScreenContract$ProductDetailsDashboardState.a(cardReaderProductDetailsScreenContract$ProductDetailsWidgetType), a.f.b(R$string.rev_pro_card_reader_order_product_details_in_the_box_title), a.f.a(R$string.rev_pro_card_reader_order_product_details_in_the_box_description));
        CardReaderProductDetailsScreenContract$ProductDetailsWidgetType cardReaderProductDetailsScreenContract$ProductDetailsWidgetType2 = CardReaderProductDetailsScreenContract$ProductDetailsWidgetType.PAYMENT_TYPES;
        com.revolut.core.ui_kit.widget.dashboard.a aVarA2 = b.a(cardReaderProductDetailsScreenContract$ProductDetailsWidgetType2, cardReaderProductDetailsScreenContract$ProductDetailsDashboardState.a(cardReaderProductDetailsScreenContract$ProductDetailsWidgetType2), a.f.b(R$string.rev_pro_card_reader_order_product_details_payment_types_title), a.f.a(R$string.rev_pro_card_reader_order_product_details_payment_types_description));
        CardReaderProductDetailsScreenContract$ProductDetailsWidgetType cardReaderProductDetailsScreenContract$ProductDetailsWidgetType3 = CardReaderProductDetailsScreenContract$ProductDetailsWidgetType.SYSTEM_REQUIREMENTS;
        com.revolut.core.ui_kit.widget.dashboard.a aVarA3 = b.a(cardReaderProductDetailsScreenContract$ProductDetailsWidgetType3, cardReaderProductDetailsScreenContract$ProductDetailsDashboardState.a(cardReaderProductDetailsScreenContract$ProductDetailsWidgetType3), a.f.b(R$string.rev_pro_card_reader_order_product_details_system_requirements_title), a.f.a(R$string.rev_pro_card_reader_order_product_details_system_requirements_description));
        CardReaderProductDetailsScreenContract$ProductDetailsWidgetType cardReaderProductDetailsScreenContract$ProductDetailsWidgetType4 = CardReaderProductDetailsScreenContract$ProductDetailsWidgetType.SECURITY;
        com.revolut.core.ui_kit.widget.dashboard.a aVarA4 = b.a(cardReaderProductDetailsScreenContract$ProductDetailsWidgetType4, cardReaderProductDetailsScreenContract$ProductDetailsDashboardState.a(cardReaderProductDetailsScreenContract$ProductDetailsWidgetType4), a.f.b(R$string.rev_pro_card_reader_order_product_details_security_title), a.f.a(R$string.rev_pro_card_reader_order_product_details_security_description));
        CardReaderProductDetailsScreenContract$ProductDetailsWidgetType cardReaderProductDetailsScreenContract$ProductDetailsWidgetType5 = CardReaderProductDetailsScreenContract$ProductDetailsWidgetType.DIMENSIONS;
        arrayList.addAll(v.k(model4, aVarA, aVarA2, aVarA3, aVarA4, b.a(cardReaderProductDetailsScreenContract$ProductDetailsWidgetType5, cardReaderProductDetailsScreenContract$ProductDetailsDashboardState.a(cardReaderProductDetailsScreenContract$ProductDetailsWidgetType5), a.f.b(R$string.rev_pro_card_reader_order_product_details_dimensions_title), a.f.a(R$string.rev_pro_card_reader_order_product_details_dimensions_description))));
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_title, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_description, null, null, 14);
        Object content3 = data.getContent();
        Intrinsics.h(content3);
        dj0.d terminalPrice = ((CardReaderOrderProductDetails) content3).f60575a;
        Intrinsics.checkNotNullParameter(terminalPrice, "terminalPrice");
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.rev_pro_card_reader_order_product_details_get_card_reader_button, u.c(new MoneyClause(terminalPrice, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        Object content4 = data.getContent();
        Intrinsics.h(content4);
        return new h(textLocalisedClause2, textLocalisedClause3, textLocalisedClause4, arrayList, ((CardReaderOrderProductDetails) content4).f);
    }
}
