package com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.salary_switch.impl.R$string;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.SalaryRequestsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import z3f.b;
import zhm.v;
import zqc.d;
import zqc.g;
import zqc.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/brazil/screen/salary_requests/SalaryRequestsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzqc/g;", "Ltki/c;", "Lzqc/i;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SalaryRequestsScreen extends ViewController<g> implements c {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(SalaryRequestsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final h O;
    public final Object P;

    public SalaryRequestsScreen() {
        SalaryRequestsScreenContract$InputData inputData = SalaryRequestsScreenContract$InputData.f85294a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: zqc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryRequestsScreen f324451b;

            {
                this.f324451b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SalaryRequestsScreen salaryRequestsScreen = this.f324451b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SalaryRequestsScreen.Q;
                        SalaryRequestsScreen salaryRequestsScreen2 = this.f324451b;
                        return tki.g.a(salaryRequestsScreen2, salaryRequestsScreen2.d(), v.k(new FullScreenStateDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), (RowDelegate) salaryRequestsScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SalaryRequestsScreen.Q;
                        qji.b bVarU2 = salaryRequestsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.di.SalaryRequestsScreenInjector");
                        zpc.k kVar = ((zpc.l) bVarU2).f324270b;
                        zpc.h hVar = new zpc.h();
                        hVar.f324247a = e4m.b.b(new zdl.d(kVar, hVar));
                        return hVar;
                    default:
                        KProperty[] kPropertyArr3 = SalaryRequestsScreen.Q;
                        return (h) ((zpc.h) salaryRequestsScreen.M.getValue()).f324247a.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: zqc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryRequestsScreen f324451b;

            {
                this.f324451b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SalaryRequestsScreen salaryRequestsScreen = this.f324451b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SalaryRequestsScreen.Q;
                        SalaryRequestsScreen salaryRequestsScreen2 = this.f324451b;
                        return tki.g.a(salaryRequestsScreen2, salaryRequestsScreen2.d(), v.k(new FullScreenStateDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), (RowDelegate) salaryRequestsScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SalaryRequestsScreen.Q;
                        qji.b bVarU2 = salaryRequestsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.di.SalaryRequestsScreenInjector");
                        zpc.k kVar = ((zpc.l) bVarU2).f324270b;
                        zpc.h hVar = new zpc.h();
                        hVar.f324247a = e4m.b.b(new zdl.d(kVar, hVar));
                        return hVar;
                    default:
                        KProperty[] kPropertyArr3 = SalaryRequestsScreen.Q;
                        return (h) ((zpc.h) salaryRequestsScreen.M.getValue()).f324247a.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: zqc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryRequestsScreen f324451b;

            {
                this.f324451b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SalaryRequestsScreen salaryRequestsScreen = this.f324451b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SalaryRequestsScreen.Q;
                        SalaryRequestsScreen salaryRequestsScreen2 = this.f324451b;
                        return tki.g.a(salaryRequestsScreen2, salaryRequestsScreen2.d(), v.k(new FullScreenStateDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), (RowDelegate) salaryRequestsScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SalaryRequestsScreen.Q;
                        qji.b bVarU2 = salaryRequestsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.di.SalaryRequestsScreenInjector");
                        zpc.k kVar = ((zpc.l) bVarU2).f324270b;
                        zpc.h hVar = new zpc.h();
                        hVar.f324247a = e4m.b.b(new zdl.d(kVar, hVar));
                        return hVar;
                    default:
                        KProperty[] kPropertyArr3 = SalaryRequestsScreen.Q;
                        return (h) ((zpc.h) salaryRequestsScreen.M.getValue()).f324247a.get();
                }
            }
        });
        this.O = s.t(this, zqc.c.f);
        this.P = w.y0(new zj9.a(26));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setFilters(uiState.f324455b);
        navBarWithToolbar.setMenuItems(uiState.f324456c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (zpc.h) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.salary_switch_br_requests_list_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.salary_switch_br_requests_list_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new zfd.s(this, (Continuation) null, 24), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new b(this, null, 24), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.s0()), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), new zqc.e(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final zqc.h d() {
        return (zqc.h) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.L.getValue();
    }
}
