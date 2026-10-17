package com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.TitleDelegate;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.spinnerPicker.SpinnerPickerView;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.retail.feature.trading_onboarding.impl.R$id;
import com.revolut.retail.feature.trading_onboarding.impl.R$layout;
import com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.SelectFreeStocksScreen;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import ew1.d;
import ezk.g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kyk.u;
import kyk.y;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/free_stocks/select/SelectFreeStocksScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lezk/c;", "<init>", "()V", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectFreeStocksScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(SelectFreeStocksScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/trading_onboarding/impl/databinding/ScreenSelectFreeStocksBinding;", 0))};
    public final Object K;
    public final Object M;
    public final Object N;
    public final Object L = w.y0(new euf.a(18));
    public final int O = R$layout.screen_select_free_stocks;
    public final h P = s.t(this, a.f);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, iyk.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/trading_onboarding/impl/databinding/ScreenSelectFreeStocksBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.screenSelectFreeStocks_actionFooterView;
            ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
            if (actionFooterView != null) {
                i = R$id.screenSelectFreeStocks_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.screenSelectFreeStocks_recyclerView;
                    if (((AsyncDiffRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        i = R$id.screenSelectFreeStocks_spinner;
                        SpinnerPickerView spinnerPickerView = (SpinnerPickerView) ViewBindings.findChildViewById(p0, i);
                        if (spinnerPickerView != null) {
                            return new iyk.b((ControllerContainerConstraintLayout) p0, actionFooterView, navBarWithToolbar, spinnerPickerView);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public SelectFreeStocksScreen() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: ezk.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectFreeStocksScreen f130983b;

            {
                this.f130983b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 1;
                SelectFreeStocksScreen selectFreeStocksScreen = this.f130983b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SelectFreeStocksScreen.Q;
                        return (b) ((u) selectFreeStocksScreen.N.getValue()).f190979a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SelectFreeStocksScreen.Q;
                        SelectFreeStocksScreen selectFreeStocksScreen2 = this.f130983b;
                        return tki.g.a(selectFreeStocksScreen2, selectFreeStocksScreen2.R2(), v.k((FullScreenStateDelegate) selectFreeStocksScreen2.L.getValue(), new TitleDelegate()), R$id.screenSelectFreeStocks_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SelectFreeStocksScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(selectFreeStocksScreen.m2()).a().get(y.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y.class, " is not found"));
                        }
                        kyk.v vVar = ((kyk.v) ((y) aVar2.b())).A;
                        u uVar = new u();
                        uVar.f190979a = e4m.b.b(new kyk.s(vVar, i3));
                        return uVar;
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ezk.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectFreeStocksScreen f130983b;

            {
                this.f130983b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 1;
                SelectFreeStocksScreen selectFreeStocksScreen = this.f130983b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectFreeStocksScreen.Q;
                        return (b) ((u) selectFreeStocksScreen.N.getValue()).f190979a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SelectFreeStocksScreen.Q;
                        SelectFreeStocksScreen selectFreeStocksScreen2 = this.f130983b;
                        return tki.g.a(selectFreeStocksScreen2, selectFreeStocksScreen2.R2(), v.k((FullScreenStateDelegate) selectFreeStocksScreen2.L.getValue(), new TitleDelegate()), R$id.screenSelectFreeStocks_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SelectFreeStocksScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(selectFreeStocksScreen.m2()).a().get(y.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y.class, " is not found"));
                        }
                        kyk.v vVar = ((kyk.v) ((y) aVar2.b())).A;
                        u uVar = new u();
                        uVar.f190979a = e4m.b.b(new kyk.s(vVar, i3));
                        return uVar;
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ezk.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectFreeStocksScreen f130983b;

            {
                this.f130983b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 1;
                SelectFreeStocksScreen selectFreeStocksScreen = this.f130983b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectFreeStocksScreen.Q;
                        return (b) ((u) selectFreeStocksScreen.N.getValue()).f190979a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SelectFreeStocksScreen.Q;
                        SelectFreeStocksScreen selectFreeStocksScreen2 = this.f130983b;
                        return tki.g.a(selectFreeStocksScreen2, selectFreeStocksScreen2.R2(), v.k((FullScreenStateDelegate) selectFreeStocksScreen2.L.getValue(), new TitleDelegate()), R$id.screenSelectFreeStocks_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SelectFreeStocksScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(selectFreeStocksScreen.m2()).a().get(y.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y.class, " is not found"));
                        }
                        kyk.v vVar = ((kyk.v) ((y) aVar2.b())).A;
                        u uVar = new u();
                        uVar.f190979a = e4m.b.b(new kyk.s(vVar, i32));
                        return uVar;
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        ezk.c uiState = (ezk.c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f169779b.setModel(uiState.f130978b);
        SpinnerPickerView spinnerPickerView = d3().d;
        com.revolut.core.ui_kit.views.spinnerPicker.c cVar = uiState.f130979c;
        if (cVar == null) {
            spinnerPickerView.setVisibility(8);
        } else {
            spinnerPickerView.setVisibility(0);
            spinnerPickerView.setModel(cVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f169780c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.j0(false);
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f169779b.f), new g(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f169780c.f59410q), new g(this, continuation, 1), 3);
        SpinnerPickerView spinnerPickerView = d3().d;
        ViewController.P2(this, rd0.e.b(spinnerPickerView.f59694a.f55846c), new chf.a(spinnerPickerView, this, continuation, 28), 3);
        ViewController.P2(this, rd0.e.b(spinnerPickerView.d), new d(this, continuation, 17), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.L.getValue()).f52371h.f121375b), new ezk.h(this, null), 3);
    }

    public final iyk.b d3() {
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (iyk.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ezk.b R2() {
        return (ezk.b) this.K.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.M.getValue();
    }
}
