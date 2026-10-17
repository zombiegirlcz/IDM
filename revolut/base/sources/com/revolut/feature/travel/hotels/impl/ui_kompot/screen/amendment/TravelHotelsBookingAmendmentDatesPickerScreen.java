package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import g9g.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.h;
import vc.s;
import xki.e;
import zag.b;
import zag.c;
import zag.i;
import zag.j;
import zag.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzag/i;", "Ltki/h;", "Lzag/k;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsBookingAmendmentDatesPickerScreen extends ViewController<i> implements h {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TravelHotelsBookingAmendmentDatesPickerScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsDatesPickerBinding;", 0))};
    public final TravelHotelsBookingAmendmentDatesPickerScreenContract$InputData K;
    public final ao.h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public TravelHotelsBookingAmendmentDatesPickerScreen(TravelHotelsBookingAmendmentDatesPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_travel_hotels_dates_picker;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: zag.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsBookingAmendmentDatesPickerScreen f320686b;

            {
                this.f320686b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsBookingAmendmentDatesPickerScreen travelHotelsBookingAmendmentDatesPickerScreen = this.f320686b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsBookingAmendmentDatesPickerScreen.Q;
                        qji.b bVarU2 = travelHotelsBookingAmendmentDatesPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.di.TravelHotelsBookingAmendmentDatesPickerScreenInjector");
                        g9g.g gVar = (g9g.g) bVarU2;
                        g9g.d dVar = gVar.f141671b;
                        g9g.g gVar2 = gVar.f141672c;
                        TravelHotelsBookingAmendmentDatesPickerScreenContract$InputData travelHotelsBookingAmendmentDatesPickerScreenContract$InputData = travelHotelsBookingAmendmentDatesPickerScreen.K;
                        travelHotelsBookingAmendmentDatesPickerScreenContract$InputData.getClass();
                        return new g9g.f(dVar, gVar2, travelHotelsBookingAmendmentDatesPickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsBookingAmendmentDatesPickerScreen.Q;
                        return (j) ((g9g.f) travelHotelsBookingAmendmentDatesPickerScreen.N.getValue()).f141663c.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsBookingAmendmentDatesPickerScreen.Q;
                        return tki.g.b(travelHotelsBookingAmendmentDatesPickerScreen, (j) travelHotelsBookingAmendmentDatesPickerScreen.O.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: zag.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsBookingAmendmentDatesPickerScreen f320686b;

            {
                this.f320686b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsBookingAmendmentDatesPickerScreen travelHotelsBookingAmendmentDatesPickerScreen = this.f320686b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsBookingAmendmentDatesPickerScreen.Q;
                        qji.b bVarU2 = travelHotelsBookingAmendmentDatesPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.di.TravelHotelsBookingAmendmentDatesPickerScreenInjector");
                        g9g.g gVar = (g9g.g) bVarU2;
                        g9g.d dVar = gVar.f141671b;
                        g9g.g gVar2 = gVar.f141672c;
                        TravelHotelsBookingAmendmentDatesPickerScreenContract$InputData travelHotelsBookingAmendmentDatesPickerScreenContract$InputData = travelHotelsBookingAmendmentDatesPickerScreen.K;
                        travelHotelsBookingAmendmentDatesPickerScreenContract$InputData.getClass();
                        return new g9g.f(dVar, gVar2, travelHotelsBookingAmendmentDatesPickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsBookingAmendmentDatesPickerScreen.Q;
                        return (j) ((g9g.f) travelHotelsBookingAmendmentDatesPickerScreen.N.getValue()).f141663c.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsBookingAmendmentDatesPickerScreen.Q;
                        return tki.g.b(travelHotelsBookingAmendmentDatesPickerScreen, (j) travelHotelsBookingAmendmentDatesPickerScreen.O.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: zag.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsBookingAmendmentDatesPickerScreen f320686b;

            {
                this.f320686b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelHotelsBookingAmendmentDatesPickerScreen travelHotelsBookingAmendmentDatesPickerScreen = this.f320686b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsBookingAmendmentDatesPickerScreen.Q;
                        qji.b bVarU2 = travelHotelsBookingAmendmentDatesPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.di.TravelHotelsBookingAmendmentDatesPickerScreenInjector");
                        g9g.g gVar = (g9g.g) bVarU2;
                        g9g.d dVar = gVar.f141671b;
                        g9g.g gVar2 = gVar.f141672c;
                        TravelHotelsBookingAmendmentDatesPickerScreenContract$InputData travelHotelsBookingAmendmentDatesPickerScreenContract$InputData = travelHotelsBookingAmendmentDatesPickerScreen.K;
                        travelHotelsBookingAmendmentDatesPickerScreenContract$InputData.getClass();
                        return new g9g.f(dVar, gVar2, travelHotelsBookingAmendmentDatesPickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsBookingAmendmentDatesPickerScreen.Q;
                        return (j) ((g9g.f) travelHotelsBookingAmendmentDatesPickerScreen.N.getValue()).f141663c.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsBookingAmendmentDatesPickerScreen.Q;
                        return tki.g.b(travelHotelsBookingAmendmentDatesPickerScreen, (j) travelHotelsBookingAmendmentDatesPickerScreen.O.getValue());
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().d;
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(uiState.f320701g);
        d3().f22402c.setCalendarData(uiState.f320698a, uiState.f320699b, uiState.f320700c, uiState.d, uiState.e, null);
        d3().f22401b.setEnabled(uiState.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().d;
        navBarWithToolbar.setAlwaysExpanded(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.hotels_stays_search_dates_title, null, null, 14), null);
        LargeActionButton largeActionButton = d3().f22401b;
        largeActionButton.setText(new TextLocalisedClause(R$string.hotels_common_action_confirm, null, null, 14));
        largeActionButton.setLoadingButtonTag("confirm_button_tag");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59410q), null, new c(this, null, 0), 3);
        r map = d3().f22402c.b().map(new zab.b(25, new z8h.b(20)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new yy6.f(this, null, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22401b.o), null, new c(this, null, 1), 3);
    }

    public final c9g.i d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c9g.i) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.e) this.P.getValue();
    }
}
