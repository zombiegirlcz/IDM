package skb;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import h30.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f263804a;

    public g(dcd.b savingsInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        this.f263804a = savingsInterestRateFormatter;
    }

    public final y a(ProductGroup.Tax tax) {
        Intrinsics.checkNotNullParameter(tax, "tax");
        String str = tax.d;
        List list = tax.f86584c;
        if (str == null && list.size() <= 1) {
            throw new IllegalStateException(l.r("Description must not be null to show the tax explanation dialog for ", tax.f86582a));
        }
        rp0.l lVar = rp0.l.WINDOW;
        TextClause textClause = new TextClause(tax.f86582a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = tax.d;
        t tVar = new t(textClause, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, 28);
        aim.e eVarB = u.b();
        if (list.size() > 1) {
            List<ProductGroup.TaxBand> list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (ProductGroup.TaxBand taxBand : list2) {
                String str3 = taxBand.f86585a;
                arrayList.add(new CellDetailsDelegate.Model(str3, new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new PercentageClause(taxBand.f86587c, (PercentageClause.Format) null, (Custom) null, 6), 0, null, null, null, null, null, false, 0, 0, 31736));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayList);
        }
        c cVar = d.Companion;
        int i = R$attr.uikit_dp16;
        eVarB.add(c.a(cVar, i, i, 12));
        return new y(u.a(eVarB), tVar, lVar, null, null, null, "INFO_DELEGATES_KEY", null, null, null, 3832);
    }
}
