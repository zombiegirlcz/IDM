package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c9g.j;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.picker.TravelHotelsFilterOptionsPickerScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.picker.TravelHotelsFilterOptionsPickerScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import g9g.n;
import g9g.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qeg.b;
import qeg.c;
import qeg.d;
import qeg.f;
import qeg.g;
import qeg.i;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/filters/picker/TravelHotelsFilterOptionsPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqeg/f;", "Ldli/a;", "Lqeg/i;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsFilterOptionsPickerScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TravelHotelsFilterOptionsPickerScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsFilterOptionsPickerBinding;", 0))};
    public final TravelHotelsFilterOptionsPickerScreenContract$InputData K;
    public final int L;
    public final InputChecklistDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public TravelHotelsFilterOptionsPickerScreen(TravelHotelsFilterOptionsPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_travel_hotels_filter_options_picker;
        this.M = new InputChecklistDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: qeg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsFilterOptionsPickerScreen f245148b;

            {
                this.f245148b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsFilterOptionsPickerScreen travelHotelsFilterOptionsPickerScreen = this.f245148b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsFilterOptionsPickerScreen.R;
                        TravelHotelsFilterOptionsPickerScreen travelHotelsFilterOptionsPickerScreen2 = this.f245148b;
                        return dli.f.a(travelHotelsFilterOptionsPickerScreen2, travelHotelsFilterOptionsPickerScreen2.d(), u.c(travelHotelsFilterOptionsPickerScreen2.M), R$id.travelHotelsFilterOptionsPickerScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsFilterOptionsPickerScreen.R;
                        qji.b bVarU2 = travelHotelsFilterOptionsPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.picker.di.TravelHotelsFilterOptionsPickerScreenInjector");
                        n nVar = (n) bVarU2;
                        g9g.d dVar = nVar.f141747b;
                        n nVar2 = nVar.f141748c;
                        TravelHotelsFilterOptionsPickerScreenContract$InputData travelHotelsFilterOptionsPickerScreenContract$InputData = travelHotelsFilterOptionsPickerScreen.K;
                        travelHotelsFilterOptionsPickerScreenContract$InputData.getClass();
                        return new r(dVar, nVar2, travelHotelsFilterOptionsPickerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsFilterOptionsPickerScreen.R;
                        return (h) ((r) travelHotelsFilterOptionsPickerScreen.P.getValue()).f141802c.get();
                }
            }
        });
        this.O = s.t(this, b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: qeg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsFilterOptionsPickerScreen f245148b;

            {
                this.f245148b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsFilterOptionsPickerScreen travelHotelsFilterOptionsPickerScreen = this.f245148b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsFilterOptionsPickerScreen.R;
                        TravelHotelsFilterOptionsPickerScreen travelHotelsFilterOptionsPickerScreen2 = this.f245148b;
                        return dli.f.a(travelHotelsFilterOptionsPickerScreen2, travelHotelsFilterOptionsPickerScreen2.d(), u.c(travelHotelsFilterOptionsPickerScreen2.M), R$id.travelHotelsFilterOptionsPickerScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsFilterOptionsPickerScreen.R;
                        qji.b bVarU2 = travelHotelsFilterOptionsPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.picker.di.TravelHotelsFilterOptionsPickerScreenInjector");
                        n nVar = (n) bVarU2;
                        g9g.d dVar = nVar.f141747b;
                        n nVar2 = nVar.f141748c;
                        TravelHotelsFilterOptionsPickerScreenContract$InputData travelHotelsFilterOptionsPickerScreenContract$InputData = travelHotelsFilterOptionsPickerScreen.K;
                        travelHotelsFilterOptionsPickerScreenContract$InputData.getClass();
                        return new r(dVar, nVar2, travelHotelsFilterOptionsPickerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsFilterOptionsPickerScreen.R;
                        return (h) ((r) travelHotelsFilterOptionsPickerScreen.P.getValue()).f141802c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: qeg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsFilterOptionsPickerScreen f245148b;

            {
                this.f245148b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelHotelsFilterOptionsPickerScreen travelHotelsFilterOptionsPickerScreen = this.f245148b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsFilterOptionsPickerScreen.R;
                        TravelHotelsFilterOptionsPickerScreen travelHotelsFilterOptionsPickerScreen2 = this.f245148b;
                        return dli.f.a(travelHotelsFilterOptionsPickerScreen2, travelHotelsFilterOptionsPickerScreen2.d(), u.c(travelHotelsFilterOptionsPickerScreen2.M), R$id.travelHotelsFilterOptionsPickerScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsFilterOptionsPickerScreen.R;
                        qji.b bVarU2 = travelHotelsFilterOptionsPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.picker.di.TravelHotelsFilterOptionsPickerScreenInjector");
                        n nVar = (n) bVarU2;
                        g9g.d dVar = nVar.f141747b;
                        n nVar2 = nVar.f141748c;
                        TravelHotelsFilterOptionsPickerScreenContract$InputData travelHotelsFilterOptionsPickerScreenContract$InputData = travelHotelsFilterOptionsPickerScreen.K;
                        travelHotelsFilterOptionsPickerScreenContract$InputData.getClass();
                        return new r(dVar, nVar2, travelHotelsFilterOptionsPickerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsFilterOptionsPickerScreen.R;
                        return (h) ((r) travelHotelsFilterOptionsPickerScreen.P.getValue()).f141802c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        TextClause textClause = uiState.f245155b;
        g gVar = qVar instanceof g ? (g) qVar : null;
        if (gVar == null || gVar.f245153a) {
            NavBarWithToolbar navBarWithToolbar = d3().f22405c;
            navBarWithToolbar.setToolbarTitle(textClause);
            navBarWithToolbar.setTitle(textClause, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f22405c;
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.hotels_common_action_search, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f22404b.setText(new TextLocalisedClause(R$string.hotels_common_action_apply, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22405c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52518c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22405c.f59409p.f57337m), null, new qc3.c(this, null, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22404b.o), null, new c(this, null, 1), 3);
    }

    public final j d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (j) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final qeg.h d() {
        return (qeg.h) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
