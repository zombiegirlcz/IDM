package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.estimated_value;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import pe2.c;
import po7.f;
import po7.g;
import rd0.e;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;
import zl7.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/car/estimated_value/EstimatedCarValuePickerScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lpo7/g;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/car/estimated_value/EstimatedCarValuePickerScreenContract$InputData;", "Lpo7/f;", "Lno/m;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EstimatedCarValuePickerScreen extends BaseRecyclerViewScreen<g, EstimatedCarValuePickerScreenContract$InputData, f> implements m {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f75552b0 = {o0.f186429a.j(new h0(EstimatedCarValuePickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ a U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final SingleChoiceDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f75553a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EstimatedCarValuePickerScreen(EstimatedCarValuePickerScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = a.f323190a;
        this.V = R$layout.screen_recycler_navbar;
        this.W = s.t(this, po7.a.f);
        this.X = w.y0(new c(this, inputData, 19));
        this.Y = w.y0(new pgk.f(this, 14));
        SingleChoiceDelegate singleChoiceDelegate = new SingleChoiceDelegate();
        this.Z = singleChoiceDelegate;
        this.f75553a0 = u.c(singleChoiceDelegate);
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
        return (ql7.h0) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (po7.h) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.W.getValue(this, f75552b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.f59410q), null, new po7.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.o.f57403b), null, new po7.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.p()), null, new po7.c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_estimated_car_value, null, null, 14);
        ViewBinding value = this.W.getValue(this, f75552b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setMenuItems(u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "HINT_MENU_ITEM", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.f75553a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.V;
    }
}
