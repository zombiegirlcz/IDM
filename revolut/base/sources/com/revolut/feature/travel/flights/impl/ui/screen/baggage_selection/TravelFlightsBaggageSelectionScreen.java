package com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ProgressSwitcher;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.TravelFlightsBaggageSelectionScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import jh.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c9;
import te0.w;
import v4g.f;
import v4g.i;
import v4g.k;
import v4g.l;
import v4g.m;
import v4g.n;
import v4g.p;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/baggage_selection/TravelFlightsBaggageSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lv4g/i;", "Ltki/c;", "Lv4g/p;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsBaggageSelectionScreen extends ViewController<i> implements tki.c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TravelFlightsBaggageSelectionScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsBaggageSelectionBinding;", 0))};
    public final RowDelegate K;
    public final SelectableDelegate L;
    public final h M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TravelFlightsBaggageSelectionScreen(TravelFlightsBaggageSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.K = rowDelegate;
        this.L = new SelectableDelegate(rowDelegate);
        this.M = s.t(this, v4g.c.f);
        this.N = R$layout.screen_travel_flights_baggage_selection;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: v4g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsBaggageSelectionScreen f286076b;

            {
                this.f286076b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsBaggageSelectionScreen.R;
                        TravelFlightsBaggageSelectionScreen travelFlightsBaggageSelectionScreen = this.f286076b;
                        return tki.g.a(travelFlightsBaggageSelectionScreen, travelFlightsBaggageSelectionScreen.d(), v.k(travelFlightsBaggageSelectionScreen.K, travelFlightsBaggageSelectionScreen.L, new ListSubheaderDelegate(), new TextDelegate()), R$id.travelFlightsBaggageSelectionScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelFlightsBaggageSelectionScreen.R;
                        return (o) ((f4g.d) this.f286076b.P.getValue()).f.get();
                }
            }
        });
        this.P = w.y0(new v0c.b(this, inputData, 14));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: v4g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsBaggageSelectionScreen f286076b;

            {
                this.f286076b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsBaggageSelectionScreen.R;
                        TravelFlightsBaggageSelectionScreen travelFlightsBaggageSelectionScreen = this.f286076b;
                        return tki.g.a(travelFlightsBaggageSelectionScreen, travelFlightsBaggageSelectionScreen.d(), v.k(travelFlightsBaggageSelectionScreen.K, travelFlightsBaggageSelectionScreen.L, new ListSubheaderDelegate(), new TextDelegate()), R$id.travelFlightsBaggageSelectionScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelFlightsBaggageSelectionScreen.R;
                        return (o) ((f4g.d) this.f286076b.P.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        TextLocalisedClause textLocalisedClause;
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        n nVar = uiState.f286088b;
        c4g.c cVarD3 = d3();
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = cVarD3.f21251a;
        UIKitTextView travelFlightsBaggageSelectionScreenPriceFiat = cVarD3.e;
        UIKitTextView travelFlightsBaggageSelectionScreenPricePoints = cVarD3.f21254g;
        ProgressSwitcher travelFlightsBaggageSelectionScreenPriceProgress = cVarD3.f21255h;
        Context context = controllerContainerCoordinatorLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ty0.c cVarB0 = d.f(context).b0();
        boolean z = nVar instanceof l;
        Clause clause = null;
        m mVar = m.f286086a;
        if (z) {
            textLocalisedClause = ((l) nVar).f286084a;
        } else {
            if (!(nVar instanceof k) && !Intrinsics.f(nVar, mVar)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_price_breakdown_total, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        boolean z3 = nVar instanceof k;
        k kVar = z3 ? (k) nVar : null;
        Clause clause2 = kVar != null ? kVar.f286082a : null;
        if (z3) {
            clause = ((k) nVar).f286083b;
        } else if (z) {
            clause = ((l) nVar).f286085b;
        } else if (!Intrinsics.f(nVar, mVar)) {
            throw new NoWhenBranchMatchedException();
        }
        UIKitTextView travelFlightsBaggageSelectionScreenPriceLabel = cVarD3.f;
        Intrinsics.checkNotNullExpressionValue(travelFlightsBaggageSelectionScreenPriceLabel, "travelFlightsBaggageSelectionScreenPriceLabel");
        ty0.c.b(cVarB0, textLocalisedClause2, travelFlightsBaggageSelectionScreenPriceLabel, null, null, 12);
        Intrinsics.checkNotNullExpressionValue(travelFlightsBaggageSelectionScreenPricePoints, "travelFlightsBaggageSelectionScreenPricePoints");
        ty0.c.b(cVarB0, clause2, travelFlightsBaggageSelectionScreenPricePoints, null, null, 12);
        Clause clause3 = clause2;
        Intrinsics.checkNotNullExpressionValue(travelFlightsBaggageSelectionScreenPriceFiat, "travelFlightsBaggageSelectionScreenPriceFiat");
        Clause clause4 = clause;
        ty0.c.b(cVarB0, clause4, travelFlightsBaggageSelectionScreenPriceFiat, null, null, 12);
        Intrinsics.checkNotNullExpressionValue(travelFlightsBaggageSelectionScreenPricePoints, "travelFlightsBaggageSelectionScreenPricePoints");
        travelFlightsBaggageSelectionScreenPricePoints.setVisibility(clause3 != null ? 0 : 8);
        Intrinsics.checkNotNullExpressionValue(travelFlightsBaggageSelectionScreenPriceFiat, "travelFlightsBaggageSelectionScreenPriceFiat");
        travelFlightsBaggageSelectionScreenPriceFiat.setVisibility(clause4 != null ? 0 : 8);
        boolean zF = Intrinsics.f(nVar, mVar);
        Intrinsics.checkNotNullExpressionValue(travelFlightsBaggageSelectionScreenPriceProgress, "travelFlightsBaggageSelectionScreenPriceProgress");
        travelFlightsBaggageSelectionScreenPriceProgress.setVisibility(zF ? 0 : 8);
        travelFlightsBaggageSelectionScreenPriceProgress.setProgressVisible(zF);
        cVarD3.d.setEnabled(!zF);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f4g.d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar travelFlightsBaggageSelectionScreenNavBar = d3().f21253c;
        Intrinsics.checkNotNullExpressionValue(travelFlightsBaggageSelectionScreenNavBar, "travelFlightsBaggageSelectionScreenNavBar");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_baggage_selection_header_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.travel_flights_baggage_selection_header_subtitle, null, null, 14);
        Integer numValueOf = Integer.valueOf(ofm.q.k(q2()));
        List<? extends NavBarMenuItem> listC = u.c(new IconNavBarMenuItem("BAGGAGE_INFO_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.travel_flights_baggage_selection_header_menu_item_info, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
        v4g.a model = new v4g.a(textLocalisedClause, textLocalisedClause2, numValueOf, listC);
        Intrinsics.checkNotNullParameter(travelFlightsBaggageSelectionScreenNavBar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        travelFlightsBaggageSelectionScreenNavBar.setToolbarTitle(textLocalisedClause);
        travelFlightsBaggageSelectionScreenNavBar.setTitle(textLocalisedClause, null);
        travelFlightsBaggageSelectionScreenNavBar.setSecondDescriptionText(textLocalisedClause2);
        travelFlightsBaggageSelectionScreenNavBar.setNavigationButtonIcon(numValueOf);
        travelFlightsBaggageSelectionScreenNavBar.setMenuItems(listC);
        travelFlightsBaggageSelectionScreenNavBar.setSecondDescriptionVisible(true);
        d3().f21252b.setText(new TextLocalisedClause(R$string.travel_flights_common_action_continue, null, null, 14));
        d3().d.setOnClickListener(new c9(this, 27));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f21253c.f59410q), new v4g.d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f21253c.o.f57403b), new v44.e(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.K.f53225r), new v4g.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.r()), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f21252b.o), new v4g.d(this, null, 1), 3);
    }

    public final c4g.c d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c4g.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final v4g.o d() {
        return (v4g.o) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.O.getValue();
    }
}
