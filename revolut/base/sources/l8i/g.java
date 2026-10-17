package l8i;

import com.revolut.feature_crypto_order_flow.api.navigation.AccountBalanceLimitBottomSheetControllerProvider$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends b {
    @Override // l8i.b
    public final void Z2(Limit.UsageLimit limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        n.P2(this, o2(new nyh.a(new AccountBalanceLimitBottomSheetControllerProvider$InputData(limit))), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
    }
}
