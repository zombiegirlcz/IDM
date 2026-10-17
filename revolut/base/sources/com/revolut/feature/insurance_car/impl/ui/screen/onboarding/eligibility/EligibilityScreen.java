package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.eligibility;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$id;
import com.revolut.feature.insurance_car.impl.R$layout;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import e58.d;
import e58.e;
import enb.f;
import ep7.c;
import ep7.g;
import ep7.i;
import java.util.List;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import ql7.y1;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;
import zl7.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/eligibility/EligibilityScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lep7/i;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/eligibility/EligibilityScreenContract$InputData;", "Lep7/g;", "Lno/m;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EligibilityScreen extends BaseRecyclerViewScreen<i, EligibilityScreenContract$InputData, g> implements m {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f75585e0 = {o0.f186429a.j(new h0(EligibilityScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenDriverEligibilityBinding;", 0))};
    public final /* synthetic */ a U;
    public final int V;
    public final h W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ActionsDelegate f75586a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f75587b0;
    public final TextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f75588d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EligibilityScreen(EligibilityScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = a.f323190a;
        this.V = R$layout.screen_driver_eligibility;
        this.W = s.t(this, ep7.a.f);
        this.X = R$id.eligibility_recyclerView;
        this.Y = w.y0(new d(this, inputData, 28));
        this.Z = w.y0(new e(this, 25));
        ActionsDelegate actionsDelegate = new ActionsDelegate();
        this.f75586a0 = actionsDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f75587b0 = rowDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.c0 = textDelegate;
        this.f75588d0 = v.k(actionsDelegate, rowDelegate, textDelegate);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        i uiState = (i) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f217069b.setText(uiState.f128098b);
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
        return (y1) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (ep7.h) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f217070c.f59410q), null, new ep7.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f75586a0.f51611c.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f75587b0.k), null, new ep7.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.c0.d), null, new f(this, continuation, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f217069b.o), null, new ep7.b(this, continuation, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f217070c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_eligibility_questions_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.car_insurance_eligibility_questions_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        i uiState = (i) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f217069b.setText(uiState.f128098b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF0() {
        return this.f75588d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.X;
    }

    public final nl7.i g3() {
        ViewBinding value = this.W.getValue(this, f75585e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nl7.i) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.V;
    }
}
