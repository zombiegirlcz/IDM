package com.revolut.feature.credit.application.plugins.impl.ui.singleselectordetails;

import a2g.p;
import a92.d;
import agh.b;
import ai4.e;
import ai4.f;
import ai4.h;
import ai4.i;
import ai4.j;
import ai4.l;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import au0.j4;
import cli.o;
import cli.q;
import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.singleselectordetails.SingleSelectorInputDetailsScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$layout;
import dli.a;
import dw3.q6;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import vkm.j2;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/singleselectordetails/SingleSelectorInputDetailsScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lai4/h;", "", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SingleSelectorInputDetailsScreen extends PluginScreenController<h> implements c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(SingleSelectorInputDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int L;
    public final Object M;
    public final Object N;
    public final ao.h O;
    public final Object P;
    public final Object Q;

    public SingleSelectorInputDetailsScreen(SingleSelectorInputDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = R$layout.screen_recycler_navbar;
        this.M = w.y0(new b(this, inputData, 4));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ai4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SingleSelectorInputDetailsScreen f5181b;

            {
                this.f5181b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = SingleSelectorInputDetailsScreen.R;
                        return (i) ((q6) this.f5181b.M.getValue()).f119601h.get();
                    default:
                        KProperty[] kPropertyArr2 = SingleSelectorInputDetailsScreen.R;
                        SingleSelectorInputDetailsScreen singleSelectorInputDetailsScreen = this.f5181b;
                        return tki.g.a(singleSelectorInputDetailsScreen, singleSelectorInputDetailsScreen.d(), u.c((RowDelegate) singleSelectorInputDetailsScreen.Q.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.O = s.t(this, ai4.b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ai4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SingleSelectorInputDetailsScreen f5181b;

            {
                this.f5181b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SingleSelectorInputDetailsScreen.R;
                        return (i) ((q6) this.f5181b.M.getValue()).f119601h.get();
                    default:
                        KProperty[] kPropertyArr2 = SingleSelectorInputDetailsScreen.R;
                        SingleSelectorInputDetailsScreen singleSelectorInputDetailsScreen = this.f5181b;
                        return tki.g.a(singleSelectorInputDetailsScreen, singleSelectorInputDetailsScreen.d(), u.c((RowDelegate) singleSelectorInputDetailsScreen.Q.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.Q = w.y0(new d(23));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        boolean z = uiState.f5188b;
        TextClause textClause = uiState.f5187a;
        if (z) {
            navBarWithToolbar.K0(j4.NO_ANIMATION);
        } else {
            navBarWithToolbar.m0(j4.NO_ANIMATION);
        }
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.credit_loan_account_header_search, null, null, 14));
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setToolbarTitle(textClause);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        l lVar = (l) d();
        y yVar = lVar.o;
        if (!((e) ((j2) yVar.f22677a).getValue()).f5183b) {
            lVar.C2(f.f5185a);
            return true;
        }
        lVar.H2(yVar, new agh.h(20));
        lVar.H2(yVar, new p(false, 9));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (q6) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        m mVarD3 = d3();
        mVarD3.f174539b.setHeaderTitleMode(j0.MULTILINE);
        NavBarWithToolbar navBarWithToolbar = mVarD3.f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setEnabled(false);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSearchButtonActive(true);
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new ai4.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.v0()), null, new ai4.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), null, new af4.e(this, null, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h), null, new ai4.d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.P.getValue();
    }
}
