package com.revolut.sso.impl.ui.revolut_id.documents.identity_documents;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import ao.h;
import aw0.y9;
import cli.a0;
import com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.IdDocumentDelegate;
import com.revolut.core.ui_kit.delegates.IdDocumentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CardsCarouselView;
import com.revolut.core.ui_kit.views.legacy.LegacyContentContainerFrameLayout;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.revolut_id.documents.identity_documents.IdentityDocumentsScreen;
import com.revolut.ui_kit.carousel_with_sheet.transition.CarouselWithBottomSheetContainerLayout;
import com.revolut.ui_kit.carousel_with_sheet.view.HorizontalScrollExpandableLayoutView;
import dkl.l;
import ix0.n1;
import ix0.o1;
import ix0.r1;
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
import lki.z;
import mx0.c3;
import te0.w;
import tpl.b;
import tpl.c;
import tpl.d;
import tpl.g;
import tpl.i;
import tpl.j;
import tpl.k;
import tpl.m;
import tpl.n;
import tx0.d0;
import vc.s;
import xki.e;
import z92.f;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/documents/identity_documents/IdentityDocumentsScreen;", "Lcom/revolut/carousel_with_sheet/shared/ui/screen/CarouselWithBottomSheetScreen;", "Ltpl/j;", "Ltpl/n;", "Ltpl/k;", "<init>", "()V", "tpl/c", "tpl/b", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IdentityDocumentsScreen extends CarouselWithBottomSheetScreen<j, n, k> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f106741a0 = {o0.f186429a.j(new h0(IdentityDocumentsScreen.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenIdentityDocumentsBinding;", 0))};
    public final h O = s.t(this, a.f);
    public final FullScreenStateDelegate P = new FullScreenStateDelegate();
    public final IdDocumentDelegate Q = new IdDocumentDelegate();
    public final CellDetailsAccountDelegate R;
    public final c S;
    public final b T;
    public n1 U;
    public final int V;
    public final List W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, l.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/sso/impl/databinding/ScreenIdentityDocumentsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.carouselWithSheet_backgroundContainer;
            LegacyContentContainerFrameLayout legacyContentContainerFrameLayout = (LegacyContentContainerFrameLayout) ViewBindings.findChildViewById(p0, i);
            if (legacyContentContainerFrameLayout != null) {
                i = R$id.carouselWithSheet_cardsCarouselView;
                CardsCarouselView cardsCarouselView = (CardsCarouselView) ViewBindings.findChildViewById(p0, i);
                if (cardsCarouselView != null) {
                    i = R$id.carouselWithSheet_expandableLayoutView;
                    HorizontalScrollExpandableLayoutView horizontalScrollExpandableLayoutView = (HorizontalScrollExpandableLayoutView) ViewBindings.findChildViewById(p0, i);
                    if (horizontalScrollExpandableLayoutView != null) {
                        i = R$id.carouselWithSheet_navBar;
                        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                        if (basicNavBar != null) {
                            CarouselWithBottomSheetContainerLayout carouselWithBottomSheetContainerLayout = (CarouselWithBottomSheetContainerLayout) p0;
                            i = R$id.identityDocuments_expandableLayoutViewContainer;
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(p0, i);
                            if (coordinatorLayout != null) {
                                return new l(carouselWithBottomSheetContainerLayout, legacyContentContainerFrameLayout, cardsCarouselView, horizontalScrollExpandableLayoutView, basicNavBar, carouselWithBottomSheetContainerLayout, coordinatorLayout);
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public IdentityDocumentsScreen() {
        CellDetailsAccountDelegate cellDetailsAccountDelegate = new CellDetailsAccountDelegate();
        this.R = cellDetailsAccountDelegate;
        this.S = new c(this);
        this.T = new b(this);
        this.V = R$layout.screen_identity_documents;
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        this.W = v.k(cellDetailsAccountDelegate, new RowLoadingDelegate());
        this.X = w.y0(new Function0(this) { // from class: tpl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdentityDocumentsScreen f273417b;

            {
                this.f273417b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                IdentityDocumentsScreen identityDocumentsScreen = this.f273417b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = IdentityDocumentsScreen.f106741a0;
                        qji.b bVarU2 = identityDocumentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.documents.identity_documents.di.IdentityDocumentsScreenInjector");
                        mjl.j jVar = (mjl.j) bVarU2;
                        return new mjl.k(jVar.f206089b, jVar.f206090c);
                    case 1:
                        KProperty[] kPropertyArr2 = IdentityDocumentsScreen.f106741a0;
                        return (l) ((mjl.k) identityDocumentsScreen.X.getValue()).f206093c.get();
                    default:
                        KProperty[] kPropertyArr3 = IdentityDocumentsScreen.f106741a0;
                        return n14.e.a(identityDocumentsScreen, identityDocumentsScreen.R2());
                }
            }
        });
        this.Y = w.y0(new Function0(this) { // from class: tpl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdentityDocumentsScreen f273417b;

            {
                this.f273417b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                IdentityDocumentsScreen identityDocumentsScreen = this.f273417b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = IdentityDocumentsScreen.f106741a0;
                        qji.b bVarU2 = identityDocumentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.documents.identity_documents.di.IdentityDocumentsScreenInjector");
                        mjl.j jVar = (mjl.j) bVarU2;
                        return new mjl.k(jVar.f206089b, jVar.f206090c);
                    case 1:
                        KProperty[] kPropertyArr2 = IdentityDocumentsScreen.f106741a0;
                        return (l) ((mjl.k) identityDocumentsScreen.X.getValue()).f206093c.get();
                    default:
                        KProperty[] kPropertyArr3 = IdentityDocumentsScreen.f106741a0;
                        return n14.e.a(identityDocumentsScreen, identityDocumentsScreen.R2());
                }
            }
        });
        this.Z = w.y0(new Function0(this) { // from class: tpl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdentityDocumentsScreen f273417b;

            {
                this.f273417b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                IdentityDocumentsScreen identityDocumentsScreen = this.f273417b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = IdentityDocumentsScreen.f106741a0;
                        qji.b bVarU2 = identityDocumentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.revolut_id.documents.identity_documents.di.IdentityDocumentsScreenInjector");
                        mjl.j jVar = (mjl.j) bVarU2;
                        return new mjl.k(jVar.f206089b, jVar.f206090c);
                    case 1:
                        KProperty[] kPropertyArr2 = IdentityDocumentsScreen.f106741a0;
                        return (l) ((mjl.k) identityDocumentsScreen.X.getValue()).f206093c.get();
                    default:
                        KProperty[] kPropertyArr3 = IdentityDocumentsScreen.f106741a0;
                        return n14.e.a(identityDocumentsScreen, identityDocumentsScreen.R2());
                }
            }
        });
    }

    @Override // o10.a
    public final void A1(float f) {
        k3().f.f0(f);
    }

    @Override // o10.a
    public final CoordinatorLayout F0() {
        CoordinatorLayout identityDocumentsExpandableLayoutViewContainer = k3().f115665g;
        Intrinsics.checkNotNullExpressionValue(identityDocumentsExpandableLayoutViewContainer, "identityDocumentsExpandableLayoutViewContainer");
        return identityDocumentsExpandableLayoutViewContainer;
    }

    @Override // o10.a
    public final int K() {
        return l3().getItemsCount();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (mjl.k) this.X.getValue();
    }

    @Override // o10.a
    public final int V() {
        return l3().getHeight();
    }

    @Override // com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        h30.q qVar;
        Window window;
        View decorView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = com.revolut.core.ui_kit.R$id.internal_status_bar_controller_tag;
        y9 y9Var = y9.THEME;
        a5.a styleApplicator = new a5.a(19);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(styleApplicator, "styleApplicator");
        Activity activityI = f.i(context);
        View viewFindViewById = (activityI == null || (window = activityI.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(R.id.content);
        if (activityI == null || viewFindViewById == null) {
            qVar = null;
        } else {
            Object tag2 = viewFindViewById.getTag(i);
            r1 r1Var = tag2 instanceof r1 ? (r1) tag2 : null;
            if (r1Var == null) {
                r1Var = new r1();
                viewFindViewById.setTag(i, r1Var);
            }
            qVar = new h30.q(y9Var, styleApplicator, r1Var, context);
        }
        o1 priority = o1.OVERLAY;
        Intrinsics.checkNotNullParameter(priority, "priority");
        n1 n1Var = new n1(qVar, qVar != null ? Long.valueOf(qVar.K0(priority)) : null);
        this.U = n1Var;
        n1Var.a(y9.LIGHT);
        BasicNavBar basicNavBar = k3().e;
        basicNavBar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        basicNavBar.setBackground(d0.TRANSPARENT);
        basicNavBar.setTitle(new TextLocalisedClause(R$string.revolut_sso_documents_screen_title, null, null, 14));
        CardsCarouselView cardsCarouselViewL3 = l3();
        cardsCarouselViewL3.setModel(new c3(v.k(this.P, new IdDocumentLoadingDelegate(), this.Q)));
        c callback = this.S;
        Intrinsics.checkNotNullParameter(callback, "callback");
        cardsCarouselViewL3.f58404a.registerOnPageChangeCallback(callback);
    }

    @Override // o10.a
    public final HorizontalScrollExpandableLayoutView Z1() {
        HorizontalScrollExpandableLayoutView carouselWithSheetExpandableLayoutView = k3().d;
        Intrinsics.checkNotNullExpressionValue(carouselWithSheetExpandableLayoutView, "carouselWithSheetExpandableLayoutView");
        return carouselWithSheetExpandableLayoutView;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        CardsCarouselView cardsCarouselViewL3 = l3();
        cardsCarouselViewL3.getClass();
        c callback = this.S;
        Intrinsics.checkNotNullParameter(callback, "callback");
        cardsCarouselViewL3.f58404a.unregisterOnPageChangeCallback(callback);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        CardsCarouselView cardsCarouselViewL3 = l3();
        cardsCarouselViewL3.getClass();
        b listener = this.T;
        Intrinsics.checkNotNullParameter(listener, "listener");
        cardsCarouselViewL3.f.remove(listener);
        n1 n1Var = this.U;
        if (n1Var != null) {
            n1Var.b();
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(k3().e.f59211b), new tk5.c(this, continuation, 7), 3);
        ViewController.P2(this, rd0.e.b(k3().e.f59210a.f57403b), new d(this, continuation, 0), 3);
        CardsCarouselView cardsCarouselViewL3 = l3();
        cardsCarouselViewL3.getClass();
        b listener = this.T;
        Intrinsics.checkNotNullParameter(listener, "listener");
        cardsCarouselViewL3.f.add(listener);
        ViewController.P2(this, rd0.e.b(l3().d), new d(this, continuation, 1), 3);
        IdDocumentDelegate idDocumentDelegate = this.Q;
        ViewController.P2(this, rd0.e.b(idDocumentDelegate.f52507c.f121375b), new tpl.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(idDocumentDelegate.d.f121375b), new tpl.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(idDocumentDelegate.e.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(idDocumentDelegate.f.f121375b), new tpl.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.d), new d(this, continuation, 2), 3);
    }

    @Override // o10.a
    public final ViewGroup d1() {
        CarouselWithBottomSheetContainerLayout carouselWithSheetRootControllerView = k3().f;
        Intrinsics.checkNotNullExpressionValue(carouselWithSheetRootControllerView, "carouselWithSheetRootControllerView");
        return carouselWithSheetRootControllerView;
    }

    @Override // com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen
    public final void e3() {
        ViewPager2 viewPager2 = l3().f58404a;
        if (viewPager2.isFakeDragging()) {
            viewPager2.endFakeDrag();
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.V;
    }

    @Override // com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen
    public final void i3(float f) {
        l3().f58404a.fakeDragBy(f);
    }

    @Override // com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen
    public final void j3() {
        l3().f58404a.beginFakeDrag();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.Z.getValue();
    }

    public final l k3() {
        ViewBinding value = this.O.getValue(this, f106741a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l) value;
    }

    @Override // o10.a
    /* JADX INFO: renamed from: l1, reason: from getter */
    public final List getW() {
        return this.W;
    }

    public final CardsCarouselView l3() {
        CardsCarouselView carouselWithSheetCardsCarouselView = k3().f115664c;
        Intrinsics.checkNotNullExpressionValue(carouselWithSheetCardsCarouselView, "carouselWithSheetCardsCarouselView");
        return carouselWithSheetCardsCarouselView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public final tpl.l R2() {
        return (tpl.l) this.Y.getValue();
    }

    @Override // o10.a
    public final boolean n1() {
        CarouselWithBottomSheetContainerLayout carouselWithBottomSheetContainerLayout = k3().f;
        if (carouselWithBottomSheetContainerLayout.f107105j) {
            Function0 function0 = carouselWithBottomSheetContainerLayout.i;
            if (function0 != null) {
                function0.invoke();
            }
            z zVar = carouselWithBottomSheetContainerLayout.f107104h;
            if (zVar != null) {
                zVar.o();
                z zVar2 = carouselWithBottomSheetContainerLayout.f107104h;
                if (zVar2 != null) {
                    zVar2.p();
                }
                carouselWithBottomSheetContainerLayout.g0(false);
                return true;
            }
        }
        return false;
    }

    @Override // com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public final void B(n uiState, Object obj2) {
        vpl.b bVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        m mVar = obj2 instanceof m ? (m) obj2 : null;
        if ((mVar != null ? mVar.f273424a : true) && (bVar = uiState.d) != null) {
            LegacyContentContainerFrameLayout legacyContentContainerFrameLayout = k3().f115663b;
            int i = bVar.f291273a;
            BasicNavBar carouselWithSheetNavBar = k3().e;
            Intrinsics.checkNotNullExpressionValue(carouselWithSheetNavBar, "carouselWithSheetNavBar");
            legacyContentContainerFrameLayout.a(i, carouselWithSheetNavBar);
        }
        k3().e.setMenuItems(uiState.f273425a);
        l3().setItems(uiState.f273426b);
        super.B(uiState, mVar);
        k3().d.setVisibility(uiState.f273427c.isEmpty() ? 8 : 0);
    }

    @Override // o10.a
    public final void r1() {
        ((tpl.s) R2()).B2();
    }
}
