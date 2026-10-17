package com.revolut.feature.cash_topup.impl.ui.map;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.buttons.SearchButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cash_topup.impl.R$layout;
import com.revolut.feature.cash_topup.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ihm.f;
import java.util.List;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.p5;
import mx0.t9;
import o9h.b;
import oc3.c;
import oc3.d;
import oc3.g;
import oc3.m;
import oc3.n;
import oc3.p;
import oc3.r;
import ofm.h;
import or0.u;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import tx0.d0;
import vc.s;
import yp0.y;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/map/CashTopUpLocationsMapScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Loc3/r;", "Lcom/revolut/feature/cash_topup/impl/ui/map/CashTopUpLocationsMapScreenContract$InputData;", "Loc3/m;", "Companion", "a", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashTopUpLocationsMapScreen extends BaseScreen<r, CashTopUpLocationsMapScreenContract$InputData, m> {
    public r M;
    public boolean N;
    public ah0.a O;
    public h P;
    public final ao.h Q;
    public final NotificationCentreItemDelegate R;
    public final RowDelegate S;
    public final ScrollerDelegate T;
    public final j U;
    public final List V;
    public final b W;
    public final int X;
    public final Lazy Y;
    public final Lazy Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f65677a0 = {o0.f186429a.j(new h0(CashTopUpLocationsMapScreen.class, "binding", "getBinding()Lcom/revolut/feature/cash_topup/impl/databinding/ScreenCashTopupLocationsBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashTopUpLocationsMapScreen(CashTopUpLocationsMapScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = s.t(this, c.f);
        NotificationCentreItemDelegate notificationCentreItemDelegate = new NotificationCentreItemDelegate();
        this.R = notificationCentreItemDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.S = rowDelegate;
        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
        ScrollerDelegate scrollerDelegate = new ScrollerDelegate(v.k(notificationCentreItemDelegate, rowLoadingDelegate), false);
        this.T = scrollerDelegate;
        this.U = new j(7, v.k(scrollerDelegate, notificationCentreItemDelegate), false);
        this.V = v.k(rowDelegate, rowLoadingDelegate);
        this.W = new b(this, 9);
        this.X = R$layout.screen_cash_topup_locations;
        this.Y = yhm.j.b(new oa2.b(this, inputData, 4));
        this.Z = yhm.j.b(new oc3.a(this, 0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (mb3.r) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (!this.N) {
            pfm.h hVarL0 = c3().l0();
            h hVar = new h(new i1i.a(this, 26));
            hVarL0.d(hVar);
            this.P = hVar;
        }
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(c3().f58773m), null, new g(this, continuation, 1), 3);
        f fVar = c3().k;
        Intrinsics.checkNotNullExpressionValue(fVar, "let(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(fVar), null, new g(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(e3().f59002m), null, new oc3.e(this, continuation, 1), 3);
        FormsActionButton cashTopUpLocationsFab = a3().f182512c;
        Intrinsics.checkNotNullExpressionValue(cashTopUpLocationsFab, "cashTopUpLocationsFab");
        com.revolut.kompot.navigable.a.g2(this, e.b(cashTopUpLocationsFab.f58987s), null, new oc3.e(this, continuation, 2), 3);
        int i = 3;
        com.revolut.kompot.navigable.a.g2(this, e.b(f3().f56386h), null, new oc3.e(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.R.f52865c), null, new g(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.T.q()), null, new g(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.S.f53218h), null, new d(this, null), 3);
        BasicNavBar cashTopUpLocationsNavBar = a3().f;
        Intrinsics.checkNotNullExpressionValue(cashTopUpLocationsNavBar, "cashTopUpLocationsNavBar");
        int i2 = 0;
        com.revolut.kompot.navigable.a.g2(this, e.b(cashTopUpLocationsNavBar.f59211b), null, new oc3.e(this, continuation, i2), 3);
        efm.r<cr0.h> rVarStartWith = b3().getStateChangeEvents().startWith(b3().getState());
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarStartWith), null, new g(this, continuation, i2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        e3().setText(new TextLocalisedClause(R$string.topup_cash_search_hint, null, null, 14));
        ScreenContentRecyclerView cashTopUpLocationsLocationsRv = a3().d;
        Intrinsics.checkNotNullExpressionValue(cashTopUpLocationsLocationsRv, "cashTopUpLocationsLocationsRv");
        y.h(cashTopUpLocationsLocationsRv, this.U, new LinearLayoutManager(cashTopUpLocationsLocationsRv.getContext()));
        BasicNavBar cashTopUpLocationsNavBar = a3().f;
        Intrinsics.checkNotNullExpressionValue(cashTopUpLocationsNavBar, "cashTopUpLocationsNavBar");
        cashTopUpLocationsNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        cashTopUpLocationsNavBar.setBackground(d0.TRANSPARENT);
        FormsActionButton cashTopUpLocationsFab = a3().f182512c;
        Intrinsics.checkNotNullExpressionValue(cashTopUpLocationsFab, "cashTopUpLocationsFab");
        cashTopUpLocationsFab.f(FormsActionButton.a.b.f58990a);
        BottomExpandableDialogView bottomExpandableDialogViewB3 = b3();
        bottomExpandableDialogViewB3.setSupportBackButtonHideDialog(false);
        bottomExpandableDialogViewB3.setupDialog(new BottomExpandableDialogView.b.a(0, (p5) null, 7));
        BottomExpandableDialogView.setupRecyclerView$default(bottomExpandableDialogViewB3, this.V, (RecyclerView.ItemAnimator) null, 2, (Object) null);
        bottomExpandableDialogViewB3.setCloseAutomaticallyByChevron(false);
        bottomExpandableDialogViewB3.setHasCollapsedState(true);
        bottomExpandableDialogViewB3.setHasExpandedState(false);
        bottomExpandableDialogViewB3.setHideable(false);
        bottomExpandableDialogViewB3.r0(cr0.h.COLLAPSED, false);
        u.a(view, this.W);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void X2() {
        u.q(D2(), this.W);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void Y2() {
        tri.c cVarA = ue8.c.A(m2());
        if (cVarA != null) {
            cVarA.b(this);
        }
        h hVar = this.P;
        if (hVar != null) {
            lfm.d.a(hVar);
        }
        this.P = null;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void Z2(r uiState, o oVar) {
        int i;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (!this.N) {
            this.M = uiState;
            return;
        }
        p pVar = oVar instanceof p ? (p) oVar : null;
        if (pVar == null || pVar.f224076b) {
            if (this.O == null && uiState.f224080c != null) {
                c3().g0(uiState.f224080c, 15.0f, false);
            }
            this.O = uiState.f224080c;
        }
        if (pVar == null || pVar.f224075a) {
            c3().setMarkers(new t9(uiState.f224078a, true));
        }
        if (pVar == null || pVar.d) {
            this.U.c(uiState.d);
        }
        if (pVar == null || pVar.f224077c) {
            FormsActionButton cashTopUpLocationsFab = a3().f182512c;
            Intrinsics.checkNotNullExpressionValue(cashTopUpLocationsFab, "cashTopUpLocationsFab");
            cashTopUpLocationsFab.setClickable(!uiState.f224079b);
            boolean z = uiState.f224079b;
            if (z) {
                i = R$drawable.uikit_icn_24_location_arrow;
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_location_arrow_outline;
            }
            int i2 = i;
            FormsActionButton cashTopUpLocationsFab2 = a3().f182512c;
            Intrinsics.checkNotNullExpressionValue(cashTopUpLocationsFab2, "cashTopUpLocationsFab");
            cashTopUpLocationsFab2.setImage(new ResourceImage(i2, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246));
        }
        if (pVar == null || pVar.e) {
            Fade fade = new Fade();
            fade.addTarget(f3());
            fade.addTarget(e3());
            TransitionManager.beginDelayedTransition((ViewGroup) D2(), fade);
            int i3 = oc3.b.f224056a[uiState.e.ordinal()];
            if (i3 == 1) {
                f3().setVisibility(0);
                e3().setVisibility(4);
                f3().setText(null);
                f3().setIcon(new AnimatedResourceImage(R$drawable.uikit_icn_18_loading_dots, 10, (Clause) null, (Integer) null));
            } else if (i3 == 2) {
                f3().setVisibility(4);
                e3().setVisibility(0);
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f3().setText(new TextLocalisedClause(R$string.topup_cash_map_search_this_area, null, null, 14));
                f3().setIcon(new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
                f3().setVisibility(0);
                e3().setVisibility(4);
            }
        }
        if (pVar == null || pVar.f) {
            BottomExpandableDialogView bottomExpandableDialogViewB3 = b3();
            oc3.o oVar2 = uiState.f;
            bottomExpandableDialogViewB3.setItems(oVar2.f224074b, oVar2.f224073a);
        }
    }

    public final kb3.a a3() {
        ViewBinding value = this.Q.getValue(this, f65677a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (kb3.a) value;
    }

    public final BottomExpandableDialogView b3() {
        BottomExpandableDialogView cashTopUpLocationsBottomView = a3().f182511b;
        Intrinsics.checkNotNullExpressionValue(cashTopUpLocationsBottomView, "cashTopUpLocationsBottomView");
        return cashTopUpLocationsBottomView;
    }

    public final MapView c3() {
        MapView cashTopUpLocationsMap = a3().e;
        Intrinsics.checkNotNullExpressionValue(cashTopUpLocationsMap, "cashTopUpLocationsMap");
        return cashTopUpLocationsMap;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final n T2() {
        return (n) this.Z.getValue();
    }

    public final SearchButton e3() {
        SearchButton cashTopUpLocationsSearchButton = a3().f182513g;
        Intrinsics.checkNotNullExpressionValue(cashTopUpLocationsSearchButton, "cashTopUpLocationsSearchButton");
        return cashTopUpLocationsSearchButton;
    }

    public final SmallActionButton f3() {
        SmallActionButton cashTopUpLocationsSmallAction = a3().f182514h;
        Intrinsics.checkNotNullExpressionValue(cashTopUpLocationsSmallAction, "cashTopUpLocationsSmallAction");
        return cashTopUpLocationsSmallAction;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.X;
    }
}
