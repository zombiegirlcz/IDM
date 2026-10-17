package com.revolut.feature.retail.cfd.impl.screens.home;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.feature.retail.cfd.impl.R$id;
import com.revolut.feature.retail.cfd.impl.R$layout;
import com.revolut.feature.retail.cfd.impl.screens.home.CfdTradingHomeScreen;
import com.revolut.feature.retail.cfd.impl.screens.home.CfdTradingHomeScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import fsl.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import os2.g;
import q97.b1;
import q9c.v;
import qr0.i;
import r3b.b;
import r3b.d;
import r3b.f;
import r3b.l;
import r3b.m;
import r3b.n;
import rd0.e;
import te0.w;
import tki.c;
import tx0.r;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/home/CfdTradingHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lr3b/o;", "Lfsl/o;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdTradingHomeScreen extends ViewController<q> implements c, o {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(CfdTradingHomeScreen.class, "binding", "getBinding()Lcom/revolut/feature/retail/cfd/impl/databinding/ScreenCfdTradingHomeBinding;", 0))};
    public final CfdTradingHomeScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final ListSubheaderDelegate O;
    public final ListSubheaderLoadingDelegate P;
    public final FullScreenStateDelegate Q;
    public final RowLoadingDelegate R;
    public final RowDelegate S;
    public final TextDelegate T;
    public final VaultsProgressDelegate U;
    public final VaultsProgressLoadingDelegate V;
    public final SwipeToActionDelegate W;
    public final FooterTextDelegate X;
    public final i Y;
    public final d Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final r3b.c f82208a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f82209b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final avk.h f82210d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final g f82211e0;

    public CfdTradingHomeScreen(CfdTradingHomeScreenContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = R$layout.screen_cfd_trading_home;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: r3b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdTradingHomeScreen f251233b;

            {
                this.f251233b = this;
            }

            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CfdTradingHomeScreen.f0;
                        CfdTradingHomeScreen cfdTradingHomeScreen = this.f251233b;
                        phm.a aVar = (phm.a) ue0.e.j(cfdTradingHomeScreen.m2()).a().get(m2b.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2b.v.class, " is not found"));
                        }
                        m2b.v vVar = ((m2b.v) aVar2.b()).C;
                        CfdTradingHomeScreenContract$InputData cfdTradingHomeScreenContract$InputData = cfdTradingHomeScreen.K;
                        avk.h hVar = cfdTradingHomeScreen.f82210d0;
                        h5b.c cVar = new h5b.c(cfdTradingHomeScreenContract$InputData.f82212a);
                        os2.g gVar = cfdTradingHomeScreen.f82211e0;
                        qr0.i iVar = cfdTradingHomeScreen.Y;
                        o5d.b bVar = new o5d.b(cfdTradingHomeScreen.W);
                        d dVar = cfdTradingHomeScreen.Z;
                        c cVar2 = cfdTradingHomeScreen.f82208a0;
                        hVar.getClass();
                        gVar.getClass();
                        iVar.getClass();
                        dVar.getClass();
                        cVar2.getClass();
                        return new m2b.u(vVar, cfdTradingHomeScreen, cfdTradingHomeScreenContract$InputData, hVar, cfdTradingHomeScreen, cVar, gVar, iVar, bVar, dVar, cVar2);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdTradingHomeScreen.f0;
                        return (l) ((m2b.u) ((s3b.a) this.f251233b.N.getValue())).F.get();
                    default:
                        KProperty[] kPropertyArr3 = CfdTradingHomeScreen.f0;
                        int i2 = R$id.screenCfdTradingHome_recyclerView;
                        CfdTradingHomeScreen cfdTradingHomeScreen2 = this.f251233b;
                        return tki.g.a(cfdTradingHomeScreen2, cfdTradingHomeScreen2.R2(), zhm.v.k(cfdTradingHomeScreen2.O, cfdTradingHomeScreen2.P, cfdTradingHomeScreen2.S, cfdTradingHomeScreen2.R, cfdTradingHomeScreen2.Q, cfdTradingHomeScreen2.T, cfdTradingHomeScreen2.U, cfdTradingHomeScreen2.V, cfdTradingHomeScreen2.W, cfdTradingHomeScreen2.X), i2, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        this.O = new ListSubheaderDelegate();
        this.P = new ListSubheaderLoadingDelegate();
        this.Q = new FullScreenStateDelegate();
        this.R = new RowLoadingDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.S = rowDelegate;
        this.T = new TextDelegate();
        this.U = new VaultsProgressDelegate();
        this.V = new VaultsProgressLoadingDelegate();
        this.W = new SwipeToActionDelegate(rowDelegate, false);
        this.X = new FooterTextDelegate();
        this.Y = new i(this);
        this.Z = new d(this);
        this.f82208a0 = new r3b.c(this);
        final int i2 = 1;
        this.f82209b0 = w.y0(new Function0(this) { // from class: r3b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdTradingHomeScreen f251233b;

            {
                this.f251233b = this;
            }

            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CfdTradingHomeScreen.f0;
                        CfdTradingHomeScreen cfdTradingHomeScreen = this.f251233b;
                        phm.a aVar = (phm.a) ue0.e.j(cfdTradingHomeScreen.m2()).a().get(m2b.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2b.v.class, " is not found"));
                        }
                        m2b.v vVar = ((m2b.v) aVar2.b()).C;
                        CfdTradingHomeScreenContract$InputData cfdTradingHomeScreenContract$InputData = cfdTradingHomeScreen.K;
                        avk.h hVar = cfdTradingHomeScreen.f82210d0;
                        h5b.c cVar = new h5b.c(cfdTradingHomeScreenContract$InputData.f82212a);
                        os2.g gVar = cfdTradingHomeScreen.f82211e0;
                        qr0.i iVar = cfdTradingHomeScreen.Y;
                        o5d.b bVar = new o5d.b(cfdTradingHomeScreen.W);
                        d dVar = cfdTradingHomeScreen.Z;
                        c cVar2 = cfdTradingHomeScreen.f82208a0;
                        hVar.getClass();
                        gVar.getClass();
                        iVar.getClass();
                        dVar.getClass();
                        cVar2.getClass();
                        return new m2b.u(vVar, cfdTradingHomeScreen, cfdTradingHomeScreenContract$InputData, hVar, cfdTradingHomeScreen, cVar, gVar, iVar, bVar, dVar, cVar2);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdTradingHomeScreen.f0;
                        return (l) ((m2b.u) ((s3b.a) this.f251233b.N.getValue())).F.get();
                    default:
                        KProperty[] kPropertyArr3 = CfdTradingHomeScreen.f0;
                        int i22 = R$id.screenCfdTradingHome_recyclerView;
                        CfdTradingHomeScreen cfdTradingHomeScreen2 = this.f251233b;
                        return tki.g.a(cfdTradingHomeScreen2, cfdTradingHomeScreen2.R2(), zhm.v.k(cfdTradingHomeScreen2.O, cfdTradingHomeScreen2.P, cfdTradingHomeScreen2.S, cfdTradingHomeScreen2.R, cfdTradingHomeScreen2.Q, cfdTradingHomeScreen2.T, cfdTradingHomeScreen2.U, cfdTradingHomeScreen2.V, cfdTradingHomeScreen2.W, cfdTradingHomeScreen2.X), i22, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i3 = 2;
        this.c0 = w.y0(new Function0(this) { // from class: r3b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdTradingHomeScreen f251233b;

            {
                this.f251233b = this;
            }

            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = CfdTradingHomeScreen.f0;
                        CfdTradingHomeScreen cfdTradingHomeScreen = this.f251233b;
                        phm.a aVar = (phm.a) ue0.e.j(cfdTradingHomeScreen.m2()).a().get(m2b.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2b.v.class, " is not found"));
                        }
                        m2b.v vVar = ((m2b.v) aVar2.b()).C;
                        CfdTradingHomeScreenContract$InputData cfdTradingHomeScreenContract$InputData = cfdTradingHomeScreen.K;
                        avk.h hVar = cfdTradingHomeScreen.f82210d0;
                        h5b.c cVar = new h5b.c(cfdTradingHomeScreenContract$InputData.f82212a);
                        os2.g gVar = cfdTradingHomeScreen.f82211e0;
                        qr0.i iVar = cfdTradingHomeScreen.Y;
                        o5d.b bVar = new o5d.b(cfdTradingHomeScreen.W);
                        d dVar = cfdTradingHomeScreen.Z;
                        c cVar2 = cfdTradingHomeScreen.f82208a0;
                        hVar.getClass();
                        gVar.getClass();
                        iVar.getClass();
                        dVar.getClass();
                        cVar2.getClass();
                        return new m2b.u(vVar, cfdTradingHomeScreen, cfdTradingHomeScreenContract$InputData, hVar, cfdTradingHomeScreen, cVar, gVar, iVar, bVar, dVar, cVar2);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdTradingHomeScreen.f0;
                        return (l) ((m2b.u) ((s3b.a) this.f251233b.N.getValue())).F.get();
                    default:
                        KProperty[] kPropertyArr3 = CfdTradingHomeScreen.f0;
                        int i22 = R$id.screenCfdTradingHome_recyclerView;
                        CfdTradingHomeScreen cfdTradingHomeScreen2 = this.f251233b;
                        return tki.g.a(cfdTradingHomeScreen2, cfdTradingHomeScreen2.R2(), zhm.v.k(cfdTradingHomeScreen2.O, cfdTradingHomeScreen2.P, cfdTradingHomeScreen2.S, cfdTradingHomeScreen2.R, cfdTradingHomeScreen2.Q, cfdTradingHomeScreen2.T, cfdTradingHomeScreen2.U, cfdTradingHomeScreen2.V, cfdTradingHomeScreen2.W, cfdTradingHomeScreen2.X), i22, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        this.f82210d0 = new avk.h(this);
        this.f82211e0 = new g(this);
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        r3b.o uiState = (r3b.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        m mVar = uiState.f251257a;
        List<? extends NavBarMenuItem> list = mVar.f251253c;
        r rVar = mVar.d;
        TextLocalisedClause textLocalisedClause = mVar.f251252b;
        int i = mVar.f251251a;
        if (!(qVar instanceof n)) {
            NavBarWithContainer navBarWithContainer = d3().f170799c;
            navBarWithContainer.setTitle(textLocalisedClause);
            navBarWithContainer.setNavigationButtonIcon(Integer.valueOf(i));
            if (rVar != null) {
                AccountSelectionNavBarContentView screenCfdTradingHomeLineChartNavBarContentView = d3().f170798b;
                Intrinsics.checkNotNullExpressionValue(screenCfdTradingHomeLineChartNavBarContentView, "screenCfdTradingHomeLineChartNavBarContentView");
                AccountSelectionNavBarContentView.setModel$default(screenCfdTradingHomeLineChartNavBarContentView, rVar, null, 2, null);
            }
            d3().f170799c.setMenuItems(list);
            return;
        }
        n nVar = (n) qVar;
        if (nVar.f251254a) {
            d3().f170799c.setNavigationButtonIcon(Integer.valueOf(i));
        }
        if (nVar.f251255b) {
            d3().f170799c.setTitle(textLocalisedClause);
        }
        if (nVar.f251256c && rVar != null) {
            AccountSelectionNavBarContentView screenCfdTradingHomeLineChartNavBarContentView2 = d3().f170798b;
            Intrinsics.checkNotNullExpressionValue(screenCfdTradingHomeLineChartNavBarContentView2, "screenCfdTradingHomeLineChartNavBarContentView");
            AccountSelectionNavBarContentView.setModel$default(screenCfdTradingHomeLineChartNavBarContentView2, rVar, null, 2, null);
        }
        if (nVar.d) {
            d3().f170799c.setMenuItems(list);
        }
    }

    @Override // htl.g
    public final vkm.d O1() {
        return e.b(this.S.f53218h);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (s3b.a) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(d3().f170799c.K()), null, new r0e.c(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.S.f53218h), null, new f(2, 4, l.class, R2(), "onRowDelegateClicked", "onRowDelegateClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, new b1(e.b(d3().f170798b.o), 21), null, new v(2, R2(), l.class, "handleActionParcel", "handleActionParcel(Lcom/revolut/feature/wealth/ui/api/actions/WealthAction;)V", 4, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(d3().f170799c.b()), null, new qp7.g(this, continuation, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Q.f52371h.f121375b), null, new r3b.g(2, 4, l.class, R2(), "onErrorClicked", "onErrorClicked(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.W.f), null, new v(2, R2(), l.class, "onSwipeActionClicked", "onSwipeActionClicked(Lcom/revolut/core/ui_kit/delegates/SwipeToActionDelegate$ClickData;)V", 4, 9), 3);
    }

    public final j2b.b d3() {
        ViewBinding value = this.M.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (j2b.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.f82209b0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.c0.getValue();
    }

    @Override // fsl.o
    public final vkm.d k0() {
        return e.b(this.O.f52707c);
    }
}
