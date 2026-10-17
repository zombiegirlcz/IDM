package com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwoLogosHeaderDelegate;
import com.revolut.core.ui_kit.delegates.timer.TimerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.upi.impl.R$id;
import com.revolut.feature.apm.upi.impl.R$layout;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmation.ConfirmationScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ofa.n;
import og2.b;
import og2.c;
import og2.h;
import og2.i;
import og2.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/screens/pending_payment/confirmation/ConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Log2/h;", "Ldli/a;", "Log2/i;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConfirmationScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/upi/impl/databinding/ScreenUpiConfirmationBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final int O;
    public final ao.h P;
    public final Object Q;
    public final Object R;

    public ConfirmationScreen(ConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new n(10));
        this.L = w.y0(new n(11));
        this.M = w.y0(new n(12));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: og2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmationScreen f224997b;

            {
                this.f224997b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ConfirmationScreen.S;
                        ConfirmationScreen confirmationScreen = this.f224997b;
                        return dli.f.a(confirmationScreen, confirmationScreen.d(), v.k(new RowLoadingDelegate(), new TwoLogosHeaderDelegate(), (RowDelegate) confirmationScreen.K.getValue(), (TimerDelegate) confirmationScreen.L.getValue(), (FullScreenStateDelegate) confirmationScreen.M.getValue()), R$id.upiConfirmation_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ConfirmationScreen.S;
                        return (m) ((if2.a) this.f224997b.Q.getValue()).f160838c.get();
                }
            }
        });
        this.O = R$layout.screen_upi_confirmation;
        this.P = s.t(this, b.f);
        this.Q = w.y0(new oa2.b(this, inputData, 8));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: og2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmationScreen f224997b;

            {
                this.f224997b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ConfirmationScreen.S;
                        ConfirmationScreen confirmationScreen = this.f224997b;
                        return dli.f.a(confirmationScreen, confirmationScreen.d(), v.k(new RowLoadingDelegate(), new TwoLogosHeaderDelegate(), (RowDelegate) confirmationScreen.K.getValue(), (TimerDelegate) confirmationScreen.L.getValue(), (FullScreenStateDelegate) confirmationScreen.M.getValue()), R$id.upiConfirmation_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ConfirmationScreen.S;
                        return (m) ((if2.a) this.f224997b.Q.getValue()).f160838c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        TwinVerticalButton twinVerticalButton = d3().f143333c;
        boolean z = uiState.f225003b;
        twinVerticalButton.setMainButtonEnabled(z);
        twinVerticalButton.setSecondaryButtonEnabled(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (if2.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f143332b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        TwinVerticalButton twinVerticalButton = d3().f143333c;
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(R.string.common_action_confirm, null, null, 14));
        twinVerticalButton.setMainButtonLoadingTag("MAIN_BUTTON_LOADING_TAG");
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R.string.common_action_reject, null, null, 14));
        twinVerticalButton.setSecondaryButtonLoadingTag("SECONDARY_BUTTON_LOADING_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f143332b.f59211b), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f143333c.o0()), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f143333c.p0()), null, new c(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TimerDelegate) this.L.getValue()).d.f121375b), null, new c(this, null, 3), 3);
    }

    public final gf2.a d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (gf2.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF78873d0() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
