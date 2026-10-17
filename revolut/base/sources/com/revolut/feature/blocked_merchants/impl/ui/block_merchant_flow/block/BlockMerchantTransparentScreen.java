package com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block;

import android.view.View;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseScreen;
import jki.h;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tr2.j;
import zh0.b;
import zhm.v;
import zk7.a;
import zr2.d;
import zr2.e;
import zr2.f;
import zr2.n;
import zr2.r;
import zr2.s;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/block/BlockMerchantTransparentScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Lzr2/f;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/block/BlockMerchantScreenContract$InputData;", "Lzr2/d;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlockMerchantTransparentScreen extends BaseScreen<f, BlockMerchantScreenContract$InputData, d> {
    public final int M;
    public final Object N;
    public final Object O;
    public final LargeActionButtonDelegate P;
    public final RowDelegate Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockMerchantTransparentScreen(BlockMerchantScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = R$layout.screen_transparent;
        this.N = w.y0(new a(this, inputData, 15));
        this.O = w.y0(new b(this, 16));
        this.P = new LargeActionButtonDelegate();
        this.Q = new RowDelegate(null, null, 7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((n) ((e) this.O.getValue())).v2(d.a.f324532a);
        return true;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        f uiState = (f) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (j) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d.f121375b), null, new r(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f53218h), null, new s(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((j) this.N.getValue()).f.get()).d(v.k(this.P, this.Q, new RowLoadingDelegate()));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }
}
