package com.revolut.feature.stock_lending.impl.ui.screens.transaction;

import a1e.g;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.stock_lending.impl.ui.screens.transaction.StockLendingTransactionDetailsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import jki.o;
import jnf.a;
import k16.d;
import k1e.b;
import k1e.c;
import k1e.e;
import k1e.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/stock_lending/impl/ui/screens/transaction/StockLendingTransactionDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lk1e/f;", "Lcom/revolut/feature/stock_lending/impl/ui/screens/transaction/StockLendingTransactionDetailsScreenContract$InputData;", "Laii/q;", "", "feature_stock_lending_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockLendingTransactionDetailsScreen extends BaseRecyclerViewScreen<f, StockLendingTransactionDetailsScreenContract$InputData, q> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(StockLendingTransactionDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h U;
    public final boolean V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f88408a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f88409b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockLendingTransactionDetailsScreen(StockLendingTransactionDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, b.f);
        this.V = true;
        this.W = R$layout.screen_recycler_navbar;
        this.X = w.y0(new a(this, inputData, 22));
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: k1e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockLendingTransactionDetailsScreen f180217b;

            {
                this.f180217b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StockLendingTransactionDetailsScreen stockLendingTransactionDetailsScreen = this.f180217b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StockLendingTransactionDetailsScreen.c0;
                        return (e) ((a1e.g) stockLendingTransactionDetailsScreen.X.getValue()).f621c.get();
                    default:
                        return v.k((CellDetailsDelegate) stockLendingTransactionDetailsScreen.f88408a0.getValue(), (CellDetailsChevronDelegate) stockLendingTransactionDetailsScreen.Z.getValue());
                }
            }
        });
        this.Z = w.y0(new d(7));
        this.f88408a0 = w.y0(new d(8));
        final int i2 = 1;
        this.f88409b0 = w.y0(new Function0(this) { // from class: k1e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockLendingTransactionDetailsScreen f180217b;

            {
                this.f180217b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StockLendingTransactionDetailsScreen stockLendingTransactionDetailsScreen = this.f180217b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StockLendingTransactionDetailsScreen.c0;
                        return (e) ((a1e.g) stockLendingTransactionDetailsScreen.X.getValue()).f621c.get();
                    default:
                        return v.k((CellDetailsDelegate) stockLendingTransactionDetailsScreen.f88408a0.getValue(), (CellDetailsChevronDelegate) stockLendingTransactionDetailsScreen.Z.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (g) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174539b.f59410q), null, new jkc.g(this, null, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsChevronDelegate) this.Z.getValue()).f51821c), null, new c(2, 4, e.class, (e) this.Y.getValue(), "onCellDetailsChevronClicked", "onCellDetailsChevronClicked(Lcom/revolut/core/ui_kit/delegates/CellDetailsChevronDelegate$Model;)V"), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getJ0() {
        return (List) this.f88409b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(f uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        MoneyClause moneyClause = uiState.f180219a;
        navBarWithToolbar.setTitle(moneyClause, null);
        navBarWithToolbar.setToolbarTitle(moneyClause);
        navBarWithToolbar.setDescriptionText(uiState.f180220b);
        navBarWithToolbar.setSecondDescriptionText(uiState.f180221c);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setEndIconImage(uiState.d);
        navBarWithToolbar.setEndIconBadgeImage(uiState.e);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.W;
    }

    public final m h3() {
        ViewBinding value = this.U.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
