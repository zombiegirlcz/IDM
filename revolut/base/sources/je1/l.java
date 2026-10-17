package je1;

import aw0.o9;
import cli.n;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.CategoryDetailsScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CategoryDetailsScreenContract$InputData f173182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pd1.a f173183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rd1.b f173184c;

    public l(CategoryDetailsScreenContract$InputData inputData, pd1.a colorMapper, rd1.b catalogueCommonItemsFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(colorMapper, "colorMapper");
        Intrinsics.checkNotNullParameter(catalogueCommonItemsFactory, "catalogueCommonItemsFactory");
        this.f173182a = inputData;
        this.f173183b = colorMapper;
        this.f173184c = catalogueCommonItemsFactory;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        InputTextDelegate.Model model = new InputTextDelegate.Model("NAME_LIST_ID", new TextClause(domainState.f173172a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.product_catalogue_flow_catalogue_category_details_name_label, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, true, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -67108872, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        String str = domainState.f173174c;
        pd1.c cVar = (pd1.c) this.f173183b;
        List listB = cVar.b(str);
        ArrayList arrayList = new ArrayList(w.t(listB, 10));
        Iterator it8 = listB.iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Number) it8.next()).intValue();
            String strA = cVar.a(iIntValue);
            arrayList.add(new IconSelectorDelegate.SelectableIconModel(a0.d.n("COLOR_ITEM_ID", iIntValue), LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_circle_background, Integer.valueOf(R$attr.uikit_colorTransparent), iIntValue, BitmapDescriptorFactory.HUE_RED, null, null, 48), Intrinsics.f(domainState.f173173b, strA), null, null, false, null, R$attr.uikit_colorGrey20, false, strA, null, 2936));
        }
        List listK = v.k(model, new IconSelectorDelegate.Model("COLOR_PICKER_ITEM_ID", arrayList, null, null, null, 60));
        CatalogueCategory catalogueCategory = this.f173182a.f60786a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(catalogueCategory == null ? R$string.product_catalogue_flow_catalogue_category_details_create_title : R$string.product_catalogue_flow_catalogue_category_details_edit_title, null, null, 14);
        IconNavBarMenuItem iconNavBarMenuItemB = ((rd1.d) this.f173184c).b();
        if (catalogueCategory == null) {
            iconNavBarMenuItemB = null;
        }
        return new i(textLocalisedClause, new TextLocalisedClause(catalogueCategory == null ? R$string.product_catalogue_flow_catalogue_category_details_create_cta_title : R$string.product_catalogue_common_action_save, null, null, 14), listK, v.l(iconNavBarMenuItemB), domainState.f173172a.length() > 0);
    }
}
