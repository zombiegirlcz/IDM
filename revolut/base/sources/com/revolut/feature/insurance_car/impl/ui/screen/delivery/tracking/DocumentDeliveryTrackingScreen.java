package com.revolut.feature.insurance_car.impl.ui.screen.delivery.tracking;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$id;
import com.revolut.feature.insurance_car.impl.R$layout;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ql7.z;
import sji.b;
import te0.w;
import th9.t;
import tn7.a;
import tn7.c;
import tn7.e;
import tn7.f;
import tn7.g;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/delivery/tracking/DocumentDeliveryTrackingScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ltn7/g;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/delivery/tracking/DocumentDeliveryTrackingScreenContract$InputData;", "Ltn7/e;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentDeliveryTrackingScreen extends BaseRecyclerViewScreen<g, DocumentDeliveryTrackingScreenContract$InputData, e> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f75519b0 = {o0.f186429a.j(new h0(DocumentDeliveryTrackingScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenDocumentDeliveryTrackingBinding;", 0))};
    public final int U;
    public final h V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final CellDetailsChevronDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f75520a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentDeliveryTrackingScreen(DocumentDeliveryTrackingScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_document_delivery_tracking;
        this.V = s.t(this, a.f);
        this.W = R$id.deliveryTracking_recyclerView;
        this.X = w.y0(new tml.a(this, inputData, 1));
        this.Y = w.y0(new t(this, 7));
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.Z = cellDetailsChevronDelegate;
        this.f75520a0 = v.k(cellDetailsChevronDelegate, new ListSubheaderDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new FullScreenStateDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (z) this.X.getValue();
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
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f217067c.f59410q), null, new tn7.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Z.f51821c), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f217066b.o), null, new tn7.b(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f217067c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        h3().f217066b.setText(new TextLocalisedClause(R$string.car_insurance_certificate_shipping_details_footer_primary_button_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF75520a0() {
        return this.f75520a0;
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
        LargeActionButton deliveryTrackingButton = h3().f217066b;
        Intrinsics.checkNotNullExpressionValue(deliveryTrackingButton, "deliveryTrackingButton");
        boolean z = uiState.f272327b;
        TextLocalisedClause textLocalisedClause = uiState.f272328c;
        deliveryTrackingButton.setVisibility(z ? 0 : 8);
        NavBarWithToolbar navBarWithToolbar = h3().f217067c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    public final nl7.h h3() {
        ViewBinding value = this.V.getValue(this, f75519b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nl7.h) value;
    }
}
