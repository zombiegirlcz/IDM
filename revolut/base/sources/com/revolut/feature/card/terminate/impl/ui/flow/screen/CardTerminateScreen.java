package com.revolut.feature.card.terminate.impl.ui.flow.screen;

import android.view.View;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.List;
import jki.h;
import jki.k;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ou2.f;
import rd0.e;
import sji.b;
import te0.w;
import tk5.c;
import tml.a;
import tna.p;
import tu2.d;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card/terminate/impl/ui/flow/screen/CardTerminateScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Ljki/k;", "Lcom/revolut/feature/card/terminate/impl/ui/flow/screen/CardTerminateScreenContract$InputData;", "Ltu2/d;", "feature_card_terminate_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardTerminateScreen extends BaseScreen<k, CardTerminateScreenContract$InputData, d> {
    public final TwinHorizontalButtonDelegate M;
    public final List N;
    public final int O;
    public final Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardTerminateScreen(CardTerminateScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = new TwinHorizontalButtonDelegate();
        this.M = twinHorizontalButtonDelegate;
        this.N = v.k(largeActionButtonDelegate, twinHorizontalButtonDelegate);
        this.O = R$layout.screen_transparent;
        this.P = w.y0(new a(this, inputData, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        k uiState = (k) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (f) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (tu2.h) ((f) this.P.getValue()).f229783h.get();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.M;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.d.f121375b), null, new c(this, continuation, 15), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new p(this, continuation, 12), 3);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((f) this.P.getValue()).d.get()).d(this.N);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }
}
