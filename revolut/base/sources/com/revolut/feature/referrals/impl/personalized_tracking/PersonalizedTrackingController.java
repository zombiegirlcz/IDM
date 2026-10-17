package com.revolut.feature.referrals.impl.personalized_tracking;

import aii.q;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.c1;
import au0.s0;
import au0.z0;
import cli.o;
import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$raw;
import com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingController;
import com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import njj.n0;
import nwc.f;
import nxa.i;
import nxa.k;
import nxa.l;
import nxa.p;
import nxa.r;
import nxa.t;
import nxa.u;
import nxa.v;
import rd0.d;
import te0.w;
import vc.s;
import vkm.j2;
import w01.c;
import w01.g;
import xki.e;
import yhm.j;
import yi5.b;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/impl/personalized_tracking/PersonalizedTrackingController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lnxa/u;", "feature_retail_referrals_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PersonalizedTrackingController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(PersonalizedTrackingController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBigTitleNextbuttonBinding;", 0))};
    public final PersonalizedTrackingControllerContract$InputData K;
    public final h L;
    public final RowDelegate M;
    public final CellDetailsChevronDelegate N;
    public final FullScreenStateDelegate O;
    public final FooterTextDelegate P;
    public final Lazy Q;
    public final Object R;
    public final Object S;
    public final int T;
    public final Object U;

    public PersonalizedTrackingController(PersonalizedTrackingControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, nxa.h.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new CellDetailsChevronDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = new FooterTextDelegate();
        final int i = 0;
        this.Q = j.b(new Function0(this) { // from class: nxa.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalizedTrackingController f220497b;

            {
                this.f220497b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PersonalizedTrackingController personalizedTrackingController = this.f220497b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PersonalizedTrackingController.V;
                        View rootView = personalizedTrackingController.m2().getWindow().getDecorView().getRootView();
                        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        return new w01.c((ViewGroup) rootView);
                    case 1:
                        KProperty[] kPropertyArr2 = PersonalizedTrackingController.V;
                        PersonalizedTrackingController personalizedTrackingController2 = this.f220497b;
                        return dli.f.a(personalizedTrackingController2, personalizedTrackingController2.R2(), zhm.v.k(new ListSubheaderDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), personalizedTrackingController2.M, personalizedTrackingController2.O, personalizedTrackingController2.N, personalizedTrackingController2.P), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PersonalizedTrackingController.V;
                        phm.a aVar = (phm.a) ue0.e.j(personalizedTrackingController.m2()).a().get(kxa.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", kxa.f.class, " is not found"));
                        }
                        kxa.f fVar = ((kxa.f) aVar2.b()).k;
                        PersonalizedTrackingControllerContract$InputData personalizedTrackingControllerContract$InputData = personalizedTrackingController.K;
                        personalizedTrackingControllerContract$InputData.getClass();
                        return new kxa.d(fVar, personalizedTrackingController, personalizedTrackingControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = PersonalizedTrackingController.V;
                        return (p) ((kxa.d) personalizedTrackingController.S.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: nxa.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalizedTrackingController f220497b;

            {
                this.f220497b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PersonalizedTrackingController personalizedTrackingController = this.f220497b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PersonalizedTrackingController.V;
                        View rootView = personalizedTrackingController.m2().getWindow().getDecorView().getRootView();
                        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        return new w01.c((ViewGroup) rootView);
                    case 1:
                        KProperty[] kPropertyArr2 = PersonalizedTrackingController.V;
                        PersonalizedTrackingController personalizedTrackingController2 = this.f220497b;
                        return dli.f.a(personalizedTrackingController2, personalizedTrackingController2.R2(), zhm.v.k(new ListSubheaderDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), personalizedTrackingController2.M, personalizedTrackingController2.O, personalizedTrackingController2.N, personalizedTrackingController2.P), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PersonalizedTrackingController.V;
                        phm.a aVar = (phm.a) ue0.e.j(personalizedTrackingController.m2()).a().get(kxa.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", kxa.f.class, " is not found"));
                        }
                        kxa.f fVar = ((kxa.f) aVar2.b()).k;
                        PersonalizedTrackingControllerContract$InputData personalizedTrackingControllerContract$InputData = personalizedTrackingController.K;
                        personalizedTrackingControllerContract$InputData.getClass();
                        return new kxa.d(fVar, personalizedTrackingController, personalizedTrackingControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = PersonalizedTrackingController.V;
                        return (p) ((kxa.d) personalizedTrackingController.S.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: nxa.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalizedTrackingController f220497b;

            {
                this.f220497b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PersonalizedTrackingController personalizedTrackingController = this.f220497b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PersonalizedTrackingController.V;
                        View rootView = personalizedTrackingController.m2().getWindow().getDecorView().getRootView();
                        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        return new w01.c((ViewGroup) rootView);
                    case 1:
                        KProperty[] kPropertyArr2 = PersonalizedTrackingController.V;
                        PersonalizedTrackingController personalizedTrackingController2 = this.f220497b;
                        return dli.f.a(personalizedTrackingController2, personalizedTrackingController2.R2(), zhm.v.k(new ListSubheaderDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), personalizedTrackingController2.M, personalizedTrackingController2.O, personalizedTrackingController2.N, personalizedTrackingController2.P), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PersonalizedTrackingController.V;
                        phm.a aVar = (phm.a) ue0.e.j(personalizedTrackingController.m2()).a().get(kxa.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", kxa.f.class, " is not found"));
                        }
                        kxa.f fVar = ((kxa.f) aVar2.b()).k;
                        PersonalizedTrackingControllerContract$InputData personalizedTrackingControllerContract$InputData = personalizedTrackingController.K;
                        personalizedTrackingControllerContract$InputData.getClass();
                        return new kxa.d(fVar, personalizedTrackingController, personalizedTrackingControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = PersonalizedTrackingController.V;
                        return (p) ((kxa.d) personalizedTrackingController.S.getValue()).e.get();
                }
            }
        });
        this.T = R$layout.screen_recycler_navbar_big_title_nextbutton;
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: nxa.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalizedTrackingController f220497b;

            {
                this.f220497b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PersonalizedTrackingController personalizedTrackingController = this.f220497b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PersonalizedTrackingController.V;
                        View rootView = personalizedTrackingController.m2().getWindow().getDecorView().getRootView();
                        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        return new w01.c((ViewGroup) rootView);
                    case 1:
                        KProperty[] kPropertyArr2 = PersonalizedTrackingController.V;
                        PersonalizedTrackingController personalizedTrackingController2 = this.f220497b;
                        return dli.f.a(personalizedTrackingController2, personalizedTrackingController2.R2(), zhm.v.k(new ListSubheaderDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), personalizedTrackingController2.M, personalizedTrackingController2.O, personalizedTrackingController2.N, personalizedTrackingController2.P), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PersonalizedTrackingController.V;
                        phm.a aVar = (phm.a) ue0.e.j(personalizedTrackingController.m2()).a().get(kxa.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", kxa.f.class, " is not found"));
                        }
                        kxa.f fVar = ((kxa.f) aVar2.b()).k;
                        PersonalizedTrackingControllerContract$InputData personalizedTrackingControllerContract$InputData = personalizedTrackingController.K;
                        personalizedTrackingControllerContract$InputData.getClass();
                        return new kxa.d(fVar, personalizedTrackingController, personalizedTrackingControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = PersonalizedTrackingController.V;
                        return (p) ((kxa.d) personalizedTrackingController.S.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        u uiState = (u) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174537c.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        if (uiState instanceof t) {
            d3().f174537c.setLoadingState(true);
            LargeActionButton screenRecyclerNavbarBigTitleNextbuttonGoToButton = d3().f174536b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarBigTitleNextbuttonGoToButton, "screenRecyclerNavbarBigTitleNextbuttonGoToButton");
            screenRecyclerNavbarBigTitleNextbuttonGoToButton.setVisibility(8);
            return;
        }
        Continuation continuation = null;
        if (uiState instanceof nxa.s) {
            NavBarWithBigTile screenRecyclerNavbarBigTitleNextbuttonNavBar = d3().f174537c;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarBigTitleNextbuttonNavBar, "screenRecyclerNavbarBigTitleNextbuttonNavBar");
            c1.S(screenRecyclerNavbarBigTitleNextbuttonNavBar, f0.f322471a, null, null, 6);
            d3().f174537c.setLoadingState(false);
            LargeActionButton screenRecyclerNavbarBigTitleNextbuttonGoToButton2 = d3().f174536b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarBigTitleNextbuttonGoToButton2, "screenRecyclerNavbarBigTitleNextbuttonGoToButton");
            screenRecyclerNavbarBigTitleNextbuttonGoToButton2.setVisibility(8);
            return;
        }
        if (!(uiState instanceof r)) {
            throw new NoWhenBranchMatchedException();
        }
        r rVar = (r) uiState;
        TextClause textClause = rVar.f220517b;
        Clause clause = rVar.d;
        if (rVar.f220516a) {
            ((c) this.Q.getValue()).a(R$raw.uikit_lottie_confetti_deprecated, g.FIT_XY);
            a aVar = (a) R2();
            y yVar = aVar.f81799x;
            String str = ((l) ((j2) yVar.f22677a).getValue()).f220501a;
            if (str != null) {
                aVar.H2(yVar, new v(0));
                aVar.l2(new n0(aVar, str, continuation, 27), new b(26));
            } else {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(rd0.c.ERROR, "PersonalizedTrackingControllerModel", "inviteId is null when setting animation as viewed", null, h0Var);
            }
        }
        if (clause != null) {
            LargeActionButton screenRecyclerNavbarBigTitleNextbuttonGoToButton3 = d3().f174536b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarBigTitleNextbuttonGoToButton3, "screenRecyclerNavbarBigTitleNextbuttonGoToButton");
            screenRecyclerNavbarBigTitleNextbuttonGoToButton3.setVisibility(0);
            d3().f174536b.setText(clause);
            d3().f174536b.setLoadingButtonTag("PERSONALIZATION_TRACKING_CTA_BUTTON_TAG");
        } else {
            LargeActionButton screenRecyclerNavbarBigTitleNextbuttonGoToButton4 = d3().f174536b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarBigTitleNextbuttonGoToButton4, "screenRecyclerNavbarBigTitleNextbuttonGoToButton");
            screenRecyclerNavbarBigTitleNextbuttonGoToButton4.setVisibility(8);
        }
        NavBarWithBigTile navBarWithBigTile = d3().f174537c;
        navBarWithBigTile.setLoadingState(false);
        c1.S(navBarWithBigTile, zhm.v.l(rVar.e), null, null, 6);
        nxa.q qVar2 = rVar.f;
        navBarWithBigTile.setAvatar(qVar2.f220514a, qVar2.f220515b);
        navBarWithBigTile.setTitleStyle(b1.DEFAULT);
        navBarWithBigTile.setToolbarTitle(textClause);
        navBarWithBigTile.setTitle(new z0(textClause, false));
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setActionStatusLabel(rVar.f220518c);
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (kxa.d) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174537c.f59357t), new nxa.j(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174536b.o), new nxa.j(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.e.f121375b), null, new f(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(this.N.f51821c), new k(this, null), 3);
    }

    public final jii.l d3() {
        ViewBinding value = this.L.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.l) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p R2() {
        return (p) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
