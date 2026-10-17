package com.revolut.retail.feature.learn.impl.ui.rewards;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.learn.impl.R$id;
import com.revolut.retail.feature.learn.impl.R$layout;
import com.revolut.retail.feature.learn.impl.R$string;
import com.revolut.retail.feature.learn.impl.ui.rewards.RewardsHomeScreen;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lyj.b;
import no.m;
import nyj.d;
import rd0.e;
import t9l.f;
import te0.w;
import tk5.c;
import tyj.i;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/learn/impl/ui/rewards/RewardsHomeScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ltyj/i;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "Lno/m;", "<init>", "()V", "feature_learn_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RewardsHomeScreen extends BaseRecyclerViewScreen<i, IOData$EmptyInput, q> implements m {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f101767e0 = {o0.f186429a.j(new h0(RewardsHomeScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/learn/impl/databinding/ScreenRewardsHomeBinding;", 0))};
    public final boolean U;
    public final int V;
    public final int W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final FullScreenStateDelegate f101768a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f101769b0;
    public final List c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final AnalyticsProduct.Retail f101770d0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/learn/impl/databinding/ScreenRewardsHomeBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.rewardsHome_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.rewardsHome_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new b((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public RewardsHomeScreen() {
        super(IOData$EmptyInput.f98299a);
        final int i = 1;
        this.U = true;
        this.V = R$layout.screen_rewards_home;
        this.W = R$id.rewardsHome_recyclerView;
        this.X = s.t(this, a.f);
        final int i2 = 0;
        this.Y = w.y0(new Function0(this) { // from class: tyj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardsHomeScreen f275667b;

            {
                this.f275667b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                RewardsHomeScreen rewardsHomeScreen = this.f275667b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = RewardsHomeScreen.f101767e0;
                        phm.a aVar = (phm.a) ue0.e.j(rewardsHomeScreen.m2()).a().get(nyj.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nyj.h.class, " is not found"));
                        }
                        nyj.c cVar = ((nyj.c) ((nyj.h) aVar2.b())).f220889m;
                        nyj.d dVar = new nyj.d();
                        dVar.f220899a = e4m.b.b(new nk7.k(cVar, dVar, 1, 28));
                        dVar.f220900b = e4m.b.b(new nk7.k(cVar, dVar, 0, 28));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr2 = RewardsHomeScreen.f101767e0;
                        return (h) ((nyj.d) rewardsHomeScreen.Y.getValue()).f220900b.get();
                }
            }
        });
        this.Z = w.y0(new Function0(this) { // from class: tyj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardsHomeScreen f275667b;

            {
                this.f275667b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                RewardsHomeScreen rewardsHomeScreen = this.f275667b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = RewardsHomeScreen.f101767e0;
                        phm.a aVar = (phm.a) ue0.e.j(rewardsHomeScreen.m2()).a().get(nyj.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nyj.h.class, " is not found"));
                        }
                        nyj.c cVar = ((nyj.c) ((nyj.h) aVar2.b())).f220889m;
                        nyj.d dVar = new nyj.d();
                        dVar.f220899a = e4m.b.b(new nk7.k(cVar, dVar, 1, 28));
                        dVar.f220900b = e4m.b.b(new nk7.k(cVar, dVar, 0, 28));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr2 = RewardsHomeScreen.f101767e0;
                        return (h) ((nyj.d) rewardsHomeScreen.Y.getValue()).f220900b.get();
                }
            }
        });
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f101768a0 = fullScreenStateDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f101769b0 = rowDelegate;
        this.c0 = v.k(fullScreenStateDelegate, new SwipeToActionDelegate(rowDelegate, false), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new CounterTextDelegate());
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137509x;
        this.f101770d0 = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.f101770d0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (tyj.h) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.X.getValue(this, f101767e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(((b) value).f200847b.f59410q), null, new c(this, null, 28), 3);
        f fVar = new f(e.b(this.f101768a0.f52371h.f121375b), 28);
        ?? r142 = this.Z;
        com.revolut.kompot.navigable.a.g2(this, fVar, null, new ryj.f(2, (tyj.h) r142.getValue(), tyj.h.class, "onEvent", "onEvent(Lcom/revolut/retail/feature/learn/impl/ui/rewards/RewardsHomeScreenContract$Event;)V", 4, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, new f(e.b(this.f101769b0.f53218h), 29), null, new ryj.f(2, (tyj.h) r142.getValue(), tyj.h.class, "onEvent", "onEvent(Lcom/revolut/retail/feature/learn/impl/ui/rewards/RewardsHomeScreenContract$Event;)V", 4, 29), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.X.getValue(this, f101767e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((b) value).f200847b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.investmentlearn_home_rewards_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.investmentlearn_home_rewards_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF95989b0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
