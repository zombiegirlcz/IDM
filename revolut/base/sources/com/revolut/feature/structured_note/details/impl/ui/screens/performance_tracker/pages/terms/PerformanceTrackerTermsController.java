package com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.PerformanceTrackerTermsController;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.PerformanceTrackerTermsControllerContract$InputData;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import o4e.i;
import o4e.j;
import o4e.l;
import org.jetbrains.annotations.NotNull;
import te0.w;
import v5e.b;
import v5e.d;
import v5e.f;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/structured_note/details/impl/ui/screens/performance_tracker/pages/terms/PerformanceTrackerTermsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lv5e/f;", "Companion", "a", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PerformanceTrackerTermsController extends ViewController<q> implements dli.a {
    public final PerformanceTrackerTermsControllerContract$InputData K;
    public final int L;
    public final TrendViewDelegate M;
    public final RowDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PerformanceTrackerTermsController.class, "binding", "getBinding()Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.PerformanceTrackerTermsController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public PerformanceTrackerTermsController(PerformanceTrackerTermsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        s.t(this, b.f);
        this.L = R$layout.screen_recycler_view;
        this.M = new TrendViewDelegate(1000L);
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: v5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerformanceTrackerTermsController f286200b;

            {
                this.f286200b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PerformanceTrackerTermsController performanceTrackerTermsController = this.f286200b;
                switch (i2) {
                    case 0:
                        PerformanceTrackerTermsController.Companion companion = PerformanceTrackerTermsController.INSTANCE;
                        qji.b bVarU2 = performanceTrackerTermsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.di.PerformanceTrackerTermsControllerComponentInjector");
                        i iVar = (i) bVarU2;
                        l lVar = iVar.f222248b;
                        i iVar2 = iVar.f222249c;
                        PerformanceTrackerTermsControllerContract$InputData performanceTrackerTermsControllerContract$InputData = performanceTrackerTermsController.K;
                        return new j(lVar, iVar2, performanceTrackerTermsControllerContract$InputData, new x4e.e(performanceTrackerTermsControllerContract$InputData.f88907a), new x4e.c(performanceTrackerTermsController.M));
                    case 1:
                        PerformanceTrackerTermsController.Companion companion2 = PerformanceTrackerTermsController.INSTANCE;
                        return (d) ((j) performanceTrackerTermsController.O.getValue()).f.get();
                    default:
                        PerformanceTrackerTermsController.Companion companion3 = PerformanceTrackerTermsController.INSTANCE;
                        PerformanceTrackerTermsController performanceTrackerTermsController2 = this.f286200b;
                        return dli.f.a(performanceTrackerTermsController2, (d) performanceTrackerTermsController2.P.getValue(), v.k(performanceTrackerTermsController2.N, performanceTrackerTermsController2.M), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: v5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerformanceTrackerTermsController f286200b;

            {
                this.f286200b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PerformanceTrackerTermsController performanceTrackerTermsController = this.f286200b;
                switch (i22) {
                    case 0:
                        PerformanceTrackerTermsController.Companion companion = PerformanceTrackerTermsController.INSTANCE;
                        qji.b bVarU2 = performanceTrackerTermsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.di.PerformanceTrackerTermsControllerComponentInjector");
                        i iVar = (i) bVarU2;
                        l lVar = iVar.f222248b;
                        i iVar2 = iVar.f222249c;
                        PerformanceTrackerTermsControllerContract$InputData performanceTrackerTermsControllerContract$InputData = performanceTrackerTermsController.K;
                        return new j(lVar, iVar2, performanceTrackerTermsControllerContract$InputData, new x4e.e(performanceTrackerTermsControllerContract$InputData.f88907a), new x4e.c(performanceTrackerTermsController.M));
                    case 1:
                        PerformanceTrackerTermsController.Companion companion2 = PerformanceTrackerTermsController.INSTANCE;
                        return (d) ((j) performanceTrackerTermsController.O.getValue()).f.get();
                    default:
                        PerformanceTrackerTermsController.Companion companion3 = PerformanceTrackerTermsController.INSTANCE;
                        PerformanceTrackerTermsController performanceTrackerTermsController2 = this.f286200b;
                        return dli.f.a(performanceTrackerTermsController2, (d) performanceTrackerTermsController2.P.getValue(), v.k(performanceTrackerTermsController2.N, performanceTrackerTermsController2.M), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: v5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerformanceTrackerTermsController f286200b;

            {
                this.f286200b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PerformanceTrackerTermsController performanceTrackerTermsController = this.f286200b;
                switch (i22) {
                    case 0:
                        PerformanceTrackerTermsController.Companion companion = PerformanceTrackerTermsController.INSTANCE;
                        qji.b bVarU2 = performanceTrackerTermsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.di.PerformanceTrackerTermsControllerComponentInjector");
                        i iVar = (i) bVarU2;
                        l lVar = iVar.f222248b;
                        i iVar2 = iVar.f222249c;
                        PerformanceTrackerTermsControllerContract$InputData performanceTrackerTermsControllerContract$InputData = performanceTrackerTermsController.K;
                        return new j(lVar, iVar2, performanceTrackerTermsControllerContract$InputData, new x4e.e(performanceTrackerTermsControllerContract$InputData.f88907a), new x4e.c(performanceTrackerTermsController.M));
                    case 1:
                        PerformanceTrackerTermsController.Companion companion2 = PerformanceTrackerTermsController.INSTANCE;
                        return (d) ((j) performanceTrackerTermsController.O.getValue()).f.get();
                    default:
                        PerformanceTrackerTermsController.Companion companion3 = PerformanceTrackerTermsController.INSTANCE;
                        PerformanceTrackerTermsController performanceTrackerTermsController2 = this.f286200b;
                        return dli.f.a(performanceTrackerTermsController2, (d) performanceTrackerTermsController2.P.getValue(), v.k(performanceTrackerTermsController2.N, performanceTrackerTermsController2.M), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new v2e.h0(rd0.e.b(this.N.f53218h), 3), new v44.e(this, null, 5), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
