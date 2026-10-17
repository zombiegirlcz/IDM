package rkb;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
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
import qv0.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(SavingsProductData productData) {
        Intrinsics.checkNotNullParameter(productData, "productData");
        ProductGroup productGroup = productData.f86684b;
        ProductGroup.InfoItemConfig infoItemConfig = productGroup.u;
        RowDelegate.Model modelB = null;
        RowDelegate.Model modelB2 = infoItemConfig != null ? b(R$drawable.uikit_icn_24_percent, "INTEREST_AND_FEES_LIST_ID", infoItemConfig.f86555a, infoItemConfig.f86556b, infoItemConfig.f86557c) : null;
        ProductGroup.RiskConfig riskConfig = productGroup.f86533s;
        RowDelegate.Model modelB3 = riskConfig != null ? b(R$drawable.uikit_icn_24_deposit_protection, "PROTECTION_AND_SAFETY_LIST_ID", riskConfig.f86573a, riskConfig.f86574b, riskConfig.f86575c) : null;
        ProductGroup.InfoItemConfig infoItemConfig2 = productGroup.f86534t;
        RowDelegate.Model modelB4 = infoItemConfig2 != null ? b(R$drawable.uikit_icn_24_services, "FUND_INFO_LIST_ITEM_ID", infoItemConfig2.f86555a, infoItemConfig2.f86556b, infoItemConfig2.f86557c) : null;
        SavingsProduct.Protection protection = productData.f86683a.f;
        SavingsProduct.Protection.Details details = protection != null ? protection.f : null;
        Intrinsics.checkNotNullParameter(productData, "<this>");
        boolean z = false;
        if (!ocd.a.d(productData) && details != null) {
            modelB = frg.a.b(new RowDelegate.Model("PROTECTION_SCHEME_LIST_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_deposit_protection, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), new TextClause(details.f86664a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new qkb.a(details.f86665b), null, 0, 0, 0, 0, 532676600));
        }
        i[] elements = {modelB2, modelB3, modelB4, modelB};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public static RowDelegate.Model b(int i, String str, String str2, String str3, String str4) {
        qkb.a aVar;
        TextClause textClause;
        TextClause textClause2 = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (str3 != null) {
            textClause = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            aVar = null;
        } else {
            aVar = null;
            textClause = null;
        }
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6);
        boolean z = str4 != null;
        if (str4 != null) {
            aVar = new qkb.a(str4);
        }
        return frg.a.b(new RowDelegate.Model(str, image24, textClause2, null, 0, textClause, null, null, 0, null, z, null, false, null, null, null, null, null, null, aVar, null, 0, 0, 0, 0, 532674520));
    }
}
