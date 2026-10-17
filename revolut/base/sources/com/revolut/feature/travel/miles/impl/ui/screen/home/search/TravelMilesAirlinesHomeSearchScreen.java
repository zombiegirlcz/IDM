package com.revolut.feature.travel.miles.impl.ui.screen.home.search;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import c65.i;
import cge.g;
import ch6.d;
import cig.b;
import cig.f;
import cli.o;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.screen.home.search.TravelMilesAirlinesHomeSearchScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.concurrent.TimeUnit;
import kli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import u45.w0;
import ufg.r;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/home/search/TravelMilesAirlinesHomeSearchScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcig/f;", "Ldli/a;", "Lcig/h;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesAirlinesHomeSearchScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TravelMilesAirlinesHomeSearchScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesAirlinesSearchBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final RowDelegate L;
    public final SwipeToActionDelegate M;
    public final ErrorDelegate N;
    public final int O;
    public final boolean P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, rfg.h.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesAirlinesSearchBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return rfg.h.a(p0);
        }
    }

    public TravelMilesAirlinesHomeSearchScreen() {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.L = rowDelegate;
        this.M = new SwipeToActionDelegate(rowDelegate, false);
        this.N = new ErrorDelegate();
        this.O = R$layout.screen_travel_miles_airlines_search;
        this.P = true;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: cig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesAirlinesHomeSearchScreen f24543b;

            {
                this.f24543b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelMilesAirlinesHomeSearchScreen travelMilesAirlinesHomeSearchScreen = this.f24543b;
                int i3 = 4;
                int i5 = 3;
                int i6 = 2;
                int i21 = 1;
                int i22 = 0;
                int i32 = 5;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesAirlinesHomeSearchScreen.T;
                        qji.b bVarU2 = travelMilesAirlinesHomeSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.home.search.di.TravelMilesAirlinesHomeSearchScreenInjector");
                        ufg.g gVar = ((r) bVarU2).f279787b;
                        ufg.e eVar = new ufg.e();
                        eVar.f279685a = e4m.b.b(e4m.c.a(travelMilesAirlinesHomeSearchScreen));
                        int i33 = 18;
                        eVar.f279686b = e4m.b.b(new w0(gVar, eVar, i6, i33));
                        eVar.f279687c = e4m.b.b(new w0(gVar, eVar, i21, i33));
                        eVar.d = e4m.b.b(new w0(gVar, eVar, i22, i33));
                        eVar.e = e4m.b.b(new w0(gVar, eVar, i3, i33));
                        eVar.f = e4m.b.b(new w0(gVar, eVar, i5, i33));
                        eVar.f279688g = e4m.b.b(new w0(gVar, eVar, 6, i33));
                        eVar.f279689h = e4m.b.b(new w0(gVar, eVar, i32, i33));
                        eVar.i = e4m.b.b(new w0(gVar, eVar, 8, i33));
                        eVar.f279690j = e4m.b.b(new w0(gVar, eVar, 7, i33));
                        return eVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesAirlinesHomeSearchScreen.T;
                        return (g) ((ufg.e) travelMilesAirlinesHomeSearchScreen.Q.getValue()).f279690j.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesAirlinesHomeSearchScreen.T;
                        TravelMilesAirlinesHomeSearchScreen travelMilesAirlinesHomeSearchScreen2 = this.f24543b;
                        return dli.f.a(travelMilesAirlinesHomeSearchScreen2, travelMilesAirlinesHomeSearchScreen2.R2(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), travelMilesAirlinesHomeSearchScreen2.L, travelMilesAirlinesHomeSearchScreen2.M, travelMilesAirlinesHomeSearchScreen2.N), R$id.milesAirlinesSearch_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: cig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesAirlinesHomeSearchScreen f24543b;

            {
                this.f24543b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelMilesAirlinesHomeSearchScreen travelMilesAirlinesHomeSearchScreen = this.f24543b;
                int i3 = 4;
                int i5 = 3;
                int i6 = 2;
                int i21 = 1;
                int i222 = 0;
                int i32 = 5;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesAirlinesHomeSearchScreen.T;
                        qji.b bVarU2 = travelMilesAirlinesHomeSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.home.search.di.TravelMilesAirlinesHomeSearchScreenInjector");
                        ufg.g gVar = ((r) bVarU2).f279787b;
                        ufg.e eVar = new ufg.e();
                        eVar.f279685a = e4m.b.b(e4m.c.a(travelMilesAirlinesHomeSearchScreen));
                        int i33 = 18;
                        eVar.f279686b = e4m.b.b(new w0(gVar, eVar, i6, i33));
                        eVar.f279687c = e4m.b.b(new w0(gVar, eVar, i21, i33));
                        eVar.d = e4m.b.b(new w0(gVar, eVar, i222, i33));
                        eVar.e = e4m.b.b(new w0(gVar, eVar, i3, i33));
                        eVar.f = e4m.b.b(new w0(gVar, eVar, i5, i33));
                        eVar.f279688g = e4m.b.b(new w0(gVar, eVar, 6, i33));
                        eVar.f279689h = e4m.b.b(new w0(gVar, eVar, i32, i33));
                        eVar.i = e4m.b.b(new w0(gVar, eVar, 8, i33));
                        eVar.f279690j = e4m.b.b(new w0(gVar, eVar, 7, i33));
                        return eVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesAirlinesHomeSearchScreen.T;
                        return (g) ((ufg.e) travelMilesAirlinesHomeSearchScreen.Q.getValue()).f279690j.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesAirlinesHomeSearchScreen.T;
                        TravelMilesAirlinesHomeSearchScreen travelMilesAirlinesHomeSearchScreen2 = this.f24543b;
                        return dli.f.a(travelMilesAirlinesHomeSearchScreen2, travelMilesAirlinesHomeSearchScreen2.R2(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), travelMilesAirlinesHomeSearchScreen2.L, travelMilesAirlinesHomeSearchScreen2.M, travelMilesAirlinesHomeSearchScreen2.N), R$id.milesAirlinesSearch_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: cig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesAirlinesHomeSearchScreen f24543b;

            {
                this.f24543b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelMilesAirlinesHomeSearchScreen travelMilesAirlinesHomeSearchScreen = this.f24543b;
                int i32 = 4;
                int i5 = 3;
                int i6 = 2;
                int i21 = 1;
                int i222 = 0;
                int i322 = 5;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesAirlinesHomeSearchScreen.T;
                        qji.b bVarU2 = travelMilesAirlinesHomeSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.home.search.di.TravelMilesAirlinesHomeSearchScreenInjector");
                        ufg.g gVar = ((r) bVarU2).f279787b;
                        ufg.e eVar = new ufg.e();
                        eVar.f279685a = e4m.b.b(e4m.c.a(travelMilesAirlinesHomeSearchScreen));
                        int i33 = 18;
                        eVar.f279686b = e4m.b.b(new w0(gVar, eVar, i6, i33));
                        eVar.f279687c = e4m.b.b(new w0(gVar, eVar, i21, i33));
                        eVar.d = e4m.b.b(new w0(gVar, eVar, i222, i33));
                        eVar.e = e4m.b.b(new w0(gVar, eVar, i32, i33));
                        eVar.f = e4m.b.b(new w0(gVar, eVar, i5, i33));
                        eVar.f279688g = e4m.b.b(new w0(gVar, eVar, 6, i33));
                        eVar.f279689h = e4m.b.b(new w0(gVar, eVar, i322, i33));
                        eVar.i = e4m.b.b(new w0(gVar, eVar, 8, i33));
                        eVar.f279690j = e4m.b.b(new w0(gVar, eVar, 7, i33));
                        return eVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesAirlinesHomeSearchScreen.T;
                        return (g) ((ufg.e) travelMilesAirlinesHomeSearchScreen.Q.getValue()).f279690j.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesAirlinesHomeSearchScreen.T;
                        TravelMilesAirlinesHomeSearchScreen travelMilesAirlinesHomeSearchScreen2 = this.f24543b;
                        return dli.f.a(travelMilesAirlinesHomeSearchScreen2, travelMilesAirlinesHomeSearchScreen2.R2(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), travelMilesAirlinesHomeSearchScreen2.L, travelMilesAirlinesHomeSearchScreen2.M, travelMilesAirlinesHomeSearchScreen2.N), R$id.milesAirlinesSearch_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((cig.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ufg.e) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f253795b;
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.miles_common_search, null, null, 14));
        navBarWithToolbar.j0(false);
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.E0();
        c.d(navBarWithToolbar, 0L);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253795b.f59409p.f57336l), null, new i(this, null, 19), 3);
        efm.r rVarDistinctUntilChanged = d3().f253795b.f59409p.f57337m.debounce(300L, TimeUnit.MILLISECONDS).map(new d(new g(24), 6)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarDistinctUntilChanged), null, new b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53218h), null, new cig.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52226c), null, new b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f), null, new cig.d(this, null), 3);
    }

    public final rfg.h d3() {
        ViewBinding value = this.K.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rfg.h) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final cig.g R2() {
        return (cig.g) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}
