package com.revolut.feature.card_screen.impl.kompot.reactivate;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_screen.impl.R$id;
import com.revolut.feature.card_screen.impl.R$layout;
import com.revolut.feature.card_screen.impl.kompot.reactivate.ReactivateCardScreen;
import com.revolut.feature.card_screen.impl.kompot.reactivate.ReactivateCardScreenContract$InputData;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import hwi.l0;
import i6j.p;
import i83.d;
import i83.f;
import i83.i;
import i83.j;
import i83.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import vkm.j2;
import xki.e;
import z73.g;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/reactivate/ReactivateCardScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/card_screen/impl/kompot/reactivate/a;", "Ltki/c;", "Li83/k;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReactivateCardScreen extends ViewController<a> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ReactivateCardScreen.class, "fullScreenBinding", "getFullScreenBinding()Lcom/revolut/feature/card_screen/impl/databinding/ScreenReactivateCardBinding;", 0))};
    public final ReactivateCardScreenContract$InputData K;
    public final int L;
    public final h M;
    public final boolean N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public ReactivateCardScreen(ReactivateCardScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = inputData.f65487a ? R$layout.screen_reactivate_card_modal : R$layout.screen_reactivate_card;
        this.M = s.t(this, i83.c.f);
        this.N = true;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: i83.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReactivateCardScreen f159416b;

            {
                this.f159416b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReactivateCardScreen reactivateCardScreen = this.f159416b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReactivateCardScreen.T;
                        qji.b bVarU2 = reactivateCardScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.reactivate.di.ReactivateCardScreenInjector");
                        z73.c cVar = (z73.c) bVarU2;
                        z73.b bVar = cVar.f319876b;
                        z73.c cVar2 = cVar.f319877c;
                        ReactivateCardScreenContract$InputData reactivateCardScreenContract$InputData = reactivateCardScreen.K;
                        reactivateCardScreenContract$InputData.getClass();
                        return new z73.g(bVar, cVar2, reactivateCardScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReactivateCardScreen.T;
                        return (i) ((z73.g) reactivateCardScreen.O.getValue()).f319900c.get();
                    default:
                        KProperty[] kPropertyArr3 = ReactivateCardScreen.T;
                        ReactivateCardScreen reactivateCardScreen2 = this.f159416b;
                        return tki.g.a(reactivateCardScreen2, reactivateCardScreen2.R2(), v.k((RowDelegate) reactivateCardScreen2.Q.getValue(), (CellDetailsChevronDelegate) reactivateCardScreen2.R.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.cardReactivate_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: i83.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReactivateCardScreen f159416b;

            {
                this.f159416b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReactivateCardScreen reactivateCardScreen = this.f159416b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReactivateCardScreen.T;
                        qji.b bVarU2 = reactivateCardScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.reactivate.di.ReactivateCardScreenInjector");
                        z73.c cVar = (z73.c) bVarU2;
                        z73.b bVar = cVar.f319876b;
                        z73.c cVar2 = cVar.f319877c;
                        ReactivateCardScreenContract$InputData reactivateCardScreenContract$InputData = reactivateCardScreen.K;
                        reactivateCardScreenContract$InputData.getClass();
                        return new z73.g(bVar, cVar2, reactivateCardScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReactivateCardScreen.T;
                        return (i) ((z73.g) reactivateCardScreen.O.getValue()).f319900c.get();
                    default:
                        KProperty[] kPropertyArr3 = ReactivateCardScreen.T;
                        ReactivateCardScreen reactivateCardScreen2 = this.f159416b;
                        return tki.g.a(reactivateCardScreen2, reactivateCardScreen2.R2(), v.k((RowDelegate) reactivateCardScreen2.Q.getValue(), (CellDetailsChevronDelegate) reactivateCardScreen2.R.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.cardReactivate_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new i83.b(0));
        this.R = w.y0(new i83.b(1));
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: i83.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReactivateCardScreen f159416b;

            {
                this.f159416b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ReactivateCardScreen reactivateCardScreen = this.f159416b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReactivateCardScreen.T;
                        qji.b bVarU2 = reactivateCardScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.reactivate.di.ReactivateCardScreenInjector");
                        z73.c cVar = (z73.c) bVarU2;
                        z73.b bVar = cVar.f319876b;
                        z73.c cVar2 = cVar.f319877c;
                        ReactivateCardScreenContract$InputData reactivateCardScreenContract$InputData = reactivateCardScreen.K;
                        reactivateCardScreenContract$InputData.getClass();
                        return new z73.g(bVar, cVar2, reactivateCardScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReactivateCardScreen.T;
                        return (i) ((z73.g) reactivateCardScreen.O.getValue()).f319900c.get();
                    default:
                        KProperty[] kPropertyArr3 = ReactivateCardScreen.T;
                        ReactivateCardScreen reactivateCardScreen2 = this.f159416b;
                        return tki.g.a(reactivateCardScreen2, reactivateCardScreen2.R2(), v.k((RowDelegate) reactivateCardScreen2.Q.getValue(), (CellDetailsChevronDelegate) reactivateCardScreen2.R.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.cardReactivate_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        Clause clause = uiState.f159424b;
        if (clause == null || this.K.f65487a) {
            return;
        }
        NavBarWithToolbar navBarWithToolbar = e3().f141102b;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setNavigationButtonIcon(uiState.f159425c);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        b bVar = (b) R2();
        y yVar = bVar.f65490p;
        if (((f) ((j2) yVar.f22677a).getValue()).f159418a != j.CANNOT_ACTIVATE) {
            return super.F2();
        }
        bVar.H2(yVar, new p(9));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.K.f65487a) {
            return;
        }
        NavBarWithToolbar navBarWithToolbar = e3().f141102b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.card_reactivate_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.card_reactivate_title, null, null, 14));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        if (!this.K.f65487a) {
            ViewController.P2(this, rd0.e.b(e3().f141102b.f59410q), new l0(this, continuation, 23), 3);
        }
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsChevronDelegate) this.R.getValue()).f51821c), new i83.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.P.getValue();
    }

    public final g73.e e3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (g73.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
