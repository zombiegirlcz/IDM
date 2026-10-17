package ncc;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.revolutpay.promoted_merchants.models.merchants.PromotedMerchant;
import com.revolut.retail.common.ui.R$string;
import ip0.zj;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n8i.q0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    public d(b promotedMerchantBadgeMapper) {
        Intrinsics.checkNotNullParameter(promotedMerchantBadgeMapper, "promotedMerchantBadgeMapper");
    }

    public static List a() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ID_EMPTY_STATE", new TextLocalisedClause(R$string.search_empty_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32740);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    public final RowDelegate.Model b(PromotedMerchant merchant, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        return new RowDelegate.Model(j6.a.q("ID_MERCHANT_ITEM_", merchant.f84690a), new RowDelegate.Model.MainImage.Image40(dcc.a.a(merchant.f84691b), null, null, false, null, false, 60), new TextClause(merchant.f84690a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, z ? new TextLocalisedClause(com.revolut.feature.revolutpay.promoted_merchants.impl.R$string.revolut_pay_promoted_merchants_categories_subtitle_online, null, null, 14) : new TextClause(d0.k0(merchant.f84692c, null, null, null, 0, new q0(17), 31), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new RowDelegate.Model.c.a(z3 ? b.a(merchant) : null, null, false, 6), false, null, false, null, null, null, null, null, null, merchant, null, 0, 0, 0, 0, 532675544);
    }
}
