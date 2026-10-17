package rd1;

import aw0.e;
import aw0.f;
import aw0.g;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd1.a f253313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct.Shared f253314b;

    public a(pd1.a colorMapper) {
        Intrinsics.checkNotNullParameter(colorMapper, "colorMapper");
        this.f253313a = colorMapper;
        this.f253314b = new AnalyticsProduct.Shared(k9.CardReader, x0.CardReader, q6.CardReader, w2.CardReader, od.Terminal);
    }

    public final ActionsBottomSheetController a(dj0.d transactionLimit) {
        Intrinsics.checkNotNullParameter(transactionLimit, "transactionLimit");
        return new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(R$string.product_catalogue_common_error_validation_excessive_amount_dialog_title, null, null, 14), new TextLocalisedClause(R$string.product_catalogue_common_error_validation_excessive_amount_dialog_description, u.c(new MoneyClause(transactionLimit, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new lw0.b(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), null), null, false, 24), new e(false, null, null, new n6(new TextLocalisedClause(R$string.product_catalogue_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), this.f253314b, null, null, 24));
    }

    public final ActionsBottomSheetController b() {
        return new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(R$string.product_catalogue_flow_shopping_cart_edit_product_delete_item_title, null, null, 14), new TextLocalisedClause(R$string.product_catalogue_flow_shopping_cart_edit_product_delete_item_subtitle, null, null, 14), null, null, false, 28), new g(new n6(new TextLocalisedClause(R$string.product_catalogue_common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.product_catalogue_common_action_delete, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (f) null, 25), this.f253314b, null, null, 24));
    }
}
