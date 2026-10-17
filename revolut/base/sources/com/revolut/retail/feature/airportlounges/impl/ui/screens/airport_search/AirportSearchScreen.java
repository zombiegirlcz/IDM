package com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_search;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_search.AirportSearchScreen;
import cwi.f0;
import cwi.n0;
import efm.r;
import frl.a;
import grl.k9;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.m;
import org.jetbrains.annotations.NotNull;
import te0.w;
import v0f.p;
import vc.s;
import wkg.e;
import wp5.y;
import wwi.d;
import wwi.j;
import wwi.k;
import wwi.l;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/airport_search/AirportSearchScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lwwi/l;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lwwi/j;", "Lno/m;", "<init>", "()V", "Companion", "a", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportSearchScreen extends BaseRecyclerViewScreen<l, IOData$EmptyInput, j> implements m {
    public final AnalyticsProduct.Retail U;
    public final int V;
    public final boolean W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f99038a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f99039b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f99040d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f99037e0 = {o0.f186429a.j(new h0(AirportSearchScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_search.AirportSearchScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, jii.m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jii.m.a(p0);
        }
    }

    public AirportSearchScreen() {
        super(IOData$EmptyInput.f98299a);
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137495b;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.V = R$layout.screen_recycler_navbar;
        this.W = true;
        this.X = s.t(this, b.f);
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: wwi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportSearchScreen f300670b;

            {
                this.f300670b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportSearchScreen airportSearchScreen = this.f300670b;
                switch (i2) {
                    case 0:
                        AirportSearchScreen.Companion companion2 = AirportSearchScreen.INSTANCE;
                        qji.b bVarQ2 = airportSearchScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_search.di.AirportSearchScreenInjector");
                        f0 f0Var = (f0) bVarQ2;
                        return new n0(f0Var.f109668b, f0Var.f109669c, airportSearchScreen);
                    case 1:
                        AirportSearchScreen.Companion companion3 = AirportSearchScreen.INSTANCE;
                        return (k) ((n0) airportSearchScreen.Y.getValue()).e.get();
                    case 2:
                        AirportSearchScreen.Companion companion4 = AirportSearchScreen.INSTANCE;
                        return new z4l.j((List) zhm.f0.f322471a, true, airportSearchScreen.Q, true);
                    default:
                        AirportSearchScreen.Companion companion5 = AirportSearchScreen.INSTANCE;
                        return v.k((RowDelegate) airportSearchScreen.f99039b0.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), (FullScreenStateDelegate) airportSearchScreen.c0.getValue(), new CellDetailsLoadingDelegate());
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: wwi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportSearchScreen f300670b;

            {
                this.f300670b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportSearchScreen airportSearchScreen = this.f300670b;
                switch (i22) {
                    case 0:
                        AirportSearchScreen.Companion companion2 = AirportSearchScreen.INSTANCE;
                        qji.b bVarQ2 = airportSearchScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_search.di.AirportSearchScreenInjector");
                        f0 f0Var = (f0) bVarQ2;
                        return new n0(f0Var.f109668b, f0Var.f109669c, airportSearchScreen);
                    case 1:
                        AirportSearchScreen.Companion companion3 = AirportSearchScreen.INSTANCE;
                        return (k) ((n0) airportSearchScreen.Y.getValue()).e.get();
                    case 2:
                        AirportSearchScreen.Companion companion4 = AirportSearchScreen.INSTANCE;
                        return new z4l.j((List) zhm.f0.f322471a, true, airportSearchScreen.Q, true);
                    default:
                        AirportSearchScreen.Companion companion5 = AirportSearchScreen.INSTANCE;
                        return v.k((RowDelegate) airportSearchScreen.f99039b0.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), (FullScreenStateDelegate) airportSearchScreen.c0.getValue(), new CellDetailsLoadingDelegate());
                }
            }
        });
        final int i3 = 2;
        this.f99038a0 = w.y0(new Function0(this) { // from class: wwi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportSearchScreen f300670b;

            {
                this.f300670b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AirportSearchScreen airportSearchScreen = this.f300670b;
                switch (i22) {
                    case 0:
                        AirportSearchScreen.Companion companion2 = AirportSearchScreen.INSTANCE;
                        qji.b bVarQ2 = airportSearchScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_search.di.AirportSearchScreenInjector");
                        f0 f0Var = (f0) bVarQ2;
                        return new n0(f0Var.f109668b, f0Var.f109669c, airportSearchScreen);
                    case 1:
                        AirportSearchScreen.Companion companion3 = AirportSearchScreen.INSTANCE;
                        return (k) ((n0) airportSearchScreen.Y.getValue()).e.get();
                    case 2:
                        AirportSearchScreen.Companion companion4 = AirportSearchScreen.INSTANCE;
                        return new z4l.j((List) zhm.f0.f322471a, true, airportSearchScreen.Q, true);
                    default:
                        AirportSearchScreen.Companion companion5 = AirportSearchScreen.INSTANCE;
                        return v.k((RowDelegate) airportSearchScreen.f99039b0.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), (FullScreenStateDelegate) airportSearchScreen.c0.getValue(), new CellDetailsLoadingDelegate());
                }
            }
        });
        this.f99039b0 = w.y0(new wq1.a(25));
        this.c0 = w.y0(new wq1.a(26));
        final int i5 = 3;
        this.f99040d0 = w.y0(new Function0(this) { // from class: wwi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportSearchScreen f300670b;

            {
                this.f300670b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AirportSearchScreen airportSearchScreen = this.f300670b;
                switch (i22) {
                    case 0:
                        AirportSearchScreen.Companion companion2 = AirportSearchScreen.INSTANCE;
                        qji.b bVarQ2 = airportSearchScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_search.di.AirportSearchScreenInjector");
                        f0 f0Var = (f0) bVarQ2;
                        return new n0(f0Var.f109668b, f0Var.f109669c, airportSearchScreen);
                    case 1:
                        AirportSearchScreen.Companion companion3 = AirportSearchScreen.INSTANCE;
                        return (k) ((n0) airportSearchScreen.Y.getValue()).e.get();
                    case 2:
                        AirportSearchScreen.Companion companion4 = AirportSearchScreen.INSTANCE;
                        return new z4l.j((List) zhm.f0.f322471a, true, airportSearchScreen.Q, true);
                    default:
                        AirportSearchScreen.Companion companion5 = AirportSearchScreen.INSTANCE;
                        return v.k((RowDelegate) airportSearchScreen.f99039b0.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), (FullScreenStateDelegate) airportSearchScreen.c0.getValue(), new CellDetailsLoadingDelegate());
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (n0) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (k) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, y.x(g3().f174539b.f59410q, g3().f174539b.f59409p.f57336l, "mergeWith(...)"), null, new e(this, null, 20), 3);
        r rVarDebounce = g3().f174539b.f59409p.f57337m.debounce(300L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarDebounce), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.c0.getValue()).f52371h.f121375b), null, new wwi.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new p(new wvl.b(rd0.e.b(((RowDelegate) this.f99039b0.getValue()).f53218h), 2), 17), null, new d(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.E0();
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.airport_lounges_airport_search_search_input_hint, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF0() {
        return (List) this.f99040d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final koi.h d3() {
        return (z4l.j) this.f99038a0.getValue();
    }

    public final jii.m g3() {
        ViewBinding value = this.X.getValue(this, f99037e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
