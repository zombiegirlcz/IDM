package com.revolut.feature.wealth.ui.impl.statements.screen;

import aii.q;
import amh.g;
import amh.i;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.DropDownLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.wealth.ui.impl.statements.screen.StatementScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mkh.n;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/statements/screen/StatementScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lamh/i;", "<init>", "()V", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StatementScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(StatementScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object M;
    public final Object O;
    public final Object P;
    public final h K = s.t(this, a.f);
    public final FixedTabsDelegate L = new FixedTabsDelegate();
    public final int N = R$layout.screen_recycler_navbar_nextbutton;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public StatementScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: amh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatementScreen f6394b;

            {
                this.f6394b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StatementScreen statementScreen = this.f6394b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StatementScreen.Q;
                        return (g) ((mkh.n) statementScreen.P.getValue()).f206357l.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StatementScreen.Q;
                        StatementScreen statementScreen2 = this.f6394b;
                        g gVar = (g) statementScreen2.M.getValue();
                        int i3 = R$id.recyclerView;
                        List listK = zhm.v.k(new TextDelegate(), statementScreen2.L);
                        ylh.p pVar = (ylh.p) ((ylh.i) ((mkh.n) statementScreen2.P.getValue()).f206354g.get());
                        return dli.f.a(statementScreen2, gVar, d0.E0(zhm.v.k(pVar.e, pVar.f, pVar.f314719g, pVar.f314720h, new DropDownLoadingDelegate()), listK), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = StatementScreen.Q;
                        qji.b bVarU2 = statementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.ui.impl.statements.screen.di.StatementScreenInjector");
                        mkh.m mVar = (mkh.m) bVarU2;
                        return new mkh.n(mVar.f206349b, mVar.f206350c, statementScreen);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: amh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatementScreen f6394b;

            {
                this.f6394b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StatementScreen statementScreen = this.f6394b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StatementScreen.Q;
                        return (g) ((mkh.n) statementScreen.P.getValue()).f206357l.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StatementScreen.Q;
                        StatementScreen statementScreen2 = this.f6394b;
                        g gVar = (g) statementScreen2.M.getValue();
                        int i3 = R$id.recyclerView;
                        List listK = zhm.v.k(new TextDelegate(), statementScreen2.L);
                        ylh.p pVar = (ylh.p) ((ylh.i) ((mkh.n) statementScreen2.P.getValue()).f206354g.get());
                        return dli.f.a(statementScreen2, gVar, d0.E0(zhm.v.k(pVar.e, pVar.f, pVar.f314719g, pVar.f314720h, new DropDownLoadingDelegate()), listK), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = StatementScreen.Q;
                        qji.b bVarU2 = statementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.ui.impl.statements.screen.di.StatementScreenInjector");
                        mkh.m mVar = (mkh.m) bVarU2;
                        return new mkh.n(mVar.f206349b, mVar.f206350c, statementScreen);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: amh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatementScreen f6394b;

            {
                this.f6394b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StatementScreen statementScreen = this.f6394b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StatementScreen.Q;
                        return (g) ((mkh.n) statementScreen.P.getValue()).f206357l.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StatementScreen.Q;
                        StatementScreen statementScreen2 = this.f6394b;
                        g gVar = (g) statementScreen2.M.getValue();
                        int i32 = R$id.recyclerView;
                        List listK = zhm.v.k(new TextDelegate(), statementScreen2.L);
                        ylh.p pVar = (ylh.p) ((ylh.i) ((mkh.n) statementScreen2.P.getValue()).f206354g.get());
                        return dli.f.a(statementScreen2, gVar, d0.E0(zhm.v.k(pVar.e, pVar.f, pVar.f314719g, pVar.f314720h, new DropDownLoadingDelegate()), listK), i32, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = StatementScreen.Q;
                        qji.b bVarU2 = statementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.ui.impl.statements.screen.di.StatementScreenInjector");
                        mkh.m mVar = (mkh.m) bVarU2;
                        return new mkh.n(mVar.f206349b, mVar.f206350c, statementScreen);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f6403a);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f6404b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (g) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.statement_action_generate, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new amh.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new amh.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52339c.f121375b), null, new aee.g(2, (g) this.M.getValue(), g.class, "onTabSelected", "onTabSelected(Lcom/revolut/core/ui_kit/delegates/FixedTabsDelegate$SelectedData;)V", 4, 2), 3);
    }

    public final u d3() {
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
