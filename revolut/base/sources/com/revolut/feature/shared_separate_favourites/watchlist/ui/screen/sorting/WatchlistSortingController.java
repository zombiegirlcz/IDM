package com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.sorting;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.sorting.WatchlistSortingController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import gfd.e;
import iqh.d;
import jhd.b;
import jhd.g;
import jhd.j;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/screen/sorting/WatchlistSortingController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgfd/e;", "Ldli/a;", "Ljhd/h;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WatchlistSortingController extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(WatchlistSortingController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final g K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final SingleChoiceDelegate P;
    public final LargeActionButtonDelegate Q;
    public final Object R;

    public WatchlistSortingController(g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: jhd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WatchlistSortingController f174203b;

            {
                this.f174203b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WatchlistSortingController watchlistSortingController = this.f174203b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WatchlistSortingController.S;
                        qji.b bVarU2 = watchlistSortingController.U2();
                        khd.b bVar = bVarU2 instanceof khd.b ? (khd.b) bVarU2 : null;
                        if (bVar == null) {
                            phm.a aVar = (phm.a) ue0.e.j(watchlistSortingController.m2()).a().get(ufd.a.class);
                            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                            if (aVar2 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", ufd.a.class, " is not found"));
                            }
                            bVar = (khd.b) aVar2.b();
                        }
                        return (vfd.e) ((khd.a) bVar.b().mo3808a(watchlistSortingController)).T(watchlistSortingController.K).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = WatchlistSortingController.S;
                        vfd.e eVar = (vfd.e) watchlistSortingController.N.getValue();
                        switch (eVar.f288594a) {
                            case 0:
                                return (j) eVar.d.get();
                            default:
                                return (j) eVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = WatchlistSortingController.S;
                        int i3 = R$id.navBarBottomSheet_RecyclerView;
                        WatchlistSortingController watchlistSortingController2 = this.f174203b;
                        return dli.f.a(watchlistSortingController2, (j) watchlistSortingController2.O.getValue(), v.k(new TextDelegate(), watchlistSortingController2.P, watchlistSortingController2.Q), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: jhd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WatchlistSortingController f174203b;

            {
                this.f174203b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WatchlistSortingController watchlistSortingController = this.f174203b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WatchlistSortingController.S;
                        qji.b bVarU2 = watchlistSortingController.U2();
                        khd.b bVar = bVarU2 instanceof khd.b ? (khd.b) bVarU2 : null;
                        if (bVar == null) {
                            phm.a aVar = (phm.a) ue0.e.j(watchlistSortingController.m2()).a().get(ufd.a.class);
                            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                            if (aVar2 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", ufd.a.class, " is not found"));
                            }
                            bVar = (khd.b) aVar2.b();
                        }
                        return (vfd.e) ((khd.a) bVar.b().mo3808a(watchlistSortingController)).T(watchlistSortingController.K).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = WatchlistSortingController.S;
                        vfd.e eVar = (vfd.e) watchlistSortingController.N.getValue();
                        switch (eVar.f288594a) {
                            case 0:
                                return (j) eVar.d.get();
                            default:
                                return (j) eVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = WatchlistSortingController.S;
                        int i3 = R$id.navBarBottomSheet_RecyclerView;
                        WatchlistSortingController watchlistSortingController2 = this.f174203b;
                        return dli.f.a(watchlistSortingController2, (j) watchlistSortingController2.O.getValue(), v.k(new TextDelegate(), watchlistSortingController2.P, watchlistSortingController2.Q), i3, null, null, null, 56);
                }
            }
        });
        this.P = new SingleChoiceDelegate();
        this.Q = new LargeActionButtonDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: jhd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WatchlistSortingController f174203b;

            {
                this.f174203b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WatchlistSortingController watchlistSortingController = this.f174203b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WatchlistSortingController.S;
                        qji.b bVarU2 = watchlistSortingController.U2();
                        khd.b bVar = bVarU2 instanceof khd.b ? (khd.b) bVarU2 : null;
                        if (bVar == null) {
                            phm.a aVar = (phm.a) ue0.e.j(watchlistSortingController.m2()).a().get(ufd.a.class);
                            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                            if (aVar2 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", ufd.a.class, " is not found"));
                            }
                            bVar = (khd.b) aVar2.b();
                        }
                        return (vfd.e) ((khd.a) bVar.b().mo3808a(watchlistSortingController)).T(watchlistSortingController.K).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = WatchlistSortingController.S;
                        vfd.e eVar = (vfd.e) watchlistSortingController.N.getValue();
                        switch (eVar.f288594a) {
                            case 0:
                                return (j) eVar.d.get();
                            default:
                                return (j) eVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = WatchlistSortingController.S;
                        int i32 = R$id.navBarBottomSheet_RecyclerView;
                        WatchlistSortingController watchlistSortingController2 = this.f174203b;
                        return dli.f.a(watchlistSortingController2, (j) watchlistSortingController2.O.getValue(), v.k(new TextDelegate(), watchlistSortingController2.P, watchlistSortingController2.Q), i32, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        jhd.h uiState = (jhd.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f174211a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (vfd.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new d(rd0.e.b(this.P.p()), 28), new j82.q(this, null, 27), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d.f121375b), new jhd.e(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
