package com.revolut.feature.apm.core.ui.impl.ui.pending_payments.consent.confirmation;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwoLogosHeaderDelegate;
import com.revolut.core.ui_kit.delegates.timer.TimerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmConsentNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.R$id;
import com.revolut.feature.apm.core.ui.impl.R$layout;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.consent.confirmation.ApmConfirmationScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import h32.b;
import h32.c;
import h32.e;
import h32.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p12.s;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/pending_payments/consent/confirmation/ApmConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lh32/e;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmConfirmationScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ApmConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/core/ui/impl/databinding/ScreenApmConfirmationBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final Object P;
    public final Object Q;

    public ApmConfirmationScreen(ApmConsentNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new gx2.a(26));
        this.L = w.y0(new gx2.a(27));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: h32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmConfirmationScreen f149005b;

            {
                this.f149005b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ApmConfirmationScreen.R;
                        ApmConfirmationScreen apmConfirmationScreen = this.f149005b;
                        return dli.f.a(apmConfirmationScreen, apmConfirmationScreen.d(), v.k(new RowLoadingDelegate(), new TwoLogosHeaderDelegate(), (RowDelegate) apmConfirmationScreen.K.getValue(), (TimerDelegate) apmConfirmationScreen.L.getValue()), R$id.apmConfirmation_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ApmConfirmationScreen.R;
                        return (k) ((s) this.f149005b.P.getValue()).f231762c.get();
                }
            }
        });
        this.N = R$layout.screen_apm_confirmation;
        this.O = vc.s.t(this, b.f);
        this.P = w.y0(new h1k.a(this, inputData, 4));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: h32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmConfirmationScreen f149005b;

            {
                this.f149005b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ApmConfirmationScreen.R;
                        ApmConfirmationScreen apmConfirmationScreen = this.f149005b;
                        return dli.f.a(apmConfirmationScreen, apmConfirmationScreen.d(), v.k(new RowLoadingDelegate(), new TwoLogosHeaderDelegate(), (RowDelegate) apmConfirmationScreen.K.getValue(), (TimerDelegate) apmConfirmationScreen.L.getValue()), R$id.apmConfirmation_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ApmConfirmationScreen.R;
                        return (k) ((s) this.f149005b.P.getValue()).f231762c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        TwinVerticalButton twinVerticalButton = d3().f201192c;
        boolean z = uiState.f149008b;
        twinVerticalButton.setMainButtonEnabled(z);
        twinVerticalButton.setSecondaryButtonEnabled(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (s) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f201191b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        TwinVerticalButton twinVerticalButton = d3().f201192c;
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
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201191b.f59211b), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201192c.o0()), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201192c.p0()), null, new c(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TimerDelegate) this.L.getValue()).d.f121375b), null, new c(this, null, 3), 3);
    }

    public final m12.a d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m12.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
