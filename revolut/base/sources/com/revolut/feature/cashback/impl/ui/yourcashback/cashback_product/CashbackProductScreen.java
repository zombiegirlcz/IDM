package com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product;

import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.y9;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarVaults;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cashback.impl.R$id;
import com.revolut.feature.cashback.impl.R$layout;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product.CashbackProductScreen;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import efm.r;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nya.i0;
import o95.c;
import oa2.b;
import ob1.e;
import obg.q;
import od3.d;
import od3.f;
import od3.g;
import od3.g0;
import od3.h0;
import od3.i;
import od3.j;
import od3.k;
import od3.m;
import od3.n;
import od3.p;
import od3.s0;
import qd3.a;
import te0.w;
import vc.s;
import wp5.y;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cashback/impl/ui/yourcashback/cashback_product/CashbackProductScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lod3/h0;", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/cashback_product/CashbackProductScreenContract$InputData;", "Lod3/p;", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashbackProductScreen extends BaseRecyclerViewScreen<h0, CashbackProductScreenContract$InputData, p> {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new kotlin.jvm.internal.h0(CashbackProductScreen.class, "binding", "getBinding()Lcom/revolut/feature/cashback/impl/databinding/ScreenCashbackProductBinding;", 0))};
    public final Object U;
    public final int V;
    public final int W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f65715a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f65716b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f65717d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f65718e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f65719h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashbackProductScreen(CashbackProductScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = w.y0(new b(this, inputData, 6));
        this.V = R$layout.screen_cashback_product;
        this.W = R$id.cashbackProductScreen_recyclerView;
        this.X = s.t(this, d.f);
        final int i = 1;
        this.Y = w.y0(new Function0(this) { // from class: od3.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashbackProductScreen f224264b;

            {
                this.f224264b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CashbackProductScreen cashbackProductScreen = this.f224264b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CashbackProductScreen.i0;
                        return zhm.v.k(new CounterTextDelegate(), (ListSubheaderDelegate) cashbackProductScreen.f65715a0.getValue(), (RowDelegate) cashbackProductScreen.Z.getValue(), (VaultsProgressDelegate) cashbackProductScreen.f65716b0.getValue(), (CellDetailsChevronDelegate) cashbackProductScreen.c0.getValue(), new CellDetailsNoteDelegate(), (CellDetailsDelegate) cashbackProductScreen.f65717d0.getValue(), (PlainTextWarningDelegate) cashbackProductScreen.f0.getValue(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new SmallCardLoadingDelegate(null), new FullScreenStateDelegate(), (TextDelegate) cashbackProductScreen.g0.getValue());
                    default:
                        KProperty[] kPropertyArr2 = CashbackProductScreen.i0;
                        return (g0) ((yc3.c) ((qd3.a) cashbackProductScreen.U.getValue())).C.get();
                }
            }
        });
        this.Z = w.y0(new e(17));
        this.f65715a0 = w.y0(new e(10));
        this.f65716b0 = w.y0(new e(11));
        this.c0 = w.y0(new e(12));
        this.f65717d0 = w.y0(new e(13));
        this.f65718e0 = w.y0(new e(14));
        this.f0 = w.y0(new e(15));
        this.g0 = w.y0(new e(16));
        final int i2 = 0;
        this.f65719h0 = w.y0(new Function0(this) { // from class: od3.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashbackProductScreen f224264b;

            {
                this.f224264b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CashbackProductScreen cashbackProductScreen = this.f224264b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CashbackProductScreen.i0;
                        return zhm.v.k(new CounterTextDelegate(), (ListSubheaderDelegate) cashbackProductScreen.f65715a0.getValue(), (RowDelegate) cashbackProductScreen.Z.getValue(), (VaultsProgressDelegate) cashbackProductScreen.f65716b0.getValue(), (CellDetailsChevronDelegate) cashbackProductScreen.c0.getValue(), new CellDetailsNoteDelegate(), (CellDetailsDelegate) cashbackProductScreen.f65717d0.getValue(), (PlainTextWarningDelegate) cashbackProductScreen.f0.getValue(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new SmallCardLoadingDelegate(null), new FullScreenStateDelegate(), (TextDelegate) cashbackProductScreen.g0.getValue());
                    default:
                        KProperty[] kPropertyArr2 = CashbackProductScreen.i0;
                        return (g0) ((yc3.c) ((qd3.a) cashbackProductScreen.U.getValue())).C.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (a) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void U2(int i, int i2, Intent intent) {
        String currencyCode;
        if (i2 != -1 || i != 4 || intent == null || (currencyCode = intent.getStringExtra("argCurrency")) == null) {
            return;
        }
        s0 s0Var = (s0) T2();
        s0Var.getClass();
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        s0Var.l2(new i0(s0Var, currencyCode, null, 25), new yi5.b(26));
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, y.x(h3().d.f59410q, h3().f304096c.f59328m, "mergeWith(...)"), null, new od3.e(this, continuation, 0), 3);
        r rVarMergeWith = h3().d.s0().mergeWith(h3().f304096c.u.h0()).mergeWith(((PlainTextWarningDelegate) this.f0.getValue()).d.f121375b.map(new oc8.e(3, new q(13))));
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeWith), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f304096c.u.i), null, new od3.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsChevronDelegate) this.c0.getValue()).f51821c), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) this.f65715a0.getValue()).f52707c), null, new od3.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) this.f65717d0.getValue()).d), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.Z.getValue()).f53218h), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.f65718e0.getValue()).d.f121375b), null, new k(this, null), 3);
        r map = ((TextDelegate) this.g0.getValue()).d.filter(new oc8.e(4, new q(14))).map(new oc8.e(5, new q(15)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new c(this, continuation, 12), 3);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarVaults navBarVaults = h3().f304096c;
        navBarVaults.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarVaults.setStatusBarStyle(y9.LIGHT);
        h3().d.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((yc3.c) ((a) this.U.getValue())).e.get()).d(v.k((LargeActionButtonDelegate) this.f65718e0.getValue(), (RowDelegate) this.Z.getValue(), (ListSubheaderDelegate) this.f65715a0.getValue()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF75565b0() {
        return (List) this.f65719h0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(h0 uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        od3.o oVar2 = uiState.f224272b;
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = h3().f304095b;
        controllerContainerCoordinatorLayout.removeView(h3().d);
        controllerContainerCoordinatorLayout.removeView(h3().f304096c);
        if (oVar2 instanceof m) {
            controllerContainerCoordinatorLayout.addView(h3().f304096c);
            h3().f304095b.setFitStatusBar(false);
        } else {
            if (!(oVar2 instanceof n)) {
                throw new NoWhenBranchMatchedException();
            }
            controllerContainerCoordinatorLayout.addView(h3().d);
            h3().f304095b.setFitStatusBar(true);
        }
        if (!(oVar2 instanceof m)) {
            if (!(oVar2 instanceof n)) {
                throw new NoWhenBranchMatchedException();
            }
            NavBarWithToolbar navBarWithToolbar = h3().d;
            n nVar = (n) oVar2;
            Clause clause = nVar.f224284a;
            navBarWithToolbar.setTitle(clause, null);
            navBarWithToolbar.setToolbarTitle(clause);
            navBarWithToolbar.setDescriptionText(nVar.f224285b);
            navBarWithToolbar.setDescriptionVisible(true);
            navBarWithToolbar.setActions(nVar.f224286c);
            navBarWithToolbar.setEndIconImage(nVar.d);
            return;
        }
        NavBarVaults navBarVaults = h3().f304096c;
        m mVar = (m) oVar2;
        List<ActionsView.Item> list = mVar.f224283c;
        Clause clause2 = mVar.f224281a;
        navBarVaults.setToolbarTitle(clause2);
        navBarVaults.setHeaderStatusText(clause2);
        navBarVaults.setHeaderTitleText(mVar.f224282b);
        navBarVaults.setActions(list);
        navBarVaults.setActionsVisibility(!list.isEmpty());
        navBarVaults.setBackgroundImage(mVar.d);
        Image image = mVar.e;
        if (image != null) {
            navBarVaults.setHeaderTitleIcon(image);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.V;
    }

    public final xc3.a h3() {
        ViewBinding value = this.X.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (xc3.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final g0 T2() {
        return (g0) this.Y.getValue();
    }
}
