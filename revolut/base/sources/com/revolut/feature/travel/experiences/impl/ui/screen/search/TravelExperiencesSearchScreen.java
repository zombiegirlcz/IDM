package com.revolut.feature.travel.experiences.impl.ui.screen.search;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import e0m.e;
import efm.r;
import frl.a;
import grl.k9;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jv.o;
import jyk.g0;
import k16.d;
import k22.c;
import k3g.k;
import k3g.l;
import k3g.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sji.b;
import te0.w;
import vc.s;
import z0g.l0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/search/TravelExperiencesSearchScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lk3g/m;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/search/TravelExperiencesSearchScreenContract$InputData;", "Lk3g/k;", "Lno/m;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesSearchScreen extends BaseRecyclerViewScreen<m, TravelExperiencesSearchScreenContract$InputData, k> implements no.m {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f93130h0 = {o0.f186429a.j(new h0(TravelExperiencesSearchScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenExperiencesSearchBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final int V;
    public final int W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f93131a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f93132b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final h f93133d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f93134e0;
    public final Object f0;
    public final Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelExperiencesSearchScreen(TravelExperiencesSearchScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137510y;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.V = R$layout.screen_experiences_search;
        this.W = R$id.experiencesSearch_recyclerView;
        this.X = true;
        Lazy lazyY0 = w.y0(new d(15));
        this.Y = lazyY0;
        Lazy lazyY02 = w.y0(new d(16));
        this.Z = lazyY02;
        Lazy lazyY03 = w.y0(new d(17));
        this.f93131a0 = lazyY03;
        Lazy lazyY04 = w.y0(new d(18));
        this.f93132b0 = lazyY04;
        Lazy lazyY05 = w.y0(new d(19));
        this.c0 = lazyY05;
        this.f93133d0 = s.t(this, k3g.a.f);
        this.f93134e0 = v.k((RowDelegate) lazyY0.getValue(), (RowLoadingDelegate) lazyY02.getValue(), (ListSubheaderLoadingDelegate) lazyY04.getValue(), (ListSubheaderDelegate) lazyY03.getValue(), (FullScreenStateDelegate) lazyY05.getValue());
        this.f0 = w.y0(new jnf.a(this, inputData, 24));
        this.g0 = w.y0(new jj2.a(this, 22));
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        e.d(g3().f293718b);
        return super.F2();
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (l0) this.f0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (l) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f293718b;
        SearchView searchView = navBarWithToolbar.f59409p;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(searchView.f57336l), null, new c(this, continuation, 1), 3);
        r rVarDistinctUntilChanged = searchView.f57337m.debounce(300L, TimeUnit.MILLISECONDS).map(new g0(new k37.s(8), 25)).filter(new g0(new k37.s(9), 26)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarDistinctUntilChanged), null, new o(this, continuation, 17), 3);
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.E0();
        View currentFocus = m2().getCurrentFocus();
        if (currentFocus != null) {
            kli.c.d(currentFocus, 0L);
        }
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.Y.getValue()).f53218h), null, new k3g.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) this.f93131a0.getValue()).f52707c), null, new k3g.c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f293718b;
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.experiences_search_search_input_placeholder, null, null, 14));
        navBarWithToolbar.j0(false);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF93134e0() {
        return this.f93134e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    public final w0g.l g3() {
        ViewBinding value = this.f93133d0.getValue(this, f93130h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w0g.l) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
