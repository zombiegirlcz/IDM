package com.revolut.feature.travel.miles.impl.ui.screen.main;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import boh.f;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.screen.main.TravelMilesMainScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import eig.g;
import eig.i;
import eig.j;
import eig.l;
import eig.m;
import java.util.List;
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
import ufg.f0;
import ufg.g0;
import vc.s;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/main/TravelMilesMainScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/main/b;", "Ldli/a;", "Leig/m;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesMainScreen extends ViewController<b> implements dli.a {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(TravelMilesMainScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenMilesMainBinding;", 0))};
    public final Object M;
    public final Object N;
    public final RowDelegate P;
    public final SwipeToActionDelegate Q;
    public final TwinHorizontalButtonDelegate R;
    public final LargeActionButtonDelegate S;
    public final FullScreenStateDelegate T;
    public final HeroBannerDelegate U;
    public final Object V;
    public final HeaderDelegate W;
    public final h X;
    public final Object Y;
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

    public TravelMilesMainScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: eig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesMainScreen f126628b;

            {
                this.f126628b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fd6.a aVar;
                int i2 = i;
                TravelMilesMainScreen travelMilesMainScreen = this.f126628b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesMainScreen.Z;
                        qji.b bVarU2 = travelMilesMainScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.main.di.TravelMilesMainScreenInjector");
                        return (g0) ((f0) ((fig.a) bVarU2).j().mo3808a(travelMilesMainScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesMainScreen.Z;
                        g0 g0Var = (g0) travelMilesMainScreen.M.getValue();
                        switch (g0Var.f279726a) {
                            case 0:
                                return (l) g0Var.o.get();
                            default:
                                return (l) g0Var.o.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = TravelMilesMainScreen.Z;
                        g0 g0Var2 = (g0) travelMilesMainScreen.M.getValue();
                        switch (g0Var2.f279726a) {
                            case 0:
                                return (j60.a) g0Var2.d.get();
                            default:
                                return (j60.a) g0Var2.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = TravelMilesMainScreen.Z;
                        TravelMilesMainScreen travelMilesMainScreen2 = this.f126628b;
                        l lVarR2 = travelMilesMainScreen2.R2();
                        List listK = v.k(travelMilesMainScreen2.O, new ListSubheaderDelegate(), travelMilesMainScreen2.Q, new RowLoadingDelegate(), travelMilesMainScreen2.P, travelMilesMainScreen2.S, travelMilesMainScreen2.T, travelMilesMainScreen2.W, travelMilesMainScreen2.U, new TextDelegate());
                        g0 g0Var3 = (g0) travelMilesMainScreen2.M.getValue();
                        switch (g0Var3.f279726a) {
                            case 0:
                                aVar = (fd6.a) g0Var3.f279729g.get();
                                break;
                            default:
                                aVar = (fd6.a) g0Var3.f279729g.get();
                                break;
                        }
                        return dli.f.a(travelMilesMainScreen2, lVarR2, d0.E0(aVar.e, listK), R$id.milesMain_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: eig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesMainScreen f126628b;

            {
                this.f126628b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fd6.a aVar;
                int i22 = i2;
                TravelMilesMainScreen travelMilesMainScreen = this.f126628b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesMainScreen.Z;
                        qji.b bVarU2 = travelMilesMainScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.main.di.TravelMilesMainScreenInjector");
                        return (g0) ((f0) ((fig.a) bVarU2).j().mo3808a(travelMilesMainScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesMainScreen.Z;
                        g0 g0Var = (g0) travelMilesMainScreen.M.getValue();
                        switch (g0Var.f279726a) {
                            case 0:
                                return (l) g0Var.o.get();
                            default:
                                return (l) g0Var.o.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = TravelMilesMainScreen.Z;
                        g0 g0Var2 = (g0) travelMilesMainScreen.M.getValue();
                        switch (g0Var2.f279726a) {
                            case 0:
                                return (j60.a) g0Var2.d.get();
                            default:
                                return (j60.a) g0Var2.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = TravelMilesMainScreen.Z;
                        TravelMilesMainScreen travelMilesMainScreen2 = this.f126628b;
                        l lVarR2 = travelMilesMainScreen2.R2();
                        List listK = v.k(travelMilesMainScreen2.O, new ListSubheaderDelegate(), travelMilesMainScreen2.Q, new RowLoadingDelegate(), travelMilesMainScreen2.P, travelMilesMainScreen2.S, travelMilesMainScreen2.T, travelMilesMainScreen2.W, travelMilesMainScreen2.U, new TextDelegate());
                        g0 g0Var3 = (g0) travelMilesMainScreen2.M.getValue();
                        switch (g0Var3.f279726a) {
                            case 0:
                                aVar = (fd6.a) g0Var3.f279729g.get();
                                break;
                            default:
                                aVar = (fd6.a) g0Var3.f279729g.get();
                                break;
                        }
                        return dli.f.a(travelMilesMainScreen2, lVarR2, d0.E0(aVar.e, listK), R$id.milesMain_recyclerView, null, null, null, 56);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new SwipeToActionDelegate(rowDelegate, false);
        this.R = new TwinHorizontalButtonDelegate();
        this.S = new LargeActionButtonDelegate();
        this.T = new FullScreenStateDelegate();
        this.U = new HeroBannerDelegate(0);
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: eig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesMainScreen f126628b;

            {
                this.f126628b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fd6.a aVar;
                int i22 = i3;
                TravelMilesMainScreen travelMilesMainScreen = this.f126628b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesMainScreen.Z;
                        qji.b bVarU2 = travelMilesMainScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.main.di.TravelMilesMainScreenInjector");
                        return (g0) ((f0) ((fig.a) bVarU2).j().mo3808a(travelMilesMainScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesMainScreen.Z;
                        g0 g0Var = (g0) travelMilesMainScreen.M.getValue();
                        switch (g0Var.f279726a) {
                            case 0:
                                return (l) g0Var.o.get();
                            default:
                                return (l) g0Var.o.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = TravelMilesMainScreen.Z;
                        g0 g0Var2 = (g0) travelMilesMainScreen.M.getValue();
                        switch (g0Var2.f279726a) {
                            case 0:
                                return (j60.a) g0Var2.d.get();
                            default:
                                return (j60.a) g0Var2.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = TravelMilesMainScreen.Z;
                        TravelMilesMainScreen travelMilesMainScreen2 = this.f126628b;
                        l lVarR2 = travelMilesMainScreen2.R2();
                        List listK = v.k(travelMilesMainScreen2.O, new ListSubheaderDelegate(), travelMilesMainScreen2.Q, new RowLoadingDelegate(), travelMilesMainScreen2.P, travelMilesMainScreen2.S, travelMilesMainScreen2.T, travelMilesMainScreen2.W, travelMilesMainScreen2.U, new TextDelegate());
                        g0 g0Var3 = (g0) travelMilesMainScreen2.M.getValue();
                        switch (g0Var3.f279726a) {
                            case 0:
                                aVar = (fd6.a) g0Var3.f279729g.get();
                                break;
                            default:
                                aVar = (fd6.a) g0Var3.f279729g.get();
                                break;
                        }
                        return dli.f.a(travelMilesMainScreen2, lVarR2, d0.E0(aVar.e, listK), R$id.milesMain_recyclerView, null, null, null, 56);
                }
            }
        });
        this.W = new HeaderDelegate();
        this.X = s.t(this, a.f);
        final int i5 = 3;
        this.Y = w.y0(new Function0(this) { // from class: eig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesMainScreen f126628b;

            {
                this.f126628b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fd6.a aVar;
                int i22 = i5;
                TravelMilesMainScreen travelMilesMainScreen = this.f126628b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesMainScreen.Z;
                        qji.b bVarU2 = travelMilesMainScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.main.di.TravelMilesMainScreenInjector");
                        return (g0) ((f0) ((fig.a) bVarU2).j().mo3808a(travelMilesMainScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesMainScreen.Z;
                        g0 g0Var = (g0) travelMilesMainScreen.M.getValue();
                        switch (g0Var.f279726a) {
                            case 0:
                                return (l) g0Var.o.get();
                            default:
                                return (l) g0Var.o.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = TravelMilesMainScreen.Z;
                        g0 g0Var2 = (g0) travelMilesMainScreen.M.getValue();
                        switch (g0Var2.f279726a) {
                            case 0:
                                return (j60.a) g0Var2.d.get();
                            default:
                                return (j60.a) g0Var2.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = TravelMilesMainScreen.Z;
                        TravelMilesMainScreen travelMilesMainScreen2 = this.f126628b;
                        l lVarR2 = travelMilesMainScreen2.R2();
                        List listK = v.k(travelMilesMainScreen2.O, new ListSubheaderDelegate(), travelMilesMainScreen2.Q, new RowLoadingDelegate(), travelMilesMainScreen2.P, travelMilesMainScreen2.S, travelMilesMainScreen2.T, travelMilesMainScreen2.W, travelMilesMainScreen2.U, new TextDelegate());
                        g0 g0Var3 = (g0) travelMilesMainScreen2.M.getValue();
                        switch (g0Var3.f279726a) {
                            case 0:
                                aVar = (fd6.a) g0Var3.f279729g.get();
                                break;
                            default:
                                aVar = (fd6.a) g0Var3.f279729g.get();
                                break;
                        }
                        return dli.f.a(travelMilesMainScreen2, lVarR2, d0.E0(aVar.e, listK), R$id.milesMain_recyclerView, null, null, null, 56);
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
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        KProperty[] kPropertyArr = Z;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.X;
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
        return (g0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.V.getValue()).d(v.k(this.R, new RowDelegate(null, null, 7), this.S));
        pd.b.p(view, new TextLocalisedClause(R$string.miles_tab_airlines, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.R;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new eig.d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new eig.d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53218h), null, new eig.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f), null, new eig.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53283c.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.d.f121375b), null, new eig.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((j60.a) this.V.getValue()).C()), null, new eig.d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f52371h.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.W.f52395j), null, new j(this, null), 3);
        HeroBannerDelegate heroBannerDelegate = this.U;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(heroBannerDelegate.d), null, new eig.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(heroBannerDelegate.e), null, new eig.c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Y.getValue();
    }
}
