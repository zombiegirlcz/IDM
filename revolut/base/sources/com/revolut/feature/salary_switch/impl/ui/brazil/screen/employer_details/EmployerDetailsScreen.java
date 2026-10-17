package com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.salary_switch.impl.R$string;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.EmployerDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import vfg.m;
import vqc.i;
import vqc.j;
import vqc.k;
import xki.e;
import zpc.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/brazil/screen/employer_details/EmployerDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvqc/i;", "Ltki/c;", "Lvqc/k;", "<init>", "()V", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmployerDetailsScreen extends ViewController<i> implements c {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(EmployerDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object P;
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final h O = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
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

    public EmployerDetailsScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: vqc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmployerDetailsScreen f291371b;

            {
                this.f291371b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EmployerDetailsScreen employerDetailsScreen = this.f291371b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EmployerDetailsScreen.Q;
                        EmployerDetailsScreen employerDetailsScreen2 = this.f291371b;
                        return tki.g.a(employerDetailsScreen2, employerDetailsScreen2.R2(), zhm.u.c((InputTextDelegate) employerDetailsScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EmployerDetailsScreen.Q;
                        qji.b bVarU2 = employerDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.di.EmployerDetailsScreenInjector");
                        zpc.l lVar = (zpc.l) bVarU2;
                        return new zpc.d(lVar.f324270b, lVar.f324271c);
                    case 2:
                        KProperty[] kPropertyArr3 = EmployerDetailsScreen.Q;
                        return (j) ((zpc.d) employerDetailsScreen.M.getValue()).f324239b.get();
                    default:
                        KProperty[] kPropertyArr4 = EmployerDetailsScreen.Q;
                        return new InputTextDelegate(new c(2, 0, EmployerDetailsScreen.class, this.f291371b, "getMaskBinder", "getMaskBinder(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$Model;Lcom/revolut/core/ui_kit/views/input/InputText;)Lcom/revolut/core/ui_kit_core/inputtext/MaskingDelegate;"));
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: vqc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmployerDetailsScreen f291371b;

            {
                this.f291371b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EmployerDetailsScreen employerDetailsScreen = this.f291371b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EmployerDetailsScreen.Q;
                        EmployerDetailsScreen employerDetailsScreen2 = this.f291371b;
                        return tki.g.a(employerDetailsScreen2, employerDetailsScreen2.R2(), zhm.u.c((InputTextDelegate) employerDetailsScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EmployerDetailsScreen.Q;
                        qji.b bVarU2 = employerDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.di.EmployerDetailsScreenInjector");
                        zpc.l lVar = (zpc.l) bVarU2;
                        return new zpc.d(lVar.f324270b, lVar.f324271c);
                    case 2:
                        KProperty[] kPropertyArr3 = EmployerDetailsScreen.Q;
                        return (j) ((zpc.d) employerDetailsScreen.M.getValue()).f324239b.get();
                    default:
                        KProperty[] kPropertyArr4 = EmployerDetailsScreen.Q;
                        return new InputTextDelegate(new c(2, 0, EmployerDetailsScreen.class, this.f291371b, "getMaskBinder", "getMaskBinder(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$Model;Lcom/revolut/core/ui_kit/views/input/InputText;)Lcom/revolut/core/ui_kit_core/inputtext/MaskingDelegate;"));
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: vqc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmployerDetailsScreen f291371b;

            {
                this.f291371b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EmployerDetailsScreen employerDetailsScreen = this.f291371b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EmployerDetailsScreen.Q;
                        EmployerDetailsScreen employerDetailsScreen2 = this.f291371b;
                        return tki.g.a(employerDetailsScreen2, employerDetailsScreen2.R2(), zhm.u.c((InputTextDelegate) employerDetailsScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EmployerDetailsScreen.Q;
                        qji.b bVarU2 = employerDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.di.EmployerDetailsScreenInjector");
                        zpc.l lVar = (zpc.l) bVarU2;
                        return new zpc.d(lVar.f324270b, lVar.f324271c);
                    case 2:
                        KProperty[] kPropertyArr3 = EmployerDetailsScreen.Q;
                        return (j) ((zpc.d) employerDetailsScreen.M.getValue()).f324239b.get();
                    default:
                        KProperty[] kPropertyArr4 = EmployerDetailsScreen.Q;
                        return new InputTextDelegate(new c(2, 0, EmployerDetailsScreen.class, this.f291371b, "getMaskBinder", "getMaskBinder(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$Model;Lcom/revolut/core/ui_kit/views/input/InputText;)Lcom/revolut/core/ui_kit_core/inputtext/MaskingDelegate;"));
                }
            }
        });
        final int i5 = 3;
        this.P = w.y0(new Function0(this) { // from class: vqc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmployerDetailsScreen f291371b;

            {
                this.f291371b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                EmployerDetailsScreen employerDetailsScreen = this.f291371b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EmployerDetailsScreen.Q;
                        EmployerDetailsScreen employerDetailsScreen2 = this.f291371b;
                        return tki.g.a(employerDetailsScreen2, employerDetailsScreen2.R2(), zhm.u.c((InputTextDelegate) employerDetailsScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EmployerDetailsScreen.Q;
                        qji.b bVarU2 = employerDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.di.EmployerDetailsScreenInjector");
                        zpc.l lVar = (zpc.l) bVarU2;
                        return new zpc.d(lVar.f324270b, lVar.f324271c);
                    case 2:
                        KProperty[] kPropertyArr3 = EmployerDetailsScreen.Q;
                        return (j) ((zpc.d) employerDetailsScreen.M.getValue()).f324239b.get();
                    default:
                        KProperty[] kPropertyArr4 = EmployerDetailsScreen.Q;
                        return new InputTextDelegate(new c(2, 0, EmployerDetailsScreen.class, this.f291371b, "getMaskBinder", "getMaskBinder(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$Model;Lcom/revolut/core/ui_kit/views/input/InputText;)Lcom/revolut/core/ui_kit_core/inputtext/MaskingDelegate;"));
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f291379b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.salary_switch_br_employer_details_title, null, null, 14), null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.salary_switch_br_employer_details_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        d3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new vqc.d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new vqc.d(this, null, 1), 3);
        ?? r56 = this.P;
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).e.f121375b), new vqc.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).f52576h.f121375b), new m(this, null, 26), 3);
    }

    public final u d3() {
        ViewBinding value = this.O.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.L.getValue();
    }
}
