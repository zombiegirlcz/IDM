package ye1;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.ProductDetailsScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import yp0.r;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductDetailsScreenContract$InputData f312763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pd1.a f312764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd0.b f312765c;
    public final hf1.g d;
    public final rd1.b e;

    public q(ProductDetailsScreenContract$InputData inputData, pd1.a colorMapper, qd0.b languageProvider, hf1.g taxRateFormatter, rd1.b commonItemsFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(colorMapper, "colorMapper");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(taxRateFormatter, "taxRateFormatter");
        Intrinsics.checkNotNullParameter(commonItemsFactory, "commonItemsFactory");
        this.f312763a = inputData;
        this.f312764b = colorMapper;
        this.f312765c = languageProvider;
        this.d = taxRateFormatter;
        this.e = commonItemsFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        boolean z;
        char c2;
        CatalogueCategory catalogueCategory;
        int i;
        List listL;
        Object next;
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xi0.b bVar = domainState.f312745a;
        String str = domainState.d;
        boolean z3 = domainState.f312751l;
        String str2 = domainState.e;
        od1.b bVar2 = domainState.f312749h;
        pd1.a aVar = this.f312764b;
        ProductDetailsScreenContract$InputData productDetailsScreenContract$InputData = this.f312763a;
        if (bVar == null) {
            listL = f0.f322471a;
            z = false;
            c2 = 1;
            i = 2;
        } else {
            z = false;
            AmountEditDelegate.Model model = new AmountEditDelegate.Model("AMOUNT_LIST_ID", new TextClause(bVar.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new bw0.h(domainState.f312746b, cp5.d.J(bVar), true, null, Boolean.valueOf(bVar2 == od1.b.AMOUNT), false, false, false, false, null, 8148), nx0.e.NONE, null, null, null, false, new od1.a(((s80.b) this.f312765c).b(), bVar), null, 1680);
            yp0.b.r(model, 0, 0, 0, 0, 15);
            InputTextDelegate.Model model2 = new InputTextDelegate.Model("DESCRIPTION_LIST_ID", new TextClause(domainState.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.product_catalogue_common_title_description, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, bVar2 == od1.b.DESCRIPTION, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -67108876, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            String str3 = domainState.f312748g;
            if (str3 != null) {
                Iterator it8 = domainState.i.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        c2 = 1;
                        next = null;
                        break;
                    }
                    next = it8.next();
                    c2 = 1;
                    if (Intrinsics.f(((CatalogueCategory) next).f60669a, str3)) {
                        break;
                    }
                }
                catalogueCategory = (CatalogueCategory) next;
            } else {
                c2 = 1;
                catalogueCategory = null;
            }
            InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model("SELECT_CATEGORY_LIST_ID", catalogueCategory != null ? new TextClause(catalogueCategory.f60670b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextLocalisedClause(R$string.product_catalogue_common_title_category, null, null, 14), new TextLocalisedClause(R$string.product_catalogue_flow_products_new_product_category_input_placeholder, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -16, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
            pd1.c cVar = (pd1.c) aVar;
            List listB = cVar.b(domainState.f);
            i = 2;
            ArrayList arrayList = new ArrayList(w.t(listB, 10));
            Iterator it9 = listB.iterator();
            while (it9.hasNext()) {
                int iIntValue = ((Number) it9.next()).intValue();
                String strA = cVar.a(iIntValue);
                arrayList.add(new IconSelectorDelegate.SelectableIconModel(a0.d.n("COLOR_ITEM_ID", iIntValue), LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_circle_background, Integer.valueOf(R$attr.uikit_colorTransparent), iIntValue, BitmapDescriptorFactory.HUE_RED, null, null, 48), Intrinsics.f(str2, strA), null, null, false, null, R$attr.uikit_colorGrey20, false, strA, null, 2936));
            }
            IconSelectorDelegate.Model model3 = new IconSelectorDelegate.Model("COLOR_PICKER_ITEM_ID", arrayList, null, null, null, 60);
            TaxRate taxRateC = domainState.c();
            InputTextDelegate.Model modelA2 = r.a(new InputTextDelegate.Model("TAX_LIST_ID", taxRateC == null ? null : new TextClause(this.d.a(taxRateC), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.product_catalogue_flow_products_new_product_tax_rate_input_label, null, null, 14), new TextLocalisedClause(R$string.product_catalogue_flow_products_new_product_tax_rate_input_placeholder, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -16, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            yp0.b.l(modelA2, 0, 0, 0, 0, null, false, 63);
            if (!z3) {
                modelA2 = null;
            }
            RowDelegate.Model model4 = new RowDelegate.Model("DELETE_ITEM_LIST_ID", null, new TextLocalisedClause(R$string.product_catalogue_common_action_delete_item, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
            yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
            if (!z3 || productDetailsScreenContract$InputData.f60817a == null) {
                model4 = null;
            }
            ((rd1.d) this.e).getClass();
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(z3 ? R$string.product_catalogue_common_action_hide_options : R$string.product_catalogue_common_action_more_options, null, new Custom(Integer.valueOf(R$attr.uikit_colorLightBlue), false, null, false, null, 254), 10);
            LargeActionButton.ButtonStyle.FlatButton flatButton = LargeActionButton.ButtonStyle.f58734p;
            int i2 = R$attr.uikit_dp16;
            int i3 = R$attr.uikit_dp24;
            LargeActionButtonDelegate.Model model5 = new LargeActionButtonDelegate.Model("MORE_OPTIONS_ITEM_LIST_ID", flatButton, null, textLocalisedClause, false, null, null, i3, i3, i2, i2, 496);
            koi.j[] elements = new koi.j[7];
            elements[0] = model;
            elements[c2] = model2;
            elements[2] = modelA;
            elements[3] = model3;
            elements[4] = modelA2;
            elements[5] = model4;
            elements[6] = model5;
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = kotlin.collections.d.L(elements);
        }
        List list = listL;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(productDetailsScreenContract$InputData.f60817a == null ? R$string.product_catalogue_flow_catalogue_product_details_create_title : R$string.product_catalogue_flow_catalogue_product_details_edit_title, null, null, 14);
        String strL = m70.a.l(kotlin.text.f0.U0(i, str));
        if (strL == null) {
            strL = "- -";
        }
        return new l(list, textLocalisedClause2, new TextImage(strL, -1, ((pd1.c) aVar).c(str2), 0, 14, 40, 200), new TextLocalisedClause(productDetailsScreenContract$InputData.f60817a == null ? R$string.product_catalogue_flow_catalogue_product_details_create_cta_title : R$string.product_catalogue_common_action_save, null, null, 14), (str.length() <= 0 || domainState.f312747c <= 0) ? z : c2);
    }
}
