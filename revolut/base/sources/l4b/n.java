package l4b;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.cfd.api.domain.models.Fee;
import com.revolut.feature.retail.cfd.api.domain.models.FeeBreakdownItem;
import com.revolut.feature.retail.cfd.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements m {
    public n(l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
    }

    public final rp0.y a(Fee fee2) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.wealth_margin_cfd_fee_breakdown, null, null, 14), null, null, 30);
        zhm.q qVarK1 = zhm.d0.k1(fee2.f82104b);
        ArrayList arrayList = new ArrayList(zhm.w.t(qVarK1, 10));
        Iterator it8 = qVarK1.iterator();
        while (true) {
            kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) it8;
            if (!((Iterator) dVar.f186416c).hasNext()) {
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return new rp0.y(arrayList, tVar, rp0.l.WINDOW, null, null, null, 1016);
            }
            IndexedValue indexedValue = (IndexedValue) dVar.next();
            int i = indexedValue.f186391a;
            FeeBreakdownItem feeBreakdownItem = (FeeBreakdownItem) indexedValue.f186392b;
            arrayList.add(new CellDetailsDelegate.Model(a0.d.n("CFD_BREAKDOWN_ID_", i), new TextClause(feeBreakdownItem.f82107a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(l4i.a.b(feeBreakdownItem.e), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, feeBreakdownItem, null, null, 0, null, false, null, 0, 0, 0, 0, 1048008));
        }
    }
}
