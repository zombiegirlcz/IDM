package tzh;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.staking.api.navigation.destination.TiersDialogDestination;
import com.revolut.feature.staking.api.tierrate.v2.TiersRateItemMapper$Parcel;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends a {
    @Override // tzh.a
    public final void Z2(TiersRateItemMapper$Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        A2(new BridgeDestination(vhi.c.c(new TiersDialogDestination(parcel), yhi.b.BOTTOM_DIALOG, null, false, 12)));
    }

    @Override // tzh.a
    public final void b3() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.cryptobuysell_staking_exchange_warmup, null, null, 14), new TextLocalisedClause(R$string.cryptobuysell_staking_exchange_warmup_dialog_v2_description, null, null, 14), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.cryptobuysell_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Crypto;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        n.P2(this, new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
    }
}
