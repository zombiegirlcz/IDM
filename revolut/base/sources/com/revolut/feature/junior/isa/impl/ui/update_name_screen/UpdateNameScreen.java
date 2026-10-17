package com.revolut.feature.junior.isa.impl.ui.update_name_screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bb8.b;
import bb8.c;
import bb8.d;
import bb8.g;
import bb8.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior.isa.impl.R$string;
import com.revolut.feature.junior.isa.impl.ui.update_name_screen.UpdateNameScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import x98.r;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/update_name_screen/UpdateNameScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbb8/g;", "Ldli/a;", "Lbb8/i;", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpdateNameScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(UpdateNameScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final InputTextDelegate M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public UpdateNameScreen(UpdateNameScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, b.f);
        this.M = new InputTextDelegate(null);
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: bb8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateNameScreen f14183b;

            {
                this.f14183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = UpdateNameScreen.R;
                        UpdateNameScreen updateNameScreen = this.f14183b;
                        return dli.f.a(updateNameScreen, updateNameScreen.R2(), v.k(new CellDetailsLoadingDelegate(), updateNameScreen.M, updateNameScreen.N), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = UpdateNameScreen.R;
                        return (h) ((r) this.f14183b.P.getValue()).f303643b.get();
                }
            }
        });
        this.P = w.y0(new at4.b(this, inputData, 28));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: bb8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateNameScreen f14183b;

            {
                this.f14183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UpdateNameScreen.R;
                        UpdateNameScreen updateNameScreen = this.f14183b;
                        return dli.f.a(updateNameScreen, updateNameScreen.R2(), v.k(new CellDetailsLoadingDelegate(), updateNameScreen.M, updateNameScreen.N), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = UpdateNameScreen.R;
                        return (h) ((r) this.f14183b.P.getValue()).f303643b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f14190b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.junior_trading_child_renaming_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.junior_trading_child_renaming_header_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.junior_trading_child_renaming_header_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.junior_trading_child_renaming_action_title, null, null, 14));
        largeActionButton.setLoadingButtonTag("UPDATE_BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
        efm.r rVarDistinctUntilChanged = this.M.e.f121375b.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewController.P2(this, rd0.e.b(rVarDistinctUntilChanged), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new bb8.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final bb8.h R2() {
        return (bb8.h) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
