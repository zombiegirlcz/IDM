package com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_status;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_status.StudentStatusScreen;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qgk.x1;
import te0.w;
import vc.s;
import ynk.b;
import ynk.c;
import ynk.e;
import ynk.f;
import ynk.g;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/student_status/StudentStatusScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lynk/e;", "Ldli/a;", "Lynk/g;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StudentStatusScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(StudentStatusScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final int L;
    public final RowDelegate M;
    public final Object N;
    public final Object O;
    public final Object P;

    public StudentStatusScreen(StudentStatusScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = R$layout.screen_recycler_navbar;
        this.M = new RowDelegate(null, null, 7);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ynk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StudentStatusScreen f315495b;

            {
                this.f315495b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = StudentStatusScreen.Q;
                        StudentStatusScreen studentStatusScreen = this.f315495b;
                        return dli.f.a(studentStatusScreen, (f) studentStatusScreen.P.getValue(), u.c(studentStatusScreen.M), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = StudentStatusScreen.Q;
                        return (f) ((x1) this.f315495b.O.getValue()).f246323b.get();
                }
            }
        });
        this.O = w.y0(new yff.b(this, inputData, 12));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ynk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StudentStatusScreen f315495b;

            {
                this.f315495b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StudentStatusScreen.Q;
                        StudentStatusScreen studentStatusScreen = this.f315495b;
                        return dli.f.a(studentStatusScreen, (f) studentStatusScreen.P.getValue(), u.c(studentStatusScreen.M), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = StudentStatusScreen.Q;
                        return (f) ((x1) this.f315495b.O.getValue()).f246323b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x1) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.student_plans_status_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new yl6.b(this, null, 6), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
