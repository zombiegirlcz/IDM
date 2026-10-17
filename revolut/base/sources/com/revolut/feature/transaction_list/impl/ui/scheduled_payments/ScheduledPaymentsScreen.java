package com.revolut.feature.transaction_list.impl.ui.scheduled_payments;

import ahf.d;
import ahf.f;
import ahf.i;
import ahf.j;
import ahf.k;
import ahf.n;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transaction_list.impl.R$string;
import com.revolut.feature.transaction_list.impl.ui.scheduled_payments.ScheduledPaymentsScreen;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import efm.r;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mkd.g;
import pgf.c;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transaction_list/impl/ui/scheduled_payments/ScheduledPaymentsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lahf/n;", "Lmkd/g;", "feature_transaction_list_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScheduledPaymentsScreen extends ViewController<q> implements a, g {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(ScheduledPaymentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final ScheduledPaymentsInputData K;
    public final int L;
    public final h M;
    public final Integer N;
    public final Object O;
    public final Object P;
    public final ActionWidgetDelegate Q;
    public final RowDelegate R;
    public final SwipeToActionDelegate S;
    public final RowDelegate T;
    public final InputDisclosureDelegate U;
    public final FullScreenStateDelegate V;
    public final ListSubheaderDelegate W;
    public final ScrollerDelegate X;
    public final Object Y;

    public ScheduledPaymentsScreen(ScheduledPaymentsInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, d.f);
        this.N = inputData.f91972b ? Integer.valueOf(R$style.UiKitTheme_Transparent) : null;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ahf.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduledPaymentsScreen f5073b;

            {
                this.f5073b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ScheduledPaymentsScreen scheduledPaymentsScreen = this.f5073b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ScheduledPaymentsScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(scheduledPaymentsScreen.m2()).a().get(phf.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", phf.a.class, " is not found"));
                        }
                        pgf.e eVar = ((pgf.e) aVar2.b()).V;
                        ScheduledPaymentsInputData scheduledPaymentsInputData = scheduledPaymentsScreen.K;
                        scheduledPaymentsInputData.getClass();
                        return new pgf.c(eVar, scheduledPaymentsScreen, scheduledPaymentsInputData, scheduledPaymentsScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = ScheduledPaymentsScreen.Z;
                        return (m) ((pgf.c) scheduledPaymentsScreen.O.getValue()).f235890l.get();
                    default:
                        KProperty[] kPropertyArr3 = ScheduledPaymentsScreen.Z;
                        ScheduledPaymentsScreen scheduledPaymentsScreen2 = this.f5073b;
                        return dli.f.a(scheduledPaymentsScreen2, scheduledPaymentsScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), scheduledPaymentsScreen2.Q, scheduledPaymentsScreen2.V, scheduledPaymentsScreen2.U, scheduledPaymentsScreen2.W, scheduledPaymentsScreen2.R, scheduledPaymentsScreen2.S, scheduledPaymentsScreen2.X), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ahf.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduledPaymentsScreen f5073b;

            {
                this.f5073b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ScheduledPaymentsScreen scheduledPaymentsScreen = this.f5073b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScheduledPaymentsScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(scheduledPaymentsScreen.m2()).a().get(phf.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", phf.a.class, " is not found"));
                        }
                        pgf.e eVar = ((pgf.e) aVar2.b()).V;
                        ScheduledPaymentsInputData scheduledPaymentsInputData = scheduledPaymentsScreen.K;
                        scheduledPaymentsInputData.getClass();
                        return new pgf.c(eVar, scheduledPaymentsScreen, scheduledPaymentsInputData, scheduledPaymentsScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = ScheduledPaymentsScreen.Z;
                        return (m) ((pgf.c) scheduledPaymentsScreen.O.getValue()).f235890l.get();
                    default:
                        KProperty[] kPropertyArr3 = ScheduledPaymentsScreen.Z;
                        ScheduledPaymentsScreen scheduledPaymentsScreen2 = this.f5073b;
                        return dli.f.a(scheduledPaymentsScreen2, scheduledPaymentsScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), scheduledPaymentsScreen2.Q, scheduledPaymentsScreen2.V, scheduledPaymentsScreen2.U, scheduledPaymentsScreen2.W, scheduledPaymentsScreen2.R, scheduledPaymentsScreen2.S, scheduledPaymentsScreen2.X), 0, null, null, null, 60);
                }
            }
        });
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.Q = actionWidgetDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        this.S = new SwipeToActionDelegate(rowDelegate, false);
        this.T = new RowDelegate(null, null, 7);
        this.U = new InputDisclosureDelegate();
        this.V = new FullScreenStateDelegate();
        this.W = new ListSubheaderDelegate();
        this.X = new ScrollerDelegate(u.c(actionWidgetDelegate), false);
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: ahf.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduledPaymentsScreen f5073b;

            {
                this.f5073b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ScheduledPaymentsScreen scheduledPaymentsScreen = this.f5073b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScheduledPaymentsScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(scheduledPaymentsScreen.m2()).a().get(phf.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", phf.a.class, " is not found"));
                        }
                        pgf.e eVar = ((pgf.e) aVar2.b()).V;
                        ScheduledPaymentsInputData scheduledPaymentsInputData = scheduledPaymentsScreen.K;
                        scheduledPaymentsInputData.getClass();
                        return new pgf.c(eVar, scheduledPaymentsScreen, scheduledPaymentsInputData, scheduledPaymentsScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = ScheduledPaymentsScreen.Z;
                        return (m) ((pgf.c) scheduledPaymentsScreen.O.getValue()).f235890l.get();
                    default:
                        KProperty[] kPropertyArr3 = ScheduledPaymentsScreen.Z;
                        ScheduledPaymentsScreen scheduledPaymentsScreen2 = this.f5073b;
                        return dli.f.a(scheduledPaymentsScreen2, scheduledPaymentsScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), scheduledPaymentsScreen2.Q, scheduledPaymentsScreen2.V, scheduledPaymentsScreen2.U, scheduledPaymentsScreen2.W, scheduledPaymentsScreen2.R, scheduledPaymentsScreen2.S, scheduledPaymentsScreen2.X), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getN() {
        return this.N;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174539b.setMenuItems(uiState.f5089b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((c) this.O.getValue()).f.get()).d(u.c(this.T));
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.schedule_payments_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.schedule_payments_header_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHint(new TextLocalisedClause(com.revolut.feature.transactions.api.R$string.transaction_list_navbar_search_hint_text, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new a07.d(this, null, 24), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new f(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), new f(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new ahf.g(this, null), 3);
        r map = this.S.f.map(new aed.f(new agh.h(16), 24));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewController.P2(this, rd0.e.b(map), new ahf.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.V.f52371h.f121375b), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.U.f52538c), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.f53218h), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.W.e), new ahf.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f51589c.f121375b), new f(this, null, 0), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ahf.m R2() {
        return (ahf.m) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        return ((dli.c) this.Y.getValue()).w().f;
    }
}
