package com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardSmallLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.airportlounges.impl.R$id;
import com.revolut.retail.feature.airportlounges.impl.R$layout;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.AirportDetailsScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.a;
import cwi.u0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import urd.n;
import uwi.i;
import uwi.j;
import uwi.l;
import uwi.o;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/airport_details/AirportDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Luwi/o;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/airport_details/AirportDetailsScreenContract$InputData;", "Luwi/l;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportDetailsScreen extends BaseRecyclerViewScreen<o, AirportDetailsScreenContract$InputData, l> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f99027d0 = {o0.f186429a.j(new h0(AirportDetailsScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/airportlounges/impl/databinding/ScreenAirportDetailsBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f99028a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f99029b0;
    public final Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirportDetailsScreen(AirportDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_airport_details;
        this.V = R$id.airportDetails_recyclerView;
        this.W = true;
        this.X = s.t(this, uwi.b.f);
        this.Y = w.y0(new uj7.a(this, inputData, 22));
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: uwi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportDetailsScreen f283668b;

            {
                this.f283668b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportDetailsScreen airportDetailsScreen = this.f283668b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AirportDetailsScreen.f99027d0;
                        u0 u0Var = (u0) airportDetailsScreen.Y.getValue();
                        switch (u0Var.f109774a) {
                            case 0:
                                return (n) u0Var.f109777g.get();
                            default:
                                return (n) u0Var.f109777g.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = AirportDetailsScreen.f99027d0;
                        return zhm.v.k(new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), new ListingCardSmallLoadingDelegate(), (ListingCardBasicDelegate) airportDetailsScreen.f99028a0.getValue(), (FullScreenStateDelegate) airportDetailsScreen.f99029b0.getValue());
                }
            }
        });
        this.f99028a0 = w.y0(new us4.b(27));
        this.f99029b0 = w.y0(new us4.b(28));
        final int i2 = 1;
        this.c0 = w.y0(new Function0(this) { // from class: uwi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportDetailsScreen f283668b;

            {
                this.f283668b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportDetailsScreen airportDetailsScreen = this.f283668b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportDetailsScreen.f99027d0;
                        u0 u0Var = (u0) airportDetailsScreen.Y.getValue();
                        switch (u0Var.f109774a) {
                            case 0:
                                return (n) u0Var.f109777g.get();
                            default:
                                return (n) u0Var.f109777g.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = AirportDetailsScreen.f99027d0;
                        return zhm.v.k(new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), new ListingCardSmallLoadingDelegate(), (ListingCardBasicDelegate) airportDetailsScreen.f99028a0.getValue(), (FullScreenStateDelegate) airportDetailsScreen.f99029b0.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (u0) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().d.f59410q), null, new uwi.h(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, new n(e.b(((FullScreenStateDelegate) this.f99029b0.getValue()).f52371h.f121375b), 10), null, new i(this, null), 3);
        ?? r62 = this.f99028a0;
        com.revolut.kompot.navigable.a.g2(this, new rv6.e(new n(e.b(((ListingCardBasicDelegate) r62.getValue()).f52729c), 11), 24), null, new j(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new rv6.e(new n(e.b(((ListingCardBasicDelegate) r62.getValue()).d), 12), 25), null, new j(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f325683c.o), null, new uwi.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f325682b.f58987s), null, new uwi.h(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().d.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        zvi.a aVarH3 = h3();
        LargeActionButton airportDetailsGoToButton = aVarH3.f325683c;
        Intrinsics.checkNotNullExpressionValue(airportDetailsGoToButton, "airportDetailsGoToButton");
        airportDetailsGoToButton.setVisibility(8);
        FormsActionButton airportDetailsFormsActionButton = aVarH3.f325682b;
        Intrinsics.checkNotNullExpressionValue(airportDetailsFormsActionButton, "airportDetailsFormsActionButton");
        airportDetailsFormsActionButton.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getC0() {
        return (List) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(o uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().d;
        Clause textClause = uiState.f283683a;
        navBarWithToolbar.setTitle(textClause, null);
        if (textClause == null) {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        navBarWithToolbar.setToolbarTitle(textClause);
        a aVar = uiState.f283684b;
        LargeActionButton airportDetailsGoToButton = h3().f325683c;
        Intrinsics.checkNotNullExpressionValue(airportDetailsGoToButton, "airportDetailsGoToButton");
        FormsActionButton airportDetailsFormsActionButton = h3().f325682b;
        Intrinsics.checkNotNullExpressionValue(airportDetailsFormsActionButton, "airportDetailsFormsActionButton");
        if (Intrinsics.f(aVar, a.c.f99034a)) {
            airportDetailsGoToButton.setVisibility(8);
            airportDetailsFormsActionButton.setVisibility(8);
        } else if (Intrinsics.f(aVar, a.b.f99033a)) {
            airportDetailsGoToButton.setText(new TextLocalisedClause(R$string.airport_lounges_home_get_button, null, null, 14));
            airportDetailsGoToButton.setVisibility(0);
            airportDetailsFormsActionButton.setVisibility(8);
        } else {
            if (!Intrinsics.f(aVar, a.C0603a.f99032a)) {
                throw new NoWhenBranchMatchedException();
            }
            airportDetailsGoToButton.setVisibility(8);
            airportDetailsFormsActionButton.setImage(new ResourceImage(R$drawable.uikit_icn_24_qr, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
            airportDetailsFormsActionButton.setVisibility(0);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final zvi.a h3() {
        ViewBinding value = this.X.getValue(this, f99027d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (zvi.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final uwi.n T2() {
        return (uwi.n) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
