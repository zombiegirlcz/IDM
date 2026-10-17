package com.revolut.feature.topup_screen.impl.flows.cvv.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.topup_screen.impl.flows.cvv.screen.CvvScreen;
import com.revolut.feature.topup_screen.impl.flows.cvv.screen.CvvScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import dli.c;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ove.v;
import ove.x;
import oxe.b;
import oxe.f;
import oxe.j;
import oxe.k;
import oxe.l;
import oxe.n;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/cvv/screen/CvvScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Loxe/j;", "Ldli/a;", "Loxe/l;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CvvScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CvvScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CvvScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final InputTextDelegate O;
    public final Object P;
    public final koi.h Q;
    public final Object R;

    public CvvScreen(CvvScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: oxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CvvScreen f230783b;

            {
                this.f230783b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CvvScreen cvvScreen = this.f230783b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CvvScreen.S;
                        qji.b bVarR1 = cvvScreen.z2().R1();
                        if (bVarR1 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.flows.cvv.screen.di.CvvScreenComponent.Injector");
                        }
                        v vVar = (v) ((pxe.a) bVarR1).c().mo3808a(cvvScreen);
                        CvvScreenContract$InputData cvvScreenContract$InputData = cvvScreen.K;
                        switch (vVar.f230163a) {
                            case 0:
                                cvvScreenContract$InputData.getClass();
                                vVar.d = cvvScreenContract$InputData;
                                break;
                            default:
                                cvvScreenContract$InputData.getClass();
                                vVar.d = cvvScreenContract$InputData;
                                break;
                        }
                        return (x) vVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CvvScreen.S;
                        x xVar = (x) cvvScreen.N.getValue();
                        switch (xVar.f230169a) {
                            case 0:
                                return (n) xVar.d.get();
                            default:
                                return (n) xVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CvvScreen.S;
                        CvvScreen cvvScreen2 = this.f230783b;
                        return dli.f.a(cvvScreen2, (n) cvvScreen2.P.getValue(), zhm.v.k(cvvScreen2.O, new TextDelegate()), R$id.recyclerView, new oxd.m(cvvScreen2, 1), cvvScreen2.Q, null, 32);
                }
            }
        });
        this.O = new InputTextDelegate(null);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: oxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CvvScreen f230783b;

            {
                this.f230783b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CvvScreen cvvScreen = this.f230783b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CvvScreen.S;
                        qji.b bVarR1 = cvvScreen.z2().R1();
                        if (bVarR1 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.flows.cvv.screen.di.CvvScreenComponent.Injector");
                        }
                        v vVar = (v) ((pxe.a) bVarR1).c().mo3808a(cvvScreen);
                        CvvScreenContract$InputData cvvScreenContract$InputData = cvvScreen.K;
                        switch (vVar.f230163a) {
                            case 0:
                                cvvScreenContract$InputData.getClass();
                                vVar.d = cvvScreenContract$InputData;
                                break;
                            default:
                                cvvScreenContract$InputData.getClass();
                                vVar.d = cvvScreenContract$InputData;
                                break;
                        }
                        return (x) vVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CvvScreen.S;
                        x xVar = (x) cvvScreen.N.getValue();
                        switch (xVar.f230169a) {
                            case 0:
                                return (n) xVar.d.get();
                            default:
                                return (n) xVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CvvScreen.S;
                        CvvScreen cvvScreen2 = this.f230783b;
                        return dli.f.a(cvvScreen2, (n) cvvScreen2.P.getValue(), zhm.v.k(cvvScreen2.O, new TextDelegate()), R$id.recyclerView, new oxd.m(cvvScreen2, 1), cvvScreen2.Q, null, 32);
                }
            }
        });
        this.Q = new koi.h(null, false, false, 7);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: oxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CvvScreen f230783b;

            {
                this.f230783b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CvvScreen cvvScreen = this.f230783b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CvvScreen.S;
                        qji.b bVarR1 = cvvScreen.z2().R1();
                        if (bVarR1 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.flows.cvv.screen.di.CvvScreenComponent.Injector");
                        }
                        v vVar = (v) ((pxe.a) bVarR1).c().mo3808a(cvvScreen);
                        CvvScreenContract$InputData cvvScreenContract$InputData = cvvScreen.K;
                        switch (vVar.f230163a) {
                            case 0:
                                cvvScreenContract$InputData.getClass();
                                vVar.d = cvvScreenContract$InputData;
                                break;
                            default:
                                cvvScreenContract$InputData.getClass();
                                vVar.d = cvvScreenContract$InputData;
                                break;
                        }
                        return (x) vVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CvvScreen.S;
                        x xVar = (x) cvvScreen.N.getValue();
                        switch (xVar.f230169a) {
                            case 0:
                                return (n) xVar.d.get();
                            default:
                                return (n) xVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CvvScreen.S;
                        CvvScreen cvvScreen2 = this.f230783b;
                        return dli.f.a(cvvScreen2, (n) cvvScreen2.P.getValue(), zhm.v.k(cvvScreen2.O, new TextDelegate()), R$id.recyclerView, new oxd.m(cvvScreen2, 1), cvvScreen2.Q, null, 32);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        k kVar = uiState.f230795b;
        if (kVar != null) {
            LargeActionButton largeActionButton = d3().f174564b;
            largeActionButton.setText(kVar.f230792a);
            largeActionButton.setEnabled(kVar.f230793b);
            w01.k.d(largeActionButton);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (n) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        w01.k.a(goToButton);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        Continuation continuation = null;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R.string.top_up_card_CVV_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R.string.top_up_card_CVV_title, null, null, 14), null);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new oxe.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new oxe.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new o9a.e(rd0.e.b(this.O.e.f121375b), 29), null, new f(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
