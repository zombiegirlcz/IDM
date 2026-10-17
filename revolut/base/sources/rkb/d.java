package rkb;

import aim.e;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static e a(SavingsProductData savingsProduct, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(savingsProduct, "savingsProduct");
        SavingsProduct savingsProduct2 = savingsProduct.f86683a;
        ProductGroup productGroup = savingsProduct.f86684b;
        ProductGroup.DocumentsConfig documentsConfig = productGroup.f86531q;
        ProductGroup.Action action = productGroup.f86530p;
        e eVarB = u.b();
        int i = 6;
        boolean z = false;
        if (textLocalisedClause != null) {
            eVarB.add(frg.a.b(new RowDelegate.Model("DOCUMENT_STATEMENT_LIST_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i), textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904)));
        }
        if (!savingsProduct2.f86624m.isEmpty() && documentsConfig != null) {
            eVarB.add(frg.a.b(new RowDelegate.Model("DOCUMENTS_LIST_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_documents_pair, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i), new TextClause(documentsConfig.f86548a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904)));
        }
        if (action != null) {
            eVarB.add(frg.a.b(new RowDelegate.Model("GENERAL_FAQ_LIST_ITEM", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_question, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i), new TextClause(action.f86535a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new c(action.f86536b), null, 0, 0, 0, 0, 532676600)));
        }
        return u.a(eVarB);
    }
}
