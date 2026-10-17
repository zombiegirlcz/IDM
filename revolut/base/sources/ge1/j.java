package ge1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate;
import com.revolut.core.ui_kit.delegates.d6;
import com.revolut.core.ui_kit.delegates.e6;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.acquiring.lite_pos.api.model.CartItem;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import ip0.fh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd1.a f143214a;

    public j(pd1.a colorMapper) {
        Intrinsics.checkNotNullParameter(colorMapper, "colorMapper");
        this.f143214a = colorMapper;
    }

    public final ArrayList a(List products, cd1.e cart) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(cart, "cart");
        List<CatalogueProduct> list = products;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (CatalogueProduct catalogueProduct : list) {
            List list2 = cart.f23149a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (Intrinsics.f(((CartItem) obj2).f60663a, catalogueProduct.f60683a)) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it8 = arrayList2.iterator();
            int i = 0;
            while (it8.hasNext()) {
                i += ((CartItem) it8.next()).f60666g;
            }
            String strQ = j6.a.q("PRODUCTS_LIST_ID_", catalogueProduct.f60683a);
            fh fhVar = new fh(new TextClause(catalogueProduct.f60684b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(catalogueProduct.f, new MoneyClause.Format.Defaults(null, null, false, false, 7), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8));
            e6 e6Var = new e6(new TextClause(String.valueOf(i), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            if (i <= 0) {
                e6Var = null;
            }
            e6 e6Var2 = e6Var;
            String strL = m70.a.l(f0.U0(2, catalogueProduct.f60684b));
            if (strL == null) {
                strL = "- -";
            }
            ExtraSmallCardDelegate.Model model = new ExtraSmallCardDelegate.Model(strQ, fhVar, null, e6Var2, new d6(new TextImage(strL, -1, ((pd1.c) this.f143214a).c(catalogueProduct.d), 0, 14, 40, 200)), catalogueProduct, 16012);
            int i2 = R$attr.uikit_dp4;
            yp0.b.l(model, i2, i2, i2, i2, null, false, 48);
            arrayList.add(model);
        }
        return arrayList;
    }
}
