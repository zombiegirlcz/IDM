package l4c;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.revolut_shop.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    public f(z3c.i productMapper) {
        Intrinsics.checkNotNullParameter(productMapper, "productMapper");
    }

    public final RowDelegate.Model a(d3c.j item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String strQ = j6.a.q("ORDER_ITEM_LIST_ID_", item.f111034a);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new UrlImage(item.f111038h.f111015b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, false, null, false, 60);
        d3c.g gVar = item.f111037g;
        String str = gVar.f111016a;
        long j2 = item.f111036c;
        Clause clauseB = z3c.i.b(j2, str);
        String str2 = gVar.f111017b;
        return new RowDelegate.Model(strQ, image40, clauseB, null, 0, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, j2 > 1 ? new TextLocalisedClause(R$string.revolut_shop_flow_checkout_screen_checkout_order_summary_section_item_footer_value, u.c(new MoneyClause(item.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12) : null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(item.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867736);
    }
}
