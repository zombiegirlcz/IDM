package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.date_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.date_picker.TripsDatePickerContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.date_picker.TripsDatePickerController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import iod.b;
import iod.c;
import iod.e;
import iod.f;
import iod.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ppd.a1;
import ppd.c1;
import ppd.n;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/date_picker/TripsDatePickerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liod/b;", "Ldli/a;", "Liod/c;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TripsDatePickerController extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TripsDatePickerController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final TripsDatePickerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final DatePickerDelegate P;
    public final Object Q;

    public TripsDatePickerController(TripsDatePickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, e.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: iod.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripsDatePickerController f163227b;

            {
                this.f163227b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TripsDatePickerController tripsDatePickerController = this.f163227b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TripsDatePickerController.R;
                        qji.b bVarU2 = tripsDatePickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.date_picker.di.TripsDatePickerScreenInjector");
                        c1 c1Var = (c1) bVarU2;
                        n nVar = c1Var.f238386b;
                        c1 c1Var2 = c1Var.f238387c;
                        TripsDatePickerContract$InputData tripsDatePickerContract$InputData = tripsDatePickerController.K;
                        tripsDatePickerContract$InputData.getClass();
                        return new a1(nVar, c1Var2, tripsDatePickerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TripsDatePickerController.R;
                        return (g) ((a1) tripsDatePickerController.N.getValue()).f238375c.get();
                    default:
                        KProperty[] kPropertyArr3 = TripsDatePickerController.R;
                        TripsDatePickerController tripsDatePickerController2 = this.f163227b;
                        return dli.f.a(tripsDatePickerController2, (g) tripsDatePickerController2.O.getValue(), u.c(tripsDatePickerController2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: iod.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripsDatePickerController f163227b;

            {
                this.f163227b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TripsDatePickerController tripsDatePickerController = this.f163227b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TripsDatePickerController.R;
                        qji.b bVarU2 = tripsDatePickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.date_picker.di.TripsDatePickerScreenInjector");
                        c1 c1Var = (c1) bVarU2;
                        n nVar = c1Var.f238386b;
                        c1 c1Var2 = c1Var.f238387c;
                        TripsDatePickerContract$InputData tripsDatePickerContract$InputData = tripsDatePickerController.K;
                        tripsDatePickerContract$InputData.getClass();
                        return new a1(nVar, c1Var2, tripsDatePickerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TripsDatePickerController.R;
                        return (g) ((a1) tripsDatePickerController.N.getValue()).f238375c.get();
                    default:
                        KProperty[] kPropertyArr3 = TripsDatePickerController.R;
                        TripsDatePickerController tripsDatePickerController2 = this.f163227b;
                        return dli.f.a(tripsDatePickerController2, (g) tripsDatePickerController2.O.getValue(), u.c(tripsDatePickerController2.P), 0, null, null, null, 60);
                }
            }
        });
        this.P = new DatePickerDelegate();
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: iod.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripsDatePickerController f163227b;

            {
                this.f163227b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TripsDatePickerController tripsDatePickerController = this.f163227b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TripsDatePickerController.R;
                        qji.b bVarU2 = tripsDatePickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.date_picker.di.TripsDatePickerScreenInjector");
                        c1 c1Var = (c1) bVarU2;
                        n nVar = c1Var.f238386b;
                        c1 c1Var2 = c1Var.f238387c;
                        TripsDatePickerContract$InputData tripsDatePickerContract$InputData = tripsDatePickerController.K;
                        tripsDatePickerContract$InputData.getClass();
                        return new a1(nVar, c1Var2, tripsDatePickerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TripsDatePickerController.R;
                        return (g) ((a1) tripsDatePickerController.N.getValue()).f238375c.get();
                    default:
                        KProperty[] kPropertyArr3 = TripsDatePickerController.R;
                        TripsDatePickerController tripsDatePickerController2 = this.f163227b;
                        return dli.f.a(tripsDatePickerController2, (g) tripsDatePickerController2.O.getValue(), u.c(tripsDatePickerController2.P), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (a1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = this.K.f87608c ? new TextLocalisedClause(R$string.trips_edit_trip_options_edit_start_date, null, null, 14) : new TextLocalisedClause(R$string.trips_add_trip_date_picker_screen_header_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.trips_add_trip_date_picker_screen_button, null, null, 14));
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52176c.f121375b), null, new ibg.g(this, null, 22), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new f(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
