package com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.underlying_assets;

import a5e.g;
import aii.q;
import cli.o;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.underlying_assets.PerformanceTrackerUnderlyingAssetsController;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.underlying_assets.PerformanceTrackerUnderlyingAssetsControllerContract$InputData;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import o4e.i;
import o4e.k;
import o4e.l;
import org.jetbrains.annotations.NotNull;
import te0.w;
import v4e.n;
import vc.s;
import x5e.b;
import x5e.d;
import x5e.f;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/structured_note/details/impl/ui/screens/performance_tracker/pages/underlying_assets/PerformanceTrackerUnderlyingAssetsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lx5e/d;", "Companion", "a", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PerformanceTrackerUnderlyingAssetsController extends ViewController<q> implements a {
    public final PerformanceTrackerUnderlyingAssetsControllerContract$InputData K;
    public final int L;
    public final FixedTabsDelegate M;
    public final TrendViewDelegate N;
    public final InputChecklistDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PerformanceTrackerUnderlyingAssetsController.class, "binding", "getBinding()Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.underlying_assets.PerformanceTrackerUnderlyingAssetsController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public PerformanceTrackerUnderlyingAssetsController(PerformanceTrackerUnderlyingAssetsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        s.t(this, b.f);
        this.L = R$layout.screen_recycler_view;
        this.M = new FixedTabsDelegate();
        this.N = new TrendViewDelegate(1000L);
        this.O = new InputChecklistDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: x5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerformanceTrackerUnderlyingAssetsController f302940b;

            {
                this.f302940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PerformanceTrackerUnderlyingAssetsController performanceTrackerUnderlyingAssetsController = this.f302940b;
                switch (i2) {
                    case 0:
                        PerformanceTrackerUnderlyingAssetsController.Companion companion = PerformanceTrackerUnderlyingAssetsController.INSTANCE;
                        qji.b bVarU2 = performanceTrackerUnderlyingAssetsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.underlying_assets.di.PerformanceTrackerUnderlyingAssetsControllerComponentInjector");
                        i iVar = (i) bVarU2;
                        l lVar = iVar.f222248b;
                        i iVar2 = iVar.f222249c;
                        PerformanceTrackerUnderlyingAssetsControllerContract$InputData performanceTrackerUnderlyingAssetsControllerContract$InputData = performanceTrackerUnderlyingAssetsController.K;
                        return new k(lVar, iVar2, new g(performanceTrackerUnderlyingAssetsControllerContract$InputData.f88913a), new a5e.c(performanceTrackerUnderlyingAssetsController.M), new v4e.q(performanceTrackerUnderlyingAssetsControllerContract$InputData.f88913a), new n(performanceTrackerUnderlyingAssetsController.N, performanceTrackerUnderlyingAssetsController.O));
                    case 1:
                        PerformanceTrackerUnderlyingAssetsController.Companion companion2 = PerformanceTrackerUnderlyingAssetsController.INSTANCE;
                        return (f) ((k) performanceTrackerUnderlyingAssetsController.P.getValue()).f222258j.get();
                    default:
                        PerformanceTrackerUnderlyingAssetsController.Companion companion3 = PerformanceTrackerUnderlyingAssetsController.INSTANCE;
                        PerformanceTrackerUnderlyingAssetsController performanceTrackerUnderlyingAssetsController2 = this.f302940b;
                        return dli.f.a(performanceTrackerUnderlyingAssetsController2, (f) performanceTrackerUnderlyingAssetsController2.Q.getValue(), v.k(performanceTrackerUnderlyingAssetsController2.M, performanceTrackerUnderlyingAssetsController2.N, performanceTrackerUnderlyingAssetsController2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: x5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerformanceTrackerUnderlyingAssetsController f302940b;

            {
                this.f302940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PerformanceTrackerUnderlyingAssetsController performanceTrackerUnderlyingAssetsController = this.f302940b;
                switch (i22) {
                    case 0:
                        PerformanceTrackerUnderlyingAssetsController.Companion companion = PerformanceTrackerUnderlyingAssetsController.INSTANCE;
                        qji.b bVarU2 = performanceTrackerUnderlyingAssetsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.underlying_assets.di.PerformanceTrackerUnderlyingAssetsControllerComponentInjector");
                        i iVar = (i) bVarU2;
                        l lVar = iVar.f222248b;
                        i iVar2 = iVar.f222249c;
                        PerformanceTrackerUnderlyingAssetsControllerContract$InputData performanceTrackerUnderlyingAssetsControllerContract$InputData = performanceTrackerUnderlyingAssetsController.K;
                        return new k(lVar, iVar2, new g(performanceTrackerUnderlyingAssetsControllerContract$InputData.f88913a), new a5e.c(performanceTrackerUnderlyingAssetsController.M), new v4e.q(performanceTrackerUnderlyingAssetsControllerContract$InputData.f88913a), new n(performanceTrackerUnderlyingAssetsController.N, performanceTrackerUnderlyingAssetsController.O));
                    case 1:
                        PerformanceTrackerUnderlyingAssetsController.Companion companion2 = PerformanceTrackerUnderlyingAssetsController.INSTANCE;
                        return (f) ((k) performanceTrackerUnderlyingAssetsController.P.getValue()).f222258j.get();
                    default:
                        PerformanceTrackerUnderlyingAssetsController.Companion companion3 = PerformanceTrackerUnderlyingAssetsController.INSTANCE;
                        PerformanceTrackerUnderlyingAssetsController performanceTrackerUnderlyingAssetsController2 = this.f302940b;
                        return dli.f.a(performanceTrackerUnderlyingAssetsController2, (f) performanceTrackerUnderlyingAssetsController2.Q.getValue(), v.k(performanceTrackerUnderlyingAssetsController2.M, performanceTrackerUnderlyingAssetsController2.N, performanceTrackerUnderlyingAssetsController2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: x5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerformanceTrackerUnderlyingAssetsController f302940b;

            {
                this.f302940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PerformanceTrackerUnderlyingAssetsController performanceTrackerUnderlyingAssetsController = this.f302940b;
                switch (i22) {
                    case 0:
                        PerformanceTrackerUnderlyingAssetsController.Companion companion = PerformanceTrackerUnderlyingAssetsController.INSTANCE;
                        qji.b bVarU2 = performanceTrackerUnderlyingAssetsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.underlying_assets.di.PerformanceTrackerUnderlyingAssetsControllerComponentInjector");
                        i iVar = (i) bVarU2;
                        l lVar = iVar.f222248b;
                        i iVar2 = iVar.f222249c;
                        PerformanceTrackerUnderlyingAssetsControllerContract$InputData performanceTrackerUnderlyingAssetsControllerContract$InputData = performanceTrackerUnderlyingAssetsController.K;
                        return new k(lVar, iVar2, new g(performanceTrackerUnderlyingAssetsControllerContract$InputData.f88913a), new a5e.c(performanceTrackerUnderlyingAssetsController.M), new v4e.q(performanceTrackerUnderlyingAssetsControllerContract$InputData.f88913a), new n(performanceTrackerUnderlyingAssetsController.N, performanceTrackerUnderlyingAssetsController.O));
                    case 1:
                        PerformanceTrackerUnderlyingAssetsController.Companion companion2 = PerformanceTrackerUnderlyingAssetsController.INSTANCE;
                        return (f) ((k) performanceTrackerUnderlyingAssetsController.P.getValue()).f222258j.get();
                    default:
                        PerformanceTrackerUnderlyingAssetsController.Companion companion3 = PerformanceTrackerUnderlyingAssetsController.INSTANCE;
                        PerformanceTrackerUnderlyingAssetsController performanceTrackerUnderlyingAssetsController2 = this.f302940b;
                        return dli.f.a(performanceTrackerUnderlyingAssetsController2, (f) performanceTrackerUnderlyingAssetsController2.Q.getValue(), v.k(performanceTrackerUnderlyingAssetsController2.M, performanceTrackerUnderlyingAssetsController2.N, performanceTrackerUnderlyingAssetsController2.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
