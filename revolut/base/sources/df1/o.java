package df1;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.api.model.CartItem;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.xh0;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f113760a;

    public o(a listItemsFactory) {
        Intrinsics.checkNotNullParameter(listItemsFactory, "listItemsFactory");
        this.f113760a = listItemsFactory;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        cd1.e eVar = domainState.f113751a;
        boolean zIsEmpty = eVar.f23149a.isEmpty();
        Integer num = null;
        a aVar = this.f113760a;
        if (zIsEmpty) {
            ((b) aVar).getClass();
            List listC = u.c(new FullScreenStateDelegate.Model("EMPTY_CART_ID", new TextLocalisedClause(R$string.product_catalogue_flow_shopping_cart_shopping_cart_states_no_cart_items_title, null, null, 14), new TextLocalisedClause(R$string.product_catalogue_flow_shopping_cart_shopping_cart_states_no_cart_items_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D091", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31712));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return new l(new TextLocalisedClause(R$string.product_catalogue_flow_new_sale_new_sale_primary_button_title, null, null, 14), listC, f0.f322471a, false);
        }
        b bVar = (b) aVar;
        bVar.getClass();
        List listC2 = u.c(new ListSubheaderDelegate.Model("CART_ITEMS_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.product_catalogue_flow_shopping_cart_shopping_cart_sections_cart_items_title, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R$string.product_catalogue_flow_shopping_cart_shopping_cart_sections_cart_items_action, null, null, 14), true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946));
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList = new ArrayList();
        List<CartItem> list = eVar.f23149a;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        for (CartItem cartItem : list) {
            String str = cartItem.f60663a;
            int i = cartItem.f60666g;
            TextImage textImageE = ((rd1.d) bVar.f113747a).e(cartItem);
            Integer numValueOf = Integer.valueOf(i);
            if (i <= 1) {
                numValueOf = num;
            }
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(textImageE, numValueOf != null ? com.revolut.core.ui_kit_core.displayers.image.models.a.b(i, Integer.valueOf(R$attr.uikit_colorWhite), Integer.valueOf(R$attr.uikit_colorRed), Integer.valueOf(R$attr.uikit_colorWhite), 16) : null, null, false, 28);
            TextClause textClause = new TextClause(cartItem.f60665c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str2 = cartItem.e;
            String str3 = (str2 == null || d0.W(str2)) ? null : str2;
            TextClause textClause2 = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            bVar.f113748b.getClass();
            RowDelegate.Model model = new RowDelegate.Model(str, image40, textClause, null, 0, textClause2, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(hf1.f.b(cartItem), new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, cartItem, null, 0, 0, 0, 0, 532675544);
            arrayList.add(new wh(j6.a.q("SWIPE_TO_ACTION_DELEGATE_ID", str), model, u.c(new SwipeToActionDelegate.SwipeAction("SWIPE_TO_DELETE_ACTION_ID", new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.product_catalogue_common_action_delete, null, null, 14), xh0.NEGATIVE, null, model.u, null, 80)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
            arrayList2.add(Unit.f186387a);
            num = null;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        ArrayList arrayListE0 = zhm.d0.E0(arrayList, listC2);
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new CellDetailsDelegate.Model("SUBTOTAL_LIST_ID", new TextLocalisedClause(R$string.product_catalogue_flow_shopping_cart_shopping_cart_subtotal_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new MoneyClause(eVar.f23151c, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        arrayList3.add(new CellDetailsDelegate.Model("TOTAL_TAXES_LIST_ID", new TextLocalisedClause(R$string.product_catalogue_flow_shopping_cart_shopping_cart_total_taxes_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new MoneyClause(eVar.d, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        arrayList3.add(new CellDetailsDelegate.Model("TOTAL_LIST_ID", new TextLocalisedClause(R$string.product_catalogue_flow_shopping_cart_shopping_cart_total_amount_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new MoneyClause(eVar.e, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        return new l(new TextLocalisedClause(R$string.product_catalogue_flow_new_sale_new_sale_primary_button_title_with_amount, u.c(new MoneyClause(eVar.e, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12)), null, 12), zhm.d0.E0(arrayList3, arrayListE0), u.c(new TextNavBarMenuItem("CLEAR_CART_MENU_ITEM_ID", new TextLocalisedClause(R$string.product_catalogue_flow_shopping_cart_shopping_cart_menu_clear_action_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, null, 12)), true);
    }
}
