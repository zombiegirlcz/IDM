package com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.CustomPeriodSelectContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.CustomPeriodSelectController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import h30.l;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mpd.d;
import mpd.e;
import mpd.g;
import mpd.i;
import mpd.j;
import ppd.y;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/custom_period/select/CustomPeriodSelectController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lmpd/e;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomPeriodSelectController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CustomPeriodSelectController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CustomPeriodSelectContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final InputTextDelegate P;
    public final DatePickerDelegate Q;
    public final Object R;

    public CustomPeriodSelectController(CustomPeriodSelectContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, g.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: mpd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomPeriodSelectController f207794b;

            {
                this.f207794b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CustomPeriodSelectController customPeriodSelectController = this.f207794b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CustomPeriodSelectController.S;
                        qji.b bVarU2 = customPeriodSelectController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.di.CustomPeriodSelectScreenInjector");
                        ppd.l lVar = (ppd.l) bVarU2;
                        ppd.n nVar = lVar.f238466b;
                        ppd.l lVar2 = lVar.f238467c;
                        CustomPeriodSelectContract$InputData customPeriodSelectContract$InputData = customPeriodSelectController.K;
                        customPeriodSelectContract$InputData.getClass();
                        return new y(nVar, lVar2, customPeriodSelectContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomPeriodSelectController.S;
                        return (d) ((y) customPeriodSelectController.N.getValue()).f238579c.get();
                    default:
                        KProperty[] kPropertyArr3 = CustomPeriodSelectController.S;
                        CustomPeriodSelectController customPeriodSelectController2 = this.f207794b;
                        return dli.f.a(customPeriodSelectController2, customPeriodSelectController2.d(), v.k(customPeriodSelectController2.P, customPeriodSelectController2.Q, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: mpd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomPeriodSelectController f207794b;

            {
                this.f207794b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CustomPeriodSelectController customPeriodSelectController = this.f207794b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomPeriodSelectController.S;
                        qji.b bVarU2 = customPeriodSelectController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.di.CustomPeriodSelectScreenInjector");
                        ppd.l lVar = (ppd.l) bVarU2;
                        ppd.n nVar = lVar.f238466b;
                        ppd.l lVar2 = lVar.f238467c;
                        CustomPeriodSelectContract$InputData customPeriodSelectContract$InputData = customPeriodSelectController.K;
                        customPeriodSelectContract$InputData.getClass();
                        return new y(nVar, lVar2, customPeriodSelectContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomPeriodSelectController.S;
                        return (d) ((y) customPeriodSelectController.N.getValue()).f238579c.get();
                    default:
                        KProperty[] kPropertyArr3 = CustomPeriodSelectController.S;
                        CustomPeriodSelectController customPeriodSelectController2 = this.f207794b;
                        return dli.f.a(customPeriodSelectController2, customPeriodSelectController2.d(), v.k(customPeriodSelectController2.P, customPeriodSelectController2.Q, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.P = new InputTextDelegate(null);
        this.Q = new DatePickerDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: mpd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomPeriodSelectController f207794b;

            {
                this.f207794b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CustomPeriodSelectController customPeriodSelectController = this.f207794b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomPeriodSelectController.S;
                        qji.b bVarU2 = customPeriodSelectController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.di.CustomPeriodSelectScreenInjector");
                        ppd.l lVar = (ppd.l) bVarU2;
                        ppd.n nVar = lVar.f238466b;
                        ppd.l lVar2 = lVar.f238467c;
                        CustomPeriodSelectContract$InputData customPeriodSelectContract$InputData = customPeriodSelectController.K;
                        customPeriodSelectContract$InputData.getClass();
                        return new y(nVar, lVar2, customPeriodSelectContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomPeriodSelectController.S;
                        return (d) ((y) customPeriodSelectController.N.getValue()).f238579c.get();
                    default:
                        KProperty[] kPropertyArr3 = CustomPeriodSelectController.S;
                        CustomPeriodSelectController customPeriodSelectController2 = this.f207794b;
                        return dli.f.a(customPeriodSelectController2, customPeriodSelectController2.d(), v.k(customPeriodSelectController2.P, customPeriodSelectController2.Q, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f207792b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (y) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.analytics_spendings_custom_period_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.analytics_spendings_custom_period_title, null, null, 14));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.analytics_period_filter_screen_button, null, null, 14));
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new mpd.h(this, continuation, 0), 3);
        InputTextDelegate inputTextDelegate = this.P;
        com.revolut.kompot.navigable.a.g2(this, l.y(inputTextDelegate.i.f121375b, inputTextDelegate.f52575g.f121375b, "merge(...)"), null, new i(this, null), 3);
        DatePickerDelegate datePickerDelegate = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(datePickerDelegate.f52176c.f121375b), null, new j(this, continuation, 0), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(datePickerDelegate.d.f121375b), null, new j(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new mpd.h(this, continuation, i), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d d() {
        return (d) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
