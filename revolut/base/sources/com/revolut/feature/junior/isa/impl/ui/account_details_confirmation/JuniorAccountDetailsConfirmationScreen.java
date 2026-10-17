package com.revolut.feature.junior.isa.impl.ui.account_details_confirmation;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior.isa.impl.R$string;
import com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.JuniorAccountDetailsConfirmationScreen;
import com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.JuniorAccountDetailsConfirmationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import da8.b;
import da8.c;
import da8.d;
import da8.f;
import da8.i;
import da8.j;
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
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/account_details_confirmation/JuniorAccountDetailsConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lda8/j;", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorAccountDetailsConfirmationScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(JuniorAccountDetailsConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final JuniorAccountDetailsConfirmationScreenContract$InputData K;
    public final int L;
    public final h M;
    public final CellDetailsDelegate N;
    public final FooterTextDelegate O;
    public final TextDelegate P;
    public final SelectableDelegate Q;
    public final FullScreenStateDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;

    public JuniorAccountDetailsConfirmationScreen(JuniorAccountDetailsConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new CellDetailsDelegate();
        this.O = new FooterTextDelegate();
        TextDelegate textDelegate = new TextDelegate();
        this.P = textDelegate;
        this.Q = new SelectableDelegate(textDelegate);
        this.R = new FullScreenStateDelegate();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: da8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAccountDetailsConfirmationScreen f112474b;

            {
                this.f112474b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorAccountDetailsConfirmationScreen juniorAccountDetailsConfirmationScreen = this.f112474b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAccountDetailsConfirmationScreen.V;
                        JuniorAccountDetailsConfirmationScreen juniorAccountDetailsConfirmationScreen2 = this.f112474b;
                        return dli.f.a(juniorAccountDetailsConfirmationScreen2, juniorAccountDetailsConfirmationScreen2.d(), v.k(new CellDetailsLoadingDelegate(), juniorAccountDetailsConfirmationScreen2.N, juniorAccountDetailsConfirmationScreen2.O, juniorAccountDetailsConfirmationScreen2.Q, juniorAccountDetailsConfirmationScreen2.P, juniorAccountDetailsConfirmationScreen2.R), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAccountDetailsConfirmationScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAccountDetailsConfirmationScreen.m2()).a().get(x98.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x98.o.class, " is not found"));
                        }
                        x98.o oVar = ((x98.o) aVar2.b()).f303638q;
                        JuniorAccountDetailsConfirmationScreenContract$InputData juniorAccountDetailsConfirmationScreenContract$InputData = juniorAccountDetailsConfirmationScreen.K;
                        juniorAccountDetailsConfirmationScreenContract$InputData.getClass();
                        return new x98.e(oVar, juniorAccountDetailsConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorAccountDetailsConfirmationScreen.V;
                        return (i) ((x98.e) juniorAccountDetailsConfirmationScreen.T.getValue()).f303611b.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: da8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAccountDetailsConfirmationScreen f112474b;

            {
                this.f112474b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorAccountDetailsConfirmationScreen juniorAccountDetailsConfirmationScreen = this.f112474b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAccountDetailsConfirmationScreen.V;
                        JuniorAccountDetailsConfirmationScreen juniorAccountDetailsConfirmationScreen2 = this.f112474b;
                        return dli.f.a(juniorAccountDetailsConfirmationScreen2, juniorAccountDetailsConfirmationScreen2.d(), v.k(new CellDetailsLoadingDelegate(), juniorAccountDetailsConfirmationScreen2.N, juniorAccountDetailsConfirmationScreen2.O, juniorAccountDetailsConfirmationScreen2.Q, juniorAccountDetailsConfirmationScreen2.P, juniorAccountDetailsConfirmationScreen2.R), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAccountDetailsConfirmationScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAccountDetailsConfirmationScreen.m2()).a().get(x98.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x98.o.class, " is not found"));
                        }
                        x98.o oVar = ((x98.o) aVar2.b()).f303638q;
                        JuniorAccountDetailsConfirmationScreenContract$InputData juniorAccountDetailsConfirmationScreenContract$InputData = juniorAccountDetailsConfirmationScreen.K;
                        juniorAccountDetailsConfirmationScreenContract$InputData.getClass();
                        return new x98.e(oVar, juniorAccountDetailsConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorAccountDetailsConfirmationScreen.V;
                        return (i) ((x98.e) juniorAccountDetailsConfirmationScreen.T.getValue()).f303611b.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: da8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAccountDetailsConfirmationScreen f112474b;

            {
                this.f112474b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorAccountDetailsConfirmationScreen juniorAccountDetailsConfirmationScreen = this.f112474b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAccountDetailsConfirmationScreen.V;
                        JuniorAccountDetailsConfirmationScreen juniorAccountDetailsConfirmationScreen2 = this.f112474b;
                        return dli.f.a(juniorAccountDetailsConfirmationScreen2, juniorAccountDetailsConfirmationScreen2.d(), v.k(new CellDetailsLoadingDelegate(), juniorAccountDetailsConfirmationScreen2.N, juniorAccountDetailsConfirmationScreen2.O, juniorAccountDetailsConfirmationScreen2.Q, juniorAccountDetailsConfirmationScreen2.P, juniorAccountDetailsConfirmationScreen2.R), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAccountDetailsConfirmationScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAccountDetailsConfirmationScreen.m2()).a().get(x98.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x98.o.class, " is not found"));
                        }
                        x98.o oVar = ((x98.o) aVar2.b()).f303638q;
                        JuniorAccountDetailsConfirmationScreenContract$InputData juniorAccountDetailsConfirmationScreenContract$InputData = juniorAccountDetailsConfirmationScreen.K;
                        juniorAccountDetailsConfirmationScreenContract$InputData.getClass();
                        return new x98.e(oVar, juniorAccountDetailsConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorAccountDetailsConfirmationScreen.V;
                        return (i) ((x98.e) juniorAccountDetailsConfirmationScreen.T.getValue()).f303611b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f112482b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x98.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.junior_signup_details_confirmation_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.junior_signup_details_confirmation_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.rev_u18_signup_details_confirmation_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setLoadingButtonTag("CONTINUE_BUTTON_LOADING_TAG");
        largeActionButton.setText(new TextLocalisedClause(R$string.junior_signup_details_confirmation_action_create_account, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.O.e.f121375b), new d8j.c(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(this.Q.r()), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new da8.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.e), new f(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
