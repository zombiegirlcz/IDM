package com.revolut.feature.retail.cfd.impl.screens.overnight_fee;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.cfd.impl.screens.overnight_fee.CfdOvernightFeeBreakdownController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import dze.n;
import e4b.b;
import e4b.d;
import e4b.f;
import e4b.g;
import e4b.k;
import i7d.i;
import jii.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.q3;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/overnight_fee/CfdOvernightFeeBreakdownController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Le4b/k;", "Li7d/i;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdOvernightFeeBreakdownController extends ViewController<q> implements a, i {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CfdOvernightFeeBreakdownController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final e4b.i K;
    public final h L;
    public final int M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public CfdOvernightFeeBreakdownController(e4b.i inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar;
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: e4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdOvernightFeeBreakdownController f122517b;

            {
                this.f122517b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CfdOvernightFeeBreakdownController cfdOvernightFeeBreakdownController = this.f122517b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CfdOvernightFeeBreakdownController.R;
                        CfdOvernightFeeBreakdownController cfdOvernightFeeBreakdownController2 = this.f122517b;
                        return dli.f.a(cfdOvernightFeeBreakdownController2, (d) cfdOvernightFeeBreakdownController2.Q.getValue(), v.k(new CellDetailsDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), cfdOvernightFeeBreakdownController2.N), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdOvernightFeeBreakdownController.R;
                        phm.a aVar = (phm.a) ue0.e.j(cfdOvernightFeeBreakdownController.m2()).a().get(m2b.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2b.v.class, " is not found"));
                        }
                        m2b.v vVar = ((m2b.v) aVar2.b()).C;
                        i iVar = cfdOvernightFeeBreakdownController.K;
                        iVar.getClass();
                        return new m2b.o(vVar, iVar, cfdOvernightFeeBreakdownController);
                    default:
                        KProperty[] kPropertyArr3 = CfdOvernightFeeBreakdownController.R;
                        return (d) ((m2b.o) cfdOvernightFeeBreakdownController.P.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: e4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdOvernightFeeBreakdownController f122517b;

            {
                this.f122517b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CfdOvernightFeeBreakdownController cfdOvernightFeeBreakdownController = this.f122517b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CfdOvernightFeeBreakdownController.R;
                        CfdOvernightFeeBreakdownController cfdOvernightFeeBreakdownController2 = this.f122517b;
                        return dli.f.a(cfdOvernightFeeBreakdownController2, (d) cfdOvernightFeeBreakdownController2.Q.getValue(), v.k(new CellDetailsDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), cfdOvernightFeeBreakdownController2.N), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdOvernightFeeBreakdownController.R;
                        phm.a aVar = (phm.a) ue0.e.j(cfdOvernightFeeBreakdownController.m2()).a().get(m2b.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2b.v.class, " is not found"));
                        }
                        m2b.v vVar = ((m2b.v) aVar2.b()).C;
                        i iVar = cfdOvernightFeeBreakdownController.K;
                        iVar.getClass();
                        return new m2b.o(vVar, iVar, cfdOvernightFeeBreakdownController);
                    default:
                        KProperty[] kPropertyArr3 = CfdOvernightFeeBreakdownController.R;
                        return (d) ((m2b.o) cfdOvernightFeeBreakdownController.P.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: e4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdOvernightFeeBreakdownController f122517b;

            {
                this.f122517b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CfdOvernightFeeBreakdownController cfdOvernightFeeBreakdownController = this.f122517b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CfdOvernightFeeBreakdownController.R;
                        CfdOvernightFeeBreakdownController cfdOvernightFeeBreakdownController2 = this.f122517b;
                        return dli.f.a(cfdOvernightFeeBreakdownController2, (d) cfdOvernightFeeBreakdownController2.Q.getValue(), v.k(new CellDetailsDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), cfdOvernightFeeBreakdownController2.N), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdOvernightFeeBreakdownController.R;
                        phm.a aVar = (phm.a) ue0.e.j(cfdOvernightFeeBreakdownController.m2()).a().get(m2b.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2b.v.class, " is not found"));
                        }
                        m2b.v vVar = ((m2b.v) aVar2.b()).C;
                        i iVar = cfdOvernightFeeBreakdownController.K;
                        iVar.getClass();
                        return new m2b.o(vVar, iVar, cfdOvernightFeeBreakdownController);
                    default:
                        KProperty[] kPropertyArr3 = CfdOvernightFeeBreakdownController.R;
                        return (d) ((m2b.o) cfdOvernightFeeBreakdownController.P.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f122527a;
        e4b.h hVar = uiState.d;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setDescriptionText(uiState.f122528b);
        Clause clause2 = uiState.f122529c;
        navBarWithToolbar.setSecondDescriptionText(clause2);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        if (hVar instanceof f) {
            navBarWithToolbar.setEndImage(new q3(((f) hVar).f122521a));
        } else {
            if (!(hVar instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            g gVar = (g) hVar;
            navBarWithToolbar.setEndIconImage(gVar.f122522a);
            navBarWithToolbar.setEndIconBadgeImage(gVar.f122523b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m2b.o) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // i7d.i
    public final koi.a b1() {
        return ((c) this.O.getValue()).w();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new n(this, null, 8), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new e4b.c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
