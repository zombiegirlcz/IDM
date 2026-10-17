package g46;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.defi.exchange.impl.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mre.c f140345l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f140346m;

    public f(mre.c termsNavigationFactory, d dialogMapper) {
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.f140345l = termsNavigationFactory;
        this.f140346m = dialogMapper;
    }

    @Override // g46.a
    public final void Z2(CellDetailsActionDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.f51787l instanceof d4i.d) {
            this.f140346m.getClass();
            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.crypto_defi_swap_price_info_title, null, null, 14), new TextLocalisedClause(R$string.crypto_defi_swap_price_info_description, u.c(new TextLocalisedClause(R$string.crypto_defi_swap_price_info_description_learn_more, null, new Click(30, (Integer) null, (Object) null, "DEFI_PRICE_EXPLANATION_LEARN_MORE", false), 10)), null, 12), null, null, false, 28);
            aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.crypto_defi_swap_price_info_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
            k9 k9Var = k9.Crypto;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            g1.b block = new g1.b(this, 25);
            Intrinsics.checkNotNullParameter(block, "block");
            actionsBottomSheetController.H = block;
            n.P2(this, actionsBottomSheetController, ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        }
    }
}
