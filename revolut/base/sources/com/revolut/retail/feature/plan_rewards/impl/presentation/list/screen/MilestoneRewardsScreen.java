package com.revolut.retail.feature.plan_rewards.impl.presentation.list.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.core.ui_kit.delegates.CenteredContentTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CountDownTimerDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit.views.navbar.l;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.plan_rewards.impl.R$id;
import com.revolut.retail.feature.plan_rewards.impl.R$layout;
import com.revolut.retail.feature.plan_rewards.impl.presentation.list.screen.MilestoneRewardsScreen;
import fdk.c;
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
import ldk.b;
import ldk.d;
import ldk.g;
import ldk.i;
import ldk.j;
import ldk.r;
import ldk.x;
import ldk.y;
import te0.w;
import tx0.u1;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/screen/MilestoneRewardsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lldk/r;", "Ldli/a;", "Lldk/x;", "<init>", "()V", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MilestoneRewardsScreen extends ViewController<r> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(MilestoneRewardsScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/plan_rewards/impl/databinding/ScreenMilestoneRewardsBinding;", 0))};
    public final Object Q;
    public final Object R;
    public boolean T;
    public final Object U;
    public final int K = R$layout.screen_milestone_rewards;
    public final CellDetailsChevronDelegate L = new CellDetailsChevronDelegate();
    public final CenteredContentTileDelegate M = new CenteredContentTileDelegate();
    public final FullScreenStateDelegate N = new FullScreenStateDelegate();
    public final FooterTextDelegate O = new FooterTextDelegate();
    public final LargeActionButtonDelegate P = new LargeActionButtonDelegate();
    public final h S = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, cdk.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/plan_rewards/impl/databinding/ScreenMilestoneRewardsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.milestoneRewardsScreen_background;
            AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(p0, i);
            if (animatedBackgroundView != null) {
                i = R$id.milestoneRewardsScreen_navBarLargeCentred;
                NavBarLargeCentred navBarLargeCentred = (NavBarLargeCentred) ViewBindings.findChildViewById(p0, i);
                if (navBarLargeCentred != null) {
                    i = R$id.milestoneRewardsScreen_recyclerView;
                    ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                    if (screenContentRecyclerView != null) {
                        return new cdk.a((ControllerContainerCoordinatorLayout) p0, animatedBackgroundView, navBarLargeCentred, screenContentRecyclerView);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public MilestoneRewardsScreen() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: ldk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MilestoneRewardsScreen f194160b;

            {
                this.f194160b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MilestoneRewardsScreen milestoneRewardsScreen = this.f194160b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MilestoneRewardsScreen.V;
                        return (y) ((fdk.c) milestoneRewardsScreen.U.getValue()).f133973b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MilestoneRewardsScreen.V;
                        MilestoneRewardsScreen milestoneRewardsScreen2 = this.f194160b;
                        return dli.f.a(milestoneRewardsScreen2, milestoneRewardsScreen2.R2(), zhm.v.k(milestoneRewardsScreen2.L, new CountDownTimerDelegate(), milestoneRewardsScreen2.O, new FooterTextLoadingDelegate(), milestoneRewardsScreen2.N, new GridBoxDelegate(zhm.v.k(milestoneRewardsScreen2.M, new CenteredContentTileLoadingDelegate()), 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12), milestoneRewardsScreen2.P), R$id.milestoneRewardsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = MilestoneRewardsScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(milestoneRewardsScreen.m2()).a().get(fdk.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new fdk.c(((fdk.g) aVar2.b()).f133990n);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", fdk.g.class, " is not found"));
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: ldk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MilestoneRewardsScreen f194160b;

            {
                this.f194160b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MilestoneRewardsScreen milestoneRewardsScreen = this.f194160b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MilestoneRewardsScreen.V;
                        return (y) ((fdk.c) milestoneRewardsScreen.U.getValue()).f133973b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MilestoneRewardsScreen.V;
                        MilestoneRewardsScreen milestoneRewardsScreen2 = this.f194160b;
                        return dli.f.a(milestoneRewardsScreen2, milestoneRewardsScreen2.R2(), zhm.v.k(milestoneRewardsScreen2.L, new CountDownTimerDelegate(), milestoneRewardsScreen2.O, new FooterTextLoadingDelegate(), milestoneRewardsScreen2.N, new GridBoxDelegate(zhm.v.k(milestoneRewardsScreen2.M, new CenteredContentTileLoadingDelegate()), 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12), milestoneRewardsScreen2.P), R$id.milestoneRewardsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = MilestoneRewardsScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(milestoneRewardsScreen.m2()).a().get(fdk.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new fdk.c(((fdk.g) aVar2.b()).f133990n);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", fdk.g.class, " is not found"));
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: ldk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MilestoneRewardsScreen f194160b;

            {
                this.f194160b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MilestoneRewardsScreen milestoneRewardsScreen = this.f194160b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MilestoneRewardsScreen.V;
                        return (y) ((fdk.c) milestoneRewardsScreen.U.getValue()).f133973b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MilestoneRewardsScreen.V;
                        MilestoneRewardsScreen milestoneRewardsScreen2 = this.f194160b;
                        return dli.f.a(milestoneRewardsScreen2, milestoneRewardsScreen2.R2(), zhm.v.k(milestoneRewardsScreen2.L, new CountDownTimerDelegate(), milestoneRewardsScreen2.O, new FooterTextLoadingDelegate(), milestoneRewardsScreen2.N, new GridBoxDelegate(zhm.v.k(milestoneRewardsScreen2.M, new CenteredContentTileLoadingDelegate()), 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12), milestoneRewardsScreen2.P), R$id.milestoneRewardsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = MilestoneRewardsScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(milestoneRewardsScreen.m2()).a().get(fdk.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new fdk.c(((fdk.g) aVar2.b()).f133990n);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", fdk.g.class, " is not found"));
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        x uiState = (x) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        AnimatedBackgroundType animatedBackgroundType = uiState.f194182b;
        j jVar = uiState.f194181a;
        if (animatedBackgroundType != null) {
            d3().f23267b.setBackgroundType(animatedBackgroundType);
        }
        boolean z = this.T;
        this.T = jVar instanceof i;
        NavBarLargeCentred navBarLargeCentred = d3().f23268c;
        if (jVar instanceof g) {
            navBarLargeCentred.B();
            if (z) {
                d3().d.scrollToPosition(0);
            }
            ResourceImage resourceImage = new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            g gVar = (g) jVar;
            TextLocalisedClause textLocalisedClause = gVar.f194165a;
            navBarLargeCentred.setModel(new NavBarLargeCentred.Model(new l(textLocalisedClause), textLocalisedClause, null, gVar.f194166b, resourceImage, null, null, null, 980));
            return;
        }
        if (jVar.equals(ldk.h.f194167a)) {
            navBarLargeCentred.B();
            navBarLargeCentred.setModel(new NavBarLargeCentred.Model(null, null, null, null, new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 991));
        } else {
            if (!jVar.equals(i.f194168a)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarLargeCentred.setModel(new NavBarLargeCentred.Model(null, null, null, null, new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 991));
            navBarLargeCentred.H(u1.DEFAULT);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f23268c.f59292m), null, new la8.h(this, continuation, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.e), null, new b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f51821c), null, new ldk.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.e.f121375b), new l1g.e(this, continuation, 25), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d.f121375b), null, new ldk.e(this, null), 3);
    }

    public final cdk.a d3() {
        ViewBinding value = this.S.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (cdk.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final y R2() {
        return (y) this.Q.getValue();
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
