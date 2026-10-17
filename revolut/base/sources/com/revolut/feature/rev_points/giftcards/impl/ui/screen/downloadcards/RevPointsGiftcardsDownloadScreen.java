package com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import aw0.e;
import aw0.n6;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.giftcards.impl.R$id;
import com.revolut.feature.rev_points.giftcards.impl.R$layout;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.RevPointsGiftcardsDownloadScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import fwb.c;
import grl.k9;
import iwb.f;
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
import no.m;
import sq5.j;
import swb.b;
import swb.d;
import swb.g;
import swb.i;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/downloadcards/RevPointsGiftcardsDownloadScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lswb/g;", "Ldli/a;", "Lswb/i;", "Lno/m;", "<init>", "()V", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsGiftcardsDownloadScreen extends ViewController<g> implements dli.a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(RevPointsGiftcardsDownloadScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/giftcards/impl/databinding/ScreenRevPointsGiftcardDownloadBinding;", 0))};
    public final int K = R$layout.screen_rev_points_giftcard_download;
    public final AnalyticsProduct.Retail L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final h T;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/rev_points/giftcards/impl/databinding/ScreenRevPointsGiftcardDownloadBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.revPointsGiftcardDownloadScreen_actionFooterView;
            ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
            if (actionFooterView != null) {
                ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
                int i2 = R$id.revPointsGiftcardDownloadScreen_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i2);
                if (navBarWithToolbar != null) {
                    i2 = R$id.revPointsGiftcardDownloadScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i2)) != null) {
                        return new c(actionFooterView, navBarWithToolbar, controllerContainerCoordinatorLayout);
                    }
                }
                i = i2;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public RevPointsGiftcardsDownloadScreen() {
        k9 k9Var = k9.GiftCards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = w.y0(new j(15));
        this.N = w.y0(new j(16));
        this.O = w.y0(new j(17));
        this.P = w.y0(new j(18));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: swb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsDownloadScreen f266172b;

            {
                this.f266172b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i5 = 1;
                RevPointsGiftcardsDownloadScreen revPointsGiftcardsDownloadScreen = this.f266172b;
                int i6 = 2;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsDownloadScreen.U;
                        RevPointsGiftcardsDownloadScreen revPointsGiftcardsDownloadScreen2 = this.f266172b;
                        return dli.f.a(revPointsGiftcardsDownloadScreen2, revPointsGiftcardsDownloadScreen2.d(), v.k((FullScreenStateDelegate) revPointsGiftcardsDownloadScreen2.M.getValue(), (RowLoadingDelegate) revPointsGiftcardsDownloadScreen2.N.getValue(), (RowDelegate) revPointsGiftcardsDownloadScreen2.O.getValue(), (ListSubheaderDelegate) revPointsGiftcardsDownloadScreen2.P.getValue()), R$id.revPointsGiftcardDownloadScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsDownloadScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsDownloadScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        iwb.f fVar = new iwb.f();
                        fVar.f169027a = e4m.b.b(new iwb.b(eVar, fVar, i5, i6));
                        fVar.f169028b = e4m.b.b(new iwb.b(eVar, fVar, i3, i6));
                        return fVar;
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsDownloadScreen.U;
                        return (h) ((iwb.f) revPointsGiftcardsDownloadScreen.R.getValue()).f169028b.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: swb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsDownloadScreen f266172b;

            {
                this.f266172b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i5 = 1;
                RevPointsGiftcardsDownloadScreen revPointsGiftcardsDownloadScreen = this.f266172b;
                int i6 = 2;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsDownloadScreen.U;
                        RevPointsGiftcardsDownloadScreen revPointsGiftcardsDownloadScreen2 = this.f266172b;
                        return dli.f.a(revPointsGiftcardsDownloadScreen2, revPointsGiftcardsDownloadScreen2.d(), v.k((FullScreenStateDelegate) revPointsGiftcardsDownloadScreen2.M.getValue(), (RowLoadingDelegate) revPointsGiftcardsDownloadScreen2.N.getValue(), (RowDelegate) revPointsGiftcardsDownloadScreen2.O.getValue(), (ListSubheaderDelegate) revPointsGiftcardsDownloadScreen2.P.getValue()), R$id.revPointsGiftcardDownloadScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsDownloadScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsDownloadScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        iwb.f fVar = new iwb.f();
                        fVar.f169027a = e4m.b.b(new iwb.b(eVar, fVar, i5, i6));
                        fVar.f169028b = e4m.b.b(new iwb.b(eVar, fVar, i3, i6));
                        return fVar;
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsDownloadScreen.U;
                        return (h) ((iwb.f) revPointsGiftcardsDownloadScreen.R.getValue()).f169028b.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: swb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsDownloadScreen f266172b;

            {
                this.f266172b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i5 = 1;
                RevPointsGiftcardsDownloadScreen revPointsGiftcardsDownloadScreen = this.f266172b;
                int i6 = 2;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsDownloadScreen.U;
                        RevPointsGiftcardsDownloadScreen revPointsGiftcardsDownloadScreen2 = this.f266172b;
                        return dli.f.a(revPointsGiftcardsDownloadScreen2, revPointsGiftcardsDownloadScreen2.d(), v.k((FullScreenStateDelegate) revPointsGiftcardsDownloadScreen2.M.getValue(), (RowLoadingDelegate) revPointsGiftcardsDownloadScreen2.N.getValue(), (RowDelegate) revPointsGiftcardsDownloadScreen2.O.getValue(), (ListSubheaderDelegate) revPointsGiftcardsDownloadScreen2.P.getValue()), R$id.revPointsGiftcardDownloadScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsDownloadScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsDownloadScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        iwb.f fVar = new iwb.f();
                        fVar.f169027a = e4m.b.b(new iwb.b(eVar, fVar, i5, i6));
                        fVar.f169028b = e4m.b.b(new iwb.b(eVar, fVar, i32, i6));
                        return fVar;
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsDownloadScreen.U;
                        return (h) ((iwb.f) revPointsGiftcardsDownloadScreen.R.getValue()).f169028b.get();
                }
            }
        });
        this.T = s.t(this, a.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f138597c;
        navBarWithToolbar.setToolbarTitle(uiState.f266175a);
        navBarWithToolbar.setTitle(uiState.f266175a, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionText(uiState.f266176b);
        navBarWithToolbar.setDescriptionVisible(true);
        d3().f138596b.setModel(new e(false, null, null, new n6(uiState.f266177c, LargeActionButton.ButtonStyle.f58725a, new ResourceImage(R$drawable.uikit_icn_24_download, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, uiState.d, null, null, 984), null, null, 55));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f138597c.f59410q), null, new b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.O.getValue()).f53218h), null, new swb.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) this.P.getValue()).f), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f138596b.f), null, new b(this, continuation, 1), 3);
    }

    public final c d3() {
        ViewBinding value = this.T.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final swb.h d() {
        return (swb.h) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
