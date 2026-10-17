package com.revolut.sso.impl.ui.consent.common.consent_screen;

import aj0.o;
import aml.b;
import aml.c;
import aml.g;
import aml.j;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.timer.TimerDelegate;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.consent.common.consent_screen.ConsentScreen;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.e1;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/sso/impl/ui/consent/common/consent_screen/ConsentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laml/g;", "Ldli/a;", "Laml/h;", "Lin0/g;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsentScreen extends ViewController<g> implements a, in0.g {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ConsentScreen.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenSsoConsentBinding;", 0))};
    public final Object K;
    public final h L;
    public final int M;
    public final boolean N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public ConsentScreen(ConsentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new o(26));
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_sso_consent;
        this.N = true;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: aml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentScreen f6477b;

            {
                this.f6477b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentScreen.R;
                        ConsentScreen consentScreen = this.f6477b;
                        return dli.f.a(consentScreen, (j) consentScreen.Q.getValue(), v.k(new TimerDelegate(), new CellDetailsDelegate(), new RowDelegate(null, null, 7), (ErrorDelegate) consentScreen.K.getValue(), new PlainTextWarningDelegate(), new TextDelegate(), new RowLoadingDelegate()), R$id.consentScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ConsentScreen.R;
                        e1 e1Var = (e1) this.f6477b.P.getValue();
                        switch (e1Var.f195928a) {
                            case 0:
                                return (j) e1Var.d.get();
                            default:
                                return (j) e1Var.d.get();
                        }
                }
            }
        });
        this.P = w.y0(new agh.b(this, inputData, 15));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: aml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentScreen f6477b;

            {
                this.f6477b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentScreen.R;
                        ConsentScreen consentScreen = this.f6477b;
                        return dli.f.a(consentScreen, (j) consentScreen.Q.getValue(), v.k(new TimerDelegate(), new CellDetailsDelegate(), new RowDelegate(null, null, 7), (ErrorDelegate) consentScreen.K.getValue(), new PlainTextWarningDelegate(), new TextDelegate(), new RowLoadingDelegate()), R$id.consentScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ConsentScreen.R;
                        e1 e1Var = (e1) this.f6477b.P.getValue();
                        switch (e1Var.f195928a) {
                            case 0:
                                return (j) e1Var.d.get();
                            default:
                                return (j) e1Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        aml.h uiState = (aml.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f115677b.setModel(uiState.f6480b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e1) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f115677b.f), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f115677b.f58955g), new c(this, null, 1), 3);
    }

    public final dkl.q d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (dkl.q) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
