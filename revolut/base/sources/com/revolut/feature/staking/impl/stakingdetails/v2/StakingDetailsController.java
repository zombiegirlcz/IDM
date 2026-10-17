package com.revolut.feature.staking.impl.stakingdetails.v2;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.impl.stakingdetails.v2.StakingDetailsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qud.f;
import te0.w;
import vc.s;
import vqd.b;
import vwd.c;
import vwd.d;
import vwd.g;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/impl/stakingdetails/v2/StakingDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lvwd/g;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StakingDetailsController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(StakingDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final RowDelegate K;
    public final InputDisclosureDelegate L;
    public final TextDelegate M;
    public final boolean N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final h S;

    public StakingDetailsController(StakingProduct stakingProduct) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.K = new RowDelegate(null, null, 7);
        this.L = new InputDisclosureDelegate();
        this.M = new TextDelegate();
        this.N = true;
        this.O = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: vwd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StakingDetailsController f292703b;

            {
                this.f292703b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = StakingDetailsController.T;
                        return (e) ((qud.f) this.f292703b.R.getValue()).f249396c.get();
                    default:
                        KProperty[] kPropertyArr2 = StakingDetailsController.T;
                        StakingDetailsController stakingDetailsController = this.f292703b;
                        return dli.f.a(stakingDetailsController, (e) stakingDetailsController.P.getValue(), v.k(new ListSubheaderDelegate(), stakingDetailsController.K, stakingDetailsController.L, stakingDetailsController.M), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: vwd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StakingDetailsController f292703b;

            {
                this.f292703b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StakingDetailsController.T;
                        return (e) ((qud.f) this.f292703b.R.getValue()).f249396c.get();
                    default:
                        KProperty[] kPropertyArr2 = StakingDetailsController.T;
                        StakingDetailsController stakingDetailsController = this.f292703b;
                        return dli.f.a(stakingDetailsController, (e) stakingDetailsController.P.getValue(), v.k(new ListSubheaderDelegate(), stakingDetailsController.K, stakingDetailsController.L, stakingDetailsController.M), 0, null, null, null, 60);
                }
            }
        });
        this.R = w.y0(new b(this, stakingProduct, 18));
        this.S = s.t(this, vwd.b.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(uiState.f292706a, null);
        navBarWithToolbar.setToolbarTitle(uiState.f292706a);
        navBarWithToolbar.setDescriptionText(uiState.f292707b);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setEndIconImage(uiState.f292708c);
        d3().f174564b.setText(uiState.d);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (vwd.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52538c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.d), null, new vrl.d(this, null, 12), 3);
    }

    public final u d3() {
        ViewBinding value = this.S.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
