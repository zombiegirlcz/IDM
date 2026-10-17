package com.revolut.feature.transactions.impl.ui.pending.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.R$id;
import com.revolut.feature.transactions.impl.R$layout;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nfj.j2;
import ni1.a;
import nn7.d;
import nnf.b;
import nnf.c;
import nnf.e;
import nnf.f;
import nnf.g;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/impl/ui/pending/screen/PendingTransactionScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lnnf/g;", "Lcom/revolut/feature/transactions/impl/ui/pending/screen/PendingTransactionScreenContract$InputData;", "Lnnf/e;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PendingTransactionScreen extends BaseRecyclerViewScreen<g, PendingTransactionScreenContract$InputData, e> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(PendingTransactionScreen.class, "binding", "getBinding()Lcom/revolut/feature/transactions/impl/databinding/ScreenPendingTransactionBinding;", 0))};
    public final h U;
    public final int V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final LargeActionButtonDelegate f92077a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f92078b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingTransactionScreen(PendingTransactionScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, b.f);
        this.V = R$layout.screen_pending_transaction;
        this.W = R$id.pendingTransactionScreen_recyclerView;
        this.X = w.y0(new a(this, inputData, 8));
        this.Y = w.y0(new nmm.h(this, 1));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Z = rowDelegate;
        this.f92077a0 = new LargeActionButtonDelegate();
        this.f92078b0 = v.k(rowDelegate, new RowLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (gnf.e) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.U.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((yif.a) value).f314325b.f59410q), null, new j2(this, null, 16), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Z.f53226s), null, new d(this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f92077a0.d.f121375b), null, new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.U.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((yif.a) value).f314325b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.transactionUI_transaction_pending_info_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transactionUI_transaction_pending_info_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        ((j60.a) ((gnf.e) this.X.getValue()).d.get()).d(u.c(this.f92077a0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF92078b0() {
        return this.f92078b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }
}
