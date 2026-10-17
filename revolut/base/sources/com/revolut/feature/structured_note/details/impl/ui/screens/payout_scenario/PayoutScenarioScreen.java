package com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedBarDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.structured_note.details.impl.R$string;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.PayoutScenarioScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q97.b1;
import r0e.c;
import r5e.b;
import r5e.g;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/structured_note/details/impl/ui/screens/payout_scenario/PayoutScenarioScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lr5e/h;", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayoutScenarioScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PayoutScenarioScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final FixedTabsDelegate O;
    public final RowDelegate P;
    public final Object Q;

    public PayoutScenarioScreen(PayoutScenarioScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, b.f);
        this.M = w.y0(new qvf.a(this, inputData, 16));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: r5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayoutScenarioScreen f251585b;

            {
                this.f251585b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = PayoutScenarioScreen.R;
                        return (g) ((o4e.h) this.f251585b.M.getValue()).f222246b.get();
                    default:
                        KProperty[] kPropertyArr2 = PayoutScenarioScreen.R;
                        PayoutScenarioScreen payoutScenarioScreen = this.f251585b;
                        return dli.f.a(payoutScenarioScreen, (g) payoutScenarioScreen.N.getValue(), v.k(payoutScenarioScreen.P, new PlainTextDelegate(), new SegmentedBarDelegate(), new FullScreenStateDelegate(), new RowLoadingDelegate(), payoutScenarioScreen.O), 0, null, null, null, 60);
                }
            }
        });
        this.O = new FixedTabsDelegate();
        this.P = new RowDelegate(null, null, 7);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: r5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayoutScenarioScreen f251585b;

            {
                this.f251585b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayoutScenarioScreen.R;
                        return (g) ((o4e.h) this.f251585b.M.getValue()).f222246b.get();
                    default:
                        KProperty[] kPropertyArr2 = PayoutScenarioScreen.R;
                        PayoutScenarioScreen payoutScenarioScreen = this.f251585b;
                        return dli.f.a(payoutScenarioScreen, (g) payoutScenarioScreen.N.getValue(), v.k(payoutScenarioScreen.P, new PlainTextDelegate(), new SegmentedBarDelegate(), new FullScreenStateDelegate(), new RowLoadingDelegate(), payoutScenarioScreen.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((r5e.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o4e.h) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_structured_notes_payout_scenarios_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new c(this, null, 9), 3);
        ViewController.P2(this, new b1(rd0.e.b(this.O.f52339c.f121375b), 23), new qc8.b(this, null, 22), 3);
        ViewController.P2(this, new b1(rd0.e.b(this.P.f53218h), 24), new r5e.e(this, null, 0), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
