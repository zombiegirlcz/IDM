package com.revolut.feature_rev_points_pocket_impl.ui.screen.downgrade;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.downgrade.RevPointsPocketDowngradeScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import wdi.b;
import wdi.c;
import wdi.d;
import wdi.f;
import wdi.g;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_impl/ui/screen/downgrade/RevPointsPocketDowngradeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwdi/f;", "Ldli/a;", "Lwdi/g;", "feature_rev_points_pocket_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsPocketDowngradeScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(RevPointsPocketDowngradeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final h K;
    public final int L;
    public final TwinHorizontalButtonDelegate M;
    public final LargeActionButtonDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public RevPointsPocketDowngradeScreen(RevPointsPocketDowngradeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = new TwinHorizontalButtonDelegate();
        this.N = new LargeActionButtonDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: wdi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPocketDowngradeScreen f296559b;

            {
                this.f296559b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsPocketDowngradeScreen.R;
                        RevPointsPocketDowngradeScreen revPointsPocketDowngradeScreen = this.f296559b;
                        return dli.f.a(revPointsPocketDowngradeScreen, (h) revPointsPocketDowngradeScreen.Q.getValue(), v.k(new CellDetailsDelegate(), new PlainTextDelegate(), revPointsPocketDowngradeScreen.M, revPointsPocketDowngradeScreen.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = RevPointsPocketDowngradeScreen.R;
                        return (h) ((jdi.e) this.f296559b.P.getValue()).f173092c.get();
                }
            }
        });
        this.P = w.y0(new w83.a(this, inputData, 9));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: wdi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPocketDowngradeScreen f296559b;

            {
                this.f296559b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsPocketDowngradeScreen.R;
                        RevPointsPocketDowngradeScreen revPointsPocketDowngradeScreen = this.f296559b;
                        return dli.f.a(revPointsPocketDowngradeScreen, (h) revPointsPocketDowngradeScreen.Q.getValue(), v.k(new CellDetailsDelegate(), new PlainTextDelegate(), revPointsPocketDowngradeScreen.M, revPointsPocketDowngradeScreen.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = RevPointsPocketDowngradeScreen.R;
                        return (h) ((jdi.e) this.f296559b.P.getValue()).f173092c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f296561a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (jdi.e) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (wdi.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.M;
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.d.f121375b), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
