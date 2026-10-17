package com.revolut.feature.insurance_embedded.impl.ui.screen.help;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.insurance_embedded.impl.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lu7.k0;
import te0.w;
import tx0.j0;
import vc.s;
import yff.b;
import yq0.e;
import yv7.a;
import yv7.c;
import yv7.d;
import yv7.g;
import yv7.h;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/help/EmbeddedInsuranceGetHelpScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lyv7/h;", "Lcom/revolut/feature/insurance_embedded/impl/ui/screen/help/EmbeddedInsuranceGetHelpScreenContract$InputData;", "Laii/q;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmbeddedInsuranceGetHelpScreen extends BaseRecyclerViewScreen<h, EmbeddedInsuranceGetHelpScreenContract$InputData, q> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f76135d0 = {o0.f186429a.j(new h0(EmbeddedInsuranceGetHelpScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final ao.h V;
    public final Object W;
    public final LargeActionButtonDelegate X;
    public final BannerDelegate Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f76136a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final boolean f76137b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedInsuranceGetHelpScreen(EmbeddedInsuranceGetHelpScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = s.t(this, a.f);
        this.W = w.y0(new b(this, inputData, 28));
        this.X = new LargeActionButtonDelegate();
        BannerDelegate bannerDelegate = new BannerDelegate();
        this.Y = bannerDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Z = rowDelegate;
        this.f76136a0 = w.y0(new e(this, 13));
        this.f76137b0 = true;
        this.c0 = v.k(bannerDelegate, rowDelegate, new ListSubheaderDelegate(), new RowLoadingDelegate(), new CounterTextDelegate(), new TextDelegate(), new FullScreenStateDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (k0) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.f76136a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        j60.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        k0 k0Var = (k0) this.W.getValue();
        switch (k0Var.f200126a) {
            case 0:
                aVar = (j60.a) k0Var.e.get();
                break;
            default:
                aVar = (j60.a) k0Var.e.get();
                break;
        }
        LargeActionButtonDelegate largeActionButtonDelegate = this.X;
        aVar.d(u.c(largeActionButtonDelegate));
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174565c.f59410q), null, new yv7.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(largeActionButtonDelegate.d.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Y.f51699c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Z.f53218h), null, new yv7.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174564b.o), null, new yv7.b(this, continuation, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.embedded_insurance_action_get_help, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(((EmbeddedInsuranceGetHelpScreenContract$InputData) this.G).f76140c));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        h3().f174564b.setText(new TextLocalisedClause(R$string.embedded_insurance_details_make_a_claim, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(h uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        LargeActionButton goToButton = h3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.f317130b ? 0 : 8);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.U;
    }

    public final jii.u h3() {
        ViewBinding value = this.V.getValue(this, f76135d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f76137b0);
    }
}
