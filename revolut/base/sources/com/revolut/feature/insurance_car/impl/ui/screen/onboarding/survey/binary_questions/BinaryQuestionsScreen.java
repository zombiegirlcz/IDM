package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.binary_questions;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
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
import nl7.j;
import no.m;
import ql7.a2;
import rd0.e;
import sji.b;
import te0.w;
import th9.t;
import tna.p;
import tp7.c;
import tp7.g;
import tp7.h;
import tp7.i;
import tx0.j0;
import vc.s;
import zhm.v;
import zl7.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/survey/binary_questions/BinaryQuestionsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ltp7/h;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/survey/binary_questions/BinaryQuestionsScreenContract$InputData;", "Ltp7/g;", "Lno/m;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BinaryQuestionsScreen extends BaseRecyclerViewScreen<h, BinaryQuestionsScreenContract$InputData, g> implements m {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(BinaryQuestionsScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenInsuranceCarBinaryQuestionsBinding;", 0))};
    public final /* synthetic */ a U;
    public final int V;
    public final int W;
    public final ao.h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ActionsDelegate f75632a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f75633b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryQuestionsScreen(BinaryQuestionsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = a.f323190a;
        this.V = R$layout.screen_insurance_car_binary_questions;
        this.W = R$id.insuranceCarBinaryQuestions_recyclerView;
        this.X = s.t(this, tp7.a.f);
        this.Y = w.y0(new tml.a(this, inputData, 3));
        this.Z = w.y0(new t(this, 10));
        ActionsDelegate actionsDelegate = new ActionsDelegate();
        this.f75632a0 = actionsDelegate;
        this.f75633b0 = v.k(new ListSubheaderDelegate(), new RowDelegate(null, null, 7), actionsDelegate);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        this.U.getClass();
        return new AnalyticsProduct.Retail(a.f323191b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (a2) this.Y.getValue();
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
        j jVarH3 = h3();
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(jVarH3.f217072b.f59410q), null, new tp7.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(jVarH3.f217072b.o.f57403b), null, new p(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(jVarH3.f217073c.o), null, new tp7.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75632a0.f51611c.f121375b), null, new c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        j jVarH3 = h3();
        NavBarWithToolbar navBarWithToolbar = jVarH3.f217072b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setMenuItems(((BinaryQuestionsScreenContract$InputData) this.G).e);
        jVarH3.f217073c.setText(new TextLocalisedClause(R$string.car_insurance_common_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF76511a0() {
        return this.f75633b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(h uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        j jVarH3 = h3();
        NavBarWithToolbar navBarWithToolbar = jVarH3.f217072b;
        TextLocalisedClause textLocalisedClause = uiState.f273306b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        Clause clause = uiState.f273307c;
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setSecondDescriptionText(clause);
        jVarH3.f217073c.setEnabled(uiState.d);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.V;
    }

    public final j h3() {
        ViewBinding value = this.X.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (j) value;
    }
}
