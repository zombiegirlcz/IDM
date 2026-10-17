package com.revolut.feature.travel.flights.impl.ui.screen.fare_selection;

import a07.b;
import a0l.k;
import a6g.d;
import a6g.f;
import a6g.h;
import a6g.i;
import a6g.j;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import aw0.o9;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsRevPointsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.fare_selection.TravelFlightsFareSelectionScreen;
import com.revolut.feature.travel.flights.models.domain.common.Carrier;
import com.revolut.kompot.navigable.vc.ViewController;
import f4g.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import q4g.l;
import te0.w;
import tki.c;
import tx0.i0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/fare_selection/TravelFlightsFareSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "La6g/h;", "Ltki/c;", "La6g/j;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsFareSelectionScreen extends ViewController<h> implements c {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TravelFlightsFareSelectionScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsFareSelectionBinding;", 0))};
    public final ao.h K;
    public final InputChecklistDelegate L;
    public final CellDetailsDelegate M;
    public final CellDetailsRevPointsDelegate N;
    public final Image O;
    public final TextClause P;
    public final int Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public TravelFlightsFareSelectionScreen(TravelFlightsFareSelectionScreenContract$InputData inputData) {
        String str;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, a6g.c.f);
        this.L = new InputChecklistDelegate();
        this.M = new CellDetailsDelegate();
        this.N = new CellDetailsRevPointsDelegate();
        Carrier carrier = inputData.f93340b;
        TextClause textClause = null;
        this.O = l.b(null, carrier != null ? carrier.f93489c : null);
        if (carrier != null && (str = carrier.f93488b) != null) {
            String str2 = !d0.W(str) ? str : null;
            if (str2 != null) {
                textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
        }
        this.P = textClause;
        this.Q = R$layout.screen_travel_flights_fare_selection;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: a6g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsFareSelectionScreen f1686b;

            {
                this.f1686b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsFareSelectionScreen.U;
                        TravelFlightsFareSelectionScreen travelFlightsFareSelectionScreen = this.f1686b;
                        return tki.g.a(travelFlightsFareSelectionScreen, travelFlightsFareSelectionScreen.R2(), v.k(travelFlightsFareSelectionScreen.L, travelFlightsFareSelectionScreen.M, travelFlightsFareSelectionScreen.N, new FullScreenStateDelegate(), new RowDelegate(null, null, 7)), R$id.travelFlightsFareSelectionScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelFlightsFareSelectionScreen.U;
                        return (i) ((o) this.f1686b.S.getValue()).f132163c.get();
                }
            }
        });
        this.S = w.y0(new b(this, inputData, 11));
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: a6g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsFareSelectionScreen f1686b;

            {
                this.f1686b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsFareSelectionScreen.U;
                        TravelFlightsFareSelectionScreen travelFlightsFareSelectionScreen = this.f1686b;
                        return tki.g.a(travelFlightsFareSelectionScreen, travelFlightsFareSelectionScreen.R2(), v.k(travelFlightsFareSelectionScreen.L, travelFlightsFareSelectionScreen.M, travelFlightsFareSelectionScreen.N, new FullScreenStateDelegate(), new RowDelegate(null, null, 7)), R$id.travelFlightsFareSelectionScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelFlightsFareSelectionScreen.U;
                        return (i) ((o) this.f1686b.S.getValue()).f132163c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f21263b.setEnabled(uiState.f1691b);
        LargeActionButton travelFlightsFareSelectionScreenButton = d3().f21263b;
        Intrinsics.checkNotNullExpressionValue(travelFlightsFareSelectionScreenButton, "travelFlightsFareSelectionScreenButton");
        travelFlightsFareSelectionScreenButton.setVisibility(uiState.f1692c ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.S.getValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar travelFlightsFareSelectionScreenNavBar = d3().f21264c;
        Intrinsics.checkNotNullExpressionValue(travelFlightsFareSelectionScreenNavBar, "travelFlightsFareSelectionScreenNavBar");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_select_fare_header_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.travel_flights_select_fare_header_description, null, null, 14);
        Integer numValueOf = Integer.valueOf(ofm.q.k(q2()));
        Image image = this.O;
        TextClause textClause = this.P;
        a6g.a model = new a6g.a(textLocalisedClause, textLocalisedClause2, numValueOf, image, textClause);
        Intrinsics.checkNotNullParameter(travelFlightsFareSelectionScreenNavBar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        travelFlightsFareSelectionScreenNavBar.setToolbarTitle(textLocalisedClause);
        travelFlightsFareSelectionScreenNavBar.setTitle(textLocalisedClause, null);
        travelFlightsFareSelectionScreenNavBar.setDescriptionText(textClause);
        travelFlightsFareSelectionScreenNavBar.setDescriptionImage(image != null ? new i0(image, tx0.h0.SIZE_16) : null, (ProgressStyle) null, false);
        travelFlightsFareSelectionScreenNavBar.setDescriptionVisible(textClause != null);
        travelFlightsFareSelectionScreenNavBar.setSecondDescriptionText(textLocalisedClause2);
        travelFlightsFareSelectionScreenNavBar.setNavigationButtonIcon(numValueOf);
        travelFlightsFareSelectionScreenNavBar.setSecondDescriptionVisible(true);
        d3().f21263b.setText(new TextLocalisedClause(R$string.travel_flights_common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f21264c.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52518c), new a6g.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f21263b.o), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f51889c), new k(this, null, 12), 3);
        ViewController.P2(this, rd0.e.b(this.M.d), new f(this, null), 3);
    }

    public final c4g.f d3() {
        ViewBinding value = this.K.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c4g.f) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.R.getValue();
    }
}
