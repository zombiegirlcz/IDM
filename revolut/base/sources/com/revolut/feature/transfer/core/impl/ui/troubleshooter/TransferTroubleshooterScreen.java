package com.revolut.feature.transfer.core.impl.ui.troubleshooter;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bc1.a;
import bi2.n;
import brf.b;
import brf.c;
import brf.e;
import brf.f;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterInputData;
import com.revolut.feature.transfer.core.impl.R$id;
import com.revolut.feature.transfer.core.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kpf.g;
import lpf.l;
import ofm.q;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/impl/ui/troubleshooter/TransferTroubleshooterScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lbrf/e;", "Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferTroubleshooterInputData;", "", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferTroubleshooterScreen extends BaseRecyclerViewScreen<e, TransferTroubleshooterInputData, Object> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(TransferTroubleshooterScreen.class, "binding", "getBinding()Lcom/revolut/feature/transfer/core/impl/databinding/ScreenTransferTroubleshooterBinding;", 0))};
    public final boolean U;
    public final int V;
    public final int W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final FullScreenStateDelegate f92227a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f92228b0;
    public final CellDetailsActionDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final PlainTextDelegate f92229d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f92230e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferTroubleshooterScreen(TransferTroubleshooterInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = true;
        this.V = R$layout.screen_transfer_troubleshooter;
        this.W = R$id.transferTroubleshooter_recyclerView;
        this.X = s.t(this, b.f);
        this.Y = w.y0(new a(this, inputData, 25));
        this.Z = w.y0(new bc1.b(this, 24));
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f92227a0 = fullScreenStateDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f92228b0 = rowDelegate;
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        this.c0 = cellDetailsActionDelegate;
        ProgressStepVerticalDelegate progressStepVerticalDelegate = new ProgressStepVerticalDelegate();
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        this.f92229d0 = plainTextDelegate;
        this.f92230e0 = v.k(new RowLoadingDelegate(), new CounterTextDelegate(), new ListSubheaderDelegate(), new CellDetailsDelegate(), plainTextDelegate, fullScreenStateDelegate, rowDelegate, cellDetailsActionDelegate, progressStepVerticalDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (l) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f188245b.f59410q), null, new brc.h(this, continuation, 1), 3);
        RowDelegate rowDelegate = this.f92228b0;
        r rVarMerge = r.merge(w.a0(rowDelegate.f53218h, new bq5.o0(20)), w.a0(rowDelegate.f53226s, new bq5.o0(21)), w.a0(this.c0.d, new bq5.o0(22)), w.a0(this.f92229d0.d.f121375b, new bq5.o0(23)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new n(this, continuation, 24), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f92227a0.f52371h.f121375b), null, new c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f188245b.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF92230e0() {
        return this.f92230e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(e uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g gVarH3 = h3();
        NavBarWithToolbar navBarWithToolbar = gVarH3.f188245b;
        TextLocalisedClause textLocalisedClause = uiState.f18007b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        NavBarWithToolbar transferTroubleshooterNavigationBar = gVarH3.f188245b;
        Intrinsics.checkNotNullExpressionValue(transferTroubleshooterNavigationBar, "transferTroubleshooterNavigationBar");
        transferTroubleshooterNavigationBar.setTitle(textLocalisedClause, null);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final g h3() {
        ViewBinding value = this.X.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (g) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
