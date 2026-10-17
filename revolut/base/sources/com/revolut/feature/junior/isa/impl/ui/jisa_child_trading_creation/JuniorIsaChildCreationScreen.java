package com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.JuniorIsaChildCreationScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.JuniorIsaChildCreationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import n8i.e;
import na8.b;
import na8.c;
import na8.d;
import na8.f;
import na8.g;
import na8.m;
import na8.n;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/jisa_child_trading_creation/JuniorIsaChildCreationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lna8/o;", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorIsaChildCreationScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(JuniorIsaChildCreationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final JuniorIsaChildCreationScreenContract$InputData K;
    public final int L;
    public final h M;
    public final InputTextDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public JuniorIsaChildCreationScreen(JuniorIsaChildCreationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new InputTextDelegate(new e(this, 2));
        this.O = new FullScreenStateDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: na8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaChildCreationScreen f213821b;

            {
                this.f213821b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorIsaChildCreationScreen juniorIsaChildCreationScreen = this.f213821b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaChildCreationScreen.S;
                        JuniorIsaChildCreationScreen juniorIsaChildCreationScreen2 = this.f213821b;
                        return dli.f.a(juniorIsaChildCreationScreen2, juniorIsaChildCreationScreen2.d(), v.k(new CellDetailsLoadingDelegate(), juniorIsaChildCreationScreen2.N, juniorIsaChildCreationScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaChildCreationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaChildCreationScreen.m2()).a().get(x98.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x98.o.class, " is not found"));
                        }
                        x98.o oVar = ((x98.o) aVar2.b()).f303638q;
                        JuniorIsaChildCreationScreenContract$InputData juniorIsaChildCreationScreenContract$InputData = juniorIsaChildCreationScreen.K;
                        juniorIsaChildCreationScreenContract$InputData.getClass();
                        return new x98.g(oVar, juniorIsaChildCreationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaChildCreationScreen.S;
                        return (n) ((x98.g) juniorIsaChildCreationScreen.Q.getValue()).f303615b.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: na8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaChildCreationScreen f213821b;

            {
                this.f213821b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorIsaChildCreationScreen juniorIsaChildCreationScreen = this.f213821b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaChildCreationScreen.S;
                        JuniorIsaChildCreationScreen juniorIsaChildCreationScreen2 = this.f213821b;
                        return dli.f.a(juniorIsaChildCreationScreen2, juniorIsaChildCreationScreen2.d(), v.k(new CellDetailsLoadingDelegate(), juniorIsaChildCreationScreen2.N, juniorIsaChildCreationScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaChildCreationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaChildCreationScreen.m2()).a().get(x98.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x98.o.class, " is not found"));
                        }
                        x98.o oVar = ((x98.o) aVar2.b()).f303638q;
                        JuniorIsaChildCreationScreenContract$InputData juniorIsaChildCreationScreenContract$InputData = juniorIsaChildCreationScreen.K;
                        juniorIsaChildCreationScreenContract$InputData.getClass();
                        return new x98.g(oVar, juniorIsaChildCreationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaChildCreationScreen.S;
                        return (n) ((x98.g) juniorIsaChildCreationScreen.Q.getValue()).f303615b.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: na8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaChildCreationScreen f213821b;

            {
                this.f213821b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorIsaChildCreationScreen juniorIsaChildCreationScreen = this.f213821b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaChildCreationScreen.S;
                        JuniorIsaChildCreationScreen juniorIsaChildCreationScreen2 = this.f213821b;
                        return dli.f.a(juniorIsaChildCreationScreen2, juniorIsaChildCreationScreen2.d(), v.k(new CellDetailsLoadingDelegate(), juniorIsaChildCreationScreen2.N, juniorIsaChildCreationScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaChildCreationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaChildCreationScreen.m2()).a().get(x98.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x98.o.class, " is not found"));
                        }
                        x98.o oVar = ((x98.o) aVar2.b()).f303638q;
                        JuniorIsaChildCreationScreenContract$InputData juniorIsaChildCreationScreenContract$InputData = juniorIsaChildCreationScreen.K;
                        juniorIsaChildCreationScreenContract$InputData.getClass();
                        return new x98.g(oVar, juniorIsaChildCreationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaChildCreationScreen.S;
                        return (n) ((x98.g) juniorIsaChildCreationScreen.Q.getValue()).f303615b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        na8.o uiState = (na8.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = d3().f174564b;
        g gVar = uiState.f213839c;
        largeActionButton.setText(gVar.f213822a);
        largeActionButton.setEnabled(gVar.f213823b);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        m mVar = uiState.f213838b;
        TextLocalisedClause textLocalisedClause = mVar.f213835a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        Clause clause = mVar.f213836b;
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x98.g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setLoadingButtonTag("CONTINUE_BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, continuation, 1), 3);
        InputTextDelegate inputTextDelegate = this.N;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f52575g.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new na8.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new f(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
