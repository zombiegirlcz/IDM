package com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument.InstrumentSelectionController;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument.InstrumentSelectionControllerContract$InputData;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import d2h.d;
import dli.a;
import efm.r;
import java.util.concurrent.TimeUnit;
import jyk.g0;
import k1f.n;
import k2h.b;
import k2h.c;
import kotlin.Metadata;
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
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/asset/selection/impl/ui/screens/instrument/InstrumentSelectionController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lk2h/h;", "Companion", "a", "feature_wealth_asset_selection_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstrumentSelectionController extends ViewController<q> implements a {
    public final InstrumentSelectionControllerContract$InputData K;
    public final h L;
    public final RowDelegate M;
    public final SelectableDelegate N;
    public final Object O;
    public final Object P;
    public final int Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(InstrumentSelectionController.class, "binding", "getBinding()Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument.InstrumentSelectionController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public InstrumentSelectionController(InstrumentSelectionControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.M = rowDelegate;
        this.N = new SelectableDelegate(rowDelegate);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: k2h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentSelectionController f180579b;

            {
                this.f180579b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InstrumentSelectionController instrumentSelectionController = this.f180579b;
                switch (i2) {
                    case 0:
                        InstrumentSelectionController.Companion companion = InstrumentSelectionController.INSTANCE;
                        qji.b bVarU2 = instrumentSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument.di.InstrumentSelectionControllerComponentInjector");
                        d2h.a aVar = (d2h.a) bVarU2;
                        d2h.e eVar = aVar.f110833b;
                        d2h.a aVar2 = aVar.f110834c;
                        InstrumentSelectionControllerContract$InputData instrumentSelectionControllerContract$InputData = instrumentSelectionController.K;
                        instrumentSelectionControllerContract$InputData.getClass();
                        return new d2h.d(eVar, aVar2, instrumentSelectionControllerContract$InputData);
                    case 1:
                        InstrumentSelectionController.Companion companion2 = InstrumentSelectionController.INSTANCE;
                        return (e) ((d2h.d) instrumentSelectionController.O.getValue()).f110841b.get();
                    default:
                        InstrumentSelectionController.Companion companion3 = InstrumentSelectionController.INSTANCE;
                        InstrumentSelectionController instrumentSelectionController2 = this.f180579b;
                        return dli.f.a(instrumentSelectionController2, (e) instrumentSelectionController2.P.getValue(), v.k(instrumentSelectionController2.M, instrumentSelectionController2.N, new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: k2h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentSelectionController f180579b;

            {
                this.f180579b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InstrumentSelectionController instrumentSelectionController = this.f180579b;
                switch (i22) {
                    case 0:
                        InstrumentSelectionController.Companion companion = InstrumentSelectionController.INSTANCE;
                        qji.b bVarU2 = instrumentSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument.di.InstrumentSelectionControllerComponentInjector");
                        d2h.a aVar = (d2h.a) bVarU2;
                        d2h.e eVar = aVar.f110833b;
                        d2h.a aVar2 = aVar.f110834c;
                        InstrumentSelectionControllerContract$InputData instrumentSelectionControllerContract$InputData = instrumentSelectionController.K;
                        instrumentSelectionControllerContract$InputData.getClass();
                        return new d2h.d(eVar, aVar2, instrumentSelectionControllerContract$InputData);
                    case 1:
                        InstrumentSelectionController.Companion companion2 = InstrumentSelectionController.INSTANCE;
                        return (e) ((d2h.d) instrumentSelectionController.O.getValue()).f110841b.get();
                    default:
                        InstrumentSelectionController.Companion companion3 = InstrumentSelectionController.INSTANCE;
                        InstrumentSelectionController instrumentSelectionController2 = this.f180579b;
                        return dli.f.a(instrumentSelectionController2, (e) instrumentSelectionController2.P.getValue(), v.k(instrumentSelectionController2.M, instrumentSelectionController2.N, new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.Q = R$layout.screen_recycler_view;
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: k2h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentSelectionController f180579b;

            {
                this.f180579b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InstrumentSelectionController instrumentSelectionController = this.f180579b;
                switch (i22) {
                    case 0:
                        InstrumentSelectionController.Companion companion = InstrumentSelectionController.INSTANCE;
                        qji.b bVarU2 = instrumentSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument.di.InstrumentSelectionControllerComponentInjector");
                        d2h.a aVar = (d2h.a) bVarU2;
                        d2h.e eVar = aVar.f110833b;
                        d2h.a aVar2 = aVar.f110834c;
                        InstrumentSelectionControllerContract$InputData instrumentSelectionControllerContract$InputData = instrumentSelectionController.K;
                        instrumentSelectionControllerContract$InputData.getClass();
                        return new d2h.d(eVar, aVar2, instrumentSelectionControllerContract$InputData);
                    case 1:
                        InstrumentSelectionController.Companion companion2 = InstrumentSelectionController.INSTANCE;
                        return (e) ((d2h.d) instrumentSelectionController.O.getValue()).f110841b.get();
                    default:
                        InstrumentSelectionController.Companion companion3 = InstrumentSelectionController.INSTANCE;
                        InstrumentSelectionController instrumentSelectionController2 = this.f180579b;
                        return dli.f.a(instrumentSelectionController2, (e) instrumentSelectionController2.P.getValue(), v.k(instrumentSelectionController2.M, instrumentSelectionController2.N, new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((k2h.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (k2h.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.r()), new k2h.d(this, null), 3);
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ScreenContentRecyclerView recyclerView = ((pji.a) value).f236787b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        r rVarDistinctUntilChanged = x.c(recyclerView, 7).debounce(300L, TimeUnit.MILLISECONDS).filter(new g0(new k0d.c(this, 7), 18)).distinctUntilChanged((kfm.d) new g0(new n(4), 19));
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewController.P2(this, rd0.e.b(rVarDistinctUntilChanged), new jv.o(this, null, 15), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
