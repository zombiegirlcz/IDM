package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.search;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.u;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$id;
import com.revolut.feature.insurance_car.impl.R$layout;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import ql7.p;
import rd0.e;
import sji.b;
import te0.w;
import tx0.j0;
import uo7.c;
import uo7.d;
import uo7.f;
import uo7.i;
import uo7.j;
import vc.s;
import zhm.v;
import zl7.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/car/search/CarSearchScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Luo7/j;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/car/search/CarSearchScreenContract$InputData;", "Luo7/f;", "Lno/m;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CarSearchScreen extends BaseRecyclerViewScreen<j, CarSearchScreenContract$InputData, f> implements m {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(CarSearchScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenButtonWithFooterBinding;", 0))};
    public final /* synthetic */ a U;
    public final int V;
    public final h W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final InputTextDelegate f75564a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f75565b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarSearchScreen(CarSearchScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = a.f323190a;
        this.V = R$layout.screen_button_with_footer;
        this.W = s.t(this, uo7.a.f);
        this.X = R$id.buttonWithFooter_recyclerView;
        this.Y = w.y0(new uj7.a(this, inputData, 9));
        this.Z = w.y0(new tyl.a(this, 23));
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.f75564a0 = inputTextDelegate;
        this.f75565b0 = v.k(inputTextDelegate, new RowDelegate(null, null, 7));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getU() {
        this.U.getClass();
        return new AnalyticsProduct.Retail(a.f323191b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (p) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217058c.f59410q), null, new uo7.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217058c.o.f57403b), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75564a0.e.f121375b), null, new d(this, null), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217057b.i), null, new c(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217057b.f0()), null, new uo7.b(this, continuation, i), 3);
        FooterActionButtonView buttonWithFooterButton = h3().f217057b;
        Intrinsics.checkNotNullExpressionValue(buttonWithFooterButton, "buttonWithFooterButton");
        if (!buttonWithFooterButton.isLaidOut() || buttonWithFooterButton.isLayoutRequested()) {
            buttonWithFooterButton.addOnLayoutChangeListener(new u(this, 17));
            return;
        }
        ScreenContentRecyclerView buttonWithFooterRecyclerView = h3().d;
        Intrinsics.checkNotNullExpressionValue(buttonWithFooterRecyclerView, "buttonWithFooterRecyclerView");
        knm.b.v(buttonWithFooterButton.getHeight(), buttonWithFooterRecyclerView);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f217058c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_car_search_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setMenuItems(zhm.u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "CAR_SEARCH_HELP_MENU", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        h3().f217057b.setButtonText(new TextLocalisedClause(R$string.car_insurance_common_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getY() {
        return this.f75565b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f217057b.setButtonEnabled(uiState.f281579c);
        h3().f217057b.setDescription(uiState.f281578b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.V;
    }

    public final nl7.e h3() {
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nl7.e) value;
    }
}
