package gp7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Payment;
import com.revolut.feature.insurance_car.impl.data.model.PaymentBreakdownCategory;
import com.revolut.feature.insurance_car.impl.data.model.PriceWithLabel;
import ip0.ck0;
import ip0.y7;
import java.util.ArrayList;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kl7.f1;
import kotlin.jvm.internal.Intrinsics;
import xl7.n;
import zhm.a0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements p {
    @Override // jki.p
    public final m a(i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Payment payment = domainState.f145280a;
        boolean z = payment.f75272a == f1.MONTHLY;
        PriceWithLabel priceWithLabel = payment.f75274c;
        PriceWithLabel priceWithLabel2 = payment.f75273b;
        aim.e eVarB = u.b();
        ArrayList<PaymentBreakdownCategory> arrayList = domainState.f145280a.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (PaymentBreakdownCategory paymentBreakdownCategory : arrayList) {
            String str = paymentBreakdownCategory.f75277a;
            TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
            ArrayList arrayList3 = paymentBreakdownCategory.f75278b;
            dj0.d.Companion.getClass();
            dj0.d dVarO = dj0.d.e;
            int i = 0;
            for (Object obj2 : arrayList3) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                dVarO = i == 0 ? ((PriceWithLabel) obj2).f75296b : pyd.c.O(dVarO, ((PriceWithLabel) obj2).f75296b);
                i = i2;
            }
            arrayList2.add(new CellDetailsDelegate.Model(str, textClause, n.g(dVarO, null, null, 3), null, resourceImage, true, 0, null, paymentBreakdownCategory, null, null, 0, null, false, null, 0, 0, 0, 0, 1048008));
        }
        a0.x(arrayList2, eVarB);
        eVarB.add(new CellDetailsDelegate.Model("TAX_ITEM", new TextClause(priceWithLabel.f75295a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), n.g(priceWithLabel.f75296b, null, null, 3), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        String str2 = priceWithLabel2.f75295a;
        dj0.d dVar = priceWithLabel2.f75296b;
        eVarB.add(new y7("TOTAL_ITEM", n.g(dVar, null, null, 3), new TextClause(str2, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, 0, null, R$attr.uikit_dp8, 0, 1912));
        if (z) {
            eVarB.add(new TextDelegate.Model("MONTHLY_DESC_ITEM", new TextLocalisedClause(R$string.car_insurance_payment_breakdown_cells_total_note, u.c(n.g(pyd.c.k(dVar, 12L), null, null, 3)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), false, new ck0(0), null, null, R$attr.uikit_dp8, 0, 0, 0, 1908));
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return new e(eVarA);
    }
}
