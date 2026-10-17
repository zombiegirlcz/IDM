package com.revolut.feature.revolut_shop.ui.screen.product;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.LogosDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.revolut_shop.R$id;
import com.revolut.feature.revolut_shop.R$layout;
import com.revolut.feature.revolut_shop.ui.screen.product.IppShopProductScreen;
import com.revolut.feature.revolut_shop.ui.screen.product.IppShopProductScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m3c.f;
import p4c.b;
import p4c.c;
import p4c.d;
import p4c.g;
import p4c.i;
import p4c.p;
import p4c.r;
import p4c.t;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolut_shop/ui/screen/product/IppShopProductScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lp4c/p;", "Ldli/a;", "Lp4c/t;", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IppShopProductScreen extends ViewController<p> implements a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(IppShopProductScreen.class, "binding", "getBinding()Lcom/revolut/feature/revolut_shop/databinding/ScreenIppShopProductBinding;", 0))};
    public final IppShopProductScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final FullScreenStateDelegate P;
    public final RowDelegate Q;
    public final IconSelectorDelegate R;
    public final LargeActionButtonDelegate S;
    public final VoucherSmallTileDelegate T;
    public final TextDelegate U;
    public final ExpandableCellDelegate V;
    public final Object W;

    public IppShopProductScreen(IppShopProductScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_ipp_shop_product;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: p4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IppShopProductScreen f232874b;

            {
                this.f232874b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IppShopProductScreen ippShopProductScreen = this.f232874b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IppShopProductScreen.X;
                        qji.b bVarU2 = ippShopProductScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.product.di.IppShopProductScreenInjector");
                        m3c.e eVar = (m3c.e) bVarU2;
                        m3c.j jVar = eVar.f202332b;
                        m3c.e eVar2 = eVar.f202333c;
                        IppShopProductScreenContract$InputData ippShopProductScreenContract$InputData = ippShopProductScreen.K;
                        ippShopProductScreenContract$InputData.getClass();
                        return new m3c.f(jVar, eVar2, ippShopProductScreen, ippShopProductScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = IppShopProductScreen.X;
                        return (r) ((m3c.f) ippShopProductScreen.N.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = IppShopProductScreen.X;
                        IppShopProductScreen ippShopProductScreen2 = this.f232874b;
                        return dli.f.a(ippShopProductScreen2, ippShopProductScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), ippShopProductScreen2.P, ippShopProductScreen2.Q, new RowLoadingDelegate(), new LogosDelegate(), ippShopProductScreen2.V, new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new ScrollerDelegate(zhm.v.k(new BigTileDelegate(), ippShopProductScreen2.T, new ActionCardDelegate()), false), ippShopProductScreen2.R, ippShopProductScreen2.S, ippShopProductScreen2.U), R$id.screenIppShopProduct_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: p4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IppShopProductScreen f232874b;

            {
                this.f232874b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IppShopProductScreen ippShopProductScreen = this.f232874b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IppShopProductScreen.X;
                        qji.b bVarU2 = ippShopProductScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.product.di.IppShopProductScreenInjector");
                        m3c.e eVar = (m3c.e) bVarU2;
                        m3c.j jVar = eVar.f202332b;
                        m3c.e eVar2 = eVar.f202333c;
                        IppShopProductScreenContract$InputData ippShopProductScreenContract$InputData = ippShopProductScreen.K;
                        ippShopProductScreenContract$InputData.getClass();
                        return new m3c.f(jVar, eVar2, ippShopProductScreen, ippShopProductScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = IppShopProductScreen.X;
                        return (r) ((m3c.f) ippShopProductScreen.N.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = IppShopProductScreen.X;
                        IppShopProductScreen ippShopProductScreen2 = this.f232874b;
                        return dli.f.a(ippShopProductScreen2, ippShopProductScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), ippShopProductScreen2.P, ippShopProductScreen2.Q, new RowLoadingDelegate(), new LogosDelegate(), ippShopProductScreen2.V, new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new ScrollerDelegate(zhm.v.k(new BigTileDelegate(), ippShopProductScreen2.T, new ActionCardDelegate()), false), ippShopProductScreen2.R, ippShopProductScreen2.S, ippShopProductScreen2.U), R$id.screenIppShopProduct_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new FullScreenStateDelegate();
        this.Q = new RowDelegate(null, null, 7);
        this.R = new IconSelectorDelegate();
        this.S = new LargeActionButtonDelegate();
        this.T = new VoucherSmallTileDelegate();
        this.U = new TextDelegate();
        this.V = new ExpandableCellDelegate();
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: p4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IppShopProductScreen f232874b;

            {
                this.f232874b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                IppShopProductScreen ippShopProductScreen = this.f232874b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IppShopProductScreen.X;
                        qji.b bVarU2 = ippShopProductScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.product.di.IppShopProductScreenInjector");
                        m3c.e eVar = (m3c.e) bVarU2;
                        m3c.j jVar = eVar.f202332b;
                        m3c.e eVar2 = eVar.f202333c;
                        IppShopProductScreenContract$InputData ippShopProductScreenContract$InputData = ippShopProductScreen.K;
                        ippShopProductScreenContract$InputData.getClass();
                        return new m3c.f(jVar, eVar2, ippShopProductScreen, ippShopProductScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = IppShopProductScreen.X;
                        return (r) ((m3c.f) ippShopProductScreen.N.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = IppShopProductScreen.X;
                        IppShopProductScreen ippShopProductScreen2 = this.f232874b;
                        return dli.f.a(ippShopProductScreen2, ippShopProductScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), ippShopProductScreen2.P, ippShopProductScreen2.Q, new RowLoadingDelegate(), new LogosDelegate(), ippShopProductScreen2.V, new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new ScrollerDelegate(zhm.v.k(new BigTileDelegate(), ippShopProductScreen2.T, new ActionCardDelegate()), false), ippShopProductScreen2.R, ippShopProductScreen2.S, ippShopProductScreen2.U), R$id.screenIppShopProduct_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        t uiState = (t) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f191881c;
        boolean z = uiState.f232892a;
        Clause clause = uiState.d;
        Clause clause2 = uiState.f232894c;
        Clause clause3 = uiState.f232893b;
        List<? extends NavBarMenuItem> list = uiState.f232895g;
        if (z) {
            navBarWithToolbar.I0(t3.DEFAULT, list.isEmpty());
        } else {
            navBarWithToolbar.l0();
        }
        navBarWithToolbar.setTitle(clause3, null);
        if (clause3 != null) {
            navBarWithToolbar.setToolbarTitle(clause3);
        }
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
        navBarWithToolbar.setDescriptionText(clause2);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setMenuItems(list);
        ActionFooterView screenIppShopProductFooter = d3().f191880b;
        Intrinsics.checkNotNullExpressionValue(screenIppShopProductFooter, "screenIppShopProductFooter");
        screenIppShopProductFooter.setVisibility(uiState.e ? 0 : 8);
        d3().f191880b.setModel(uiState.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f191881c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        int i = com.revolut.core.ui_kit.R$id.internal_content_description_clause;
        String f84197a = this.K.f84245a.getF84197a();
        Locale locale = Locale.ROOT;
        view.setTag(i, new TextLocalisedClause(j6.a.q("revolut_shop.flow.product.", p.a.r(locale, "ROOT", f84197a, locale, "toLowerCase(...)")), (List) null, (Clause) null, false, 30));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f191881c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f191881c.o.f57403b), new d(this, continuation, 0), 3);
        int i = 1;
        ViewController.P2(this, rd0.e.b(d3().f191880b.f), new d(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f191880b.f58955g), new c(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52489c.d), new p4c.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new p4c.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.d.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.f53608c), new p4c.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.V.f52255c), new i(this, null), 3);
    }

    public final l3c.a d3() {
        ViewBinding value = this.M.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l3c.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r R2() {
        return (r) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }
}
