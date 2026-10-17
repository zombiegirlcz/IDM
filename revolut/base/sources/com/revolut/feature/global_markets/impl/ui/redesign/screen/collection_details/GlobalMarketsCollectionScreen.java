package com.revolut.feature.global_markets.impl.ui.redesign.screen.collection_details;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import cli.o;
import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.collection_details.GlobalMarketsCollectionScreen;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.collection_details.GlobalMarketsCollectionScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dli.c;
import java.util.Iterator;
import koi.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx5.g;
import n87.d;
import n87.i;
import n87.m;
import n87.n;
import n87.u;
import qv0.p;
import te0.w;
import vc.s;
import xki.e;
import yp0.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/global_markets/impl/ui/redesign/screen/collection_details/GlobalMarketsCollectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ln87/n;", "feature_global_markets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GlobalMarketsCollectionScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(GlobalMarketsCollectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final GlobalMarketsCollectionScreenContract$InputData K;
    public final int L;
    public final AppTipDelegate M;
    public final FullScreenStateDelegate N;
    public final RowDelegate O;
    public final RowLoadingDelegate P;
    public final TextDelegate Q;
    public int R;
    public final Object S;
    public final Object T;
    public final h U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final j Y;

    public GlobalMarketsCollectionScreen(GlobalMarketsCollectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = new AppTipDelegate();
        this.N = new FullScreenStateDelegate();
        this.O = new RowDelegate(null, null, 7);
        this.P = new RowLoadingDelegate();
        this.Q = new TextDelegate();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: n87.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalMarketsCollectionScreen f213249b;

            {
                this.f213249b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GlobalMarketsCollectionScreen globalMarketsCollectionScreen = this.f213249b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GlobalMarketsCollectionScreen.Z;
                        return new j(globalMarketsCollectionScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = GlobalMarketsCollectionScreen.Z;
                        return new ItemTouchHelper(new tw0.n((j) globalMarketsCollectionScreen.S.getValue()));
                    case 2:
                        KProperty[] kPropertyArr3 = GlobalMarketsCollectionScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(globalMarketsCollectionScreen.m2()).a().get(y77.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y77.c.class, " is not found"));
                        }
                        y77.c cVar = ((y77.c) aVar2.b()).f311372r;
                        GlobalMarketsCollectionScreenContract$InputData globalMarketsCollectionScreenContract$InputData = globalMarketsCollectionScreen.K;
                        avk.j jVar = globalMarketsCollectionScreen.Y;
                        globalMarketsCollectionScreenContract$InputData.getClass();
                        jVar.getClass();
                        return new y77.b(cVar, globalMarketsCollectionScreenContract$InputData, jVar);
                    case 3:
                        KProperty[] kPropertyArr4 = GlobalMarketsCollectionScreen.Z;
                        return (q) ((y77.b) globalMarketsCollectionScreen.V.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr5 = GlobalMarketsCollectionScreen.Z;
                        GlobalMarketsCollectionScreen globalMarketsCollectionScreen2 = this.f213249b;
                        return dli.f.a(globalMarketsCollectionScreen2, globalMarketsCollectionScreen2.R2(), zhm.v.k(globalMarketsCollectionScreen2.M, globalMarketsCollectionScreen2.N, globalMarketsCollectionScreen2.O, globalMarketsCollectionScreen2.P, globalMarketsCollectionScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: n87.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalMarketsCollectionScreen f213249b;

            {
                this.f213249b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GlobalMarketsCollectionScreen globalMarketsCollectionScreen = this.f213249b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GlobalMarketsCollectionScreen.Z;
                        return new j(globalMarketsCollectionScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = GlobalMarketsCollectionScreen.Z;
                        return new ItemTouchHelper(new tw0.n((j) globalMarketsCollectionScreen.S.getValue()));
                    case 2:
                        KProperty[] kPropertyArr3 = GlobalMarketsCollectionScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(globalMarketsCollectionScreen.m2()).a().get(y77.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y77.c.class, " is not found"));
                        }
                        y77.c cVar = ((y77.c) aVar2.b()).f311372r;
                        GlobalMarketsCollectionScreenContract$InputData globalMarketsCollectionScreenContract$InputData = globalMarketsCollectionScreen.K;
                        avk.j jVar = globalMarketsCollectionScreen.Y;
                        globalMarketsCollectionScreenContract$InputData.getClass();
                        jVar.getClass();
                        return new y77.b(cVar, globalMarketsCollectionScreenContract$InputData, jVar);
                    case 3:
                        KProperty[] kPropertyArr4 = GlobalMarketsCollectionScreen.Z;
                        return (q) ((y77.b) globalMarketsCollectionScreen.V.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr5 = GlobalMarketsCollectionScreen.Z;
                        GlobalMarketsCollectionScreen globalMarketsCollectionScreen2 = this.f213249b;
                        return dli.f.a(globalMarketsCollectionScreen2, globalMarketsCollectionScreen2.R2(), zhm.v.k(globalMarketsCollectionScreen2.M, globalMarketsCollectionScreen2.N, globalMarketsCollectionScreen2.O, globalMarketsCollectionScreen2.P, globalMarketsCollectionScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        this.U = s.t(this, d.f);
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: n87.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalMarketsCollectionScreen f213249b;

            {
                this.f213249b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GlobalMarketsCollectionScreen globalMarketsCollectionScreen = this.f213249b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GlobalMarketsCollectionScreen.Z;
                        return new j(globalMarketsCollectionScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = GlobalMarketsCollectionScreen.Z;
                        return new ItemTouchHelper(new tw0.n((j) globalMarketsCollectionScreen.S.getValue()));
                    case 2:
                        KProperty[] kPropertyArr3 = GlobalMarketsCollectionScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(globalMarketsCollectionScreen.m2()).a().get(y77.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y77.c.class, " is not found"));
                        }
                        y77.c cVar = ((y77.c) aVar2.b()).f311372r;
                        GlobalMarketsCollectionScreenContract$InputData globalMarketsCollectionScreenContract$InputData = globalMarketsCollectionScreen.K;
                        avk.j jVar = globalMarketsCollectionScreen.Y;
                        globalMarketsCollectionScreenContract$InputData.getClass();
                        jVar.getClass();
                        return new y77.b(cVar, globalMarketsCollectionScreenContract$InputData, jVar);
                    case 3:
                        KProperty[] kPropertyArr4 = GlobalMarketsCollectionScreen.Z;
                        return (q) ((y77.b) globalMarketsCollectionScreen.V.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr5 = GlobalMarketsCollectionScreen.Z;
                        GlobalMarketsCollectionScreen globalMarketsCollectionScreen2 = this.f213249b;
                        return dli.f.a(globalMarketsCollectionScreen2, globalMarketsCollectionScreen2.R2(), zhm.v.k(globalMarketsCollectionScreen2.M, globalMarketsCollectionScreen2.N, globalMarketsCollectionScreen2.O, globalMarketsCollectionScreen2.P, globalMarketsCollectionScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        final int i5 = 3;
        this.W = w.y0(new Function0(this) { // from class: n87.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalMarketsCollectionScreen f213249b;

            {
                this.f213249b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                GlobalMarketsCollectionScreen globalMarketsCollectionScreen = this.f213249b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GlobalMarketsCollectionScreen.Z;
                        return new j(globalMarketsCollectionScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = GlobalMarketsCollectionScreen.Z;
                        return new ItemTouchHelper(new tw0.n((j) globalMarketsCollectionScreen.S.getValue()));
                    case 2:
                        KProperty[] kPropertyArr3 = GlobalMarketsCollectionScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(globalMarketsCollectionScreen.m2()).a().get(y77.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y77.c.class, " is not found"));
                        }
                        y77.c cVar = ((y77.c) aVar2.b()).f311372r;
                        GlobalMarketsCollectionScreenContract$InputData globalMarketsCollectionScreenContract$InputData = globalMarketsCollectionScreen.K;
                        avk.j jVar = globalMarketsCollectionScreen.Y;
                        globalMarketsCollectionScreenContract$InputData.getClass();
                        jVar.getClass();
                        return new y77.b(cVar, globalMarketsCollectionScreenContract$InputData, jVar);
                    case 3:
                        KProperty[] kPropertyArr4 = GlobalMarketsCollectionScreen.Z;
                        return (q) ((y77.b) globalMarketsCollectionScreen.V.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr5 = GlobalMarketsCollectionScreen.Z;
                        GlobalMarketsCollectionScreen globalMarketsCollectionScreen2 = this.f213249b;
                        return dli.f.a(globalMarketsCollectionScreen2, globalMarketsCollectionScreen2.R2(), zhm.v.k(globalMarketsCollectionScreen2.M, globalMarketsCollectionScreen2.N, globalMarketsCollectionScreen2.O, globalMarketsCollectionScreen2.P, globalMarketsCollectionScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        final int i6 = 4;
        this.X = w.y0(new Function0(this) { // from class: n87.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalMarketsCollectionScreen f213249b;

            {
                this.f213249b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                GlobalMarketsCollectionScreen globalMarketsCollectionScreen = this.f213249b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GlobalMarketsCollectionScreen.Z;
                        return new j(globalMarketsCollectionScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = GlobalMarketsCollectionScreen.Z;
                        return new ItemTouchHelper(new tw0.n((j) globalMarketsCollectionScreen.S.getValue()));
                    case 2:
                        KProperty[] kPropertyArr3 = GlobalMarketsCollectionScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(globalMarketsCollectionScreen.m2()).a().get(y77.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y77.c.class, " is not found"));
                        }
                        y77.c cVar = ((y77.c) aVar2.b()).f311372r;
                        GlobalMarketsCollectionScreenContract$InputData globalMarketsCollectionScreenContract$InputData = globalMarketsCollectionScreen.K;
                        avk.j jVar = globalMarketsCollectionScreen.Y;
                        globalMarketsCollectionScreenContract$InputData.getClass();
                        jVar.getClass();
                        return new y77.b(cVar, globalMarketsCollectionScreenContract$InputData, jVar);
                    case 3:
                        KProperty[] kPropertyArr4 = GlobalMarketsCollectionScreen.Z;
                        return (q) ((y77.b) globalMarketsCollectionScreen.V.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr5 = GlobalMarketsCollectionScreen.Z;
                        GlobalMarketsCollectionScreen globalMarketsCollectionScreen2 = this.f213249b;
                        return dli.f.a(globalMarketsCollectionScreen2, globalMarketsCollectionScreen2.R2(), zhm.v.k(globalMarketsCollectionScreen2.M, globalMarketsCollectionScreen2.N, globalMarketsCollectionScreen2.O, globalMarketsCollectionScreen2.P, globalMarketsCollectionScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        this.Y = new j(this, 18);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f213259a;
        String str = uiState.d;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174539b.setToolbarTitle(textLocalisedClause);
        d3().f174539b.setSecondDescriptionText(uiState.f213260b);
        d3().f174539b.setSecondDescriptionVisible(true);
        m mVar = qVar instanceof m ? (m) qVar : null;
        if (mVar != null && mVar.f213258a && str != null) {
            ScreenContentRecyclerView recyclerView = d3().f174540c;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            b bVarF = y.f(recyclerView, str);
            if (bVarF != null) {
                ((ItemTouchHelper) this.T.getValue()).startDrag(bVarF);
            }
        }
        Iterator it8 = uiState.f213261c.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            koi.j jVar = (koi.j) it8.next();
            if ((jVar instanceof p) && (((p) jVar).getF53564b() instanceof u)) {
                break;
            } else {
                i++;
            }
        }
        this.R = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y77.b) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ((ItemTouchHelper) this.T.getValue()).attachToRecyclerView(d3().f174540c);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new n87.h(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.M.f51654g), new n87.h(this, null, 1), 3);
        ViewController.P2(this, new mmh.e(rd0.e.b(this.N.f52371h.f121375b), 19), new n87.h(this, null, 2), 3);
        RowDelegate rowDelegate = this.O;
        ViewController.P2(this, new mmh.e(rd0.e.b(rowDelegate.f53218h), 20), new g(this, null, 25), 3);
        ViewController.P2(this, new mmh.e(rd0.e.b(rowDelegate.f53227t), 18), new i(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.U.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n87.q R2() {
        return (n87.q) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.X.getValue();
    }
}
