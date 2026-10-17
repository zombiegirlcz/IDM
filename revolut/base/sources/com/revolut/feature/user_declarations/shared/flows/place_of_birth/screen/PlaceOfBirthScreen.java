package com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.PlaceOfBirthScreen;
import com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.PlaceOfBirthScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.user_declarations.api.flows.place_of_birth.PlaceOfBirthFlowOutputData;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nng.p;
import no.m;
import oli.f;
import oog.b;
import oog.c;
import oog.d;
import oog.i;
import oog.j;
import te0.w;
import vc.s;
import xki.e;
import yji.o;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/place_of_birth/screen/PlaceOfBirthScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/shared/feature/user_declarations/api/flows/place_of_birth/PlaceOfBirthFlowOutputData;", "Lno/m;", "Ldli/a;", "Loog/j;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlaceOfBirthScreen extends ViewController<PlaceOfBirthFlowOutputData> implements m, dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(PlaceOfBirthScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PlaceOfBirthScreenContract$InputData K;
    public final h L;
    public final FullScreenStateDelegate M;
    public final InputTextDelegate N;
    public final int O;
    public final boolean P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public PlaceOfBirthScreen(PlaceOfBirthScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new FullScreenStateDelegate();
        this.N = new InputTextDelegate(null);
        this.O = R$layout.screen_recycler_navbar_nextbutton;
        this.P = true;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: oog.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlaceOfBirthScreen f227101b;

            {
                this.f227101b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlaceOfBirthScreen placeOfBirthScreen = this.f227101b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlaceOfBirthScreen.U;
                        o oVar = placeOfBirthScreen.f98405m;
                        no.m mVar = oVar instanceof no.m ? (no.m) oVar : null;
                        if (mVar != null) {
                            return mVar.getF94691d0();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = PlaceOfBirthScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(placeOfBirthScreen.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).f217678j;
                        PlaceOfBirthScreenContract$InputData placeOfBirthScreenContract$InputData = placeOfBirthScreen.K;
                        placeOfBirthScreenContract$InputData.getClass();
                        return new nng.m(pVar, placeOfBirthScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlaceOfBirthScreen.U;
                        return (i) ((nng.m) placeOfBirthScreen.R.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = PlaceOfBirthScreen.U;
                        PlaceOfBirthScreen placeOfBirthScreen2 = this.f227101b;
                        return dli.f.a(placeOfBirthScreen2, placeOfBirthScreen2.R2(), v.k(placeOfBirthScreen2.M, placeOfBirthScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: oog.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlaceOfBirthScreen f227101b;

            {
                this.f227101b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlaceOfBirthScreen placeOfBirthScreen = this.f227101b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlaceOfBirthScreen.U;
                        o oVar = placeOfBirthScreen.f98405m;
                        no.m mVar = oVar instanceof no.m ? (no.m) oVar : null;
                        if (mVar != null) {
                            return mVar.getF94691d0();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = PlaceOfBirthScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(placeOfBirthScreen.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).f217678j;
                        PlaceOfBirthScreenContract$InputData placeOfBirthScreenContract$InputData = placeOfBirthScreen.K;
                        placeOfBirthScreenContract$InputData.getClass();
                        return new nng.m(pVar, placeOfBirthScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlaceOfBirthScreen.U;
                        return (i) ((nng.m) placeOfBirthScreen.R.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = PlaceOfBirthScreen.U;
                        PlaceOfBirthScreen placeOfBirthScreen2 = this.f227101b;
                        return dli.f.a(placeOfBirthScreen2, placeOfBirthScreen2.R2(), v.k(placeOfBirthScreen2.M, placeOfBirthScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: oog.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlaceOfBirthScreen f227101b;

            {
                this.f227101b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlaceOfBirthScreen placeOfBirthScreen = this.f227101b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlaceOfBirthScreen.U;
                        o oVar = placeOfBirthScreen.f98405m;
                        no.m mVar = oVar instanceof no.m ? (no.m) oVar : null;
                        if (mVar != null) {
                            return mVar.getF94691d0();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = PlaceOfBirthScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(placeOfBirthScreen.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).f217678j;
                        PlaceOfBirthScreenContract$InputData placeOfBirthScreenContract$InputData = placeOfBirthScreen.K;
                        placeOfBirthScreenContract$InputData.getClass();
                        return new nng.m(pVar, placeOfBirthScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlaceOfBirthScreen.U;
                        return (i) ((nng.m) placeOfBirthScreen.R.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = PlaceOfBirthScreen.U;
                        PlaceOfBirthScreen placeOfBirthScreen2 = this.f227101b;
                        return dli.f.a(placeOfBirthScreen2, placeOfBirthScreen2.R2(), v.k(placeOfBirthScreen2.M, placeOfBirthScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: oog.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlaceOfBirthScreen f227101b;

            {
                this.f227101b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PlaceOfBirthScreen placeOfBirthScreen = this.f227101b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlaceOfBirthScreen.U;
                        o oVar = placeOfBirthScreen.f98405m;
                        no.m mVar = oVar instanceof no.m ? (no.m) oVar : null;
                        if (mVar != null) {
                            return mVar.getF94691d0();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = PlaceOfBirthScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(placeOfBirthScreen.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).f217678j;
                        PlaceOfBirthScreenContract$InputData placeOfBirthScreenContract$InputData = placeOfBirthScreen.K;
                        placeOfBirthScreenContract$InputData.getClass();
                        return new nng.m(pVar, placeOfBirthScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlaceOfBirthScreen.U;
                        return (i) ((nng.m) placeOfBirthScreen.R.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = PlaceOfBirthScreen.U;
                        PlaceOfBirthScreen placeOfBirthScreen2 = this.f227101b;
                        return dli.f.a(placeOfBirthScreen2, placeOfBirthScreen2.R2(), v.k(placeOfBirthScreen2.M, placeOfBirthScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setEnabled(uiState.f227106b);
        largeActionButton.setVisibility(uiState.f227107c ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getF94691d0() {
        return (AnalyticsProduct) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (nng.m) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        PlaceOfBirthScreenContract$InputData placeOfBirthScreenContract$InputData = this.K;
        Continuation continuation = null;
        navBarWithToolbar.setTitle(placeOfBirthScreenContract$InputData.f94671a, null);
        navBarWithToolbar.setToolbarTitle(placeOfBirthScreenContract$InputData.f94671a);
        Clause clause = placeOfBirthScreenContract$InputData.f94672b;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setNavigationButtonImage(placeOfBirthScreenContract$InputData.e);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.p0()), new f(this, continuation, 12), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new d(this, null), 3);
        InputTextDelegate inputTextDelegate = this.N;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f52575g.f121375b), new oog.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new oog.f(this, null), 3);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(placeOfBirthScreenContract$InputData.f);
        ViewController.P2(this, rd0.e.b(largeActionButton.o), new c(this, continuation, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}
