package com.revolut.feature.subscriptions.impl.label;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.subscriptions.impl.R$id;
import com.revolut.feature.subscriptions.impl.R$layout;
import com.revolut.feature.subscriptions.impl.label.SubscriptionLabelScreen;
import com.revolut.feature.subscriptions.impl.label.SubscriptionLabelScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import efm.r;
import i9e.o;
import i9e.t;
import k9h.d;
import kae.b;
import kae.c;
import kae.f;
import kae.g;
import kae.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/label/SubscriptionLabelScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkae/f;", "Ldli/a;", "Lkae/g;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubscriptionLabelScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(SubscriptionLabelScreen.class, "binding", "getBinding()Lcom/revolut/feature/subscriptions/impl/databinding/ScreenSubscriptionLabelBinding;", 0))};
    public final SubscriptionLabelScreenContract$InputData K;
    public final int L;
    public final h M;
    public final InputTextDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public SubscriptionLabelScreen(SubscriptionLabelScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_subscription_label;
        this.M = s.t(this, b.f);
        this.N = new InputTextDelegate(null);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: kae.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionLabelScreen f182468b;

            {
                this.f182468b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SubscriptionLabelScreen subscriptionLabelScreen = this.f182468b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SubscriptionLabelScreen.R;
                        qji.b bVarU2 = subscriptionLabelScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.subscriptions.impl.label.di.SubscriptionLabelScreenInjector");
                        i9e.w wVar = (i9e.w) ((dae.a) bVarU2);
                        o oVar = wVar.f159753b;
                        i9e.w wVar2 = wVar.f159754c;
                        SubscriptionLabelScreenContract$InputData subscriptionLabelScreenContract$InputData = subscriptionLabelScreen.K;
                        subscriptionLabelScreenContract$InputData.getClass();
                        return new t(oVar, wVar2, subscriptionLabelScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SubscriptionLabelScreen.R;
                        return (i) ((t) subscriptionLabelScreen.O.getValue()).f159746b.get();
                    default:
                        KProperty[] kPropertyArr3 = SubscriptionLabelScreen.R;
                        SubscriptionLabelScreen subscriptionLabelScreen2 = this.f182468b;
                        return dli.f.a(subscriptionLabelScreen2, (i) subscriptionLabelScreen2.P.getValue(), u.c(subscriptionLabelScreen2.N), R$id.subscriptionLabel_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: kae.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionLabelScreen f182468b;

            {
                this.f182468b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SubscriptionLabelScreen subscriptionLabelScreen = this.f182468b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SubscriptionLabelScreen.R;
                        qji.b bVarU2 = subscriptionLabelScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.subscriptions.impl.label.di.SubscriptionLabelScreenInjector");
                        i9e.w wVar = (i9e.w) ((dae.a) bVarU2);
                        o oVar = wVar.f159753b;
                        i9e.w wVar2 = wVar.f159754c;
                        SubscriptionLabelScreenContract$InputData subscriptionLabelScreenContract$InputData = subscriptionLabelScreen.K;
                        subscriptionLabelScreenContract$InputData.getClass();
                        return new t(oVar, wVar2, subscriptionLabelScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SubscriptionLabelScreen.R;
                        return (i) ((t) subscriptionLabelScreen.O.getValue()).f159746b.get();
                    default:
                        KProperty[] kPropertyArr3 = SubscriptionLabelScreen.R;
                        SubscriptionLabelScreen subscriptionLabelScreen2 = this.f182468b;
                        return dli.f.a(subscriptionLabelScreen2, (i) subscriptionLabelScreen2.P.getValue(), u.c(subscriptionLabelScreen2.N), R$id.subscriptionLabel_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: kae.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionLabelScreen f182468b;

            {
                this.f182468b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SubscriptionLabelScreen subscriptionLabelScreen = this.f182468b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SubscriptionLabelScreen.R;
                        qji.b bVarU2 = subscriptionLabelScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.subscriptions.impl.label.di.SubscriptionLabelScreenInjector");
                        i9e.w wVar = (i9e.w) ((dae.a) bVarU2);
                        o oVar = wVar.f159753b;
                        i9e.w wVar2 = wVar.f159754c;
                        SubscriptionLabelScreenContract$InputData subscriptionLabelScreenContract$InputData = subscriptionLabelScreen.K;
                        subscriptionLabelScreenContract$InputData.getClass();
                        return new t(oVar, wVar2, subscriptionLabelScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SubscriptionLabelScreen.R;
                        return (i) ((t) subscriptionLabelScreen.O.getValue()).f159746b.get();
                    default:
                        KProperty[] kPropertyArr3 = SubscriptionLabelScreen.R;
                        SubscriptionLabelScreen subscriptionLabelScreen2 = this.f182468b;
                        return dli.f.a(subscriptionLabelScreen2, (i) subscriptionLabelScreen2.P.getValue(), u.c(subscriptionLabelScreen2.N), R$id.subscriptionLabel_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f287024c.setButtonEnabled(uiState.f182476c);
        d3().f287024c.setButtonText(uiState.d);
        NavBarWithToolbar navBarWithToolbar = d3().f287023b;
        TextLocalisedClause textLocalisedClause = uiState.f182475b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        d3().f287024c.setDescription(uiState.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f287023b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f287023b.f59410q), null, new c(this, null, 0), 3);
        r map = this.N.e.f121375b.map(new k64.a(13, new d(8)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new kae.d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f287024c.f0()), null, new c(this, null, 1), 3);
    }

    public final v9e.b d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (v9e.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
