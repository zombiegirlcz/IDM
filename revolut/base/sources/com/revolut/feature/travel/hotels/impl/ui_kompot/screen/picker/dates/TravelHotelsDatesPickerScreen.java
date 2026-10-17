package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c9g.i;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import g9g.d1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import vc.s;
import xki.e;
import y83.d;
import ybh.a0;
import ycg.b;
import ycg.c;
import ycg.f;
import ycg.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/dates/TravelHotelsDatesPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lycg/f;", "Lcli/w;", "Lycg/h;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsDatesPickerScreen extends ViewController<f> implements w {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(TravelHotelsDatesPickerScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsDatesPickerBinding;", 0))};
    public final int K;
    public final Object L;
    public final h M;
    public final Object N;
    public final Object O;

    public TravelHotelsDatesPickerScreen(TravelHotelsDatesPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_hotels_dates_picker;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: ycg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsDatesPickerScreen f312612b;

            {
                this.f312612b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsDatesPickerScreen travelHotelsDatesPickerScreen = this.f312612b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsDatesPickerScreen.P;
                        return n14.e.a(travelHotelsDatesPickerScreen, (g) travelHotelsDatesPickerScreen.O.getValue());
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsDatesPickerScreen.P;
                        d1 d1Var = (d1) travelHotelsDatesPickerScreen.N.getValue();
                        switch (d1Var.f141649a) {
                            case 0:
                                return (g) d1Var.d.get();
                            default:
                                return (g) d1Var.d.get();
                        }
                }
            }
        });
        this.M = s.t(this, b.f);
        this.N = te0.w.y0(new y1a.a(this, inputData, 19));
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: ycg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsDatesPickerScreen f312612b;

            {
                this.f312612b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsDatesPickerScreen travelHotelsDatesPickerScreen = this.f312612b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsDatesPickerScreen.P;
                        return n14.e.a(travelHotelsDatesPickerScreen, (g) travelHotelsDatesPickerScreen.O.getValue());
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsDatesPickerScreen.P;
                        d1 d1Var = (d1) travelHotelsDatesPickerScreen.N.getValue();
                        switch (d1Var.f141649a) {
                            case 0:
                                return (g) d1Var.d.get();
                            default:
                                return (g) d1Var.d.get();
                        }
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
        ycg.h uiState = (ycg.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().d;
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(uiState.f312621g);
        d3().f22402c.setCalendarData(uiState.f312618a, uiState.f312619b, uiState.f312620c, uiState.d, uiState.e, null);
        d3().f22401b.setEnabled(uiState.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().d;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_stays_search_dates_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setAlwaysExpanded(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f22401b.setText(new TextLocalisedClause(R$string.hotels_common_action_confirm, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59410q), null, new c(this, null, 0), 3);
        r map = d3().f22402c.b().map(new ya6.f(new a0(21), 13));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new d(this, (Continuation) null, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22401b.o), null, new c(this, null, 1), 3);
    }

    public final i d3() {
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (i) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (cli.a0) this.L.getValue();
    }
}
