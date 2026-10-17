package com.revolut.feature.pay_later.impl.ui.activation;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.pay_later.impl.R$id;
import com.revolut.feature.pay_later.impl.R$layout;
import com.revolut.feature.pay_later.impl.ui.activation.ActivationController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ij9.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mc9.n;
import nfj.j2;
import nj9.c;
import nj9.d;
import nj9.e;
import nj9.g;
import nj9.i;
import nj9.j;
import no.m;
import rr0.f;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/activation/ActivationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lnj9/j;", "Lno/m;", "<init>", "()V", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActivationController extends ViewController<q> implements dli.a, m {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(ActivationController.class, "binding", "getBinding()Lcom/revolut/feature/pay_later/impl/databinding/ScreenRecyclerNextbuttonBinding;", 0))};
    public f O;
    public final Object P;
    public final Object Q;
    public final Object U;
    public final /* synthetic */ b K = b.f161739a;
    public final int L = R$layout.screen_recycler_nextbutton;
    public final boolean M = true;
    public final h N = s.t(this, a.f);
    public final FixedTabsDelegate R = new FixedTabsDelegate();
    public final CellDetailsActionDelegate S = new CellDetailsActionDelegate();
    public final LargeActionButtonDelegate T = new LargeActionButtonDelegate();

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, mi9.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/pay_later/impl/databinding/ScreenRecyclerNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
            if (screenContentRecyclerView != null) {
                i = R$id.screenRecyclerNextButton_nextButton;
                LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                if (largeActionButton != null) {
                    return new mi9.b((ControllerContainerFrameLayout) p0, screenContentRecyclerView, largeActionButton);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public ActivationController() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: nj9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivationController f216413b;

            {
                this.f216413b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ActivationController activationController = this.f216413b;
                int i3 = 4;
                int i5 = 2;
                int i6 = 1;
                int i21 = 0;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ActivationController.V;
                        oi9.f fVar = kotlin.jvm.internal.s.n(activationController.m2()).v;
                        oi9.b bVar = new oi9.b();
                        bVar.f225482a = e4m.b.b(e4m.c.a(activationController));
                        bVar.f225483b = e4m.b.b(new oi9.a(fVar, bVar, i5, i21));
                        bVar.f225484c = e4m.b.b(new oi9.a(fVar, bVar, i6, i21));
                        bVar.d = e4m.b.b(new oi9.a(fVar, bVar, i21, i21));
                        bVar.e = e4m.b.b(new oi9.a(fVar, bVar, i3, i21));
                        bVar.f = e4m.b.b(new oi9.a(fVar, bVar, 3, i21));
                        bVar.f225485g = e4m.b.b(new oi9.a(fVar, bVar, 6, i21));
                        bVar.f225486h = e4m.b.b(new oi9.a(fVar, bVar, 5, i21));
                        return bVar;
                    case 1:
                        KProperty[] kPropertyArr2 = ActivationController.V;
                        return (i) ((oi9.b) activationController.P.getValue()).f225486h.get();
                    default:
                        KProperty[] kPropertyArr3 = ActivationController.V;
                        ActivationController activationController2 = this.f216413b;
                        return dli.f.a(activationController2, activationController2.d(), v.k(new ListSubheaderLoadingDelegate(), new CellDetailsLoadingDelegate(), new FixedTabsLoadingDelegate(), new CellDetailsDelegate(), new FullScreenStateDelegate(), new PlainTextDelegate(), activationController2.R, activationController2.S), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: nj9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivationController f216413b;

            {
                this.f216413b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ActivationController activationController = this.f216413b;
                int i3 = 4;
                int i5 = 2;
                int i6 = 1;
                int i21 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ActivationController.V;
                        oi9.f fVar = kotlin.jvm.internal.s.n(activationController.m2()).v;
                        oi9.b bVar = new oi9.b();
                        bVar.f225482a = e4m.b.b(e4m.c.a(activationController));
                        bVar.f225483b = e4m.b.b(new oi9.a(fVar, bVar, i5, i21));
                        bVar.f225484c = e4m.b.b(new oi9.a(fVar, bVar, i6, i21));
                        bVar.d = e4m.b.b(new oi9.a(fVar, bVar, i21, i21));
                        bVar.e = e4m.b.b(new oi9.a(fVar, bVar, i3, i21));
                        bVar.f = e4m.b.b(new oi9.a(fVar, bVar, 3, i21));
                        bVar.f225485g = e4m.b.b(new oi9.a(fVar, bVar, 6, i21));
                        bVar.f225486h = e4m.b.b(new oi9.a(fVar, bVar, 5, i21));
                        return bVar;
                    case 1:
                        KProperty[] kPropertyArr2 = ActivationController.V;
                        return (i) ((oi9.b) activationController.P.getValue()).f225486h.get();
                    default:
                        KProperty[] kPropertyArr3 = ActivationController.V;
                        ActivationController activationController2 = this.f216413b;
                        return dli.f.a(activationController2, activationController2.d(), v.k(new ListSubheaderLoadingDelegate(), new CellDetailsLoadingDelegate(), new FixedTabsLoadingDelegate(), new CellDetailsDelegate(), new FullScreenStateDelegate(), new PlainTextDelegate(), activationController2.R, activationController2.S), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: nj9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivationController f216413b;

            {
                this.f216413b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ActivationController activationController = this.f216413b;
                int i32 = 4;
                int i5 = 2;
                int i6 = 1;
                int i21 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ActivationController.V;
                        oi9.f fVar = kotlin.jvm.internal.s.n(activationController.m2()).v;
                        oi9.b bVar = new oi9.b();
                        bVar.f225482a = e4m.b.b(e4m.c.a(activationController));
                        bVar.f225483b = e4m.b.b(new oi9.a(fVar, bVar, i5, i21));
                        bVar.f225484c = e4m.b.b(new oi9.a(fVar, bVar, i6, i21));
                        bVar.d = e4m.b.b(new oi9.a(fVar, bVar, i21, i21));
                        bVar.e = e4m.b.b(new oi9.a(fVar, bVar, i32, i21));
                        bVar.f = e4m.b.b(new oi9.a(fVar, bVar, 3, i21));
                        bVar.f225485g = e4m.b.b(new oi9.a(fVar, bVar, 6, i21));
                        bVar.f225486h = e4m.b.b(new oi9.a(fVar, bVar, 5, i21));
                        return bVar;
                    case 1:
                        KProperty[] kPropertyArr2 = ActivationController.V;
                        return (i) ((oi9.b) activationController.P.getValue()).f225486h.get();
                    default:
                        KProperty[] kPropertyArr3 = ActivationController.V;
                        ActivationController activationController2 = this.f216413b;
                        return dli.f.a(activationController2, activationController2.d(), v.k(new ListSubheaderLoadingDelegate(), new CellDetailsLoadingDelegate(), new FixedTabsLoadingDelegate(), new CellDetailsDelegate(), new FullScreenStateDelegate(), new PlainTextDelegate(), activationController2.R, activationController2.S), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        g gVar = uiState.f216422b;
        LargeActionButton largeActionButton = d3().f205626c;
        if (gVar instanceof d) {
            largeActionButton.setVisibility(0);
            f fVar = this.O;
            if (fVar == null) {
                Intrinsics.r("nextButtonLoadingController");
                throw null;
            }
            fVar.b(false);
            d dVar = (d) gVar;
            largeActionButton.setText(dVar.f216414a);
            largeActionButton.setEnabled(dVar.f216415b);
            return;
        }
        if (gVar instanceof nj9.f) {
            largeActionButton.setVisibility(0);
            f fVar2 = this.O;
            if (fVar2 != null) {
                fVar2.b(true);
                return;
            } else {
                Intrinsics.r("nextButtonLoadingController");
                throw null;
            }
        }
        if (!(gVar instanceof e)) {
            throw new NoWhenBranchMatchedException();
        }
        f fVar3 = this.O;
        if (fVar3 == null) {
            Intrinsics.r("nextButtonLoadingController");
            throw null;
        }
        fVar3.b(false);
        largeActionButton.setVisibility(8);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        this.K.getClass();
        return b.f161740b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (oi9.b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((oi9.b) this.P.getValue()).f225484c.get()).d(u.c(this.T));
        d3().f205625b.setItemAnimator(null);
        this.O = d3().f205626c.A.V();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52339c.f121375b), null, new n(2, d(), i.class, "onTabSelected", "onTabSelected(Lcom/revolut/core/ui_kit/delegates/FixedTabsDelegate$SelectedData;)V", 4, 25), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.d), null, new nj9.b(2, 4, i.class, d(), "onCellActionClicked", "onCellActionClicked(Lcom/revolut/core/ui_kit/delegates/CellDetailsActionDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f205626c.o), null, new j2(this, null, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.d.f121375b), null, new c(2, 4, i.class, d(), "onBottomDialogLargeActionButtonClicked", "onBottomDialogLargeActionButtonClicked(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
    }

    public final mi9.b d3() {
        ViewBinding value = this.N.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (mi9.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
