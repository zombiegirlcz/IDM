package com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.confirmation;

import a08.b;
import a32.a0;
import a32.g;
import a32.i;
import a32.j;
import a32.k;
import a32.l;
import a32.o;
import a32.p;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwoLogosHeaderDelegate;
import com.revolut.core.ui_kit.delegates.timer.TimerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmPaymentAuthorisationNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.R$id;
import com.revolut.feature.apm.core.ui.impl.R$layout;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.confirmation.PendingPaymentConfirmationScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m12.f;
import p12.p0;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/pending_payments/authorisation/confirmation/PendingPaymentConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "La32/o;", "Ldli/a;", "La32/q;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PendingPaymentConfirmationScreen extends ViewController<o> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PendingPaymentConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/core/ui/impl/databinding/ScreenPendingPaymentAuthorisationBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final int O;
    public final h P;
    public final Object Q;
    public final Object R;

    public PendingPaymentConfirmationScreen(ApmPaymentAuthorisationNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new b(28));
        this.L = w.y0(new b(29));
        final int i = 0;
        this.M = w.y0(new g(0));
        this.N = w.y0(new Function0(this) { // from class: a32.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentConfirmationScreen f1027b;

            {
                this.f1027b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen = this.f1027b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PendingPaymentConfirmationScreen.S;
                        PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen2 = this.f1027b;
                        return dli.f.a(pendingPaymentConfirmationScreen2, pendingPaymentConfirmationScreen2.d(), zhm.v.k(new RowLoadingDelegate(), new TwoLogosHeaderDelegate(), new ListSubheaderDelegate(), (FullScreenStateDelegate) pendingPaymentConfirmationScreen2.M.getValue(), (RowDelegate) pendingPaymentConfirmationScreen2.K.getValue(), (TimerDelegate) pendingPaymentConfirmationScreen2.L.getValue(), new CellDetailsActionDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate()), R$id.pendingPayment_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PendingPaymentConfirmationScreen.S;
                        qji.b bVarU2 = pendingPaymentConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.confirmation.di.PendingPaymentConfirmationScreenInjector");
                        p12.b0 b0Var = (p12.b0) bVarU2;
                        return new p0(b0Var.f231624c, b0Var.d);
                    default:
                        KProperty[] kPropertyArr3 = PendingPaymentConfirmationScreen.S;
                        return (p) ((p0) pendingPaymentConfirmationScreen.Q.getValue()).e.get();
                }
            }
        });
        this.O = R$layout.screen_pending_payment_authorisation;
        this.P = s.t(this, i.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: a32.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentConfirmationScreen f1027b;

            {
                this.f1027b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen = this.f1027b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PendingPaymentConfirmationScreen.S;
                        PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen2 = this.f1027b;
                        return dli.f.a(pendingPaymentConfirmationScreen2, pendingPaymentConfirmationScreen2.d(), zhm.v.k(new RowLoadingDelegate(), new TwoLogosHeaderDelegate(), new ListSubheaderDelegate(), (FullScreenStateDelegate) pendingPaymentConfirmationScreen2.M.getValue(), (RowDelegate) pendingPaymentConfirmationScreen2.K.getValue(), (TimerDelegate) pendingPaymentConfirmationScreen2.L.getValue(), new CellDetailsActionDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate()), R$id.pendingPayment_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PendingPaymentConfirmationScreen.S;
                        qji.b bVarU2 = pendingPaymentConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.confirmation.di.PendingPaymentConfirmationScreenInjector");
                        p12.b0 b0Var = (p12.b0) bVarU2;
                        return new p0(b0Var.f231624c, b0Var.d);
                    default:
                        KProperty[] kPropertyArr3 = PendingPaymentConfirmationScreen.S;
                        return (p) ((p0) pendingPaymentConfirmationScreen.Q.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: a32.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentConfirmationScreen f1027b;

            {
                this.f1027b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen = this.f1027b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PendingPaymentConfirmationScreen.S;
                        PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen2 = this.f1027b;
                        return dli.f.a(pendingPaymentConfirmationScreen2, pendingPaymentConfirmationScreen2.d(), zhm.v.k(new RowLoadingDelegate(), new TwoLogosHeaderDelegate(), new ListSubheaderDelegate(), (FullScreenStateDelegate) pendingPaymentConfirmationScreen2.M.getValue(), (RowDelegate) pendingPaymentConfirmationScreen2.K.getValue(), (TimerDelegate) pendingPaymentConfirmationScreen2.L.getValue(), new CellDetailsActionDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate()), R$id.pendingPayment_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PendingPaymentConfirmationScreen.S;
                        qji.b bVarU2 = pendingPaymentConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.confirmation.di.PendingPaymentConfirmationScreenInjector");
                        p12.b0 b0Var = (p12.b0) bVarU2;
                        return new p0(b0Var.f231624c, b0Var.d);
                    default:
                        KProperty[] kPropertyArr3 = PendingPaymentConfirmationScreen.S;
                        return (p) ((p0) pendingPaymentConfirmationScreen.Q.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        a32.q uiState = (a32.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        TwinVerticalButton twinVerticalButton = d3().f201205c;
        boolean z = uiState.f1038b;
        twinVerticalButton.setMainButtonEnabled(z);
        twinVerticalButton.setSecondaryButtonEnabled(z);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        a0 a0Var = (a0) d();
        a0Var.getClass();
        a0.J2("closed");
        a0Var.C2(o.b.f1035a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p0) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f201204b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        TwinVerticalButton twinVerticalButton = d3().f201205c;
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(R.string.common_action_confirm, null, null, 14));
        twinVerticalButton.setMainButtonLoadingTag("MAIN_BUTTON_LOADING_TAG");
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R.string.common_action_reject, null, null, 14));
        twinVerticalButton.setSecondaryButtonLoadingTag("SECONDARY_BUTTON_LOADING_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201204b.f59211b), null, new j(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201205c.o0()), null, new j(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201205c.p0()), null, new j(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.K.getValue()).f53220l), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.M.getValue()).f52371h.f121375b), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TimerDelegate) this.L.getValue()).d.f121375b), null, new j(this, null, 3), 3);
    }

    public final f d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (f) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p d() {
        return (p) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
