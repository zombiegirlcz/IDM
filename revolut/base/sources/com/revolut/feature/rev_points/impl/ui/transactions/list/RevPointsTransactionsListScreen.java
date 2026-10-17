package com.revolut.feature.rev_points.impl.ui.transactions.list;

import aki.a;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.feature.rev_points.impl.R$layout;
import com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreen;
import com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import efm.r;
import grl.k9;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import koi.f;
import koi.j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlin.text.z;
import no.m;
import org.jetbrains.annotations.NotNull;
import pvk.i;
import q0c.g;
import q0c.h;
import q0c.o;
import q0c.p;
import te0.w;
import vc.s;
import wxb.l;
import yp0.v;
import yp0.y;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/transactions/list/RevPointsTransactionsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lq0c/o;", "Ldli/a;", "Lq0c/q;", "Lno/m;", "a", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsTransactionsListScreen extends ViewController<o> implements dli.a, m {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f83871e0 = {o0.f186429a.j(new h0(RevPointsTransactionsListScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsTransactionsListBinding;", 0))};
    public final RevPointsTransactionsListScreenContract$InputData K;
    public aki.a L;
    public final int M;
    public final boolean N;
    public final AnalyticsProduct.Retail O;
    public v P;
    public h Q;
    public db.a R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public List W;
    public TreeMap X;
    public final RowDelegate Y;
    public final FullScreenStateDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f83872a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ao.h f83873b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f83874d0;

    public static final class a extends koi.h {

        @NotNull
        public static final C0531a Companion = new C0531a();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public RecyclerView f83875j;
        public com.revolut.feature.rev_points.impl.ui.transactions.list.a k;

        /* JADX INFO: renamed from: com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreen$a$a, reason: collision with other inner class name */
        public static final class C0531a {
            private C0531a() {
            }
        }

        public a() {
            super(null, false, false, 1);
        }

        @Override // koi.h
        public final void c(List items) {
            RecyclerView recyclerView;
            Intrinsics.checkNotNullParameter(items, "items");
            com.revolut.feature.rev_points.impl.ui.transactions.list.a aVar = this.k;
            if (aVar != null && (recyclerView = this.f83875j) != null) {
                recyclerView.removeCallbacks(aVar);
            }
            this.k = null;
            f fVar = this.f186375h;
            if (!fVar.getItems().isEmpty() && !items.isEmpty()) {
                int iMax = Math.max(fVar.getItems().size(), items.size());
                int iMin = Math.min(fVar.getItems().size(), items.size());
                if (iMax > 500 && iMin * 3 < iMax) {
                    RecyclerView recyclerView2 = this.f83875j;
                    if (recyclerView2 == null) {
                        super.c(items);
                        return;
                    }
                    com.revolut.feature.rev_points.impl.ui.transactions.list.a aVar2 = new com.revolut.feature.rev_points.impl.ui.transactions.list.a(this, this, items);
                    this.k = aVar2;
                    recyclerView2.post(aVar2);
                    return;
                }
            }
            super.c(items);
        }

        @Override // koi.h, androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onAttachedToRecyclerView(recyclerView);
            this.f83875j = recyclerView;
        }

        @Override // koi.h, androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onDetachedFromRecyclerView(recyclerView);
            com.revolut.feature.rev_points.impl.ui.transactions.list.a aVar = this.k;
            if (aVar != null) {
                recyclerView.removeCallbacks(aVar);
            }
            this.k = null;
            this.f83875j = null;
        }
    }

    public RevPointsTransactionsListScreen(RevPointsTransactionsListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = a.c.f5958a;
        this.M = R$layout.screen_rev_points_transactions_list;
        final int i = 1;
        this.N = true;
        k9 k9Var = k9.RevPoints;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.O = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.W = f0.f322471a;
        this.X = new TreeMap();
        this.Y = new RowDelegate(null, null, 7);
        this.Z = new FullScreenStateDelegate();
        final int i2 = 0;
        this.f83872a0 = w.y0(new Function0(this) { // from class: q0c.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTransactionsListScreen f241227b;

            {
                this.f241227b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                RevPointsTransactionsListScreen revPointsTransactionsListScreen = this.f241227b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTransactionsListScreen.f83871e0;
                        RevPointsTransactionsListScreen revPointsTransactionsListScreen2 = this.f241227b;
                        return dli.f.a(revPointsTransactionsListScreen2, revPointsTransactionsListScreen2.k3(), zhm.v.k(new ListSubheaderDelegate(), revPointsTransactionsListScreen2.Y, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), revPointsTransactionsListScreen2.Z), R$id.revPointsTransactionsList_recyclerView, null, new RevPointsTransactionsListScreen.a(), null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsTransactionsListScreen.f83871e0;
                        qji.b bVarU2 = revPointsTransactionsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.transactions.list.di.RevPointsTransactionsListScreenInjector");
                        zxb.m mVar = (zxb.m) bVarU2;
                        zxb.e eVar = mVar.f326220b;
                        zxb.m mVar2 = mVar.f326221c;
                        RevPointsTransactionsListScreenContract$InputData revPointsTransactionsListScreenContract$InputData = revPointsTransactionsListScreen.K;
                        revPointsTransactionsListScreenContract$InputData.getClass();
                        return new zxb.v(eVar, mVar2, revPointsTransactionsListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsTransactionsListScreen.f83871e0;
                        return (p) ((zxb.v) revPointsTransactionsListScreen.c0.getValue()).d.get();
                }
            }
        });
        this.f83873b0 = s.t(this, q0c.c.f);
        this.c0 = w.y0(new Function0(this) { // from class: q0c.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTransactionsListScreen f241227b;

            {
                this.f241227b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                RevPointsTransactionsListScreen revPointsTransactionsListScreen = this.f241227b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTransactionsListScreen.f83871e0;
                        RevPointsTransactionsListScreen revPointsTransactionsListScreen2 = this.f241227b;
                        return dli.f.a(revPointsTransactionsListScreen2, revPointsTransactionsListScreen2.k3(), zhm.v.k(new ListSubheaderDelegate(), revPointsTransactionsListScreen2.Y, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), revPointsTransactionsListScreen2.Z), R$id.revPointsTransactionsList_recyclerView, null, new RevPointsTransactionsListScreen.a(), null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsTransactionsListScreen.f83871e0;
                        qji.b bVarU2 = revPointsTransactionsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.transactions.list.di.RevPointsTransactionsListScreenInjector");
                        zxb.m mVar = (zxb.m) bVarU2;
                        zxb.e eVar = mVar.f326220b;
                        zxb.m mVar2 = mVar.f326221c;
                        RevPointsTransactionsListScreenContract$InputData revPointsTransactionsListScreenContract$InputData = revPointsTransactionsListScreen.K;
                        revPointsTransactionsListScreenContract$InputData.getClass();
                        return new zxb.v(eVar, mVar2, revPointsTransactionsListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsTransactionsListScreen.f83871e0;
                        return (p) ((zxb.v) revPointsTransactionsListScreen.c0.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.f83874d0 = w.y0(new Function0(this) { // from class: q0c.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTransactionsListScreen f241227b;

            {
                this.f241227b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                RevPointsTransactionsListScreen revPointsTransactionsListScreen = this.f241227b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTransactionsListScreen.f83871e0;
                        RevPointsTransactionsListScreen revPointsTransactionsListScreen2 = this.f241227b;
                        return dli.f.a(revPointsTransactionsListScreen2, revPointsTransactionsListScreen2.k3(), zhm.v.k(new ListSubheaderDelegate(), revPointsTransactionsListScreen2.Y, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), revPointsTransactionsListScreen2.Z), R$id.revPointsTransactionsList_recyclerView, null, new RevPointsTransactionsListScreen.a(), null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsTransactionsListScreen.f83871e0;
                        qji.b bVarU2 = revPointsTransactionsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.transactions.list.di.RevPointsTransactionsListScreenInjector");
                        zxb.m mVar = (zxb.m) bVarU2;
                        zxb.e eVar = mVar.f326220b;
                        zxb.m mVar2 = mVar.f326221c;
                        RevPointsTransactionsListScreenContract$InputData revPointsTransactionsListScreenContract$InputData = revPointsTransactionsListScreen.K;
                        revPointsTransactionsListScreenContract$InputData.getClass();
                        return new zxb.v(eVar, mVar2, revPointsTransactionsListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsTransactionsListScreen.f83871e0;
                        return (p) ((zxb.v) revPointsTransactionsListScreen.c0.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        Long lN;
        q0c.q uiState = (q0c.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        boolean zIsEmpty = this.W.isEmpty();
        List list = uiState.f241241a;
        List<com.revolut.core.ui_kit.views.q> list2 = uiState.d;
        int i = 0;
        if (list != this.W) {
            this.W = list;
            TreeMap treeMap = new TreeMap();
            int i2 = 0;
            for (Object obj2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    zhm.v.s();
                    throw null;
                }
                j jVar = (j) obj2;
                if (jVar instanceof ListSubheaderDelegate.Model) {
                    String str = ((ListSubheaderDelegate.Model) jVar).f52708a;
                    if (a0.H(str, "DAILY_GROUP_HEADER_LIST_ID", false) && (lN = z.n(d0.e0(str, "DAILY_GROUP_HEADER_LIST_ID"))) != null) {
                        LocalDate localDate = oi0.d.Y(lN.longValue()).toLocalDate();
                        treeMap.put(Integer.valueOf(i2), YearMonth.of(localDate.getYear(), localDate.getMonth()).toString());
                    }
                }
                i2 = i3;
            }
            this.X = treeMap;
        }
        if (zIsEmpty && !this.W.isEmpty()) {
            e3().d.post(new o6.a(this, 11));
        }
        this.S = !list2.isEmpty();
        this.T = uiState.f241244g;
        g3();
        e3().f300836b.setItems(list2, uiState.e);
        Integer num = uiState.f;
        if (num != null) {
            final int iIntValue = num.intValue();
            d dVar = (d) k3();
            dVar.H2(dVar.f83893w, new q09.a(10));
            final int i5 = 0;
            e3().d.post(new Runnable(this) { // from class: q0c.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ RevPointsTransactionsListScreen f241224b;

                {
                    this.f241224b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i6 = i5;
                    int i21 = iIntValue;
                    RevPointsTransactionsListScreen revPointsTransactionsListScreen = this.f241224b;
                    switch (i6) {
                        case 0:
                            KProperty[] kPropertyArr = RevPointsTransactionsListScreen.f83871e0;
                            RecyclerView.LayoutManager layoutManager = revPointsTransactionsListScreen.e3().d.getLayoutManager();
                            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                            if (linearLayoutManager != null) {
                                linearLayoutManager.scrollToPositionWithOffset(i21, 0);
                            }
                            break;
                        default:
                            KProperty[] kPropertyArr2 = RevPointsTransactionsListScreen.f83871e0;
                            revPointsTransactionsListScreen.e3().d.smoothScrollToPosition(i21);
                            break;
                    }
                }
            });
        }
        if (!uiState.f241243c) {
            this.V = false;
            return;
        }
        if (this.V) {
            return;
        }
        this.V = true;
        String str2 = uiState.f241242b;
        if (str2 != null) {
            int size = list.size();
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (Intrinsics.f(((j) list.get(i)).getF55069b(), "TransactionListItem_".concat(str2))) {
                    break;
                } else {
                    i++;
                }
            }
            Integer numValueOf = i != -1 ? Integer.valueOf(i) : null;
            if (numValueOf != null) {
                final int iIntValue2 = numValueOf.intValue();
                d dVar2 = (d) k3();
                dVar2.H2(dVar2.f83893w, new q09.a(9));
                final int i6 = 1;
                e3().d.post(new Runnable(this) { // from class: q0c.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ RevPointsTransactionsListScreen f241224b;

                    {
                        this.f241224b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i66 = i6;
                        int i21 = iIntValue2;
                        RevPointsTransactionsListScreen revPointsTransactionsListScreen = this.f241224b;
                        switch (i66) {
                            case 0:
                                KProperty[] kPropertyArr = RevPointsTransactionsListScreen.f83871e0;
                                RecyclerView.LayoutManager layoutManager = revPointsTransactionsListScreen.e3().d.getLayoutManager();
                                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                                if (linearLayoutManager != null) {
                                    linearLayoutManager.scrollToPositionWithOffset(i21, 0);
                                }
                                break;
                            default:
                                KProperty[] kPropertyArr2 = RevPointsTransactionsListScreen.f83871e0;
                                revPointsTransactionsListScreen.e3().d.smoothScrollToPosition(i21);
                                break;
                        }
                    }
                });
            }
        }
    }

    @Override // com.revolut.kompot.navigable.a
    public final void M2(aki.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.L = aVar;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getF82762b0() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (zxb.v) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = e3().f300837c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        RevPointsTransactionsListScreenContract$InputData revPointsTransactionsListScreenContract$InputData = this.K;
        ResourceId resourceId = revPointsTransactionsListScreenContract$InputData.f83877b.f83881a;
        TextLocalisedClause textLocalisedClause = resourceId != null ? new TextLocalisedClause(resourceId, (List) null, (Style) null, (Clause) null, 30) : new TextLocalisedClause(R$string.rev_points_dashboard_transactions_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        if (revPointsTransactionsListScreenContract$InputData.f83877b.f83882b) {
            navBarWithToolbar.setSearchButtonActive(true);
            navBarWithToolbar.f59417v0 = true;
            navBarWithToolbar.setHint(new TextLocalisedClause(R$string.rev_points_transactions_search, null, null, 14));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ScreenContentRecyclerView screenContentRecyclerView = e3().d;
        v vVar = this.P;
        if (vVar == null) {
            Intrinsics.r("scrollListener");
            throw null;
        }
        screenContentRecyclerView.removeOnScrollListener(vVar);
        ScreenContentRecyclerView screenContentRecyclerView2 = e3().d;
        h hVar = this.Q;
        if (hVar == null) {
            Intrinsics.r("monthScrollListener");
            throw null;
        }
        screenContentRecyclerView2.removeOnScrollListener(hVar);
        db.a aVar = this.R;
        if (aVar != null) {
            e3().f300837c.removeOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) aVar);
        }
        this.R = null;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView revPointsTransactionsListRecyclerView = e3().d;
        Intrinsics.checkNotNullExpressionValue(revPointsTransactionsListRecyclerView, "revPointsTransactionsListRecyclerView");
        this.P = y.a(revPointsTransactionsListRecyclerView, 100, true, new q03.h(this, 5));
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().f300837c.f59410q), null, new pnb.b(this, continuation, 24), 3);
        r rVarDebounce = e3().f300837c.f59409p.f57337m.debounce(400L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        com.revolut.kompot.navigable.a.g2(this, vkm.q.q(new i(rd0.e.b(rVarDebounce), 7)), null, new q0c.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Y.f53218h), null, new q0c.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Z.f52371h.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().f300836b.f58882b), null, new q0c.e(this, continuation, 1), 3);
        this.Q = new h(this);
        ScreenContentRecyclerView screenContentRecyclerView = e3().d;
        h hVar = this.Q;
        if (hVar == null) {
            Intrinsics.r("monthScrollListener");
            throw null;
        }
        screenContentRecyclerView.addOnScrollListener(hVar);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().f300837c.X0), null, new q0c.e(this, continuation, 2), 3);
        db.a aVar = new db.a(this, 3);
        e3().f300837c.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) aVar);
        this.R = aVar;
    }

    public final void d3() {
        RecyclerView.LayoutManager layoutManager = e3().d.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        Integer numValueOf = Integer.valueOf(iFindFirstVisibleItemPosition);
        if (iFindFirstVisibleItemPosition == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            Map.Entry entryFloorEntry = this.X.floorEntry(numValueOf);
            String monthId = entryFloorEntry != null ? (String) entryFloorEntry.getValue() : null;
            if (monthId == null) {
                return;
            }
            d dVar = (d) k3();
            dVar.getClass();
            Intrinsics.checkNotNullParameter(monthId, "monthId");
            dVar.H2(dVar.f83893w, new kp7.q(YearMonth.parse(monthId), 1));
        }
    }

    public final l e3() {
        ViewBinding value = this.f83873b0.getValue(this, f83871e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final p k3() {
        return (p) this.f83874d0.getValue();
    }

    public final void g3() {
        boolean z = false;
        boolean z3 = e3().f300837c.getExpandRatio() == BitmapDescriptorFactory.HUE_RED;
        SlidingFromTopViewContainer slidingFromTopViewContainer = e3().e;
        if (this.S && ((z3 || this.T) && !this.U)) {
            z = true;
        }
        slidingFromTopViewContainer.a(z);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f83872a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: n2, reason: from getter */
    public final aki.a getL() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
