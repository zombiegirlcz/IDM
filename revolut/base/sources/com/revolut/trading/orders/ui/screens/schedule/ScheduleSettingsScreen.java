package com.revolut.trading.orders.ui.screens.schedule;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.trading.orders.ui.screens.schedule.ScheduleSettingsScreen;
import dli.a;
import exe.j;
import ghk.t;
import gvl.g;
import gvl.i;
import gvl.n;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pdf.b;
import pdf.c;
import te0.w;
import vc.s;
import xki.e;
import xsl.l;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/screens/schedule/ScheduleSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpdf/c;", "", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScheduleSettingsScreen extends ViewController<c> implements a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(ScheduleSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;

    public ScheduleSettingsScreen(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, gvl.c.f);
        this.M = w.y0(new t(this, inputData, 26));
        final int i = 2;
        this.N = w.y0(new Function0(this) { // from class: gvl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleSettingsScreen f147216b;

            {
                this.f147216b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ScheduleSettingsScreen scheduleSettingsScreen = this.f147216b;
                switch (i2) {
                    case 0:
                        return v.k((ListSubheaderDelegate) scheduleSettingsScreen.Q.getValue(), (DatePickerDelegate) scheduleSettingsScreen.R.getValue(), (LargeActionButtonDelegate) scheduleSettingsScreen.S.getValue(), (SingleChoiceDelegate) scheduleSettingsScreen.T.getValue());
                    case 1:
                        KProperty[] kPropertyArr = ScheduleSettingsScreen.X;
                        ScheduleSettingsScreen scheduleSettingsScreen2 = this.f147216b;
                        o oVarD = scheduleSettingsScreen2.d();
                        List list = (List) scheduleSettingsScreen2.U.getValue();
                        ScreenContentRecyclerView recyclerView = scheduleSettingsScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return dli.f.a(scheduleSettingsScreen2, oVarD, list, recyclerView.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr2 = ScheduleSettingsScreen.X;
                        return (o) ((xsl.l) scheduleSettingsScreen.M.getValue()).f308674g.get();
                    default:
                        KProperty[] kPropertyArr3 = ScheduleSettingsScreen.X;
                        return v.k((InputTextDelegate) scheduleSettingsScreen.O.getValue(), (PlainTextDelegate) scheduleSettingsScreen.P.getValue());
                }
            }
        });
        this.O = w.y0(new gvi.b(2));
        this.P = w.y0(new gvi.b(3));
        this.Q = w.y0(new gvi.b(4));
        this.R = w.y0(new gvi.b(5));
        this.S = w.y0(new gvi.b(6));
        this.T = w.y0(new gvi.b(7));
        final int i2 = 3;
        this.U = w.y0(new Function0(this) { // from class: gvl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleSettingsScreen f147216b;

            {
                this.f147216b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ScheduleSettingsScreen scheduleSettingsScreen = this.f147216b;
                switch (i22) {
                    case 0:
                        return v.k((ListSubheaderDelegate) scheduleSettingsScreen.Q.getValue(), (DatePickerDelegate) scheduleSettingsScreen.R.getValue(), (LargeActionButtonDelegate) scheduleSettingsScreen.S.getValue(), (SingleChoiceDelegate) scheduleSettingsScreen.T.getValue());
                    case 1:
                        KProperty[] kPropertyArr = ScheduleSettingsScreen.X;
                        ScheduleSettingsScreen scheduleSettingsScreen2 = this.f147216b;
                        o oVarD = scheduleSettingsScreen2.d();
                        List list = (List) scheduleSettingsScreen2.U.getValue();
                        ScreenContentRecyclerView recyclerView = scheduleSettingsScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return dli.f.a(scheduleSettingsScreen2, oVarD, list, recyclerView.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr2 = ScheduleSettingsScreen.X;
                        return (o) ((xsl.l) scheduleSettingsScreen.M.getValue()).f308674g.get();
                    default:
                        KProperty[] kPropertyArr3 = ScheduleSettingsScreen.X;
                        return v.k((InputTextDelegate) scheduleSettingsScreen.O.getValue(), (PlainTextDelegate) scheduleSettingsScreen.P.getValue());
                }
            }
        });
        final int i3 = 0;
        this.V = w.y0(new Function0(this) { // from class: gvl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleSettingsScreen f147216b;

            {
                this.f147216b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ScheduleSettingsScreen scheduleSettingsScreen = this.f147216b;
                switch (i22) {
                    case 0:
                        return v.k((ListSubheaderDelegate) scheduleSettingsScreen.Q.getValue(), (DatePickerDelegate) scheduleSettingsScreen.R.getValue(), (LargeActionButtonDelegate) scheduleSettingsScreen.S.getValue(), (SingleChoiceDelegate) scheduleSettingsScreen.T.getValue());
                    case 1:
                        KProperty[] kPropertyArr = ScheduleSettingsScreen.X;
                        ScheduleSettingsScreen scheduleSettingsScreen2 = this.f147216b;
                        o oVarD = scheduleSettingsScreen2.d();
                        List list = (List) scheduleSettingsScreen2.U.getValue();
                        ScreenContentRecyclerView recyclerView = scheduleSettingsScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return dli.f.a(scheduleSettingsScreen2, oVarD, list, recyclerView.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr2 = ScheduleSettingsScreen.X;
                        return (o) ((xsl.l) scheduleSettingsScreen.M.getValue()).f308674g.get();
                    default:
                        KProperty[] kPropertyArr3 = ScheduleSettingsScreen.X;
                        return v.k((InputTextDelegate) scheduleSettingsScreen.O.getValue(), (PlainTextDelegate) scheduleSettingsScreen.P.getValue());
                }
            }
        });
        final int i5 = 1;
        this.W = w.y0(new Function0(this) { // from class: gvl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleSettingsScreen f147216b;

            {
                this.f147216b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ScheduleSettingsScreen scheduleSettingsScreen = this.f147216b;
                switch (i22) {
                    case 0:
                        return v.k((ListSubheaderDelegate) scheduleSettingsScreen.Q.getValue(), (DatePickerDelegate) scheduleSettingsScreen.R.getValue(), (LargeActionButtonDelegate) scheduleSettingsScreen.S.getValue(), (SingleChoiceDelegate) scheduleSettingsScreen.T.getValue());
                    case 1:
                        KProperty[] kPropertyArr = ScheduleSettingsScreen.X;
                        ScheduleSettingsScreen scheduleSettingsScreen2 = this.f147216b;
                        o oVarD = scheduleSettingsScreen2.d();
                        List list = (List) scheduleSettingsScreen2.U.getValue();
                        ScreenContentRecyclerView recyclerView = scheduleSettingsScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return dli.f.a(scheduleSettingsScreen2, oVarD, list, recyclerView.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr2 = ScheduleSettingsScreen.X;
                        return (o) ((xsl.l) scheduleSettingsScreen.M.getValue()).f308674g.get();
                    default:
                        KProperty[] kPropertyArr3 = ScheduleSettingsScreen.X;
                        return v.k((InputTextDelegate) scheduleSettingsScreen.O.getValue(), (PlainTextDelegate) scheduleSettingsScreen.P.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f147227a.f147226a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setText(uiState.f147229c.f147225a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((l) this.M.getValue()).e.get()).d((List) this.V.getValue());
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new g(this, null, 0), 3);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        ViewController.P2(this, rd0.e.b(goToButton.o), new g(this, null, 1), 3);
        ?? r87 = this.O;
        ViewController.P2(this, vkm.q.J(rd0.e.b(((InputTextDelegate) r87.getValue()).i.f121375b), rd0.e.b(((InputTextDelegate) r87.getValue()).f52575g.f121375b)), new gvl.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(((DatePickerDelegate) this.R.getValue()).f52176c.f121375b), new i(this, null, 0), 3);
        ViewController.P2(this, new j(new g9j.q(rd0.e.b(((LargeActionButtonDelegate) this.S.getValue()).d.f121375b), 25), 11), new i(this, null, 1), 3);
        ViewController.P2(this, new g9j.q(rd0.e.b(((SingleChoiceDelegate) this.T.getValue()).p()), 26), new i(this, null, 2), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final gvl.o d() {
        return (gvl.o) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }
}
