package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.details;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.insurance_car.impl.R$id;
import com.revolut.feature.insurance_car.impl.R$layout;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import ql7.w1;
import rd0.e;
import te0.w;
import tl7.f;
import tx0.j0;
import vc.s;
import y99.c;
import yi3.d;
import yma.r;
import yo7.b;
import yo7.g;
import yo7.i;
import yo7.k;
import yo7.l;
import zhm.v;
import zl7.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/driver/details/AdditionalDriverDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lyo7/l;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/driver/details/AdditionalDriverDetailsScreenContract$InputData;", "Lyo7/i;", "Lno/m;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalDriverDetailsScreen extends BaseRecyclerViewScreen<l, AdditionalDriverDetailsScreenContract$InputData, i> implements m {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f75571d0 = {o0.f186429a.j(new h0(AdditionalDriverDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenAdditionalDriverDetailsBinding;", 0))};
    public final /* synthetic */ a U;
    public final int V;
    public final h W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final InputTextDelegate f75572a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ActionsDelegate f75573b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalDriverDetailsScreen(AdditionalDriverDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = a.f323190a;
        this.V = R$layout.screen_additional_driver_details;
        this.W = s.t(this, b.f);
        this.X = R$id.driverDetails_recyclerView;
        this.Y = w.y0(new yff.b(this, inputData, 13));
        this.Z = w.y0(new c(this, 28));
        InputTextDelegate inputTextDelegate = new InputTextDelegate(new d(this, 8));
        this.f75572a0 = inputTextDelegate;
        ActionsDelegate actionsDelegate = new ActionsDelegate();
        this.f75573b0 = actionsDelegate;
        this.c0 = v.k(inputTextDelegate, actionsDelegate, new ListSubheaderDelegate(), new RowDelegate(null, null, 7), new TextDelegate(), new ListCellDelegate());
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        yo7.s sVar = (yo7.s) T2();
        if (!sVar.f315635s || sVar.f315633q.f272009c.j() || sVar.t2().equals(sVar.f315634r)) {
            return super.F2();
        }
        f.S(sVar.f315633q, R$string.car_insurance_common_are_you_sure, R$string.car_insurance_create_driver_warning_close, 0, new yo7.m(sVar, 0), 12);
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        this.U.getClass();
        return new AnalyticsProduct.Retail(a.f323191b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (w1) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217047c.f59410q), null, new yo7.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217046b.o0()), null, new yo7.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217046b.p0()), null, new yo7.c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217046b.m0()), null, new yo7.c(this, continuation, 3), 3);
        InputTextDelegate inputTextDelegate = this.f75572a0;
        com.revolut.kompot.navigable.a.g2(this, e.b(inputTextDelegate.f52575g.f121375b), null, new yo7.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(inputTextDelegate.i.f121375b), null, new yo7.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(inputTextDelegate.e.f121375b), null, new yo7.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75573b0.f51611c.f121375b), null, new g(this, null), 3);
        View viewFindViewById = m2().findViewById(com.revolut.kompot.R$id.mainContainer);
        if (viewFindViewById != null) {
            ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new r(this, 21));
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f217047c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(((AdditionalDriverDetailsScreenContract$InputData) this.G).f75575b));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        TwinVerticalButton twinVerticalButton = h3().f217046b;
        twinVerticalButton.setMainButtonVisible(false);
        twinVerticalButton.setSecondaryButtonVisible(false);
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.car_insurance_edit_driver_secondary_action_button_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void Y2() {
        View viewFindViewById = m2().findViewById(com.revolut.kompot.R$id.mainContainer);
        if (viewFindViewById != null) {
            ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, null);
        }
        super.Y2();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF101877e0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getF82780a0() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(l uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f217047c;
        TextLocalisedClause textLocalisedClause = uiState.f315620b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        TwinVerticalButton twinVerticalButton = h3().f217046b;
        twinVerticalButton.setMainButtonVisible(true);
        twinVerticalButton.setMainButtonText(uiState.f315621c);
        twinVerticalButton.setMainButtonEnabled(uiState.d);
        twinVerticalButton.setSecondaryButtonVisible(uiState.e);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.V;
    }

    public final nl7.a h3() {
        ViewBinding value = this.W.getValue(this, f75571d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nl7.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final k T2() {
        return (k) this.Z.getValue();
    }
}
