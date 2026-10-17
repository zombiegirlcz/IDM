package skb;

import aw0.o9;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.vaults.R$string;
import h30.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements njb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f263803a;

    public f(b fundSheetsModelProvider, a bankSheetsModelProvider, g savingsProductInfoSheetsModelProvider) {
        Intrinsics.checkNotNullParameter(fundSheetsModelProvider, "fundSheetsModelProvider");
        Intrinsics.checkNotNullParameter(bankSheetsModelProvider, "bankSheetsModelProvider");
        Intrinsics.checkNotNullParameter(savingsProductInfoSheetsModelProvider, "savingsProductInfoSheetsModelProvider");
        this.f263803a = savingsProductInfoSheetsModelProvider;
    }

    public final y a(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(description, "description");
        return new y(u.c(c.a(d.Companion, R$attr.uikit_dp16, 0, 14)), new t(new TextLocalisedClause(R$string.vaults_hys_info_sheets_boosted_rates_title, null, null, 14), new HtmlClause(0, 30, (Integer) null, (Object) null, description), null, 28), null, null, null, null, "INFO_DELEGATES_KEY", null, null, null, 3836);
    }

    public final y b(SavingsProduct.Deduction deduction) {
        Intrinsics.checkNotNullParameter(deduction, "deduction");
        Intrinsics.checkNotNullParameter(deduction, "deduction");
        if (deduction.e == null) {
            throw new IllegalStateException(l.r("Description must not be null to show the deduction explanation dialog for ", deduction.f86634a));
        }
        rp0.l lVar = rp0.l.WINDOW;
        TextClause textClause = new TextClause(deduction.f86636c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = deduction.e;
        t tVar = new t(textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, 28);
        c cVar = d.Companion;
        int i = R$attr.uikit_dp16;
        return new y(u.c(c.a(cVar, i, i, 12)), tVar, lVar, null, null, null, "INFO_DELEGATES_KEY", null, null, null, 3832);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a4  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [com.revolut.core.ui_kit.models.Style] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r26v5, types: [com.revolut.core.ui_kit.models.Style] */
    /* JADX WARN: Type inference failed for: r33v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final rp0.y c(ncd.a r50) {
        /*
            Method dump skipped, instruction units count: 1180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: skb.f.c(ncd.a):rp0.y");
    }

    public final y d() {
        return new y(u.c(c.a(d.Companion, R$attr.uikit_dp16, 0, 14)), new t(new TextLocalisedClause(R$string.mmf_info_sheets_interest_rate_explanation_cells_service_fees, null, null, 14), new TextLocalisedClause(R$string.vaults_mmf_info_sheets_service_fees_subtitle, null, null, 14), null, 28), null, null, null, null, "INFO_DELEGATES_KEY", null, null, null, 3836);
    }

    public final y e(ProductGroup.Tax tax) {
        Intrinsics.checkNotNullParameter(tax, "tax");
        return this.f263803a.a(tax);
    }

    public final y f(SavingsProductData productData) {
        Intrinsics.checkNotNullParameter(productData, "productData");
        Intrinsics.checkNotNullParameter(productData, "<this>");
        ProductGroup.Tax tax = (ProductGroup.Tax) d0.d0(ocd.c.g(productData));
        if (tax != null) {
            return this.f263803a.a(tax);
        }
        return null;
    }
}
