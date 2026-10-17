package com.revolut.feature.kyc.impl.cmd.screen;

import android.view.View;
import android.webkit.WebViewClient;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.cmd.screen.CmdController;
import com.revolut.feature.kyc.impl.cmd.screen.CmdControllerContract$InputData;
import com.revolut.feature.kyc.shared.R$layout;
import com.revolut.feature.kyc.shared.web_kyc.view.WebPortalLoadingView;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qu8.b;
import qu8.c;
import qu8.j;
import qu8.k;
import vc.s;
import xki.e;
import zhm.u;
import zu8.c0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/cmd/screen/CmdController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqu8/j;", "Lcli/w;", "Lqu8/k;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CmdController extends ViewController<j> implements w {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CmdController.class, "binding", "getBinding()Lcom/revolut/feature/kyc/shared/databinding/ScreenWebKycBinding;", 0))};
    public final CmdControllerContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final int O;
    public final Object P;
    public final h Q;
    public final Object R;

    public CmdController(CmdControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: qu8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CmdController f249262b;

            {
                this.f249262b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CmdController cmdController = this.f249262b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CmdController.S;
                        qji.b bVarU2 = cmdController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.cmd.screen.di.CmdControllerComponentInjector");
                        }
                        zu8.f fVar = (zu8.f) bVarU2;
                        c0 c0Var = fVar.f325270b;
                        zu8.f fVar2 = fVar.f325271c;
                        CmdControllerContract$InputData cmdControllerContract$InputData = cmdController.K;
                        cmdControllerContract$InputData.getClass();
                        return new zu8.e(c0Var, fVar2, cmdControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CmdController.S;
                        return (e) ((zu8.e) cmdController.L.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CmdController.S;
                        return n14.e.a(cmdController, (e) cmdController.M.getValue());
                    default:
                        KProperty[] kPropertyArr4 = CmdController.S;
                        zu8.e eVar = (zu8.e) cmdController.L.getValue();
                        eVar.getClass();
                        return new ay8.a((yx8.a) eVar.f325263c.get(), (dy8.a) eVar.f.get());
                }
            }
        });
        final int i2 = 1;
        this.M = te0.w.y0(new Function0(this) { // from class: qu8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CmdController f249262b;

            {
                this.f249262b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CmdController cmdController = this.f249262b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CmdController.S;
                        qji.b bVarU2 = cmdController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.cmd.screen.di.CmdControllerComponentInjector");
                        }
                        zu8.f fVar = (zu8.f) bVarU2;
                        c0 c0Var = fVar.f325270b;
                        zu8.f fVar2 = fVar.f325271c;
                        CmdControllerContract$InputData cmdControllerContract$InputData = cmdController.K;
                        cmdControllerContract$InputData.getClass();
                        return new zu8.e(c0Var, fVar2, cmdControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CmdController.S;
                        return (e) ((zu8.e) cmdController.L.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CmdController.S;
                        return n14.e.a(cmdController, (e) cmdController.M.getValue());
                    default:
                        KProperty[] kPropertyArr4 = CmdController.S;
                        zu8.e eVar = (zu8.e) cmdController.L.getValue();
                        eVar.getClass();
                        return new ay8.a((yx8.a) eVar.f325263c.get(), (dy8.a) eVar.f.get());
                }
            }
        });
        this.N = R$layout.screen_web_kyc;
        this.O = R$style.UiKitTheme_Day;
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: qu8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CmdController f249262b;

            {
                this.f249262b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CmdController cmdController = this.f249262b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CmdController.S;
                        qji.b bVarU2 = cmdController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.cmd.screen.di.CmdControllerComponentInjector");
                        }
                        zu8.f fVar = (zu8.f) bVarU2;
                        c0 c0Var = fVar.f325270b;
                        zu8.f fVar2 = fVar.f325271c;
                        CmdControllerContract$InputData cmdControllerContract$InputData = cmdController.K;
                        cmdControllerContract$InputData.getClass();
                        return new zu8.e(c0Var, fVar2, cmdControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CmdController.S;
                        return (e) ((zu8.e) cmdController.L.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CmdController.S;
                        return n14.e.a(cmdController, (e) cmdController.M.getValue());
                    default:
                        KProperty[] kPropertyArr4 = CmdController.S;
                        zu8.e eVar = (zu8.e) cmdController.L.getValue();
                        eVar.getClass();
                        return new ay8.a((yx8.a) eVar.f325263c.get(), (dy8.a) eVar.f.get());
                }
            }
        });
        this.Q = s.t(this, b.f);
        final int i5 = 3;
        this.R = te0.w.y0(new Function0(this) { // from class: qu8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CmdController f249262b;

            {
                this.f249262b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CmdController cmdController = this.f249262b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CmdController.S;
                        qji.b bVarU2 = cmdController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.kyc.impl.cmd.screen.di.CmdControllerComponentInjector");
                        }
                        zu8.f fVar = (zu8.f) bVarU2;
                        c0 c0Var = fVar.f325270b;
                        zu8.f fVar2 = fVar.f325271c;
                        CmdControllerContract$InputData cmdControllerContract$InputData = cmdController.K;
                        cmdControllerContract$InputData.getClass();
                        return new zu8.e(c0Var, fVar2, cmdControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CmdController.S;
                        return (e) ((zu8.e) cmdController.L.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CmdController.S;
                        return n14.e.a(cmdController, (e) cmdController.M.getValue());
                    default:
                        KProperty[] kPropertyArr4 = CmdController.S;
                        zu8.e eVar = (zu8.e) cmdController.L.getValue();
                        eVar.getClass();
                        return new ay8.a((yx8.a) eVar.f325263c.get(), (dy8.a) eVar.f.get());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getK() {
        return Integer.valueOf(this.O);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f292848b.i0(uiState.f249269a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (zu8.e) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (qu8.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        WebPortalLoadingView webPortalLoadingView = d3().f292848b;
        webPortalLoadingView.setWebViewClient((WebViewClient) this.R.getValue());
        webPortalLoadingView.g0(this.K.f77611a);
        webPortalLoadingView.setNavbarBackNavigationButtonVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.web_content_loader, u.c(new TextLocalisedClause(R$string.verify_identity_prompt_title, null, null, 14)), null, 12));
        a.g2(this, d3().f292848b.f77907n, null, new c(this, null, 0), 3);
        a.g2(this, d3().f292848b.h0(), null, new c(this, null, 1), 3);
    }

    public final vx8.a d3() {
        ViewBinding value = this.Q.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (vx8.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }
}
