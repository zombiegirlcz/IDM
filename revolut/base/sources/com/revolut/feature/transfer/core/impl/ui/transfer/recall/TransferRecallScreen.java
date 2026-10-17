package com.revolut.feature.transfer.core.impl.ui.transfer.recall;

import agh.b;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import arf.a;
import arf.c;
import arf.e;
import arf.l;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transfer.core.R$string;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferRecallInputData;
import com.revolut.feature.transfer.core.impl.R$id;
import com.revolut.feature.transfer.core.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lpf.k;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer/core/impl/ui/transfer/recall/TransferRecallScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Larf/e;", "Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferRecallInputData;", "Laii/q;", "", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferRecallScreen extends BaseRecyclerViewScreen<e, TransferRecallInputData, q> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f92225b0 = {o0.f186429a.j(new h0(TransferRecallScreen.class, "binding", "getBinding()Lcom/revolut/feature/transfer/core/impl/databinding/ScreenTransferRecallBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final boolean X;
    public final FullScreenStateDelegate Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f92226a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRecallScreen(TransferRecallInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$id.transferRecallScreen_recyclerView;
        this.V = R$layout.screen_transfer_recall;
        this.W = s.t(this, a.f);
        this.X = true;
        this.Y = new FullScreenStateDelegate();
        this.Z = w.y0(new b(this, inputData, 28));
        this.f92226a0 = w.y0(new aqe.a(this, 5));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (k) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (l) this.f92226a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f188239b.f59410q), null, new arf.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f188240c.o), null, new arf.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Y.f52371h.f121375b), null, new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((k) this.Z.getValue()).getClass();
        NavBarWithToolbar navBarWithToolbar = h3().f188239b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transfer_recall_header_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.transfer_recall_header_title, null, null, 14));
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.transfer_recall_header_description, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        h30.l.A(R.string.common_action_continue, null, null, 14, h3().f188240c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF92555b0() {
        return v.k(new FullScreenStateDelegate(), new ListSubheaderDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate());
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
        NavBarWithToolbar navBarWithToolbar = h3().f188239b;
        Clause clause = uiState.f8696b;
        navBarWithToolbar.setDescriptionVisible(clause != null);
        h3().f188239b.setDescriptionText(clause);
        LargeActionButton largeActionButton = h3().f188240c;
        largeActionButton.setEnabled(uiState.f8697c);
        largeActionButton.setLoadingButtonTag("RECALL_CTA_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.V;
    }

    public final kpf.e h3() {
        ViewBinding value = this.W.getValue(this, f92225b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (kpf.e) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
