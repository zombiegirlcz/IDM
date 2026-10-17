package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b6b.a0;
import b6b.z;
import bk6.c;
import c0d.e;
import c1i.f;
import c65.i;
import c7b.d;
import c7b.g;
import c7b.k;
import c7b.p;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_selection.CobrandedCardsSelectionScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_selection.CobrandedCardsSelectionScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
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
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_selection/CobrandedCardsSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc7b/k;", "Ldli/a;", "Lc7b/q;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsSelectionScreen extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CobrandedCardsSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CobrandedCardsSelectionScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public CobrandedCardsSelectionScreen(CobrandedCardsSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, d.f);
        this.N = w.y0(new e(19));
        this.O = w.y0(new e(20));
        this.P = w.y0(new e(21));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: c7b.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsSelectionScreen f21892b;

            {
                this.f21892b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CobrandedCardsSelectionScreen cobrandedCardsSelectionScreen = this.f21892b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsSelectionScreen.T;
                        CobrandedCardsSelectionScreen cobrandedCardsSelectionScreen2 = this.f21892b;
                        return dli.f.a(cobrandedCardsSelectionScreen2, cobrandedCardsSelectionScreen2.R2(), v.k(new ListingTileDelegate(), (CellDetailsStandaloneNoteDelegate) cobrandedCardsSelectionScreen2.N.getValue(), (LargeActionButtonDelegate) cobrandedCardsSelectionScreen2.O.getValue(), (FullScreenStateDelegate) cobrandedCardsSelectionScreen2.P.getValue(), new ListingTileLoadingDelegate(), new CellDetailsLoadingDelegate(), new LargeActionButtonLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsSelectionScreen.T;
                        qji.b bVarU2 = cobrandedCardsSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_selection.di.CobrandedCardsSelectionScreenInjector");
                        z zVar = (z) ((d7b.a) bVarU2).b().mo3808a(cobrandedCardsSelectionScreen);
                        CobrandedCardsSelectionScreenContract$InputData cobrandedCardsSelectionScreenContract$InputData = cobrandedCardsSelectionScreen.K;
                        switch (zVar.f12703a) {
                            case 0:
                                cobrandedCardsSelectionScreenContract$InputData.getClass();
                                zVar.d = cobrandedCardsSelectionScreenContract$InputData;
                                break;
                            default:
                                cobrandedCardsSelectionScreenContract$InputData.getClass();
                                zVar.d = cobrandedCardsSelectionScreenContract$InputData;
                                break;
                        }
                        return (a0) zVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsSelectionScreen.T;
                        a0 a0Var = (a0) cobrandedCardsSelectionScreen.R.getValue();
                        switch (a0Var.f12560a) {
                            case 0:
                                return (p) a0Var.f12563g.get();
                            default:
                                return (p) a0Var.f12563g.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: c7b.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsSelectionScreen f21892b;

            {
                this.f21892b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CobrandedCardsSelectionScreen cobrandedCardsSelectionScreen = this.f21892b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsSelectionScreen.T;
                        CobrandedCardsSelectionScreen cobrandedCardsSelectionScreen2 = this.f21892b;
                        return dli.f.a(cobrandedCardsSelectionScreen2, cobrandedCardsSelectionScreen2.R2(), v.k(new ListingTileDelegate(), (CellDetailsStandaloneNoteDelegate) cobrandedCardsSelectionScreen2.N.getValue(), (LargeActionButtonDelegate) cobrandedCardsSelectionScreen2.O.getValue(), (FullScreenStateDelegate) cobrandedCardsSelectionScreen2.P.getValue(), new ListingTileLoadingDelegate(), new CellDetailsLoadingDelegate(), new LargeActionButtonLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsSelectionScreen.T;
                        qji.b bVarU2 = cobrandedCardsSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_selection.di.CobrandedCardsSelectionScreenInjector");
                        z zVar = (z) ((d7b.a) bVarU2).b().mo3808a(cobrandedCardsSelectionScreen);
                        CobrandedCardsSelectionScreenContract$InputData cobrandedCardsSelectionScreenContract$InputData = cobrandedCardsSelectionScreen.K;
                        switch (zVar.f12703a) {
                            case 0:
                                cobrandedCardsSelectionScreenContract$InputData.getClass();
                                zVar.d = cobrandedCardsSelectionScreenContract$InputData;
                                break;
                            default:
                                cobrandedCardsSelectionScreenContract$InputData.getClass();
                                zVar.d = cobrandedCardsSelectionScreenContract$InputData;
                                break;
                        }
                        return (a0) zVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsSelectionScreen.T;
                        a0 a0Var = (a0) cobrandedCardsSelectionScreen.R.getValue();
                        switch (a0Var.f12560a) {
                            case 0:
                                return (p) a0Var.f12563g.get();
                            default:
                                return (p) a0Var.f12563g.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: c7b.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsSelectionScreen f21892b;

            {
                this.f21892b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CobrandedCardsSelectionScreen cobrandedCardsSelectionScreen = this.f21892b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsSelectionScreen.T;
                        CobrandedCardsSelectionScreen cobrandedCardsSelectionScreen2 = this.f21892b;
                        return dli.f.a(cobrandedCardsSelectionScreen2, cobrandedCardsSelectionScreen2.R2(), v.k(new ListingTileDelegate(), (CellDetailsStandaloneNoteDelegate) cobrandedCardsSelectionScreen2.N.getValue(), (LargeActionButtonDelegate) cobrandedCardsSelectionScreen2.O.getValue(), (FullScreenStateDelegate) cobrandedCardsSelectionScreen2.P.getValue(), new ListingTileLoadingDelegate(), new CellDetailsLoadingDelegate(), new LargeActionButtonLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsSelectionScreen.T;
                        qji.b bVarU2 = cobrandedCardsSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_selection.di.CobrandedCardsSelectionScreenInjector");
                        z zVar = (z) ((d7b.a) bVarU2).b().mo3808a(cobrandedCardsSelectionScreen);
                        CobrandedCardsSelectionScreenContract$InputData cobrandedCardsSelectionScreenContract$InputData = cobrandedCardsSelectionScreen.K;
                        switch (zVar.f12703a) {
                            case 0:
                                cobrandedCardsSelectionScreenContract$InputData.getClass();
                                zVar.d = cobrandedCardsSelectionScreenContract$InputData;
                                break;
                            default:
                                cobrandedCardsSelectionScreenContract$InputData.getClass();
                                zVar.d = cobrandedCardsSelectionScreenContract$InputData;
                                break;
                        }
                        return (a0) zVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsSelectionScreen.T;
                        a0 a0Var = (a0) cobrandedCardsSelectionScreen.R.getValue();
                        switch (a0Var.f12560a) {
                            case 0:
                                return (p) a0Var.f12563g.get();
                            default:
                                return (p) a0Var.f12563g.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        c7b.q uiState = (c7b.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f21905a;
        navBarWithToolbar.setLoadingVisible(clause == null);
        navBarWithToolbar.setTitle(clause, null);
        if (clause != null) {
            navBarWithToolbar.setToolbarTitle(clause);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (a0) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        if (this.K.f82565a) {
            navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        if (this.K.f82565a) {
            ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new i(this, continuation, 4), 3);
        }
        ?? r62 = this.O;
        ViewController.P2(this, new c(rd0.e.b(((LargeActionButtonDelegate) r62.getValue()).d.f121375b), 28), new f(this, continuation, 15), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b), new g(this, null), 3);
        ViewController.P2(this, new c(rd0.e.b(((LargeActionButtonDelegate) r62.getValue()).d.f121375b), 27), new c7b.h(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p R2() {
        return (p) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
