package com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.manage;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.m0;
import au0.r0;
import au0.s0;
import au0.z0;
import cli.o;
import cli.q;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rewards.impl.R$id;
import com.revolut.feature.rewards.impl.R$layout;
import com.revolut.feature.rewards.impl.R$string;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.manage.RentAndBillsManageLinkedPaymentsScreen;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.manage.RentAndBillsManageLinkedPaymentsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.youTransactor.uCube.rpc.Constants;
import dcf.v0;
import djc.b;
import djc.d;
import djc.f;
import djc.g;
import djc.j;
import djc.k;
import djc.l;
import djc.m;
import djc.r;
import djc.t;
import dli.a;
import dli.c;
import i7d.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mga.i0;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.p2;
import vc.s;
import whc.v;
import wp5.y;
import xki.e;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/screen/manage/RentAndBillsManageLinkedPaymentsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldjc/r;", "Ldli/a;", "Ldjc/t;", "Lmga/i0;", "Li7d/i;", "Companion", "a", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RentAndBillsManageLinkedPaymentsScreen extends ViewController<r> implements a, i0, i {
    public final RentAndBillsManageLinkedPaymentsScreenContract$InputData K;
    public final int L;
    public final int M;
    public final Object N;
    public final FullScreenStateDelegate O;
    public final LargeActionButtonDelegate P;
    public final RowDelegate Q;
    public final HighlightTileDelegate R;
    public final CellDetailsDelegate S;
    public final CellDetailsChevronDelegate T;
    public final Object U;
    public final h V;
    public final Object W;
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(RentAndBillsManageLinkedPaymentsScreen.class, "binding", "getBinding()Lcom/revolut/feature/rewards/impl/databinding/ScreenRentAndBillsManageLinkedPaymentsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.manage.RentAndBillsManageLinkedPaymentsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public RentAndBillsManageLinkedPaymentsScreen(RentAndBillsManageLinkedPaymentsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_rent_and_bills_manage_linked_payments;
        this.M = R$style.UiKitTheme_Mono;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: djc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RentAndBillsManageLinkedPaymentsScreen f115288b;

            {
                this.f115288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RentAndBillsManageLinkedPaymentsScreen rentAndBillsManageLinkedPaymentsScreen = this.f115288b;
                switch (i2) {
                    case 0:
                        RentAndBillsManageLinkedPaymentsScreen.Companion companion = RentAndBillsManageLinkedPaymentsScreen.INSTANCE;
                        return (s) ((whc.v) rentAndBillsManageLinkedPaymentsScreen.W.getValue()).f297604p.get();
                    case 1:
                        RentAndBillsManageLinkedPaymentsScreen.Companion companion2 = RentAndBillsManageLinkedPaymentsScreen.INSTANCE;
                        RentAndBillsManageLinkedPaymentsScreen rentAndBillsManageLinkedPaymentsScreen2 = this.f115288b;
                        return dli.f.a(rentAndBillsManageLinkedPaymentsScreen2, rentAndBillsManageLinkedPaymentsScreen2.R2(), zhm.v.k(rentAndBillsManageLinkedPaymentsScreen2.O, rentAndBillsManageLinkedPaymentsScreen2.P, rentAndBillsManageLinkedPaymentsScreen2.Q, rentAndBillsManageLinkedPaymentsScreen2.R, rentAndBillsManageLinkedPaymentsScreen2.S, rentAndBillsManageLinkedPaymentsScreen2.T), R$id.rentAndBillsManageLinkedPayments_recyclerView, null, null, null, 56);
                    default:
                        RentAndBillsManageLinkedPaymentsScreen.Companion companion3 = RentAndBillsManageLinkedPaymentsScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(rentAndBillsManageLinkedPaymentsScreen.m2()).a().get(whc.z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", whc.z.class, " is not found"));
                        }
                        whc.z zVar = ((whc.z) aVar2.b()).f297622n;
                        RentAndBillsManageLinkedPaymentsScreenContract$InputData rentAndBillsManageLinkedPaymentsScreenContract$InputData = rentAndBillsManageLinkedPaymentsScreen.K;
                        rentAndBillsManageLinkedPaymentsScreenContract$InputData.getClass();
                        return new whc.v(zVar, rentAndBillsManageLinkedPaymentsScreen, rentAndBillsManageLinkedPaymentsScreenContract$InputData, rentAndBillsManageLinkedPaymentsScreen);
                }
            }
        });
        this.O = new FullScreenStateDelegate();
        this.P = new LargeActionButtonDelegate();
        this.Q = new RowDelegate(null, null, 7);
        this.R = new HighlightTileDelegate();
        this.S = new CellDetailsDelegate();
        this.T = new CellDetailsChevronDelegate();
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: djc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RentAndBillsManageLinkedPaymentsScreen f115288b;

            {
                this.f115288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RentAndBillsManageLinkedPaymentsScreen rentAndBillsManageLinkedPaymentsScreen = this.f115288b;
                switch (i22) {
                    case 0:
                        RentAndBillsManageLinkedPaymentsScreen.Companion companion = RentAndBillsManageLinkedPaymentsScreen.INSTANCE;
                        return (s) ((whc.v) rentAndBillsManageLinkedPaymentsScreen.W.getValue()).f297604p.get();
                    case 1:
                        RentAndBillsManageLinkedPaymentsScreen.Companion companion2 = RentAndBillsManageLinkedPaymentsScreen.INSTANCE;
                        RentAndBillsManageLinkedPaymentsScreen rentAndBillsManageLinkedPaymentsScreen2 = this.f115288b;
                        return dli.f.a(rentAndBillsManageLinkedPaymentsScreen2, rentAndBillsManageLinkedPaymentsScreen2.R2(), zhm.v.k(rentAndBillsManageLinkedPaymentsScreen2.O, rentAndBillsManageLinkedPaymentsScreen2.P, rentAndBillsManageLinkedPaymentsScreen2.Q, rentAndBillsManageLinkedPaymentsScreen2.R, rentAndBillsManageLinkedPaymentsScreen2.S, rentAndBillsManageLinkedPaymentsScreen2.T), R$id.rentAndBillsManageLinkedPayments_recyclerView, null, null, null, 56);
                    default:
                        RentAndBillsManageLinkedPaymentsScreen.Companion companion3 = RentAndBillsManageLinkedPaymentsScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(rentAndBillsManageLinkedPaymentsScreen.m2()).a().get(whc.z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", whc.z.class, " is not found"));
                        }
                        whc.z zVar = ((whc.z) aVar2.b()).f297622n;
                        RentAndBillsManageLinkedPaymentsScreenContract$InputData rentAndBillsManageLinkedPaymentsScreenContract$InputData = rentAndBillsManageLinkedPaymentsScreen.K;
                        rentAndBillsManageLinkedPaymentsScreenContract$InputData.getClass();
                        return new whc.v(zVar, rentAndBillsManageLinkedPaymentsScreen, rentAndBillsManageLinkedPaymentsScreenContract$InputData, rentAndBillsManageLinkedPaymentsScreen);
                }
            }
        });
        this.V = s.t(this, b.f);
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: djc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RentAndBillsManageLinkedPaymentsScreen f115288b;

            {
                this.f115288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RentAndBillsManageLinkedPaymentsScreen rentAndBillsManageLinkedPaymentsScreen = this.f115288b;
                switch (i22) {
                    case 0:
                        RentAndBillsManageLinkedPaymentsScreen.Companion companion = RentAndBillsManageLinkedPaymentsScreen.INSTANCE;
                        return (s) ((whc.v) rentAndBillsManageLinkedPaymentsScreen.W.getValue()).f297604p.get();
                    case 1:
                        RentAndBillsManageLinkedPaymentsScreen.Companion companion2 = RentAndBillsManageLinkedPaymentsScreen.INSTANCE;
                        RentAndBillsManageLinkedPaymentsScreen rentAndBillsManageLinkedPaymentsScreen2 = this.f115288b;
                        return dli.f.a(rentAndBillsManageLinkedPaymentsScreen2, rentAndBillsManageLinkedPaymentsScreen2.R2(), zhm.v.k(rentAndBillsManageLinkedPaymentsScreen2.O, rentAndBillsManageLinkedPaymentsScreen2.P, rentAndBillsManageLinkedPaymentsScreen2.Q, rentAndBillsManageLinkedPaymentsScreen2.R, rentAndBillsManageLinkedPaymentsScreen2.S, rentAndBillsManageLinkedPaymentsScreen2.T), R$id.rentAndBillsManageLinkedPayments_recyclerView, null, null, null, 56);
                    default:
                        RentAndBillsManageLinkedPaymentsScreen.Companion companion3 = RentAndBillsManageLinkedPaymentsScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(rentAndBillsManageLinkedPaymentsScreen.m2()).a().get(whc.z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", whc.z.class, " is not found"));
                        }
                        whc.z zVar = ((whc.z) aVar2.b()).f297622n;
                        RentAndBillsManageLinkedPaymentsScreenContract$InputData rentAndBillsManageLinkedPaymentsScreenContract$InputData = rentAndBillsManageLinkedPaymentsScreen.K;
                        rentAndBillsManageLinkedPaymentsScreenContract$InputData.getClass();
                        return new whc.v(zVar, rentAndBillsManageLinkedPaymentsScreen, rentAndBillsManageLinkedPaymentsScreenContract$InputData, rentAndBillsManageLinkedPaymentsScreen);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getM() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        t uiState = (t) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().f271365b;
        m mVar = uiState.f115314a;
        if (mVar instanceof l) {
            navBarWithBigTile.setLoadingState(true);
        } else if (mVar instanceof k) {
            navBarWithBigTile.setLoadingState(false);
        } else {
            if (!(mVar instanceof j)) {
                throw new NoWhenBranchMatchedException();
            }
            j jVar = (j) mVar;
            navBarWithBigTile.setLoadingState(false);
            navBarWithBigTile.setActionStatusLabel(jVar.f115304a);
            navBarWithBigTile.setTitle(new z0(jVar.f115305b, false));
            Clause clause = jVar.f115306c;
            if (clause != null) {
                navBarWithBigTile.setDescription(new au0.o0(clause));
            }
            navBarWithBigTile.setActions(jVar.d);
        }
        navBarWithBigTile.setMenuItems(uiState.f115316c ? u.c(new IconNavBarMenuItem("MORE_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_more, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.rent_and_bills_manage_linked_payments_bar_button_more, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)) : f0.f322471a);
    }

    @Override // mga.i0
    public final efm.r N0() {
        return this.R.f52437c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f271365b;
        navBarWithBigTile.setTitleStyle(b1.LARGE_SINGLE_LINE);
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY_SMALL_BUTTONS);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.NONE);
        navBarWithBigTile.setHeightMode(p2.f275222a);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        egc.a aVar = this.K.f84980a;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i2 = bkc.a.f16350a[aVar.ordinal()];
        if (i2 == 1) {
            i = R$drawable.uikit_icn_24_utilities;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_receipt;
        }
        navBarWithBigTile.setIcon(y.h(new Color.Solid(R$attr.uikit_colorAccentNeutral), 0.1f, companion, i, new Color.Solid(R$attr.uikit_colorForeground)), r0.DEFAULT);
    }

    @Override // mga.i0
    public final efm.r a2() {
        return this.Q.f53218h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // i7d.i
    public final koi.a b1() {
        return ((c) this.U.getValue()).w();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f271365b;
        ViewController.P2(this, rd0.e.b(navBarWithBigTile.f59357t), new v0(this, null, 5), 3);
        ViewController.P2(this, rd0.e.b(navBarWithBigTile.K()), new djc.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(navBarWithBigTile.b()), new d8j.c(this, (Continuation) null, 19), 3);
        ViewController.P2(this, rd0.e.b(this.S.d), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.f51821c), new djc.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.d.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53218h), new djc.h(this, null), 3);
    }

    public final thc.d d3() {
        ViewBinding value = this.V.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (thc.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final djc.s R2() {
        return (djc.s) this.N.getValue();
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f271364a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return controllerContainerCoordinatorLayout;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.U.getValue();
    }
}
