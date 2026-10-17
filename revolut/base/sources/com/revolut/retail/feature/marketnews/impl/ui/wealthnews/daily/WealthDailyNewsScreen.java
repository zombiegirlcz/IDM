package com.revolut.retail.feature.marketnews.impl.ui.wealthnews.daily;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.NewsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import iaf.d;
import ip0.md;
import iv0.p;
import iyi.i;
import j1k.c;
import j1k.e;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l0k.f;
import n0h.a;
import sji.b;
import te0.w;
import vc.s;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/ui/wealthnews/daily/WealthDailyNewsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lj1k/e;", "Lcom/revolut/retail/feature/marketnews/impl/ui/wealthnews/daily/WealthDailyNewsScreenContract$InputData;", "Laii/q;", "Ln0h/a;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthDailyNewsScreen extends BaseRecyclerViewScreen<e, WealthDailyNewsScreenContract$InputData, q> implements a {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(WealthDailyNewsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h U;
    public final NewsDelegate V;
    public final TextDelegate W;
    public final int X;
    public final boolean Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f101869a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f101870b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WealthDailyNewsScreen(WealthDailyNewsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, j1k.a.f);
        NewsDelegate newsDelegate = new NewsDelegate();
        this.V = newsDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.W = textDelegate;
        this.X = R$layout.screen_recycler_navbar;
        this.Y = true;
        this.Z = w.y0(new md(this, inputData, 21));
        this.f101869a0 = w.y0(new p(this, 10));
        this.f101870b0 = v.k(new NewsLoadingDelegate(), new FullScreenStateDelegate(), newsDelegate, textDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (f) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (j1k.f) this.f101869a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174539b.f59410q), null, new d(this, null, 28), 3);
        NewsDelegate newsDelegate = this.V;
        com.revolut.kompot.navigable.a.g2(this, new iqh.d(rd0.e.b(newsDelegate.p()), 12), null, new c(this, null, 0), 3);
        r rVarMerge = r.merge(w.a0(newsDelegate.q(), new j1.e(3)), w.a0(newsDelegate.r(), new j1.e(4)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new c(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ihm.f events = v0.a.d("create(...)");
        y.a(h(), 20, true, new i(events, 10));
        j1k.f fVar = (j1k.f) this.f101869a0.getValue();
        fVar.getClass();
        Intrinsics.checkNotNullParameter(events, "events");
        fVar.l2(new iz1.p(fVar, events, null, 6), new yi5.b(26));
        h3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF101870b0() {
        return this.f101870b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(e uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        TimeClause timeClause = uiState.f170626a;
        navBarWithToolbar.setTitle(timeClause, null);
        navBarWithToolbar.setToolbarTitle(timeClause);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.X;
    }

    public final m h3() {
        ViewBinding value = this.U.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // n0h.a
    public final r m0() {
        return this.W.d;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Y);
    }
}
