package jmb;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.mf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f176516a;

    public f(tkb.e protectionSchemeMapper, dcd.b interestRateFormatter) {
        Intrinsics.checkNotNullParameter(protectionSchemeMapper, "protectionSchemeMapper");
        Intrinsics.checkNotNullParameter(interestRateFormatter, "interestRateFormatter");
        this.f176516a = interestRateFormatter;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.delegates.ListCellDelegate.Model a(com.revolut.feature.shared.savings.models.product.SavingsProduct r20) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jmb.f.a(com.revolut.feature.shared.savings.models.product.SavingsProduct):com.revolut.core.ui_kit.delegates.ListCellDelegate$Model");
    }

    public static RowDelegate.Model b(SavingsProduct savingsProduct) {
        int i;
        SavingsProduct.DepositLimits depositLimits = savingsProduct.f86630t;
        if (depositLimits == null) {
            return null;
        }
        int i2 = e.f176515a[savingsProduct.f86619c.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = R$drawable.uikit_icn_24_arrow_top_down;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_coins;
        }
        boolean z = false;
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6);
        TextClause textClause = new TextClause(depositLimits.f86637a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = depositLimits.f86638b;
        return new RowDelegate.Model("MIN_DEPOSIT_LIST_ITEM_ID", image24, textClause, null, 0, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
    }

    public static RowDelegate.Model c(ProductGroup productGroup) {
        ProductGroup.InterestPayoutConfig interestPayoutConfig = productGroup.f86529n;
        if (interestPayoutConfig == null) {
            return null;
        }
        ProductGroup.Explanation explanation = interestPayoutConfig.d;
        c cVar = explanation != null ? new c(explanation) : null;
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6);
        TextClause textClause = new TextClause(interestPayoutConfig.f86558a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = interestPayoutConfig.f86559b;
        return new RowDelegate.Model("INTEREST_PAID_ITEM_ID", image24, textClause, null, 0, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, cVar != null, null, false, null, null, cVar != null ? new mf(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false) : null, null, null, null, cVar, null, 0, 0, 0, 0, 532608984);
    }

    public static j8 e(int i) {
        return new j8(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    public final RowDelegate.Model d(SavingsProductData savingsProductData) {
        TextLocalisedClause textLocalisedClause;
        SavingsProduct savingsProduct = savingsProductData.f86683a;
        SavingsProduct.InterestRate interestRate = savingsProduct.f86621h;
        ArrayList arrayList = interestRate.f86644a;
        if (arrayList.size() <= 1) {
            return null;
        }
        SavingsProduct.InterestRate.RateTier rateTier = (SavingsProduct.InterestRate.RateTier) arrayList.get(1);
        SavingsProduct.InterestRate interestRate2 = savingsProduct.f86621h;
        xi0.b bVar = savingsProduct.f86618b;
        Clause clauseF = pbd.a.f(this.f176516a, rateTier, interestRate2);
        long j2 = rateTier.f86652a;
        boolean z = false;
        if (arrayList.size() == 2) {
            int i = R$string.savings_review_product_details_tiered_limits_subtitle;
            String str = savingsProductData.f86684b.d.f86566j;
            Clause[] elements = {clauseF, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            m70.a.t(t0.f186434a);
            textLocalisedClause = new TextLocalisedClause(i, v.k(new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), new MoneyClause(new dj0.d(j2, bVar), new MoneyClause.Format.Defaults(null, null, false, true, 7), null, null, 12)), null, 12);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.savings_review_details_cells_tiered_rate_multiple_subtitle, u.c(new MoneyClause(new dj0.d(j2, bVar), new MoneyClause.Format.Defaults(null, null, false, true, 7), null, null, 12)), null, 12);
        }
        return new RowDelegate.Model("TIERED_LIMITS_ITEM_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bar_chart_percent, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), new TextClause(interestRate.e.f86642a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, textLocalisedClause, null, null, 0, null, true, null, false, null, null, new mf(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false), null, null, null, d.f176514a, null, 0, 0, 0, 0, 532608984);
    }
}
