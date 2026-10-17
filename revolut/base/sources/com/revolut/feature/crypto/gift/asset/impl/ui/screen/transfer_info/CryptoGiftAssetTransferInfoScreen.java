package com.revolut.feature.crypto.gift.asset.impl.ui.screen.transfer_info;

import android.view.View;
import bc1.b;
import bh5.a;
import bh5.g;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTextProgressDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.crypto.gift.asset.api.navigation.CryptoGiftAssetTransferInfoInputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og5.d;
import te0.w;
import tg5.f;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/gift/asset/impl/ui/screen/transfer_info/CryptoGiftAssetTransferInfoScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Log5/d;", "Lbh5/a;", "feature_crypto_gift_asset_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoGiftAssetTransferInfoScreen extends BaseBottomSheetRecyclerController<d, a> {
    public static final /* synthetic */ int U = 0;
    public final FullScreenStateDelegate Q;
    public final List R;
    public final Object S;
    public final Object T;

    public CryptoGiftAssetTransferInfoScreen(CryptoGiftAssetTransferInfoInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Q = fullScreenStateDelegate;
        this.R = v.k(new CellDetailsTextProgressDelegate(), new CellDetailsLoadingDelegate(), fullScreenStateDelegate);
        this.S = w.y0(new bc1.a(this, inputData, 7));
        this.T = w.y0(new b(this, 4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (bh5.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new bh5.f(this, null, 0), 3);
        ViewController.P2(this, f3(), new bh5.f(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new g(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (bh5.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
