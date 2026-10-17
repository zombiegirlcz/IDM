package com.revolut.feature.stock_lending.impl.ui.v2.screen.product;

import a1e.f;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.u4;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.feature.stock_lending.impl.R$string;
import com.revolut.feature.stock_lending.impl.ui.v2.screen.product.StockLendingProductScreen;
import com.revolut.feature.stock_lending.impl.ui.v2.screen.product.StockLendingProductScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.youTransactor.uCube.rpc.Constants;
import dli.a;
import jii.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m1e.b;
import m1e.c;
import m1e.d;
import m1e.g;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/stock_lending/impl/ui/v2/screen/product/StockLendingProductScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lm1e/h;", "Companion", "a", "feature_stock_lending_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockLendingProductScreen extends ViewController<q> implements a {
    public final StockLendingProductScreenContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final ExpandableCellDelegate O;
    public final ListSubheaderDelegate P;
    public final GridBoxDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(StockLendingProductScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBigTitleNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.stock_lending.impl.ui.v2.screen.product.StockLendingProductScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public StockLendingProductScreen(StockLendingProductScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_big_title_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new ExpandableCellDelegate();
        this.P = new ListSubheaderDelegate();
        this.Q = new GridBoxDelegate(u.c(new CounterTextDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: m1e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockLendingProductScreen f201478b;

            {
                this.f201478b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StockLendingProductScreen stockLendingProductScreen = this.f201478b;
                switch (i2) {
                    case 0:
                        StockLendingProductScreen.Companion companion = StockLendingProductScreen.INSTANCE;
                        StockLendingProductScreen stockLendingProductScreen2 = this.f201478b;
                        return dli.f.a(stockLendingProductScreen2, stockLendingProductScreen2.R2(), v.k(stockLendingProductScreen2.N, stockLendingProductScreen2.O, stockLendingProductScreen2.P, stockLendingProductScreen2.Q, new TextDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, new m18.n(2), null, null, 48);
                    case 1:
                        StockLendingProductScreen.Companion companion2 = StockLendingProductScreen.INSTANCE;
                        qji.b bVarU2 = stockLendingProductScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.stock_lending.impl.ui.v2.screen.product.di.StockLendingProductScreenInjector");
                        a1e.e eVar = (a1e.e) bVarU2;
                        a1e.b bVar = eVar.f615b;
                        a1e.e eVar2 = eVar.f616c;
                        StockLendingProductScreenContract$InputData stockLendingProductScreenContract$InputData = stockLendingProductScreen.K;
                        stockLendingProductScreenContract$InputData.getClass();
                        return new a1e.f(bVar, eVar2, stockLendingProductScreenContract$InputData);
                    default:
                        StockLendingProductScreen.Companion companion3 = StockLendingProductScreen.INSTANCE;
                        return (g) ((a1e.f) stockLendingProductScreen.S.getValue()).f618b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: m1e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockLendingProductScreen f201478b;

            {
                this.f201478b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StockLendingProductScreen stockLendingProductScreen = this.f201478b;
                switch (i22) {
                    case 0:
                        StockLendingProductScreen.Companion companion = StockLendingProductScreen.INSTANCE;
                        StockLendingProductScreen stockLendingProductScreen2 = this.f201478b;
                        return dli.f.a(stockLendingProductScreen2, stockLendingProductScreen2.R2(), v.k(stockLendingProductScreen2.N, stockLendingProductScreen2.O, stockLendingProductScreen2.P, stockLendingProductScreen2.Q, new TextDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, new m18.n(2), null, null, 48);
                    case 1:
                        StockLendingProductScreen.Companion companion2 = StockLendingProductScreen.INSTANCE;
                        qji.b bVarU2 = stockLendingProductScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.stock_lending.impl.ui.v2.screen.product.di.StockLendingProductScreenInjector");
                        a1e.e eVar = (a1e.e) bVarU2;
                        a1e.b bVar = eVar.f615b;
                        a1e.e eVar2 = eVar.f616c;
                        StockLendingProductScreenContract$InputData stockLendingProductScreenContract$InputData = stockLendingProductScreen.K;
                        stockLendingProductScreenContract$InputData.getClass();
                        return new a1e.f(bVar, eVar2, stockLendingProductScreenContract$InputData);
                    default:
                        StockLendingProductScreen.Companion companion3 = StockLendingProductScreen.INSTANCE;
                        return (g) ((a1e.f) stockLendingProductScreen.S.getValue()).f618b.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: m1e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockLendingProductScreen f201478b;

            {
                this.f201478b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StockLendingProductScreen stockLendingProductScreen = this.f201478b;
                switch (i22) {
                    case 0:
                        StockLendingProductScreen.Companion companion = StockLendingProductScreen.INSTANCE;
                        StockLendingProductScreen stockLendingProductScreen2 = this.f201478b;
                        return dli.f.a(stockLendingProductScreen2, stockLendingProductScreen2.R2(), v.k(stockLendingProductScreen2.N, stockLendingProductScreen2.O, stockLendingProductScreen2.P, stockLendingProductScreen2.Q, new TextDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, new m18.n(2), null, null, 48);
                    case 1:
                        StockLendingProductScreen.Companion companion2 = StockLendingProductScreen.INSTANCE;
                        qji.b bVarU2 = stockLendingProductScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.stock_lending.impl.ui.v2.screen.product.di.StockLendingProductScreenInjector");
                        a1e.e eVar = (a1e.e) bVarU2;
                        a1e.b bVar = eVar.f615b;
                        a1e.e eVar2 = eVar.f616c;
                        StockLendingProductScreenContract$InputData stockLendingProductScreenContract$InputData = stockLendingProductScreen.K;
                        stockLendingProductScreenContract$InputData.getClass();
                        return new a1e.f(bVar, eVar2, stockLendingProductScreenContract$InputData);
                    default:
                        StockLendingProductScreen.Companion companion3 = StockLendingProductScreen.INSTANCE;
                        return (g) ((a1e.f) stockLendingProductScreen.S.getValue()).f618b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        m1e.h uiState = (m1e.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174536b.setText(uiState.f201482b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f174537c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_title, null, null, 14);
        int iK = ofm.q.k(q2());
        z92.f.u(navBarWithBigTile, new u4(Integer.valueOf(iK), null, null, textLocalisedClause, textLocalisedClause2, null, new CdnImage("header", "mobile/stocks/lending", null, null, null, null, Constants.TAG_FC_SPEED_MODE)));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174536b.o), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52255c), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52707c), new m1e.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174537c.f59357t), new c(this, continuation, 1), 3);
    }

    public final l d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
