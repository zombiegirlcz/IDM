package com.revolut.feature.payees.impl.ui.payees_overview.personal;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.payees.impl.ui.payees_overview.personal.PayeesOverviewScreen;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import hm9.l;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rm9.e;
import te0.w;
import vc.s;
import wm9.b;
import wm9.c;
import wm9.d;
import wm9.f;
import wm9.h;
import wm9.i;
import wm9.j;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/payees_overview/personal/PayeesOverviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrm9/e;", "Ldli/a;", "Lwm9/j;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayeesOverviewScreen extends ViewController<e> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PayeesOverviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final int L;
    public final ao.h M;
    public final ListSubheaderDelegate N;
    public final LargeActionButtonDelegate O;
    public final SwipeToActionDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public PayeesOverviewScreen(h inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = new ListSubheaderDelegate();
        this.O = new LargeActionButtonDelegate();
        this.P = new SwipeToActionDelegate(new RowDelegate(null, null, 7), false);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: wm9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayeesOverviewScreen f298619b;

            {
                this.f298619b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayeesOverviewScreen payeesOverviewScreen = this.f298619b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayeesOverviewScreen.T;
                        PayeesOverviewScreen payeesOverviewScreen2 = this.f298619b;
                        return dli.f.a(payeesOverviewScreen2, payeesOverviewScreen2.d(), v.k(payeesOverviewScreen2.P, new RowLoadingDelegate(), payeesOverviewScreen2.N, new FullScreenStateDelegate(), payeesOverviewScreen2.O), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PayeesOverviewScreen.T;
                        qji.b bVarU2 = payeesOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payees.impl.ui.payees_overview.personal.di.PayeesOverviewScreenInjector");
                        return (hm9.l) ((hm9.k) ((xm9.a) bVarU2).c().mo3808a(payeesOverviewScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = PayeesOverviewScreen.T;
                        hm9.l lVar = (hm9.l) payeesOverviewScreen.R.getValue();
                        switch (lVar.f153577a) {
                            case 0:
                                return (i) lVar.f153579c.get();
                            default:
                                return (i) lVar.f153579c.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: wm9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayeesOverviewScreen f298619b;

            {
                this.f298619b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayeesOverviewScreen payeesOverviewScreen = this.f298619b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayeesOverviewScreen.T;
                        PayeesOverviewScreen payeesOverviewScreen2 = this.f298619b;
                        return dli.f.a(payeesOverviewScreen2, payeesOverviewScreen2.d(), v.k(payeesOverviewScreen2.P, new RowLoadingDelegate(), payeesOverviewScreen2.N, new FullScreenStateDelegate(), payeesOverviewScreen2.O), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PayeesOverviewScreen.T;
                        qji.b bVarU2 = payeesOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payees.impl.ui.payees_overview.personal.di.PayeesOverviewScreenInjector");
                        return (hm9.l) ((hm9.k) ((xm9.a) bVarU2).c().mo3808a(payeesOverviewScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = PayeesOverviewScreen.T;
                        hm9.l lVar = (hm9.l) payeesOverviewScreen.R.getValue();
                        switch (lVar.f153577a) {
                            case 0:
                                return (i) lVar.f153579c.get();
                            default:
                                return (i) lVar.f153579c.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: wm9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayeesOverviewScreen f298619b;

            {
                this.f298619b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayeesOverviewScreen payeesOverviewScreen = this.f298619b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayeesOverviewScreen.T;
                        PayeesOverviewScreen payeesOverviewScreen2 = this.f298619b;
                        return dli.f.a(payeesOverviewScreen2, payeesOverviewScreen2.d(), v.k(payeesOverviewScreen2.P, new RowLoadingDelegate(), payeesOverviewScreen2.N, new FullScreenStateDelegate(), payeesOverviewScreen2.O), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PayeesOverviewScreen.T;
                        qji.b bVarU2 = payeesOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payees.impl.ui.payees_overview.personal.di.PayeesOverviewScreenInjector");
                        return (hm9.l) ((hm9.k) ((xm9.a) bVarU2).c().mo3808a(payeesOverviewScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = PayeesOverviewScreen.T;
                        hm9.l lVar = (hm9.l) payeesOverviewScreen.R.getValue();
                        switch (lVar.f153577a) {
                            case 0:
                                return (i) lVar.f153579c.get();
                            default:
                                return (i) lVar.f153579c.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.security_hub_home_payees, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.security_hub_home_payees, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        this.K.getClass();
        navBarWithToolbar.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new wkg.e(this, null, 4), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.N;
        ViewController.P2(this, rd0.e.b(listSubheaderDelegate.e), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(listSubheaderDelegate.f52707c), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.d.f121375b), new wm9.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f), new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
