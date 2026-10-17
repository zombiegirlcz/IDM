package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details;

import an9.i;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ap7.k;
import aqd.a1;
import aqd.b1;
import aqd.c1;
import aqd.d0;
import aqd.d1;
import aqd.e1;
import aqd.f1;
import aqd.h0;
import aqd.k0;
import aqd.l0;
import aqd.m0;
import aqd.n0;
import aqd.p0;
import aqd.q0;
import aqd.t0;
import aqd.x0;
import aqd.y0;
import aqd.z0;
import cli.o;
import cli.q;
import com.revolut.controller_extensions.keyboardsuggestions.KeyboardSuggestionsControllerExtension;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.DraggableDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit.views.navbar.HeaderWithGaugeBarContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.feature.spending_analytics.impl.R$id;
import com.revolut.feature.spending_analytics.impl.R$layout;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laqd/h0;", "Ldli/a;", "Laqd/q0;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncomeSortersDetailsController extends ViewController<h0> implements dli.a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new kotlin.jvm.internal.h0(IncomeSortersDetailsController.class, "binding", "getBinding()Lcom/revolut/feature/spending_analytics/impl/databinding/ControllerIncomeSorterDetailsBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final FullScreenStateDelegate P;
    public final ListSubheaderDelegate Q;
    public final CellDetailsChevronDelegate R;
    public final RowDelegate S;
    public final SelectableDelegate T;
    public final DraggableDelegate U;
    public final Object V;
    public final Object W;

    public IncomeSortersDetailsController(IncomeSortersDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.controller_income_sorter_details;
        this.L = s.t(this, t0.f);
        this.M = w.y0(new agh.b(this, inputData, 23));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: aqd.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSortersDetailsController f8394b;

            {
                this.f8394b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IncomeSortersDetailsController incomeSortersDetailsController = this.f8394b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeSortersDetailsController.X;
                        return (d0) ((ppd.m0) incomeSortersDetailsController.M.getValue()).f238481h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = IncomeSortersDetailsController.X;
                        return (KeyboardSuggestionsControllerExtension) ((ppd.m0) incomeSortersDetailsController.M.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = IncomeSortersDetailsController.X;
                        IncomeSortersDetailsController incomeSortersDetailsController2 = this.f8394b;
                        return dli.f.a(incomeSortersDetailsController2, incomeSortersDetailsController2.d(), zhm.v.k(incomeSortersDetailsController2.P, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), incomeSortersDetailsController2.S, incomeSortersDetailsController2.T, incomeSortersDetailsController2.U, incomeSortersDetailsController2.Q, incomeSortersDetailsController2.R, new FooterTextDelegate()), R$id.controllerIncomeSorterDetails_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = IncomeSortersDetailsController.X;
                        qd0.b bVarN = ((ppd.m0) incomeSortersDetailsController.M.getValue()).f238478b.d.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: aqd.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSortersDetailsController f8394b;

            {
                this.f8394b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IncomeSortersDetailsController incomeSortersDetailsController = this.f8394b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeSortersDetailsController.X;
                        return (d0) ((ppd.m0) incomeSortersDetailsController.M.getValue()).f238481h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = IncomeSortersDetailsController.X;
                        return (KeyboardSuggestionsControllerExtension) ((ppd.m0) incomeSortersDetailsController.M.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = IncomeSortersDetailsController.X;
                        IncomeSortersDetailsController incomeSortersDetailsController2 = this.f8394b;
                        return dli.f.a(incomeSortersDetailsController2, incomeSortersDetailsController2.d(), zhm.v.k(incomeSortersDetailsController2.P, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), incomeSortersDetailsController2.S, incomeSortersDetailsController2.T, incomeSortersDetailsController2.U, incomeSortersDetailsController2.Q, incomeSortersDetailsController2.R, new FooterTextDelegate()), R$id.controllerIncomeSorterDetails_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = IncomeSortersDetailsController.X;
                        qd0.b bVarN = ((ppd.m0) incomeSortersDetailsController.M.getValue()).f238478b.d.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                }
            }
        });
        this.P = new FullScreenStateDelegate();
        this.Q = new ListSubheaderDelegate();
        this.R = new CellDetailsChevronDelegate();
        final int i3 = 0;
        final int i5 = 1;
        RowDelegate rowDelegate = new RowDelegate(new Function2(this) { // from class: aqd.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSortersDetailsController f8398b;

            {
                this.f8398b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i6 = i3;
                IncomeSortersDetailsController incomeSortersDetailsController = this.f8398b;
                switch (i6) {
                    case 0:
                        RowDelegate.Model model = (RowDelegate.Model) obj2;
                        MaskedTextInputEditText field = (MaskedTextInputEditText) obj3;
                        KProperty[] kPropertyArr = IncomeSortersDetailsController.X;
                        Intrinsics.checkNotNullParameter(model, "model");
                        Intrinsics.checkNotNullParameter(field, "field");
                        Object obj4 = model.u;
                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract.DestinationValue");
                        IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue = (IncomeSorterHomeContract$DestinationValue) obj4;
                        return new zp0.d(field, incomeSorterHomeContract$DestinationValue.f87826b.f115083b, (u80.d) incomeSortersDetailsController.W.getValue(), null, new r10.f(incomeSortersDetailsController, incomeSorterHomeContract$DestinationValue, 2), true, true, 0, false, null, 1928);
                    default:
                        RowDelegate.Model model2 = (RowDelegate.Model) obj2;
                        MaskedTextInputEditText field2 = (MaskedTextInputEditText) obj3;
                        KProperty[] kPropertyArr2 = IncomeSortersDetailsController.X;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        Intrinsics.checkNotNullParameter(field2, "field");
                        Object obj5 = model2.u;
                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract.DestinationValue");
                        IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue2 = (IncomeSorterHomeContract$DestinationValue) obj5;
                        return new zp0.d(field2, incomeSorterHomeContract$DestinationValue2.f87826b.f115083b, (u80.d) incomeSortersDetailsController.W.getValue(), null, new r10.t(incomeSortersDetailsController, incomeSorterHomeContract$DestinationValue2), true, false, 0, false, null, 1672);
                }
            }
        }, new Function2(this) { // from class: aqd.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSortersDetailsController f8398b;

            {
                this.f8398b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i6 = i5;
                IncomeSortersDetailsController incomeSortersDetailsController = this.f8398b;
                switch (i6) {
                    case 0:
                        RowDelegate.Model model = (RowDelegate.Model) obj2;
                        MaskedTextInputEditText field = (MaskedTextInputEditText) obj3;
                        KProperty[] kPropertyArr = IncomeSortersDetailsController.X;
                        Intrinsics.checkNotNullParameter(model, "model");
                        Intrinsics.checkNotNullParameter(field, "field");
                        Object obj4 = model.u;
                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract.DestinationValue");
                        IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue = (IncomeSorterHomeContract$DestinationValue) obj4;
                        return new zp0.d(field, incomeSorterHomeContract$DestinationValue.f87826b.f115083b, (u80.d) incomeSortersDetailsController.W.getValue(), null, new r10.f(incomeSortersDetailsController, incomeSorterHomeContract$DestinationValue, 2), true, true, 0, false, null, 1928);
                    default:
                        RowDelegate.Model model2 = (RowDelegate.Model) obj2;
                        MaskedTextInputEditText field2 = (MaskedTextInputEditText) obj3;
                        KProperty[] kPropertyArr2 = IncomeSortersDetailsController.X;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        Intrinsics.checkNotNullParameter(field2, "field");
                        Object obj5 = model2.u;
                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract.DestinationValue");
                        IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue2 = (IncomeSorterHomeContract$DestinationValue) obj5;
                        return new zp0.d(field2, incomeSorterHomeContract$DestinationValue2.f87826b.f115083b, (u80.d) incomeSortersDetailsController.W.getValue(), null, new r10.t(incomeSortersDetailsController, incomeSorterHomeContract$DestinationValue2), true, false, 0, false, null, 1672);
                }
            }
        }, 4);
        this.S = rowDelegate;
        this.T = new SelectableDelegate(rowDelegate);
        this.U = new DraggableDelegate(rowDelegate, null);
        final int i6 = 2;
        this.V = w.y0(new Function0(this) { // from class: aqd.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSortersDetailsController f8394b;

            {
                this.f8394b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                IncomeSortersDetailsController incomeSortersDetailsController = this.f8394b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeSortersDetailsController.X;
                        return (d0) ((ppd.m0) incomeSortersDetailsController.M.getValue()).f238481h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = IncomeSortersDetailsController.X;
                        return (KeyboardSuggestionsControllerExtension) ((ppd.m0) incomeSortersDetailsController.M.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = IncomeSortersDetailsController.X;
                        IncomeSortersDetailsController incomeSortersDetailsController2 = this.f8394b;
                        return dli.f.a(incomeSortersDetailsController2, incomeSortersDetailsController2.d(), zhm.v.k(incomeSortersDetailsController2.P, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), incomeSortersDetailsController2.S, incomeSortersDetailsController2.T, incomeSortersDetailsController2.U, incomeSortersDetailsController2.Q, incomeSortersDetailsController2.R, new FooterTextDelegate()), R$id.controllerIncomeSorterDetails_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = IncomeSortersDetailsController.X;
                        qd0.b bVarN = ((ppd.m0) incomeSortersDetailsController.M.getValue()).f238478b.d.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                }
            }
        });
        final int i21 = 3;
        this.W = w.y0(new Function0(this) { // from class: aqd.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSortersDetailsController f8394b;

            {
                this.f8394b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                IncomeSortersDetailsController incomeSortersDetailsController = this.f8394b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeSortersDetailsController.X;
                        return (d0) ((ppd.m0) incomeSortersDetailsController.M.getValue()).f238481h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = IncomeSortersDetailsController.X;
                        return (KeyboardSuggestionsControllerExtension) ((ppd.m0) incomeSortersDetailsController.M.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = IncomeSortersDetailsController.X;
                        IncomeSortersDetailsController incomeSortersDetailsController2 = this.f8394b;
                        return dli.f.a(incomeSortersDetailsController2, incomeSortersDetailsController2.d(), zhm.v.k(incomeSortersDetailsController2.P, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), incomeSortersDetailsController2.S, incomeSortersDetailsController2.T, incomeSortersDetailsController2.U, incomeSortersDetailsController2.Q, incomeSortersDetailsController2.R, new FooterTextDelegate()), R$id.controllerIncomeSorterDetails_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = IncomeSortersDetailsController.X;
                        qd0.b bVarN = ((ppd.m0) incomeSortersDetailsController.M.getValue()).f238478b.d.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        q0 uiState = (q0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithContainer navBarWithContainer = d3().f153680c;
        p0 p0Var = uiState.f8388b;
        l0 l0Var = uiState.f8389c;
        boolean z = p0Var instanceof m0;
        m0 m0Var = z ? (m0) p0Var : null;
        if (m0Var != null) {
            TextLocalisedClause textLocalisedClause = m0Var.f8372a;
            Clause clause = m0Var.f8373b;
            if (clause != null) {
                navBarWithContainer.setTitleWithSubtitle(textLocalisedClause, clause);
            } else {
                navBarWithContainer.setTitle(textLocalisedClause);
            }
        }
        HeaderWithGaugeBarContentView headerWithGaugeBarContentView = d3().d;
        if (p0Var.equals(aqd.o0.f8380a)) {
            headerWithGaugeBarContentView.setLoading(false);
        } else if (p0Var.equals(n0.f8377a)) {
            headerWithGaugeBarContentView.setLoading(true);
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            headerWithGaugeBarContentView.setLoading(false);
            headerWithGaugeBarContentView.setModel(((m0) p0Var).f8374c);
        }
        ActionFooterView actionFooterView = d3().f153679b;
        boolean z3 = l0Var instanceof k0;
        actionFooterView.setVisibility(z3 ? 0 : 8);
        k0 k0Var = z3 ? (k0) l0Var : null;
        if (k0Var != null) {
            actionFooterView.setModel(k0Var.f8358a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ppd.m0) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithContainer navBarWithContainer = d3().f153680c;
        navBarWithContainer.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithContainer.setHideTitleWhenExpanded(true);
        navBarWithContainer.M();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ((KeyboardSuggestionsControllerExtension) this.O.getValue()).Q("income_sorter_details");
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f153680c.K()), null, new x0(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(this.P.f52371h.f121375b), 4), null, new a1(this, null), 3);
        RowDelegate rowDelegate = this.S;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new b1(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53220l), null, new c1(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52707c), null, new d1(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.e), null, new e1(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f51821c), null, new f1(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f153679b.f), null, new x0(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f153679b.f58955g), null, new x0(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.r()), null, new y0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53222n), null, new z0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new a35.d(((KeyboardSuggestionsControllerExtension) this.O.getValue()).R("income_sorter_details"), 18), null, new k(this, continuation, 5), 3);
    }

    public final hmd.c d3() {
        ViewBinding value = this.L.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (hmd.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d0 d() {
        return (d0) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
