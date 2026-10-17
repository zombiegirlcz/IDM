package com.revolut.feature.transactions.impl.ui.kompot.details.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.c1;
import au0.r0;
import au0.s0;
import au0.u0;
import au0.z0;
import cli.o;
import cmf.g;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsAttachmentDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPhotoDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTotalDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.MapDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressionCountDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TripDetailsDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.transactions.impl.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.tracking.v3.TransactionDetailsContext;
import dli.a;
import fmf.a0;
import fmf.b;
import fmf.b0;
import fmf.c;
import fmf.c0;
import fmf.d0;
import fmf.f;
import fmf.f0;
import fmf.g0;
import fmf.i;
import fmf.l;
import fmf.m;
import fmf.n;
import fmf.p;
import fmf.r;
import fmf.t;
import fmf.x;
import fmf.y;
import fmf.z;
import gmf.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.MutableSharedFlow;
import mga.l0;
import no.k;
import rd0.e;
import te0.w;
import tx0.p2;
import vc.s;
import vkm.z1;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/transactions/impl/ui/kompot/details/screen/TransactionDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lfmf/g0;", "Lno/k;", "Lmga/l0;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionDetailsScreen extends ViewController<q> implements a, k, l0 {
    public static final /* synthetic */ KProperty[] B0 = {o0.f186429a.j(new h0(TransactionDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/transactions/impl/databinding/ScreenTransactionDetailsBinding;", 0))};
    public final Object A0;
    public final TransactionDetailsScreenContract$InputData K;
    public final int L;
    public AnalyticsContext M;
    public final h N;
    public final z1 O;
    public final CellDetailsDelegate P;
    public final CellDetailsActionDelegate Q;
    public final CellDetailsAccountDelegate R;
    public final CellDetailsActionableIconDelegate S;
    public final CellDetailsChevronDelegate T;
    public final CellDetailsNoteDelegate U;
    public final CellDetailsSwitcherDelegate V;
    public final HighlightTileDelegate W;
    public final InputDisclosureDelegate X;
    public final RowDelegate Y;
    public final SmallActionButtonDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final MapDelegate f92043a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final CellDetailsAttachmentDelegate f92044b0;
    public final TextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final LargeActionButtonDelegate f92045d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final PlainTextWarningDelegate f92046e0;
    public final ActionWidgetDelegate f0;
    public final BannerDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final ProgressStepVerticalV2Delegate f92047h0;
    public final ProgressionCountDelegate i0;
    public final FullScreenStateDelegate j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final TripDetailsDelegate f92048k0;
    public final HeroBannerDelegate l0;
    public final ScrollerDelegate m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final ListSubheaderDelegate f92049n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final FooterTextDelegate f92050o0;
    public final VaultsProgressDelegate p0;
    public final ListCellDelegate q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final CellDetailsPhotoDelegate f92051r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final LabelButtonDelegate f92052s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ProgressStepVerticalDelegate f92053t0;
    public final Object u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final koi.h f92054v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final fmf.o0 f92055w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f92056x0;
    public final Object y0;
    public final Object z0;

    public TransactionDetailsScreen(TransactionDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transaction_details;
        this.N = s.t(this, b.f);
        z1 z1VarB = vkm.q.b(0, 7, null);
        this.O = z1VarB;
        this.P = new CellDetailsDelegate();
        this.Q = new CellDetailsActionDelegate();
        this.R = new CellDetailsAccountDelegate();
        this.S = new CellDetailsActionableIconDelegate();
        this.T = new CellDetailsChevronDelegate();
        this.U = new CellDetailsNoteDelegate();
        this.V = new CellDetailsSwitcherDelegate();
        this.W = new HighlightTileDelegate();
        this.X = new InputDisclosureDelegate();
        this.Y = new RowDelegate(null, null, 7);
        this.Z = new SmallActionButtonDelegate();
        this.f92043a0 = new MapDelegate();
        this.f92044b0 = new CellDetailsAttachmentDelegate();
        this.c0 = new TextDelegate();
        this.f92045d0 = new LargeActionButtonDelegate();
        this.f92046e0 = new PlainTextWarningDelegate();
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.f0 = actionWidgetDelegate;
        this.g0 = new BannerDelegate();
        this.f92047h0 = new ProgressStepVerticalV2Delegate();
        this.i0 = new ProgressionCountDelegate();
        this.j0 = new FullScreenStateDelegate();
        TripDetailsDelegate tripDetailsDelegate = new TripDetailsDelegate();
        this.f92048k0 = tripDetailsDelegate;
        HeroBannerDelegate heroBannerDelegate = new HeroBannerDelegate(0);
        this.l0 = heroBannerDelegate;
        ScrollerDelegate scrollerDelegate = new ScrollerDelegate(v.k(tripDetailsDelegate, heroBannerDelegate, new HeroBannerLoadingDelegate(), actionWidgetDelegate, new ActionWidgetLoadingDelegate()), false);
        this.m0 = scrollerDelegate;
        this.f92049n0 = new ListSubheaderDelegate();
        this.f92050o0 = new FooterTextDelegate();
        this.p0 = new VaultsProgressDelegate();
        this.q0 = new ListCellDelegate();
        this.f92051r0 = new CellDetailsPhotoDelegate();
        this.f92052s0 = new LabelButtonDelegate();
        this.f92053t0 = new ProgressStepVerticalDelegate();
        this.u0 = w.y0(new fmf.a(this, 0));
        this.f92054v0 = new koi.h(null, false, true, 3);
        this.f92055w0 = new fmf.o0(z1VarB, e.b(scrollerDelegate.i), new fmf.a(this, 1));
        this.f92056x0 = w.y0(new fmf.a(this, 2));
        this.y0 = w.y0(new fmf.a(this, 3));
        this.z0 = w.y0(new fmf.a(this, 4));
        this.A0 = w.y0(new fmf.a(this, 5));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        boolean z;
        g0 uiState = (g0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        g gVar = uiState.f136391b;
        List<ActionsView.Item> list = uiState.f136392c;
        NavBarMenuItem navBarMenuItem = uiState.d;
        NavBarWithBigTile navBarWithBigTile = d3().f314327b;
        if (gVar instanceof g.b) {
            navBarWithBigTile.setLoadingState(true);
        } else {
            if (!(gVar instanceof cmf.h)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithBigTile.setLoadingState(false);
            cmf.h hVar = (cmf.h) gVar;
            Clause clause = hVar.f25232b;
            NavBarWithContainerBackground navBarWithContainerBackground = hVar.i;
            Image image = hVar.d;
            CircleBadgeModel circleBadgeModel = hVar.e;
            navBarWithBigTile.setAvatar(new AvatarModel.Default(image, null, hVar.f25236j, null, circleBadgeModel != null ? new AvatarModel.BadgeModel(circleBadgeModel, com.revolut.core.ui_kit.models.avatar.b.BOTTOM) : null, null, 106), navBarWithContainerBackground != null ? r0.DEFAULT : r0.BLURRED_BACKGROUND);
            navBarWithBigTile.setIconClickable(hVar.f);
            navBarWithBigTile.setToolbarTitle(clause);
            navBarWithBigTile.setActionStatusLabel(clause != null ? new aw0.k(6, clause, null, false) : null);
            if (navBarWithContainerBackground == null) {
                navBarWithContainerBackground = NavBarWithContainerBackground.TransparentBackground.f57882a;
            }
            z0 z0Var = new z0(hVar.f25231a, hVar.f25234g);
            Clause clause2 = hVar.f25233c;
            c1.S(navBarWithBigTile, u.c(new u0(navBarWithContainerBackground, z0Var, clause2 != null ? new au0.o0(clause2) : null, null)), null, null, 6);
            navBarWithBigTile.setMenuItems(v.l(navBarMenuItem));
            navBarWithBigTile.setActions(list);
            navBarWithBigTile.setCustomFont(hVar.f25235h);
        }
        jkf.b bVar = (jkf.b) this.z0.getValue();
        List items = uiState.f136390a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        TransactionDetailsContext.a aVarNewBuilder = TransactionDetailsContext.newBuilder();
        String str = bVar.f175161a.f185494j;
        aVarNewBuilder.c();
        ((TransactionDetailsContext) aVarNewBuilder.f49761b).setId(str);
        Intrinsics.checkNotNullParameter(items, "items");
        List list2 = items;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z = false;
        } else {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (Intrinsics.f(((j) it8.next()).getF53293a(), "OPT_IN_PLACEMENT_BANNER_LIST_ID")) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        aVarNewBuilder.c();
        ((TransactionDetailsContext) aVarNewBuilder.f49761b).setIsRevPointsBannerShowed(z);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.M = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.M = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d) this.f92056x0.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        xv0.w wVar = new xv0.w(new cia.d(1, this.O, MutableSharedFlow.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8, 2), null);
        ScreenContentRecyclerView recyclerView = d3().f314328c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        wVar.b(recyclerView);
        ((j60.a) ((mlf.e) ((d) this.f92056x0.getValue())).f206850r.get()).d(v.k(this.Y, new RowLoadingDelegate(), this.P, new CellDetailsTotalDelegate(), this.c0, this.f92045d0, this.U, this.Q, this.W));
        NavBarWithBigTile navBarWithBigTile = d3().f314327b;
        navBarWithBigTile.setLayoutType(s0.CENTERED_SMALL_BUTTONS);
        navBarWithBigTile.setTitleStyle(b1.LARGE_SINGLE_LINE);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setHeightMode(p2.f275222a);
        navBarWithBigTile.setIconClickable(false);
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v79, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f314327b;
        Continuation continuation = null;
        int i = 0;
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithBigTile.f59357t), null, new c(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithBigTile.K()), null, new fmf.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithBigTile.b()), null, new fmf.e(this, continuation, i), 3);
        HeaderWithBigTileLayout headerWithBigTileLayout = navBarWithBigTile.f59360y;
        int i2 = 1;
        com.revolut.kompot.navigable.a.g2(this, e.b(headerWithBigTileLayout.f57274n), null, new c(this, continuation, i2), 3);
        int i3 = 2;
        com.revolut.kompot.navigable.a.g2(this, e.b(headerWithBigTileLayout.f57272l), null, new c(this, continuation, i3), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((rp0.l0) this.A0.getValue()).f256113c), null, new fmf.e(this, continuation, 5), 3);
        CellDetailsActionDelegate cellDetailsActionDelegate = this.Q;
        com.revolut.kompot.navigable.a.g2(this, e.b(cellDetailsActionDelegate.d), null, new z(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(cellDetailsActionDelegate.f51780c), null, new a0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.S.f51807c), null, new fmf.e(this, continuation, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.R.d), null, new fmf.e(this, continuation, 10), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.T.f51821c), null, new b0(this, null), 3);
        CellDetailsNoteDelegate cellDetailsNoteDelegate = this.U;
        com.revolut.kompot.navigable.a.g2(this, e.b(cellDetailsNoteDelegate.d), null, new c0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(cellDetailsNoteDelegate.f51870h), null, new d0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(cellDetailsNoteDelegate.e), null, new fmf.e(this, continuation, i2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.V.f51912c), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f92053t0.f53000c), null, new fmf.e(this, continuation, i3), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f92049n0.d), null, new fmf.g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.W.f52437c), null, new fmf.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.X.f52538c), null, new i(this, null), 3);
        RowDelegate rowDelegate = this.Y;
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53218h), null, new fmf.j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.i), null, new fmf.k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53219j), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.f53336c.f121375b), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f92043a0.f52762c), null, new fmf.e(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f92044b0.f51808c), null, new n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.d), null, new fmf.e(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f92045d0.d.f121375b), null, new fmf.o(this, null), 3);
        CellDetailsDelegate cellDetailsDelegate = this.P;
        com.revolut.kompot.navigable.a.g2(this, e.b(cellDetailsDelegate.f), null, new p(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(cellDetailsDelegate.d), null, new fmf.q(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(cellDetailsDelegate.e), null, new r(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f92046e0.d.f121375b), null, new fmf.s(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f0.f51589c.f121375b), null, new t(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.g0.f51699c), null, new fmf.u(this, null), 3);
        ProgressStepVerticalV2Delegate progressStepVerticalV2Delegate = this.f92047h0;
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(e.b(progressStepVerticalV2Delegate.d), e.b(progressStepVerticalV2Delegate.f.f121375b), e.b(progressStepVerticalV2Delegate.f53006g.f121375b), e.b(progressStepVerticalV2Delegate.f53007h.f121375b)), null, new fmf.v(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(progressStepVerticalV2Delegate.e), null, new fmf.e(this, continuation, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b((ihm.f) this.i0.f53037c.getValue()), null, new fmf.e(this, continuation, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f92050o0.e.f121375b), null, new fmf.e(this, continuation, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.j0.f52371h.f121375b), null, new fmf.w(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.p0.r()), null, new x(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f92052s0.d.f121375b), null, new y(this, null), 3);
    }

    public final yif.b d3() {
        ViewBinding value = this.N.getValue(this, B0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (yif.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f0 d() {
        return (f0) this.y0.getValue();
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f314326a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return controllerContainerCoordinatorLayout;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.u0.getValue();
    }
}
