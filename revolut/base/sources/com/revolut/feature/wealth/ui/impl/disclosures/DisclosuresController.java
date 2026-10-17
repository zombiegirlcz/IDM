package com.revolut.feature.wealth.ui.impl.disclosures;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.ui.impl.disclosures.DisclosuresController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mkh.g;
import p0l.d;
import pe2.c;
import pkh.b;
import pkh.j;
import pkh.k;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/disclosures/DisclosuresController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lpkh/j;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DisclosuresController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(DisclosuresController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PlainTextDelegate K;
    public final h L;
    public final Object M;
    public final Object N;
    public final int O;
    public final Object P;

    public DisclosuresController(DisclosuresControllerContract$Input inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new PlainTextDelegate();
        this.L = s.t(this, b.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: pkh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DisclosuresController f237179b;

            {
                this.f237179b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = DisclosuresController.Q;
                        return (k) ((mkh.g) this.f237179b.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = DisclosuresController.Q;
                        DisclosuresController disclosuresController = this.f237179b;
                        return dli.f.a(disclosuresController, (k) disclosuresController.M.getValue(), u.c(disclosuresController.K), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.N = w.y0(new c(this, inputData, 11));
        this.O = R$layout.screen_recycler_navbar;
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: pkh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DisclosuresController f237179b;

            {
                this.f237179b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DisclosuresController.Q;
                        return (k) ((mkh.g) this.f237179b.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = DisclosuresController.Q;
                        DisclosuresController disclosuresController = this.f237179b;
                        return dli.f.a(disclosuresController, (k) disclosuresController.M.getValue(), u.c(disclosuresController.K), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f237190a;
        Clause clause2 = uiState.f237191b;
        navBarWithToolbar.setTitle(clause, null);
        if (clause != null) {
            navBarWithToolbar.setToolbarTitle(clause);
        }
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
        navBarWithToolbar.setDescriptionText(clause2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new d(this, null, 26), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.p0()), new pkh.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.K.d.f121375b), new pkh.c(this, null, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
