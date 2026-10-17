package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_historical_values;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_historical_values.CustomAssetHistoricalValuesController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ppd.u0;
import ppd.x;
import te0.w;
import vc.s;
import wa3.d;
import wrd.b;
import wrd.c;
import wrd.j;
import wrd.l;
import wrd.m;
import wrd.n;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/custom_asset_historical_values/CustomAssetHistoricalValuesController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lwrd/h;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomAssetHistoricalValuesController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CustomAssetHistoricalValuesController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final c K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final ListSubheaderDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public CustomAssetHistoricalValuesController(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, j.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new ListSubheaderDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: wrd.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomAssetHistoricalValuesController f299562b;

            {
                this.f299562b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CustomAssetHistoricalValuesController customAssetHistoricalValuesController = this.f299562b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CustomAssetHistoricalValuesController.S;
                        qji.b bVarU2 = customAssetHistoricalValuesController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_historical_values.di.CustomAssetHistoricalValuesInjector");
                        u0 u0Var = (u0) bVarU2;
                        ppd.n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        c cVar = customAssetHistoricalValuesController.K;
                        cVar.getClass();
                        return new x(nVar, u0Var2, cVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomAssetHistoricalValuesController.S;
                        return (d) ((x) customAssetHistoricalValuesController.P.getValue()).f238573c.get();
                    default:
                        KProperty[] kPropertyArr3 = CustomAssetHistoricalValuesController.S;
                        CustomAssetHistoricalValuesController customAssetHistoricalValuesController2 = this.f299562b;
                        return dli.f.a(customAssetHistoricalValuesController2, customAssetHistoricalValuesController2.R2(), zhm.v.k(customAssetHistoricalValuesController2.N, customAssetHistoricalValuesController2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: wrd.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomAssetHistoricalValuesController f299562b;

            {
                this.f299562b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CustomAssetHistoricalValuesController customAssetHistoricalValuesController = this.f299562b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomAssetHistoricalValuesController.S;
                        qji.b bVarU2 = customAssetHistoricalValuesController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_historical_values.di.CustomAssetHistoricalValuesInjector");
                        u0 u0Var = (u0) bVarU2;
                        ppd.n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        c cVar = customAssetHistoricalValuesController.K;
                        cVar.getClass();
                        return new x(nVar, u0Var2, cVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomAssetHistoricalValuesController.S;
                        return (d) ((x) customAssetHistoricalValuesController.P.getValue()).f238573c.get();
                    default:
                        KProperty[] kPropertyArr3 = CustomAssetHistoricalValuesController.S;
                        CustomAssetHistoricalValuesController customAssetHistoricalValuesController2 = this.f299562b;
                        return dli.f.a(customAssetHistoricalValuesController2, customAssetHistoricalValuesController2.R2(), zhm.v.k(customAssetHistoricalValuesController2.N, customAssetHistoricalValuesController2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: wrd.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomAssetHistoricalValuesController f299562b;

            {
                this.f299562b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CustomAssetHistoricalValuesController customAssetHistoricalValuesController = this.f299562b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomAssetHistoricalValuesController.S;
                        qji.b bVarU2 = customAssetHistoricalValuesController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_historical_values.di.CustomAssetHistoricalValuesInjector");
                        u0 u0Var = (u0) bVarU2;
                        ppd.n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        c cVar = customAssetHistoricalValuesController.K;
                        cVar.getClass();
                        return new x(nVar, u0Var2, cVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomAssetHistoricalValuesController.S;
                        return (d) ((x) customAssetHistoricalValuesController.P.getValue()).f238573c.get();
                    default:
                        KProperty[] kPropertyArr3 = CustomAssetHistoricalValuesController.S;
                        CustomAssetHistoricalValuesController customAssetHistoricalValuesController2 = this.f299562b;
                        return dli.f.a(customAssetHistoricalValuesController2, customAssetHistoricalValuesController2.R2(), zhm.v.k(customAssetHistoricalValuesController2.N, customAssetHistoricalValuesController2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        wrd.h uiState = (wrd.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        b bVar = uiState.f299559b;
        List<? extends NavBarMenuItem> list = uiState.f299560c;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitleTopDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(false);
        TextLocalisedClause textLocalisedClause = bVar.f299552a;
        TextClause textClause = bVar.f299553b;
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, textLocalisedClause, textClause, null, 4, null);
        navBarWithToolbar.setTitleTopDescription(textLocalisedClause);
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setMenuItems(list);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.P.getValue();
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
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new l(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new d(rd0.e.b(d3().f174539b.o.f57403b), 21), null, new l(this, null, 1), 3);
        RowDelegate rowDelegate = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53223p), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.k), null, new n(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final wrd.d R2() {
        return (wrd.d) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
