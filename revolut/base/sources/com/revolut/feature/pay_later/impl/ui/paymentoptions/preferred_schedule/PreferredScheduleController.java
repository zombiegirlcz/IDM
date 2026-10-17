package com.revolut.feature.pay_later.impl.ui.paymentoptions.preferred_schedule;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bi2.g;
import bk9.b;
import bk9.c;
import bk9.d;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.StreakStepVerticalDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.preferred_schedule.PreferredScheduleController;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.preferred_schedule.PreferredScheduleControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import grl.k9;
import hx7.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import oi9.u;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/paymentoptions/preferred_schedule/PreferredScheduleController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lbk9/h;", "Lno/m;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PreferredScheduleController extends ViewController<q> implements a, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PreferredScheduleController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PreferredScheduleControllerContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final h M;
    public final int N;
    public final Object O;
    public final SelectableDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public PreferredScheduleController(PreferredScheduleControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = s.t(this, b.f);
        this.N = R$layout.screen_recycler_navbar_nextbutton;
        this.O = w.y0(new g(21));
        this.P = new SelectableDelegate(new RowDelegate(null, null, 7));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: bk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferredScheduleController f16283b;

            {
                this.f16283b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PreferredScheduleController preferredScheduleController = this.f16283b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PreferredScheduleController.T;
                        PreferredScheduleController preferredScheduleController2 = this.f16283b;
                        return dli.f.a(preferredScheduleController2, preferredScheduleController2.d(), v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) preferredScheduleController2.O.getValue(), preferredScheduleController2.P, new CellDetailsDelegate(), new StreakStepVerticalDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PreferredScheduleController.T;
                        qji.b bVarU2 = preferredScheduleController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_later.impl.ui.paymentoptions.preferred_schedule.di.PreferredScheduleControllerInjector");
                        oi9.s sVar = (oi9.s) bVarU2;
                        oi9.f fVar = sVar.f225562b;
                        oi9.s sVar2 = sVar.f225563c;
                        PreferredScheduleControllerContract$InputData preferredScheduleControllerContract$InputData = preferredScheduleController.K;
                        preferredScheduleControllerContract$InputData.getClass();
                        return new u(fVar, sVar2, preferredScheduleControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PreferredScheduleController.T;
                        return (g) ((u) preferredScheduleController.R.getValue()).f225569c.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: bk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferredScheduleController f16283b;

            {
                this.f16283b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PreferredScheduleController preferredScheduleController = this.f16283b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PreferredScheduleController.T;
                        PreferredScheduleController preferredScheduleController2 = this.f16283b;
                        return dli.f.a(preferredScheduleController2, preferredScheduleController2.d(), v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) preferredScheduleController2.O.getValue(), preferredScheduleController2.P, new CellDetailsDelegate(), new StreakStepVerticalDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PreferredScheduleController.T;
                        qji.b bVarU2 = preferredScheduleController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_later.impl.ui.paymentoptions.preferred_schedule.di.PreferredScheduleControllerInjector");
                        oi9.s sVar = (oi9.s) bVarU2;
                        oi9.f fVar = sVar.f225562b;
                        oi9.s sVar2 = sVar.f225563c;
                        PreferredScheduleControllerContract$InputData preferredScheduleControllerContract$InputData = preferredScheduleController.K;
                        preferredScheduleControllerContract$InputData.getClass();
                        return new u(fVar, sVar2, preferredScheduleControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PreferredScheduleController.T;
                        return (g) ((u) preferredScheduleController.R.getValue()).f225569c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: bk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferredScheduleController f16283b;

            {
                this.f16283b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PreferredScheduleController preferredScheduleController = this.f16283b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PreferredScheduleController.T;
                        PreferredScheduleController preferredScheduleController2 = this.f16283b;
                        return dli.f.a(preferredScheduleController2, preferredScheduleController2.d(), v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) preferredScheduleController2.O.getValue(), preferredScheduleController2.P, new CellDetailsDelegate(), new StreakStepVerticalDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PreferredScheduleController.T;
                        qji.b bVarU2 = preferredScheduleController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_later.impl.ui.paymentoptions.preferred_schedule.di.PreferredScheduleControllerInjector");
                        oi9.s sVar = (oi9.s) bVarU2;
                        oi9.f fVar = sVar.f225562b;
                        oi9.s sVar2 = sVar.f225563c;
                        PreferredScheduleControllerContract$InputData preferredScheduleControllerContract$InputData = preferredScheduleController.K;
                        preferredScheduleControllerContract$InputData.getClass();
                        return new u(fVar, sVar2, preferredScheduleControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PreferredScheduleController.T;
                        return (g) ((u) preferredScheduleController.R.getValue()).f225569c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        bk9.h uiState = (bk9.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        i.z(navBarWithToolbar, uiState.f16287a);
        d3().f174564b.setEnabled(uiState.f16288b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().f174564b.setText(new TextLocalisedClause(R$string.credit_pay_later_payment_schedule_select_schedule_save, null, null, 14));
        d3().f174564b.setLoadingButtonTag("save_button_loading");
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.r()), new bk9.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final bk9.g d() {
        return (bk9.g) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
