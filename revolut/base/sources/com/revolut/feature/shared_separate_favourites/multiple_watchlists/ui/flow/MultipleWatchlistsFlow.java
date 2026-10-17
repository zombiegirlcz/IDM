package com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.R$id;
import com.revolut.feature.shared_separate_favourites.R$layout;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.MultipleWatchlistsFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import vgd.c;
import wa3.d;
import wb3.k;
import wgd.f;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/flow/MultipleWatchlistsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lski/a;", "Lwgd/h;", "Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/flow/MultipleWatchlistsFlowContract$PagerItem;", "Companion", "a", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MultipleWatchlistsFlow extends ViewController<q> implements ski.a {
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(MultipleWatchlistsFlow.class, "binding", "getBinding()Lcom/revolut/feature/shared_separate_favourites/databinding/FlowMultipleWatchlistsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final String Q = "edit-icon-id";

    /* JADX INFO: renamed from: com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.MultipleWatchlistsFlow$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public MultipleWatchlistsFlow(MultipleWatchlistsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.flow_multiple_watchlists;
        this.L = s.t(this, wgd.b.f);
        this.M = w.y0(new w83.a(this, inputData, 15));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: wgd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultipleWatchlistsFlow f297308b;

            {
                this.f297308b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MultipleWatchlistsFlow multipleWatchlistsFlow = this.f297308b;
                switch (i2) {
                    case 0:
                        MultipleWatchlistsFlow.Companion companion = MultipleWatchlistsFlow.INSTANCE;
                        return (f) ((vgd.c) multipleWatchlistsFlow.M.getValue()).d.get();
                    default:
                        MultipleWatchlistsFlow.Companion companion2 = MultipleWatchlistsFlow.INSTANCE;
                        return czi.c.c(multipleWatchlistsFlow, R$id.flowMultipleWatchlists_Pager, multipleWatchlistsFlow.R2());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: wgd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultipleWatchlistsFlow f297308b;

            {
                this.f297308b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MultipleWatchlistsFlow multipleWatchlistsFlow = this.f297308b;
                switch (i22) {
                    case 0:
                        MultipleWatchlistsFlow.Companion companion = MultipleWatchlistsFlow.INSTANCE;
                        return (f) ((vgd.c) multipleWatchlistsFlow.M.getValue()).d.get();
                    default:
                        MultipleWatchlistsFlow.Companion companion2 = MultipleWatchlistsFlow.INSTANCE;
                        return czi.c.c(multipleWatchlistsFlow, R$id.flowMultipleWatchlists_Pager, multipleWatchlistsFlow.R2());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        wgd.h uiState = (wgd.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().d.setItems(uiState.f297314a, uiState.f297315b);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        MultipleWatchlistsFlowContract$PagerItem pagerItem2 = (MultipleWatchlistsFlowContract$PagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        f fVarR2 = R2();
        String id10 = pagerItem2.getF94249a();
        b bVar = (b) fVarR2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        bVar.H2(bVar.f86918s, new k(id10, 4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (c) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f183950b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.watchlists_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setMenuItems(u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, Q, new ResourceImage(R$drawable.uikit_icn_24_pen, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        DraggableTabsView draggableTabsView = d3().d;
        draggableTabsView.k(d3().f183951c);
        Continuation continuation = null;
        ViewController.P2(this, new d(rd0.e.b(draggableTabsView.n()), 7), new wgd.c(this, continuation, 0), 3);
        NavBarWithToolbar navBarWithToolbar = d3().f183950b;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new wgd.c(this, continuation, 1), 3);
        ViewController.P2(this, new d(rd0.e.b(navBarWithToolbar.o.f57403b), 8), new wgd.c(this, continuation, 2), 3);
    }

    public final kgd.a d3() {
        ViewBinding value = this.L.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (kgd.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f d() {
        return (f) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ski.c) this.O.getValue();
    }
}
