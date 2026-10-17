package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.JuniorPersonalDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import li8.d;
import li8.i;
import li8.j;
import qh8.m;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lli8/i;", "Ldli/a;", "Lli8/k;", "<init>", "()V", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorPersonalDetailsScreen extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(JuniorPersonalDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_action_footer;
    public final h L = s.t(this, a.f);
    public final InputTextDelegate M = new InputTextDelegate(new lcc.c(this, 15));
    public final Object N;
    public final Object O;
    public final Object P;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, k.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return k.a(p0);
        }
    }

    public JuniorPersonalDetailsScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: li8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPersonalDetailsScreen f195428b;

            {
                this.f195428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorPersonalDetailsScreen juniorPersonalDetailsScreen = this.f195428b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorPersonalDetailsScreen.Q;
                        qji.b bVarU2 = juniorPersonalDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.di.JuniorPersonalDetailsScreenInjector");
                        qh8.l lVar = (qh8.l) bVarU2;
                        return new qh8.m(lVar.f246540a, lVar.f246541b);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorPersonalDetailsScreen.Q;
                        return (j) ((qh8.m) juniorPersonalDetailsScreen.N.getValue()).f246545c.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorPersonalDetailsScreen.Q;
                        JuniorPersonalDetailsScreen juniorPersonalDetailsScreen2 = this.f195428b;
                        return dli.f.a(juniorPersonalDetailsScreen2, juniorPersonalDetailsScreen2.d(), u.c(juniorPersonalDetailsScreen2.M), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: li8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPersonalDetailsScreen f195428b;

            {
                this.f195428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorPersonalDetailsScreen juniorPersonalDetailsScreen = this.f195428b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorPersonalDetailsScreen.Q;
                        qji.b bVarU2 = juniorPersonalDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.di.JuniorPersonalDetailsScreenInjector");
                        qh8.l lVar = (qh8.l) bVarU2;
                        return new qh8.m(lVar.f246540a, lVar.f246541b);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorPersonalDetailsScreen.Q;
                        return (j) ((qh8.m) juniorPersonalDetailsScreen.N.getValue()).f246545c.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorPersonalDetailsScreen.Q;
                        JuniorPersonalDetailsScreen juniorPersonalDetailsScreen2 = this.f195428b;
                        return dli.f.a(juniorPersonalDetailsScreen2, juniorPersonalDetailsScreen2.d(), u.c(juniorPersonalDetailsScreen2.M), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: li8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPersonalDetailsScreen f195428b;

            {
                this.f195428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorPersonalDetailsScreen juniorPersonalDetailsScreen = this.f195428b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorPersonalDetailsScreen.Q;
                        qji.b bVarU2 = juniorPersonalDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.di.JuniorPersonalDetailsScreenInjector");
                        qh8.l lVar = (qh8.l) bVarU2;
                        return new qh8.m(lVar.f246540a, lVar.f246541b);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorPersonalDetailsScreen.Q;
                        return (j) ((qh8.m) juniorPersonalDetailsScreen.N.getValue()).f246545c.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorPersonalDetailsScreen.Q;
                        JuniorPersonalDetailsScreen juniorPersonalDetailsScreen2 = this.f195428b;
                        return dli.f.a(juniorPersonalDetailsScreen2, juniorPersonalDetailsScreen2.d(), u.c(juniorPersonalDetailsScreen2.M), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        li8.k uiState = (li8.k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setTitle(uiState.f195432a, null);
        navBarWithToolbar.setToolbarTitle(uiState.f195432a);
        ActionFooterView actionFooterView = d3().f174533b;
        e eVar = uiState.f195433b;
        actionFooterView.setVisibility(0);
        actionFooterView.setModel(eVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (m) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new li8.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new li8.b(this, continuation, 1), 3);
        InputTextDelegate inputTextDelegate = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.e.f121375b), null, new li8.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(inputTextDelegate.f52575g.f121375b), rd0.e.b(inputTextDelegate.i.f121375b)), null, new d(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j h3() {
        return (j) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF0() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
