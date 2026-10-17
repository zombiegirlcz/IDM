package com.revolut.feature.global_markets.impl.ui.redesign.screen.global;

import aii.q;
import android.view.View;
import avk.j;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.global.GlobalDetailsScreen;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.ui_kit_globe_view.delegate.GlobeDelegate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import o87.c;
import o87.f;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/global_markets/impl/ui/redesign/screen/global/GlobalDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lo87/c;", "<init>", "()V", "feature_global_markets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GlobalDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(GlobalDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0))};
    public final int K = R$layout.screen_recycler_view;
    public final int L = R$style.UiKitTheme_Mono;
    public final ListSubheaderDelegate M = new ListSubheaderDelegate();
    public final FullScreenStateDelegate N = new FullScreenStateDelegate();
    public final GlobeDelegate O = new GlobeDelegate();
    public final RowDelegate P = new RowDelegate(null, null, 7);
    public final RowLoadingDelegate Q = new RowLoadingDelegate();
    public final TextDelegate R = new TextDelegate();
    public final Object S;
    public final Object T;
    public final Object U;
    public final j V;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, pji.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return pji.a.a(p0);
        }
    }

    public GlobalDetailsScreen() {
        s.t(this, a.f);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: o87.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalDetailsScreen f222947b;

            {
                this.f222947b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GlobalDetailsScreen globalDetailsScreen = this.f222947b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GlobalDetailsScreen.W;
                        qji.b bVarU2 = globalDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.global_markets.impl.ui.redesign.screen.global.di.GlobalDetailsScreenInjector");
                        y77.d dVar = (y77.d) bVarU2;
                        y77.c cVar = dVar.f311377a;
                        y77.d dVar2 = dVar.f311378b;
                        FullScreenStateDelegate fullScreenStateDelegate = globalDetailsScreen.N;
                        h87.d dVar3 = new h87.d(fullScreenStateDelegate, globalDetailsScreen.M, globalDetailsScreen.P, globalDetailsScreen.Q);
                        j87.b bVar = new j87.b(fullScreenStateDelegate, globalDetailsScreen.O);
                        j jVar = globalDetailsScreen.V;
                        jVar.getClass();
                        return new y77.a(cVar, dVar2, dVar3, bVar, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = GlobalDetailsScreen.W;
                        return (f) ((y77.a) globalDetailsScreen.S.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = GlobalDetailsScreen.W;
                        GlobalDetailsScreen globalDetailsScreen2 = this.f222947b;
                        return dli.f.a(globalDetailsScreen2, (f) globalDetailsScreen2.T.getValue(), v.k(globalDetailsScreen2.N, globalDetailsScreen2.M, globalDetailsScreen2.P, globalDetailsScreen2.Q, globalDetailsScreen2.R, globalDetailsScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: o87.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalDetailsScreen f222947b;

            {
                this.f222947b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GlobalDetailsScreen globalDetailsScreen = this.f222947b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GlobalDetailsScreen.W;
                        qji.b bVarU2 = globalDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.global_markets.impl.ui.redesign.screen.global.di.GlobalDetailsScreenInjector");
                        y77.d dVar = (y77.d) bVarU2;
                        y77.c cVar = dVar.f311377a;
                        y77.d dVar2 = dVar.f311378b;
                        FullScreenStateDelegate fullScreenStateDelegate = globalDetailsScreen.N;
                        h87.d dVar3 = new h87.d(fullScreenStateDelegate, globalDetailsScreen.M, globalDetailsScreen.P, globalDetailsScreen.Q);
                        j87.b bVar = new j87.b(fullScreenStateDelegate, globalDetailsScreen.O);
                        j jVar = globalDetailsScreen.V;
                        jVar.getClass();
                        return new y77.a(cVar, dVar2, dVar3, bVar, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = GlobalDetailsScreen.W;
                        return (f) ((y77.a) globalDetailsScreen.S.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = GlobalDetailsScreen.W;
                        GlobalDetailsScreen globalDetailsScreen2 = this.f222947b;
                        return dli.f.a(globalDetailsScreen2, (f) globalDetailsScreen2.T.getValue(), v.k(globalDetailsScreen2.N, globalDetailsScreen2.M, globalDetailsScreen2.P, globalDetailsScreen2.Q, globalDetailsScreen2.R, globalDetailsScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: o87.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalDetailsScreen f222947b;

            {
                this.f222947b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GlobalDetailsScreen globalDetailsScreen = this.f222947b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GlobalDetailsScreen.W;
                        qji.b bVarU2 = globalDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.global_markets.impl.ui.redesign.screen.global.di.GlobalDetailsScreenInjector");
                        y77.d dVar = (y77.d) bVarU2;
                        y77.c cVar = dVar.f311377a;
                        y77.d dVar2 = dVar.f311378b;
                        FullScreenStateDelegate fullScreenStateDelegate = globalDetailsScreen.N;
                        h87.d dVar3 = new h87.d(fullScreenStateDelegate, globalDetailsScreen.M, globalDetailsScreen.P, globalDetailsScreen.Q);
                        j87.b bVar = new j87.b(fullScreenStateDelegate, globalDetailsScreen.O);
                        j jVar = globalDetailsScreen.V;
                        jVar.getClass();
                        return new y77.a(cVar, dVar2, dVar3, bVar, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = GlobalDetailsScreen.W;
                        return (f) ((y77.a) globalDetailsScreen.S.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = GlobalDetailsScreen.W;
                        GlobalDetailsScreen globalDetailsScreen2 = this.f222947b;
                        return dli.f.a(globalDetailsScreen2, (f) globalDetailsScreen2.T.getValue(), v.k(globalDetailsScreen2.N, globalDetailsScreen2.M, globalDetailsScreen2.P, globalDetailsScreen2.Q, globalDetailsScreen2.R, globalDetailsScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        this.V = new j(this, 19);
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getK() {
        return Integer.valueOf(this.L);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y77.a) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.invest_markets_tabs_global_title, null, null, 14));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
