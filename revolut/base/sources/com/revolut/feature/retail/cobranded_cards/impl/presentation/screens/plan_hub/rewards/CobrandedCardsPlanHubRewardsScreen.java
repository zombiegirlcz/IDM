package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b6b.o;
import b6b.t;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.CobrandedCardsPlanHubRewardsScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.CobrandedCardsPlanHubRewardsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import iqh.d;
import j3c.y;
import j7b.b;
import j7b.g;
import j7b.j;
import j7b.k;
import jii.m;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/rewards/CobrandedCardsPlanHubRewardsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lj7b/k;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsPlanHubRewardsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CobrandedCardsPlanHubRewardsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CobrandedCardsPlanHubRewardsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public CobrandedCardsPlanHubRewardsScreen(CobrandedCardsPlanHubRewardsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = w.y0(new y(16));
        this.O = w.y0(new y(17));
        this.P = w.y0(new y(18));
        this.Q = w.y0(new y(19));
        this.R = w.y0(new y(20));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: j7b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubRewardsScreen f171887b;

            {
                this.f171887b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CobrandedCardsPlanHubRewardsScreen cobrandedCardsPlanHubRewardsScreen = this.f171887b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubRewardsScreen.V;
                        CobrandedCardsPlanHubRewardsScreen cobrandedCardsPlanHubRewardsScreen2 = this.f171887b;
                        return dli.f.a(cobrandedCardsPlanHubRewardsScreen2, cobrandedCardsPlanHubRewardsScreen2.R2(), v.k((ListSubheaderDelegate) cobrandedCardsPlanHubRewardsScreen2.N.getValue(), new ListSubheaderLoadingDelegate(), (RowDelegate) cobrandedCardsPlanHubRewardsScreen2.O.getValue(), new RowLoadingDelegate(), (InputDisclosureDelegate) cobrandedCardsPlanHubRewardsScreen2.P.getValue(), (FullScreenStateDelegate) cobrandedCardsPlanHubRewardsScreen2.Q.getValue(), (LargeActionButtonDelegate) cobrandedCardsPlanHubRewardsScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubRewardsScreen.V;
                        qji.b bVarU2 = cobrandedCardsPlanHubRewardsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.di.CobrandedCardsPlanHubRewardsScreenInjector");
                        }
                        b6b.q qVar = (b6b.q) bVarU2;
                        o oVar = qVar.f12665b;
                        b6b.q qVar2 = qVar.f12666c;
                        CobrandedCardsPlanHubRewardsScreenContract$InputData cobrandedCardsPlanHubRewardsScreenContract$InputData = cobrandedCardsPlanHubRewardsScreen.K;
                        cobrandedCardsPlanHubRewardsScreenContract$InputData.getClass();
                        return new t(oVar, qVar2, cobrandedCardsPlanHubRewardsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubRewardsScreen.V;
                        return (j) ((t) cobrandedCardsPlanHubRewardsScreen.T.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: j7b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubRewardsScreen f171887b;

            {
                this.f171887b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CobrandedCardsPlanHubRewardsScreen cobrandedCardsPlanHubRewardsScreen = this.f171887b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubRewardsScreen.V;
                        CobrandedCardsPlanHubRewardsScreen cobrandedCardsPlanHubRewardsScreen2 = this.f171887b;
                        return dli.f.a(cobrandedCardsPlanHubRewardsScreen2, cobrandedCardsPlanHubRewardsScreen2.R2(), v.k((ListSubheaderDelegate) cobrandedCardsPlanHubRewardsScreen2.N.getValue(), new ListSubheaderLoadingDelegate(), (RowDelegate) cobrandedCardsPlanHubRewardsScreen2.O.getValue(), new RowLoadingDelegate(), (InputDisclosureDelegate) cobrandedCardsPlanHubRewardsScreen2.P.getValue(), (FullScreenStateDelegate) cobrandedCardsPlanHubRewardsScreen2.Q.getValue(), (LargeActionButtonDelegate) cobrandedCardsPlanHubRewardsScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubRewardsScreen.V;
                        qji.b bVarU2 = cobrandedCardsPlanHubRewardsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.di.CobrandedCardsPlanHubRewardsScreenInjector");
                        }
                        b6b.q qVar = (b6b.q) bVarU2;
                        o oVar = qVar.f12665b;
                        b6b.q qVar2 = qVar.f12666c;
                        CobrandedCardsPlanHubRewardsScreenContract$InputData cobrandedCardsPlanHubRewardsScreenContract$InputData = cobrandedCardsPlanHubRewardsScreen.K;
                        cobrandedCardsPlanHubRewardsScreenContract$InputData.getClass();
                        return new t(oVar, qVar2, cobrandedCardsPlanHubRewardsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubRewardsScreen.V;
                        return (j) ((t) cobrandedCardsPlanHubRewardsScreen.T.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: j7b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubRewardsScreen f171887b;

            {
                this.f171887b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CobrandedCardsPlanHubRewardsScreen cobrandedCardsPlanHubRewardsScreen = this.f171887b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubRewardsScreen.V;
                        CobrandedCardsPlanHubRewardsScreen cobrandedCardsPlanHubRewardsScreen2 = this.f171887b;
                        return dli.f.a(cobrandedCardsPlanHubRewardsScreen2, cobrandedCardsPlanHubRewardsScreen2.R2(), v.k((ListSubheaderDelegate) cobrandedCardsPlanHubRewardsScreen2.N.getValue(), new ListSubheaderLoadingDelegate(), (RowDelegate) cobrandedCardsPlanHubRewardsScreen2.O.getValue(), new RowLoadingDelegate(), (InputDisclosureDelegate) cobrandedCardsPlanHubRewardsScreen2.P.getValue(), (FullScreenStateDelegate) cobrandedCardsPlanHubRewardsScreen2.Q.getValue(), (LargeActionButtonDelegate) cobrandedCardsPlanHubRewardsScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubRewardsScreen.V;
                        qji.b bVarU2 = cobrandedCardsPlanHubRewardsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.di.CobrandedCardsPlanHubRewardsScreenInjector");
                        }
                        b6b.q qVar = (b6b.q) bVarU2;
                        o oVar = qVar.f12665b;
                        b6b.q qVar2 = qVar.f12666c;
                        CobrandedCardsPlanHubRewardsScreenContract$InputData cobrandedCardsPlanHubRewardsScreenContract$InputData = cobrandedCardsPlanHubRewardsScreen.K;
                        cobrandedCardsPlanHubRewardsScreenContract$InputData.getClass();
                        return new t(oVar, qVar2, cobrandedCardsPlanHubRewardsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubRewardsScreen.V;
                        return (j) ((t) cobrandedCardsPlanHubRewardsScreen.T.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, cli.q qVar) {
        dli.a.z0((k) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.Q.getValue()).f52371h.f121375b), new g(this, null), 3);
        ViewController.P2(this, new d(rd0.e.b(((ListSubheaderDelegate) this.N.getValue()).d), 21), new j7b.h(this, continuation, 0), 3);
        ?? r62 = this.O;
        ViewController.P2(this, new d(rd0.e.b(((RowDelegate) r62.getValue()).f53218h), 22), new j7b.h(this, continuation, 1), 3);
        ViewController.P2(this, new d(rd0.e.b(((RowDelegate) r62.getValue()).f53220l), 23), new j7b.h(this, continuation, 2), 3);
        ViewController.P2(this, new d(rd0.e.b(((LargeActionButtonDelegate) this.R.getValue()).d.f121375b), 24), new j7b.h(this, continuation, 3), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
