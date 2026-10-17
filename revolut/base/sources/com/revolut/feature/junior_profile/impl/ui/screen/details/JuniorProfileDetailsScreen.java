package com.revolut.feature.junior_profile.impl.ui.screen.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior_profile.impl.R$string;
import com.revolut.feature.junior_profile.impl.ui.screen.details.JuniorProfileDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.t3;
import vc.s;
import w65.c;
import wj8.d;
import wj8.f;
import wj8.g;
import wj8.i;
import wj8.j;
import wj8.k;
import wj8.l;
import wj8.m;
import wj8.r;
import wj8.t;
import xki.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_profile/impl/ui/screen/details/JuniorProfileDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwj8/r;", "Ldli/a;", "Lwj8/t;", "feature_junior_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorProfileDetailsScreen extends ViewController<r> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(JuniorProfileDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final i K;
    public final int L;
    public final h M;
    public final InputTextDelegate N;
    public final ProductSelectionDelegate O;
    public final FullScreenStateDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public JuniorProfileDetailsScreen(i inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, d.f);
        this.N = new InputTextDelegate(null);
        this.O = new ProductSelectionDelegate();
        this.P = new FullScreenStateDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: wj8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorProfileDetailsScreen f297998b;

            {
                this.f297998b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorProfileDetailsScreen juniorProfileDetailsScreen = this.f297998b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorProfileDetailsScreen.T;
                        JuniorProfileDetailsScreen juniorProfileDetailsScreen2 = this.f297998b;
                        return dli.f.a(juniorProfileDetailsScreen2, juniorProfileDetailsScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), juniorProfileDetailsScreen2.N, juniorProfileDetailsScreen2.O, juniorProfileDetailsScreen2.P), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorProfileDetailsScreen.T;
                        qji.b bVarU2 = juniorProfileDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_profile.impl.ui.screen.details.di.JuniorProfileDetailsScreenInjector");
                        mj8.d dVar = (mj8.d) bVarU2;
                        mj8.h hVar = dVar.f205956b;
                        mj8.d dVar2 = dVar.f205957c;
                        i iVar = juniorProfileDetailsScreen.K;
                        iVar.getClass();
                        return new mj8.e(hVar, dVar2, iVar);
                    default:
                        KProperty[] kPropertyArr3 = JuniorProfileDetailsScreen.T;
                        return (s) ((mj8.e) juniorProfileDetailsScreen.R.getValue()).f205960c.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: wj8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorProfileDetailsScreen f297998b;

            {
                this.f297998b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorProfileDetailsScreen juniorProfileDetailsScreen = this.f297998b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorProfileDetailsScreen.T;
                        JuniorProfileDetailsScreen juniorProfileDetailsScreen2 = this.f297998b;
                        return dli.f.a(juniorProfileDetailsScreen2, juniorProfileDetailsScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), juniorProfileDetailsScreen2.N, juniorProfileDetailsScreen2.O, juniorProfileDetailsScreen2.P), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorProfileDetailsScreen.T;
                        qji.b bVarU2 = juniorProfileDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_profile.impl.ui.screen.details.di.JuniorProfileDetailsScreenInjector");
                        mj8.d dVar = (mj8.d) bVarU2;
                        mj8.h hVar = dVar.f205956b;
                        mj8.d dVar2 = dVar.f205957c;
                        i iVar = juniorProfileDetailsScreen.K;
                        iVar.getClass();
                        return new mj8.e(hVar, dVar2, iVar);
                    default:
                        KProperty[] kPropertyArr3 = JuniorProfileDetailsScreen.T;
                        return (s) ((mj8.e) juniorProfileDetailsScreen.R.getValue()).f205960c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: wj8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorProfileDetailsScreen f297998b;

            {
                this.f297998b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorProfileDetailsScreen juniorProfileDetailsScreen = this.f297998b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorProfileDetailsScreen.T;
                        JuniorProfileDetailsScreen juniorProfileDetailsScreen2 = this.f297998b;
                        return dli.f.a(juniorProfileDetailsScreen2, juniorProfileDetailsScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), juniorProfileDetailsScreen2.N, juniorProfileDetailsScreen2.O, juniorProfileDetailsScreen2.P), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorProfileDetailsScreen.T;
                        qji.b bVarU2 = juniorProfileDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_profile.impl.ui.screen.details.di.JuniorProfileDetailsScreenInjector");
                        mj8.d dVar = (mj8.d) bVarU2;
                        mj8.h hVar = dVar.f205956b;
                        mj8.d dVar2 = dVar.f205957c;
                        i iVar = juniorProfileDetailsScreen.K;
                        iVar.getClass();
                        return new mj8.e(hVar, dVar2, iVar);
                    default:
                        KProperty[] kPropertyArr3 = JuniorProfileDetailsScreen.T;
                        return (s) ((mj8.e) juniorProfileDetailsScreen.R.getValue()).f205960c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        t uiState = (t) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        m mVar = uiState.f298017b;
        if (mVar instanceof k) {
            navBarWithToolbar.setLoadingVisible(false);
            return;
        }
        if (mVar instanceof l) {
            navBarWithToolbar.setLoadingVisible(true);
            navBarWithToolbar.I0(t3.PROFILE, false);
        } else {
            if (!(mVar instanceof j)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.setLoadingVisible(false);
            navBarWithToolbar.l0();
            navBarWithToolbar.setEndImage(((j) mVar).f298009a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (mj8.e) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.junior_profile_details_title_personal_details, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new c(this, null, 25), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52575g.f121375b), new wj8.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.p()), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new g(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final wj8.s R2() {
        return (wj8.s) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
