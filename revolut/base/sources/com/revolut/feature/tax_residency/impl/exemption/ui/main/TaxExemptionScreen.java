package com.revolut.feature.tax_residency.impl.exemption.ui.main;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.exemption.ui.main.TaxExemptionScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import efm.r;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import vge.z1;
import vne.e;
import vne.f;
import vne.g;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/exemption/ui/main/TaxExemptionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvne/e;", "Ldli/a;", "Lvne/g;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxExemptionScreen extends ViewController<e> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(TaxExemptionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object N;
    public final Object T;
    public final Object U;
    public final Object V;
    public final int K = R$layout.screen_recycler_navbar;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final InputTextDelegate O = new InputTextDelegate(null);
    public final FullScreenStateDelegate P = new FullScreenStateDelegate();
    public final RowDelegate Q = new RowDelegate(null, null, 7);
    public final TextDelegate R = new TextDelegate();
    public final SingleChoiceDelegate S = new SingleChoiceDelegate();

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public TaxExemptionScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: vne.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxExemptionScreen f290795b;

            {
                this.f290795b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TaxExemptionScreen taxExemptionScreen = this.f290795b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TaxExemptionScreen.W;
                        return (j60.a) ((lne.e) taxExemptionScreen.U.getValue()).f197231c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TaxExemptionScreen.W;
                        TaxExemptionScreen taxExemptionScreen2 = this.f290795b;
                        return dli.f.a(taxExemptionScreen2, (f) taxExemptionScreen2.V.getValue(), v.k(taxExemptionScreen2.O, taxExemptionScreen2.P, taxExemptionScreen2.Q, taxExemptionScreen2.R, new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TaxExemptionScreen.W;
                        qji.b bVarU2 = taxExemptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.exemption.ui.main.di.TaxExemptionScreenInjector");
                        lne.d dVar = (lne.d) bVarU2;
                        lne.c cVar = dVar.f197227b;
                        lne.d dVar2 = dVar.f197228c;
                        lne.e eVar = new lne.e();
                        eVar.f197229a = e4m.b.b(e4m.c.a(taxExemptionScreen));
                        eVar.f197230b = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 2, 15));
                        eVar.f197231c = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 1, 15));
                        eVar.d = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 0, 15));
                        eVar.e = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 4, 15));
                        eVar.f = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 3, 15));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr4 = TaxExemptionScreen.W;
                        return (f) ((lne.e) taxExemptionScreen.U.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: vne.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxExemptionScreen f290795b;

            {
                this.f290795b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TaxExemptionScreen taxExemptionScreen = this.f290795b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxExemptionScreen.W;
                        return (j60.a) ((lne.e) taxExemptionScreen.U.getValue()).f197231c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TaxExemptionScreen.W;
                        TaxExemptionScreen taxExemptionScreen2 = this.f290795b;
                        return dli.f.a(taxExemptionScreen2, (f) taxExemptionScreen2.V.getValue(), v.k(taxExemptionScreen2.O, taxExemptionScreen2.P, taxExemptionScreen2.Q, taxExemptionScreen2.R, new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TaxExemptionScreen.W;
                        qji.b bVarU2 = taxExemptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.exemption.ui.main.di.TaxExemptionScreenInjector");
                        lne.d dVar = (lne.d) bVarU2;
                        lne.c cVar = dVar.f197227b;
                        lne.d dVar2 = dVar.f197228c;
                        lne.e eVar = new lne.e();
                        eVar.f197229a = e4m.b.b(e4m.c.a(taxExemptionScreen));
                        eVar.f197230b = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 2, 15));
                        eVar.f197231c = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 1, 15));
                        eVar.d = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 0, 15));
                        eVar.e = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 4, 15));
                        eVar.f = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 3, 15));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr4 = TaxExemptionScreen.W;
                        return (f) ((lne.e) taxExemptionScreen.U.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: vne.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxExemptionScreen f290795b;

            {
                this.f290795b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TaxExemptionScreen taxExemptionScreen = this.f290795b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxExemptionScreen.W;
                        return (j60.a) ((lne.e) taxExemptionScreen.U.getValue()).f197231c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TaxExemptionScreen.W;
                        TaxExemptionScreen taxExemptionScreen2 = this.f290795b;
                        return dli.f.a(taxExemptionScreen2, (f) taxExemptionScreen2.V.getValue(), v.k(taxExemptionScreen2.O, taxExemptionScreen2.P, taxExemptionScreen2.Q, taxExemptionScreen2.R, new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TaxExemptionScreen.W;
                        qji.b bVarU2 = taxExemptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.exemption.ui.main.di.TaxExemptionScreenInjector");
                        lne.d dVar = (lne.d) bVarU2;
                        lne.c cVar = dVar.f197227b;
                        lne.d dVar2 = dVar.f197228c;
                        lne.e eVar = new lne.e();
                        eVar.f197229a = e4m.b.b(e4m.c.a(taxExemptionScreen));
                        eVar.f197230b = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 2, 15));
                        eVar.f197231c = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 1, 15));
                        eVar.d = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 0, 15));
                        eVar.e = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 4, 15));
                        eVar.f = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 3, 15));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr4 = TaxExemptionScreen.W;
                        return (f) ((lne.e) taxExemptionScreen.U.getValue()).f.get();
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: vne.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxExemptionScreen f290795b;

            {
                this.f290795b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TaxExemptionScreen taxExemptionScreen = this.f290795b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxExemptionScreen.W;
                        return (j60.a) ((lne.e) taxExemptionScreen.U.getValue()).f197231c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TaxExemptionScreen.W;
                        TaxExemptionScreen taxExemptionScreen2 = this.f290795b;
                        return dli.f.a(taxExemptionScreen2, (f) taxExemptionScreen2.V.getValue(), v.k(taxExemptionScreen2.O, taxExemptionScreen2.P, taxExemptionScreen2.Q, taxExemptionScreen2.R, new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TaxExemptionScreen.W;
                        qji.b bVarU2 = taxExemptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.exemption.ui.main.di.TaxExemptionScreenInjector");
                        lne.d dVar = (lne.d) bVarU2;
                        lne.c cVar = dVar.f197227b;
                        lne.d dVar2 = dVar.f197228c;
                        lne.e eVar = new lne.e();
                        eVar.f197229a = e4m.b.b(e4m.c.a(taxExemptionScreen));
                        eVar.f197230b = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 2, 15));
                        eVar.f197231c = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 1, 15));
                        eVar.d = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 0, 15));
                        eVar.e = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 4, 15));
                        eVar.f = e4m.b.b(new ld1.q(cVar, dVar2, eVar, 3, 15));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr4 = TaxExemptionScreen.W;
                        return (f) ((lne.e) taxExemptionScreen.U.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174539b.setSecondDescriptionText(uiState.f290801b);
        d3().f174539b.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (lne.e) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.tax_exemption_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ((j60.a) this.N.getValue()).d(u.c(this.S));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new z1(this, null, 8), 3);
        InputTextDelegate inputTextDelegate = this.O;
        ihm.f fVar = inputTextDelegate.f52575g.f121375b;
        ihm.f fVar2 = inputTextDelegate.i.f121375b;
        SingleChoiceDelegate singleChoiceDelegate = this.S;
        ihm.f fVarP = singleChoiceDelegate.p();
        ihm.f fVar3 = this.P.f52371h.f121375b;
        ihm.f fVarP2 = singleChoiceDelegate.p();
        RowDelegate rowDelegate = this.Q;
        r rVarMergeArray = r.mergeArray(fVar, fVar2, fVarP, fVar3, fVarP2, rowDelegate.f53220l, rowDelegate.k);
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeArray), null, new vne.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.x0()), null, new vne.b(this, null, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
