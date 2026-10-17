package com.revolut.feature.apm.core.ui.impl.ui.topup_request.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.TopupRequestDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l42.c;
import l42.d;
import p12.r0;
import p12.t0;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/topup_request/details/TopupRequestDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ll42/d;", "<init>", "()V", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TopupRequestDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TopupRequestDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final Object N = w.y0(new kw4.b(14));
    public final Object O = w.y0(new kw4.b(15));
    public final Object P;
    public final Object Q;
    public final Object R;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public TopupRequestDetailsScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: l42.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopupRequestDetailsScreen f192042b;

            {
                this.f192042b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TopupRequestDetailsScreen topupRequestDetailsScreen = this.f192042b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TopupRequestDetailsScreen.S;
                        TopupRequestDetailsScreen topupRequestDetailsScreen2 = this.f192042b;
                        return dli.f.a(topupRequestDetailsScreen2, (e) topupRequestDetailsScreen2.R.getValue(), v.k(new CellDetailsNoteDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (ActionsDelegate) topupRequestDetailsScreen2.N.getValue(), (CellDetailsChevronDelegate) topupRequestDetailsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TopupRequestDetailsScreen.S;
                        qji.b bVarU2 = topupRequestDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.di.TopupRequestDetailsScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        p12.v vVar = t0Var.f231769b;
                        t0 t0Var2 = t0Var.f231770c;
                        r0 r0Var = new r0();
                        int i3 = 20;
                        r0Var.f231758a = e4m.b.b(new ned.h(vVar, t0Var2, r0Var, 1, i3));
                        r0Var.f231759b = e4m.b.b(new ned.h(vVar, t0Var2, r0Var, 0, i3));
                        return r0Var;
                    default:
                        KProperty[] kPropertyArr3 = TopupRequestDetailsScreen.S;
                        return (e) ((r0) topupRequestDetailsScreen.Q.getValue()).f231759b.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: l42.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopupRequestDetailsScreen f192042b;

            {
                this.f192042b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TopupRequestDetailsScreen topupRequestDetailsScreen = this.f192042b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TopupRequestDetailsScreen.S;
                        TopupRequestDetailsScreen topupRequestDetailsScreen2 = this.f192042b;
                        return dli.f.a(topupRequestDetailsScreen2, (e) topupRequestDetailsScreen2.R.getValue(), v.k(new CellDetailsNoteDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (ActionsDelegate) topupRequestDetailsScreen2.N.getValue(), (CellDetailsChevronDelegate) topupRequestDetailsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TopupRequestDetailsScreen.S;
                        qji.b bVarU2 = topupRequestDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.di.TopupRequestDetailsScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        p12.v vVar = t0Var.f231769b;
                        t0 t0Var2 = t0Var.f231770c;
                        r0 r0Var = new r0();
                        int i3 = 20;
                        r0Var.f231758a = e4m.b.b(new ned.h(vVar, t0Var2, r0Var, 1, i3));
                        r0Var.f231759b = e4m.b.b(new ned.h(vVar, t0Var2, r0Var, 0, i3));
                        return r0Var;
                    default:
                        KProperty[] kPropertyArr3 = TopupRequestDetailsScreen.S;
                        return (e) ((r0) topupRequestDetailsScreen.Q.getValue()).f231759b.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: l42.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopupRequestDetailsScreen f192042b;

            {
                this.f192042b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TopupRequestDetailsScreen topupRequestDetailsScreen = this.f192042b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TopupRequestDetailsScreen.S;
                        TopupRequestDetailsScreen topupRequestDetailsScreen2 = this.f192042b;
                        return dli.f.a(topupRequestDetailsScreen2, (e) topupRequestDetailsScreen2.R.getValue(), v.k(new CellDetailsNoteDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (ActionsDelegate) topupRequestDetailsScreen2.N.getValue(), (CellDetailsChevronDelegate) topupRequestDetailsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TopupRequestDetailsScreen.S;
                        qji.b bVarU2 = topupRequestDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.di.TopupRequestDetailsScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        p12.v vVar = t0Var.f231769b;
                        t0 t0Var2 = t0Var.f231770c;
                        r0 r0Var = new r0();
                        int i32 = 20;
                        r0Var.f231758a = e4m.b.b(new ned.h(vVar, t0Var2, r0Var, 1, i32));
                        r0Var.f231759b = e4m.b.b(new ned.h(vVar, t0Var2, r0Var, 0, i32));
                        return r0Var;
                    default:
                        KProperty[] kPropertyArr3 = TopupRequestDetailsScreen.S;
                        return (e) ((r0) topupRequestDetailsScreen.Q.getValue()).f231759b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        c cVar = uiState.f192040b;
        if (cVar == null) {
            return;
        }
        MoneyClause moneyClause = cVar.f192036a;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = cVar.f192037b;
        navBarWithToolbar.setTitle(moneyClause, null);
        navBarWithToolbar.setToolbarTitle(moneyClause);
        navBarWithToolbar.setSecondDescriptionText(cVar.f192038c);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(textLocalisedClause);
        navBarWithToolbar.setEndIconImage(cVar.d);
        navBarWithToolbar.setEndIconBadgeImage(cVar.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r0) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (l42.e) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new ko2.b(this, continuation, 23), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ActionsDelegate) this.N.getValue()).f51611c.f121375b), null, new l1g.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsChevronDelegate) this.O.getValue()).f51821c), null, new l42.h(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
