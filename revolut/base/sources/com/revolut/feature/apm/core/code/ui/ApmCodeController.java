package com.revolut.feature.apm.core.code.ui;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.code.R$id;
import com.revolut.feature.apm.core.code.R$layout;
import com.revolut.feature.apm.core.code.ui.ApmCodeController;
import com.revolut.feature.apm.core.code.ui.ApmCodeControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import hc2.k;
import jx1.b;
import jx1.c;
import jx1.f;
import jx1.g;
import jx1.i;
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

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/code/ui/ApmCodeController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljx1/g;", "Ldli/a;", "Ljx1/i;", "feature_apm_core_code_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmCodeController extends ViewController<g> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ApmCodeController.class, "binding", "getBinding()Lcom/revolut/feature/apm/core/code/databinding/ScreenApmCodeVerificationBinding;", 0))};
    public final ApmCodeControllerContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public ApmCodeController(ApmCodeControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_apm_code_verification;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: jx1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmCodeController f179041b;

            {
                this.f179041b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ApmCodeController apmCodeController = this.f179041b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ApmCodeController.S;
                        qji.b bVarU2 = apmCodeController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.code.ui.di.ApmCodeControllerInjector");
                        hc2.j jVar = (hc2.j) ((kx1.a) bVarU2).c().mo3808a(apmCodeController);
                        ApmCodeControllerContract$InputData apmCodeControllerContract$InputData = apmCodeController.K;
                        switch (jVar.f150790a) {
                            case 0:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                            case 1:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                            case 2:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                            case 3:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                            case 4:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                            default:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                        }
                        return (hc2.k) jVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = ApmCodeController.S;
                        hc2.k kVar = (hc2.k) apmCodeController.N.getValue();
                        switch (kVar.f150793a) {
                            case 0:
                                return (h) kVar.f150796g.get();
                            case 1:
                                return (h) kVar.f150796g.get();
                            case 2:
                                return (h) kVar.f150796g.get();
                            case 3:
                                return (h) kVar.f150796g.get();
                            case 4:
                                return (h) kVar.f150796g.get();
                            default:
                                return (h) kVar.f150796g.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = ApmCodeController.S;
                        ApmCodeController apmCodeController2 = this.f179041b;
                        return dli.f.a(apmCodeController2, (h) apmCodeController2.O.getValue(), v.k((TextDelegate) apmCodeController2.P.getValue(), (CodeEditorDelegate) apmCodeController2.Q.getValue()), R$id.apmCode_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: jx1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmCodeController f179041b;

            {
                this.f179041b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ApmCodeController apmCodeController = this.f179041b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmCodeController.S;
                        qji.b bVarU2 = apmCodeController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.code.ui.di.ApmCodeControllerInjector");
                        hc2.j jVar = (hc2.j) ((kx1.a) bVarU2).c().mo3808a(apmCodeController);
                        ApmCodeControllerContract$InputData apmCodeControllerContract$InputData = apmCodeController.K;
                        switch (jVar.f150790a) {
                            case 0:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                            case 1:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                            case 2:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                            case 3:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                            case 4:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                            default:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                        }
                        return (hc2.k) jVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = ApmCodeController.S;
                        hc2.k kVar = (hc2.k) apmCodeController.N.getValue();
                        switch (kVar.f150793a) {
                            case 0:
                                return (h) kVar.f150796g.get();
                            case 1:
                                return (h) kVar.f150796g.get();
                            case 2:
                                return (h) kVar.f150796g.get();
                            case 3:
                                return (h) kVar.f150796g.get();
                            case 4:
                                return (h) kVar.f150796g.get();
                            default:
                                return (h) kVar.f150796g.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = ApmCodeController.S;
                        ApmCodeController apmCodeController2 = this.f179041b;
                        return dli.f.a(apmCodeController2, (h) apmCodeController2.O.getValue(), v.k((TextDelegate) apmCodeController2.P.getValue(), (CodeEditorDelegate) apmCodeController2.Q.getValue()), R$id.apmCode_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new jsl.b(24));
        this.Q = w.y0(new jsl.b(25));
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: jx1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmCodeController f179041b;

            {
                this.f179041b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ApmCodeController apmCodeController = this.f179041b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmCodeController.S;
                        qji.b bVarU2 = apmCodeController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.code.ui.di.ApmCodeControllerInjector");
                        hc2.j jVar = (hc2.j) ((kx1.a) bVarU2).c().mo3808a(apmCodeController);
                        ApmCodeControllerContract$InputData apmCodeControllerContract$InputData = apmCodeController.K;
                        switch (jVar.f150790a) {
                            case 0:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                            case 1:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                            case 2:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                            case 3:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                            case 4:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                            default:
                                apmCodeControllerContract$InputData.getClass();
                                jVar.f150792c = apmCodeControllerContract$InputData;
                                break;
                        }
                        return (hc2.k) jVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = ApmCodeController.S;
                        hc2.k kVar = (hc2.k) apmCodeController.N.getValue();
                        switch (kVar.f150793a) {
                            case 0:
                                return (h) kVar.f150796g.get();
                            case 1:
                                return (h) kVar.f150796g.get();
                            case 2:
                                return (h) kVar.f150796g.get();
                            case 3:
                                return (h) kVar.f150796g.get();
                            case 4:
                                return (h) kVar.f150796g.get();
                            default:
                                return (h) kVar.f150796g.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = ApmCodeController.S;
                        ApmCodeController apmCodeController2 = this.f179041b;
                        return dli.f.a(apmCodeController2, (h) apmCodeController2.O.getValue(), v.k((TextDelegate) apmCodeController2.P.getValue(), (CodeEditorDelegate) apmCodeController2.Q.getValue()), R$id.apmCode_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f169328b;
        Clause clause = uiState.f179048b;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f179049c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        a aVar = (a) ((jx1.h) this.O.getValue());
        aVar.f61838q.Q();
        aVar.C2(f.f179046a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (jx1.h) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f169328b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f169328b.f59410q), null, new jkc.g(this, continuation, 23), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TextDelegate) this.P.getValue()).f53530c), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CodeEditorDelegate) this.Q.getValue()).d.f121375b), null, new jv.o(this, continuation, 6), 3);
    }

    public final ix1.a d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ix1.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
