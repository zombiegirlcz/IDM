package com.revolut.feature.travel.experiences.impl.ui.screen.home;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import boh.f;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.BigTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.InputTravelSearchDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RoomPreviewLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.StaggeredGridItemDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.feature.travel.experiences.impl.ui.screen.home.TravelExperiencesHomeScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dli.c;
import ip0.md;
import iug.j;
import j2g.b;
import j2g.d;
import j2g.g;
import j2g.k;
import j2g.l;
import j2g.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import w0g.i;
import xki.e;
import yp0.y;
import z0g.e0;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/home/TravelExperiencesHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lj2g/k;", "Ldli/a;", "Lj2g/m;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesHomeScreen extends ViewController<k> implements a {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f93077a0 = {o0.f186429a.j(new h0(TravelExperiencesHomeScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenExperiencesHomeBinding;", 0))};
    public final int K;
    public final int L;
    public final h M;
    public final InputTravelSearchDelegate N;
    public final LargeActionButtonDelegate O;
    public final ListingTileDelegate P;
    public final RowDelegate Q;
    public final HeaderDelegate R;
    public final VoucherSmallTileDelegate S;
    public final ListSubheaderDelegate T;
    public final ScrollerDelegate U;
    public final StaggeredGridItemDelegate V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    public TravelExperiencesHomeScreen(TravelExperiencesHomeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_experiences_home;
        this.L = R$style.TransparentNavigationBarMarkerTheme;
        this.M = s.t(this, b.f);
        this.N = new InputTravelSearchDelegate();
        this.O = new LargeActionButtonDelegate();
        ListingTileDelegate listingTileDelegate = new ListingTileDelegate();
        this.P = listingTileDelegate;
        this.Q = new RowDelegate(null, null, 7);
        this.R = new HeaderDelegate();
        VoucherSmallTileDelegate voucherSmallTileDelegate = new VoucherSmallTileDelegate();
        this.S = voucherSmallTileDelegate;
        this.T = new ListSubheaderDelegate();
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.U = new ScrollerDelegate(v.k(listingTileDelegate, voucherSmallTileDelegate, new ListingTileLoadingDelegate(), new VoucherSmallLoadingDelegate()), false);
        this.V = new StaggeredGridItemDelegate(voucherSmallTileDelegate);
        this.W = w.y0(new Function0(this) { // from class: j2g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesHomeScreen f170865b;

            {
                this.f170865b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fd6.a aVar;
                int i5 = i;
                TravelExperiencesHomeScreen travelExperiencesHomeScreen = this.f170865b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesHomeScreen.f93077a0;
                        e0 e0Var = (e0) travelExperiencesHomeScreen.X.getValue();
                        switch (e0Var.f318348a) {
                            case 0:
                                return (l) e0Var.f318357p.get();
                            default:
                                return (l) e0Var.f318357p.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = TravelExperiencesHomeScreen.f93077a0;
                        List listK = zhm.v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RoomPreviewLoadingDelegate(), new VoucherSmallLoadingDelegate(), new BigTileLoadingDelegate(), travelExperiencesHomeScreen.N, travelExperiencesHomeScreen.O, travelExperiencesHomeScreen.Q, travelExperiencesHomeScreen.R, travelExperiencesHomeScreen.T, travelExperiencesHomeScreen.V, travelExperiencesHomeScreen.P, travelExperiencesHomeScreen.U);
                        e0 e0Var2 = (e0) travelExperiencesHomeScreen.X.getValue();
                        switch (e0Var2.f318348a) {
                            case 0:
                                aVar = (fd6.a) e0Var2.e.get();
                                break;
                            default:
                                aVar = (fd6.a) e0Var2.e.get();
                                break;
                        }
                        return d0.E0(aVar.e, listK);
                    default:
                        KProperty[] kPropertyArr3 = TravelExperiencesHomeScreen.f93077a0;
                        TravelExperiencesHomeScreen travelExperiencesHomeScreen2 = this.f170865b;
                        l lVarR2 = travelExperiencesHomeScreen2.R2();
                        StaggeredGridItemDelegate.Companion companion = StaggeredGridItemDelegate.INSTANCE;
                        List list = (List) travelExperiencesHomeScreen2.Y.getValue();
                        companion.getClass();
                        return dli.f.a(travelExperiencesHomeScreen2, lVarR2, StaggeredGridItemDelegate.Companion.a(list), R$id.experiencesHome_recyclerView, null, null, null, 56);
                }
            }
        });
        this.X = w.y0(new md(this, inputData, 24));
        this.Y = w.y0(new Function0(this) { // from class: j2g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesHomeScreen f170865b;

            {
                this.f170865b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fd6.a aVar;
                int i5 = i2;
                TravelExperiencesHomeScreen travelExperiencesHomeScreen = this.f170865b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesHomeScreen.f93077a0;
                        e0 e0Var = (e0) travelExperiencesHomeScreen.X.getValue();
                        switch (e0Var.f318348a) {
                            case 0:
                                return (l) e0Var.f318357p.get();
                            default:
                                return (l) e0Var.f318357p.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = TravelExperiencesHomeScreen.f93077a0;
                        List listK = zhm.v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RoomPreviewLoadingDelegate(), new VoucherSmallLoadingDelegate(), new BigTileLoadingDelegate(), travelExperiencesHomeScreen.N, travelExperiencesHomeScreen.O, travelExperiencesHomeScreen.Q, travelExperiencesHomeScreen.R, travelExperiencesHomeScreen.T, travelExperiencesHomeScreen.V, travelExperiencesHomeScreen.P, travelExperiencesHomeScreen.U);
                        e0 e0Var2 = (e0) travelExperiencesHomeScreen.X.getValue();
                        switch (e0Var2.f318348a) {
                            case 0:
                                aVar = (fd6.a) e0Var2.e.get();
                                break;
                            default:
                                aVar = (fd6.a) e0Var2.e.get();
                                break;
                        }
                        return d0.E0(aVar.e, listK);
                    default:
                        KProperty[] kPropertyArr3 = TravelExperiencesHomeScreen.f93077a0;
                        TravelExperiencesHomeScreen travelExperiencesHomeScreen2 = this.f170865b;
                        l lVarR2 = travelExperiencesHomeScreen2.R2();
                        StaggeredGridItemDelegate.Companion companion = StaggeredGridItemDelegate.INSTANCE;
                        List list = (List) travelExperiencesHomeScreen2.Y.getValue();
                        companion.getClass();
                        return dli.f.a(travelExperiencesHomeScreen2, lVarR2, StaggeredGridItemDelegate.Companion.a(list), R$id.experiencesHome_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Z = w.y0(new Function0(this) { // from class: j2g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesHomeScreen f170865b;

            {
                this.f170865b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fd6.a aVar;
                int i5 = i3;
                TravelExperiencesHomeScreen travelExperiencesHomeScreen = this.f170865b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesHomeScreen.f93077a0;
                        e0 e0Var = (e0) travelExperiencesHomeScreen.X.getValue();
                        switch (e0Var.f318348a) {
                            case 0:
                                return (l) e0Var.f318357p.get();
                            default:
                                return (l) e0Var.f318357p.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = TravelExperiencesHomeScreen.f93077a0;
                        List listK = zhm.v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RoomPreviewLoadingDelegate(), new VoucherSmallLoadingDelegate(), new BigTileLoadingDelegate(), travelExperiencesHomeScreen.N, travelExperiencesHomeScreen.O, travelExperiencesHomeScreen.Q, travelExperiencesHomeScreen.R, travelExperiencesHomeScreen.T, travelExperiencesHomeScreen.V, travelExperiencesHomeScreen.P, travelExperiencesHomeScreen.U);
                        e0 e0Var2 = (e0) travelExperiencesHomeScreen.X.getValue();
                        switch (e0Var2.f318348a) {
                            case 0:
                                aVar = (fd6.a) e0Var2.e.get();
                                break;
                            default:
                                aVar = (fd6.a) e0Var2.e.get();
                                break;
                        }
                        return d0.E0(aVar.e, listK);
                    default:
                        KProperty[] kPropertyArr3 = TravelExperiencesHomeScreen.f93077a0;
                        TravelExperiencesHomeScreen travelExperiencesHomeScreen2 = this.f170865b;
                        l lVarR2 = travelExperiencesHomeScreen2.R2();
                        StaggeredGridItemDelegate.Companion companion = StaggeredGridItemDelegate.INSTANCE;
                        List list = (List) travelExperiencesHomeScreen2.Y.getValue();
                        companion.getClass();
                        return dli.f.a(travelExperiencesHomeScreen2, lVarR2, StaggeredGridItemDelegate.Companion.a(list), R$id.experiencesHome_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getK() {
        return Integer.valueOf(this.L);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ScreenContentRecyclerView experiencesHomeRecyclerView = d3().f293711b;
        Intrinsics.checkNotNullExpressionValue(experiencesHomeRecyclerView, "experiencesHomeRecyclerView");
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        knm.b.v(f.p(context), experiencesHomeRecyclerView);
        d3().f293711b.setClipToPadding(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e0) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView experiencesHomeRecyclerView = d3().f293711b;
        Intrinsics.checkNotNullExpressionValue(experiencesHomeRecyclerView, "experiencesHomeRecyclerView");
        y.k(experiencesHomeRecyclerView, ((c) this.Z.getValue()).w(), 0, 14);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        InputTravelSearchDelegate inputTravelSearchDelegate = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTravelSearchDelegate.f52599c.f121375b), null, new j2g.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTravelSearchDelegate.f52600g.f121375b), null, new j2g.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52751c), null, new j(this, (Continuation) null, 15), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.d.f121375b), null, new j2g.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f53608c), null, new j2g.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f52707c), null, new g(this, null), 3);
    }

    public final i d3() {
        ViewBinding value = this.M.getValue(this, f93077a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (i) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
