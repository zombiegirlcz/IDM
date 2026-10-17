package com.revolut.feature.junior.isa.impl.ui.child_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior.isa.impl.R$string;
import com.revolut.feature.junior.isa.impl.ui.child_details.JuniorIsaChildDetailsScreen;
import com.revolut.feature.junior.isa.impl.ui.child_details.JuniorIsaChildDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import fa8.b;
import fa8.c;
import fa8.d;
import fa8.g;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import x98.o;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/child_details/JuniorIsaChildDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lfa8/h;", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorIsaChildDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(JuniorIsaChildDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final JuniorIsaChildDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final InputTextDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public JuniorIsaChildDetailsScreen(JuniorIsaChildDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new InputTextDelegate(null);
        this.O = new FullScreenStateDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: fa8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaChildDetailsScreen f133249b;

            {
                this.f133249b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorIsaChildDetailsScreen juniorIsaChildDetailsScreen = this.f133249b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaChildDetailsScreen.S;
                        JuniorIsaChildDetailsScreen juniorIsaChildDetailsScreen2 = this.f133249b;
                        return dli.f.a(juniorIsaChildDetailsScreen2, juniorIsaChildDetailsScreen2.d(), v.k(juniorIsaChildDetailsScreen2.N, new RowLoadingDelegate(), juniorIsaChildDetailsScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaChildDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaChildDetailsScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f303638q;
                        JuniorIsaChildDetailsScreenContract$InputData juniorIsaChildDetailsScreenContract$InputData = juniorIsaChildDetailsScreen.K;
                        juniorIsaChildDetailsScreenContract$InputData.getClass();
                        return new x98.h(oVar, juniorIsaChildDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaChildDetailsScreen.S;
                        return (g) ((x98.h) juniorIsaChildDetailsScreen.Q.getValue()).f303617b.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: fa8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaChildDetailsScreen f133249b;

            {
                this.f133249b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorIsaChildDetailsScreen juniorIsaChildDetailsScreen = this.f133249b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaChildDetailsScreen.S;
                        JuniorIsaChildDetailsScreen juniorIsaChildDetailsScreen2 = this.f133249b;
                        return dli.f.a(juniorIsaChildDetailsScreen2, juniorIsaChildDetailsScreen2.d(), v.k(juniorIsaChildDetailsScreen2.N, new RowLoadingDelegate(), juniorIsaChildDetailsScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaChildDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaChildDetailsScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f303638q;
                        JuniorIsaChildDetailsScreenContract$InputData juniorIsaChildDetailsScreenContract$InputData = juniorIsaChildDetailsScreen.K;
                        juniorIsaChildDetailsScreenContract$InputData.getClass();
                        return new x98.h(oVar, juniorIsaChildDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaChildDetailsScreen.S;
                        return (g) ((x98.h) juniorIsaChildDetailsScreen.Q.getValue()).f303617b.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: fa8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaChildDetailsScreen f133249b;

            {
                this.f133249b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorIsaChildDetailsScreen juniorIsaChildDetailsScreen = this.f133249b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaChildDetailsScreen.S;
                        JuniorIsaChildDetailsScreen juniorIsaChildDetailsScreen2 = this.f133249b;
                        return dli.f.a(juniorIsaChildDetailsScreen2, juniorIsaChildDetailsScreen2.d(), v.k(juniorIsaChildDetailsScreen2.N, new RowLoadingDelegate(), juniorIsaChildDetailsScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaChildDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaChildDetailsScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f303638q;
                        JuniorIsaChildDetailsScreenContract$InputData juniorIsaChildDetailsScreenContract$InputData = juniorIsaChildDetailsScreen.K;
                        juniorIsaChildDetailsScreenContract$InputData.getClass();
                        return new x98.h(oVar, juniorIsaChildDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaChildDetailsScreen.S;
                        return (g) ((x98.h) juniorIsaChildDetailsScreen.Q.getValue()).f303617b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        fa8.h uiState = (fa8.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.f133254b ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x98.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.junior_trading_child_details_review_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.junior_trading_child_details_review_header_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.junior_trading_child_details_review_header_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setLoadingButtonTag("CONFIRM_BUTTON_LOADING_TAG");
        largeActionButton.setText(new TextLocalisedClause(R$string.junior_trading_child_details_review_cta_confirm_details, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52575g.f121375b), new fa8.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
