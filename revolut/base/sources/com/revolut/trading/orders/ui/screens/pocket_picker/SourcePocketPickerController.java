package com.revolut.trading.orders.ui.screens.pocket_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading_orders.api.ui.pocket_picker.SourcePocketPickerContract$OutputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.trading.orders.ui.screens.pocket_picker.SourcePocketPickerController;
import cvl.d;
import cvl.p;
import cvl.t;
import d1h.j;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import odf.f;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import xsl.n;
import z0h.s1;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/screens/pocket_picker/SourcePocketPickerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/trading_orders/api/ui/pocket_picker/SourcePocketPickerContract$OutputData;", "", "Ld1h/j;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SourcePocketPickerController extends ViewController<SourcePocketPickerContract$OutputData> implements c, s1, j {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(SourcePocketPickerController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final f K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final ListSubheaderDelegate Q;
    public final CellDetailsDelegate R;
    public final TextDelegate S;
    public final FullScreenStateDelegate T;
    public final ActionsDelegate U;
    public final FooterTextDelegate V;
    public final Object W;
    public final Object X;

    public SourcePocketPickerController(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, cvl.b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: cvl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SourcePocketPickerController f109482b;

            {
                this.f109482b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SourcePocketPickerController sourcePocketPickerController = this.f109482b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SourcePocketPickerController.Y;
                        phm.a aVar = (phm.a) ue0.e.j(sourcePocketPickerController.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        odf.f fVar = sourcePocketPickerController.K;
                        fVar.getClass();
                        return new xsl.n(pVar, fVar, sourcePocketPickerController, sourcePocketPickerController);
                    case 1:
                        KProperty[] kPropertyArr2 = SourcePocketPickerController.Y;
                        return (p) ((xsl.n) sourcePocketPickerController.N.getValue()).i.get();
                    case 2:
                        return zhm.v.k(sourcePocketPickerController.P, new RowLoadingDelegate(), sourcePocketPickerController.Q, new ListSubheaderLoadingDelegate(), sourcePocketPickerController.R, new CellDetailsLoadingDelegate(), sourcePocketPickerController.S, sourcePocketPickerController.T, sourcePocketPickerController.U, sourcePocketPickerController.V);
                    default:
                        KProperty[] kPropertyArr3 = SourcePocketPickerController.Y;
                        SourcePocketPickerController sourcePocketPickerController2 = this.f109482b;
                        return tki.g.a(sourcePocketPickerController2, sourcePocketPickerController2.R2(), (List) sourcePocketPickerController2.W.getValue(), sourcePocketPickerController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: cvl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SourcePocketPickerController f109482b;

            {
                this.f109482b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SourcePocketPickerController sourcePocketPickerController = this.f109482b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SourcePocketPickerController.Y;
                        phm.a aVar = (phm.a) ue0.e.j(sourcePocketPickerController.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        odf.f fVar = sourcePocketPickerController.K;
                        fVar.getClass();
                        return new xsl.n(pVar, fVar, sourcePocketPickerController, sourcePocketPickerController);
                    case 1:
                        KProperty[] kPropertyArr2 = SourcePocketPickerController.Y;
                        return (p) ((xsl.n) sourcePocketPickerController.N.getValue()).i.get();
                    case 2:
                        return zhm.v.k(sourcePocketPickerController.P, new RowLoadingDelegate(), sourcePocketPickerController.Q, new ListSubheaderLoadingDelegate(), sourcePocketPickerController.R, new CellDetailsLoadingDelegate(), sourcePocketPickerController.S, sourcePocketPickerController.T, sourcePocketPickerController.U, sourcePocketPickerController.V);
                    default:
                        KProperty[] kPropertyArr3 = SourcePocketPickerController.Y;
                        SourcePocketPickerController sourcePocketPickerController2 = this.f109482b;
                        return tki.g.a(sourcePocketPickerController2, sourcePocketPickerController2.R2(), (List) sourcePocketPickerController2.W.getValue(), sourcePocketPickerController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        this.Q = new ListSubheaderDelegate();
        this.R = new CellDetailsDelegate();
        this.S = new TextDelegate();
        this.T = new FullScreenStateDelegate();
        this.U = new ActionsDelegate();
        this.V = new FooterTextDelegate();
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: cvl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SourcePocketPickerController f109482b;

            {
                this.f109482b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SourcePocketPickerController sourcePocketPickerController = this.f109482b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SourcePocketPickerController.Y;
                        phm.a aVar = (phm.a) ue0.e.j(sourcePocketPickerController.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        odf.f fVar = sourcePocketPickerController.K;
                        fVar.getClass();
                        return new xsl.n(pVar, fVar, sourcePocketPickerController, sourcePocketPickerController);
                    case 1:
                        KProperty[] kPropertyArr2 = SourcePocketPickerController.Y;
                        return (p) ((xsl.n) sourcePocketPickerController.N.getValue()).i.get();
                    case 2:
                        return zhm.v.k(sourcePocketPickerController.P, new RowLoadingDelegate(), sourcePocketPickerController.Q, new ListSubheaderLoadingDelegate(), sourcePocketPickerController.R, new CellDetailsLoadingDelegate(), sourcePocketPickerController.S, sourcePocketPickerController.T, sourcePocketPickerController.U, sourcePocketPickerController.V);
                    default:
                        KProperty[] kPropertyArr3 = SourcePocketPickerController.Y;
                        SourcePocketPickerController sourcePocketPickerController2 = this.f109482b;
                        return tki.g.a(sourcePocketPickerController2, sourcePocketPickerController2.R2(), (List) sourcePocketPickerController2.W.getValue(), sourcePocketPickerController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.X = w.y0(new Function0(this) { // from class: cvl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SourcePocketPickerController f109482b;

            {
                this.f109482b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                SourcePocketPickerController sourcePocketPickerController = this.f109482b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SourcePocketPickerController.Y;
                        phm.a aVar = (phm.a) ue0.e.j(sourcePocketPickerController.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        odf.f fVar = sourcePocketPickerController.K;
                        fVar.getClass();
                        return new xsl.n(pVar, fVar, sourcePocketPickerController, sourcePocketPickerController);
                    case 1:
                        KProperty[] kPropertyArr2 = SourcePocketPickerController.Y;
                        return (p) ((xsl.n) sourcePocketPickerController.N.getValue()).i.get();
                    case 2:
                        return zhm.v.k(sourcePocketPickerController.P, new RowLoadingDelegate(), sourcePocketPickerController.Q, new ListSubheaderLoadingDelegate(), sourcePocketPickerController.R, new CellDetailsLoadingDelegate(), sourcePocketPickerController.S, sourcePocketPickerController.T, sourcePocketPickerController.U, sourcePocketPickerController.V);
                    default:
                        KProperty[] kPropertyArr3 = SourcePocketPickerController.Y;
                        SourcePocketPickerController sourcePocketPickerController2 = this.f109482b;
                        return tki.g.a(sourcePocketPickerController2, sourcePocketPickerController2.R2(), (List) sourcePocketPickerController2.W.getValue(), sourcePocketPickerController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        t uiState = (t) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = d3().f174564b;
        cvl.s sVar = uiState.f109504b;
        if (sVar != null) {
            largeActionButton.setEnabled(true);
            largeActionButton.setText(sVar.f109502a);
        }
        largeActionButton.setVisibility(sVar != null ? 0 : 8);
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final FooterTextDelegate getV() {
        return this.V;
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final FullScreenStateDelegate getT() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.j0(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        u uVarD3 = d3();
        Continuation continuation = null;
        int i = 0;
        ViewController.P2(this, rd0.e.b(uVarD3.f174565c.f59410q), new cvl.c(this, continuation, i), 3);
        int i2 = 1;
        ViewController.P2(this, rd0.e.b(uVarD3.f174564b.o), new cvl.c(this, continuation, i2), 3);
        RowDelegate rowDelegate = this.P;
        ViewController.P2(this, vkm.q.J(rd0.e.b(rowDelegate.f53218h), rd0.e.b(this.T.f52371h.f121375b)), new d(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53224q), new cvl.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d), new cvl.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.U.f51611c.f121375b), new d(this, continuation, i2), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p R2() {
        return (p) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.X.getValue();
    }

    @Override // z0h.s1
    public final vkm.d r() {
        return rd0.e.b(this.S.d);
    }

    @Override // d1h.j
    public final Flow y() {
        return rd0.e.b(this.S.d);
    }
}
