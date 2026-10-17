package com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ViewSwitcher;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.c1;
import au0.s0;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeController;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeControllerContract$InputData;
import com.revolut.feature.shared.referrals.ui.impl.R$id;
import com.revolut.feature.shared.referrals.ui.impl.R$layout;
import com.revolut.feature.shared.referrals.ui.impl.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager;
import com.revolut.tracking.v3.BaseContext;
import grl.k9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.Job;
import no.k;
import no.m;
import ny0.i;
import nya.a0;
import nya.f;
import nya.g;
import nya.s;
import nya.x;
import nya.y;
import nya.z;
import org.jetbrains.annotations.NotNull;
import te0.w;
import xki.e;
import z4l.j;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invite_campaign/home/InviteCampaignHomeController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnya/s;", "Ldli/a;", "Lnya/a0;", "Lno/m;", "Lno/k;", "Companion", "a", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InviteCampaignHomeController extends ViewController<s> implements dli.a, m, k {
    public final InviteCampaignHomeControllerContract$InputData K;
    public final k9 L;
    public final Object M;
    public AnalyticsContext N;
    public final h O;
    public final int P;
    public final ArrayList Q;
    public final LargeActionButtonDelegate R;
    public final CellDetailsChevronDelegate S;
    public final TextDelegate T;
    public final RowDelegate U;
    public final ProductSelectionDelegate V;
    public final FooterTextDelegate W;
    public final List X;
    public final Object Y;
    public final j Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f81841a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f81840b0 = {o0.f186429a.j(new h0(InviteCampaignHomeController.class, "binding", "getBinding()Lcom/revolut/feature/shared/referrals/ui/impl/databinding/ScreenInviteCampaignBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public InviteCampaignHomeController(InviteCampaignHomeControllerContract$InputData inputData) {
        AnalyticsContext analyticsContext;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137502n;
        companion.getClass();
        AnalyticsProduct.Companion.a(k9Var);
        this.L = k9Var;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: nya.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InviteCampaignHomeController f220722b;

            {
                this.f220722b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InviteCampaignHomeController inviteCampaignHomeController = this.f220722b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InviteCampaignHomeController.f81840b0;
                        qji.b bVarU2 = inviteCampaignHomeController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.di.InviteCampaignHomeControllerInjector");
                        eya.f fVar = (eya.f) bVarU2;
                        eya.j jVar = fVar.f130626b;
                        eya.f fVar2 = fVar.f130627c;
                        InviteCampaignHomeControllerContract$InputData inviteCampaignHomeControllerContract$InputData = inviteCampaignHomeController.K;
                        inviteCampaignHomeControllerContract$InputData.getClass();
                        return new eya.b(jVar, fVar2, inviteCampaignHomeControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InviteCampaignHomeController.f81840b0;
                        InviteCampaignHomeController inviteCampaignHomeController2 = this.f220722b;
                        return dli.f.a(inviteCampaignHomeController2, inviteCampaignHomeController2.R2(), inviteCampaignHomeController2.X, R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = InviteCampaignHomeController.f81840b0;
                        return (j) ((eya.b) inviteCampaignHomeController.M.getValue()).f130613h.get();
                }
            }
        });
        String str = inputData.d;
        if (str != null) {
            AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
            BaseContext.a aVarNewBuilder = BaseContext.newBuilder();
            aVarNewBuilder.c();
            ((BaseContext) aVarNewBuilder.f49761b).setContextType("SOURCE");
            aVarNewBuilder.c();
            ((BaseContext) aVarNewBuilder.f49761b).setId(str);
            w0 w0VarA = aVarNewBuilder.a();
            companion2.getClass();
            analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        } else {
            analyticsContext = null;
        }
        this.N = analyticsContext;
        this.O = vc.s.t(this, nya.b.f);
        this.P = R$layout.screen_invite_campaign;
        this.Q = new ArrayList();
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.R = largeActionButtonDelegate;
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.S = cellDetailsChevronDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.T = textDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        ReferralContactDelegate referralContactDelegate = new ReferralContactDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.U = rowDelegate;
        ProductSelectionDelegate productSelectionDelegate = new ProductSelectionDelegate();
        this.V = productSelectionDelegate;
        CounterTextDelegate counterTextDelegate = new CounterTextDelegate();
        GridBoxDelegate gridBoxDelegate = new GridBoxDelegate(u.c(counterTextDelegate), 2, BitmapDescriptorFactory.HUE_RED, 8.0f, 4);
        FooterTextDelegate footerTextDelegate = new FooterTextDelegate();
        this.W = footerTextDelegate;
        final int i2 = 1;
        final int i3 = 2;
        List listK = v.k(new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), rowDelegate, productSelectionDelegate, new SimpleMediaDelegate(), largeActionButtonDelegate, listSubheaderDelegate, cellDetailsChevronDelegate, counterTextDelegate, gridBoxDelegate, textDelegate, new ScrollerBoxDelegate(u.c(referralContactDelegate)), footerTextDelegate);
        this.X = listK;
        this.Y = w.y0(new Function0(this) { // from class: nya.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InviteCampaignHomeController f220722b;

            {
                this.f220722b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InviteCampaignHomeController inviteCampaignHomeController = this.f220722b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InviteCampaignHomeController.f81840b0;
                        qji.b bVarU2 = inviteCampaignHomeController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.di.InviteCampaignHomeControllerInjector");
                        eya.f fVar = (eya.f) bVarU2;
                        eya.j jVar = fVar.f130626b;
                        eya.f fVar2 = fVar.f130627c;
                        InviteCampaignHomeControllerContract$InputData inviteCampaignHomeControllerContract$InputData = inviteCampaignHomeController.K;
                        inviteCampaignHomeControllerContract$InputData.getClass();
                        return new eya.b(jVar, fVar2, inviteCampaignHomeControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InviteCampaignHomeController.f81840b0;
                        InviteCampaignHomeController inviteCampaignHomeController2 = this.f220722b;
                        return dli.f.a(inviteCampaignHomeController2, inviteCampaignHomeController2.R2(), inviteCampaignHomeController2.X, R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = InviteCampaignHomeController.f81840b0;
                        return (j) ((eya.b) inviteCampaignHomeController.M.getValue()).f130613h.get();
                }
            }
        });
        this.Z = new j(6, listK, true);
        this.f81841a0 = w.y0(new Function0(this) { // from class: nya.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InviteCampaignHomeController f220722b;

            {
                this.f220722b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InviteCampaignHomeController inviteCampaignHomeController = this.f220722b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InviteCampaignHomeController.f81840b0;
                        qji.b bVarU2 = inviteCampaignHomeController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.di.InviteCampaignHomeControllerInjector");
                        eya.f fVar = (eya.f) bVarU2;
                        eya.j jVar = fVar.f130626b;
                        eya.f fVar2 = fVar.f130627c;
                        InviteCampaignHomeControllerContract$InputData inviteCampaignHomeControllerContract$InputData = inviteCampaignHomeController.K;
                        inviteCampaignHomeControllerContract$InputData.getClass();
                        return new eya.b(jVar, fVar2, inviteCampaignHomeControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InviteCampaignHomeController.f81840b0;
                        InviteCampaignHomeController inviteCampaignHomeController2 = this.f220722b;
                        return dli.f.a(inviteCampaignHomeController2, inviteCampaignHomeController2.R2(), inviteCampaignHomeController2.X, R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = InviteCampaignHomeController.f81840b0;
                        return (j) ((eya.b) inviteCampaignHomeController.M.getValue()).f130613h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        a0 uiState = (a0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        if (uiState instanceof z) {
            g3();
            View viewFindViewById = e3().f172624c.findViewById(com.revolut.kompot.common.R$id.navBarWithToolbar);
            if (viewFindViewById instanceof NavBarWithBigTile) {
                ((NavBarWithBigTile) viewFindViewById).setLoadingState(true);
            }
            e3().f172625g.setDisplayedChild(1);
            e3().f172623b.setVisibility(8);
            return;
        }
        if (uiState instanceof y) {
            g3();
            View viewFindViewById2 = e3().f172624c.findViewById(com.revolut.kompot.common.R$id.navBarWithToolbar);
            if (viewFindViewById2 instanceof NavBarWithBigTile) {
                ((NavBarWithBigTile) viewFindViewById2).setLoadingState(false);
            }
            e3().f172623b.setVisibility(8);
            return;
        }
        if (!(uiState instanceof x)) {
            throw new NoWhenBranchMatchedException();
        }
        e3().f172623b.setVisibility(0);
        x xVar = (x) uiState;
        e3().f172623b.setText(xVar.f220765b);
        e3().f172623b.setIcon(xVar.f220766c);
        nya.w wVar = xVar.f220764a;
        if (wVar instanceof nya.u) {
            this.Z.c(xVar.d);
            e3().f172625g.setDisplayedChild(0);
            e3().f.setStories(u.c(((nya.u) wVar).f220760a));
            return;
        }
        if (!(wVar instanceof nya.v)) {
            throw new NoWhenBranchMatchedException();
        }
        g3();
        nya.v vVar = (nya.v) wVar;
        KeyEvent.Callback callbackFindViewById = e3().f172624c.findViewById(com.revolut.kompot.common.R$id.navBarWithToolbar);
        if (callbackFindViewById instanceof NavBarWithBigTile) {
            TextClause textClause = vVar.f220761a;
            NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) callbackFindViewById;
            navBarWithBigTile.setLoadingState(false);
            List<? extends NavBarMenuItem> list = vVar.f220763c;
            if (list == null) {
                list = f0.f322471a;
            }
            navBarWithBigTile.setMenuItems(list);
            c1.S((c1) callbackFindViewById, u.c(vVar.d), null, null, 6);
            navBarWithBigTile.setTitleStyle(b1.DEFAULT);
            navBarWithBigTile.setToolbarTitle(textClause);
            navBarWithBigTile.setTitle(textClause);
            navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
            navBarWithBigTile.setActionStatusLabel(vVar.f220762b);
            navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        } else {
            r6.b.D("Incorrect version of navbar is shown/incorrect navbar model is set");
        }
        e3().f172625g.setDisplayedChild(1);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void J0(boolean z) {
        super.J0(z);
        if (z) {
            d dVar = (d) R2();
            dVar.H2(dVar.E, new nxa.v(14));
            dVar.M2();
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.N = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        return new AnalyticsProduct.Retail(this.L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (eya.b) this.M.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getN() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.invite_campaign, null, null, 14));
        e3().d.M();
        e3().d.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ScreenContentRecyclerView screenContentRecyclerView = e3().e;
        screenContentRecyclerView.setAdapter(this.Z);
        UIKitLinearLayoutManager uIKitLinearLayoutManager = new UIKitLinearLayoutManager(m2());
        uIKitLinearLayoutManager.f98539c = true;
        screenContentRecyclerView.setLayoutManager(uIKitLinearLayoutManager);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        screenContentRecyclerView.setItemAnimator(defaultItemAnimator);
        screenContentRecyclerView.addItemDecoration(new o31.b());
        screenContentRecyclerView.addItemDecoration(new s31.b());
        ViewSwitcher viewSwitcher = e3().f172625g;
        Intrinsics.checkNotNullExpressionValue(viewSwitcher, "viewSwitcher");
        i.e(viewSwitcher);
        e3().f172625g.setDisplayedChild(1);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(e3().d.K()), new nya.c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.R.d.f121375b), new nya.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.V.p()), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f51821c), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(e3().f172623b.o), new nya.c(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.T.d), new nya.d(this, continuation, 1), 3);
        RowDelegate rowDelegate = this.U;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53226s), new nya.d(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new nya.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.W.e.f121375b), new nya.d(this, continuation, 3), 3);
        d3();
    }

    public final void d3() {
        View viewFindViewById = e3().f172624c.findViewById(com.revolut.kompot.common.R$id.navBarWithToolbar);
        if (!(viewFindViewById instanceof NavBarWithBigTile)) {
            return;
        }
        NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) viewFindViewById;
        ArrayList arrayList = this.Q;
        Iterator it8 = arrayList.iterator();
        while (true) {
            Continuation continuation = null;
            if (!it8.hasNext()) {
                arrayList.add(com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.f59357t), null, new nya.c(this, continuation, 0), 3));
                arrayList.add(com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.b()), null, new nya.d(this, continuation, 0), 3));
                return;
            }
            ((Job) it8.next()).f(null);
        }
    }

    public final jbd.a e3() {
        ViewBinding value = this.O.getValue(this, f81840b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jbd.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final nya.j R2() {
        return (nya.j) this.f81841a0.getValue();
    }

    public final void g3() {
        ControllerContainerCoordinatorLayout homeLayout = e3().f172624c;
        Intrinsics.checkNotNullExpressionValue(homeLayout, "homeLayout");
        Iterator it8 = ViewGroupKt.getChildren(homeLayout).iterator();
        while (it8.hasNext()) {
            if (((View) it8.next()) instanceof NavBarWithBigTile) {
                return;
            }
        }
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = e3().f172624c;
        Context context = e3().f172622a.getContext();
        Intrinsics.h(context);
        NavBarWithBigTile navBarWithBigTile = new NavBarWithBigTile(context, null);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setId(com.revolut.kompot.common.R$id.navBarWithToolbar);
        navBarWithBigTile.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, -2));
        controllerContainerCoordinatorLayout.addView(navBarWithBigTile, 0);
        d3();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
