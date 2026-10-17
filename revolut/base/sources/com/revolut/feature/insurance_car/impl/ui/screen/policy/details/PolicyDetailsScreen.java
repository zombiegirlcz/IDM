package com.revolut.feature.insurance_car.impl.ui.screen.policy.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$id;
import com.revolut.feature.insurance_car.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import hl6.b;
import hq1.f;
import hq7.a;
import hq7.c;
import hq7.d;
import hq7.g;
import hq7.i;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ql7.b1;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/policy/details/PolicyDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lhq7/i;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/policy/details/PolicyDetailsScreenContract$InputData;", "Lhq7/g;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PolicyDetailsScreen extends BaseRecyclerViewScreen<i, PolicyDetailsScreenContract$InputData, g> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(PolicyDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenPolicyDetailsBinding;", 0))};
    public final int U;
    public final h V;
    public final int W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final CellDetailsActionDelegate f75653a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final LargeActionButtonDelegate f75654b0;
    public final RowDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final PlainTextDelegate f75655d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f75656e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolicyDetailsScreen(PolicyDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_policy_details;
        this.V = s.t(this, a.f);
        this.W = R$id.policyDetails_recyclerView;
        this.X = true;
        this.Y = w.y0(new b(this, inputData, 8));
        this.Z = w.y0(new f(this, 2));
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        this.f75653a0 = cellDetailsActionDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.f75654b0 = largeActionButtonDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.c0 = rowDelegate;
        this.f75655d0 = new PlainTextDelegate();
        this.f75656e0 = v.k(cellDetailsActionDelegate, largeActionButtonDelegate, rowDelegate, new CellDetailsDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), new ListSubheaderDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (b1) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217086b.f59410q), null, new hq7.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217086b.o.f57403b), null, new hq7.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75653a0.d), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75654b0.d.f121375b), null, new hq7.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75655d0.d.f121375b), null, new hp2.d(this, continuation, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f217086b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        ((j60.a) ((b1) this.Y.getValue()).f.get()).d(v.k(this.f75654b0, this.f75655d0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.f75656e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f217086b;
        TextLocalisedClause textLocalisedClause = uiState.f154615b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setMenuItems(uiState.f154616c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    public final nl7.o h3() {
        ViewBinding value = this.V.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nl7.o) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final hq7.h T2() {
        return (hq7.h) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
