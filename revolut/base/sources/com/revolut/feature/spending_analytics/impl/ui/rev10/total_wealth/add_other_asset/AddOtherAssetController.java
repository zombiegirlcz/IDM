package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_other_asset;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_other_asset.AddOtherAssetController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import nrd.b;
import nrd.c;
import nrd.f;
import ppd.n;
import ppd.u0;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_other_asset/AddOtherAssetController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnrd/b;", "Ldli/a;", "Lnrd/c;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddOtherAssetController extends ViewController<b> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(AddOtherAssetController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final h L = s.t(this, a.f);
    public final SelectableDelegate M = new SelectableDelegate(new RowDelegate(null, null, 7));
    public final Object N;
    public final Object O;
    public final Object P;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public AddOtherAssetController() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: nrd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddOtherAssetController f218615b;

            {
                this.f218615b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddOtherAssetController addOtherAssetController = this.f218615b;
                int i3 = 1;
                int i5 = 0;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddOtherAssetController.Q;
                        qji.b bVarU2 = addOtherAssetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_other_asset.di.AddOtherAssetInjector");
                        n nVar = ((u0) bVarU2).f238558b;
                        ppd.h hVar = new ppd.h();
                        int i6 = 22;
                        hVar.f238421a = e4m.b.b(new pa6.f(nVar, hVar, i3, i6));
                        hVar.f238422b = e4m.b.b(new pa6.f(nVar, hVar, i5, i6));
                        return hVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AddOtherAssetController.Q;
                        return (h) ((ppd.h) addOtherAssetController.N.getValue()).f238422b.get();
                    default:
                        KProperty[] kPropertyArr3 = AddOtherAssetController.Q;
                        AddOtherAssetController addOtherAssetController2 = this.f218615b;
                        return dli.f.a(addOtherAssetController2, (h) addOtherAssetController2.O.getValue(), v.k(addOtherAssetController2.M, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: nrd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddOtherAssetController f218615b;

            {
                this.f218615b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddOtherAssetController addOtherAssetController = this.f218615b;
                int i3 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddOtherAssetController.Q;
                        qji.b bVarU2 = addOtherAssetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_other_asset.di.AddOtherAssetInjector");
                        n nVar = ((u0) bVarU2).f238558b;
                        ppd.h hVar = new ppd.h();
                        int i6 = 22;
                        hVar.f238421a = e4m.b.b(new pa6.f(nVar, hVar, i3, i6));
                        hVar.f238422b = e4m.b.b(new pa6.f(nVar, hVar, i5, i6));
                        return hVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AddOtherAssetController.Q;
                        return (h) ((ppd.h) addOtherAssetController.N.getValue()).f238422b.get();
                    default:
                        KProperty[] kPropertyArr3 = AddOtherAssetController.Q;
                        AddOtherAssetController addOtherAssetController2 = this.f218615b;
                        return dli.f.a(addOtherAssetController2, (h) addOtherAssetController2.O.getValue(), v.k(addOtherAssetController2.M, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: nrd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddOtherAssetController f218615b;

            {
                this.f218615b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddOtherAssetController addOtherAssetController = this.f218615b;
                int i32 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddOtherAssetController.Q;
                        qji.b bVarU2 = addOtherAssetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_other_asset.di.AddOtherAssetInjector");
                        n nVar = ((u0) bVarU2).f238558b;
                        ppd.h hVar = new ppd.h();
                        int i6 = 22;
                        hVar.f238421a = e4m.b.b(new pa6.f(nVar, hVar, i32, i6));
                        hVar.f238422b = e4m.b.b(new pa6.f(nVar, hVar, i5, i6));
                        return hVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AddOtherAssetController.Q;
                        return (h) ((ppd.h) addOtherAssetController.N.getValue()).f238422b.get();
                    default:
                        KProperty[] kPropertyArr3 = AddOtherAssetController.Q;
                        AddOtherAssetController addOtherAssetController2 = this.f218615b;
                        return dli.f.a(addOtherAssetController2, (h) addOtherAssetController2.O.getValue(), v.k(addOtherAssetController2.M, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f218613b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ppd.h) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (nrd.h) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.analytics_total_wealth_add_other_asset_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.analytics_total_wealth_add_other_asset_title, null, null, 14));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new nrd.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.r()), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new nrd.e(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
