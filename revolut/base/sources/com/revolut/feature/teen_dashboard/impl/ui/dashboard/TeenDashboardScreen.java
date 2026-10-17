package com.revolut.feature.teen_dashboard.impl.ui.dashboard;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.teen_dashboard.impl.ui.dashboard.TeenDashboardScreen;
import com.revolut.feature.teen_dashboard.impl.ui.dashboard.TeenDashboardScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.y;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oqe.b;
import oqe.c;
import oqe.d;
import oqe.i;
import oqe.j;
import oqe.k;
import oqe.l;
import oqe.m;
import te0.w;
import tx0.q1;
import tx0.u1;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/teen_dashboard/impl/ui/dashboard/TeenDashboardScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Loqe/m;", "feature_teen_dashboard_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TeenDashboardScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TeenDashboardScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarlargecentredBinding;", 0))};
    public final TeenDashboardScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final RowLoadingDelegate Q;
    public final FullScreenStateDelegate R;
    public final RowDelegate S;

    public TeenDashboardScreen(TeenDashboardScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbarlargecentred;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: oqe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TeenDashboardScreen f227889b;

            {
                this.f227889b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TeenDashboardScreen teenDashboardScreen = this.f227889b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TeenDashboardScreen.T;
                        return (h) ((nqe.a) teenDashboardScreen.P.getValue()).f218429b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TeenDashboardScreen.T;
                        TeenDashboardScreen teenDashboardScreen2 = this.f227889b;
                        return dli.f.a(teenDashboardScreen2, teenDashboardScreen2.R2(), v.k(teenDashboardScreen2.Q, teenDashboardScreen2.R, teenDashboardScreen2.S), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = TeenDashboardScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(teenDashboardScreen.m2()).a().get(nqe.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nqe.b.class, " is not found"));
                        }
                        nqe.b bVar = ((nqe.b) aVar2.b()).d;
                        TeenDashboardScreenContract$InputData teenDashboardScreenContract$InputData = teenDashboardScreen.K;
                        teenDashboardScreenContract$InputData.getClass();
                        return new nqe.a(bVar, teenDashboardScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: oqe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TeenDashboardScreen f227889b;

            {
                this.f227889b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TeenDashboardScreen teenDashboardScreen = this.f227889b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TeenDashboardScreen.T;
                        return (h) ((nqe.a) teenDashboardScreen.P.getValue()).f218429b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TeenDashboardScreen.T;
                        TeenDashboardScreen teenDashboardScreen2 = this.f227889b;
                        return dli.f.a(teenDashboardScreen2, teenDashboardScreen2.R2(), v.k(teenDashboardScreen2.Q, teenDashboardScreen2.R, teenDashboardScreen2.S), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = TeenDashboardScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(teenDashboardScreen.m2()).a().get(nqe.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nqe.b.class, " is not found"));
                        }
                        nqe.b bVar = ((nqe.b) aVar2.b()).d;
                        TeenDashboardScreenContract$InputData teenDashboardScreenContract$InputData = teenDashboardScreen.K;
                        teenDashboardScreenContract$InputData.getClass();
                        return new nqe.a(bVar, teenDashboardScreenContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: oqe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TeenDashboardScreen f227889b;

            {
                this.f227889b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TeenDashboardScreen teenDashboardScreen = this.f227889b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TeenDashboardScreen.T;
                        return (h) ((nqe.a) teenDashboardScreen.P.getValue()).f218429b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TeenDashboardScreen.T;
                        TeenDashboardScreen teenDashboardScreen2 = this.f227889b;
                        return dli.f.a(teenDashboardScreen2, teenDashboardScreen2.R2(), v.k(teenDashboardScreen2.Q, teenDashboardScreen2.R, teenDashboardScreen2.S), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = TeenDashboardScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(teenDashboardScreen.m2()).a().get(nqe.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nqe.b.class, " is not found"));
                        }
                        nqe.b bVar = ((nqe.b) aVar2.b()).d;
                        TeenDashboardScreenContract$InputData teenDashboardScreenContract$InputData = teenDashboardScreen.K;
                        teenDashboardScreenContract$InputData.getClass();
                        return new nqe.a(bVar, teenDashboardScreenContract$InputData);
                }
            }
        });
        this.Q = new RowLoadingDelegate();
        this.R = new FullScreenStateDelegate();
        this.S = new RowDelegate(null, null, 7);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        l lVar = uiState.f227896a;
        if (lVar instanceof i) {
            NavBarLargeCentred navBarLargeCentred = e3().f174576b;
            i iVar = (i) lVar;
            TextLocalisedClause textLocalisedClause = iVar.f227891a;
            navBarLargeCentred.setModel(new NavBarLargeCentred.Model(new com.revolut.core.ui_kit.views.navbar.l(textLocalisedClause), textLocalisedClause, iVar.f227892b, null, new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 984));
            NavBarLargeCentred.setLargeImage$default(navBarLargeCentred, new AvatarModel.Default(iVar.f227893c, null, null, null, null, null, 126), (q1) null, 2, (Object) null);
            navBarLargeCentred.B();
            return;
        }
        if (lVar.equals(j.f227894a)) {
            e3().f174576b.B();
            d3();
        } else {
            if (!lVar.equals(k.f227895a)) {
                throw new NoWhenBranchMatchedException();
            }
            e3().f174576b.H(u1.TITLE_AND_SUBTITLE);
            d3();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (nqe.a) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(e3().f174576b.f59292m), new oqe.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(e3().f174576b.F()), new oqe.e(this, null, 1), 3);
    }

    public final void d3() {
        e3().f174576b.setModel(new NavBarLargeCentred.Model(null, null, null, null, new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 984));
    }

    public final y e3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (y) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final oqe.h R2() {
        return (oqe.h) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
