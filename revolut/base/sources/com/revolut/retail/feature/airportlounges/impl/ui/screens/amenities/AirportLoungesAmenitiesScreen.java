package com.revolut.retail.feature.airportlounges.impl.ui.screens.amenities;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.amenities.AirportLoungesAmenitiesScreen;
import cwi.w0;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import vc.s;
import yui.d;
import ywi.b;
import ywi.c;
import ywi.f;
import ywi.g;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/amenities/AirportLoungesAmenitiesScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lywi/f;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/amenities/AirportLoungesAmenitiesScreenContract$InputData;", "Laii/q;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungesAmenitiesScreen extends BaseRecyclerViewScreen<f, AirportLoungesAmenitiesScreenContract$InputData, q> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f99041b0 = {o0.f186429a.j(new h0(AirportLoungesAmenitiesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f99042a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirportLoungesAmenitiesScreen(AirportLoungesAmenitiesScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = s.t(this, c.f);
        this.X = w.y0(new d(11));
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: ywi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesAmenitiesScreen f317441b;

            {
                this.f317441b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportLoungesAmenitiesScreen airportLoungesAmenitiesScreen = this.f317441b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesAmenitiesScreen.f99041b0;
                        return v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), (FullScreenStateDelegate) airportLoungesAmenitiesScreen.X.getValue());
                    default:
                        KProperty[] kPropertyArr2 = AirportLoungesAmenitiesScreen.f99041b0;
                        w0 w0Var = (w0) airportLoungesAmenitiesScreen.Z.getValue();
                        switch (w0Var.f109784a) {
                            case 0:
                                return (g) w0Var.f109787g.get();
                            default:
                                return (g) w0Var.f109787g.get();
                        }
                }
            }
        });
        this.Z = w.y0(new b(this, inputData, 0));
        final int i2 = 1;
        this.f99042a0 = w.y0(new Function0(this) { // from class: ywi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesAmenitiesScreen f317441b;

            {
                this.f317441b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportLoungesAmenitiesScreen airportLoungesAmenitiesScreen = this.f317441b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesAmenitiesScreen.f99041b0;
                        return v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), (FullScreenStateDelegate) airportLoungesAmenitiesScreen.X.getValue());
                    default:
                        KProperty[] kPropertyArr2 = AirportLoungesAmenitiesScreen.f99041b0;
                        w0 w0Var = (w0) airportLoungesAmenitiesScreen.Z.getValue();
                        switch (w0Var.f109784a) {
                            case 0:
                                return (g) w0Var.f109787g.get();
                            default:
                                return (g) w0Var.f109787g.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (w0) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.f99042a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.W.getValue(this, f99041b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        a.g2(this, e.b(((m) value).f174539b.f59410q), null, new yl6.b(this, null, 16), 3);
        a.g2(this, e.b(((FullScreenStateDelegate) this.X.getValue()).f52371h.f121375b), null, new ywi.d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.W.getValue(this, f99041b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.airport_lounges_lounge_details_amenities_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.airport_lounges_lounge_details_amenities_title, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF106555a0() {
        return (List) this.Y.getValue();
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
