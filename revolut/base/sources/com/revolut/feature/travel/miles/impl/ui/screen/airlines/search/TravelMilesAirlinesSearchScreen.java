package com.revolut.feature.travel.miles.impl.ui.screen.airlines.search;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import c65.i;
import cge.g;
import ch6.d;
import chg.b;
import chg.f;
import cli.o;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.search.TravelMilesAirlinesSearchScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.concurrent.TimeUnit;
import kli.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/airlines/search/TravelMilesAirlinesSearchScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lchg/f;", "Ldli/a;", "Lchg/h;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesAirlinesSearchScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(TravelMilesAirlinesSearchScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesAirlinesSearchBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final RowDelegate L;
    public final SwipeToActionDelegate M;
    public final ErrorDelegate N;
    public final TwinHorizontalButtonDelegate O;
    public final LargeActionButtonDelegate P;
    public final int Q;
    public final boolean R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

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

    public TravelMilesAirlinesSearchScreen() {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.L = rowDelegate;
        this.M = new SwipeToActionDelegate(rowDelegate, false);
        this.N = new ErrorDelegate();
        this.O = new TwinHorizontalButtonDelegate();
        this.P = new LargeActionButtonDelegate();
        this.Q = R$layout.screen_travel_miles_airlines_search;
        this.R = true;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: chg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesAirlinesSearchScreen f24222b;

            {
                this.f24222b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 4;
                int i5 = 3;
                int i6 = 2;
                int i21 = 1;
                int i22 = 0;
                int i32 = 5;
                TravelMilesAirlinesSearchScreen travelMilesAirlinesSearchScreen = this.f24222b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesAirlinesSearchScreen.W;
                        return (j60.a) ((ufg.f) travelMilesAirlinesSearchScreen.T.getValue()).f279702c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesAirlinesSearchScreen.W;
                        qji.b bVarU2 = travelMilesAirlinesSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.airlines.search.di.TravelMilesAirlinesSearchScreenInjector");
                        ufg.g gVar = ((r) bVarU2).f279787b;
                        ufg.f fVar = new ufg.f();
                        fVar.f279700a = e4m.b.b(e4m.c.a(travelMilesAirlinesSearchScreen));
                        int i33 = 19;
                        fVar.f279701b = e4m.b.b(new w0(gVar, fVar, i6, i33));
                        fVar.f279702c = e4m.b.b(new w0(gVar, fVar, i21, i33));
                        fVar.d = e4m.b.b(new w0(gVar, fVar, i22, i33));
                        fVar.e = e4m.b.b(new w0(gVar, fVar, i3, i33));
                        fVar.f = e4m.b.b(new w0(gVar, fVar, i5, i33));
                        fVar.f279703g = e4m.b.b(new w0(gVar, fVar, 6, i33));
                        fVar.f279704h = e4m.b.b(new w0(gVar, fVar, i32, i33));
                        fVar.i = e4m.b.b(new w0(gVar, fVar, 8, i33));
                        fVar.f279705j = e4m.b.b(new w0(gVar, fVar, 7, i33));
                        return fVar;
                    case 2:
                        KProperty[] kPropertyArr3 = TravelMilesAirlinesSearchScreen.W;
                        return (g) ((ufg.f) travelMilesAirlinesSearchScreen.T.getValue()).f279705j.get();
                    default:
                        KProperty[] kPropertyArr4 = TravelMilesAirlinesSearchScreen.W;
                        TravelMilesAirlinesSearchScreen travelMilesAirlinesSearchScreen2 = this.f24222b;
                        return dli.f.a(travelMilesAirlinesSearchScreen2, travelMilesAirlinesSearchScreen2.R2(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), travelMilesAirlinesSearchScreen2.L, travelMilesAirlinesSearchScreen2.M, travelMilesAirlinesSearchScreen2.N), R$id.milesAirlinesSearch_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: chg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesAirlinesSearchScreen f24222b;

            {
                this.f24222b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 4;
                int i5 = 3;
                int i6 = 2;
                int i21 = 1;
                int i222 = 0;
                int i32 = 5;
                TravelMilesAirlinesSearchScreen travelMilesAirlinesSearchScreen = this.f24222b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesAirlinesSearchScreen.W;
                        return (j60.a) ((ufg.f) travelMilesAirlinesSearchScreen.T.getValue()).f279702c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesAirlinesSearchScreen.W;
                        qji.b bVarU2 = travelMilesAirlinesSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.airlines.search.di.TravelMilesAirlinesSearchScreenInjector");
                        ufg.g gVar = ((r) bVarU2).f279787b;
                        ufg.f fVar = new ufg.f();
                        fVar.f279700a = e4m.b.b(e4m.c.a(travelMilesAirlinesSearchScreen));
                        int i33 = 19;
                        fVar.f279701b = e4m.b.b(new w0(gVar, fVar, i6, i33));
                        fVar.f279702c = e4m.b.b(new w0(gVar, fVar, i21, i33));
                        fVar.d = e4m.b.b(new w0(gVar, fVar, i222, i33));
                        fVar.e = e4m.b.b(new w0(gVar, fVar, i3, i33));
                        fVar.f = e4m.b.b(new w0(gVar, fVar, i5, i33));
                        fVar.f279703g = e4m.b.b(new w0(gVar, fVar, 6, i33));
                        fVar.f279704h = e4m.b.b(new w0(gVar, fVar, i32, i33));
                        fVar.i = e4m.b.b(new w0(gVar, fVar, 8, i33));
                        fVar.f279705j = e4m.b.b(new w0(gVar, fVar, 7, i33));
                        return fVar;
                    case 2:
                        KProperty[] kPropertyArr3 = TravelMilesAirlinesSearchScreen.W;
                        return (g) ((ufg.f) travelMilesAirlinesSearchScreen.T.getValue()).f279705j.get();
                    default:
                        KProperty[] kPropertyArr4 = TravelMilesAirlinesSearchScreen.W;
                        TravelMilesAirlinesSearchScreen travelMilesAirlinesSearchScreen2 = this.f24222b;
                        return dli.f.a(travelMilesAirlinesSearchScreen2, travelMilesAirlinesSearchScreen2.R2(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), travelMilesAirlinesSearchScreen2.L, travelMilesAirlinesSearchScreen2.M, travelMilesAirlinesSearchScreen2.N), R$id.milesAirlinesSearch_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: chg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesAirlinesSearchScreen f24222b;

            {
                this.f24222b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 4;
                int i5 = 3;
                int i6 = 2;
                int i21 = 1;
                int i222 = 0;
                int i322 = 5;
                TravelMilesAirlinesSearchScreen travelMilesAirlinesSearchScreen = this.f24222b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesAirlinesSearchScreen.W;
                        return (j60.a) ((ufg.f) travelMilesAirlinesSearchScreen.T.getValue()).f279702c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesAirlinesSearchScreen.W;
                        qji.b bVarU2 = travelMilesAirlinesSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.airlines.search.di.TravelMilesAirlinesSearchScreenInjector");
                        ufg.g gVar = ((r) bVarU2).f279787b;
                        ufg.f fVar = new ufg.f();
                        fVar.f279700a = e4m.b.b(e4m.c.a(travelMilesAirlinesSearchScreen));
                        int i33 = 19;
                        fVar.f279701b = e4m.b.b(new w0(gVar, fVar, i6, i33));
                        fVar.f279702c = e4m.b.b(new w0(gVar, fVar, i21, i33));
                        fVar.d = e4m.b.b(new w0(gVar, fVar, i222, i33));
                        fVar.e = e4m.b.b(new w0(gVar, fVar, i32, i33));
                        fVar.f = e4m.b.b(new w0(gVar, fVar, i5, i33));
                        fVar.f279703g = e4m.b.b(new w0(gVar, fVar, 6, i33));
                        fVar.f279704h = e4m.b.b(new w0(gVar, fVar, i322, i33));
                        fVar.i = e4m.b.b(new w0(gVar, fVar, 8, i33));
                        fVar.f279705j = e4m.b.b(new w0(gVar, fVar, 7, i33));
                        return fVar;
                    case 2:
                        KProperty[] kPropertyArr3 = TravelMilesAirlinesSearchScreen.W;
                        return (g) ((ufg.f) travelMilesAirlinesSearchScreen.T.getValue()).f279705j.get();
                    default:
                        KProperty[] kPropertyArr4 = TravelMilesAirlinesSearchScreen.W;
                        TravelMilesAirlinesSearchScreen travelMilesAirlinesSearchScreen2 = this.f24222b;
                        return dli.f.a(travelMilesAirlinesSearchScreen2, travelMilesAirlinesSearchScreen2.R2(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), travelMilesAirlinesSearchScreen2.L, travelMilesAirlinesSearchScreen2.M, travelMilesAirlinesSearchScreen2.N), R$id.milesAirlinesSearch_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: chg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesAirlinesSearchScreen f24222b;

            {
                this.f24222b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                int i32 = 4;
                int i59 = 3;
                int i6 = 2;
                int i21 = 1;
                int i222 = 0;
                int i322 = 5;
                TravelMilesAirlinesSearchScreen travelMilesAirlinesSearchScreen = this.f24222b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesAirlinesSearchScreen.W;
                        return (j60.a) ((ufg.f) travelMilesAirlinesSearchScreen.T.getValue()).f279702c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesAirlinesSearchScreen.W;
                        qji.b bVarU2 = travelMilesAirlinesSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.airlines.search.di.TravelMilesAirlinesSearchScreenInjector");
                        ufg.g gVar = ((r) bVarU2).f279787b;
                        ufg.f fVar = new ufg.f();
                        fVar.f279700a = e4m.b.b(e4m.c.a(travelMilesAirlinesSearchScreen));
                        int i33 = 19;
                        fVar.f279701b = e4m.b.b(new w0(gVar, fVar, i6, i33));
                        fVar.f279702c = e4m.b.b(new w0(gVar, fVar, i21, i33));
                        fVar.d = e4m.b.b(new w0(gVar, fVar, i222, i33));
                        fVar.e = e4m.b.b(new w0(gVar, fVar, i32, i33));
                        fVar.f = e4m.b.b(new w0(gVar, fVar, i59, i33));
                        fVar.f279703g = e4m.b.b(new w0(gVar, fVar, 6, i33));
                        fVar.f279704h = e4m.b.b(new w0(gVar, fVar, i322, i33));
                        fVar.i = e4m.b.b(new w0(gVar, fVar, 8, i33));
                        fVar.f279705j = e4m.b.b(new w0(gVar, fVar, 7, i33));
                        return fVar;
                    case 2:
                        KProperty[] kPropertyArr3 = TravelMilesAirlinesSearchScreen.W;
                        return (g) ((ufg.f) travelMilesAirlinesSearchScreen.T.getValue()).f279705j.get();
                    default:
                        KProperty[] kPropertyArr4 = TravelMilesAirlinesSearchScreen.W;
                        TravelMilesAirlinesSearchScreen travelMilesAirlinesSearchScreen2 = this.f24222b;
                        return dli.f.a(travelMilesAirlinesSearchScreen2, travelMilesAirlinesSearchScreen2.R2(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), travelMilesAirlinesSearchScreen2.L, travelMilesAirlinesSearchScreen2.M, travelMilesAirlinesSearchScreen2.N), R$id.milesAirlinesSearch_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((chg.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ufg.f) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.S.getValue()).d(v.k(this.O, new RowDelegate(null, null, 7), this.P));
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
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253795b.f59409p.f57336l), null, new i(this, continuation, 16), 3);
        efm.r rVarDistinctUntilChanged = d3().f253795b.f59409p.f57337m.debounce(300L, TimeUnit.MILLISECONDS).map(new d(new g(13), 1)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarDistinctUntilChanged), null, new b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53218h), null, new chg.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52226c), null, new b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f), null, new chg.d(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new b(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new b(this, continuation, 3), 3);
    }

    public final rfg.h d3() {
        ViewBinding value = this.K.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rfg.h) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final chg.g R2() {
        return (chg.g) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.R);
    }
}
