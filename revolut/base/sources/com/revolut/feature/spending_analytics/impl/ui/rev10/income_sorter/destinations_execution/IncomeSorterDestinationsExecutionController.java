package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations_execution;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.HeaderWithGaugeBarContentView;
import com.revolut.feature.spending_analytics.impl.R$id;
import com.revolut.feature.spending_analytics.impl.R$layout;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations_execution.IncomeSorterDestinationsExecutionController;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ppd.f0;
import te0.w;
import vc.s;
import xki.e;
import ypd.b;
import ypd.c;
import ypd.d;
import ypd.f;
import ypd.j;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations_execution/IncomeSorterDestinationsExecutionController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lypd/b;", "Ldli/a;", "Lypd/d;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncomeSorterDestinationsExecutionController extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(IncomeSorterDestinationsExecutionController.class, "binding", "getBinding()Lcom/revolut/feature/spending_analytics/impl/databinding/ControllerIncomeSorterDestinationsExecutionBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final RowDelegate O;
    public final Object P;

    public IncomeSorterDestinationsExecutionController(IncomeSorterDestinationsExecutionContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.controller_income_sorter_destinations_execution;
        this.L = s.t(this, f.f);
        this.M = w.y0(new yff.b(this, inputData, 15));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ypd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSorterDestinationsExecutionController f315837b;

            {
                this.f315837b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeSorterDestinationsExecutionController.Q;
                        return (j) ((f0) this.f315837b.M.getValue()).f238409c.get();
                    default:
                        KProperty[] kPropertyArr2 = IncomeSorterDestinationsExecutionController.Q;
                        IncomeSorterDestinationsExecutionController incomeSorterDestinationsExecutionController = this.f315837b;
                        return dli.f.a(incomeSorterDestinationsExecutionController, (j) incomeSorterDestinationsExecutionController.N.getValue(), v.k(incomeSorterDestinationsExecutionController.O, new RowLoadingDelegate()), R$id.controllerIncomeSorterDestinationsExecution_recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = new RowDelegate(null, null, 7);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ypd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSorterDestinationsExecutionController f315837b;

            {
                this.f315837b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeSorterDestinationsExecutionController.Q;
                        return (j) ((f0) this.f315837b.M.getValue()).f238409c.get();
                    default:
                        KProperty[] kPropertyArr2 = IncomeSorterDestinationsExecutionController.Q;
                        IncomeSorterDestinationsExecutionController incomeSorterDestinationsExecutionController = this.f315837b;
                        return dli.f.a(incomeSorterDestinationsExecutionController, (j) incomeSorterDestinationsExecutionController.N.getValue(), v.k(incomeSorterDestinationsExecutionController.O, new RowLoadingDelegate()), R$id.controllerIncomeSorterDestinationsExecution_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        c cVar = uiState.f315835b;
        d3().f153676b.setTitle(cVar.f315832a);
        HeaderWithGaugeBarContentView headerWithGaugeBarContentView = d3().f153677c;
        headerWithGaugeBarContentView.setLoading(false);
        headerWithGaugeBarContentView.setModel(cVar.f315833b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f153676b.setHideTitleWhenExpanded(true);
    }

    public final hmd.b d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (hmd.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
