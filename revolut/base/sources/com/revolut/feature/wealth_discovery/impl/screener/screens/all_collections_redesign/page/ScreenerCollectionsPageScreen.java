package com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.page;

import aii.q;
import android.view.View;
import avk.j;
import cli.o;
import com.revolut.core.ui_kit.delegates.BasketDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.wealth_discovery.impl.R$id;
import com.revolut.feature.wealth_discovery.impl.R$layout;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.page.ScreenerCollectionsPageContract$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.page.ScreenerCollectionsPageScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import joh.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oli.f;
import oph.c;
import oph.e;
import oph.m;
import pki.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_collections_redesign/page/ScreenerCollectionsPageScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Loph/c;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenerCollectionsPageScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ScreenerCollectionsPageScreen.class, "binding", "getBinding()Lcom/revolut/feature/wealth_discovery/impl/databinding/ScreenScreenerCollectionsPageBinding;", 0))};
    public final ScreenerCollectionsPageContract$InputData K;
    public final BasketDelegate L;
    public final RowLoadingDelegate M;
    public final FullScreenStateDelegate N;
    public final TextDelegate O;
    public final j P;
    public final int Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public ScreenerCollectionsPageScreen(ScreenerCollectionsPageContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        s.t(this, e.f);
        this.L = new BasketDelegate();
        this.M = new RowLoadingDelegate();
        this.N = new FullScreenStateDelegate();
        this.O = new TextDelegate();
        this.P = new j(this, 20);
        this.Q = R$layout.screen_screener_collections_page;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: oph.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerCollectionsPageScreen f227664b;

            {
                this.f227664b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ScreenerCollectionsPageScreen screenerCollectionsPageScreen = this.f227664b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerCollectionsPageScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(screenerCollectionsPageScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerCollectionsPageContract$InputData screenerCollectionsPageContract$InputData = screenerCollectionsPageScreen.K;
                        avk.j jVar = screenerCollectionsPageScreen.P;
                        screenerCollectionsPageContract$InputData.getClass();
                        jVar.getClass();
                        return new joh.l(wVar, screenerCollectionsPageContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerCollectionsPageScreen.U;
                        return (m) ((joh.l) screenerCollectionsPageScreen.R.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = ScreenerCollectionsPageScreen.U;
                        ScreenerCollectionsPageScreen screenerCollectionsPageScreen2 = this.f227664b;
                        return dli.f.a(screenerCollectionsPageScreen2, (m) screenerCollectionsPageScreen2.S.getValue(), v.k(screenerCollectionsPageScreen2.L, screenerCollectionsPageScreen2.M, screenerCollectionsPageScreen2.N, screenerCollectionsPageScreen2.O, new ListSubheaderDelegate()), R$id.screenScreenerCollectionsPage_recyclerView, new g(1, 0, ScreenerCollectionsPageScreen.class, screenerCollectionsPageScreen2, "createLayoutManager", "createLayoutManager(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView$LayoutManager;"), null, null, 48);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: oph.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerCollectionsPageScreen f227664b;

            {
                this.f227664b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ScreenerCollectionsPageScreen screenerCollectionsPageScreen = this.f227664b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerCollectionsPageScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(screenerCollectionsPageScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerCollectionsPageContract$InputData screenerCollectionsPageContract$InputData = screenerCollectionsPageScreen.K;
                        avk.j jVar = screenerCollectionsPageScreen.P;
                        screenerCollectionsPageContract$InputData.getClass();
                        jVar.getClass();
                        return new joh.l(wVar, screenerCollectionsPageContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerCollectionsPageScreen.U;
                        return (m) ((joh.l) screenerCollectionsPageScreen.R.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = ScreenerCollectionsPageScreen.U;
                        ScreenerCollectionsPageScreen screenerCollectionsPageScreen2 = this.f227664b;
                        return dli.f.a(screenerCollectionsPageScreen2, (m) screenerCollectionsPageScreen2.S.getValue(), v.k(screenerCollectionsPageScreen2.L, screenerCollectionsPageScreen2.M, screenerCollectionsPageScreen2.N, screenerCollectionsPageScreen2.O, new ListSubheaderDelegate()), R$id.screenScreenerCollectionsPage_recyclerView, new g(1, 0, ScreenerCollectionsPageScreen.class, screenerCollectionsPageScreen2, "createLayoutManager", "createLayoutManager(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView$LayoutManager;"), null, null, 48);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: oph.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerCollectionsPageScreen f227664b;

            {
                this.f227664b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ScreenerCollectionsPageScreen screenerCollectionsPageScreen = this.f227664b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerCollectionsPageScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(screenerCollectionsPageScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerCollectionsPageContract$InputData screenerCollectionsPageContract$InputData = screenerCollectionsPageScreen.K;
                        avk.j jVar = screenerCollectionsPageScreen.P;
                        screenerCollectionsPageContract$InputData.getClass();
                        jVar.getClass();
                        return new joh.l(wVar, screenerCollectionsPageContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerCollectionsPageScreen.U;
                        return (m) ((joh.l) screenerCollectionsPageScreen.R.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = ScreenerCollectionsPageScreen.U;
                        ScreenerCollectionsPageScreen screenerCollectionsPageScreen2 = this.f227664b;
                        return dli.f.a(screenerCollectionsPageScreen2, (m) screenerCollectionsPageScreen2.S.getValue(), v.k(screenerCollectionsPageScreen2.L, screenerCollectionsPageScreen2.M, screenerCollectionsPageScreen2.N, screenerCollectionsPageScreen2.O, new ListSubheaderDelegate()), R$id.screenScreenerCollectionsPage_recyclerView, new g(1, 0, ScreenerCollectionsPageScreen.class, screenerCollectionsPageScreen2, "createLayoutManager", "createLayoutManager(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView$LayoutManager;"), null, null, 48);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (m) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new o9a.e(rd0.e.b(this.N.f52371h.f121375b), 16), new oph.j(this, null), 3);
        ViewController.P2(this, new o9a.e(rd0.e.b(this.L.f51715c), 17), new f(this, null, 14), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
