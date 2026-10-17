package com.revolut.feature.travel.miles.impl.ui.screen.home;

import aig.g;
import aig.j;
import aig.k;
import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import boh.f;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.screen.home.TravelMilesHomeScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import ufg.d0;
import ufg.e0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/home/TravelMilesHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/home/b;", "Ldli/a;", "Laig/k;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesHomeScreen extends ViewController<b> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(TravelMilesHomeScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenMilesMainBinding;", 0))};
    public final Object M;
    public final Object N;
    public final RowDelegate P;
    public final SwipeToActionDelegate Q;
    public final LargeActionButtonDelegate R;
    public final FullScreenStateDelegate S;
    public final HeroBannerDelegate T;
    public final h U;
    public final Object V;
    public final int K = R$layout.screen_miles_main;
    public final int L = R$style.TransparentNavigationBarMarkerTheme;
    public final SearchButtonDelegate O = new SearchButtonDelegate();

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, rfg.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/miles/impl/databinding/ScreenMilesMainBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return rfg.c.a(p0);
        }
    }

    public TravelMilesHomeScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: aig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesHomeScreen f5261b;

            {
                this.f5261b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fd6.a aVar;
                int i2 = i;
                TravelMilesHomeScreen travelMilesHomeScreen = this.f5261b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesHomeScreen.W;
                        qji.b bVarU2 = travelMilesHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.home.di.TravelMilesHomeScreenInjector");
                        return (e0) ((d0) ((big.a) bVarU2).b().mo3808a(travelMilesHomeScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesHomeScreen.W;
                        e0 e0Var = (e0) travelMilesHomeScreen.M.getValue();
                        switch (e0Var.f279691a) {
                            case 0:
                                return (j) e0Var.o.get();
                            default:
                                return (j) e0Var.o.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesHomeScreen.W;
                        TravelMilesHomeScreen travelMilesHomeScreen2 = this.f5261b;
                        j jVarR2 = travelMilesHomeScreen2.R2();
                        List listK = v.k(travelMilesHomeScreen2.O, new ListSubheaderDelegate(), travelMilesHomeScreen2.Q, new RowLoadingDelegate(), travelMilesHomeScreen2.P, travelMilesHomeScreen2.R, travelMilesHomeScreen2.S, travelMilesHomeScreen2.T, new TextDelegate());
                        e0 e0Var2 = (e0) travelMilesHomeScreen2.M.getValue();
                        switch (e0Var2.f279691a) {
                            case 0:
                                aVar = (fd6.a) e0Var2.f279694g.get();
                                break;
                            default:
                                aVar = (fd6.a) e0Var2.f279694g.get();
                                break;
                        }
                        return dli.f.a(travelMilesHomeScreen2, jVarR2, zhm.d0.E0(aVar.e, listK), R$id.milesMain_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: aig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesHomeScreen f5261b;

            {
                this.f5261b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fd6.a aVar;
                int i22 = i2;
                TravelMilesHomeScreen travelMilesHomeScreen = this.f5261b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesHomeScreen.W;
                        qji.b bVarU2 = travelMilesHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.home.di.TravelMilesHomeScreenInjector");
                        return (e0) ((d0) ((big.a) bVarU2).b().mo3808a(travelMilesHomeScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesHomeScreen.W;
                        e0 e0Var = (e0) travelMilesHomeScreen.M.getValue();
                        switch (e0Var.f279691a) {
                            case 0:
                                return (j) e0Var.o.get();
                            default:
                                return (j) e0Var.o.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesHomeScreen.W;
                        TravelMilesHomeScreen travelMilesHomeScreen2 = this.f5261b;
                        j jVarR2 = travelMilesHomeScreen2.R2();
                        List listK = v.k(travelMilesHomeScreen2.O, new ListSubheaderDelegate(), travelMilesHomeScreen2.Q, new RowLoadingDelegate(), travelMilesHomeScreen2.P, travelMilesHomeScreen2.R, travelMilesHomeScreen2.S, travelMilesHomeScreen2.T, new TextDelegate());
                        e0 e0Var2 = (e0) travelMilesHomeScreen2.M.getValue();
                        switch (e0Var2.f279691a) {
                            case 0:
                                aVar = (fd6.a) e0Var2.f279694g.get();
                                break;
                            default:
                                aVar = (fd6.a) e0Var2.f279694g.get();
                                break;
                        }
                        return dli.f.a(travelMilesHomeScreen2, jVarR2, zhm.d0.E0(aVar.e, listK), R$id.milesMain_recyclerView, null, null, null, 56);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new SwipeToActionDelegate(rowDelegate, false);
        this.R = new LargeActionButtonDelegate();
        this.S = new FullScreenStateDelegate();
        this.T = new HeroBannerDelegate(0);
        this.U = s.t(this, a.f);
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: aig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesHomeScreen f5261b;

            {
                this.f5261b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fd6.a aVar;
                int i22 = i3;
                TravelMilesHomeScreen travelMilesHomeScreen = this.f5261b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesHomeScreen.W;
                        qji.b bVarU2 = travelMilesHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.home.di.TravelMilesHomeScreenInjector");
                        return (e0) ((d0) ((big.a) bVarU2).b().mo3808a(travelMilesHomeScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesHomeScreen.W;
                        e0 e0Var = (e0) travelMilesHomeScreen.M.getValue();
                        switch (e0Var.f279691a) {
                            case 0:
                                return (j) e0Var.o.get();
                            default:
                                return (j) e0Var.o.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesHomeScreen.W;
                        TravelMilesHomeScreen travelMilesHomeScreen2 = this.f5261b;
                        j jVarR2 = travelMilesHomeScreen2.R2();
                        List listK = v.k(travelMilesHomeScreen2.O, new ListSubheaderDelegate(), travelMilesHomeScreen2.Q, new RowLoadingDelegate(), travelMilesHomeScreen2.P, travelMilesHomeScreen2.R, travelMilesHomeScreen2.S, travelMilesHomeScreen2.T, new TextDelegate());
                        e0 e0Var2 = (e0) travelMilesHomeScreen2.M.getValue();
                        switch (e0Var2.f279691a) {
                            case 0:
                                aVar = (fd6.a) e0Var2.f279694g.get();
                                break;
                            default:
                                aVar = (fd6.a) e0Var2.f279694g.get();
                                break;
                        }
                        return dli.f.a(travelMilesHomeScreen2, jVarR2, zhm.d0.E0(aVar.e, listK), R$id.milesMain_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.L);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        KProperty[] kPropertyArr = W;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.U;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ScreenContentRecyclerView milesMainRecyclerView = ((rfg.c) value).f253782b;
        Intrinsics.checkNotNullExpressionValue(milesMainRecyclerView, "milesMainRecyclerView");
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        knm.b.v(f.p(context), milesMainRecyclerView);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((rfg.c) value2).f253782b.setClipToPadding(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (e0) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.miles_tab_airlines, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53218h), null, new aig.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f), null, new aig.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53283c.f121375b), null, new aig.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.d.f121375b), null, new aig.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f52371h.f121375b), null, new aig.f(this, null), 3);
        HeroBannerDelegate heroBannerDelegate = this.T;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(heroBannerDelegate.d), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(heroBannerDelegate.e), null, new aig.h(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
