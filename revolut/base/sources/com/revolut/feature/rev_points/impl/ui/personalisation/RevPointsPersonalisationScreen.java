package com.revolut.feature.rev_points.impl.ui.personalisation;

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
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.impl.ui.personalisation.RevPointsPersonalisationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import se4.c;
import szb.d;
import szb.j;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;
import zxb.k0;
import zxb.l0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/personalisation/RevPointsPersonalisationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lszb/d;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsPersonalisationScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(RevPointsPersonalisationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object O;
    public final Object P;
    public final int K = R$layout.screen_recycler_navbar;
    public final RowDelegate L = new RowDelegate(null, null, 7);
    public final h N = s.t(this, a.f);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public RevPointsPersonalisationScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: szb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPersonalisationScreen f266783b;

            {
                this.f266783b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsPersonalisationScreen revPointsPersonalisationScreen = this.f266783b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsPersonalisationScreen.Q;
                        RevPointsPersonalisationScreen revPointsPersonalisationScreen2 = this.f266783b;
                        return dli.f.a(revPointsPersonalisationScreen2, (j) revPointsPersonalisationScreen2.P.getValue(), v.k(revPointsPersonalisationScreen2.L, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsPersonalisationScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsPersonalisationScreen.m2()).a().get(k0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k0.class, " is not found"));
                        }
                        k0 k0Var = ((k0) aVar2.b()).A;
                        l0 l0Var = new l0();
                        l0Var.f326218a = e4m.b.b(new zu8.o0(k0Var, 7));
                        return l0Var;
                    default:
                        KProperty[] kPropertyArr3 = RevPointsPersonalisationScreen.Q;
                        return (j) ((l0) revPointsPersonalisationScreen.O.getValue()).f326218a.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: szb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPersonalisationScreen f266783b;

            {
                this.f266783b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsPersonalisationScreen revPointsPersonalisationScreen = this.f266783b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsPersonalisationScreen.Q;
                        RevPointsPersonalisationScreen revPointsPersonalisationScreen2 = this.f266783b;
                        return dli.f.a(revPointsPersonalisationScreen2, (j) revPointsPersonalisationScreen2.P.getValue(), v.k(revPointsPersonalisationScreen2.L, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsPersonalisationScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsPersonalisationScreen.m2()).a().get(k0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k0.class, " is not found"));
                        }
                        k0 k0Var = ((k0) aVar2.b()).A;
                        l0 l0Var = new l0();
                        l0Var.f326218a = e4m.b.b(new zu8.o0(k0Var, 7));
                        return l0Var;
                    default:
                        KProperty[] kPropertyArr3 = RevPointsPersonalisationScreen.Q;
                        return (j) ((l0) revPointsPersonalisationScreen.O.getValue()).f326218a.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: szb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPersonalisationScreen f266783b;

            {
                this.f266783b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsPersonalisationScreen revPointsPersonalisationScreen = this.f266783b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsPersonalisationScreen.Q;
                        RevPointsPersonalisationScreen revPointsPersonalisationScreen2 = this.f266783b;
                        return dli.f.a(revPointsPersonalisationScreen2, (j) revPointsPersonalisationScreen2.P.getValue(), v.k(revPointsPersonalisationScreen2.L, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsPersonalisationScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsPersonalisationScreen.m2()).a().get(k0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k0.class, " is not found"));
                        }
                        k0 k0Var = ((k0) aVar2.b()).A;
                        l0 l0Var = new l0();
                        l0Var.f326218a = e4m.b.b(new zu8.o0(k0Var, 7));
                        return l0Var;
                    default:
                        KProperty[] kPropertyArr3 = RevPointsPersonalisationScreen.Q;
                        return (j) ((l0) revPointsPersonalisationScreen.O.getValue()).f326218a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f266788b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(uiState.f266789c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (j) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new c(this, continuation, 29), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53225r), new szb.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.x0()), new sy6.j(this, continuation, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
