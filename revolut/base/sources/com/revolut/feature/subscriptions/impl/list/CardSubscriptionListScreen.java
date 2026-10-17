package com.revolut.feature.subscriptions.impl.list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import b9e.d;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subscriptions.impl.list.CardSubscriptionListScreen;
import com.revolut.feature.subscriptions.impl.list.CardSubscriptionListScreenContract$InputData;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import i9e.u;
import jii.x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lae.c;
import lae.f;
import lae.h;
import lae.i;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import w01.k;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/list/CardSubscriptionListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llae/h;", "Ldli/a;", "Llae/i;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardSubscriptionListScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CardSubscriptionListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final CardSubscriptionListScreenContract$InputData K;
    public final int L;
    public final ao.h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public CardSubscriptionListScreen(CardSubscriptionListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_two_buttons;
        this.M = s.t(this, c.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: lae.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSubscriptionListScreen f193365b;

            {
                this.f193365b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardSubscriptionListScreen cardSubscriptionListScreen = this.f193365b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardSubscriptionListScreen.R;
                        qji.b bVarU2 = cardSubscriptionListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.subscriptions.impl.list.di.SubscriptionListScreenInjector");
                        i9e.w wVar = (i9e.w) ((dae.a) bVarU2);
                        i9e.o oVar = wVar.f159753b;
                        i9e.w wVar2 = wVar.f159754c;
                        CardSubscriptionListScreenContract$InputData cardSubscriptionListScreenContract$InputData = cardSubscriptionListScreen.K;
                        cardSubscriptionListScreenContract$InputData.getClass();
                        return new u(oVar, wVar2, cardSubscriptionListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardSubscriptionListScreen.R;
                        return (f) ((u) cardSubscriptionListScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CardSubscriptionListScreen.R;
                        CardSubscriptionListScreen cardSubscriptionListScreen2 = this.f193365b;
                        return dli.f.a(cardSubscriptionListScreen2, (f) cardSubscriptionListScreen2.O.getValue(), v.k((RowDelegate) cardSubscriptionListScreen2.P.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: lae.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSubscriptionListScreen f193365b;

            {
                this.f193365b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardSubscriptionListScreen cardSubscriptionListScreen = this.f193365b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardSubscriptionListScreen.R;
                        qji.b bVarU2 = cardSubscriptionListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.subscriptions.impl.list.di.SubscriptionListScreenInjector");
                        i9e.w wVar = (i9e.w) ((dae.a) bVarU2);
                        i9e.o oVar = wVar.f159753b;
                        i9e.w wVar2 = wVar.f159754c;
                        CardSubscriptionListScreenContract$InputData cardSubscriptionListScreenContract$InputData = cardSubscriptionListScreen.K;
                        cardSubscriptionListScreenContract$InputData.getClass();
                        return new u(oVar, wVar2, cardSubscriptionListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardSubscriptionListScreen.R;
                        return (f) ((u) cardSubscriptionListScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CardSubscriptionListScreen.R;
                        CardSubscriptionListScreen cardSubscriptionListScreen2 = this.f193365b;
                        return dli.f.a(cardSubscriptionListScreen2, (f) cardSubscriptionListScreen2.O.getValue(), v.k((RowDelegate) cardSubscriptionListScreen2.P.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new l92.h(18));
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: lae.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSubscriptionListScreen f193365b;

            {
                this.f193365b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardSubscriptionListScreen cardSubscriptionListScreen = this.f193365b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardSubscriptionListScreen.R;
                        qji.b bVarU2 = cardSubscriptionListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.subscriptions.impl.list.di.SubscriptionListScreenInjector");
                        i9e.w wVar = (i9e.w) ((dae.a) bVarU2);
                        i9e.o oVar = wVar.f159753b;
                        i9e.w wVar2 = wVar.f159754c;
                        CardSubscriptionListScreenContract$InputData cardSubscriptionListScreenContract$InputData = cardSubscriptionListScreen.K;
                        cardSubscriptionListScreenContract$InputData.getClass();
                        return new u(oVar, wVar2, cardSubscriptionListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardSubscriptionListScreen.R;
                        return (f) ((u) cardSubscriptionListScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CardSubscriptionListScreen.R;
                        CardSubscriptionListScreen cardSubscriptionListScreen2 = this.f193365b;
                        return dli.f.a(cardSubscriptionListScreen2, (f) cardSubscriptionListScreen2.O.getValue(), v.k((RowDelegate) cardSubscriptionListScreen2.P.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setSecondDescriptionVisible(uiState.f193371b != null);
        navBarWithToolbar.setSecondDescriptionText(uiState.f193371b);
        d3().f174573b.setEnabled(uiState.f193372c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        TextLocalisedClause textLocalisedClause;
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        CardSubscriptionListScreenContract$InputData cardSubscriptionListScreenContract$InputData = this.K;
        d dVar = cardSubscriptionListScreenContract$InputData.f89209b;
        d dVar2 = cardSubscriptionListScreenContract$InputData.f89209b;
        int[] iArr = lae.b.f193366a;
        int i2 = iArr[dVar.ordinal()];
        if (i2 == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.card_subscription_list_title, null, null, 14);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.card_subscription_list_unlink_title, null, null, 14);
        }
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        int i3 = iArr[dVar2.ordinal()];
        if (i3 == 1) {
            i = R$drawable.uikit_icn_24_back_button_arrow;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_cross;
        }
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(i));
        int i5 = iArr[dVar2.ordinal()];
        if (i5 == 1) {
            LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = d3().f174573b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
            k.a(screenRecyclerNavbarTwoButtonsFirstButton);
            LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = d3().e;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
            k.a(screenRecyclerNavbarTwoButtonsSecondButton);
            return;
        }
        if (i5 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        LargeActionButton largeActionButton = d3().f174573b;
        k.d(largeActionButton);
        largeActionButton.setLoadingButtonTag("ACTION_BUTTON_TAG");
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setText(new TextLocalisedClause(R$string.card_subscription_list_action_unlink, null, null, 14));
        LargeActionButton largeActionButton2 = d3().e;
        k.d(largeActionButton2);
        largeActionButton2.o(LargeActionButton.ButtonStyle.f58726b);
        largeActionButton2.setText(new TextLocalisedClause(R$string.card_subscription_list_action_cancel, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new lae.d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), null, new lae.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174573b.o), null, new lae.d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new lae.d(this, null, 2), 3);
    }

    public final x d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
