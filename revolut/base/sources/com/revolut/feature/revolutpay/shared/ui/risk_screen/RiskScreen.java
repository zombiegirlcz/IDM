package com.revolut.feature.revolutpay.shared.ui.risk_screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.revolutpay.shared.R$id;
import com.revolut.feature.revolutpay.shared.R$layout;
import com.revolut.feature.revolutpay.shared.ui.risk_screen.RiskScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import e58.d;
import eec.b;
import eec.c;
import eec.g;
import eec.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/risk_screen/RiskScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Leec/g;", "Ldli/a;", "Leec/h;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RiskScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(RiskScreen.class, "binding", "getBinding()Lcom/revolut/feature/revolutpay/shared/databinding/ScreenRiskBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;

    public RiskScreen(RiskScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_risk;
        this.L = s.t(this, b.f);
        this.M = w.y0(new d(this, inputData, 15));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: eec.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskScreen f125167b;

            {
                this.f125167b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = RiskScreen.P;
                        return (k) ((p7c.w) this.f125167b.M.getValue()).f233738c.get();
                    default:
                        KProperty[] kPropertyArr2 = RiskScreen.P;
                        RiskScreen riskScreen = this.f125167b;
                        return dli.f.a(riskScreen, (k) riskScreen.N.getValue(), m72.b.v(null, null, 7), R$id.screenRisk_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: eec.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskScreen f125167b;

            {
                this.f125167b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RiskScreen.P;
                        return (k) ((p7c.w) this.f125167b.M.getValue()).f233738c.get();
                    default:
                        KProperty[] kPropertyArr2 = RiskScreen.P;
                        RiskScreen riskScreen = this.f125167b;
                        return dli.f.a(riskScreen, (k) riskScreen.N.getValue(), m72.b.v(null, null, 7), R$id.screenRisk_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        eec.h uiState = (eec.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f296400b.setHeaderModel(uiState.f125171a);
        d3().f296401c.setMainButtonText(uiState.f125172b);
        d3().f296401c.setSecondaryButtonText(uiState.f125173c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p7c.w) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f296401c.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f296401c.o0()), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f296401c.p0()), new c(this, null, 1), 3);
    }

    public final wcc.d d3() {
        ViewBinding value = this.L.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wcc.d) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
