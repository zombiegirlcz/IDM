package com.revolut.feature.rewards.impl.ui.concierge.screen.details;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ExpandableCellLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RectangularButtonDelegate;
import com.revolut.core.ui_kit.delegates.RectangularButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.rewards.impl.R$id;
import com.revolut.feature.rewards.impl.R$layout;
import com.revolut.feature.rewards.impl.ui.concierge.screen.details.ConciergeAlbertineDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ea4.d;
import eic.c;
import eic.e;
import eic.f;
import eic.g;
import eic.i;
import eic.j;
import eic.k;
import eic.l;
import eic.o;
import eic.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import thc.b;
import tx0.u1;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/concierge/screen/details/ConciergeAlbertineDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Leic/o;", "Ldli/a;", "Leic/s;", "<init>", "()V", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConciergeAlbertineDetailsScreen extends ViewController<o> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ConciergeAlbertineDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/rewards/impl/databinding/ScreenConciergeAlbertineDetailsBinding;", 0))};
    public final Object Q;
    public final Object R;
    public final Object T;
    public final int K = R$layout.screen_concierge_albertine_details;
    public final PlainTextDelegate L = new PlainTextDelegate();
    public final RectangularButtonDelegate M = new RectangularButtonDelegate();
    public final RowDelegate N = new RowDelegate(null, null, 7);
    public final LargeActionButtonDelegate O = new LargeActionButtonDelegate();
    public final FullScreenStateDelegate P = new FullScreenStateDelegate();
    public final h S = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/rewards/impl/databinding/ScreenConciergeAlbertineDetailsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.conciergeAlbertineDetailsScreen_largeActionButton;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                i = R$id.conciergeAlbertineDetailsScreen_largeActionButtonContainer;
                if (((FrameLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                    i = R$id.conciergeAlbertineDetailsScreen_navBarLargeCentred;
                    NavBarLargeCentred navBarLargeCentred = (NavBarLargeCentred) ViewBindings.findChildViewById(p0, i);
                    if (navBarLargeCentred != null) {
                        i = R$id.conciergeAlbertineDetailsScreen_recyclerView;
                        if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                            return new b((ControllerContainerCoordinatorLayout) p0, largeActionButton, navBarLargeCentred);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public ConciergeAlbertineDetailsScreen() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: eic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConciergeAlbertineDetailsScreen f126467b;

            {
                this.f126467b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConciergeAlbertineDetailsScreen conciergeAlbertineDetailsScreen = this.f126467b;
                int i3 = 0;
                int i5 = 1;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ConciergeAlbertineDetailsScreen.U;
                        return (r) ((whc.i) conciergeAlbertineDetailsScreen.T.getValue()).f297537c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ConciergeAlbertineDetailsScreen.U;
                        ConciergeAlbertineDetailsScreen conciergeAlbertineDetailsScreen2 = this.f126467b;
                        return dli.f.a(conciergeAlbertineDetailsScreen2, conciergeAlbertineDetailsScreen2.d(), v.k(new GridBoxDelegate(v.k(conciergeAlbertineDetailsScreen2.M, new RectangularButtonLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), conciergeAlbertineDetailsScreen2.L, new ExpandableCellLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), conciergeAlbertineDetailsScreen2.N, new RowLoadingDelegate(), conciergeAlbertineDetailsScreen2.O, conciergeAlbertineDetailsScreen2.P), R$id.conciergeAlbertineDetailsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ConciergeAlbertineDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(conciergeAlbertineDetailsScreen.m2()).a().get(whc.s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", whc.s.class, " is not found"));
                        }
                        whc.s sVar = ((whc.s) aVar2.b()).f297580t;
                        whc.i iVar = new whc.i();
                        iVar.f297535a = e4m.b.b(e4m.c.a(conciergeAlbertineDetailsScreen));
                        int i6 = 27;
                        iVar.f297536b = e4m.b.b(new vzc.j(sVar, iVar, i5, i6));
                        iVar.f297537c = e4m.b.b(new vzc.j(sVar, iVar, i3, i6));
                        return iVar;
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: eic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConciergeAlbertineDetailsScreen f126467b;

            {
                this.f126467b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConciergeAlbertineDetailsScreen conciergeAlbertineDetailsScreen = this.f126467b;
                int i3 = 0;
                int i5 = 1;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConciergeAlbertineDetailsScreen.U;
                        return (r) ((whc.i) conciergeAlbertineDetailsScreen.T.getValue()).f297537c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ConciergeAlbertineDetailsScreen.U;
                        ConciergeAlbertineDetailsScreen conciergeAlbertineDetailsScreen2 = this.f126467b;
                        return dli.f.a(conciergeAlbertineDetailsScreen2, conciergeAlbertineDetailsScreen2.d(), v.k(new GridBoxDelegate(v.k(conciergeAlbertineDetailsScreen2.M, new RectangularButtonLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), conciergeAlbertineDetailsScreen2.L, new ExpandableCellLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), conciergeAlbertineDetailsScreen2.N, new RowLoadingDelegate(), conciergeAlbertineDetailsScreen2.O, conciergeAlbertineDetailsScreen2.P), R$id.conciergeAlbertineDetailsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ConciergeAlbertineDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(conciergeAlbertineDetailsScreen.m2()).a().get(whc.s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", whc.s.class, " is not found"));
                        }
                        whc.s sVar = ((whc.s) aVar2.b()).f297580t;
                        whc.i iVar = new whc.i();
                        iVar.f297535a = e4m.b.b(e4m.c.a(conciergeAlbertineDetailsScreen));
                        int i6 = 27;
                        iVar.f297536b = e4m.b.b(new vzc.j(sVar, iVar, i5, i6));
                        iVar.f297537c = e4m.b.b(new vzc.j(sVar, iVar, i3, i6));
                        return iVar;
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: eic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConciergeAlbertineDetailsScreen f126467b;

            {
                this.f126467b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ConciergeAlbertineDetailsScreen conciergeAlbertineDetailsScreen = this.f126467b;
                int i32 = 0;
                int i5 = 1;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConciergeAlbertineDetailsScreen.U;
                        return (r) ((whc.i) conciergeAlbertineDetailsScreen.T.getValue()).f297537c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ConciergeAlbertineDetailsScreen.U;
                        ConciergeAlbertineDetailsScreen conciergeAlbertineDetailsScreen2 = this.f126467b;
                        return dli.f.a(conciergeAlbertineDetailsScreen2, conciergeAlbertineDetailsScreen2.d(), v.k(new GridBoxDelegate(v.k(conciergeAlbertineDetailsScreen2.M, new RectangularButtonLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), conciergeAlbertineDetailsScreen2.L, new ExpandableCellLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), conciergeAlbertineDetailsScreen2.N, new RowLoadingDelegate(), conciergeAlbertineDetailsScreen2.O, conciergeAlbertineDetailsScreen2.P), R$id.conciergeAlbertineDetailsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ConciergeAlbertineDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(conciergeAlbertineDetailsScreen.m2()).a().get(whc.s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", whc.s.class, " is not found"));
                        }
                        whc.s sVar = ((whc.s) aVar2.b()).f297580t;
                        whc.i iVar = new whc.i();
                        iVar.f297535a = e4m.b.b(e4m.c.a(conciergeAlbertineDetailsScreen));
                        int i6 = 27;
                        iVar.f297536b = e4m.b.b(new vzc.j(sVar, iVar, i5, i6));
                        iVar.f297537c = e4m.b.b(new vzc.j(sVar, iVar, i32, i6));
                        return iVar;
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        eic.s uiState = (eic.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarLargeCentred navBarLargeCentred = d3().f271361c;
        l lVar = uiState.f126481a;
        if (lVar instanceof i) {
            i iVar = (i) lVar;
            TextClause textClause = iVar.f126474c;
            navBarLargeCentred.setLargeImage(iVar.f126472a, iVar.f126473b);
            navBarLargeCentred.setModel(new NavBarLargeCentred.Model(new com.revolut.core.ui_kit.views.navbar.l(textClause), textClause, iVar.d, iVar.e, new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 976));
            navBarLargeCentred.B();
        } else if (lVar.equals(j.f126475a)) {
            navBarLargeCentred.B();
        } else {
            if (!lVar.equals(k.f126476a)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarLargeCentred.H(u1.TITLE_AND_SUBTITLE);
        }
        LargeActionButton largeActionButton = d3().f271360b;
        g gVar = uiState.f126482b;
        if (!(gVar instanceof e)) {
            if (!gVar.equals(f.f126470a)) {
                throw new NoWhenBranchMatchedException();
            }
            largeActionButton.setVisibility(8);
        } else {
            largeActionButton.setVisibility(0);
            e eVar = (e) gVar;
            largeActionButton.setIcon(eVar.f126468a);
            largeActionButton.setText(eVar.f126469b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (whc.i) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f271361c.f59292m), null, new eic.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f271361c.C()), null, new eic.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f271360b.o), null, new eic.b(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.d.f121375b), null, new d(this, continuation, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53149c), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new eic.d(this, null), 3);
    }

    public final b d3() {
        ViewBinding value = this.S.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r d() {
        return (r) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
