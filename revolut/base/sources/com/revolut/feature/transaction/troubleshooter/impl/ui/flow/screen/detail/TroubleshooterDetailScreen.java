package com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.detail;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.detail.TroubleshooterDetailScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import h30.l;
import java.util.List;
import jii.t;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l7d.a;
import no.k;
import no.m;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import wff.b;
import wff.d;
import wff.f;
import wff.g;
import wff.i;
import wff.j;
import wff.n;
import wff.p;
import wff.q;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/transaction/troubleshooter/impl/ui/flow/screen/detail/TroubleshooterDetailScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lwff/q;", "Lcom/revolut/feature/transaction/troubleshooter/impl/ui/flow/screen/detail/TroubleshooterDetailScreenContract$InputData;", "Lwff/n;", "Lno/k;", "Lno/m;", "feature_troubleshooter_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TroubleshooterDetailScreen extends BaseRecyclerViewScreen<q, TroubleshooterDetailScreenContract$InputData, n> implements k, m {
    public static final /* synthetic */ KProperty[] l0 = {o0.f186429a.j(new h0(TroubleshooterDetailScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterTwoButtonsBinding;", 0))};
    public final h U;
    public final RowDelegate V;
    public final PlainTextDelegate W;
    public final CellDetailsChevronDelegate X;
    public final LargeActionButtonDelegate Y;
    public final ActionsDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ActionsLoadingDelegate f91878a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ListSubheaderDelegate f91879b0;
    public final InputTextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public AnalyticsContext f91880d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final AnalyticsProduct.Shared f91881e0;
    public final boolean f0;
    public final int g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int f91882h0;
    public final Object i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f91883k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TroubleshooterDetailScreen(TroubleshooterDetailScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, b.f);
        this.V = new RowDelegate(null, null, 7);
        this.W = new PlainTextDelegate();
        this.X = new CellDetailsChevronDelegate();
        this.Y = new LargeActionButtonDelegate();
        this.Z = new ActionsDelegate();
        this.f91878a0 = new ActionsLoadingDelegate();
        this.f91879b0 = new ListSubheaderDelegate();
        this.c0 = new InputTextDelegate(null);
        this.f91880d0 = a.d(4, inputData.f91884a, inputData.f91885b.f91842c);
        this.f91881e0 = new AnalyticsProduct.Shared(k9.HelpCenter, x0.HelpCenter, q6.HelpCenter, w2.HelpCenter, od.Terminal);
        this.f0 = true;
        this.g0 = R$layout.screen_recycler_navbar_footer_two_buttons;
        this.f91882h0 = R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView;
        final int i = 0;
        this.i0 = w.y0(new Function0(this) { // from class: wff.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TroubleshooterDetailScreen f297086b;

            {
                this.f297086b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TroubleshooterDetailScreen troubleshooterDetailScreen = this.f297086b;
                switch (i2) {
                    case 0:
                        return zhm.v.k(troubleshooterDetailScreen.W, troubleshooterDetailScreen.V, troubleshooterDetailScreen.Y, troubleshooterDetailScreen.X, troubleshooterDetailScreen.Z, troubleshooterDetailScreen.f91878a0);
                    default:
                        KProperty[] kPropertyArr = TroubleshooterDetailScreen.l0;
                        return (o) ((off.b) troubleshooterDetailScreen.j0.getValue()).f224821j.get();
                }
            }
        });
        this.j0 = w.y0(new w83.a(this, inputData, 13));
        final int i2 = 1;
        this.f91883k0 = w.y0(new Function0(this) { // from class: wff.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TroubleshooterDetailScreen f297086b;

            {
                this.f297086b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TroubleshooterDetailScreen troubleshooterDetailScreen = this.f297086b;
                switch (i22) {
                    case 0:
                        return zhm.v.k(troubleshooterDetailScreen.W, troubleshooterDetailScreen.V, troubleshooterDetailScreen.Y, troubleshooterDetailScreen.X, troubleshooterDetailScreen.Z, troubleshooterDetailScreen.f91878a0);
                    default:
                        KProperty[] kPropertyArr = TroubleshooterDetailScreen.l0;
                        return (o) ((off.b) troubleshooterDetailScreen.j0.getValue()).f224821j.get();
                }
            }
        });
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f91880d0 = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getX() {
        return this.f91881e0;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getF91880d0() {
        return this.f91880d0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (off.b) this.j0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        NavBarWithToolbar screenRecyclerNavbarFooterTwoButtonsToolbar = h3().f174562g;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsToolbar, "screenRecyclerNavbarFooterTwoButtonsToolbar");
        com.revolut.kompot.navigable.a.g2(this, e.b(screenRecyclerNavbarFooterTwoButtonsToolbar.f59410q), null, new g(this, null, 2), 3);
        NavBarWithToolbar screenRecyclerNavbarFooterTwoButtonsToolbar2 = h3().f174562g;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsToolbar2, "screenRecyclerNavbarFooterTwoButtonsToolbar");
        com.revolut.kompot.navigable.a.g2(this, e.b(screenRecyclerNavbarFooterTwoButtonsToolbar2.o.f57403b), null, new d(this, null, 2), 3);
        LargeActionButtonDelegate largeActionButtonDelegate = this.Y;
        com.revolut.kompot.navigable.a.g2(this, l.y(largeActionButtonDelegate.d.f121375b, this.X.f51821c, "merge(...)"), null, new d(this, null, 3), 3);
        RowDelegate rowDelegate = this.V;
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53218h), null, new wff.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53220l), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53226s), null, new d(this, null, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.i), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53219j), null, new wff.k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new wa3.d(e.b(this.W.d.f121375b), 3), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.f51611c.f121375b), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(largeActionButtonDelegate.d.f121375b), null, new wff.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.e.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174560b.o), null, new g(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f.o), null, new g(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar screenRecyclerNavbarFooterTwoButtonsToolbar = h3().f174562g;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsToolbar, "screenRecyclerNavbarFooterTwoButtonsToolbar");
        screenRecyclerNavbarFooterTwoButtonsToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        screenRecyclerNavbarFooterTwoButtonsToolbar.setHeaderTitleMode(j0.MULTILINE);
        ((j60.a) ((off.b) this.j0.getValue()).d.get()).d(v.k(this.Z, this.f91879b0, this.c0, this.Y, new ActionsLoadingDelegate(), new LargeActionButtonLoadingDelegate()));
        t tVarH3 = h3();
        tVarH3.d.setVisibility(8);
        tVarH3.f174560b.setVisibility(8);
        tVarH3.f.setVisibility(8);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF72103d0() {
        return (List) this.i0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getF91882h0() {
        return this.f91882h0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(q uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar screenRecyclerNavbarFooterTwoButtonsToolbar = h3().f174562g;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsToolbar, "screenRecyclerNavbarFooterTwoButtonsToolbar");
        TextClause textClause = uiState.f297100b;
        wff.l lVar = uiState.e;
        screenRecyclerNavbarFooterTwoButtonsToolbar.setToolbarTitle(textClause);
        screenRecyclerNavbarFooterTwoButtonsToolbar.setTitle(textClause, null);
        TextClause textClause2 = uiState.f297101c;
        screenRecyclerNavbarFooterTwoButtonsToolbar.setDescriptionVisible(textClause2 != null);
        screenRecyclerNavbarFooterTwoButtonsToolbar.setDescriptionText(textClause2);
        screenRecyclerNavbarFooterTwoButtonsToolbar.setMenuItems(uiState.d);
        LargeActionButton screenRecyclerNavbarFooterTwoButtonsFirstButton = h3().f174560b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsFirstButton, "screenRecyclerNavbarFooterTwoButtonsFirstButton");
        p pVar = lVar.f297089a;
        if (pVar == null) {
            screenRecyclerNavbarFooterTwoButtonsFirstButton.setVisibility(8);
        } else {
            screenRecyclerNavbarFooterTwoButtonsFirstButton.setVisibility(0);
            screenRecyclerNavbarFooterTwoButtonsFirstButton.setText(pVar.f297096a);
            screenRecyclerNavbarFooterTwoButtonsFirstButton.o(pVar.f297097b);
            screenRecyclerNavbarFooterTwoButtonsFirstButton.setAnalyticsContext(pVar.f297098c);
        }
        LargeActionButton screenRecyclerNavbarFooterTwoButtonsSecondButton = h3().f;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsSecondButton, "screenRecyclerNavbarFooterTwoButtonsSecondButton");
        p pVar2 = lVar.f297090b;
        if (pVar2 == null) {
            screenRecyclerNavbarFooterTwoButtonsSecondButton.setVisibility(8);
        } else {
            screenRecyclerNavbarFooterTwoButtonsSecondButton.setVisibility(0);
            screenRecyclerNavbarFooterTwoButtonsSecondButton.setText(pVar2.f297096a);
            screenRecyclerNavbarFooterTwoButtonsSecondButton.o(pVar2.f297097b);
            screenRecyclerNavbarFooterTwoButtonsSecondButton.setAnalyticsContext(pVar2.f297098c);
        }
        knm.b.v(kli.a.k(m2(), lVar.f297091c), h());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.g0;
    }

    public final t h3() {
        ViewBinding value = this.U.getValue(this, l0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (t) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final wff.o T2() {
        return (wff.o) this.f91883k0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f0);
    }
}
