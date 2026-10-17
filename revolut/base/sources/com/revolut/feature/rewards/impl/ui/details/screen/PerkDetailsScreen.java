package com.revolut.feature.rewards.impl.ui.details.screen;

import android.view.View;
import au0.m0;
import aw0.e;
import aw0.g;
import aw0.h;
import aw0.n6;
import aw0.u4;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellBulletDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.MapDelegate;
import com.revolut.core.ui_kit.delegates.NewsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.StaggeredGridItemDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.rewards.impl.R$id;
import com.revolut.feature.rewards.impl.R$layout;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData;
import com.revolut.feature.rewards.impl.ui.details.screen.PerkDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import mic.g0;
import mic.i;
import mic.j;
import mic.u;
import mic.w;
import mic.x;
import mic.y;
import no.m;
import oic.b;
import oic.c;
import oic.d;
import z92.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/details/screen/PerkDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmic/w;", "Ldli/a;", "Lmic/y;", "Lno/m;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PerkDetailsScreen extends ViewController<w> implements a, m {
    public final /* synthetic */ zhc.a K;
    public final PerkDetailsFlowContract$InputData L;
    public NavBarWithBigTile M;
    public ActionFooterView N;
    public final PlainTextDelegate O;
    public final RowDelegate P;
    public final TextDelegate Q;
    public final LargeActionButtonDelegate R;
    public final MapDelegate S;
    public final CellDetailsDelegate T;
    public final ListSubheaderDelegate U;
    public final CounterTextDelegate V;
    public final Object W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f84948a0;

    public PerkDetailsScreen(PerkDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = zhc.a.f322393a;
        this.L = inputData;
        this.O = new PlainTextDelegate();
        this.P = new RowDelegate(null, null, 7);
        this.Q = new TextDelegate();
        this.R = new LargeActionButtonDelegate();
        this.S = new MapDelegate();
        this.T = new CellDetailsDelegate();
        this.U = new ListSubheaderDelegate();
        this.V = new CounterTextDelegate();
        final int i = 0;
        this.W = te0.w.y0(new Function0(this) { // from class: mic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerkDetailsScreen f205650b;

            {
                this.f205650b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PerkDetailsScreen perkDetailsScreen = this.f205650b;
                switch (i2) {
                    case 0:
                        return (lgc.a) ((whc.o) perkDetailsScreen.Y.getValue()).d.get();
                    case 1:
                        qji.b bVarU2 = perkDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rewards.impl.ui.details.screen.di.PerkDetailsScreenInjector");
                        whc.n nVar = (whc.n) bVarU2;
                        return new whc.o(nVar.f297548c, nVar.d);
                    case 2:
                        return (x) ((whc.o) perkDetailsScreen.Y.getValue()).f297558c.get();
                    default:
                        PerkDetailsScreen perkDetailsScreen2 = this.f205650b;
                        x xVarR2 = perkDetailsScreen2.R2();
                        s0 s0Var = new s0(13);
                        s0Var.a(perkDetailsScreen2.O);
                        s0Var.a(perkDetailsScreen2.P);
                        s0Var.a(perkDetailsScreen2.Q);
                        s0Var.a(perkDetailsScreen2.R);
                        s0Var.a(perkDetailsScreen2.S);
                        s0Var.a(perkDetailsScreen2.T);
                        s0Var.a(perkDetailsScreen2.U);
                        s0Var.a(perkDetailsScreen2.V);
                        s0Var.a(new ListCellBulletDelegate());
                        s0Var.a(new ListSubheaderLoadingDelegate());
                        s0Var.a(new NewsLoadingDelegate());
                        s0Var.a(new RowLoadingDelegate());
                        bkc.f fVar = (bkc.f) ((lgc.a) perkDetailsScreen2.W.getValue());
                        StaggeredGridItemDelegate.Companion companion = StaggeredGridItemDelegate.INSTANCE;
                        List listK = zhm.v.k(fVar.e, fVar.f16352a, fVar.f, fVar.f16355g, fVar.f16353b, fVar.f16354c, fVar.d);
                        companion.getClass();
                        s0Var.b(StaggeredGridItemDelegate.Companion.a(listK).toArray(new koi.k[0]));
                        ArrayList arrayList = s0Var.f186433a;
                        return dli.f.a(perkDetailsScreen2, xVarR2, zhm.v.k(arrayList.toArray(new koi.k[arrayList.size()])), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.X = R$layout.screen_perk_details;
        final int i2 = 1;
        this.Y = te0.w.y0(new Function0(this) { // from class: mic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerkDetailsScreen f205650b;

            {
                this.f205650b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PerkDetailsScreen perkDetailsScreen = this.f205650b;
                switch (i22) {
                    case 0:
                        return (lgc.a) ((whc.o) perkDetailsScreen.Y.getValue()).d.get();
                    case 1:
                        qji.b bVarU2 = perkDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rewards.impl.ui.details.screen.di.PerkDetailsScreenInjector");
                        whc.n nVar = (whc.n) bVarU2;
                        return new whc.o(nVar.f297548c, nVar.d);
                    case 2:
                        return (x) ((whc.o) perkDetailsScreen.Y.getValue()).f297558c.get();
                    default:
                        PerkDetailsScreen perkDetailsScreen2 = this.f205650b;
                        x xVarR2 = perkDetailsScreen2.R2();
                        s0 s0Var = new s0(13);
                        s0Var.a(perkDetailsScreen2.O);
                        s0Var.a(perkDetailsScreen2.P);
                        s0Var.a(perkDetailsScreen2.Q);
                        s0Var.a(perkDetailsScreen2.R);
                        s0Var.a(perkDetailsScreen2.S);
                        s0Var.a(perkDetailsScreen2.T);
                        s0Var.a(perkDetailsScreen2.U);
                        s0Var.a(perkDetailsScreen2.V);
                        s0Var.a(new ListCellBulletDelegate());
                        s0Var.a(new ListSubheaderLoadingDelegate());
                        s0Var.a(new NewsLoadingDelegate());
                        s0Var.a(new RowLoadingDelegate());
                        bkc.f fVar = (bkc.f) ((lgc.a) perkDetailsScreen2.W.getValue());
                        StaggeredGridItemDelegate.Companion companion = StaggeredGridItemDelegate.INSTANCE;
                        List listK = zhm.v.k(fVar.e, fVar.f16352a, fVar.f, fVar.f16355g, fVar.f16353b, fVar.f16354c, fVar.d);
                        companion.getClass();
                        s0Var.b(StaggeredGridItemDelegate.Companion.a(listK).toArray(new koi.k[0]));
                        ArrayList arrayList = s0Var.f186433a;
                        return dli.f.a(perkDetailsScreen2, xVarR2, zhm.v.k(arrayList.toArray(new koi.k[arrayList.size()])), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Z = te0.w.y0(new Function0(this) { // from class: mic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerkDetailsScreen f205650b;

            {
                this.f205650b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PerkDetailsScreen perkDetailsScreen = this.f205650b;
                switch (i22) {
                    case 0:
                        return (lgc.a) ((whc.o) perkDetailsScreen.Y.getValue()).d.get();
                    case 1:
                        qji.b bVarU2 = perkDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rewards.impl.ui.details.screen.di.PerkDetailsScreenInjector");
                        whc.n nVar = (whc.n) bVarU2;
                        return new whc.o(nVar.f297548c, nVar.d);
                    case 2:
                        return (x) ((whc.o) perkDetailsScreen.Y.getValue()).f297558c.get();
                    default:
                        PerkDetailsScreen perkDetailsScreen2 = this.f205650b;
                        x xVarR2 = perkDetailsScreen2.R2();
                        s0 s0Var = new s0(13);
                        s0Var.a(perkDetailsScreen2.O);
                        s0Var.a(perkDetailsScreen2.P);
                        s0Var.a(perkDetailsScreen2.Q);
                        s0Var.a(perkDetailsScreen2.R);
                        s0Var.a(perkDetailsScreen2.S);
                        s0Var.a(perkDetailsScreen2.T);
                        s0Var.a(perkDetailsScreen2.U);
                        s0Var.a(perkDetailsScreen2.V);
                        s0Var.a(new ListCellBulletDelegate());
                        s0Var.a(new ListSubheaderLoadingDelegate());
                        s0Var.a(new NewsLoadingDelegate());
                        s0Var.a(new RowLoadingDelegate());
                        bkc.f fVar = (bkc.f) ((lgc.a) perkDetailsScreen2.W.getValue());
                        StaggeredGridItemDelegate.Companion companion = StaggeredGridItemDelegate.INSTANCE;
                        List listK = zhm.v.k(fVar.e, fVar.f16352a, fVar.f, fVar.f16355g, fVar.f16353b, fVar.f16354c, fVar.d);
                        companion.getClass();
                        s0Var.b(StaggeredGridItemDelegate.Companion.a(listK).toArray(new koi.k[0]));
                        ArrayList arrayList = s0Var.f186433a;
                        return dli.f.a(perkDetailsScreen2, xVarR2, zhm.v.k(arrayList.toArray(new koi.k[arrayList.size()])), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.f84948a0 = te0.w.y0(new Function0(this) { // from class: mic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerkDetailsScreen f205650b;

            {
                this.f205650b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PerkDetailsScreen perkDetailsScreen = this.f205650b;
                switch (i22) {
                    case 0:
                        return (lgc.a) ((whc.o) perkDetailsScreen.Y.getValue()).d.get();
                    case 1:
                        qji.b bVarU2 = perkDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rewards.impl.ui.details.screen.di.PerkDetailsScreenInjector");
                        whc.n nVar = (whc.n) bVarU2;
                        return new whc.o(nVar.f297548c, nVar.d);
                    case 2:
                        return (x) ((whc.o) perkDetailsScreen.Y.getValue()).f297558c.get();
                    default:
                        PerkDetailsScreen perkDetailsScreen2 = this.f205650b;
                        x xVarR2 = perkDetailsScreen2.R2();
                        s0 s0Var = new s0(13);
                        s0Var.a(perkDetailsScreen2.O);
                        s0Var.a(perkDetailsScreen2.P);
                        s0Var.a(perkDetailsScreen2.Q);
                        s0Var.a(perkDetailsScreen2.R);
                        s0Var.a(perkDetailsScreen2.S);
                        s0Var.a(perkDetailsScreen2.T);
                        s0Var.a(perkDetailsScreen2.U);
                        s0Var.a(perkDetailsScreen2.V);
                        s0Var.a(new ListCellBulletDelegate());
                        s0Var.a(new ListSubheaderLoadingDelegate());
                        s0Var.a(new NewsLoadingDelegate());
                        s0Var.a(new RowLoadingDelegate());
                        bkc.f fVar = (bkc.f) ((lgc.a) perkDetailsScreen2.W.getValue());
                        StaggeredGridItemDelegate.Companion companion = StaggeredGridItemDelegate.INSTANCE;
                        List listK = zhm.v.k(fVar.e, fVar.f16352a, fVar.f, fVar.f16355g, fVar.f16353b, fVar.f16354c, fVar.d);
                        companion.getClass();
                        s0Var.b(StaggeredGridItemDelegate.Companion.a(listK).toArray(new koi.k[0]));
                        ArrayList arrayList = s0Var.f186433a;
                        return dli.f.a(perkDetailsScreen2, xVarR2, zhm.v.k(arrayList.toArray(new koi.k[arrayList.size()])), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        NavBarWithBigTile navBarWithBigTile;
        y uiState = (y) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        u4 u4Var = uiState.f205683b;
        if (u4Var != null && (navBarWithBigTile = this.M) != null) {
            f.u(navBarWithBigTile, u4Var);
        }
        d dVar = uiState.f205684c;
        if (dVar instanceof oic.a) {
            ActionFooterView actionFooterView = this.N;
            if (actionFooterView != null) {
                actionFooterView.setVisibility(0);
            }
            ActionFooterView actionFooterView2 = this.N;
            if (actionFooterView2 != null) {
                oic.a aVar = (oic.a) dVar;
                actionFooterView2.setModel(new e(false, null, null, new n6(aVar.f225593a, LargeActionButton.ButtonStyle.f58725a, aVar.f225595c, null, aVar.f225594b, null, null, 920), null, null, 55));
                return;
            }
            return;
        }
        if (!(dVar instanceof c)) {
            if (!(dVar instanceof b) && dVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            ActionFooterView actionFooterView3 = this.N;
            if (actionFooterView3 != null) {
                actionFooterView3.setVisibility(8);
                return;
            }
            return;
        }
        ActionFooterView actionFooterView4 = this.N;
        if (actionFooterView4 != null) {
            actionFooterView4.setVisibility(0);
        }
        c cVar = (c) dVar;
        ?? r110 = cVar.f225598b;
        ?? r3 = cVar.f225597a;
        if (!cVar.e) {
            ActionFooterView actionFooterView5 = this.N;
            if (actionFooterView5 != null) {
                actionFooterView5.setModel(new g(new n6(r3, LargeActionButton.ButtonStyle.f58725a, cVar.f225599c, null, cVar.f225600g, null, null, 920), new n6(r110, LargeActionButton.ButtonStyle.f58726b, cVar.d, null, cVar.f225601h, null, null, 920), (Clause) null, (aw0.f) null, 25));
                return;
            }
            return;
        }
        ActionFooterView actionFooterView6 = this.N;
        if (actionFooterView6 != null) {
            n6 n6Var = new n6(r3, LargeActionButton.ButtonStyle.e, cVar.f225599c, null, cVar.f225600g, null, null, 920);
            LargeActionButton.ButtonStyle buttonStyle = cVar.f;
            if (buttonStyle == null) {
                buttonStyle = LargeActionButton.ButtonStyle.f;
            }
            actionFooterView6.setModel(new h(false, n6Var, new n6(r110, buttonStyle, cVar.d, null, cVar.f225601h, null, null, 920), null, null, null, 121));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((g0) R2()).C2(u.f205680a);
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        this.K.getClass();
        return new AnalyticsProduct.Retail(zhc.a.f322394b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (whc.o) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) view.findViewById(R$id.navBarBigTile);
        this.M = navBarWithBigTile;
        if (navBarWithBigTile != null) {
            navBarWithBigTile.setBackgroundOverlayDecoration(m0.NONE);
        }
        this.N = (ActionFooterView) view.findViewById(R$id.actionFooterView);
        ((dli.c) this.f84948a0.getValue()).h().setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        ihm.f fVar;
        ihm.f fVar2;
        ihm.f fVar3;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = this.M;
        Continuation continuation = null;
        if (navBarWithBigTile != null && (fVar3 = navBarWithBigTile.f59357t) != null) {
            ViewController.P2(this, rd0.e.b(fVar3), new mic.c(this, continuation, 3), 3);
        }
        PlainTextDelegate plainTextDelegate = this.O;
        ViewController.P2(this, rd0.e.b(plainTextDelegate.f.f121375b), new mic.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(plainTextDelegate.d.f121375b), new mic.f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.R.d.f121375b), new mic.g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d), new mic.f(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.f53218h), new mic.h(this, null), 3);
        ViewController.P2(this, new lt.d(rd0.e.b(((bkc.f) ((lgc.a) this.W.getValue())).f16353b.f53608c), 25), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.d), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52762c), new mic.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.V.d), new mic.d(this, null), 3);
        ActionFooterView actionFooterView = this.N;
        if (actionFooterView != null && (fVar2 = actionFooterView.f) != null) {
            ViewController.P2(this, rd0.e.b(fVar2), new mic.c(this, continuation, 1), 3);
        }
        ActionFooterView actionFooterView2 = this.N;
        if (actionFooterView2 == null || (fVar = actionFooterView2.f58955g) == null) {
            return;
        }
        ViewController.P2(this, rd0.e.b(fVar), new mic.c(this, continuation, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final x R2() {
        return (x) this.Z.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f84948a0.getValue();
    }
}
