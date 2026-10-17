package com.revolut.feature.credit.health.impl.ui.insights;

import a07.d;
import a15.b;
import a15.f;
import a15.g;
import a15.j;
import a15.k;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.health.impl.ui.insights.InsightsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import q05.i;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/health/impl/ui/insights/InsightsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "La15/j;", "Ldli/a;", "La15/k;", "Lno/m;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsightsScreen extends ViewController<j> implements a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(InsightsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final AnalyticsProduct.Retail K;
    public final int L;
    public final RowDelegate M;
    public final FullScreenStateDelegate N;
    public final AttributeSelectorSmallDelegate O;
    public final Object P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;

    public InsightsScreen(InsightsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.K = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.L = R$layout.screen_recycler_navbar;
        this.M = new RowDelegate(null, null, 7);
        this.N = new FullScreenStateDelegate();
        this.O = new AttributeSelectorSmallDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: a15.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightsScreen f528b;

            {
                this.f528b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InsightsScreen insightsScreen = this.f528b;
                switch (i2) {
                    case 0:
                        return new ScrollerDelegate(u.c(insightsScreen.O), false);
                    case 1:
                        KProperty[] kPropertyArr = InsightsScreen.U;
                        InsightsScreen insightsScreen2 = this.f528b;
                        return dli.f.a(insightsScreen2, insightsScreen2.R2(), v.k(insightsScreen2.N, new RowLoadingDelegate(), insightsScreen2.M, (ScrollerDelegate) insightsScreen2.P.getValue(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = InsightsScreen.U;
                        return (m) ((q05.i) insightsScreen.S.getValue()).f241160b.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: a15.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightsScreen f528b;

            {
                this.f528b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InsightsScreen insightsScreen = this.f528b;
                switch (i22) {
                    case 0:
                        return new ScrollerDelegate(u.c(insightsScreen.O), false);
                    case 1:
                        KProperty[] kPropertyArr = InsightsScreen.U;
                        InsightsScreen insightsScreen2 = this.f528b;
                        return dli.f.a(insightsScreen2, insightsScreen2.R2(), v.k(insightsScreen2.N, new RowLoadingDelegate(), insightsScreen2.M, (ScrollerDelegate) insightsScreen2.P.getValue(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = InsightsScreen.U;
                        return (m) ((q05.i) insightsScreen.S.getValue()).f241160b.get();
                }
            }
        });
        this.R = s.t(this, b.f);
        this.S = w.y0(new a07.b(this, inputData, i2));
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: a15.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightsScreen f528b;

            {
                this.f528b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InsightsScreen insightsScreen = this.f528b;
                switch (i22) {
                    case 0:
                        return new ScrollerDelegate(u.c(insightsScreen.O), false);
                    case 1:
                        KProperty[] kPropertyArr = InsightsScreen.U;
                        InsightsScreen insightsScreen2 = this.f528b;
                        return dli.f.a(insightsScreen2, insightsScreen2.R2(), v.k(insightsScreen2.N, new RowLoadingDelegate(), insightsScreen2.M, (ScrollerDelegate) insightsScreen2.P.getValue(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = InsightsScreen.U;
                        return (m) ((q05.i) insightsScreen.S.getValue()).f241160b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((k) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_score_insight_header, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_score_insight_header, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), null, new d(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, new a15.d(rd0.e.b(this.M.f53218h), 0), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new a15.d(rd0.e.b(this.O.p()), 1), null, new f(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52371h.f121375b), null, new g(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final a15.m R2() {
        return (a15.m) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
