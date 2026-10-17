package com.revolut.feature.tab.accounts.impl.ui.tab;

import a83.j0;
import aii.q;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ash.j;
import aw0.d8;
import chc.c0;
import cie.e0;
import cie.f0;
import cie.g0;
import cie.i;
import cie.m;
import cie.n;
import cie.p;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ActionCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ActionTileDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.BannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.BigTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSingleButtonDelegate;
import com.revolut.core.ui_kit.delegates.ComplexChartDelegate;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HistogramDelegate;
import com.revolut.core.ui_kit.delegates.HistogramLoadingDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LinearProgressWithAmountDelegate;
import com.revolut.core.ui_kit.delegates.LinearProgressWithAmountLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.delegates.LogosTileDelegate;
import com.revolut.core.ui_kit.delegates.PhotoBannerLargeDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProgressTimelineDelegate;
import com.revolut.core.ui_kit.delegates.ProgressTimelineLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProgressionCountDelegate;
import com.revolut.core.ui_kit.delegates.PromotionalMediumTileDelegate;
import com.revolut.core.ui_kit.delegates.RateEmojiDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SimpleLineChartDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.domain.interactors.transactions.TransactionsPerformanceTracker$Scenario;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import com.revolut.feature.tab.accounts.api.TabAccountsApi$Toggles;
import com.revolut.feature.tab.accounts.impl.R$id;
import com.revolut.feature.tab.accounts.impl.R$layout;
import com.revolut.feature.tab.accounts.impl.ui.tab.AccountsController;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$InputData;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import eoi.r;
import fnc.s;
import ho.l0;
import hx0.d0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import jji.h;
import jji.u;
import kji.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import skm.a2;
import te0.w;
import tx0.g;
import tx0.l;
import tx0.t2;
import vkm.j2;
import whe.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/ui/tab/AccountsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lcie/h0;", "Lash/j;", "Lno/k;", "Lhx0/d0;", "Lkji/f;", "Ljji/h;", "Lho/l0;", "Lcie/f0;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountsController extends ViewController<q> implements tki.c, j, k, d0, f, h, l0, f0 {
    public static final /* synthetic */ KProperty[] O0 = {o0.f186429a.j(new h0(AccountsController.class, "binding", "getBinding()Lcom/revolut/feature/tab/accounts/impl/databinding/ScreenTabAccountsBinding;", 0))};
    public final Object A0;
    public final Object B0;
    public final Object C0;
    public final Object D0;
    public final Object E0;
    public a2 F0;
    public final ScrollerDelegate G0;
    public final GridBoxDelegate H0;
    public final z4l.j I0;
    public final Object J0;
    public final TabAccountsScreenContract$InputData K;
    public final Object K0;
    public e L;
    public final Object L0;
    public final s M;
    public final Object M0;
    public final ao.h N;
    public final Object N0;
    public final RowDelegate O;
    public final TextDelegate P;
    public final ActionWidgetDelegate Q;
    public final FullScreenStateDelegate R;
    public final CellDetailsActionDelegate S;
    public final CellDetailsBadgeDelegate T;
    public final CellDetailsDelegate U;
    public final ListSubheaderDelegate V;
    public final LargeActionButtonDelegate W;
    public final SmallActionButtonDelegate X;
    public final ListingTileDelegate Y;
    public final BigTileDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final CellDetailsSingleButtonDelegate f89649a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final TabsDelegate f89650b0;
    public final SwipeToActionDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final BannerDelegate f89651d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final PromotionalMediumTileDelegate f89652e0;
    public final Object f0;
    public final RateEmojiDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final VaultsProgressDelegate f89653h0;
    public final GoalProgressWidgetDelegate i0;
    public final GoalProgressLoadingWidgetDelegate j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final ActionTileDelegate f89654k0;
    public final LogosTileDelegate l0;
    public final ActionCardDelegate m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final SmallStockCardDelegate f89655n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final InputDisclosureDelegate f89656o0;
    public final ComplexChartDelegate p0;
    public final ProductSelectionDelegate q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final HistogramDelegate f89657r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final LinearProgressWithAmountDelegate f89658s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ProgressionCountDelegate f89659t0;
    public final CounterTextDelegate u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final VoucherSmallTileDelegate f89660v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public AnalyticsContext f89661w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int f89662x0;
    public final int y0;
    public final ihm.f z0;

    public AccountsController(TabAccountsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.M = new s(new u(this));
        this.N = vc.s.t(this, cie.c.f);
        final int i = 7;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.O = rowDelegate;
        this.P = new TextDelegate();
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.Q = actionWidgetDelegate;
        ActionWidgetLoadingDelegate actionWidgetLoadingDelegate = new ActionWidgetLoadingDelegate();
        this.R = new FullScreenStateDelegate();
        this.S = new CellDetailsActionDelegate();
        this.T = new CellDetailsBadgeDelegate();
        this.U = new CellDetailsDelegate();
        this.V = new ListSubheaderDelegate();
        this.W = new LargeActionButtonDelegate();
        this.X = new SmallActionButtonDelegate();
        ListingTileDelegate listingTileDelegate = new ListingTileDelegate();
        this.Y = listingTileDelegate;
        BigTileDelegate bigTileDelegate = new BigTileDelegate();
        this.Z = bigTileDelegate;
        CellDetailsSingleButtonDelegate cellDetailsSingleButtonDelegate = new CellDetailsSingleButtonDelegate();
        this.f89649a0 = cellDetailsSingleButtonDelegate;
        final int i2 = 2;
        ContainerDelegate containerDelegate = new ContainerDelegate(v.k(listingTileDelegate, rowDelegate, bigTileDelegate, cellDetailsSingleButtonDelegate), null, 6);
        this.f89650b0 = new TabsDelegate();
        this.c0 = new SwipeToActionDelegate(rowDelegate, true);
        BannerDelegate bannerDelegate = new BannerDelegate();
        this.f89651d0 = bannerDelegate;
        this.f89652e0 = new PromotionalMediumTileDelegate();
        HeroBannerDelegate heroBannerDelegate = new HeroBannerDelegate(0);
        PhotoBannerLargeDelegate photoBannerLargeDelegate = new PhotoBannerLargeDelegate();
        this.f0 = w.y0(new c0(3));
        this.g0 = new RateEmojiDelegate();
        this.f89653h0 = new VaultsProgressDelegate();
        this.i0 = new GoalProgressWidgetDelegate();
        this.j0 = new GoalProgressLoadingWidgetDelegate();
        ActionTileDelegate actionTileDelegate = new ActionTileDelegate();
        this.f89654k0 = actionTileDelegate;
        LogosTileDelegate logosTileDelegate = new LogosTileDelegate();
        this.l0 = logosTileDelegate;
        ActionCardDelegate actionCardDelegate = new ActionCardDelegate();
        this.m0 = actionCardDelegate;
        SmallStockCardDelegate smallStockCardDelegate = new SmallStockCardDelegate();
        this.f89655n0 = smallStockCardDelegate;
        this.f89656o0 = new InputDisclosureDelegate();
        ComplexChartDelegate complexChartDelegate = new ComplexChartDelegate(new SimpleLineChartDelegate());
        this.p0 = complexChartDelegate;
        this.q0 = new ProductSelectionDelegate();
        this.f89657r0 = new HistogramDelegate();
        this.f89658s0 = new LinearProgressWithAmountDelegate();
        this.f89659t0 = new ProgressionCountDelegate();
        this.u0 = new CounterTextDelegate();
        VoucherSmallTileDelegate voucherSmallTileDelegate = new VoucherSmallTileDelegate();
        this.f89660v0 = voucherSmallTileDelegate;
        this.f89662x0 = R$style.TransparentNavigationBarMarkerTheme;
        this.y0 = R$layout.screen_tab_accounts;
        this.z0 = v0.a.d("create(...)");
        this.A0 = w.y0(new Function0(this) { // from class: cie.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsController f24448b;

            {
                this.f24448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                AccountsController accountsController = this.f24448b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsController.O0;
                        AccountsController accountsController2 = this.f24448b;
                        return tki.g.a(accountsController2, accountsController2.R2(), zhm.d0.E0(accountsController2.R1().h().e, zhm.v.k(new RowLoadingDelegate(), accountsController2.O, accountsController2.Q, accountsController2.R, accountsController2.S, accountsController2.T, accountsController2.U, accountsController2.V, new ListSubheaderLoadingDelegate(), new ListCellDelegate(), accountsController2.f89650b0, accountsController2.Y, accountsController2.c0, accountsController2.W, accountsController2.f89652e0, accountsController2.f89653h0, accountsController2.j0, accountsController2.i0, new VaultsProgressLoadingDelegate(), new PlaceholderRowDelegate(), new SmallCardLoadingDelegate(null), new PlainTextDelegate(), new PlainTextLoadingDelegate(), accountsController2.f89651d0, accountsController2.G0, accountsController2.P, accountsController2.g0, accountsController2.X, new LargeActionButtonLoadingDelegate(), new ActionWidgetLoadingDelegate(), new BannerLoadingDelegate(), new HeroBannerLoadingDelegate(), accountsController2.m0, new ActionCardLoadingDelegate(), accountsController2.f89655n0, accountsController2.f89656o0, accountsController2.p0, new ProductSelectionLoadingDelegate(), accountsController2.q0, accountsController2.H0, new HistogramLoadingDelegate(), accountsController2.f89657r0, accountsController2.u0, new BigTileLoadingDelegate(), accountsController2.f89659t0, accountsController2.f89658s0, new LinearProgressWithAmountLoadingDelegate(), new ProgressTimelineDelegate(), new ProgressTimelineLoadingDelegate())), R$id.tab_accounts_recyclerView, null, accountsController2.I0, null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsController.O0;
                        return accountsController.R1().C();
                    case 2:
                        KProperty[] kPropertyArr3 = AccountsController.O0;
                        return accountsController.R1().o();
                    case 3:
                        KProperty[] kPropertyArr4 = AccountsController.O0;
                        return accountsController.R1().r();
                    case 4:
                        KProperty[] kPropertyArr5 = AccountsController.O0;
                        return accountsController.R1().z();
                    case 5:
                        KProperty[] kPropertyArr6 = AccountsController.O0;
                        return Boolean.valueOf(((jte.d) accountsController.R1().p()).c(TabAccountsApi$Toggles.HomeTotalWealth.f89457c));
                    case 6:
                        KProperty[] kPropertyArr7 = AccountsController.O0;
                        return accountsController.R1().S();
                    case 7:
                        KProperty[] kPropertyArr8 = AccountsController.O0;
                        return new mhe.d(accountsController.I0);
                    case 8:
                        ihm.f fVar = accountsController.z0;
                        TabAccountsScreenContract$InputData tabAccountsScreenContract$InputData = accountsController.K;
                        d5a.a aVar = new d5a.a(fVar, accountsController.G0.i, accountsController.I0.f, 1);
                        phm.a aVar2 = (phm.a) ue0.e.j(accountsController.m2()).a().get(ige.a.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                        }
                        ehe.m mVarB = ((rge.b) ((jge.m) aVar3.b()).f174022n.get()).b(tabAccountsScreenContract$InputData.f89678c).b();
                        switch (mVarB.f126084a) {
                            case 0:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                            default:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.e = aVar;
                                break;
                            default:
                                mVarB.e = aVar;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f = accountsController;
                                break;
                            default:
                                mVarB.f = accountsController;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f126087g = accountsController;
                                break;
                            default:
                                mVarB.f126087g = accountsController;
                                break;
                        }
                        return (fie.a) ((ehe.m) mVarB.mo3808a(accountsController)).mo3783build();
                    default:
                        KProperty[] kPropertyArr9 = AccountsController.O0;
                        AtomicReference atomicReference = eoi.r.f127969a;
                        eoi.r.e("screenModelInitStarted", false);
                        e0 e0VarA = accountsController.R1().a();
                        eoi.r.e("screenModelInitFinished", false);
                        return e0VarA;
                }
            }
        });
        final int i3 = 3;
        this.B0 = w.y0(new Function0(this) { // from class: cie.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsController f24448b;

            {
                this.f24448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                AccountsController accountsController = this.f24448b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsController.O0;
                        AccountsController accountsController2 = this.f24448b;
                        return tki.g.a(accountsController2, accountsController2.R2(), zhm.d0.E0(accountsController2.R1().h().e, zhm.v.k(new RowLoadingDelegate(), accountsController2.O, accountsController2.Q, accountsController2.R, accountsController2.S, accountsController2.T, accountsController2.U, accountsController2.V, new ListSubheaderLoadingDelegate(), new ListCellDelegate(), accountsController2.f89650b0, accountsController2.Y, accountsController2.c0, accountsController2.W, accountsController2.f89652e0, accountsController2.f89653h0, accountsController2.j0, accountsController2.i0, new VaultsProgressLoadingDelegate(), new PlaceholderRowDelegate(), new SmallCardLoadingDelegate(null), new PlainTextDelegate(), new PlainTextLoadingDelegate(), accountsController2.f89651d0, accountsController2.G0, accountsController2.P, accountsController2.g0, accountsController2.X, new LargeActionButtonLoadingDelegate(), new ActionWidgetLoadingDelegate(), new BannerLoadingDelegate(), new HeroBannerLoadingDelegate(), accountsController2.m0, new ActionCardLoadingDelegate(), accountsController2.f89655n0, accountsController2.f89656o0, accountsController2.p0, new ProductSelectionLoadingDelegate(), accountsController2.q0, accountsController2.H0, new HistogramLoadingDelegate(), accountsController2.f89657r0, accountsController2.u0, new BigTileLoadingDelegate(), accountsController2.f89659t0, accountsController2.f89658s0, new LinearProgressWithAmountLoadingDelegate(), new ProgressTimelineDelegate(), new ProgressTimelineLoadingDelegate())), R$id.tab_accounts_recyclerView, null, accountsController2.I0, null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsController.O0;
                        return accountsController.R1().C();
                    case 2:
                        KProperty[] kPropertyArr3 = AccountsController.O0;
                        return accountsController.R1().o();
                    case 3:
                        KProperty[] kPropertyArr4 = AccountsController.O0;
                        return accountsController.R1().r();
                    case 4:
                        KProperty[] kPropertyArr5 = AccountsController.O0;
                        return accountsController.R1().z();
                    case 5:
                        KProperty[] kPropertyArr6 = AccountsController.O0;
                        return Boolean.valueOf(((jte.d) accountsController.R1().p()).c(TabAccountsApi$Toggles.HomeTotalWealth.f89457c));
                    case 6:
                        KProperty[] kPropertyArr7 = AccountsController.O0;
                        return accountsController.R1().S();
                    case 7:
                        KProperty[] kPropertyArr8 = AccountsController.O0;
                        return new mhe.d(accountsController.I0);
                    case 8:
                        ihm.f fVar = accountsController.z0;
                        TabAccountsScreenContract$InputData tabAccountsScreenContract$InputData = accountsController.K;
                        d5a.a aVar = new d5a.a(fVar, accountsController.G0.i, accountsController.I0.f, 1);
                        phm.a aVar2 = (phm.a) ue0.e.j(accountsController.m2()).a().get(ige.a.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                        }
                        ehe.m mVarB = ((rge.b) ((jge.m) aVar3.b()).f174022n.get()).b(tabAccountsScreenContract$InputData.f89678c).b();
                        switch (mVarB.f126084a) {
                            case 0:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                            default:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.e = aVar;
                                break;
                            default:
                                mVarB.e = aVar;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f = accountsController;
                                break;
                            default:
                                mVarB.f = accountsController;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f126087g = accountsController;
                                break;
                            default:
                                mVarB.f126087g = accountsController;
                                break;
                        }
                        return (fie.a) ((ehe.m) mVarB.mo3808a(accountsController)).mo3783build();
                    default:
                        KProperty[] kPropertyArr9 = AccountsController.O0;
                        AtomicReference atomicReference = eoi.r.f127969a;
                        eoi.r.e("screenModelInitStarted", false);
                        e0 e0VarA = accountsController.R1().a();
                        eoi.r.e("screenModelInitFinished", false);
                        return e0VarA;
                }
            }
        });
        final int i5 = 4;
        this.C0 = w.y0(new Function0(this) { // from class: cie.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsController f24448b;

            {
                this.f24448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                AccountsController accountsController = this.f24448b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsController.O0;
                        AccountsController accountsController2 = this.f24448b;
                        return tki.g.a(accountsController2, accountsController2.R2(), zhm.d0.E0(accountsController2.R1().h().e, zhm.v.k(new RowLoadingDelegate(), accountsController2.O, accountsController2.Q, accountsController2.R, accountsController2.S, accountsController2.T, accountsController2.U, accountsController2.V, new ListSubheaderLoadingDelegate(), new ListCellDelegate(), accountsController2.f89650b0, accountsController2.Y, accountsController2.c0, accountsController2.W, accountsController2.f89652e0, accountsController2.f89653h0, accountsController2.j0, accountsController2.i0, new VaultsProgressLoadingDelegate(), new PlaceholderRowDelegate(), new SmallCardLoadingDelegate(null), new PlainTextDelegate(), new PlainTextLoadingDelegate(), accountsController2.f89651d0, accountsController2.G0, accountsController2.P, accountsController2.g0, accountsController2.X, new LargeActionButtonLoadingDelegate(), new ActionWidgetLoadingDelegate(), new BannerLoadingDelegate(), new HeroBannerLoadingDelegate(), accountsController2.m0, new ActionCardLoadingDelegate(), accountsController2.f89655n0, accountsController2.f89656o0, accountsController2.p0, new ProductSelectionLoadingDelegate(), accountsController2.q0, accountsController2.H0, new HistogramLoadingDelegate(), accountsController2.f89657r0, accountsController2.u0, new BigTileLoadingDelegate(), accountsController2.f89659t0, accountsController2.f89658s0, new LinearProgressWithAmountLoadingDelegate(), new ProgressTimelineDelegate(), new ProgressTimelineLoadingDelegate())), R$id.tab_accounts_recyclerView, null, accountsController2.I0, null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsController.O0;
                        return accountsController.R1().C();
                    case 2:
                        KProperty[] kPropertyArr3 = AccountsController.O0;
                        return accountsController.R1().o();
                    case 3:
                        KProperty[] kPropertyArr4 = AccountsController.O0;
                        return accountsController.R1().r();
                    case 4:
                        KProperty[] kPropertyArr5 = AccountsController.O0;
                        return accountsController.R1().z();
                    case 5:
                        KProperty[] kPropertyArr6 = AccountsController.O0;
                        return Boolean.valueOf(((jte.d) accountsController.R1().p()).c(TabAccountsApi$Toggles.HomeTotalWealth.f89457c));
                    case 6:
                        KProperty[] kPropertyArr7 = AccountsController.O0;
                        return accountsController.R1().S();
                    case 7:
                        KProperty[] kPropertyArr8 = AccountsController.O0;
                        return new mhe.d(accountsController.I0);
                    case 8:
                        ihm.f fVar = accountsController.z0;
                        TabAccountsScreenContract$InputData tabAccountsScreenContract$InputData = accountsController.K;
                        d5a.a aVar = new d5a.a(fVar, accountsController.G0.i, accountsController.I0.f, 1);
                        phm.a aVar2 = (phm.a) ue0.e.j(accountsController.m2()).a().get(ige.a.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                        }
                        ehe.m mVarB = ((rge.b) ((jge.m) aVar3.b()).f174022n.get()).b(tabAccountsScreenContract$InputData.f89678c).b();
                        switch (mVarB.f126084a) {
                            case 0:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                            default:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.e = aVar;
                                break;
                            default:
                                mVarB.e = aVar;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f = accountsController;
                                break;
                            default:
                                mVarB.f = accountsController;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f126087g = accountsController;
                                break;
                            default:
                                mVarB.f126087g = accountsController;
                                break;
                        }
                        return (fie.a) ((ehe.m) mVarB.mo3808a(accountsController)).mo3783build();
                    default:
                        KProperty[] kPropertyArr9 = AccountsController.O0;
                        AtomicReference atomicReference = eoi.r.f127969a;
                        eoi.r.e("screenModelInitStarted", false);
                        e0 e0VarA = accountsController.R1().a();
                        eoi.r.e("screenModelInitFinished", false);
                        return e0VarA;
                }
            }
        });
        final int i6 = 5;
        this.D0 = w.y0(new Function0(this) { // from class: cie.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsController f24448b;

            {
                this.f24448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i6;
                AccountsController accountsController = this.f24448b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsController.O0;
                        AccountsController accountsController2 = this.f24448b;
                        return tki.g.a(accountsController2, accountsController2.R2(), zhm.d0.E0(accountsController2.R1().h().e, zhm.v.k(new RowLoadingDelegate(), accountsController2.O, accountsController2.Q, accountsController2.R, accountsController2.S, accountsController2.T, accountsController2.U, accountsController2.V, new ListSubheaderLoadingDelegate(), new ListCellDelegate(), accountsController2.f89650b0, accountsController2.Y, accountsController2.c0, accountsController2.W, accountsController2.f89652e0, accountsController2.f89653h0, accountsController2.j0, accountsController2.i0, new VaultsProgressLoadingDelegate(), new PlaceholderRowDelegate(), new SmallCardLoadingDelegate(null), new PlainTextDelegate(), new PlainTextLoadingDelegate(), accountsController2.f89651d0, accountsController2.G0, accountsController2.P, accountsController2.g0, accountsController2.X, new LargeActionButtonLoadingDelegate(), new ActionWidgetLoadingDelegate(), new BannerLoadingDelegate(), new HeroBannerLoadingDelegate(), accountsController2.m0, new ActionCardLoadingDelegate(), accountsController2.f89655n0, accountsController2.f89656o0, accountsController2.p0, new ProductSelectionLoadingDelegate(), accountsController2.q0, accountsController2.H0, new HistogramLoadingDelegate(), accountsController2.f89657r0, accountsController2.u0, new BigTileLoadingDelegate(), accountsController2.f89659t0, accountsController2.f89658s0, new LinearProgressWithAmountLoadingDelegate(), new ProgressTimelineDelegate(), new ProgressTimelineLoadingDelegate())), R$id.tab_accounts_recyclerView, null, accountsController2.I0, null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsController.O0;
                        return accountsController.R1().C();
                    case 2:
                        KProperty[] kPropertyArr3 = AccountsController.O0;
                        return accountsController.R1().o();
                    case 3:
                        KProperty[] kPropertyArr4 = AccountsController.O0;
                        return accountsController.R1().r();
                    case 4:
                        KProperty[] kPropertyArr5 = AccountsController.O0;
                        return accountsController.R1().z();
                    case 5:
                        KProperty[] kPropertyArr6 = AccountsController.O0;
                        return Boolean.valueOf(((jte.d) accountsController.R1().p()).c(TabAccountsApi$Toggles.HomeTotalWealth.f89457c));
                    case 6:
                        KProperty[] kPropertyArr7 = AccountsController.O0;
                        return accountsController.R1().S();
                    case 7:
                        KProperty[] kPropertyArr8 = AccountsController.O0;
                        return new mhe.d(accountsController.I0);
                    case 8:
                        ihm.f fVar = accountsController.z0;
                        TabAccountsScreenContract$InputData tabAccountsScreenContract$InputData = accountsController.K;
                        d5a.a aVar = new d5a.a(fVar, accountsController.G0.i, accountsController.I0.f, 1);
                        phm.a aVar2 = (phm.a) ue0.e.j(accountsController.m2()).a().get(ige.a.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                        }
                        ehe.m mVarB = ((rge.b) ((jge.m) aVar3.b()).f174022n.get()).b(tabAccountsScreenContract$InputData.f89678c).b();
                        switch (mVarB.f126084a) {
                            case 0:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                            default:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.e = aVar;
                                break;
                            default:
                                mVarB.e = aVar;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f = accountsController;
                                break;
                            default:
                                mVarB.f = accountsController;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f126087g = accountsController;
                                break;
                            default:
                                mVarB.f126087g = accountsController;
                                break;
                        }
                        return (fie.a) ((ehe.m) mVarB.mo3808a(accountsController)).mo3783build();
                    default:
                        KProperty[] kPropertyArr9 = AccountsController.O0;
                        AtomicReference atomicReference = eoi.r.f127969a;
                        eoi.r.e("screenModelInitStarted", false);
                        e0 e0VarA = accountsController.R1().a();
                        eoi.r.e("screenModelInitFinished", false);
                        return e0VarA;
                }
            }
        });
        final int i21 = 6;
        this.E0 = w.y0(new Function0(this) { // from class: cie.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsController f24448b;

            {
                this.f24448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i21;
                AccountsController accountsController = this.f24448b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsController.O0;
                        AccountsController accountsController2 = this.f24448b;
                        return tki.g.a(accountsController2, accountsController2.R2(), zhm.d0.E0(accountsController2.R1().h().e, zhm.v.k(new RowLoadingDelegate(), accountsController2.O, accountsController2.Q, accountsController2.R, accountsController2.S, accountsController2.T, accountsController2.U, accountsController2.V, new ListSubheaderLoadingDelegate(), new ListCellDelegate(), accountsController2.f89650b0, accountsController2.Y, accountsController2.c0, accountsController2.W, accountsController2.f89652e0, accountsController2.f89653h0, accountsController2.j0, accountsController2.i0, new VaultsProgressLoadingDelegate(), new PlaceholderRowDelegate(), new SmallCardLoadingDelegate(null), new PlainTextDelegate(), new PlainTextLoadingDelegate(), accountsController2.f89651d0, accountsController2.G0, accountsController2.P, accountsController2.g0, accountsController2.X, new LargeActionButtonLoadingDelegate(), new ActionWidgetLoadingDelegate(), new BannerLoadingDelegate(), new HeroBannerLoadingDelegate(), accountsController2.m0, new ActionCardLoadingDelegate(), accountsController2.f89655n0, accountsController2.f89656o0, accountsController2.p0, new ProductSelectionLoadingDelegate(), accountsController2.q0, accountsController2.H0, new HistogramLoadingDelegate(), accountsController2.f89657r0, accountsController2.u0, new BigTileLoadingDelegate(), accountsController2.f89659t0, accountsController2.f89658s0, new LinearProgressWithAmountLoadingDelegate(), new ProgressTimelineDelegate(), new ProgressTimelineLoadingDelegate())), R$id.tab_accounts_recyclerView, null, accountsController2.I0, null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsController.O0;
                        return accountsController.R1().C();
                    case 2:
                        KProperty[] kPropertyArr3 = AccountsController.O0;
                        return accountsController.R1().o();
                    case 3:
                        KProperty[] kPropertyArr4 = AccountsController.O0;
                        return accountsController.R1().r();
                    case 4:
                        KProperty[] kPropertyArr5 = AccountsController.O0;
                        return accountsController.R1().z();
                    case 5:
                        KProperty[] kPropertyArr6 = AccountsController.O0;
                        return Boolean.valueOf(((jte.d) accountsController.R1().p()).c(TabAccountsApi$Toggles.HomeTotalWealth.f89457c));
                    case 6:
                        KProperty[] kPropertyArr7 = AccountsController.O0;
                        return accountsController.R1().S();
                    case 7:
                        KProperty[] kPropertyArr8 = AccountsController.O0;
                        return new mhe.d(accountsController.I0);
                    case 8:
                        ihm.f fVar = accountsController.z0;
                        TabAccountsScreenContract$InputData tabAccountsScreenContract$InputData = accountsController.K;
                        d5a.a aVar = new d5a.a(fVar, accountsController.G0.i, accountsController.I0.f, 1);
                        phm.a aVar2 = (phm.a) ue0.e.j(accountsController.m2()).a().get(ige.a.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                        }
                        ehe.m mVarB = ((rge.b) ((jge.m) aVar3.b()).f174022n.get()).b(tabAccountsScreenContract$InputData.f89678c).b();
                        switch (mVarB.f126084a) {
                            case 0:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                            default:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.e = aVar;
                                break;
                            default:
                                mVarB.e = aVar;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f = accountsController;
                                break;
                            default:
                                mVarB.f = accountsController;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f126087g = accountsController;
                                break;
                            default:
                                mVarB.f126087g = accountsController;
                                break;
                        }
                        return (fie.a) ((ehe.m) mVarB.mo3808a(accountsController)).mo3783build();
                    default:
                        KProperty[] kPropertyArr9 = AccountsController.O0;
                        AtomicReference atomicReference = eoi.r.f127969a;
                        eoi.r.e("screenModelInitStarted", false);
                        e0 e0VarA = accountsController.R1().a();
                        eoi.r.e("screenModelInitFinished", false);
                        return e0VarA;
                }
            }
        });
        final int i22 = 8;
        final int i32 = 9;
        this.G0 = new ScrollerDelegate(v.k(bannerDelegate, heroBannerDelegate, actionWidgetLoadingDelegate, actionWidgetDelegate, new HeroBannerLoadingDelegate(), new BannerLoadingDelegate(), actionTileDelegate, logosTileDelegate, actionCardDelegate, new ActionCardLoadingDelegate(), complexChartDelegate, bigTileDelegate, new BigTileLoadingDelegate(), voucherSmallTileDelegate, new VoucherSmallLoadingDelegate(), photoBannerLargeDelegate, containerDelegate), false);
        this.H0 = new GridBoxDelegate(v.k(actionCardDelegate, smallStockCardDelegate), 0, 8.0f, 8.0f, 2);
        this.I0 = new z4l.j((List) zhm.f0.f322471a, false, true, true);
        this.J0 = w.y0(new Function0(this) { // from class: cie.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsController f24448b;

            {
                this.f24448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i322 = i;
                AccountsController accountsController = this.f24448b;
                switch (i322) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsController.O0;
                        AccountsController accountsController2 = this.f24448b;
                        return tki.g.a(accountsController2, accountsController2.R2(), zhm.d0.E0(accountsController2.R1().h().e, zhm.v.k(new RowLoadingDelegate(), accountsController2.O, accountsController2.Q, accountsController2.R, accountsController2.S, accountsController2.T, accountsController2.U, accountsController2.V, new ListSubheaderLoadingDelegate(), new ListCellDelegate(), accountsController2.f89650b0, accountsController2.Y, accountsController2.c0, accountsController2.W, accountsController2.f89652e0, accountsController2.f89653h0, accountsController2.j0, accountsController2.i0, new VaultsProgressLoadingDelegate(), new PlaceholderRowDelegate(), new SmallCardLoadingDelegate(null), new PlainTextDelegate(), new PlainTextLoadingDelegate(), accountsController2.f89651d0, accountsController2.G0, accountsController2.P, accountsController2.g0, accountsController2.X, new LargeActionButtonLoadingDelegate(), new ActionWidgetLoadingDelegate(), new BannerLoadingDelegate(), new HeroBannerLoadingDelegate(), accountsController2.m0, new ActionCardLoadingDelegate(), accountsController2.f89655n0, accountsController2.f89656o0, accountsController2.p0, new ProductSelectionLoadingDelegate(), accountsController2.q0, accountsController2.H0, new HistogramLoadingDelegate(), accountsController2.f89657r0, accountsController2.u0, new BigTileLoadingDelegate(), accountsController2.f89659t0, accountsController2.f89658s0, new LinearProgressWithAmountLoadingDelegate(), new ProgressTimelineDelegate(), new ProgressTimelineLoadingDelegate())), R$id.tab_accounts_recyclerView, null, accountsController2.I0, null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsController.O0;
                        return accountsController.R1().C();
                    case 2:
                        KProperty[] kPropertyArr3 = AccountsController.O0;
                        return accountsController.R1().o();
                    case 3:
                        KProperty[] kPropertyArr4 = AccountsController.O0;
                        return accountsController.R1().r();
                    case 4:
                        KProperty[] kPropertyArr5 = AccountsController.O0;
                        return accountsController.R1().z();
                    case 5:
                        KProperty[] kPropertyArr6 = AccountsController.O0;
                        return Boolean.valueOf(((jte.d) accountsController.R1().p()).c(TabAccountsApi$Toggles.HomeTotalWealth.f89457c));
                    case 6:
                        KProperty[] kPropertyArr7 = AccountsController.O0;
                        return accountsController.R1().S();
                    case 7:
                        KProperty[] kPropertyArr8 = AccountsController.O0;
                        return new mhe.d(accountsController.I0);
                    case 8:
                        ihm.f fVar = accountsController.z0;
                        TabAccountsScreenContract$InputData tabAccountsScreenContract$InputData = accountsController.K;
                        d5a.a aVar = new d5a.a(fVar, accountsController.G0.i, accountsController.I0.f, 1);
                        phm.a aVar2 = (phm.a) ue0.e.j(accountsController.m2()).a().get(ige.a.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                        }
                        ehe.m mVarB = ((rge.b) ((jge.m) aVar3.b()).f174022n.get()).b(tabAccountsScreenContract$InputData.f89678c).b();
                        switch (mVarB.f126084a) {
                            case 0:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                            default:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.e = aVar;
                                break;
                            default:
                                mVarB.e = aVar;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f = accountsController;
                                break;
                            default:
                                mVarB.f = accountsController;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f126087g = accountsController;
                                break;
                            default:
                                mVarB.f126087g = accountsController;
                                break;
                        }
                        return (fie.a) ((ehe.m) mVarB.mo3808a(accountsController)).mo3783build();
                    default:
                        KProperty[] kPropertyArr9 = AccountsController.O0;
                        AtomicReference atomicReference = eoi.r.f127969a;
                        eoi.r.e("screenModelInitStarted", false);
                        e0 e0VarA = accountsController.R1().a();
                        eoi.r.e("screenModelInitFinished", false);
                        return e0VarA;
                }
            }
        });
        this.K0 = w.y0(new Function0(this) { // from class: cie.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsController f24448b;

            {
                this.f24448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i322 = i22;
                AccountsController accountsController = this.f24448b;
                switch (i322) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsController.O0;
                        AccountsController accountsController2 = this.f24448b;
                        return tki.g.a(accountsController2, accountsController2.R2(), zhm.d0.E0(accountsController2.R1().h().e, zhm.v.k(new RowLoadingDelegate(), accountsController2.O, accountsController2.Q, accountsController2.R, accountsController2.S, accountsController2.T, accountsController2.U, accountsController2.V, new ListSubheaderLoadingDelegate(), new ListCellDelegate(), accountsController2.f89650b0, accountsController2.Y, accountsController2.c0, accountsController2.W, accountsController2.f89652e0, accountsController2.f89653h0, accountsController2.j0, accountsController2.i0, new VaultsProgressLoadingDelegate(), new PlaceholderRowDelegate(), new SmallCardLoadingDelegate(null), new PlainTextDelegate(), new PlainTextLoadingDelegate(), accountsController2.f89651d0, accountsController2.G0, accountsController2.P, accountsController2.g0, accountsController2.X, new LargeActionButtonLoadingDelegate(), new ActionWidgetLoadingDelegate(), new BannerLoadingDelegate(), new HeroBannerLoadingDelegate(), accountsController2.m0, new ActionCardLoadingDelegate(), accountsController2.f89655n0, accountsController2.f89656o0, accountsController2.p0, new ProductSelectionLoadingDelegate(), accountsController2.q0, accountsController2.H0, new HistogramLoadingDelegate(), accountsController2.f89657r0, accountsController2.u0, new BigTileLoadingDelegate(), accountsController2.f89659t0, accountsController2.f89658s0, new LinearProgressWithAmountLoadingDelegate(), new ProgressTimelineDelegate(), new ProgressTimelineLoadingDelegate())), R$id.tab_accounts_recyclerView, null, accountsController2.I0, null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsController.O0;
                        return accountsController.R1().C();
                    case 2:
                        KProperty[] kPropertyArr3 = AccountsController.O0;
                        return accountsController.R1().o();
                    case 3:
                        KProperty[] kPropertyArr4 = AccountsController.O0;
                        return accountsController.R1().r();
                    case 4:
                        KProperty[] kPropertyArr5 = AccountsController.O0;
                        return accountsController.R1().z();
                    case 5:
                        KProperty[] kPropertyArr6 = AccountsController.O0;
                        return Boolean.valueOf(((jte.d) accountsController.R1().p()).c(TabAccountsApi$Toggles.HomeTotalWealth.f89457c));
                    case 6:
                        KProperty[] kPropertyArr7 = AccountsController.O0;
                        return accountsController.R1().S();
                    case 7:
                        KProperty[] kPropertyArr8 = AccountsController.O0;
                        return new mhe.d(accountsController.I0);
                    case 8:
                        ihm.f fVar = accountsController.z0;
                        TabAccountsScreenContract$InputData tabAccountsScreenContract$InputData = accountsController.K;
                        d5a.a aVar = new d5a.a(fVar, accountsController.G0.i, accountsController.I0.f, 1);
                        phm.a aVar2 = (phm.a) ue0.e.j(accountsController.m2()).a().get(ige.a.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                        }
                        ehe.m mVarB = ((rge.b) ((jge.m) aVar3.b()).f174022n.get()).b(tabAccountsScreenContract$InputData.f89678c).b();
                        switch (mVarB.f126084a) {
                            case 0:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                            default:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.e = aVar;
                                break;
                            default:
                                mVarB.e = aVar;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f = accountsController;
                                break;
                            default:
                                mVarB.f = accountsController;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f126087g = accountsController;
                                break;
                            default:
                                mVarB.f126087g = accountsController;
                                break;
                        }
                        return (fie.a) ((ehe.m) mVarB.mo3808a(accountsController)).mo3783build();
                    default:
                        KProperty[] kPropertyArr9 = AccountsController.O0;
                        AtomicReference atomicReference = eoi.r.f127969a;
                        eoi.r.e("screenModelInitStarted", false);
                        e0 e0VarA = accountsController.R1().a();
                        eoi.r.e("screenModelInitFinished", false);
                        return e0VarA;
                }
            }
        });
        this.L0 = w.y0(new Function0(this) { // from class: cie.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsController f24448b;

            {
                this.f24448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i322 = i32;
                AccountsController accountsController = this.f24448b;
                switch (i322) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsController.O0;
                        AccountsController accountsController2 = this.f24448b;
                        return tki.g.a(accountsController2, accountsController2.R2(), zhm.d0.E0(accountsController2.R1().h().e, zhm.v.k(new RowLoadingDelegate(), accountsController2.O, accountsController2.Q, accountsController2.R, accountsController2.S, accountsController2.T, accountsController2.U, accountsController2.V, new ListSubheaderLoadingDelegate(), new ListCellDelegate(), accountsController2.f89650b0, accountsController2.Y, accountsController2.c0, accountsController2.W, accountsController2.f89652e0, accountsController2.f89653h0, accountsController2.j0, accountsController2.i0, new VaultsProgressLoadingDelegate(), new PlaceholderRowDelegate(), new SmallCardLoadingDelegate(null), new PlainTextDelegate(), new PlainTextLoadingDelegate(), accountsController2.f89651d0, accountsController2.G0, accountsController2.P, accountsController2.g0, accountsController2.X, new LargeActionButtonLoadingDelegate(), new ActionWidgetLoadingDelegate(), new BannerLoadingDelegate(), new HeroBannerLoadingDelegate(), accountsController2.m0, new ActionCardLoadingDelegate(), accountsController2.f89655n0, accountsController2.f89656o0, accountsController2.p0, new ProductSelectionLoadingDelegate(), accountsController2.q0, accountsController2.H0, new HistogramLoadingDelegate(), accountsController2.f89657r0, accountsController2.u0, new BigTileLoadingDelegate(), accountsController2.f89659t0, accountsController2.f89658s0, new LinearProgressWithAmountLoadingDelegate(), new ProgressTimelineDelegate(), new ProgressTimelineLoadingDelegate())), R$id.tab_accounts_recyclerView, null, accountsController2.I0, null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsController.O0;
                        return accountsController.R1().C();
                    case 2:
                        KProperty[] kPropertyArr3 = AccountsController.O0;
                        return accountsController.R1().o();
                    case 3:
                        KProperty[] kPropertyArr4 = AccountsController.O0;
                        return accountsController.R1().r();
                    case 4:
                        KProperty[] kPropertyArr5 = AccountsController.O0;
                        return accountsController.R1().z();
                    case 5:
                        KProperty[] kPropertyArr6 = AccountsController.O0;
                        return Boolean.valueOf(((jte.d) accountsController.R1().p()).c(TabAccountsApi$Toggles.HomeTotalWealth.f89457c));
                    case 6:
                        KProperty[] kPropertyArr7 = AccountsController.O0;
                        return accountsController.R1().S();
                    case 7:
                        KProperty[] kPropertyArr8 = AccountsController.O0;
                        return new mhe.d(accountsController.I0);
                    case 8:
                        ihm.f fVar = accountsController.z0;
                        TabAccountsScreenContract$InputData tabAccountsScreenContract$InputData = accountsController.K;
                        d5a.a aVar = new d5a.a(fVar, accountsController.G0.i, accountsController.I0.f, 1);
                        phm.a aVar2 = (phm.a) ue0.e.j(accountsController.m2()).a().get(ige.a.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                        }
                        ehe.m mVarB = ((rge.b) ((jge.m) aVar3.b()).f174022n.get()).b(tabAccountsScreenContract$InputData.f89678c).b();
                        switch (mVarB.f126084a) {
                            case 0:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                            default:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.e = aVar;
                                break;
                            default:
                                mVarB.e = aVar;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f = accountsController;
                                break;
                            default:
                                mVarB.f = accountsController;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f126087g = accountsController;
                                break;
                            default:
                                mVarB.f126087g = accountsController;
                                break;
                        }
                        return (fie.a) ((ehe.m) mVarB.mo3808a(accountsController)).mo3783build();
                    default:
                        KProperty[] kPropertyArr9 = AccountsController.O0;
                        AtomicReference atomicReference = eoi.r.f127969a;
                        eoi.r.e("screenModelInitStarted", false);
                        e0 e0VarA = accountsController.R1().a();
                        eoi.r.e("screenModelInitFinished", false);
                        return e0VarA;
                }
            }
        });
        final int i33 = 0;
        this.M0 = w.y0(new Function0(this) { // from class: cie.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsController f24448b;

            {
                this.f24448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i322 = i33;
                AccountsController accountsController = this.f24448b;
                switch (i322) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsController.O0;
                        AccountsController accountsController2 = this.f24448b;
                        return tki.g.a(accountsController2, accountsController2.R2(), zhm.d0.E0(accountsController2.R1().h().e, zhm.v.k(new RowLoadingDelegate(), accountsController2.O, accountsController2.Q, accountsController2.R, accountsController2.S, accountsController2.T, accountsController2.U, accountsController2.V, new ListSubheaderLoadingDelegate(), new ListCellDelegate(), accountsController2.f89650b0, accountsController2.Y, accountsController2.c0, accountsController2.W, accountsController2.f89652e0, accountsController2.f89653h0, accountsController2.j0, accountsController2.i0, new VaultsProgressLoadingDelegate(), new PlaceholderRowDelegate(), new SmallCardLoadingDelegate(null), new PlainTextDelegate(), new PlainTextLoadingDelegate(), accountsController2.f89651d0, accountsController2.G0, accountsController2.P, accountsController2.g0, accountsController2.X, new LargeActionButtonLoadingDelegate(), new ActionWidgetLoadingDelegate(), new BannerLoadingDelegate(), new HeroBannerLoadingDelegate(), accountsController2.m0, new ActionCardLoadingDelegate(), accountsController2.f89655n0, accountsController2.f89656o0, accountsController2.p0, new ProductSelectionLoadingDelegate(), accountsController2.q0, accountsController2.H0, new HistogramLoadingDelegate(), accountsController2.f89657r0, accountsController2.u0, new BigTileLoadingDelegate(), accountsController2.f89659t0, accountsController2.f89658s0, new LinearProgressWithAmountLoadingDelegate(), new ProgressTimelineDelegate(), new ProgressTimelineLoadingDelegate())), R$id.tab_accounts_recyclerView, null, accountsController2.I0, null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsController.O0;
                        return accountsController.R1().C();
                    case 2:
                        KProperty[] kPropertyArr3 = AccountsController.O0;
                        return accountsController.R1().o();
                    case 3:
                        KProperty[] kPropertyArr4 = AccountsController.O0;
                        return accountsController.R1().r();
                    case 4:
                        KProperty[] kPropertyArr5 = AccountsController.O0;
                        return accountsController.R1().z();
                    case 5:
                        KProperty[] kPropertyArr6 = AccountsController.O0;
                        return Boolean.valueOf(((jte.d) accountsController.R1().p()).c(TabAccountsApi$Toggles.HomeTotalWealth.f89457c));
                    case 6:
                        KProperty[] kPropertyArr7 = AccountsController.O0;
                        return accountsController.R1().S();
                    case 7:
                        KProperty[] kPropertyArr8 = AccountsController.O0;
                        return new mhe.d(accountsController.I0);
                    case 8:
                        ihm.f fVar = accountsController.z0;
                        TabAccountsScreenContract$InputData tabAccountsScreenContract$InputData = accountsController.K;
                        d5a.a aVar = new d5a.a(fVar, accountsController.G0.i, accountsController.I0.f, 1);
                        phm.a aVar2 = (phm.a) ue0.e.j(accountsController.m2()).a().get(ige.a.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                        }
                        ehe.m mVarB = ((rge.b) ((jge.m) aVar3.b()).f174022n.get()).b(tabAccountsScreenContract$InputData.f89678c).b();
                        switch (mVarB.f126084a) {
                            case 0:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                            default:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.e = aVar;
                                break;
                            default:
                                mVarB.e = aVar;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f = accountsController;
                                break;
                            default:
                                mVarB.f = accountsController;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f126087g = accountsController;
                                break;
                            default:
                                mVarB.f126087g = accountsController;
                                break;
                        }
                        return (fie.a) ((ehe.m) mVarB.mo3808a(accountsController)).mo3783build();
                    default:
                        KProperty[] kPropertyArr9 = AccountsController.O0;
                        AtomicReference atomicReference = eoi.r.f127969a;
                        eoi.r.e("screenModelInitStarted", false);
                        e0 e0VarA = accountsController.R1().a();
                        eoi.r.e("screenModelInitFinished", false);
                        return e0VarA;
                }
            }
        });
        final int i43 = 1;
        this.N0 = w.y0(new Function0(this) { // from class: cie.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountsController f24448b;

            {
                this.f24448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i322 = i43;
                AccountsController accountsController = this.f24448b;
                switch (i322) {
                    case 0:
                        KProperty[] kPropertyArr = AccountsController.O0;
                        AccountsController accountsController2 = this.f24448b;
                        return tki.g.a(accountsController2, accountsController2.R2(), zhm.d0.E0(accountsController2.R1().h().e, zhm.v.k(new RowLoadingDelegate(), accountsController2.O, accountsController2.Q, accountsController2.R, accountsController2.S, accountsController2.T, accountsController2.U, accountsController2.V, new ListSubheaderLoadingDelegate(), new ListCellDelegate(), accountsController2.f89650b0, accountsController2.Y, accountsController2.c0, accountsController2.W, accountsController2.f89652e0, accountsController2.f89653h0, accountsController2.j0, accountsController2.i0, new VaultsProgressLoadingDelegate(), new PlaceholderRowDelegate(), new SmallCardLoadingDelegate(null), new PlainTextDelegate(), new PlainTextLoadingDelegate(), accountsController2.f89651d0, accountsController2.G0, accountsController2.P, accountsController2.g0, accountsController2.X, new LargeActionButtonLoadingDelegate(), new ActionWidgetLoadingDelegate(), new BannerLoadingDelegate(), new HeroBannerLoadingDelegate(), accountsController2.m0, new ActionCardLoadingDelegate(), accountsController2.f89655n0, accountsController2.f89656o0, accountsController2.p0, new ProductSelectionLoadingDelegate(), accountsController2.q0, accountsController2.H0, new HistogramLoadingDelegate(), accountsController2.f89657r0, accountsController2.u0, new BigTileLoadingDelegate(), accountsController2.f89659t0, accountsController2.f89658s0, new LinearProgressWithAmountLoadingDelegate(), new ProgressTimelineDelegate(), new ProgressTimelineLoadingDelegate())), R$id.tab_accounts_recyclerView, null, accountsController2.I0, null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountsController.O0;
                        return accountsController.R1().C();
                    case 2:
                        KProperty[] kPropertyArr3 = AccountsController.O0;
                        return accountsController.R1().o();
                    case 3:
                        KProperty[] kPropertyArr4 = AccountsController.O0;
                        return accountsController.R1().r();
                    case 4:
                        KProperty[] kPropertyArr5 = AccountsController.O0;
                        return accountsController.R1().z();
                    case 5:
                        KProperty[] kPropertyArr6 = AccountsController.O0;
                        return Boolean.valueOf(((jte.d) accountsController.R1().p()).c(TabAccountsApi$Toggles.HomeTotalWealth.f89457c));
                    case 6:
                        KProperty[] kPropertyArr7 = AccountsController.O0;
                        return accountsController.R1().S();
                    case 7:
                        KProperty[] kPropertyArr8 = AccountsController.O0;
                        return new mhe.d(accountsController.I0);
                    case 8:
                        ihm.f fVar = accountsController.z0;
                        TabAccountsScreenContract$InputData tabAccountsScreenContract$InputData = accountsController.K;
                        d5a.a aVar = new d5a.a(fVar, accountsController.G0.i, accountsController.I0.f, 1);
                        phm.a aVar2 = (phm.a) ue0.e.j(accountsController.m2()).a().get(ige.a.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                        }
                        ehe.m mVarB = ((rge.b) ((jge.m) aVar3.b()).f174022n.get()).b(tabAccountsScreenContract$InputData.f89678c).b();
                        switch (mVarB.f126084a) {
                            case 0:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                            default:
                                tabAccountsScreenContract$InputData.getClass();
                                mVarB.d = tabAccountsScreenContract$InputData;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.e = aVar;
                                break;
                            default:
                                mVarB.e = aVar;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f = accountsController;
                                break;
                            default:
                                mVarB.f = accountsController;
                                break;
                        }
                        switch (mVarB.f126084a) {
                            case 0:
                                mVarB.f126087g = accountsController;
                                break;
                            default:
                                mVarB.f126087g = accountsController;
                                break;
                        }
                        return (fie.a) ((ehe.m) mVarB.mo3808a(accountsController)).mo3783build();
                    default:
                        KProperty[] kPropertyArr9 = AccountsController.O0;
                        AtomicReference atomicReference = eoi.r.f127969a;
                        eoi.r.e("screenModelInitStarted", false);
                        e0 e0VarA = accountsController.R1().a();
                        eoi.r.e("screenModelInitFinished", false);
                        return e0VarA;
                }
            }
        });
    }

    public static NavBarScrollingViewBehavior d3(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        int childCount = controllerContainerCoordinatorLayout.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = controllerContainerCoordinatorLayout.getChildAt(i);
            if (childAt instanceof RecyclerView) {
                ViewGroup.LayoutParams layoutParams = ((RecyclerView) childAt).getLayoutParams();
                CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
                CoordinatorLayout.Behavior behavior = layoutParams2 != null ? layoutParams2.getBehavior() : null;
                if (behavior instanceof NavBarScrollingViewBehavior) {
                    return (NavBarScrollingViewBehavior) behavior;
                }
            } else {
                i++;
            }
        }
        return null;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getO() {
        return Integer.valueOf(this.f89662x0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        a2 a2Var;
        cie.h0 uiState = (cie.h0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        Object[] objArr = 0;
        g0 g0Var = qVar instanceof g0 ? (g0) qVar : null;
        cie.h0 h0Var = g0Var != null ? g0Var.f24477a : null;
        String str = uiState.f24484j;
        cie.d0 d0Var = uiState.k;
        ArrayList arrayList = uiState.d;
        TextLocalisedClause textLocalisedClause = uiState.f24481c;
        t2 t2Var = uiState.f24480b;
        tx0.q qVar2 = uiState.f;
        List<aw0.b> list = uiState.e;
        if (str != null) {
            boolean zF = Intrinsics.f(list, h0Var != null ? h0Var.e : null);
            boolean zEquals = str.equals(h0Var != null ? h0Var.f24484j : null);
            if (!zF || !zEquals) {
                e3().f152170b.setModels(list, qVar2);
                e3().f152170b.setCurrentPage(str);
            }
            this.f89661w0 = uiState.f24482g;
            Context context = D2().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            jh.d.f(context).n0().i(D2(), str);
        } else {
            e3().f152170b.setModels(zhm.u.c(new aw0.b(new d8(uiState.i), new l(null, 7))), qVar2);
        }
        NavBarWithContainer navBarWithContainer = e3().d;
        if (!Intrinsics.f(h0Var != null ? h0Var.f24480b : null, t2Var)) {
            navBarWithContainer.setAvatar(t2Var);
        }
        if (!Intrinsics.f(h0Var != null ? h0Var.f24481c : null, textLocalisedClause)) {
            navBarWithContainer.setSearchButtonText(textLocalisedClause);
        }
        if (!Intrinsics.f(h0Var != null ? h0Var.d : null, arrayList)) {
            navBarWithContainer.setMenuItems(arrayList);
        }
        if (uiState.f24483h && ((a2Var = this.F0) == null || !a2Var.d())) {
            on.a aVar = (on.a) this.C0.getValue();
            ScreenContentRecyclerView tabAccountsRecyclerView = e3().e;
            Intrinsics.checkNotNullExpressionValue(tabAccountsRecyclerView, "tabAccountsRecyclerView");
            this.F0 = com.revolut.kompot.navigable.a.g2(this, ((sn.a) aVar).b(tabAccountsRecyclerView, false), null, new i(this, objArr == true ? 1 : 0, 11), 3);
        }
        if (!Intrinsics.f(h0Var != null ? h0Var.k : null, d0Var)) {
            SmallActionButton smallActionButton = e3().f;
            if (d0Var != null) {
                smallActionButton.setVisibility(0);
                smallActionButton.setVisibilityAnimationsOnScrollEnabled(true);
                smallActionButton.setVisibilityOnScroll(true);
                smallActionButton.setIcon(d0Var.f24464b);
                smallActionButton.setText(d0Var.f24465c);
                smallActionButton.i(d0Var.f24463a);
            } else {
                smallActionButton.setVisibility(8);
                smallActionButton.setVisibilityAnimationsOnScrollEnabled(false);
                smallActionButton.setVisibilityOnScroll(false);
            }
        }
        e3().d.setMessage(uiState.f24485l);
        whe.c cVar = (whe.c) this.B0.getValue();
        View view = D2();
        cVar.getClass();
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(view, "view");
        if (!cVar.d) {
            cVar.d = true;
            AtomicReference atomicReference = r.f127969a;
            r.e("screenRendered", false);
        }
        if (!cVar.i) {
            List<aw0.b> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it8 = list2.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    if (((aw0.b) it8.next()).f10240b instanceof g) {
                        cVar.i = true;
                        AtomicReference atomicReference2 = r.f127969a;
                        r.e("balanceRendered", false);
                        OneShotPreDrawListener.add(view, new whe.b(view, cVar, 0));
                        break;
                    }
                }
            }
        }
        if (cVar.f) {
            return;
        }
        List list3 = uiState.f24479a;
        if (list3.isEmpty()) {
            return;
        }
        List list4 = list3;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it9 = list4.iterator();
            while (it9.hasNext()) {
                if (((koi.j) it9.next()) instanceof pb0) {
                    return;
                }
            }
        }
        cVar.f = true;
        AtomicReference atomicReference3 = r.f127969a;
        r.e("itemsRendered", false);
        OneShotPreDrawListener.add(view, new whe.b(view, cVar, 1));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (!super.F2()) {
            ControllerContainerCoordinatorLayout tabAccountsContentContainer = e3().f152171c;
            Intrinsics.checkNotNullExpressionValue(tabAccountsContentContainer, "tabAccountsContentContainer");
            NavBarScrollingViewBehavior navBarScrollingViewBehaviorD3 = d3(tabAccountsContentContainer);
            if (navBarScrollingViewBehaviorD3 == null) {
                return false;
            }
            if (!navBarScrollingViewBehaviorD3.d()) {
                navBarScrollingViewBehaviorD3.f(true);
                return true;
            }
            if (!((d) R2()).R2()) {
                return false;
            }
        }
        return true;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f89661w0 = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getF89661w0() {
        return this.f89661w0;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        e0 e0VarR2 = R2();
        sfe.i event = new sfe.i(i, i2, intent);
        d dVar = (d) e0VarR2;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        ProductAccountDescriptor$Value productAccountDescriptor$Value = ((TabAccountsScreenContract$State) ((j2) dVar.i0.f22677a).getValue()).k;
        if (productAccountDescriptor$Value == null) {
            return;
        }
        dVar.l2(new c34.d(dVar, productAccountDescriptor$Value, event, (Continuation) null, 20), new yi5.b(26));
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        AtomicReference atomicReference = r.f127969a;
        int i = 0;
        r.e("screenOnCreatedStarted", false);
        view.setTag(com.revolut.core.ui_kit.R$id.internal_content_description_clause, new TextLocalisedClause(R1().L().a(), null, null, 14));
        RecyclerView recyclerView = ((tki.b) ((tki.a) this.M0.getValue())).f271959b.h();
        new xv0.w(new bwc.i(1, this.z0, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 17), null).b(recyclerView);
        ?? r3 = this.D0;
        boolean zBooleanValue = ((Boolean) r3.getValue()).booleanValue();
        z4l.j adapter = this.I0;
        mhe.a aVar = zBooleanValue ? new mhe.a(adapter, (mhe.e) this.E0.getValue()) : null;
        tw0.l0 p2 = getP();
        rp0.l0 displayer = (rp0.l0) this.N0.getValue();
        p2.getClass();
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(displayer, "displayer");
        p2.j(adapter, recyclerView, displayer, false, true, aVar);
        mhe.d dVar = (mhe.d) this.J0.getValue();
        dVar.getClass();
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        recyclerView.addOnItemTouchListener(dVar.f205550g);
        dVar.f205548b.attachToRecyclerView(recyclerView);
        if (((Boolean) r3.getValue()).booleanValue()) {
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            recyclerView.addItemDecoration(new mhe.f(adapter, kli.a.k(context, 16.0f)));
            c8g.a.a(view, ny0.b.f220590a, new c7e.i(this, view, 17));
        }
        recyclerView.setHasFixedSize(true);
        OneShotPreDrawListener.add(view, new cie.d(view, this, i));
        if (r.f127969a.get() == eoi.q.ACTIVE) {
            whe.d dVar2 = e.Companion;
            a0.a runnable = new a0.a(this, 8);
            dVar2.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.L = new e(view, runnable);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        a2 a2Var = this.F0;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.F0 = null;
        e eVar = this.L;
        if (eVar != null) {
            eVar.cancel();
        }
        AtomicReference atomicReference = r.f127969a;
        Intrinsics.checkNotNullParameter("homeScreenHidden", "reason");
        AtomicReference atomicReference2 = r.f127969a;
        eoi.q qVar = eoi.q.ACTIVE;
        eoi.q qVar2 = eoi.q.CANCELLED;
        while (true) {
            if (atomicReference2.compareAndSet(qVar, qVar2)) {
                r.f = "homeScreenHidden";
                break;
            } else if (atomicReference2.get() != qVar) {
                break;
            }
        }
        sjf.e eVar2 = (sjf.e) this.A0.getValue();
        TransactionsPerformanceTracker$Scenario scenario = TransactionsPerformanceTracker$Scenario.HOME_UI;
        eVar2.getClass();
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        eVar2.f263727c.d(scenario.getTraceName());
    }

    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v68, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        AtomicReference atomicReference = r.f127969a;
        int i = 0;
        r.e("screenOnShownStarted", false);
        AccountsNavBarContentView accountsNavBarContentView = e3().f152170b;
        Continuation continuation = null;
        int i2 = 1;
        int i3 = 3;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(accountsNavBarContentView.k()), null, new cie.j(this, continuation, i2), 3);
        AccountSelectionNavBarContentView accountSelectionNavBarContentView = accountsNavBarContentView.e;
        int i5 = 2;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(accountSelectionNavBarContentView.i), null, new cie.j(this, continuation, i5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(accountsNavBarContentView.j()), null, new cie.s(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(accountSelectionNavBarContentView.f59168g), null, new i(this, continuation, 12), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(accountSelectionNavBarContentView.f59171l), null, new cie.j(this, continuation, i3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(accountSelectionNavBarContentView.f59170j), null, new i(this, continuation, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(accountSelectionNavBarContentView.k), null, new i(this, continuation, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(accountSelectionNavBarContentView.f59173n), null, new cie.j(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(accountSelectionNavBarContentView.f59177s), null, new cie.j(this, continuation, 5), 3);
        NavBarWithContainer navBarWithContainer = e3().d;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithContainer.b()), null, new i(this, continuation, 15), 3);
        int i6 = 6;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithContainer.D()), null, new cie.j(this, continuation, i6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithContainer.F()), null, new cie.j(this, continuation, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithContainer.L()), null, new cie.j(this, continuation, 8), 3);
        SwipeToActionDelegate swipeToActionDelegate = this.c0;
        ihm.f fVar = swipeToActionDelegate.f;
        efm.r rVarHide = swipeToActionDelegate.f53503g.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r rVarFilter = rVarHide.filter(new ch6.d(new cge.g(15), i3));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.F0(fVar, rVarFilter)), null, new m(this, null), 3);
        ActionWidgetDelegate actionWidgetDelegate = this.Q;
        ihm.f fVar2 = actionWidgetDelegate.f51589c.f121375b;
        RowDelegate rowDelegate = this.O;
        ihm.f fVar3 = rowDelegate.f53218h;
        ihm.f fVar4 = rowDelegate.f53226s;
        ihm.f fVar5 = rowDelegate.f53220l;
        n nVar = n.f;
        efm.r map = fVar5.map(new cie.b(i));
        ihm.f fVar6 = rowDelegate.f53225r;
        cie.o oVar = cie.o.f;
        efm.r map2 = fVar6.map(new cie.b(i2));
        ihm.f fVar7 = rowDelegate.f53227t;
        p pVar = p.f;
        efm.r map3 = fVar7.map(new cie.b(i5));
        ihm.f fVar8 = this.R.f52371h.f121375b;
        CellDetailsActionDelegate cellDetailsActionDelegate = this.S;
        ihm.f fVar9 = cellDetailsActionDelegate.f51780c;
        ihm.f fVar10 = cellDetailsActionDelegate.d;
        ihm.f fVar11 = this.T.e;
        CellDetailsDelegate cellDetailsDelegate = this.U;
        ihm.f fVar12 = cellDetailsDelegate.d;
        ihm.f fVar13 = cellDetailsDelegate.e;
        ihm.f fVar14 = this.V.f52707c;
        ihm.f fVar15 = this.W.d.f121375b;
        ihm.f fVar16 = this.f89652e0.f53038c;
        ihm.f fVarR = this.f89653h0.r();
        ActionTileDelegate actionTileDelegate = this.f89654k0;
        ihm.f fVar17 = actionTileDelegate.d.f121375b;
        ihm.f fVar18 = actionTileDelegate.f51588c;
        ihm.f fVar19 = this.l0.f52753c;
        ihm.f fVar20 = this.m0.f51572n;
        SmallStockCardDelegate smallStockCardDelegate = this.f89655n0;
        ihm.f fVar21 = smallStockCardDelegate.f53378c;
        efm.r map4 = smallStockCardDelegate.d.map(new ch6.d(new cge.g(16), 4));
        ihm.f fVar22 = smallStockCardDelegate.e;
        efm.r map5 = fVar22.map(new ch6.d(new cge.g(17), 5));
        ihm.f fVar23 = this.f89656o0.f52538c;
        efm.r rVarP = this.q0.p();
        ihm.f fVar24 = this.f89657r0.f52453h;
        ihm.f fVar25 = this.P.d;
        ihm.f fVar26 = this.X.f53336c.f121375b;
        BigTileDelegate bigTileDelegate = this.Z;
        ihm.f fVar27 = bigTileDelegate.d;
        ihm.f fVar28 = bigTileDelegate.e;
        ihm.f fVar29 = this.f89649a0.f.f121375b;
        ihm.f fVar30 = (ihm.f) this.f89659t0.f53037c.getValue();
        LinearProgressWithAmountDelegate linearProgressWithAmountDelegate = this.f89658s0;
        efm.r rVarMerge = efm.r.merge(v.k(fVar2, fVar3, fVar4, map, map2, map3, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14, fVar15, fVar16, fVarR, fVar17, fVar18, fVar19, fVar20, fVar21, map4, map5, fVar23, rVarP, fVar24, fVar25, fVar26, fVar27, fVar28, fVar29, fVar30, linearProgressWithAmountDelegate.d, linearProgressWithAmountDelegate.f52672c, this.u0.f52158h.f121375b, this.f89660v0.f53608c, this.Y.f52751c, this.f89650b0.f53515c.f121375b, this.G0.q()));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        Continuation continuation2 = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), cie.q.f24513a, new cie.r(this, null), 2);
        BannerDelegate bannerDelegate = this.f89651d0;
        com.revolut.kompot.navigable.a.g2(this, new j0(new cbf.c(rd0.e.b(bannerDelegate.f51699c), 7), 14), null, new i(this, continuation2, i), 3);
        com.revolut.kompot.navigable.a.g2(this, new j0(new cbf.c(rd0.e.b(bannerDelegate.e), 8), 15), null, new i(this, continuation2, i2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(actionWidgetDelegate.f51589c.f121375b), null, new i(this, continuation2, 2), 3);
        RateEmojiDelegate rateEmojiDelegate = this.g0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rateEmojiDelegate.f53143c), null, new i(this, continuation2, i3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rateEmojiDelegate.e), null, new i(this, continuation2, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rateEmojiDelegate.d), null, new i(this, continuation2, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().f152170b.f283811r), null, new i(this, continuation2, i6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((rp0.l0) this.N0.getValue()).f256113c), null, new i(this, continuation2, 7), 3);
        efm.r rVarSkip = w.b0(e3().f152170b.e.f59174p, new tx.f(1)).skip(1L);
        Intrinsics.checkNotNullExpressionValue(rVarSkip, "skip(...)");
        Continuation continuation3 = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarSkip), null, new chf.a(this, view, continuation3, 1), 3);
        ViewController.P2(this, rd0.e.b(e3().f.f56386h), new cie.j(this, continuation3, 0), 3);
        ViewController.P2(this, rd0.e.b(e3().d.H()), new i(this, continuation3, 8), 3);
        ViewController.P2(this, rd0.e.b(e3().d.I()), new i(this, continuation3, 9), 3);
        ViewController.P2(this, rd0.e.b(actionWidgetDelegate.d.f121375b), new cie.k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(fVar22), null, new cie.l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((mhe.d) this.J0.getValue()).f205549c), null, new i(this, continuation3, 10), 3);
        OneShotPreDrawListener.add(view, new cie.d(view, this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ash.j
    /* JADX INFO: renamed from: e1 */
    public final tw0.l0 getP() {
        return (tw0.l0) this.f0.getValue();
    }

    public final hge.b e3() {
        ViewBinding value = this.N.getValue(this, O0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (hge.b) value;
    }

    @Override // jji.h
    public final NavBarWithContainer f() {
        NavBarWithContainer tabAccountsNavBarWithContainer = e3().d;
        Intrinsics.checkNotNullExpressionValue(tabAccountsNavBarWithContainer, "tabAccountsNavBarWithContainer");
        return tabAccountsNavBarWithContainer;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final fie.a R1() {
        return (fie.a) this.K0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final e0 R2() {
        return (e0) this.L0.getValue();
    }

    @Override // jji.h
    public final View getContent() {
        ScreenContentRecyclerView tabAccountsRecyclerView = e3().e;
        Intrinsics.checkNotNullExpressionValue(tabAccountsRecyclerView, "tabAccountsRecyclerView");
        return tabAccountsRecyclerView;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.y0;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final View h2(LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        AtomicReference atomicReference = r.f127969a;
        r.e("screenCreateViewStarted", false);
        View viewH2 = super.h2(inflater);
        e3().f152170b.setPageChangeTrackingEnabled(false);
        r.e("screenCreateViewFinished", false);
        return viewH2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.M0.getValue();
    }

    @Override // hx0.d0
    /* JADX INFO: renamed from: k1, reason: from getter */
    public final s getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ash.j
    public final ihm.f t0() {
        return ((rp0.l0) this.N0.getValue()).f256113c;
    }

    @Override // jji.h
    public final View v() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = e3().f152169a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return hx0.h.b(controllerContainerCoordinatorLayout);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ash.j
    public final void z1(String anchorItemId, mw0.a menu) {
        Intrinsics.checkNotNullParameter(anchorItemId, "anchorItemId");
        Intrinsics.checkNotNullParameter(menu, "menu");
        ((rp0.l0) this.N0.getValue()).e(anchorItemId, menu, mw0.o.VIEW_BOUNDS, new mw0.l(false));
    }
}
