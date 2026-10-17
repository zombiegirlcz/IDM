package com.revolut.feature.invest_feed.impl.widgets.analytics.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.invest_feed.impl.widgets.analytics.screen.AnalyticsMethodScreen;
import com.revolut.feature.invest_feed.impl.widgets.analytics.screen.AnalyticsMethodScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import dli.a;
import gul.n;
import gzg.a0;
import h28.b;
import h28.c;
import h28.f;
import h28.g;
import h28.j;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/invest_feed/impl/widgets/analytics/screen/AnalyticsMethodScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lh28/f;", "Ldli/a;", "Lh28/g;", "feature_invest_feed_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnalyticsMethodScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AnalyticsMethodScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final c K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AnalyticsMethodScreen(c selectedMethod) {
        Intrinsics.checkNotNullParameter(selectedMethod, "selectedMethod");
        this.K = selectedMethod;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: h28.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalyticsMethodScreen f148735b;

            {
                this.f148735b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AnalyticsMethodScreen analyticsMethodScreen = this.f148735b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AnalyticsMethodScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(analyticsMethodScreen.m2()).a().get(d28.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new p28.a(((p28.b) ((p28.g) aVar2.b())).C, new AnalyticsMethodScreenContract$InputData(analyticsMethodScreen.K));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", d28.b.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = AnalyticsMethodScreen.R;
                        return (j) ((p28.a) analyticsMethodScreen.N.getValue()).f232103c.get();
                    default:
                        KProperty[] kPropertyArr3 = AnalyticsMethodScreen.R;
                        AnalyticsMethodScreen analyticsMethodScreen2 = this.f148735b;
                        return dli.f.a(analyticsMethodScreen2, (j) analyticsMethodScreen2.O.getValue(), v.k(new RowLoadingDelegate(), (RowDelegate) analyticsMethodScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: h28.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalyticsMethodScreen f148735b;

            {
                this.f148735b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AnalyticsMethodScreen analyticsMethodScreen = this.f148735b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AnalyticsMethodScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(analyticsMethodScreen.m2()).a().get(d28.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new p28.a(((p28.b) ((p28.g) aVar2.b())).C, new AnalyticsMethodScreenContract$InputData(analyticsMethodScreen.K));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", d28.b.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = AnalyticsMethodScreen.R;
                        return (j) ((p28.a) analyticsMethodScreen.N.getValue()).f232103c.get();
                    default:
                        KProperty[] kPropertyArr3 = AnalyticsMethodScreen.R;
                        AnalyticsMethodScreen analyticsMethodScreen2 = this.f148735b;
                        return dli.f.a(analyticsMethodScreen2, (j) analyticsMethodScreen2.O.getValue(), v.k(new RowLoadingDelegate(), (RowDelegate) analyticsMethodScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new gx2.a(24));
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: h28.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalyticsMethodScreen f148735b;

            {
                this.f148735b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AnalyticsMethodScreen analyticsMethodScreen = this.f148735b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AnalyticsMethodScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(analyticsMethodScreen.m2()).a().get(d28.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new p28.a(((p28.b) ((p28.g) aVar2.b())).C, new AnalyticsMethodScreenContract$InputData(analyticsMethodScreen.K));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", d28.b.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = AnalyticsMethodScreen.R;
                        return (j) ((p28.a) analyticsMethodScreen.N.getValue()).f232103c.get();
                    default:
                        KProperty[] kPropertyArr3 = AnalyticsMethodScreen.R;
                        AnalyticsMethodScreen analyticsMethodScreen2 = this.f148735b;
                        return dli.f.a(analyticsMethodScreen2, (j) analyticsMethodScreen2.O.getValue(), v.k(new RowLoadingDelegate(), (RowDelegate) analyticsMethodScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p28.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_analytics_widget_action_select_method_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new gqh.o(this, continuation, 10), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((RowDelegate) this.P.getValue()).f53218h, new a0(15))), null, new n(this, continuation, 14), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
