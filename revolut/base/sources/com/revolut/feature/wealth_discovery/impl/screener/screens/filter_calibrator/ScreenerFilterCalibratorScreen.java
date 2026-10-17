package com.revolut.feature.wealth_discovery.impl.screener.screens.filter_calibrator;

import an9.i;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ap7.k;
import aqh.b;
import aqh.f;
import aqh.j;
import aqh.l;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeSliderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RangeSliderTitleDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.wealth_discovery.impl.screener.screens.filter_calibrator.ScreenerFilterCalibratorScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.filter_calibrator.ScreenerFilterCalibratorScreenContract$Input;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dli.c;
import joh.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/filter_calibrator/ScreenerFilterCalibratorScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laqh/j;", "", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenerFilterCalibratorScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(ScreenerFilterCalibratorScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final ScreenerFilterCalibratorScreenContract$Input K;
    public final h L;
    public final ActionsDelegate M;
    public final ActionsLoadingDelegate N;
    public final SingleChoiceDelegate O;
    public final LargeActionButtonDelegate P;
    public final RangeSliderTitleDelegate Q;
    public final ListSubheaderDelegate R;
    public final CellDetailsChevronDelegate S;
    public final SelectableDelegate T;
    public final FullScreenStateDelegate U;
    public final Object V;
    public final Object W;
    public final int X;
    public final Object Y;

    public ScreenerFilterCalibratorScreen(ScreenerFilterCalibratorScreenContract$Input inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new ActionsDelegate();
        this.N = new ActionsLoadingDelegate();
        this.O = new SingleChoiceDelegate();
        this.P = new LargeActionButtonDelegate();
        this.Q = new RangeSliderTitleDelegate();
        this.R = new ListSubheaderDelegate();
        this.S = new CellDetailsChevronDelegate();
        this.T = new SelectableDelegate(new RowDelegate(null, null, 7));
        this.U = new FullScreenStateDelegate();
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: aqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerFilterCalibratorScreen f8431b;

            {
                this.f8431b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ScreenerFilterCalibratorScreen screenerFilterCalibratorScreen = this.f8431b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerFilterCalibratorScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(screenerFilterCalibratorScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerFilterCalibratorScreenContract$Input screenerFilterCalibratorScreenContract$Input = screenerFilterCalibratorScreen.K;
                        yph.g gVar = new yph.g(screenerFilterCalibratorScreen.R, screenerFilterCalibratorScreen.M, screenerFilterCalibratorScreen.Q, screenerFilterCalibratorScreen.T);
                        screenerFilterCalibratorScreenContract$Input.getClass();
                        return new joh.n(wVar, screenerFilterCalibratorScreenContract$Input, gVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerFilterCalibratorScreen.Z;
                        return (h) ((joh.n) screenerFilterCalibratorScreen.V.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = ScreenerFilterCalibratorScreen.Z;
                        ScreenerFilterCalibratorScreen screenerFilterCalibratorScreen2 = this.f8431b;
                        return dli.f.a(screenerFilterCalibratorScreen2, (h) screenerFilterCalibratorScreen2.W.getValue(), zhm.v.k(screenerFilterCalibratorScreen2.M, screenerFilterCalibratorScreen2.N, screenerFilterCalibratorScreen2.O, screenerFilterCalibratorScreen2.P, screenerFilterCalibratorScreen2.Q, screenerFilterCalibratorScreen2.S, screenerFilterCalibratorScreen2.T, screenerFilterCalibratorScreen2.U, screenerFilterCalibratorScreen2.R, new LargeSliderLoadingDelegate(), new RowLoadingDelegate()), R$id.bottomSheetControllerBase_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: aqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerFilterCalibratorScreen f8431b;

            {
                this.f8431b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ScreenerFilterCalibratorScreen screenerFilterCalibratorScreen = this.f8431b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerFilterCalibratorScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(screenerFilterCalibratorScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerFilterCalibratorScreenContract$Input screenerFilterCalibratorScreenContract$Input = screenerFilterCalibratorScreen.K;
                        yph.g gVar = new yph.g(screenerFilterCalibratorScreen.R, screenerFilterCalibratorScreen.M, screenerFilterCalibratorScreen.Q, screenerFilterCalibratorScreen.T);
                        screenerFilterCalibratorScreenContract$Input.getClass();
                        return new joh.n(wVar, screenerFilterCalibratorScreenContract$Input, gVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerFilterCalibratorScreen.Z;
                        return (h) ((joh.n) screenerFilterCalibratorScreen.V.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = ScreenerFilterCalibratorScreen.Z;
                        ScreenerFilterCalibratorScreen screenerFilterCalibratorScreen2 = this.f8431b;
                        return dli.f.a(screenerFilterCalibratorScreen2, (h) screenerFilterCalibratorScreen2.W.getValue(), zhm.v.k(screenerFilterCalibratorScreen2.M, screenerFilterCalibratorScreen2.N, screenerFilterCalibratorScreen2.O, screenerFilterCalibratorScreen2.P, screenerFilterCalibratorScreen2.Q, screenerFilterCalibratorScreen2.S, screenerFilterCalibratorScreen2.T, screenerFilterCalibratorScreen2.U, screenerFilterCalibratorScreen2.R, new LargeSliderLoadingDelegate(), new RowLoadingDelegate()), R$id.bottomSheetControllerBase_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        this.X = R$layout.screen_bottom_sheet_base;
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: aqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerFilterCalibratorScreen f8431b;

            {
                this.f8431b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ScreenerFilterCalibratorScreen screenerFilterCalibratorScreen = this.f8431b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerFilterCalibratorScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(screenerFilterCalibratorScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerFilterCalibratorScreenContract$Input screenerFilterCalibratorScreenContract$Input = screenerFilterCalibratorScreen.K;
                        yph.g gVar = new yph.g(screenerFilterCalibratorScreen.R, screenerFilterCalibratorScreen.M, screenerFilterCalibratorScreen.Q, screenerFilterCalibratorScreen.T);
                        screenerFilterCalibratorScreenContract$Input.getClass();
                        return new joh.n(wVar, screenerFilterCalibratorScreenContract$Input, gVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerFilterCalibratorScreen.Z;
                        return (h) ((joh.n) screenerFilterCalibratorScreen.V.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = ScreenerFilterCalibratorScreen.Z;
                        ScreenerFilterCalibratorScreen screenerFilterCalibratorScreen2 = this.f8431b;
                        return dli.f.a(screenerFilterCalibratorScreen2, (h) screenerFilterCalibratorScreen2.W.getValue(), zhm.v.k(screenerFilterCalibratorScreen2.M, screenerFilterCalibratorScreen2.N, screenerFilterCalibratorScreen2.O, screenerFilterCalibratorScreen2.P, screenerFilterCalibratorScreen2.Q, screenerFilterCalibratorScreen2.S, screenerFilterCalibratorScreen2.T, screenerFilterCalibratorScreen2.U, screenerFilterCalibratorScreen2.R, new LargeSliderLoadingDelegate(), new RowLoadingDelegate()), R$id.bottomSheetControllerBase_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174514c.setHeaderModel(new lw0.a(uiState.f8443a, null, null, null, false, 30));
        d3().f174513b.setModel(uiState.f8445c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (aqh.h) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        bottomSheetControllerBaseRecyclerView.setVisibility(0);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new i(rd0.e.b(d3().f174513b.f), 5), new f(this, null, 0), 3);
        ViewController.P2(this, new i(rd0.e.b(d3().f174513b.f58955g), 6), new f(this, null, 1), 3);
        ViewController.P2(this, new i(rd0.e.b(this.R.f), 7), new k(this, null, 6), 3);
    }

    public final jii.e d3() {
        ViewBinding value = this.L.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Y.getValue();
    }
}
