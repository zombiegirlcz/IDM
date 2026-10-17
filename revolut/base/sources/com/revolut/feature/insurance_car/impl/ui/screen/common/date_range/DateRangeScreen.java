package com.revolut.feature.insurance_car.impl.ui.screen.common.date_range;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.calendar.CalendarPickerRangeView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$layout;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.common.date_range.DateRangeScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.common.date_range.DateRangeScreenContract$InputData;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Date;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nn7.b;
import nn7.c;
import nn7.d;
import nn7.f;
import nn7.g;
import ql7.k0;
import ql7.t0;
import vc.s;
import vim.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/common/date_range/DateRangeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnn7/f;", "Lcli/w;", "Lnn7/g;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DateRangeScreen extends ViewController<f> implements w {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(DateRangeScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenDateRangeBinding;", 0))};
    public final DateRangeScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public DateRangeScreen(DateRangeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_date_range;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: nn7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DateRangeScreen f217471b;

            {
                this.f217471b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DateRangeScreen dateRangeScreen = this.f217471b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DateRangeScreen.Q;
                        qji.b bVarU2 = dateRangeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.common.date_range.di.DateRangeScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        k0 k0Var = t0Var.f247471b;
                        t0 t0Var2 = t0Var.f247472c;
                        DateRangeScreenContract$InputData dateRangeScreenContract$InputData = dateRangeScreen.K;
                        dateRangeScreenContract$InputData.getClass();
                        return new ql7.w(k0Var, t0Var2, dateRangeScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DateRangeScreen.Q;
                        return (h) ((ql7.w) dateRangeScreen.N.getValue()).f247505c.get();
                    default:
                        KProperty[] kPropertyArr3 = DateRangeScreen.Q;
                        return n14.e.a(dateRangeScreen, (h) dateRangeScreen.O.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: nn7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DateRangeScreen f217471b;

            {
                this.f217471b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DateRangeScreen dateRangeScreen = this.f217471b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DateRangeScreen.Q;
                        qji.b bVarU2 = dateRangeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.common.date_range.di.DateRangeScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        k0 k0Var = t0Var.f247471b;
                        t0 t0Var2 = t0Var.f247472c;
                        DateRangeScreenContract$InputData dateRangeScreenContract$InputData = dateRangeScreen.K;
                        dateRangeScreenContract$InputData.getClass();
                        return new ql7.w(k0Var, t0Var2, dateRangeScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DateRangeScreen.Q;
                        return (h) ((ql7.w) dateRangeScreen.N.getValue()).f247505c.get();
                    default:
                        KProperty[] kPropertyArr3 = DateRangeScreen.Q;
                        return n14.e.a(dateRangeScreen, (h) dateRangeScreen.O.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: nn7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DateRangeScreen f217471b;

            {
                this.f217471b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DateRangeScreen dateRangeScreen = this.f217471b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DateRangeScreen.Q;
                        qji.b bVarU2 = dateRangeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.common.date_range.di.DateRangeScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        k0 k0Var = t0Var.f247471b;
                        t0 t0Var2 = t0Var.f247472c;
                        DateRangeScreenContract$InputData dateRangeScreenContract$InputData = dateRangeScreen.K;
                        dateRangeScreenContract$InputData.getClass();
                        return new ql7.w(k0Var, t0Var2, dateRangeScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DateRangeScreen.Q;
                        return (h) ((ql7.w) dateRangeScreen.N.getValue()).f247505c.get();
                    default:
                        KProperty[] kPropertyArr3 = DateRangeScreen.Q;
                        return n14.e.a(dateRangeScreen, (h) dateRangeScreen.O.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        CalendarPickerRangeView screenDateRangeCalendar = d3().f217064c;
        Intrinsics.checkNotNullExpressionValue(screenDateRangeCalendar, "screenDateRangeCalendar");
        e eVar = uiState.f217477a;
        CalendarPickerRangeView.setCalendarData$default(screenDateRangeCalendar, eVar, uiState.f217478b, (Date) eVar.f289621a, (Date) eVar.f289622b, uiState.f217479c, null, 32, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ql7.w) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (nn7.h) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().d;
        DateRangeScreenContract$InputData dateRangeScreenContract$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(dateRangeScreenContract$InputData.f75514a);
        navBarWithToolbar.setTitle(dateRangeScreenContract$InputData.f75514a, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().f217063b.setText(new TextLocalisedClause(R$string.car_insurance_common_done, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        a.g2(this, rd0.e.b(d3().d.f59410q), null, new c(this, continuation, 0), 3);
        a.g2(this, rd0.e.b(d3().f217064c.b()), null, new d(this, continuation, 0), 3);
        a.g2(this, rd0.e.b(d3().f217063b.o), null, new c(this, continuation, 1), 3);
    }

    public final nl7.g d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nl7.g) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }
}
