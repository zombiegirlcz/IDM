package com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.date;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.date.DatePickerScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.date.DatePickerScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dli.a;
import dli.c;
import dw3.c1;
import dw3.r0;
import dw3.u1;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m74.b;
import m74.d;
import m74.e;
import m74.f;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/conveyancing_appointment/scheduling/date/DatePickerScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lm74/d;", "Ldli/a;", "Lm74/e;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DatePickerScreen extends PluginScreenController<d> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(DatePickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final DatePickerScreenContract$InputData L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final DatePickerDelegate Q;
    public final Object R;

    public DatePickerScreen(DatePickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_bottomsheet;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: m74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DatePickerScreen f203310b;

            {
                this.f203310b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DatePickerScreen datePickerScreen = this.f203310b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DatePickerScreen.S;
                        qji.b bVarU2 = datePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.date.di.DatePickerScreenInjector");
                        r0 r0Var = (r0) bVarU2;
                        c1 c1Var = r0Var.f119614c;
                        r0 r0Var2 = r0Var.d;
                        DatePickerScreenContract$InputData datePickerScreenContract$InputData = datePickerScreen.L;
                        datePickerScreenContract$InputData.getClass();
                        return new u1(c1Var, r0Var2, datePickerScreen, datePickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DatePickerScreen.S;
                        return (f) ((u1) datePickerScreen.O.getValue()).f119886h.get();
                    default:
                        KProperty[] kPropertyArr3 = DatePickerScreen.S;
                        int i3 = R$id.navBarBottomSheet_RecyclerView;
                        DatePickerScreen datePickerScreen2 = this.f203310b;
                        return dli.f.a(datePickerScreen2, (f) datePickerScreen2.P.getValue(), u.c(datePickerScreen2.Q), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: m74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DatePickerScreen f203310b;

            {
                this.f203310b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DatePickerScreen datePickerScreen = this.f203310b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DatePickerScreen.S;
                        qji.b bVarU2 = datePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.date.di.DatePickerScreenInjector");
                        r0 r0Var = (r0) bVarU2;
                        c1 c1Var = r0Var.f119614c;
                        r0 r0Var2 = r0Var.d;
                        DatePickerScreenContract$InputData datePickerScreenContract$InputData = datePickerScreen.L;
                        datePickerScreenContract$InputData.getClass();
                        return new u1(c1Var, r0Var2, datePickerScreen, datePickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DatePickerScreen.S;
                        return (f) ((u1) datePickerScreen.O.getValue()).f119886h.get();
                    default:
                        KProperty[] kPropertyArr3 = DatePickerScreen.S;
                        int i3 = R$id.navBarBottomSheet_RecyclerView;
                        DatePickerScreen datePickerScreen2 = this.f203310b;
                        return dli.f.a(datePickerScreen2, (f) datePickerScreen2.P.getValue(), u.c(datePickerScreen2.Q), i3, null, null, null, 56);
                }
            }
        });
        this.Q = new DatePickerDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: m74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DatePickerScreen f203310b;

            {
                this.f203310b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DatePickerScreen datePickerScreen = this.f203310b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DatePickerScreen.S;
                        qji.b bVarU2 = datePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.date.di.DatePickerScreenInjector");
                        r0 r0Var = (r0) bVarU2;
                        c1 c1Var = r0Var.f119614c;
                        r0 r0Var2 = r0Var.d;
                        DatePickerScreenContract$InputData datePickerScreenContract$InputData = datePickerScreen.L;
                        datePickerScreenContract$InputData.getClass();
                        return new u1(c1Var, r0Var2, datePickerScreen, datePickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DatePickerScreen.S;
                        return (f) ((u1) datePickerScreen.O.getValue()).f119886h.get();
                    default:
                        KProperty[] kPropertyArr3 = DatePickerScreen.S;
                        int i32 = R$id.navBarBottomSheet_RecyclerView;
                        DatePickerScreen datePickerScreen2 = this.f203310b;
                        return dli.f.a(datePickerScreen2, (f) datePickerScreen2.P.getValue(), u.c(datePickerScreen2.Q), i32, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f203313a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u1) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52176c.f121375b), null, new lph.h(this, null, 29), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
