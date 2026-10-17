package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.date;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
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
import ql7.v;
import rd0.e;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import wo7.c;
import wo7.f;
import wo7.g;
import wo7.i;
import zhm.u;
import zl7.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/date/DateSelectorScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lwo7/g;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/date/DateSelectorScreenContract$InputData;", "Lwo7/f;", "Lno/m;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DateSelectorScreen extends BaseRecyclerViewScreen<g, DateSelectorScreenContract$InputData, f> implements m {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(DateSelectorScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenButtonWithFooterBinding;", 0))};
    public final /* synthetic */ a U;
    public final int V;
    public final int W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final DatePickerDelegate f75568a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f75569b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateSelectorScreen(DateSelectorScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = a.f323190a;
        this.V = R$layout.screen_button_with_footer;
        this.W = R$id.buttonWithFooter_recyclerView;
        this.X = s.t(this, wo7.a.f);
        this.Y = w.y0(new w83.a(this, inputData, 21));
        this.Z = w.y0(new vt3.a(this, 28));
        DatePickerDelegate datePickerDelegate = new DatePickerDelegate();
        this.f75568a0 = datePickerDelegate;
        this.f75569b0 = u.c(datePickerDelegate);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.U.getClass();
        return new AnalyticsProduct.Retail(a.f323191b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (v) this.Y.getValue();
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
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217058c.f59410q), null, new wo7.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217058c.o.f57403b), null, new c(this, continuation, 0), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75568a0.f52176c.f121375b), null, new c(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217057b.f0()), null, new wo7.b(this, continuation, i), 3);
        FooterActionButtonView buttonWithFooterButton = h3().f217057b;
        Intrinsics.checkNotNullExpressionValue(buttonWithFooterButton, "buttonWithFooterButton");
        if (!buttonWithFooterButton.isLaidOut() || buttonWithFooterButton.isLayoutRequested()) {
            buttonWithFooterButton.addOnLayoutChangeListener(new cli.u(this, 18));
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
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_policy_start_date_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = h3().f217058c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setMenuItems(u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "HINT_MENU_ITEM", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF95992b0() {
        return this.f75569b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(g uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        FooterActionButtonView footerActionButtonView = h3().f217057b;
        footerActionButtonView.setDescription(uiState.d);
        footerActionButtonView.setButtonText(uiState.f298903c);
        footerActionButtonView.setButtonEnabled(uiState.f298902b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.V;
    }

    public final nl7.e h3() {
        ViewBinding value = this.X.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nl7.e) value;
    }
}
