package com.revolut.feature.travel.miles.impl.ui.screen.transaction;

import aii.q;
import aki.a;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.google.android.material.sidesheet.b;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.screen.transaction.TravelMilesTransactionsListScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.ArrayList;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nfj.j2;
import nfj.l;
import nhg.f0;
import nig.c;
import nig.g;
import rfg.e;
import te0.w;
import ufg.r;
import vc.s;
import yp0.v;
import yp0.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/transaction/TravelMilesTransactionsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lnig/c;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesTransactionsListScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TravelMilesTransactionsListScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenMilesTransactionsListBinding;", 0))};
    public final Object O;
    public final Object P;
    public final Object R;
    public v S;
    public boolean T;
    public aki.a K = a.c.f5958a;
    public final int L = R$layout.screen_miles_transactions_list;
    public final h M = s.t(this, a.f);
    public final boolean N = true;
    public final RowDelegate Q = new RowDelegate(null, null, 7);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, e.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/miles/impl/databinding/ScreenMilesTransactionsListBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.milesTransactionsList_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.milesTransactionsList_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    return new e((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar, screenContentRecyclerView);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public TravelMilesTransactionsListScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: nig.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesTransactionsListScreen f216101b;

            {
                this.f216101b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelMilesTransactionsListScreen travelMilesTransactionsListScreen = this.f216101b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesTransactionsListScreen.U;
                        return (b) ((ufg.w) travelMilesTransactionsListScreen.P.getValue()).f279801b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesTransactionsListScreen.U;
                        qji.b bVarU2 = travelMilesTransactionsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.transaction.di.TravelMilesTransactionsListScreenInjector");
                        r rVar = (r) bVarU2;
                        ufg.g gVar = rVar.f279787b;
                        r rVar2 = rVar.f279788c;
                        ufg.w wVar = new ufg.w();
                        int i3 = 15;
                        wVar.f279800a = e4m.b.b(new r7d.w(gVar, rVar2, wVar, 1, i3));
                        wVar.f279801b = e4m.b.b(new r7d.w(gVar, rVar2, wVar, 0, i3));
                        return wVar;
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesTransactionsListScreen.U;
                        TravelMilesTransactionsListScreen travelMilesTransactionsListScreen2 = this.f216101b;
                        return dli.f.a(travelMilesTransactionsListScreen2, travelMilesTransactionsListScreen2.R2(), zhm.v.k(travelMilesTransactionsListScreen2.Q, new RowLoadingDelegate()), R$id.milesTransactionsList_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: nig.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesTransactionsListScreen f216101b;

            {
                this.f216101b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelMilesTransactionsListScreen travelMilesTransactionsListScreen = this.f216101b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesTransactionsListScreen.U;
                        return (b) ((ufg.w) travelMilesTransactionsListScreen.P.getValue()).f279801b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesTransactionsListScreen.U;
                        qji.b bVarU2 = travelMilesTransactionsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.transaction.di.TravelMilesTransactionsListScreenInjector");
                        r rVar = (r) bVarU2;
                        ufg.g gVar = rVar.f279787b;
                        r rVar2 = rVar.f279788c;
                        ufg.w wVar = new ufg.w();
                        int i3 = 15;
                        wVar.f279800a = e4m.b.b(new r7d.w(gVar, rVar2, wVar, 1, i3));
                        wVar.f279801b = e4m.b.b(new r7d.w(gVar, rVar2, wVar, 0, i3));
                        return wVar;
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesTransactionsListScreen.U;
                        TravelMilesTransactionsListScreen travelMilesTransactionsListScreen2 = this.f216101b;
                        return dli.f.a(travelMilesTransactionsListScreen2, travelMilesTransactionsListScreen2.R2(), zhm.v.k(travelMilesTransactionsListScreen2.Q, new RowLoadingDelegate()), R$id.milesTransactionsList_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: nig.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesTransactionsListScreen f216101b;

            {
                this.f216101b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelMilesTransactionsListScreen travelMilesTransactionsListScreen = this.f216101b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesTransactionsListScreen.U;
                        return (b) ((ufg.w) travelMilesTransactionsListScreen.P.getValue()).f279801b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesTransactionsListScreen.U;
                        qji.b bVarU2 = travelMilesTransactionsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.transaction.di.TravelMilesTransactionsListScreenInjector");
                        r rVar = (r) bVarU2;
                        ufg.g gVar = rVar.f279787b;
                        r rVar2 = rVar.f279788c;
                        ufg.w wVar = new ufg.w();
                        int i32 = 15;
                        wVar.f279800a = e4m.b.b(new r7d.w(gVar, rVar2, wVar, 1, i32));
                        wVar.f279801b = e4m.b.b(new r7d.w(gVar, rVar2, wVar, 0, i32));
                        return wVar;
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesTransactionsListScreen.U;
                        TravelMilesTransactionsListScreen travelMilesTransactionsListScreen2 = this.f216101b;
                        return dli.f.a(travelMilesTransactionsListScreen2, travelMilesTransactionsListScreen2.R2(), zhm.v.k(travelMilesTransactionsListScreen2.Q, new RowLoadingDelegate()), R$id.milesTransactionsList_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        int i = 0;
        if (!uiState.f216099c) {
            this.T = false;
            return;
        }
        if (this.T) {
            return;
        }
        this.T = true;
        String str = uiState.f216098b;
        if (str != null) {
            ArrayList arrayList = uiState.f216097a;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (Intrinsics.f(((j) arrayList.get(i)).getF52324a(), "TransactionListItem_".concat(str))) {
                    break;
                } else {
                    i++;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (i == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                g gVar = (g) R2();
                gVar.H2(gVar.f216104q, new f0(7));
                d3().f253788c.post(new b(this, iIntValue, 10));
            }
        }
    }

    @Override // com.revolut.kompot.navigable.a
    public final void M2(aki.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.K = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ufg.w) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ScreenContentRecyclerView screenContentRecyclerView = d3().f253788c;
        v vVar = this.S;
        if (vVar != null) {
            screenContentRecyclerView.removeOnScrollListener(vVar);
        } else {
            Intrinsics.r("scrollListener");
            throw null;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f253787b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.miles_home_section_transactions_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.miles_home_section_transactions_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new j2(this, null, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f53218h), null, new nig.e(this, null), 3);
        ScreenContentRecyclerView milesTransactionsListRecyclerView = d3().f253788c;
        Intrinsics.checkNotNullExpressionValue(milesTransactionsListRecyclerView, "milesTransactionsListRecyclerView");
        this.S = y.a(milesTransactionsListRecyclerView, 20, true, new l(this, 12));
    }

    public final e d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final nig.b R2() {
        return (nig.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: n2, reason: from getter */
    public final aki.a getK() {
        return this.K;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
