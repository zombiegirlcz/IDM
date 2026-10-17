package com.revolut.feature.wealth.impl.ui.screens.instruments_collection;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e4;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionController;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import efm.r;
import i83.m;
import i9g.e0;
import ich.b;
import ich.c;
import ich.d;
import ich.f;
import ich.g;
import ich.i;
import ich.j;
import ich.k;
import ich.p;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;
import xv0.x;
import z0h.s1;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/screens/instruments_collection/InstrumentsCollectionController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lich/q;", "Lz0h/s1;", "Companion", "a", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstrumentsCollectionController extends ViewController<q> implements dli.a, s1 {
    public final InstrumentsCollectionControllerContract$InputData K;
    public final h L;
    public final Object M;
    public final int N;
    public final ListSubheaderDelegate O;
    public final FullScreenStateDelegate P;
    public final ActionsDelegate Q;
    public final RowDelegate R;
    public final SingleChoiceDelegate S;
    public final LargeActionButtonDelegate T;
    public final TextDelegate U;
    public final Object V;
    public final Object W;
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(InstrumentsCollectionController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public InstrumentsCollectionController(InstrumentsCollectionControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ich.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentsCollectionController f160270b;

            {
                this.f160270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InstrumentsCollectionController instrumentsCollectionController = this.f160270b;
                switch (i2) {
                    case 0:
                        InstrumentsCollectionController.Companion companion = InstrumentsCollectionController.INSTANCE;
                        return (k) ((h9h.b) instrumentsCollectionController.W.getValue()).f150292j.get();
                    case 1:
                        InstrumentsCollectionController.Companion companion2 = InstrumentsCollectionController.INSTANCE;
                        InstrumentsCollectionController instrumentsCollectionController2 = this.f160270b;
                        return dli.f.a(instrumentsCollectionController2, instrumentsCollectionController2.R2(), v.k(new RowLoadingDelegate(), instrumentsCollectionController2.P, instrumentsCollectionController2.Q, instrumentsCollectionController2.R, instrumentsCollectionController2.O, instrumentsCollectionController2.U), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        InstrumentsCollectionController.Companion companion3 = InstrumentsCollectionController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(instrumentsCollectionController.m2()).a().get(h9h.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h9h.a.class, " is not found"));
                        }
                        h9h.a aVar3 = ((h9h.a) aVar2.b()).D;
                        InstrumentsCollectionControllerContract$InputData instrumentsCollectionControllerContract$InputData = instrumentsCollectionController.K;
                        instrumentsCollectionControllerContract$InputData.getClass();
                        return new h9h.b(aVar3, instrumentsCollectionController, instrumentsCollectionControllerContract$InputData, instrumentsCollectionController);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = new ListSubheaderDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = new ActionsDelegate();
        this.R = new RowDelegate(null, null, 7);
        this.S = new SingleChoiceDelegate();
        this.T = new LargeActionButtonDelegate();
        this.U = new TextDelegate();
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: ich.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentsCollectionController f160270b;

            {
                this.f160270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InstrumentsCollectionController instrumentsCollectionController = this.f160270b;
                switch (i22) {
                    case 0:
                        InstrumentsCollectionController.Companion companion = InstrumentsCollectionController.INSTANCE;
                        return (k) ((h9h.b) instrumentsCollectionController.W.getValue()).f150292j.get();
                    case 1:
                        InstrumentsCollectionController.Companion companion2 = InstrumentsCollectionController.INSTANCE;
                        InstrumentsCollectionController instrumentsCollectionController2 = this.f160270b;
                        return dli.f.a(instrumentsCollectionController2, instrumentsCollectionController2.R2(), v.k(new RowLoadingDelegate(), instrumentsCollectionController2.P, instrumentsCollectionController2.Q, instrumentsCollectionController2.R, instrumentsCollectionController2.O, instrumentsCollectionController2.U), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        InstrumentsCollectionController.Companion companion3 = InstrumentsCollectionController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(instrumentsCollectionController.m2()).a().get(h9h.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h9h.a.class, " is not found"));
                        }
                        h9h.a aVar3 = ((h9h.a) aVar2.b()).D;
                        InstrumentsCollectionControllerContract$InputData instrumentsCollectionControllerContract$InputData = instrumentsCollectionController.K;
                        instrumentsCollectionControllerContract$InputData.getClass();
                        return new h9h.b(aVar3, instrumentsCollectionController, instrumentsCollectionControllerContract$InputData, instrumentsCollectionController);
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: ich.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentsCollectionController f160270b;

            {
                this.f160270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InstrumentsCollectionController instrumentsCollectionController = this.f160270b;
                switch (i22) {
                    case 0:
                        InstrumentsCollectionController.Companion companion = InstrumentsCollectionController.INSTANCE;
                        return (k) ((h9h.b) instrumentsCollectionController.W.getValue()).f150292j.get();
                    case 1:
                        InstrumentsCollectionController.Companion companion2 = InstrumentsCollectionController.INSTANCE;
                        InstrumentsCollectionController instrumentsCollectionController2 = this.f160270b;
                        return dli.f.a(instrumentsCollectionController2, instrumentsCollectionController2.R2(), v.k(new RowLoadingDelegate(), instrumentsCollectionController2.P, instrumentsCollectionController2.Q, instrumentsCollectionController2.R, instrumentsCollectionController2.O, instrumentsCollectionController2.U), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        InstrumentsCollectionController.Companion companion3 = InstrumentsCollectionController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(instrumentsCollectionController.m2()).a().get(h9h.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h9h.a.class, " is not found"));
                        }
                        h9h.a aVar3 = ((h9h.a) aVar2.b()).D;
                        InstrumentsCollectionControllerContract$InputData instrumentsCollectionControllerContract$InputData = instrumentsCollectionController.K;
                        instrumentsCollectionControllerContract$InputData.getClass();
                        return new h9h.b(aVar3, instrumentsCollectionController, instrumentsCollectionControllerContract$InputData, instrumentsCollectionController);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        ich.q uiState = (ich.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        p pVar = uiState.f160284a;
        Clause clause = pVar.f160281a;
        if (clause != null) {
            navBarWithToolbar.setTitle(clause, null);
            navBarWithToolbar.setToolbarTitle(clause);
            navBarWithToolbar.setLoadingVisible(false);
        } else {
            navBarWithToolbar.setLoadingVisible(true);
        }
        Clause clause2 = pVar.f160282b;
        if (clause2 != null) {
            navBarWithToolbar.setSecondDescriptionText(clause2);
            navBarWithToolbar.setSecondDescriptionVisible(true);
        }
        navBarWithToolbar.setSearchButtonActive(Intrinsics.f(pVar.f160283c, Boolean.TRUE));
        Clause clause3 = pVar.d;
        if (clause3 != null) {
            navBarWithToolbar.setHint(clause3);
        }
        e4 e4Var = pVar.e;
        if (e4Var != null) {
            navBarWithToolbar.setFiltersState(e4Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h9h.b) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((h9h.b) this.W.getValue()).f150290g.get()).d(v.k(this.T, this.S));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.u0()), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f51611c.f121375b), null, new ich.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f53218h), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52707c), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.d.f121375b), null, new ich.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.p()), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new j(this, null), 3);
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        r map = x.c(recyclerView, 3).debounce(300L, TimeUnit.MILLISECONDS).filter(new icc.c(new i9e.a(this, 14), 4)).distinctUntilChanged((kfm.d) new icc.c(new m(14), 5)).map(new icc.c(new e0(23), 6));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new c(this, continuation, 0), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.L.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }

    @Override // z0h.s1
    public final vkm.d r() {
        return rd0.e.b(this.U.d);
    }
}
