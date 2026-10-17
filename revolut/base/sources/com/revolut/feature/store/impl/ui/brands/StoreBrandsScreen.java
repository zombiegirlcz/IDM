package com.revolut.feature.store.impl.ui.brands;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.full_screen_prompt.R$id;
import com.revolut.feature.store.impl.R$layout;
import com.revolut.feature.store.impl.ui.brands.StoreBrandsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import h2e.e;
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
import mx0.l;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import y2e.c;
import y2e.g;
import y2e.p;
import yp0.v;
import yp0.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/feature/store/impl/ui/brands/StoreBrandsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ly2e/c;", "Ldli/a;", "Ly2e/h;", "Lc2e/b;", "<init>", "()V", "Companion", "a", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoreBrandsScreen extends ViewController<c> implements dli.a, c2e.b {
    public v M;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(StoreBrandsScreen.class, "binding", "getBinding()Lcom/revolut/feature/store/impl/databinding/ScreenStoreBrandsBinding;", 0))};

    @NotNull
    private static final a Companion = new a();
    public final RowDelegate K = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate L = new FullScreenStateDelegate();
    public final h N = s.t(this, b.f);
    public final int O = R$layout.screen_store_brands;

    public static final class a {
        private a() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, e.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/store/impl/databinding/ScreenStoreBrandsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.recyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                i = com.revolut.feature.store.impl.R$id.storeBrands_quickFiltersActions;
                ActionsView actionsView = (ActionsView) ViewBindings.findChildViewById(p0, i);
                if (actionsView != null) {
                    return new e((ControllerContainerFrameLayout) p0, actionsView);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public StoreBrandsScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: y2e.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandsScreen f310653b;

            {
                this.f310653b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StoreBrandsScreen storeBrandsScreen = this.f310653b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StoreBrandsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(storeBrandsScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (k2e.q) ((k2e.p) ((z2e.a) aVar2.b()).j().mo3808a(storeBrandsScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StoreBrandsScreen.T;
                        k2e.q qVar = (k2e.q) storeBrandsScreen.P.getValue();
                        switch (qVar.f180544a) {
                            case 0:
                                return (g) qVar.e.get();
                            default:
                                return (g) qVar.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = StoreBrandsScreen.T;
                        k2e.q qVar2 = (k2e.q) storeBrandsScreen.P.getValue();
                        switch (qVar2.f180544a) {
                            case 0:
                                return (on.a) qVar2.f.get();
                            default:
                                return (on.a) qVar2.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = StoreBrandsScreen.T;
                        StoreBrandsScreen storeBrandsScreen2 = this.f310653b;
                        return dli.f.a(storeBrandsScreen2, storeBrandsScreen2.R2(), zhm.v.k(storeBrandsScreen2.K, new RowLoadingDelegate(), storeBrandsScreen2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: y2e.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandsScreen f310653b;

            {
                this.f310653b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StoreBrandsScreen storeBrandsScreen = this.f310653b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoreBrandsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(storeBrandsScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (k2e.q) ((k2e.p) ((z2e.a) aVar2.b()).j().mo3808a(storeBrandsScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StoreBrandsScreen.T;
                        k2e.q qVar = (k2e.q) storeBrandsScreen.P.getValue();
                        switch (qVar.f180544a) {
                            case 0:
                                return (g) qVar.e.get();
                            default:
                                return (g) qVar.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = StoreBrandsScreen.T;
                        k2e.q qVar2 = (k2e.q) storeBrandsScreen.P.getValue();
                        switch (qVar2.f180544a) {
                            case 0:
                                return (on.a) qVar2.f.get();
                            default:
                                return (on.a) qVar2.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = StoreBrandsScreen.T;
                        StoreBrandsScreen storeBrandsScreen2 = this.f310653b;
                        return dli.f.a(storeBrandsScreen2, storeBrandsScreen2.R2(), zhm.v.k(storeBrandsScreen2.K, new RowLoadingDelegate(), storeBrandsScreen2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: y2e.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandsScreen f310653b;

            {
                this.f310653b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StoreBrandsScreen storeBrandsScreen = this.f310653b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoreBrandsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(storeBrandsScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (k2e.q) ((k2e.p) ((z2e.a) aVar2.b()).j().mo3808a(storeBrandsScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StoreBrandsScreen.T;
                        k2e.q qVar = (k2e.q) storeBrandsScreen.P.getValue();
                        switch (qVar.f180544a) {
                            case 0:
                                return (g) qVar.e.get();
                            default:
                                return (g) qVar.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = StoreBrandsScreen.T;
                        k2e.q qVar2 = (k2e.q) storeBrandsScreen.P.getValue();
                        switch (qVar2.f180544a) {
                            case 0:
                                return (on.a) qVar2.f.get();
                            default:
                                return (on.a) qVar2.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = StoreBrandsScreen.T;
                        StoreBrandsScreen storeBrandsScreen2 = this.f310653b;
                        return dli.f.a(storeBrandsScreen2, storeBrandsScreen2.R2(), zhm.v.k(storeBrandsScreen2.K, new RowLoadingDelegate(), storeBrandsScreen2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: y2e.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandsScreen f310653b;

            {
                this.f310653b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                StoreBrandsScreen storeBrandsScreen = this.f310653b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoreBrandsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(storeBrandsScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (k2e.q) ((k2e.p) ((z2e.a) aVar2.b()).j().mo3808a(storeBrandsScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StoreBrandsScreen.T;
                        k2e.q qVar = (k2e.q) storeBrandsScreen.P.getValue();
                        switch (qVar.f180544a) {
                            case 0:
                                return (g) qVar.e.get();
                            default:
                                return (g) qVar.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = StoreBrandsScreen.T;
                        k2e.q qVar2 = (k2e.q) storeBrandsScreen.P.getValue();
                        switch (qVar2.f180544a) {
                            case 0:
                                return (on.a) qVar2.f.get();
                            default:
                                return (on.a) qVar2.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = StoreBrandsScreen.T;
                        StoreBrandsScreen storeBrandsScreen2 = this.f310653b;
                        return dli.f.a(storeBrandsScreen2, storeBrandsScreen2.R2(), zhm.v.k(storeBrandsScreen2.K, new RowLoadingDelegate(), storeBrandsScreen2.L), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        y2e.h uiState = (y2e.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ActionsView storeBrandsQuickFiltersActions = d3().f148805b;
        Intrinsics.checkNotNullExpressionValue(storeBrandsQuickFiltersActions, "storeBrandsQuickFiltersActions");
        List list = uiState.f310642b;
        storeBrandsQuickFiltersActions.setVisibility(!list.isEmpty() ? 0 : 8);
        d3().f148805b.k(list, uiState.f310643c);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getU() {
        return new AnalyticsProduct.Retail(super.f0());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k2e.q) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f148805b.setLayoutType(l.SCROLLABLE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        v vVar = this.M;
        if (vVar != null) {
            ((dli.c) this.S.getValue()).h().removeOnScrollListener(vVar);
        }
        this.M = null;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.S;
        this.M = y.a(((dli.c) r56.getValue()).h(), 3, true, new y1.a(this, 7));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.K.f53218h), null, new y2e.o(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52371h.f121375b), null, new p(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f148805b.f58296a.f121375b), null, new y2e.q(this, null), 3);
        ViewController.P2(this, ((sn.a) ((on.a) this.R.getValue())).b(((dli.c) r56.getValue()).h(), false), new xv4.o(this, (Continuation) null, 18), 3);
    }

    public final e d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.Q.getValue();
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
}
