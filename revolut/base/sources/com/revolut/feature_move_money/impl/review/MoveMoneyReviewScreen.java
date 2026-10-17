package com.revolut.feature_move_money.impl.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_move_money.impl.R$id;
import com.revolut.feature_move_money.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import efm.r;
import fx5.a;
import g8i.i;
import g8i.j;
import g8i.k;
import g8i.l;
import g8i.m;
import g8i.o;
import g8i.p;
import g8i.q;
import g8i.u;
import g8i.w;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l8i.c;
import mga.i0;
import rd0.e;
import sji.b;
import u7i.n;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_move_money/impl/review/MoveMoneyReviewScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lg8i/w;", "Lcom/revolut/feature_move_money/impl/review/MoveMoneyReviewScreenContract$InputData;", "Lg8i/u;", "Lmga/i0;", "Ll8i/c;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoveMoneyReviewScreen extends BaseRecyclerViewScreen<w, MoveMoneyReviewScreenContract$InputData, u> implements i0, c {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(MoveMoneyReviewScreen.class, "binding", "getBinding()Lcom/revolut/feature_move_money/impl/databinding/ScreenMoveMoneyReviewBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final Object X;
    public final RowDelegate Y;
    public final HighlightTileDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final CellDetailsActionDelegate f97405a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final CellDetailsDelegate f97406b0;
    public final TextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final SuggestionsBarDelegate f97407d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final CellDetailsNoteDelegate f97408e0;
    public final PlainTextWarningDelegate f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final List f97409h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoveMoneyReviewScreen(MoveMoneyReviewScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_move_money_review;
        this.V = true;
        this.W = s.t(this, i.f);
        this.X = te0.w.y0(new a(this, inputData, 16));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Y = rowDelegate;
        HighlightTileDelegate highlightTileDelegate = new HighlightTileDelegate();
        this.Z = highlightTileDelegate;
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        this.f97405a0 = cellDetailsActionDelegate;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.f97406b0 = cellDetailsDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.c0 = textDelegate;
        SuggestionsBarDelegate suggestionsBarDelegate = new SuggestionsBarDelegate();
        this.f97407d0 = suggestionsBarDelegate;
        CellDetailsNoteDelegate cellDetailsNoteDelegate = new CellDetailsNoteDelegate();
        this.f97408e0 = cellDetailsNoteDelegate;
        PlainTextWarningDelegate plainTextWarningDelegate = new PlainTextWarningDelegate();
        this.f0 = plainTextWarningDelegate;
        this.g0 = te0.w.y0(new g8i.h(this, 0));
        this.f97409h0 = v.k(new ListCellDelegate(), new RowLoadingDelegate(), cellDetailsDelegate, cellDetailsActionDelegate, textDelegate, suggestionsBarDelegate, new ListSubheaderDelegate(), plainTextWarningDelegate, rowDelegate, highlightTileDelegate, cellDetailsNoteDelegate);
    }

    @Override // mga.i0
    public final r N0() {
        return this.Z.f52437c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (n) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f260847b.f59410q), null, new k(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b((f) h3().f260847b.f59406n.f258290b), null, new l(this, continuation, 0), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f260848c.o0()), null, new k(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f260848c.f59017j), null, new l(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.d), null, new l(this, continuation, 2), 3);
        CellDetailsActionDelegate cellDetailsActionDelegate = this.f97405a0;
        com.revolut.kompot.navigable.a.g2(this, e.b(cellDetailsActionDelegate.d), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(cellDetailsActionDelegate.f51780c), null, new g8i.n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f97407d0.p().d), null, new o(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f97406b0.d), null, new p(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f97408e0.d), null, new j(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f260847b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // mga.i0
    public final r a2() {
        return this.Y.f53218h;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF90107b0() {
        return this.f97409h0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3 */
    public final int getV() {
        return R$id.moveMoneyReview_recyclerView;
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = h3().f260846a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return controllerContainerCoordinatorLayout;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(w uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        TwinVerticalButton twinVerticalButton = h3().f260848c;
        q qVar = uiState.f141399b;
        g8i.s sVar = uiState.f141400c;
        Clause clause = sVar.f141394c;
        twinVerticalButton.setMainButtonText(qVar.f141383a);
        twinVerticalButton.setMainButtonEnabled(true);
        twinVerticalButton.setSecondaryButtonVisible(false);
        twinVerticalButton.setMainButtonLoadingTag("MOVE_MONEY_REVIEW_SCREEN_CTA_TAG");
        boolean z = qVar.f141384b != null;
        twinVerticalButton.setDescriptionVisibility(z ? 0 : 8);
        TwinVerticalButton.setDescription$default(twinVerticalButton, qVar.f141384b, null, null, 6, null);
        twinVerticalButton.setGradientBackgroundEnabled(z);
        NavBarWithToolbar navBarWithToolbar = h3().f260847b;
        navBarWithToolbar.l0();
        navBarWithToolbar.setTitle(sVar.f141392a, null);
        navBarWithToolbar.setDescriptionText(sVar.f141393b);
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setEndIconImage(sVar.d);
        navBarWithToolbar.setHeaderDisclaimerSticky(sVar.e);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    public final s7i.c h3() {
        ViewBinding value = this.W.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (s7i.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final g8i.v T2() {
        return (g8i.v) this.g0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
