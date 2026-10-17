package com.revolut.feature.retail.cfd.impl.screens.order.v2;

import a83.j0;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import av8.n;
import aw0.f;
import aw0.g;
import aw0.n6;
import b4b.b;
import b4b.i;
import b4b.j;
import b4b.k;
import b4b.l;
import b4b.p;
import b4b.r;
import b4b.u;
import b4b.v;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.cfd.impl.R$id;
import com.revolut.feature.retail.cfd.impl.R$layout;
import com.revolut.feature.retail.cfd.impl.screens.order.v2.CfdOrderFormController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import te0.w;
import tki.c;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/order/v2/CfdOrderFormController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lb4b/r;", "", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdOrderFormController extends ViewController<r> implements c {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(CfdOrderFormController.class, "binding", "getBinding()Lcom/revolut/feature/retail/cfd/impl/databinding/ScreenCfdOrderFormBinding;", 0))};
    public final int K;
    public final h L;
    public final CenteredAmountDelegate M;
    public final CellDetailsActionDelegate N;
    public final CellDetailsDelegate O;
    public final DatePickerDelegate P;
    public final LargeActionButtonDelegate Q;
    public final RowDelegate R;
    public final SelectableDelegate S;
    public final zjh.c T;
    public final Object U;
    public final Object V;
    public final Object W;

    public CfdOrderFormController(p inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_cfd_order_form;
        this.L = s.t(this, b.f);
        this.M = new CenteredAmountDelegate(new n(this, 13));
        this.N = new CellDetailsActionDelegate();
        this.O = new CellDetailsDelegate();
        this.P = new DatePickerDelegate();
        this.Q = new LargeActionButtonDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        this.S = new SelectableDelegate(rowDelegate);
        this.T = new zjh.c(this);
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: b4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdOrderFormController f12208b;

            {
                this.f12208b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CfdOrderFormController.X;
                        CfdOrderFormController cfdOrderFormController = this.f12208b;
                        return tki.g.a(cfdOrderFormController, cfdOrderFormController.k3(), zhm.v.k(cfdOrderFormController.M, cfdOrderFormController.N, new CellDetailsStandaloneNoteDelegate(), new CellDetailsLoadingDelegate()), R$id.cfdOrderForm_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CfdOrderFormController.X;
                        return (q) ((m2b.n) this.f12208b.V.getValue()).K.get();
                }
            }
        });
        this.V = w.y0(new at4.b(this, inputData, 20));
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: b4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdOrderFormController f12208b;

            {
                this.f12208b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CfdOrderFormController.X;
                        CfdOrderFormController cfdOrderFormController = this.f12208b;
                        return tki.g.a(cfdOrderFormController, cfdOrderFormController.k3(), zhm.v.k(cfdOrderFormController.M, cfdOrderFormController.N, new CellDetailsStandaloneNoteDelegate(), new CellDetailsLoadingDelegate()), R$id.cfdOrderForm_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CfdOrderFormController.X;
                        return (q) ((m2b.n) this.f12208b.V.getValue()).K.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        v uiState = (v) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        u uVar = uiState.f12250a;
        NavBarWithToolbar navBarWithToolbar = d3().f170796c;
        navBarWithToolbar.setToolbar(uVar.f12247a, uVar.f12248b, null);
        navBarWithToolbar.setMenuItems(uVar.f12249c);
        ActionFooterView actionFooterView = d3().f170795b;
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        actionFooterView.setModel(new g(new n6(null, defaultFilledButton, new ResourceImage(R$drawable.uikit_icn_24_controls, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.wealth_orders_order_type_button_accessibility_label, null, null, 14), LDSFile.EF_DG4_TAG), null, uiState.d, null, null, 984), new n6(uiState.f12251b, defaultFilledButton, null, null, uiState.f12252c, null, null, 988), (Clause) null, f.SMALL_PRIMARY_BUTTON, 8));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m2b.n) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f170796c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ((j60.a) ((m2b.n) this.V.getValue()).f.get()).d(zhm.v.k(this.N, this.O, this.P, this.Q, this.R, this.S));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f170796c.f59410q), new b4b.h(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.d), null, new i(this, null), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, new j0(new an9.i(rd0.e.b(this.R.f53218h), 20), 8), null, new b4b.e(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f170795b.f), new b4b.h(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f170795b.f58955g), new b4b.h(this, continuation, 2), 3);
        CenteredAmountDelegate centeredAmountDelegate = this.M;
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.f.f121375b), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.f51964g.f121375b), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.r()), new l(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.d.f121375b), new b4b.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d.f121375b), new b4b.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.d), new b4b.g(this, null), 3);
    }

    public final j2b.a d3() {
        ViewBinding value = this.L.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (j2b.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b4b.q R2() {
        return (b4b.q) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.U.getValue();
    }
}
