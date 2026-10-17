package com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import efm.r;
import java.util.concurrent.TimeUnit;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lf9.u;
import te0.w;
import tx0.j0;
import vc.s;
import wp5.y;
import xki.e;
import ye1.m;
import yfe.b2;
import yg9.d;
import yg9.f;
import yg9.g;
import yg9.i;
import yg9.j;
import yg9.l;
import yg9.n;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/subform/SubformScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyg9/l;", "Ldli/a;", "Lyg9/n;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubformScreen extends ViewController<l> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(SubformScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final SubformScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public SubformScreen(SubformScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, yg9.b.f);
        this.N = w.y0(new b2(12));
        this.O = w.y0(new b2(13));
        this.P = w.y0(new b2(14));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: yg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubformScreen f313578b;

            {
                this.f313578b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SubformScreen subformScreen = this.f313578b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SubformScreen.V;
                        qd0.b bVarN = ((u) subformScreen.T.getValue()).f194801b.f194734b.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = SubformScreen.V;
                        return new InputTextDelegate(new y8a.g(subformScreen, 26));
                    case 2:
                        KProperty[] kPropertyArr3 = SubformScreen.V;
                        SubformScreen subformScreen2 = this.f313578b;
                        return dli.f.a(subformScreen2, subformScreen2.d(), v.k((RowDelegate) subformScreen2.N.getValue(), (InputTextDelegate) subformScreen2.R.getValue(), (ListSubheaderDelegate) subformScreen2.O.getValue(), (InputChecklistDelegate) subformScreen2.P.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = SubformScreen.V;
                        qji.b bVarU2 = subformScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.di.SubformScreenInjector");
                        lf9.h hVar = (lf9.h) bVarU2;
                        lf9.m mVar = hVar.f194717b;
                        lf9.h hVar2 = hVar.f194718c;
                        SubformScreenContract$InputData subformScreenContract$InputData = subformScreen.K;
                        subformScreenContract$InputData.getClass();
                        return new u(mVar, hVar2, subformScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = SubformScreen.V;
                        return (m) ((u) subformScreen.T.getValue()).i.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: yg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubformScreen f313578b;

            {
                this.f313578b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SubformScreen subformScreen = this.f313578b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SubformScreen.V;
                        qd0.b bVarN = ((u) subformScreen.T.getValue()).f194801b.f194734b.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = SubformScreen.V;
                        return new InputTextDelegate(new y8a.g(subformScreen, 26));
                    case 2:
                        KProperty[] kPropertyArr3 = SubformScreen.V;
                        SubformScreen subformScreen2 = this.f313578b;
                        return dli.f.a(subformScreen2, subformScreen2.d(), v.k((RowDelegate) subformScreen2.N.getValue(), (InputTextDelegate) subformScreen2.R.getValue(), (ListSubheaderDelegate) subformScreen2.O.getValue(), (InputChecklistDelegate) subformScreen2.P.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = SubformScreen.V;
                        qji.b bVarU2 = subformScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.di.SubformScreenInjector");
                        lf9.h hVar = (lf9.h) bVarU2;
                        lf9.m mVar = hVar.f194717b;
                        lf9.h hVar2 = hVar.f194718c;
                        SubformScreenContract$InputData subformScreenContract$InputData = subformScreen.K;
                        subformScreenContract$InputData.getClass();
                        return new u(mVar, hVar2, subformScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = SubformScreen.V;
                        return (m) ((u) subformScreen.T.getValue()).i.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: yg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubformScreen f313578b;

            {
                this.f313578b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SubformScreen subformScreen = this.f313578b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SubformScreen.V;
                        qd0.b bVarN = ((u) subformScreen.T.getValue()).f194801b.f194734b.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = SubformScreen.V;
                        return new InputTextDelegate(new y8a.g(subformScreen, 26));
                    case 2:
                        KProperty[] kPropertyArr3 = SubformScreen.V;
                        SubformScreen subformScreen2 = this.f313578b;
                        return dli.f.a(subformScreen2, subformScreen2.d(), v.k((RowDelegate) subformScreen2.N.getValue(), (InputTextDelegate) subformScreen2.R.getValue(), (ListSubheaderDelegate) subformScreen2.O.getValue(), (InputChecklistDelegate) subformScreen2.P.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = SubformScreen.V;
                        qji.b bVarU2 = subformScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.di.SubformScreenInjector");
                        lf9.h hVar = (lf9.h) bVarU2;
                        lf9.m mVar = hVar.f194717b;
                        lf9.h hVar2 = hVar.f194718c;
                        SubformScreenContract$InputData subformScreenContract$InputData = subformScreen.K;
                        subformScreenContract$InputData.getClass();
                        return new u(mVar, hVar2, subformScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = SubformScreen.V;
                        return (m) ((u) subformScreen.T.getValue()).i.get();
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: yg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubformScreen f313578b;

            {
                this.f313578b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                SubformScreen subformScreen = this.f313578b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SubformScreen.V;
                        qd0.b bVarN = ((u) subformScreen.T.getValue()).f194801b.f194734b.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = SubformScreen.V;
                        return new InputTextDelegate(new y8a.g(subformScreen, 26));
                    case 2:
                        KProperty[] kPropertyArr3 = SubformScreen.V;
                        SubformScreen subformScreen2 = this.f313578b;
                        return dli.f.a(subformScreen2, subformScreen2.d(), v.k((RowDelegate) subformScreen2.N.getValue(), (InputTextDelegate) subformScreen2.R.getValue(), (ListSubheaderDelegate) subformScreen2.O.getValue(), (InputChecklistDelegate) subformScreen2.P.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = SubformScreen.V;
                        qji.b bVarU2 = subformScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.di.SubformScreenInjector");
                        lf9.h hVar = (lf9.h) bVarU2;
                        lf9.m mVar = hVar.f194717b;
                        lf9.h hVar2 = hVar.f194718c;
                        SubformScreenContract$InputData subformScreenContract$InputData = subformScreen.K;
                        subformScreenContract$InputData.getClass();
                        return new u(mVar, hVar2, subformScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = SubformScreen.V;
                        return (m) ((u) subformScreen.T.getValue()).i.get();
                }
            }
        });
        final int i6 = 4;
        this.U = w.y0(new Function0(this) { // from class: yg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubformScreen f313578b;

            {
                this.f313578b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                SubformScreen subformScreen = this.f313578b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SubformScreen.V;
                        qd0.b bVarN = ((u) subformScreen.T.getValue()).f194801b.f194734b.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = SubformScreen.V;
                        return new InputTextDelegate(new y8a.g(subformScreen, 26));
                    case 2:
                        KProperty[] kPropertyArr3 = SubformScreen.V;
                        SubformScreen subformScreen2 = this.f313578b;
                        return dli.f.a(subformScreen2, subformScreen2.d(), v.k((RowDelegate) subformScreen2.N.getValue(), (InputTextDelegate) subformScreen2.R.getValue(), (ListSubheaderDelegate) subformScreen2.O.getValue(), (InputChecklistDelegate) subformScreen2.P.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = SubformScreen.V;
                        qji.b bVarU2 = subformScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.di.SubformScreenInjector");
                        lf9.h hVar = (lf9.h) bVarU2;
                        lf9.m mVar = hVar.f194717b;
                        lf9.h hVar2 = hVar.f194718c;
                        SubformScreenContract$InputData subformScreenContract$InputData = subformScreen.K;
                        subformScreenContract$InputData.getClass();
                        return new u(mVar, hVar2, subformScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = SubformScreen.V;
                        return (m) ((u) subformScreen.T.getValue()).i.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        Clause clause = uiState.f313588b;
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setMenuItems(uiState.d);
        d3().f174533b.setModel(uiState.f313589c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        SubformScreenContract$InputData subformScreenContract$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(subformScreenContract$InputData.e);
        navBarWithToolbar.setTitle(subformScreenContract$InputData.e, null);
    }

    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.o.f57403b), null, new f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.x0()), null, new f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.e), null, new f(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), null, new g(this, null), 3);
        ?? r72 = this.R;
        com.revolut.kompot.navigable.a.g2(this, y.x(((InputTextDelegate) r72.getValue()).f52575g.f121375b, ((InputTextDelegate) r72.getValue()).f52577j.f121375b, "mergeWith(...)"), null, new yg9.h(this, null), 3);
        r rVarFilter = ((InputTextDelegate) r72.getValue()).e.f121375b.debounce(400L, TimeUnit.MILLISECONDS).filter(new ya6.f(new m(21), 21));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputChecklistDelegate) this.P.getValue()).f52518c), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new d(this, continuation, 0), 3);
        r rVarFilter2 = ((ListSubheaderDelegate) this.O.getValue()).f52707c.filter(new ya6.f(new m(20), 20));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter2), null, new yg9.e(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final yg9.m d() {
        return (yg9.m) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
