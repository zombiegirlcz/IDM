package com.revolut.feature.wealth.private_equity.impl.ui.fund_details;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.e0;
import au0.m0;
import au0.u0;
import au0.z0;
import aw0.d0;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.AvatarLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RatingBarDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedBarDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.ToDoItemDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.wealth.private_equity.api.ui.details.FundDetailsContract$InputData;
import com.revolut.feature.wealth.private_equity.impl.R$id;
import com.revolut.feature.wealth.private_equity.impl.R$layout;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.b;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import d1h.j;
import e3h.i;
import efm.r;
import fsl.o;
import h1h.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import n2h.g;
import rd0.e;
import te0.w;
import tx0.j0;
import tx0.o2;
import tx0.t3;
import tx0.u3;
import vc.s;
import wfh.n;
import wp5.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FundDetailsScreen extends ViewController<Object> implements tki.c, i, o, f, j, dtl.d, g {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f95735e0 = {o0.f186429a.j(new h0(FundDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/wealth/private_equity/impl/databinding/ScreenFundDetailsBinding;", 0))};
    public final int K;
    public final ListSubheaderDelegate L;
    public final RowDelegate M;
    public final SmallActionButtonDelegate N;
    public final LargeActionButtonDelegate O;
    public final CellDetailsChevronDelegate P;
    public final FixedTabsDelegate Q;
    public final FooterTextDelegate R;
    public final FullScreenStateDelegate S;
    public final HeaderDelegate T;
    public final TrendViewDelegate U;
    public final ReferralContactDelegate V;
    public final CounterTextDelegate W;
    public final ScrollerBoxDelegate X;
    public final GridBoxDelegate Y;
    public final SwipeToActionDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f95736a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final h f95737b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f95738d0;

    public FundDetailsScreen(FundDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_fund_details;
        this.L = new ListSubheaderDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.M = rowDelegate;
        this.N = new SmallActionButtonDelegate();
        this.O = new LargeActionButtonDelegate();
        this.P = new CellDetailsChevronDelegate();
        this.Q = new FixedTabsDelegate();
        this.R = new FooterTextDelegate();
        this.S = new FullScreenStateDelegate();
        this.T = new HeaderDelegate();
        this.U = new TrendViewDelegate(1000L);
        ReferralContactDelegate referralContactDelegate = new ReferralContactDelegate();
        this.V = referralContactDelegate;
        CounterTextDelegate counterTextDelegate = new CounterTextDelegate();
        this.W = counterTextDelegate;
        final int i = 0;
        final int i2 = 1;
        this.X = new ScrollerBoxDelegate(v.k(referralContactDelegate, new AvatarLoadingDelegate()));
        this.Y = new GridBoxDelegate(u.c(counterTextDelegate), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
        this.Z = new SwipeToActionDelegate(rowDelegate, false);
        this.f95736a0 = w.y0(new Function0(this) { // from class: wfh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundDetailsScreen f297115b;

            {
                this.f297115b = this;
            }

            /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = FundDetailsScreen.f95735e0;
                        FundDetailsScreen fundDetailsScreen = this.f297115b;
                        return tki.g.a(fundDetailsScreen, fundDetailsScreen.R2(), zhm.v.k(fundDetailsScreen.L, new ListSubheaderLoadingDelegate(), fundDetailsScreen.M, new RowLoadingDelegate(), fundDetailsScreen.T, new HeaderLoadingDelegate(), new RatingBarDelegate(), fundDetailsScreen.N, fundDetailsScreen.O, new PlainTextDelegate(), new PlainTextLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), fundDetailsScreen.Q, new FixedTabsLoadingDelegate(), fundDetailsScreen.R, new FooterTextLoadingDelegate(), fundDetailsScreen.S, new SegmentedBarDelegate(), new ToDoItemDelegate(), new TextDelegate(), fundDetailsScreen.U, fundDetailsScreen.P, fundDetailsScreen.W, fundDetailsScreen.X, fundDetailsScreen.Y, fundDetailsScreen.Z), R$id.fundDetailsScreen_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr2 = FundDetailsScreen.f95735e0;
                        return (n) ((ufh.a) ((zfh.f) this.f297115b.c0.getValue())).M.get();
                }
            }
        });
        this.f95737b0 = s.t(this, wfh.d.f);
        this.c0 = w.y0(new w83.a(this, inputData, 14));
        this.f95738d0 = w.y0(new Function0(this) { // from class: wfh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundDetailsScreen f297115b;

            {
                this.f297115b = this;
            }

            /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FundDetailsScreen.f95735e0;
                        FundDetailsScreen fundDetailsScreen = this.f297115b;
                        return tki.g.a(fundDetailsScreen, fundDetailsScreen.R2(), zhm.v.k(fundDetailsScreen.L, new ListSubheaderLoadingDelegate(), fundDetailsScreen.M, new RowLoadingDelegate(), fundDetailsScreen.T, new HeaderLoadingDelegate(), new RatingBarDelegate(), fundDetailsScreen.N, fundDetailsScreen.O, new PlainTextDelegate(), new PlainTextLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), fundDetailsScreen.Q, new FixedTabsLoadingDelegate(), fundDetailsScreen.R, new FooterTextLoadingDelegate(), fundDetailsScreen.S, new SegmentedBarDelegate(), new ToDoItemDelegate(), new TextDelegate(), fundDetailsScreen.U, fundDetailsScreen.P, fundDetailsScreen.W, fundDetailsScreen.X, fundDetailsScreen.Y, fundDetailsScreen.Z), R$id.fundDetailsScreen_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr2 = FundDetailsScreen.f95735e0;
                        return (n) ((ufh.a) ((zfh.f) this.f297115b.c0.getValue())).M.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        wfh.o uiState = (wfh.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        b bVar = uiState.f297134a;
        if (bVar instanceof b.AbstractC0588b) {
            NavBarWithToolbar fundDetailsScreenNavBar = d3().e;
            Intrinsics.checkNotNullExpressionValue(fundDetailsScreenNavBar, "fundDetailsScreenNavBar");
            f3(fundDetailsScreenNavBar);
            NavBarWithToolbar fundDetailsScreenNavBar2 = d3().e;
            Intrinsics.checkNotNullExpressionValue(fundDetailsScreenNavBar2, "fundDetailsScreenNavBar");
            b.AbstractC0588b abstractC0588b = (b.AbstractC0588b) bVar;
            if (abstractC0588b.equals(b.AbstractC0588b.a.f95782a) || abstractC0588b.equals(b.AbstractC0588b.C0589b.f95783a)) {
                fundDetailsScreenNavBar2.I0(t3.DEFAULT, true);
            } else {
                if (!(abstractC0588b instanceof c)) {
                    throw new NoWhenBranchMatchedException();
                }
                fundDetailsScreenNavBar2.l0();
                c cVar = (c) abstractC0588b;
                TextClause textClause = cVar.f95785b;
                Clause clause = cVar.d;
                fundDetailsScreenNavBar2.setDescriptionText(textClause);
                NavBarWithToolbar.setToolbar$default(fundDetailsScreenNavBar2, textClause, cVar.f95786c, null, 4, null);
                fundDetailsScreenNavBar2.setSecondDescriptionText(clause);
                fundDetailsScreenNavBar2.setSecondDescriptionVisible(clause != null);
                fundDetailsScreenNavBar2.setSecondDescriptionClickable(clause != null);
                fundDetailsScreenNavBar2.setSecondDescriptionTextStyle(e0.PRIMARY);
                fundDetailsScreenNavBar2.setHeaderDisclaimerSticky(cVar.f95784a);
                fundDetailsScreenNavBar2.setEndImage(new yy0.j(cVar.e));
            }
        } else {
            if (!(bVar instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            NavBarWithBigTile fundDetailsScreenBigTileNavBar = d3().f253826c;
            Intrinsics.checkNotNullExpressionValue(fundDetailsScreenBigTileNavBar, "fundDetailsScreenBigTileNavBar");
            f3(fundDetailsScreenBigTileNavBar);
            NavBarWithBigTile fundDetailsScreenBigTileNavBar2 = d3().f253826c;
            Intrinsics.checkNotNullExpressionValue(fundDetailsScreenBigTileNavBar2, "fundDetailsScreenBigTileNavBar");
            b.a aVar = (b.a) bVar;
            if (aVar.equals(b.a.C0586a.f95780a) || aVar.equals(b.a.C0587b.f95781a)) {
                fundDetailsScreenBigTileNavBar2.setLoadingState(true);
            } else {
                if (!(aVar instanceof a)) {
                    throw new NoWhenBranchMatchedException();
                }
                fundDetailsScreenBigTileNavBar2.setLoadingState(false);
                a aVar2 = (a) aVar;
                TextClause textClause2 = aVar2.f95777a;
                fundDetailsScreenBigTileNavBar2.setToolbarTitleWithSubtitle(textClause2, aVar2.f95778b);
                c1.S(fundDetailsScreenBigTileNavBar2, u.c(new u0(aVar2.d, new z0(textClause2, false), new au0.o0(aVar2.f95779c), null)), null, null, 6);
            }
        }
        x2h.b bVar2 = uiState.f297135b;
        TwinHorizontalButton fundDetailsScreenActionsPanel = d3().f253825b;
        Intrinsics.checkNotNullExpressionValue(fundDetailsScreenActionsPanel, "fundDetailsScreenActionsPanel");
        n2h.h.a(bVar2, fundDetailsScreenActionsPanel);
    }

    @Override // dtl.d
    public final Flow B0() {
        return e.b(this.Z.f);
    }

    @Override // e3h.i
    public final ihm.f B1() {
        return this.T.f52396l.f121375b;
    }

    @Override // e3h.i
    public final ihm.f C() {
        return this.Q.d.f121375b;
    }

    @Override // n2h.g
    public final r C0() {
        return d3().f253825b.d();
    }

    @Override // n2h.g
    public final r G0() {
        return d3().f253825b.c();
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final FooterTextDelegate getV() {
        return this.R;
    }

    @Override // e3h.i
    public final r I() {
        return this.U.r();
    }

    @Override // htl.g
    public final vkm.d O1() {
        return e.b(this.M.f53218h);
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final FullScreenStateDelegate getW() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (zfh.f) this.c0.getValue();
    }

    @Override // e3h.i
    public final r U1() {
        return this.T.k.f121375b;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitleAutoSize(true);
        navBarWithToolbar.setTitleVisible(false);
        navBarWithToolbar.setToolbarTitleVisibilityMode(u3.COLLAPSING);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        NavBarWithBigTile navBarWithBigTile = d3().f253826c;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setHeightMode(new o2(new d0(375, 375)));
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.BOTTOM_BLUR);
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        d3().d.removeView(d3().f253826c);
    }

    @Override // e3h.i
    public final ihm.f Z0() {
        return this.Q.f52339c.f121375b;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, new wa3.d(e.b((ihm.f) d3().e.f59406n.f258290b), 4), new wfh.h(this, null, 0), 3);
        ViewController.P2(this, e.b(d3().e.y0()), new wfh.i(this, continuation, 0), 3);
        ViewController.P2(this, y.x(d3().e.f59410q, d3().f253826c.f59357t, "mergeWith(...)"), new wfh.i(this, continuation, 1), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.L;
        r rVarMerge = r.merge(v.k(listSubheaderDelegate.f52707c, listSubheaderDelegate.d, this.P.f51821c, this.V.q(), this.N.f53336c.f121375b, this.O.d.f121375b, this.W.d, this.M.f53218h));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, new wa3.d(e.b(rVarMerge), 5), new wfh.h(this, null, 1), 3);
        ViewController.P2(this, new wa3.d(e.b(this.Q.f52339c.f121375b), 6), new wfh.h(this, null, 2), 3);
    }

    @Override // f1h.f
    /* JADX INFO: renamed from: c, reason: from getter */
    public final RowDelegate getM() {
        return this.M;
    }

    public final rfh.a d3() {
        ViewBinding value = this.f95737b0.getValue(this, f95735e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rfh.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.f95738d0.getValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f3(au0.o oVar) {
        ControllerContainerCoordinatorLayout fundDetailsScreenContainer = d3().d;
        Intrinsics.checkNotNullExpressionValue(fundDetailsScreenContainer, "fundDetailsScreenContainer");
        au0.o oVar2 = oVar.equals(d3().e) ? d3().f253826c : d3().e;
        if (fundDetailsScreenContainer.indexOfChild(oVar) == -1 || fundDetailsScreenContainer.indexOfChild(oVar2) != -1) {
            boolean z = oVar2.f9292a >= 1.0f;
            fundDetailsScreenContainer.removeView(oVar2);
            if (fundDetailsScreenContainer.indexOfChild(oVar) != -1) {
                return;
            }
            fundDetailsScreenContainer.addView(oVar, fundDetailsScreenContainer.indexOfChild(d3().f));
            if (!z) {
                oVar.setExpanded(false, false);
            }
            ViewCompat.requestApplyInsets(oVar);
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    @Override // e3h.i
    public final r h1() {
        od0.i.Companion.getClass();
        r rVarJust = r.just(od0.i.f224256b);
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }

    @Override // h1h.f
    /* JADX INFO: renamed from: j0, reason: from getter */
    public final ListSubheaderDelegate getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.f95736a0.getValue();
    }

    @Override // fsl.o
    public final vkm.d k0() {
        return e.b(this.L.f52707c);
    }
}
