package com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule.ScheduleScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule.ScheduleScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.kompot.common.R$layout;
import dw3.c1;
import dw3.r0;
import dw3.x5;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import o74.b;
import o74.c;
import o74.d;
import o74.l;
import o74.m;
import o74.n;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/conveyancing_appointment/scheduling/schedule/ScheduleScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lo74/l;", "Ldli/a;", "Lo74/n;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScheduleScreen extends PluginScreenController<l> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ScheduleScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final ScheduleScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final InputTextDelegate Q;
    public final InputChecklistDelegate R;
    public final Object S;

    public ScheduleScreen(ScheduleScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: o74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleScreen f222705b;

            {
                this.f222705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ScheduleScreen scheduleScreen = this.f222705b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ScheduleScreen.T;
                        qji.b bVarU2 = scheduleScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule.di.ScheduleScreenInjector");
                        r0 r0Var = (r0) bVarU2;
                        c1 c1Var = r0Var.f119614c;
                        r0 r0Var2 = r0Var.d;
                        ScheduleScreenContract$InputData scheduleScreenContract$InputData = scheduleScreen.L;
                        scheduleScreenContract$InputData.getClass();
                        return new x5(c1Var, r0Var2, scheduleScreen, scheduleScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ScheduleScreen.T;
                        return (m) ((x5) scheduleScreen.N.getValue()).f120150h.get();
                    default:
                        KProperty[] kPropertyArr3 = ScheduleScreen.T;
                        ScheduleScreen scheduleScreen2 = this.f222705b;
                        return dli.f.a(scheduleScreen2, scheduleScreen2.d(), v.k(scheduleScreen2.Q, scheduleScreen2.R, new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: o74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleScreen f222705b;

            {
                this.f222705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ScheduleScreen scheduleScreen = this.f222705b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScheduleScreen.T;
                        qji.b bVarU2 = scheduleScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule.di.ScheduleScreenInjector");
                        r0 r0Var = (r0) bVarU2;
                        c1 c1Var = r0Var.f119614c;
                        r0 r0Var2 = r0Var.d;
                        ScheduleScreenContract$InputData scheduleScreenContract$InputData = scheduleScreen.L;
                        scheduleScreenContract$InputData.getClass();
                        return new x5(c1Var, r0Var2, scheduleScreen, scheduleScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ScheduleScreen.T;
                        return (m) ((x5) scheduleScreen.N.getValue()).f120150h.get();
                    default:
                        KProperty[] kPropertyArr3 = ScheduleScreen.T;
                        ScheduleScreen scheduleScreen2 = this.f222705b;
                        return dli.f.a(scheduleScreen2, scheduleScreen2.d(), v.k(scheduleScreen2.Q, scheduleScreen2.R, new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new InputTextDelegate(null);
        this.R = new InputChecklistDelegate();
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: o74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleScreen f222705b;

            {
                this.f222705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ScheduleScreen scheduleScreen = this.f222705b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScheduleScreen.T;
                        qji.b bVarU2 = scheduleScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule.di.ScheduleScreenInjector");
                        r0 r0Var = (r0) bVarU2;
                        c1 c1Var = r0Var.f119614c;
                        r0 r0Var2 = r0Var.d;
                        ScheduleScreenContract$InputData scheduleScreenContract$InputData = scheduleScreen.L;
                        scheduleScreenContract$InputData.getClass();
                        return new x5(c1Var, r0Var2, scheduleScreen, scheduleScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ScheduleScreen.T;
                        return (m) ((x5) scheduleScreen.N.getValue()).f120150h.get();
                    default:
                        KProperty[] kPropertyArr3 = ScheduleScreen.T;
                        ScheduleScreen scheduleScreen2 = this.f222705b;
                        return dli.f.a(scheduleScreen2, scheduleScreen2.d(), v.k(scheduleScreen2.Q, scheduleScreen2.R, new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f222715b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f222716c);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(uiState.d);
        largeActionButton.setEnabled(uiState.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x5) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52575g.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52518c), null, new o74.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
