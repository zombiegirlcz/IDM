package a26;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto_investments.api.model.PocketItemParcel;
import com.revolut.feature.crypto_investments.api.widget.split.SplitAccountsWidgetContract$AssetModelExtension;
import com.revolut.feature.defi.asset_details.api.navigation.DeFiAssetDetailsDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends SplitAccountsWidgetContract$AssetModelExtension {
    @Override // com.revolut.feature.crypto_investments.api.widget.split.SplitAccountsWidgetContract$AssetModelExtension
    public final void Z2(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        if (obj2 instanceof PocketItemParcel) {
            PocketItemParcel pocketItemParcel = (PocketItemParcel) obj2;
            if (pocketItemParcel.f71387b instanceof SplitAccountsWidgetContract$AssetModelExtension.SplitAccountParcel) {
                A2(new DeFiAssetDetailsDestination(pocketItemParcel.f71386a));
            }
        }
    }
}
