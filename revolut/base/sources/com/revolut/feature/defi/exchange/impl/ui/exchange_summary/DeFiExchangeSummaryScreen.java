package com.revolut.feature.defi.exchange.impl.ui.exchange_summary;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.n6;
import c46.d;
import c46.f;
import c46.g;
import c46.k;
import c46.m;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.defi.exchange.impl.ui.exchange_summary.DeFiExchangeSummaryContract$InputData;
import com.revolut.feature.defi.exchange.impl.ui.exchange_summary.DeFiExchangeSummaryScreen;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import g46.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import yy0.i;
import yy0.l;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/ui/exchange_summary/DeFiExchangeSummaryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc46/d;", "Le46/a;", "Lg46/b;", "Ltki/c;", "Lc46/g;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiExchangeSummaryScreen extends ViewController<d> implements e46.a, b, c {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(DeFiExchangeSummaryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final DeFiExchangeSummaryContract$InputData K;
    public final CellDetailsDelegate L;
    public final CellDetailsActionDelegate M;
    public final HighlightTileDelegate N;
    public final FullScreenStateDelegate O;
    public final RowDelegate P;
    public final h Q;
    public final int R;
    public final Object S;
    public final Object T;
    public final Object U;

    public DeFiExchangeSummaryScreen(DeFiExchangeSummaryContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new CellDetailsDelegate();
        this.M = new CellDetailsActionDelegate();
        this.N = new HighlightTileDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = new RowDelegate(null, null, 7);
        this.Q = s.t(this, k.f);
        this.R = R$layout.screen_recycler_navbar_action_footer;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: c46.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiExchangeSummaryScreen f21096b;

            {
                this.f21096b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeFiExchangeSummaryScreen deFiExchangeSummaryScreen = this.f21096b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiExchangeSummaryScreen.V;
                        DeFiExchangeSummaryScreen deFiExchangeSummaryScreen2 = this.f21096b;
                        return tki.g.a(deFiExchangeSummaryScreen2, deFiExchangeSummaryScreen2.R2(), v.k(deFiExchangeSummaryScreen2.N, deFiExchangeSummaryScreen2.L, new CellDetailsLoadingDelegate(), deFiExchangeSummaryScreen2.O, deFiExchangeSummaryScreen2.M, deFiExchangeSummaryScreen2.P, new PlainTextWarningDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiExchangeSummaryScreen.V;
                        qji.b bVarR1 = deFiExchangeSummaryScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.exchange.impl.ui.exchange_summary.di.DeFiExchangeSummaryScreenInjector");
                        r36.f fVar = (r36.f) bVarR1;
                        r36.e eVar = fVar.f251183b;
                        r36.f fVar2 = fVar.f251184c;
                        DeFiExchangeSummaryContract$InputData deFiExchangeSummaryContract$InputData = deFiExchangeSummaryScreen.K;
                        deFiExchangeSummaryContract$InputData.getClass();
                        return new r36.g(eVar, fVar2, deFiExchangeSummaryScreen, deFiExchangeSummaryContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DeFiExchangeSummaryScreen.V;
                        return (e) ((r36.g) deFiExchangeSummaryScreen.T.getValue()).i.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: c46.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiExchangeSummaryScreen f21096b;

            {
                this.f21096b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeFiExchangeSummaryScreen deFiExchangeSummaryScreen = this.f21096b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiExchangeSummaryScreen.V;
                        DeFiExchangeSummaryScreen deFiExchangeSummaryScreen2 = this.f21096b;
                        return tki.g.a(deFiExchangeSummaryScreen2, deFiExchangeSummaryScreen2.R2(), v.k(deFiExchangeSummaryScreen2.N, deFiExchangeSummaryScreen2.L, new CellDetailsLoadingDelegate(), deFiExchangeSummaryScreen2.O, deFiExchangeSummaryScreen2.M, deFiExchangeSummaryScreen2.P, new PlainTextWarningDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiExchangeSummaryScreen.V;
                        qji.b bVarR1 = deFiExchangeSummaryScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.exchange.impl.ui.exchange_summary.di.DeFiExchangeSummaryScreenInjector");
                        r36.f fVar = (r36.f) bVarR1;
                        r36.e eVar = fVar.f251183b;
                        r36.f fVar2 = fVar.f251184c;
                        DeFiExchangeSummaryContract$InputData deFiExchangeSummaryContract$InputData = deFiExchangeSummaryScreen.K;
                        deFiExchangeSummaryContract$InputData.getClass();
                        return new r36.g(eVar, fVar2, deFiExchangeSummaryScreen, deFiExchangeSummaryContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DeFiExchangeSummaryScreen.V;
                        return (e) ((r36.g) deFiExchangeSummaryScreen.T.getValue()).i.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: c46.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiExchangeSummaryScreen f21096b;

            {
                this.f21096b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DeFiExchangeSummaryScreen deFiExchangeSummaryScreen = this.f21096b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiExchangeSummaryScreen.V;
                        DeFiExchangeSummaryScreen deFiExchangeSummaryScreen2 = this.f21096b;
                        return tki.g.a(deFiExchangeSummaryScreen2, deFiExchangeSummaryScreen2.R2(), v.k(deFiExchangeSummaryScreen2.N, deFiExchangeSummaryScreen2.L, new CellDetailsLoadingDelegate(), deFiExchangeSummaryScreen2.O, deFiExchangeSummaryScreen2.M, deFiExchangeSummaryScreen2.P, new PlainTextWarningDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiExchangeSummaryScreen.V;
                        qji.b bVarR1 = deFiExchangeSummaryScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.exchange.impl.ui.exchange_summary.di.DeFiExchangeSummaryScreenInjector");
                        r36.f fVar = (r36.f) bVarR1;
                        r36.e eVar = fVar.f251183b;
                        r36.f fVar2 = fVar.f251184c;
                        DeFiExchangeSummaryContract$InputData deFiExchangeSummaryContract$InputData = deFiExchangeSummaryScreen.K;
                        deFiExchangeSummaryContract$InputData.getClass();
                        return new r36.g(eVar, fVar2, deFiExchangeSummaryScreen, deFiExchangeSummaryContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DeFiExchangeSummaryScreen.V;
                        return (e) ((r36.g) deFiExchangeSummaryScreen.T.getValue()).i.get();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        f fVar = uiState.f21090b;
        navBarWithToolbar.setHeaderDisclaimerSticky(fVar.f21086a);
        i iVar = l.Companion;
        Image image = fVar.d;
        iVar.getClass();
        navBarWithToolbar.setEndImage(i.a(image));
        navBarWithToolbar.setEndIconBadgeImage(fVar.e);
        ?? r06 = fVar.f21087b;
        navBarWithToolbar.setToolbarTitle(r06);
        navBarWithToolbar.setTitle(r06, null);
        navBarWithToolbar.setDescriptionText(fVar.f21088c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r36.g) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(false);
        d3().f174533b.setModel(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.cryptobuysell_market_order_confirmation_button_text, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new c46.l(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b((ihm.f) d3().f174534c.f59406n.f258290b), new c1i.f(this, continuation, 7), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new c46.l(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new m(this, null), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.Q.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final c46.e d() {
        return (c46.e) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
