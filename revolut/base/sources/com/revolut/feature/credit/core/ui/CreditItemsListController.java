package com.revolut.feature.credit.core.ui;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.core.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import grl.k9;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import ofm.q;
import rd0.e;
import tx0.j0;
import vc.s;
import yp0.y;
import yx4.c;
import yx4.f;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0006\u0002¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/core/ui/CreditItemsListController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lyx4/f;", "Lin0/g;", "Lno/m;", "Lno/k;", "yx4/c", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditItemsListController extends SimpleViewController<f> implements g, m, k {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CreditItemsListController.class, "binding", "getBinding()Lcom/revolut/feature/credit/core/databinding/ScreenCreditAnimatedRecyclerNavbarNextbuttonBinding;", 0))};
    public final c N;
    public final int O;
    public final h P;
    public final j Q;
    public final int R;
    public boolean S;
    public final AnalyticsProduct.Retail T;
    public AnalyticsContext U;

    public CreditItemsListController(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = R$style.UiKitTheme_Transparent;
        this.P = s.t(this, yx4.g.f);
        this.Q = new j(7, u.c(new RowDelegate(null, null, 7)), false);
        this.R = R$layout.screen_credit_animated_recycler_navbar_nextbutton;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.T = a.h(k9Var, "value", k9Var);
        this.U = null;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.O);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.U = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        return this.T;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getS() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        AnimatedBackgroundView animatedBackgroundView = d3().f240566b;
        animatedBackgroundView.setBackgroundType(AnimatedBackgroundType.DEFAULT.f51471a);
        animatedBackgroundView.setVisibility(this.S ? 0 : 8);
        NavBarWithToolbar navBarWithToolbar = d3().d;
        c cVar = this.N;
        navBarWithToolbar.setToolbarTitle(cVar.f317547a);
        navBarWithToolbar.setTitle(cVar.f317547a, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(false);
        d3().f240567c.setText(cVar.f317548b);
        ScreenContentRecyclerView creditItemsListRecyclerView = d3().e;
        Intrinsics.checkNotNullExpressionValue(creditItemsListRecyclerView, "creditItemsListRecyclerView");
        j jVar = this.Q;
        y.h(creditItemsListRecyclerView, jVar, new LinearLayoutManager(creditItemsListRecyclerView.getContext()));
        jVar.c(cVar.f317549c);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e.b(d3().f240567c.o), new yx4.h(this, null, 0), 3);
        ViewController.P2(this, e.b(d3().d.f59410q), new yx4.h(this, null, 1), 3);
    }

    public final px4.a d3() {
        ViewBinding value = this.P.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (px4.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final View h2(LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.N.getClass();
        this.S = true;
        return super.h2(inflater);
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
