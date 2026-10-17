package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.u;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
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
import nn7.d;
import no.m;
import no7.c;
import no7.h;
import no7.i;
import no7.j;
import ql7.k;
import rd0.e;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;
import zl7.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/car/confirmation/CarConfirmationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lno7/j;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/car/confirmation/CarConfirmationScreenContract$InputData;", "Lno7/h;", "Lno/m;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CarConfirmationScreen extends BaseRecyclerViewScreen<j, CarConfirmationScreenContract$InputData, h> implements m {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f75547e0 = {o0.f186429a.j(new h0(CarConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenButtonWithFooterBinding;", 0))};
    public final /* synthetic */ a U;
    public final int V;
    public final int W;
    public final ao.h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final PlainTextDelegate f75548a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f75549b0;
    public final InputTextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f75550d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarConfirmationScreen(CarConfirmationScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = a.f323190a;
        this.V = R$layout.screen_button_with_footer;
        this.W = R$id.buttonWithFooter_recyclerView;
        this.X = s.t(this, no7.a.f);
        this.Y = w.y0(new ni1.a(this, inputData, 15));
        this.Z = w.y0(new nmm.h(this, 10));
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        this.f75548a0 = plainTextDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f75549b0 = rowDelegate;
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.c0 = inputTextDelegate;
        this.f75550d0 = v.k(plainTextDelegate, rowDelegate, inputTextDelegate);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        this.U.getClass();
        return new AnalyticsProduct.Retail(a.f323191b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (k) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217058c.f59410q), null, new no7.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217057b.f0()), null, new no7.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217057b.i), null, new no7.b(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75548a0.d.f121375b), null, new d(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75549b0.f53218h), null, new c(this, null), 3);
        InputTextDelegate inputTextDelegate = this.c0;
        com.revolut.kompot.navigable.a.g2(this, e.b(inputTextDelegate.f52575g.f121375b), null, new no7.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(inputTextDelegate.i.f121375b), null, new no7.e(this, null), 3);
        FooterActionButtonView buttonWithFooterButton = h3().f217057b;
        Intrinsics.checkNotNullExpressionValue(buttonWithFooterButton, "buttonWithFooterButton");
        if (!buttonWithFooterButton.isLaidOut() || buttonWithFooterButton.isLayoutRequested()) {
            buttonWithFooterButton.addOnLayoutChangeListener(new u(this, 12));
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
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_car_confirmation_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        h3().f217057b.setButtonText(new TextLocalisedClause(R$string.car_insurance_common_yes_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF78921e0() {
        return this.f75550d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getU() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f217057b.setDescription(uiState.f217939b);
        h3().f217057b.setButtonEnabled(uiState.f217940c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getZ() {
        return this.V;
    }

    public final nl7.e h3() {
        ViewBinding value = this.X.getValue(this, f75547e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nl7.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final i T2() {
        return (i) this.Z.getValue();
    }
}
