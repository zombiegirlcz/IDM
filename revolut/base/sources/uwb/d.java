package uwb;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.r0;
import com.revolut.core.ui_kit.delegates.s0;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import com.revolut.feature.rev_points.models.RevPoints;
import ip0.xk;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static xk a(ArrayList voucherProducts, VoucherProduct voucherProduct, RevPoints balance) {
        Intrinsics.checkNotNullParameter(voucherProducts, "voucherProducts");
        Intrinsics.checkNotNullParameter(balance, "balance");
        int size = voucherProducts.isEmpty() ? 1 : voucherProducts.size() < 4 ? voucherProducts.size() : voucherProducts.size() == 4 ? 2 : 3;
        ArrayList arrayList = new ArrayList(w.t(voucherProducts, 10));
        int i = 0;
        for (Object obj2 : voucherProducts) {
            int i2 = i + 1;
            r0 r0Var = null;
            if (i < 0) {
                v.s();
                throw null;
            }
            VoucherProduct voucherProduct2 = (VoucherProduct) obj2;
            String strT = v1.c.t(i, "SECTION_GRID_BOX_ID_", voucherProduct2.f83639a, "_");
            MoneyClause moneyClause = new MoneyClause(voucherProduct2.f83641c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            CompositeClause compositeClauseL = nub.a.l(voucherProduct2.f83640b, o9.NON_SENSITIVE, null, Integer.valueOf(R$attr.uikit_colorForeground), 12.0f, 36);
            RevPoints revPoints = voucherProduct2.f83640b;
            s0 s0Var = revPoints.d(balance) ? s0.NORMAL : s0.DISABLED;
            if (revPoints.equals(voucherProduct != null ? voucherProduct.f83640b : null)) {
                r0Var = new r0(v.k(Integer.valueOf(R$attr.uikit_colorRevPointsGradientStart), Integer.valueOf(R$attr.uikit_colorRevPointsGradientEnd)));
            }
            AttributeSelectorSmallDelegate.Model model = new AttributeSelectorSmallDelegate.Model(strT, moneyClause, compositeClauseL, r0Var, s0Var, false, voucherProduct2, null, 416);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
            i = i2;
        }
        xk xkVar = new xk("SECTION_GRID_BOX_ID", arrayList, Integer.valueOf(size), null, null, 56);
        int i3 = R$attr.uikit_dp0;
        yp0.b.p(xkVar, i3, i3, i3, i3);
        return xkVar;
    }
}
