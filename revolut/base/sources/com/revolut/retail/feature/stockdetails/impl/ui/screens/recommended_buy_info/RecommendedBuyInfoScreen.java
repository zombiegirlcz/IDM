package com.revolut.retail.feature.stockdetails.impl.ui.screens.recommended_buy_info;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.recommended_buy_info.RecommendedBuyInfoScreen;
import dli.f;
import hwi.l0;
import hwk.b;
import hwk.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import prk.b0;
import prk.g0;
import prk.n0;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/recommended_buy_info/RecommendedBuyInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lhwk/b;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecommendedBuyInfoScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(RecommendedBuyInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object O;
    public final TextDelegate K = new TextDelegate();
    public final int L = R$layout.screen_recycler_navbar;
    public final h P = s.t(this, a.f);
    public final j Q = new j(this, 11);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public RecommendedBuyInfoScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: hwk.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecommendedBuyInfoScreen f156288b;

            {
                this.f156288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RecommendedBuyInfoScreen recommendedBuyInfoScreen = this.f156288b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RecommendedBuyInfoScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(recommendedBuyInfoScreen.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        j jVar = recommendedBuyInfoScreen.Q;
                        jVar.getClass();
                        return new b0(g0Var, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = RecommendedBuyInfoScreen.R;
                        return (c) ((b0) recommendedBuyInfoScreen.M.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = RecommendedBuyInfoScreen.R;
                        RecommendedBuyInfoScreen recommendedBuyInfoScreen2 = this.f156288b;
                        return f.a(recommendedBuyInfoScreen2, (c) recommendedBuyInfoScreen2.N.getValue(), v.k(new RowDelegate(null, null, 7), recommendedBuyInfoScreen2.K), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: hwk.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecommendedBuyInfoScreen f156288b;

            {
                this.f156288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RecommendedBuyInfoScreen recommendedBuyInfoScreen = this.f156288b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RecommendedBuyInfoScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(recommendedBuyInfoScreen.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        j jVar = recommendedBuyInfoScreen.Q;
                        jVar.getClass();
                        return new b0(g0Var, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = RecommendedBuyInfoScreen.R;
                        return (c) ((b0) recommendedBuyInfoScreen.M.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = RecommendedBuyInfoScreen.R;
                        RecommendedBuyInfoScreen recommendedBuyInfoScreen2 = this.f156288b;
                        return f.a(recommendedBuyInfoScreen2, (c) recommendedBuyInfoScreen2.N.getValue(), v.k(new RowDelegate(null, null, 7), recommendedBuyInfoScreen2.K), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: hwk.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecommendedBuyInfoScreen f156288b;

            {
                this.f156288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RecommendedBuyInfoScreen recommendedBuyInfoScreen = this.f156288b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RecommendedBuyInfoScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(recommendedBuyInfoScreen.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        j jVar = recommendedBuyInfoScreen.Q;
                        jVar.getClass();
                        return new b0(g0Var, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = RecommendedBuyInfoScreen.R;
                        return (c) ((b0) recommendedBuyInfoScreen.M.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = RecommendedBuyInfoScreen.R;
                        RecommendedBuyInfoScreen recommendedBuyInfoScreen2 = this.f156288b;
                        return f.a(recommendedBuyInfoScreen2, (c) recommendedBuyInfoScreen2.N.getValue(), v.k(new RowDelegate(null, null, 7), recommendedBuyInfoScreen2.K), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(uiState.f156283a, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new l0(this, null, 3), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
