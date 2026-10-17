package com.revolut.feature.donations.impl.ui.kompot.screen.amount_suggestion;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.BigTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.u;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rb6.a;
import rb6.c;
import rb6.d;
import rb6.g;
import rb6.i;
import rb6.j;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/screen/amount_suggestion/AmountSuggestionScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lrb6/j;", "Lcom/revolut/feature/donations/impl/ui/kompot/screen/amount_suggestion/AmountSuggestionScreenContract$InputData;", "Lrb6/g;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AmountSuggestionScreen extends BaseRecyclerViewScreen<j, AmountSuggestionScreenContract$InputData, g> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f72055e0 = {o0.f186429a.j(new h0(AmountSuggestionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final AttributeSelectorSmallDelegate f72056a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final FullScreenStateDelegate f72057b0;
    public final LargeActionButtonDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f72058d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountSuggestionScreen(AmountSuggestionScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = R$id.recyclerView;
        this.W = s.t(this, a.f);
        this.X = true;
        this.Y = w.y0(new qvf.a(this, inputData, 23));
        this.Z = w.y0(new r1a.a(this, 7));
        AttributeSelectorSmallDelegate attributeSelectorSmallDelegate = new AttributeSelectorSmallDelegate();
        this.f72056a0 = attributeSelectorSmallDelegate;
        BigTileDelegate bigTileDelegate = new BigTileDelegate();
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f72057b0 = fullScreenStateDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.c0 = largeActionButtonDelegate;
        this.f72058d0 = v.k(bigTileDelegate, fullScreenStateDelegate, largeActionButtonDelegate, new ScrollerDelegate(v.k(attributeSelectorSmallDelegate, new AttributeSelectorSmallLoadingDelegate()), false), new BigTileLoadingDelegate(), new ListSubheaderDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (pa6.a) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f72056a0.p()), null, new rb6.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f72057b0.f52371h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.d.f121375b), null, new d(this, null), 3);
        u uVarH3 = h3();
        com.revolut.kompot.navigable.a.g2(this, e.b(uVarH3.f174564b.o), null, new rb6.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(uVarH3.f174565c.f59410q), null, new rb6.e(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        u uVarH3 = h3();
        NavBarWithToolbar navBarWithToolbar = uVarH3.f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.j0(false);
        uVarH3.f174564b.setText(new TextLocalisedClause(R$string.donations_suggested_amounts_button_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF72058d0() {
        return this.f72058d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        u uVarH3 = h3();
        NavBarWithToolbar navBarWithToolbar = uVarH3.f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(uiState.d));
        Clause clause = uiState.f252967b;
        navBarWithToolbar.setTitle(clause, null);
        if (clause != null) {
            navBarWithToolbar.setToolbarTitle(clause);
        }
        uVarH3.f174564b.setEnabled(uiState.f252968c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    public final u h3() {
        ViewBinding value = this.W.getValue(this, f72055e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final i T2() {
        return (i) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
