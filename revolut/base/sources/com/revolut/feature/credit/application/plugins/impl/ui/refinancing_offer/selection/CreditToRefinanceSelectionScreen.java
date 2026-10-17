package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.n6;
import aw3.n;
import bx4.c;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.CreditToRefinanceSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.CreditToRefinanceSelectionScreenContract$InputData;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import dli.a;
import dw3.e9;
import dw3.f9;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lt.d;
import mh4.b;
import mh4.f;
import mh4.o;
import mh4.p;
import mh4.u;
import mh4.y;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_offer/selection/CreditToRefinanceSelectionScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lmh4/o;", "Ldli/a;", "Lmh4/q;", "Lbx4/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditToRefinanceSelectionScreen extends PluginScreenController<o> implements a, c {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(CreditToRefinanceSelectionScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditToRefinanceSelectionBinding;", 0))};
    public final CreditToRefinanceSelectionScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final ActionsDelegate S;
    public final FullScreenStateDelegate T;
    public final LargeActionButtonDelegate U;
    public final Object V;
    public final Object W;
    public final Object X;

    public CreditToRefinanceSelectionScreen(CreditToRefinanceSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_credit_to_refinance_selection;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: mh4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditToRefinanceSelectionScreen f205380b;

            {
                this.f205380b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen = this.f205380b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditToRefinanceSelectionScreen.Y;
                        qji.b bVarU2 = creditToRefinanceSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.di.CreditToRefinanceSelectionScreenInjector");
                        e9 e9Var = (e9) ((nh4.a) bVarU2).B().mo3808a(creditToRefinanceSelectionScreen);
                        CreditToRefinanceSelectionScreenContract$InputData creditToRefinanceSelectionScreenContract$InputData = creditToRefinanceSelectionScreen.L;
                        switch (e9Var.f118671a) {
                            case 0:
                                creditToRefinanceSelectionScreenContract$InputData.getClass();
                                e9Var.d = creditToRefinanceSelectionScreenContract$InputData;
                                break;
                            default:
                                creditToRefinanceSelectionScreenContract$InputData.getClass();
                                e9Var.d = creditToRefinanceSelectionScreenContract$InputData;
                                break;
                        }
                        return (f9) e9Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditToRefinanceSelectionScreen.Y;
                        f9 f9Var = (f9) creditToRefinanceSelectionScreen.N.getValue();
                        switch (f9Var.f118773a) {
                            case 0:
                                return (p) f9Var.f118780m.get();
                            default:
                                return (p) f9Var.f118780m.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditToRefinanceSelectionScreen.Y;
                        f9 f9Var2 = (f9) creditToRefinanceSelectionScreen.N.getValue();
                        switch (f9Var2.f118773a) {
                            case 0:
                                return (j60.a) f9Var2.e.get();
                            default:
                                return (j60.a) f9Var2.e.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = CreditToRefinanceSelectionScreen.Y;
                        return ((f9) creditToRefinanceSelectionScreen.N.getValue()).c();
                    case 4:
                        return d0.E0(zhm.v.k(creditToRefinanceSelectionScreen.S, creditToRefinanceSelectionScreen.T, creditToRefinanceSelectionScreen.U), ((cx4.b) creditToRefinanceSelectionScreen.R.getValue()).Q());
                    case 5:
                        KProperty[] kPropertyArr5 = CreditToRefinanceSelectionScreen.Y;
                        CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen2 = this.f205380b;
                        return dli.f.a(creditToRefinanceSelectionScreen2, creditToRefinanceSelectionScreen2.R2(), (List) creditToRefinanceSelectionScreen2.V.getValue(), R$id.creditToRefinanceSelection_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CreditToRefinanceSelectionScreen.Y;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) creditToRefinanceSelectionScreen.V.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: mh4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditToRefinanceSelectionScreen f205380b;

            {
                this.f205380b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen = this.f205380b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditToRefinanceSelectionScreen.Y;
                        qji.b bVarU2 = creditToRefinanceSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.di.CreditToRefinanceSelectionScreenInjector");
                        e9 e9Var = (e9) ((nh4.a) bVarU2).B().mo3808a(creditToRefinanceSelectionScreen);
                        CreditToRefinanceSelectionScreenContract$InputData creditToRefinanceSelectionScreenContract$InputData = creditToRefinanceSelectionScreen.L;
                        switch (e9Var.f118671a) {
                            case 0:
                                creditToRefinanceSelectionScreenContract$InputData.getClass();
                                e9Var.d = creditToRefinanceSelectionScreenContract$InputData;
                                break;
                            default:
                                creditToRefinanceSelectionScreenContract$InputData.getClass();
                                e9Var.d = creditToRefinanceSelectionScreenContract$InputData;
                                break;
                        }
                        return (f9) e9Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditToRefinanceSelectionScreen.Y;
                        f9 f9Var = (f9) creditToRefinanceSelectionScreen.N.getValue();
                        switch (f9Var.f118773a) {
                            case 0:
                                return (p) f9Var.f118780m.get();
                            default:
                                return (p) f9Var.f118780m.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditToRefinanceSelectionScreen.Y;
                        f9 f9Var2 = (f9) creditToRefinanceSelectionScreen.N.getValue();
                        switch (f9Var2.f118773a) {
                            case 0:
                                return (j60.a) f9Var2.e.get();
                            default:
                                return (j60.a) f9Var2.e.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = CreditToRefinanceSelectionScreen.Y;
                        return ((f9) creditToRefinanceSelectionScreen.N.getValue()).c();
                    case 4:
                        return d0.E0(zhm.v.k(creditToRefinanceSelectionScreen.S, creditToRefinanceSelectionScreen.T, creditToRefinanceSelectionScreen.U), ((cx4.b) creditToRefinanceSelectionScreen.R.getValue()).Q());
                    case 5:
                        KProperty[] kPropertyArr5 = CreditToRefinanceSelectionScreen.Y;
                        CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen2 = this.f205380b;
                        return dli.f.a(creditToRefinanceSelectionScreen2, creditToRefinanceSelectionScreen2.R2(), (List) creditToRefinanceSelectionScreen2.V.getValue(), R$id.creditToRefinanceSelection_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CreditToRefinanceSelectionScreen.Y;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) creditToRefinanceSelectionScreen.V.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: mh4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditToRefinanceSelectionScreen f205380b;

            {
                this.f205380b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen = this.f205380b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditToRefinanceSelectionScreen.Y;
                        qji.b bVarU2 = creditToRefinanceSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.di.CreditToRefinanceSelectionScreenInjector");
                        e9 e9Var = (e9) ((nh4.a) bVarU2).B().mo3808a(creditToRefinanceSelectionScreen);
                        CreditToRefinanceSelectionScreenContract$InputData creditToRefinanceSelectionScreenContract$InputData = creditToRefinanceSelectionScreen.L;
                        switch (e9Var.f118671a) {
                            case 0:
                                creditToRefinanceSelectionScreenContract$InputData.getClass();
                                e9Var.d = creditToRefinanceSelectionScreenContract$InputData;
                                break;
                            default:
                                creditToRefinanceSelectionScreenContract$InputData.getClass();
                                e9Var.d = creditToRefinanceSelectionScreenContract$InputData;
                                break;
                        }
                        return (f9) e9Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditToRefinanceSelectionScreen.Y;
                        f9 f9Var = (f9) creditToRefinanceSelectionScreen.N.getValue();
                        switch (f9Var.f118773a) {
                            case 0:
                                return (p) f9Var.f118780m.get();
                            default:
                                return (p) f9Var.f118780m.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditToRefinanceSelectionScreen.Y;
                        f9 f9Var2 = (f9) creditToRefinanceSelectionScreen.N.getValue();
                        switch (f9Var2.f118773a) {
                            case 0:
                                return (j60.a) f9Var2.e.get();
                            default:
                                return (j60.a) f9Var2.e.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = CreditToRefinanceSelectionScreen.Y;
                        return ((f9) creditToRefinanceSelectionScreen.N.getValue()).c();
                    case 4:
                        return d0.E0(zhm.v.k(creditToRefinanceSelectionScreen.S, creditToRefinanceSelectionScreen.T, creditToRefinanceSelectionScreen.U), ((cx4.b) creditToRefinanceSelectionScreen.R.getValue()).Q());
                    case 5:
                        KProperty[] kPropertyArr5 = CreditToRefinanceSelectionScreen.Y;
                        CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen2 = this.f205380b;
                        return dli.f.a(creditToRefinanceSelectionScreen2, creditToRefinanceSelectionScreen2.R2(), (List) creditToRefinanceSelectionScreen2.V.getValue(), R$id.creditToRefinanceSelection_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CreditToRefinanceSelectionScreen.Y;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) creditToRefinanceSelectionScreen.V.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: mh4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditToRefinanceSelectionScreen f205380b;

            {
                this.f205380b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen = this.f205380b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditToRefinanceSelectionScreen.Y;
                        qji.b bVarU2 = creditToRefinanceSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.di.CreditToRefinanceSelectionScreenInjector");
                        e9 e9Var = (e9) ((nh4.a) bVarU2).B().mo3808a(creditToRefinanceSelectionScreen);
                        CreditToRefinanceSelectionScreenContract$InputData creditToRefinanceSelectionScreenContract$InputData = creditToRefinanceSelectionScreen.L;
                        switch (e9Var.f118671a) {
                            case 0:
                                creditToRefinanceSelectionScreenContract$InputData.getClass();
                                e9Var.d = creditToRefinanceSelectionScreenContract$InputData;
                                break;
                            default:
                                creditToRefinanceSelectionScreenContract$InputData.getClass();
                                e9Var.d = creditToRefinanceSelectionScreenContract$InputData;
                                break;
                        }
                        return (f9) e9Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditToRefinanceSelectionScreen.Y;
                        f9 f9Var = (f9) creditToRefinanceSelectionScreen.N.getValue();
                        switch (f9Var.f118773a) {
                            case 0:
                                return (p) f9Var.f118780m.get();
                            default:
                                return (p) f9Var.f118780m.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditToRefinanceSelectionScreen.Y;
                        f9 f9Var2 = (f9) creditToRefinanceSelectionScreen.N.getValue();
                        switch (f9Var2.f118773a) {
                            case 0:
                                return (j60.a) f9Var2.e.get();
                            default:
                                return (j60.a) f9Var2.e.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = CreditToRefinanceSelectionScreen.Y;
                        return ((f9) creditToRefinanceSelectionScreen.N.getValue()).c();
                    case 4:
                        return d0.E0(zhm.v.k(creditToRefinanceSelectionScreen.S, creditToRefinanceSelectionScreen.T, creditToRefinanceSelectionScreen.U), ((cx4.b) creditToRefinanceSelectionScreen.R.getValue()).Q());
                    case 5:
                        KProperty[] kPropertyArr5 = CreditToRefinanceSelectionScreen.Y;
                        CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen2 = this.f205380b;
                        return dli.f.a(creditToRefinanceSelectionScreen2, creditToRefinanceSelectionScreen2.R2(), (List) creditToRefinanceSelectionScreen2.V.getValue(), R$id.creditToRefinanceSelection_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CreditToRefinanceSelectionScreen.Y;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) creditToRefinanceSelectionScreen.V.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        this.S = new ActionsDelegate();
        this.T = new FullScreenStateDelegate();
        this.U = new LargeActionButtonDelegate();
        final int i6 = 4;
        this.V = w.y0(new Function0(this) { // from class: mh4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditToRefinanceSelectionScreen f205380b;

            {
                this.f205380b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen = this.f205380b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditToRefinanceSelectionScreen.Y;
                        qji.b bVarU2 = creditToRefinanceSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.di.CreditToRefinanceSelectionScreenInjector");
                        e9 e9Var = (e9) ((nh4.a) bVarU2).B().mo3808a(creditToRefinanceSelectionScreen);
                        CreditToRefinanceSelectionScreenContract$InputData creditToRefinanceSelectionScreenContract$InputData = creditToRefinanceSelectionScreen.L;
                        switch (e9Var.f118671a) {
                            case 0:
                                creditToRefinanceSelectionScreenContract$InputData.getClass();
                                e9Var.d = creditToRefinanceSelectionScreenContract$InputData;
                                break;
                            default:
                                creditToRefinanceSelectionScreenContract$InputData.getClass();
                                e9Var.d = creditToRefinanceSelectionScreenContract$InputData;
                                break;
                        }
                        return (f9) e9Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditToRefinanceSelectionScreen.Y;
                        f9 f9Var = (f9) creditToRefinanceSelectionScreen.N.getValue();
                        switch (f9Var.f118773a) {
                            case 0:
                                return (p) f9Var.f118780m.get();
                            default:
                                return (p) f9Var.f118780m.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditToRefinanceSelectionScreen.Y;
                        f9 f9Var2 = (f9) creditToRefinanceSelectionScreen.N.getValue();
                        switch (f9Var2.f118773a) {
                            case 0:
                                return (j60.a) f9Var2.e.get();
                            default:
                                return (j60.a) f9Var2.e.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = CreditToRefinanceSelectionScreen.Y;
                        return ((f9) creditToRefinanceSelectionScreen.N.getValue()).c();
                    case 4:
                        return d0.E0(zhm.v.k(creditToRefinanceSelectionScreen.S, creditToRefinanceSelectionScreen.T, creditToRefinanceSelectionScreen.U), ((cx4.b) creditToRefinanceSelectionScreen.R.getValue()).Q());
                    case 5:
                        KProperty[] kPropertyArr5 = CreditToRefinanceSelectionScreen.Y;
                        CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen2 = this.f205380b;
                        return dli.f.a(creditToRefinanceSelectionScreen2, creditToRefinanceSelectionScreen2.R2(), (List) creditToRefinanceSelectionScreen2.V.getValue(), R$id.creditToRefinanceSelection_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CreditToRefinanceSelectionScreen.Y;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) creditToRefinanceSelectionScreen.V.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        final int i21 = 5;
        this.W = w.y0(new Function0(this) { // from class: mh4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditToRefinanceSelectionScreen f205380b;

            {
                this.f205380b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen = this.f205380b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditToRefinanceSelectionScreen.Y;
                        qji.b bVarU2 = creditToRefinanceSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.di.CreditToRefinanceSelectionScreenInjector");
                        e9 e9Var = (e9) ((nh4.a) bVarU2).B().mo3808a(creditToRefinanceSelectionScreen);
                        CreditToRefinanceSelectionScreenContract$InputData creditToRefinanceSelectionScreenContract$InputData = creditToRefinanceSelectionScreen.L;
                        switch (e9Var.f118671a) {
                            case 0:
                                creditToRefinanceSelectionScreenContract$InputData.getClass();
                                e9Var.d = creditToRefinanceSelectionScreenContract$InputData;
                                break;
                            default:
                                creditToRefinanceSelectionScreenContract$InputData.getClass();
                                e9Var.d = creditToRefinanceSelectionScreenContract$InputData;
                                break;
                        }
                        return (f9) e9Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditToRefinanceSelectionScreen.Y;
                        f9 f9Var = (f9) creditToRefinanceSelectionScreen.N.getValue();
                        switch (f9Var.f118773a) {
                            case 0:
                                return (p) f9Var.f118780m.get();
                            default:
                                return (p) f9Var.f118780m.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditToRefinanceSelectionScreen.Y;
                        f9 f9Var2 = (f9) creditToRefinanceSelectionScreen.N.getValue();
                        switch (f9Var2.f118773a) {
                            case 0:
                                return (j60.a) f9Var2.e.get();
                            default:
                                return (j60.a) f9Var2.e.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = CreditToRefinanceSelectionScreen.Y;
                        return ((f9) creditToRefinanceSelectionScreen.N.getValue()).c();
                    case 4:
                        return d0.E0(zhm.v.k(creditToRefinanceSelectionScreen.S, creditToRefinanceSelectionScreen.T, creditToRefinanceSelectionScreen.U), ((cx4.b) creditToRefinanceSelectionScreen.R.getValue()).Q());
                    case 5:
                        KProperty[] kPropertyArr5 = CreditToRefinanceSelectionScreen.Y;
                        CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen2 = this.f205380b;
                        return dli.f.a(creditToRefinanceSelectionScreen2, creditToRefinanceSelectionScreen2.R2(), (List) creditToRefinanceSelectionScreen2.V.getValue(), R$id.creditToRefinanceSelection_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CreditToRefinanceSelectionScreen.Y;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) creditToRefinanceSelectionScreen.V.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        final int i22 = 6;
        this.X = w.y0(new Function0(this) { // from class: mh4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditToRefinanceSelectionScreen f205380b;

            {
                this.f205380b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i22;
                CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen = this.f205380b;
                switch (i222) {
                    case 0:
                        KProperty[] kPropertyArr = CreditToRefinanceSelectionScreen.Y;
                        qji.b bVarU2 = creditToRefinanceSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.di.CreditToRefinanceSelectionScreenInjector");
                        e9 e9Var = (e9) ((nh4.a) bVarU2).B().mo3808a(creditToRefinanceSelectionScreen);
                        CreditToRefinanceSelectionScreenContract$InputData creditToRefinanceSelectionScreenContract$InputData = creditToRefinanceSelectionScreen.L;
                        switch (e9Var.f118671a) {
                            case 0:
                                creditToRefinanceSelectionScreenContract$InputData.getClass();
                                e9Var.d = creditToRefinanceSelectionScreenContract$InputData;
                                break;
                            default:
                                creditToRefinanceSelectionScreenContract$InputData.getClass();
                                e9Var.d = creditToRefinanceSelectionScreenContract$InputData;
                                break;
                        }
                        return (f9) e9Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditToRefinanceSelectionScreen.Y;
                        f9 f9Var = (f9) creditToRefinanceSelectionScreen.N.getValue();
                        switch (f9Var.f118773a) {
                            case 0:
                                return (p) f9Var.f118780m.get();
                            default:
                                return (p) f9Var.f118780m.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditToRefinanceSelectionScreen.Y;
                        f9 f9Var2 = (f9) creditToRefinanceSelectionScreen.N.getValue();
                        switch (f9Var2.f118773a) {
                            case 0:
                                return (j60.a) f9Var2.e.get();
                            default:
                                return (j60.a) f9Var2.e.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = CreditToRefinanceSelectionScreen.Y;
                        return ((f9) creditToRefinanceSelectionScreen.N.getValue()).c();
                    case 4:
                        return d0.E0(zhm.v.k(creditToRefinanceSelectionScreen.S, creditToRefinanceSelectionScreen.T, creditToRefinanceSelectionScreen.U), ((cx4.b) creditToRefinanceSelectionScreen.R.getValue()).Q());
                    case 5:
                        KProperty[] kPropertyArr5 = CreditToRefinanceSelectionScreen.Y;
                        CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen2 = this.f205380b;
                        return dli.f.a(creditToRefinanceSelectionScreen2, creditToRefinanceSelectionScreen2.R2(), (List) creditToRefinanceSelectionScreen2.V.getValue(), R$id.creditToRefinanceSelection_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CreditToRefinanceSelectionScreen.Y;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) creditToRefinanceSelectionScreen.V.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        mh4.q uiState = (mh4.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ((koi.h) this.X.getValue()).c(uiState.f205402b);
        NavBarWithToolbar creditToRefinanceSelectionNavBarWithToolbar = d3().d;
        Intrinsics.checkNotNullExpressionValue(creditToRefinanceSelectionNavBarWithToolbar, "creditToRefinanceSelectionNavBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f205403c;
        creditToRefinanceSelectionNavBarWithToolbar.setTitle(textLocalisedClause, null);
        creditToRefinanceSelectionNavBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(uiState.f205405h));
        creditToRefinanceSelectionNavBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Clause clause = uiState.d;
        creditToRefinanceSelectionNavBarWithToolbar.setSecondDescriptionText(clause);
        creditToRefinanceSelectionNavBarWithToolbar.setSecondDescriptionVisible(clause != null);
        n6 n6Var = new n6(uiState.e, LargeActionButton.ButtonStyle.f58725a, null, null, uiState.f205404g, null, null, 988);
        ActionFooterView actionFooterView = d3().f10707b;
        Clause clause2 = uiState.f;
        actionFooterView.setModel(clause2 != null ? new aw0.h(false, n6Var, new n6(clause2, LargeActionButton.ButtonStyle.o, null, null, false, null, null, 1020), null, null, null, 121) : new e(false, null, null, n6Var, null, null, 55));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        y yVar = (y) R2();
        yVar.getClass();
        yVar.n2(new u(yVar, null, 0), new whi.b(6));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f9) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar creditToRefinanceSelectionNavBarWithToolbar = d3().d;
        Intrinsics.checkNotNullExpressionValue(creditToRefinanceSelectionNavBarWithToolbar, "creditToRefinanceSelectionNavBarWithToolbar");
        creditToRefinanceSelectionNavBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        creditToRefinanceSelectionNavBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        creditToRefinanceSelectionNavBarWithToolbar.setDescriptionVisible(false);
        creditToRefinanceSelectionNavBarWithToolbar.setEnabled(false);
        AsyncDiffRecyclerView creditToRefinanceSelectionBottomRecyclerView = d3().f10708c;
        Intrinsics.checkNotNullExpressionValue(creditToRefinanceSelectionBottomRecyclerView, "creditToRefinanceSelectionBottomRecyclerView");
        yp0.y.h(creditToRefinanceSelectionBottomRecyclerView, (koi.h) this.X.getValue(), new LinearLayoutManager(creditToRefinanceSelectionBottomRecyclerView.getContext()));
        ((j60.a) this.Q.getValue()).d(zhm.u.c(this.U));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar creditToRefinanceSelectionNavBarWithToolbar = d3().d;
        Intrinsics.checkNotNullExpressionValue(creditToRefinanceSelectionNavBarWithToolbar, "creditToRefinanceSelectionNavBarWithToolbar");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(creditToRefinanceSelectionNavBarWithToolbar.f59410q), null, new f(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, new d(rd0.e.b(creditToRefinanceSelectionNavBarWithToolbar.x0()), 15), null, new mh4.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f10707b.f), null, new f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f10707b.f58955g), null, new f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f52371h.f121375b), null, new mh4.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new d(rd0.e.b(this.U.d.f121375b), 14), null, new mh4.e(this, continuation, 0), 3);
    }

    public final n d3() {
        ViewBinding value = this.P.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final p d() {
        return (p) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }
}
