package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.country_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.country_picker.TripsCountryPickerContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.country_picker.TripsCountryPickerController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import efm.r;
import god.b;
import god.c;
import god.e;
import god.f;
import god.g;
import god.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ppd.c1;
import ppd.z0;
import te0.w;
import tw0.x;
import tx0.n3;
import vc.s;
import yp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/country_picker/TripsCountryPickerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgod/b;", "Ldli/a;", "Lgod/c;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TripsCountryPickerController extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TripsCountryPickerController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final TripsCountryPickerContract$InputData K;
    public final int L;
    public final h M;
    public final ReferralContactDelegate N;
    public final SelectableDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public n3 S;

    public TripsCountryPickerController(TripsCountryPickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, e.f);
        this.N = new ReferralContactDelegate();
        this.O = new SelectableDelegate(new RowDelegate(null, null, 7));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: god.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripsCountryPickerController f145139b;

            {
                this.f145139b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TripsCountryPickerController tripsCountryPickerController = this.f145139b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TripsCountryPickerController.T;
                        qji.b bVarU2 = tripsCountryPickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.country_picker.di.TripsCountryPickerInjector");
                        c1 c1Var = (c1) bVarU2;
                        ppd.n nVar = c1Var.f238386b;
                        c1 c1Var2 = c1Var.f238387c;
                        TripsCountryPickerContract$InputData tripsCountryPickerContract$InputData = tripsCountryPickerController.K;
                        tripsCountryPickerContract$InputData.getClass();
                        return new z0(nVar, c1Var2, tripsCountryPickerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TripsCountryPickerController.T;
                        return (m) ((z0) tripsCountryPickerController.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = TripsCountryPickerController.T;
                        TripsCountryPickerController tripsCountryPickerController2 = this.f145139b;
                        return dli.f.a(tripsCountryPickerController2, tripsCountryPickerController2.d(), v.k(tripsCountryPickerController2.O, new ScrollerBoxDelegate(u.c(tripsCountryPickerController2.N))), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: god.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripsCountryPickerController f145139b;

            {
                this.f145139b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TripsCountryPickerController tripsCountryPickerController = this.f145139b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TripsCountryPickerController.T;
                        qji.b bVarU2 = tripsCountryPickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.country_picker.di.TripsCountryPickerInjector");
                        c1 c1Var = (c1) bVarU2;
                        ppd.n nVar = c1Var.f238386b;
                        c1 c1Var2 = c1Var.f238387c;
                        TripsCountryPickerContract$InputData tripsCountryPickerContract$InputData = tripsCountryPickerController.K;
                        tripsCountryPickerContract$InputData.getClass();
                        return new z0(nVar, c1Var2, tripsCountryPickerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TripsCountryPickerController.T;
                        return (m) ((z0) tripsCountryPickerController.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = TripsCountryPickerController.T;
                        TripsCountryPickerController tripsCountryPickerController2 = this.f145139b;
                        return dli.f.a(tripsCountryPickerController2, tripsCountryPickerController2.d(), v.k(tripsCountryPickerController2.O, new ScrollerBoxDelegate(u.c(tripsCountryPickerController2.N))), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: god.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripsCountryPickerController f145139b;

            {
                this.f145139b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TripsCountryPickerController tripsCountryPickerController = this.f145139b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TripsCountryPickerController.T;
                        qji.b bVarU2 = tripsCountryPickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.country_picker.di.TripsCountryPickerInjector");
                        c1 c1Var = (c1) bVarU2;
                        ppd.n nVar = c1Var.f238386b;
                        c1 c1Var2 = c1Var.f238387c;
                        TripsCountryPickerContract$InputData tripsCountryPickerContract$InputData = tripsCountryPickerController.K;
                        tripsCountryPickerContract$InputData.getClass();
                        return new z0(nVar, c1Var2, tripsCountryPickerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TripsCountryPickerController.T;
                        return (m) ((z0) tripsCountryPickerController.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = TripsCountryPickerController.T;
                        TripsCountryPickerController tripsCountryPickerController2 = this.f145139b;
                        return dli.f.a(tripsCountryPickerController2, tripsCountryPickerController2.d(), v.k(tripsCountryPickerController2.O, new ScrollerBoxDelegate(u.c(tripsCountryPickerController2.N))), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        jii.u uVarD3 = d3();
        LargeActionButton goToButton = uVarD3.f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        boolean z = uiState.f145136b;
        goToButton.setVisibility(z ? 0 : 8);
        uVarD3.f174564b.setText(uiState.f145137c);
        if (z && this.S == n3.EXPANDED) {
            ScreenContentRecyclerView recyclerView = d3().d;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            x.d(recyclerView);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (z0) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.trips_add_trip_picker_screen_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.trips_add_trip_picker_screen_title, null, null, 14));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.analytics_select_transaction_search, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
        d3().f174564b.o(LargeActionButton.ButtonStyle.f58725a);
        ScreenContentRecyclerView recyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        y.g(recyclerView, m2());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59409p.f57337m), null, new g(this, null, 0), 3);
        r rVarMerge = r.merge(this.O.r(), this.N.q());
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new g(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new f(this, null, 1), 3);
        r rVarHide = d3().f174565c.f59422y.f275218a.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        com.revolut.kompot.navigable.a.g2(this, vkm.q.q(rd0.e.b(rVarHide)), null, new g(this, null, 2), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.Q.getValue();
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
}
