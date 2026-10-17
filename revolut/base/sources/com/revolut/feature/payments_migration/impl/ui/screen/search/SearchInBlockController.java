package com.revolut.feature.payments_migration.impl.ui.screen.search;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.payments_migration.impl.R$string;
import com.revolut.feature.payments_migration.impl.ui.screen.search.SearchInBlockController;
import com.revolut.feature.payments_migration.impl.ui.screen.search.SearchInBlockControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import d6a.j;
import grl.k9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import p0l.d;
import p6a.c;
import p6a.f;
import p6a.g;
import p6a.i;
import te0.w;
import vc.s;
import xki.e;
import yp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/ui/screen/search/SearchInBlockController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lp6a/g;", "Ldli/a;", "Lp6a/i;", "Lno/m;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SearchInBlockController extends ViewController<g> implements dli.a, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SearchInBlockController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final SearchInBlockControllerContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final h M;
    public final j N;
    public final Object O;
    public final Object P;
    public final int Q;
    public final Object R;

    public SearchInBlockController(SearchInBlockControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = s.t(this, p6a.b.f);
        this.N = new j();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: p6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchInBlockController f233234b;

            {
                this.f233234b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SearchInBlockController searchInBlockController = this.f233234b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SearchInBlockController.S;
                        return (f) ((u5a.h) searchInBlockController.P.getValue()).f277433c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SearchInBlockController.S;
                        qji.b bVarU2 = searchInBlockController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payments_migration.impl.ui.screen.search.di.SearchInBlockControllerComponent.Injector");
                        u5a.g gVar = (u5a.g) bVarU2;
                        u5a.f fVar = gVar.f277428a;
                        u5a.g gVar2 = gVar.f277429b;
                        SearchInBlockControllerContract$InputData searchInBlockControllerContract$InputData = searchInBlockController.K;
                        searchInBlockControllerContract$InputData.getClass();
                        return new u5a.h(fVar, gVar2, searchInBlockControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SearchInBlockController.S;
                        SearchInBlockController searchInBlockController2 = this.f233234b;
                        return dli.f.a(searchInBlockController2, searchInBlockController2.R2(), searchInBlockController2.N.a(), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: p6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchInBlockController f233234b;

            {
                this.f233234b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SearchInBlockController searchInBlockController = this.f233234b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SearchInBlockController.S;
                        return (f) ((u5a.h) searchInBlockController.P.getValue()).f277433c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SearchInBlockController.S;
                        qji.b bVarU2 = searchInBlockController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payments_migration.impl.ui.screen.search.di.SearchInBlockControllerComponent.Injector");
                        u5a.g gVar = (u5a.g) bVarU2;
                        u5a.f fVar = gVar.f277428a;
                        u5a.g gVar2 = gVar.f277429b;
                        SearchInBlockControllerContract$InputData searchInBlockControllerContract$InputData = searchInBlockController.K;
                        searchInBlockControllerContract$InputData.getClass();
                        return new u5a.h(fVar, gVar2, searchInBlockControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SearchInBlockController.S;
                        SearchInBlockController searchInBlockController2 = this.f233234b;
                        return dli.f.a(searchInBlockController2, searchInBlockController2.R2(), searchInBlockController2.N.a(), 0, null, null, null, 60);
                }
            }
        });
        this.Q = R$layout.screen_recycler_navbar;
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: p6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchInBlockController f233234b;

            {
                this.f233234b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SearchInBlockController searchInBlockController = this.f233234b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SearchInBlockController.S;
                        return (f) ((u5a.h) searchInBlockController.P.getValue()).f277433c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SearchInBlockController.S;
                        qji.b bVarU2 = searchInBlockController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payments_migration.impl.ui.screen.search.di.SearchInBlockControllerComponent.Injector");
                        u5a.g gVar = (u5a.g) bVarU2;
                        u5a.f fVar = gVar.f277428a;
                        u5a.g gVar2 = gVar.f277429b;
                        SearchInBlockControllerContract$InputData searchInBlockControllerContract$InputData = searchInBlockController.K;
                        searchInBlockControllerContract$InputData.getClass();
                        return new u5a.h(fVar, gVar2, searchInBlockControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SearchInBlockController.S;
                        SearchInBlockController searchInBlockController2 = this.f233234b;
                        return dli.f.a(searchInBlockController2, searchInBlockController2.R2(), searchInBlockController2.N.a(), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (uiState.f233243b.length() == 0) {
            d3().f174539b.i0();
        }
        p6a.h hVar = qVar instanceof p6a.h ? (p6a.h) qVar : null;
        if (hVar == null || !hVar.f233241a) {
            return;
        }
        d3().f174540c.scrollToPosition(0);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u5a.h) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_migration_search_title, u.c(this.K.f80285b), null, 12);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.payments_migration_search_hint, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        y.g(recyclerView, m2());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new d(this, continuation, 9), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), new c(this, continuation, 0), 3);
        j jVar = this.N;
        ViewController.P2(this, rd0.e.b(jVar.f111473a.f52371h.f121375b), new p6a.d(this, null), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(jVar.f.f53608c), rd0.e.b(jVar.f111475c.q()), rd0.e.b(jVar.d.f53218h)), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(jVar.e.d), new c(this, continuation, 2), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
