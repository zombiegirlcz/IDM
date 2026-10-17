package txh;

import android.os.Parcelable;
import aw0.f;
import aw0.g;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature_crypto_order_details.impl.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import grl.k9;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.z;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static ActionsBottomSheetController a(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        lw0.a aVar = new lw0.a(textLocalisedClause, textLocalisedClause2, null, null, false, 28);
        g gVar = new g(new n6(new TextLocalisedClause(R$string.cryptobuysell_common_action_no, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.cryptobuysell_common_action_confirmation_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (f) null, 25);
        k9 k9Var = k9.Crypto;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }

    public static z b() {
        return new z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
    }

    public static j0 c() {
        return new j0((Clause) new TextLocalisedClause(R$string.cryptobuysell_take_profit_stop_loss_order_cancelled_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
    }
}
