package com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.delivery;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ql7.y;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import vd1.a;
import vge.z1;
import vq7.b;
import vq7.c;
import vq7.d;
import vq7.g;
import vq7.i;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/policy/telematic_device/delivery/DeviceDeliveryScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lvq7/i;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/policy/telematic_device/delivery/DeviceDeliveryScreenContract$InputData;", "Lvq7/g;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeviceDeliveryScreen extends BaseRecyclerViewScreen<i, DeviceDeliveryScreenContract$InputData, g> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(DeviceDeliveryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final RowDelegate X;
    public final CellDetailsChevronDelegate Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f75676a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f75677b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceDeliveryScreen(DeviceDeliveryScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = s.t(this, b.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.X = rowDelegate;
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.Y = cellDetailsChevronDelegate;
        this.Z = w.y0(new a(this, inputData, 29));
        this.f75676a0 = w.y0(new vch.a(this, 21));
        this.f75677b0 = v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), cellDetailsChevronDelegate, rowDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (y) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (vq7.h) this.f75676a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(((m) value).f174539b.f59410q), null, new z1(this, continuation, 13), 3);
        RowDelegate rowDelegate = this.X;
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53226s), null, new vfg.m(this, continuation, 24), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Y.f51821c), null, new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.car_insurance_telematics_device_delivery_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.car_insurance_telematics_device_delivery_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        ((j60.a) ((y) this.Z.getValue()).f.get()).d(u.c(this.X));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF66961b0() {
        return this.f75677b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
