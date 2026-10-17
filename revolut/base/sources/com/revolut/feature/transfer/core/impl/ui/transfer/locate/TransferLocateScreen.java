package com.revolut.feature.transfer.core.impl.ui.transfer.locate;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transfer.core.R$string;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferLocateInputData;
import com.revolut.feature.transfer.core.impl.R$id;
import com.revolut.feature.transfer.core.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import h30.l;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lpf.j;
import te0.w;
import vc.s;
import zh0.b;
import zhm.v;
import zqf.a;
import zqf.c;
import zqf.e;
import zqf.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer/core/impl/ui/transfer/locate/TransferLocateScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lzqf/e;", "Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferLocateInputData;", "Laii/q;", "", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferLocateScreen extends BaseRecyclerViewScreen<e, TransferLocateInputData, q> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f92223b0 = {o0.f186429a.j(new h0(TransferLocateScreen.class, "binding", "getBinding()Lcom/revolut/feature/transfer/core/impl/databinding/ScreenTransferLocateBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final boolean X;
    public final FullScreenStateDelegate Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f92224a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferLocateScreen(TransferLocateInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$id.transferLocateScreen_recyclerView;
        this.V = R$layout.screen_transfer_locate;
        this.W = s.t(this, a.f);
        this.X = true;
        this.Y = new FullScreenStateDelegate();
        this.Z = w.y0(new zk7.a(this, inputData, 13));
        this.f92224a0 = w.y0(new b(this, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (j) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (k) this.f92224a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f188233b.f59410q), null, new zqf.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f188234c.o), null, new zqf.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Y.f52371h.f121375b), null, new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j) this.Z.getValue()).getClass();
        NavBarWithToolbar navBarWithToolbar = h3().f188233b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transfer_locate_header_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.transfer_locate_header_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        l.A(R.string.common_action_continue, null, null, 14, h3().f188234c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getC0() {
        return v.k(this.Y, new ListSubheaderDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(e uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f188233b.setDescriptionText(uiState.f324479b);
        LargeActionButton largeActionButton = h3().f188234c;
        largeActionButton.setEnabled(uiState.f324480c);
        largeActionButton.setLoadingButtonTag("LOCATE_CTA_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.V;
    }

    public final kpf.c h3() {
        ViewBinding value = this.W.getValue(this, f92223b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (kpf.c) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
