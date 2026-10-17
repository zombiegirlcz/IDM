package com.revolut.feature.travel.flights.impl.ui.screen.documents;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.flights.impl.ui.screen.documents.TravelFlightsDocumentsScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.documents.TravelFlightsDocumentsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import f4g.n;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import y5g.c;
import y5g.d;
import y5g.f;
import y5g.i;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/documents/TravelFlightsDocumentsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ly5g/i;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsDocumentsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TravelFlightsDocumentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final TravelFlightsDocumentsScreenContract$InputData K;
    public final h L;
    public final RowDelegate M;
    public final FullScreenStateDelegate N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public TravelFlightsDocumentsScreen(TravelFlightsDocumentsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, c.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new FullScreenStateDelegate();
        this.O = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: y5g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsDocumentsScreen f311078b;

            {
                this.f311078b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsDocumentsScreen travelFlightsDocumentsScreen = this.f311078b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsDocumentsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsDocumentsScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsDocumentsScreenContract$InputData travelFlightsDocumentsScreenContract$InputData = travelFlightsDocumentsScreen.K;
                        travelFlightsDocumentsScreenContract$InputData.getClass();
                        return new n(bVar, travelFlightsDocumentsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsDocumentsScreen.S;
                        return (h) ((n) travelFlightsDocumentsScreen.P.getValue()).f132157b.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsDocumentsScreen.S;
                        TravelFlightsDocumentsScreen travelFlightsDocumentsScreen2 = this.f311078b;
                        return dli.f.a(travelFlightsDocumentsScreen2, (h) travelFlightsDocumentsScreen2.Q.getValue(), v.k(travelFlightsDocumentsScreen2.M, new RowLoadingDelegate(), travelFlightsDocumentsScreen2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: y5g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsDocumentsScreen f311078b;

            {
                this.f311078b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsDocumentsScreen travelFlightsDocumentsScreen = this.f311078b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsDocumentsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsDocumentsScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsDocumentsScreenContract$InputData travelFlightsDocumentsScreenContract$InputData = travelFlightsDocumentsScreen.K;
                        travelFlightsDocumentsScreenContract$InputData.getClass();
                        return new n(bVar, travelFlightsDocumentsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsDocumentsScreen.S;
                        return (h) ((n) travelFlightsDocumentsScreen.P.getValue()).f132157b.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsDocumentsScreen.S;
                        TravelFlightsDocumentsScreen travelFlightsDocumentsScreen2 = this.f311078b;
                        return dli.f.a(travelFlightsDocumentsScreen2, (h) travelFlightsDocumentsScreen2.Q.getValue(), v.k(travelFlightsDocumentsScreen2.M, new RowLoadingDelegate(), travelFlightsDocumentsScreen2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: y5g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsDocumentsScreen f311078b;

            {
                this.f311078b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelFlightsDocumentsScreen travelFlightsDocumentsScreen = this.f311078b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsDocumentsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsDocumentsScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsDocumentsScreenContract$InputData travelFlightsDocumentsScreenContract$InputData = travelFlightsDocumentsScreen.K;
                        travelFlightsDocumentsScreenContract$InputData.getClass();
                        return new n(bVar, travelFlightsDocumentsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsDocumentsScreen.S;
                        return (h) ((n) travelFlightsDocumentsScreen.P.getValue()).f132157b.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsDocumentsScreen.S;
                        TravelFlightsDocumentsScreen travelFlightsDocumentsScreen2 = this.f311078b;
                        return dli.f.a(travelFlightsDocumentsScreen2, (h) travelFlightsDocumentsScreen2.Q.getValue(), v.k(travelFlightsDocumentsScreen2.M, new RowLoadingDelegate(), travelFlightsDocumentsScreen2.N), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        y5g.a model = uiState.f311082a;
        Intrinsics.checkNotNullParameter(navBarWithToolbar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        TextLocalisedClause textLocalisedClause = model.f311076a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (y5g.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53220l), new y5g.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new f(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
