package com.revolut.feature.apm.multibanco.impl.ui.pending.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
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
import com.revolut.feature.apm.multibanco.impl.R$id;
import com.revolut.feature.apm.multibanco.impl.R$layout;
import com.revolut.feature.apm.multibanco.impl.ui.pending.confirmation.PendingPaymentConfirmationScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import j3c.y;
import j82.f;
import j82.g;
import j82.j;
import j82.k;
import j82.l;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.c;
import rd0.d;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/pending/confirmation/PendingPaymentConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lj82/j;", "Ldli/a;", "Lj82/l;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PendingPaymentConfirmationScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PendingPaymentConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/multibanco/impl/databinding/ScreenPendingPaymentBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final int O;
    public final h P;
    public final Object Q;
    public final Object R;

    public PendingPaymentConfirmationScreen(PendingPaymentConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new y(22));
        this.L = w.y0(new y(23));
        this.M = w.y0(new y(24));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: j82.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentConfirmationScreen f172089b;

            {
                this.f172089b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = PendingPaymentConfirmationScreen.S;
                        PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen = this.f172089b;
                        return dli.f.a(pendingPaymentConfirmationScreen, pendingPaymentConfirmationScreen.R2(), v.k(new RowLoadingDelegate(), new TwoLogosHeaderDelegate(), (FullScreenStateDelegate) pendingPaymentConfirmationScreen.M.getValue(), (RowDelegate) pendingPaymentConfirmationScreen.K.getValue(), (TimerDelegate) pendingPaymentConfirmationScreen.L.getValue()), R$id.pendingPayment_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PendingPaymentConfirmationScreen.S;
                        return (k) ((i72.y) this.f172089b.Q.getValue()).d.get();
                }
            }
        });
        this.O = R$layout.screen_pending_payment;
        this.P = s.t(this, f.f);
        this.Q = w.y0(new j68.a(this, inputData, 2));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: j82.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentConfirmationScreen f172089b;

            {
                this.f172089b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PendingPaymentConfirmationScreen.S;
                        PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen = this.f172089b;
                        return dli.f.a(pendingPaymentConfirmationScreen, pendingPaymentConfirmationScreen.R2(), v.k(new RowLoadingDelegate(), new TwoLogosHeaderDelegate(), (FullScreenStateDelegate) pendingPaymentConfirmationScreen.M.getValue(), (RowDelegate) pendingPaymentConfirmationScreen.K.getValue(), (TimerDelegate) pendingPaymentConfirmationScreen.L.getValue()), R$id.pendingPayment_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PendingPaymentConfirmationScreen.S;
                        return (k) ((i72.y) this.f172089b.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        TwinVerticalButton twinVerticalButton = d3().f132556c;
        boolean z = uiState.f172095b;
        twinVerticalButton.setMainButtonEnabled(z);
        twinVerticalButton.setSecondaryButtonEnabled(z);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        j82.s sVar = (j82.s) R2();
        sVar.getClass();
        Intrinsics.checkNotNullExpressionValue("s", "MB_TAG");
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.b(c.INFO, "s", "MB PendingPayment: closed", null, null, 16);
        sVar.C2(j.b.f172092a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i72.y) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f132555b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        TwinVerticalButton twinVerticalButton = d3().f132556c;
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(R.string.common_action_confirm, null, null, 14));
        twinVerticalButton.setMainButtonLoadingTag("MAIN_BUTTON_LOADING_TAG");
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R.string.common_action_reject, null, null, 14));
        twinVerticalButton.setSecondaryButtonLoadingTag("SECONDARY_BUTTON_LOADING_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f132555b.f59211b), null, new g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f132556c.o0()), null, new g(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f132556c.p0()), null, new g(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.M.getValue()).f52371h.f121375b), null, new j82.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TimerDelegate) this.L.getValue()).d.f121375b), null, new g(this, continuation, 3), 3);
    }

    public final f72.a d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (f72.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
