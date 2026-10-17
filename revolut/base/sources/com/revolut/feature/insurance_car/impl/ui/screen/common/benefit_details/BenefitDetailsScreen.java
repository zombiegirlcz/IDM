package com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$id;
import com.revolut.feature.insurance_car.impl.R$layout;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.o;
import jn7.a;
import jn7.c;
import jn7.e;
import jn7.f;
import jn7.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nl7.d;
import ql7.p1;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/common/benefit_details/BenefitDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ljn7/g;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/common/benefit_details/BenefitDetailsScreenContract$InputData;", "Ljn7/e;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BenefitDetailsScreen extends BaseRecyclerViewScreen<g, BenefitDetailsScreenContract$InputData, e> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(BenefitDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenBenefitDetailsBinding;", 0))};
    public final int U;
    public final h V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final CellDetailsChevronDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowDelegate f75509a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f75510b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitDetailsScreen(BenefitDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_benefit_details;
        this.V = s.t(this, a.f);
        this.W = R$id.benefitDetails_recyclerView;
        this.X = w.y0(new j68.a(this, inputData, 29));
        this.Y = w.y0(new jj2.a(this, 6));
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.Z = cellDetailsChevronDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f75509a0 = rowDelegate;
        this.f75510b0 = v.k(rowDelegate, cellDetailsChevronDelegate, new ListSubheaderDelegate(), new PlainTextDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (p1) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f217055b.f59410q), null, new jkc.g(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Z.f51821c), null, new jn7.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f75509a0.f53218h), null, new c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f217055b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.car_insurance_benefit_details_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF75510b0() {
        return this.f75510b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(g uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f217055b;
        TextClause textClause = uiState.f176655b;
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setEndIconImage(uiState.f176656c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.U;
    }

    public final d h3() {
        ViewBinding value = this.V.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }
}
