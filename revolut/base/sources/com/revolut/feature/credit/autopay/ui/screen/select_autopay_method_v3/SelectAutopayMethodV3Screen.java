package com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3.SelectAutopayMethodV3Screen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.m;
import jm4.r3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import te0.w;
import ujb.v;
import uk4.b;
import uk4.e;
import uk4.f;
import uk4.g;
import vc.s;
import vkm.d;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/select_autopay_method_v3/SelectAutopayMethodV3Screen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Luk4/e;", "Ldli/a;", "Luk4/h;", "Lno/k;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectAutopayMethodV3Screen extends ViewController<e> implements dli.a, k {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(SelectAutopayMethodV3Screen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final Object L;
    public AnalyticsContext M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public SelectAutopayMethodV3Screen(SelectAutopayMethodV3ScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = w.y0(new v(6));
        this.M = inputData.f68656b;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: uk4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectAutopayMethodV3Screen f280674b;

            {
                this.f280674b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = SelectAutopayMethodV3Screen.R;
                        SelectAutopayMethodV3Screen selectAutopayMethodV3Screen = this.f280674b;
                        return dli.f.a(selectAutopayMethodV3Screen, (f) selectAutopayMethodV3Screen.Q.getValue(), u.c((RowDelegate) selectAutopayMethodV3Screen.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = SelectAutopayMethodV3Screen.R;
                        r3 r3Var = (r3) this.f280674b.P.getValue();
                        switch (r3Var.f176315a) {
                            case 0:
                                return (f) r3Var.d.get();
                            default:
                                return (f) r3Var.d.get();
                        }
                }
            }
        });
        this.O = s.t(this, b.f);
        this.P = w.y0(new uj7.a(this, inputData, 1));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: uk4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectAutopayMethodV3Screen f280674b;

            {
                this.f280674b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SelectAutopayMethodV3Screen.R;
                        SelectAutopayMethodV3Screen selectAutopayMethodV3Screen = this.f280674b;
                        return dli.f.a(selectAutopayMethodV3Screen, (f) selectAutopayMethodV3Screen.Q.getValue(), u.c((RowDelegate) selectAutopayMethodV3Screen.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = SelectAutopayMethodV3Screen.R;
                        r3 r3Var = (r3) this.f280674b.P.getValue();
                        switch (r3Var.f176315a) {
                            case 0:
                                return (f) r3Var.d.get();
                            default:
                                return (f) r3Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        uk4.h uiState = (uk4.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        g gVar = uiState.f280683a;
        Clause clause = gVar.f280680a;
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setNavigationButtonImage(gVar.f280682c);
        Clause clause2 = gVar.f280681b;
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        navBarWithToolbar.setSecondDescriptionText(clause2);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.M = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r3) this.P.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d dVarB = rd0.e.b(((RowDelegate) this.L.getValue()).f53218h);
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(dVarB, new tzh.g(rd0.e.b(((m) value).f174539b.f59410q), 21)), null, new uf0.d(this, null, 10), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
