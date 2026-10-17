package com.revolut.feature.wealth.assetdetails.ui.impl.high_risk;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.assetdetails.ui.impl.high_risk.InstrumentHighRiskWarningController;
import com.revolut.feature.wealth.assetdetails.ui.impl.high_risk.InstrumentHighRiskWarningControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import g06.k;
import g4h.b;
import g4h.c;
import g4h.d;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import z3h.g;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/assetdetails/ui/impl/high_risk/InstrumentHighRiskWarningController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lg4h/c;", "feature_wealth_asset_details_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstrumentHighRiskWarningController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(InstrumentHighRiskWarningController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final InstrumentHighRiskWarningControllerContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final RowDelegate O;
    public final Object P;
    public final h Q;

    public InstrumentHighRiskWarningController(InstrumentHighRiskWarningControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: g4h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentHighRiskWarningController f140524b;

            {
                this.f140524b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InstrumentHighRiskWarningController instrumentHighRiskWarningController = this.f140524b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InstrumentHighRiskWarningController.R;
                        phm.a aVar = (phm.a) ue0.e.j(instrumentHighRiskWarningController.m2()).a().get(m2h.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2h.b.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).f319291s;
                        InstrumentHighRiskWarningControllerContract$InputData instrumentHighRiskWarningControllerContract$InputData = instrumentHighRiskWarningController.K;
                        instrumentHighRiskWarningControllerContract$InputData.getClass();
                        return new z3h.c(gVar, instrumentHighRiskWarningControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InstrumentHighRiskWarningController.R;
                        return (d) ((z3h.c) instrumentHighRiskWarningController.M.getValue()).f319269b.get();
                    default:
                        KProperty[] kPropertyArr3 = InstrumentHighRiskWarningController.R;
                        InstrumentHighRiskWarningController instrumentHighRiskWarningController2 = this.f140524b;
                        return dli.f.a(instrumentHighRiskWarningController2, (d) instrumentHighRiskWarningController2.N.getValue(), u.c(instrumentHighRiskWarningController2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: g4h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentHighRiskWarningController f140524b;

            {
                this.f140524b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InstrumentHighRiskWarningController instrumentHighRiskWarningController = this.f140524b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InstrumentHighRiskWarningController.R;
                        phm.a aVar = (phm.a) ue0.e.j(instrumentHighRiskWarningController.m2()).a().get(m2h.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2h.b.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).f319291s;
                        InstrumentHighRiskWarningControllerContract$InputData instrumentHighRiskWarningControllerContract$InputData = instrumentHighRiskWarningController.K;
                        instrumentHighRiskWarningControllerContract$InputData.getClass();
                        return new z3h.c(gVar, instrumentHighRiskWarningControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InstrumentHighRiskWarningController.R;
                        return (d) ((z3h.c) instrumentHighRiskWarningController.M.getValue()).f319269b.get();
                    default:
                        KProperty[] kPropertyArr3 = InstrumentHighRiskWarningController.R;
                        InstrumentHighRiskWarningController instrumentHighRiskWarningController2 = this.f140524b;
                        return dli.f.a(instrumentHighRiskWarningController2, (d) instrumentHighRiskWarningController2.N.getValue(), u.c(instrumentHighRiskWarningController2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: g4h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentHighRiskWarningController f140524b;

            {
                this.f140524b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InstrumentHighRiskWarningController instrumentHighRiskWarningController = this.f140524b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InstrumentHighRiskWarningController.R;
                        phm.a aVar = (phm.a) ue0.e.j(instrumentHighRiskWarningController.m2()).a().get(m2h.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2h.b.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).f319291s;
                        InstrumentHighRiskWarningControllerContract$InputData instrumentHighRiskWarningControllerContract$InputData = instrumentHighRiskWarningController.K;
                        instrumentHighRiskWarningControllerContract$InputData.getClass();
                        return new z3h.c(gVar, instrumentHighRiskWarningControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InstrumentHighRiskWarningController.R;
                        return (d) ((z3h.c) instrumentHighRiskWarningController.M.getValue()).f319269b.get();
                    default:
                        KProperty[] kPropertyArr3 = InstrumentHighRiskWarningController.R;
                        InstrumentHighRiskWarningController instrumentHighRiskWarningController2 = this.f140524b;
                        return dli.f.a(instrumentHighRiskWarningController2, (d) instrumentHighRiskWarningController2.N.getValue(), u.c(instrumentHighRiskWarningController2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(uiState.f140525a, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        Clause clause = uiState.f140526b;
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(uiState.f140527c);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z3h.c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new ft.d(this, null, 23), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53226s), new k(this, null, 14), 3);
    }

    public final m d3() {
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
