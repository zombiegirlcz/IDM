package com.revolut.feature.crypto_investments.impl.ui.screens.activity;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.crypto_investments.impl.R$layout;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreen;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import efm.r;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ku5.e;
import mx0.jc;
import org.jetbrains.annotations.NotNull;
import rgf.b;
import rr4.a;
import ru5.c;
import ru5.d;
import ru5.f;
import ru5.g;
import ru5.i;
import ru5.k;
import ru5.l;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/crypto_investments/impl/ui/screens/activity/ActivityScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lru5/l;", "Lcom/revolut/feature/crypto_investments/impl/ui/screens/activity/ActivityScreenContract$InputData;", "Laii/q;", "Companion", "a", "feature_crypto_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActivityScreen extends BaseRecyclerViewScreen<l, ActivityScreenContract$InputData, q> {
    public final int U;
    public final boolean V;
    public final Object W;
    public final Object X;
    public final h Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f71422a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f71423b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f71424d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f71425e0;
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(ActivityScreen.class, "binding", "getBinding()Lcom/revolut/feature/crypto_investments/impl/databinding/ScreenActivityBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityScreen(ActivityScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_activity;
        this.V = true;
        this.W = w.y0(new b(this, inputData, 24));
        final int i = 1;
        this.X = w.y0(new Function0(this) { // from class: ru5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityScreen f257407b;

            {
                this.f257407b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ActivityScreen activityScreen = this.f257407b;
                switch (i2) {
                    case 0:
                        ActivityScreen.Companion companion = ActivityScreen.INSTANCE;
                        return zhm.v.k((FixedTabsDelegate) activityScreen.c0.getValue(), new ListSubheaderDelegate(), (RowDelegate) activityScreen.Z.getValue(), (RowLoadingDelegate) activityScreen.f71422a0.getValue(), (FullScreenStateDelegate) activityScreen.f71423b0.getValue(), (SwipeToActionDelegate) activityScreen.f71424d0.getValue());
                    case 1:
                        ActivityScreen.Companion companion2 = ActivityScreen.INSTANCE;
                        return (k) ((ku5.e) activityScreen.W.getValue()).e.get();
                    default:
                        ActivityScreen.Companion companion3 = ActivityScreen.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) activityScreen.Z.getValue(), false);
                }
            }
        });
        this.Y = s.t(this, ru5.b.f);
        this.Z = w.y0(new a(12));
        this.f71422a0 = w.y0(new a(13));
        this.f71423b0 = w.y0(new a(14));
        this.c0 = w.y0(new a(15));
        final int i2 = 2;
        this.f71424d0 = w.y0(new Function0(this) { // from class: ru5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityScreen f257407b;

            {
                this.f257407b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ActivityScreen activityScreen = this.f257407b;
                switch (i22) {
                    case 0:
                        ActivityScreen.Companion companion = ActivityScreen.INSTANCE;
                        return zhm.v.k((FixedTabsDelegate) activityScreen.c0.getValue(), new ListSubheaderDelegate(), (RowDelegate) activityScreen.Z.getValue(), (RowLoadingDelegate) activityScreen.f71422a0.getValue(), (FullScreenStateDelegate) activityScreen.f71423b0.getValue(), (SwipeToActionDelegate) activityScreen.f71424d0.getValue());
                    case 1:
                        ActivityScreen.Companion companion2 = ActivityScreen.INSTANCE;
                        return (k) ((ku5.e) activityScreen.W.getValue()).e.get();
                    default:
                        ActivityScreen.Companion companion3 = ActivityScreen.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) activityScreen.Z.getValue(), false);
                }
            }
        });
        final int i3 = 0;
        this.f71425e0 = w.y0(new Function0(this) { // from class: ru5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityScreen f257407b;

            {
                this.f257407b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ActivityScreen activityScreen = this.f257407b;
                switch (i22) {
                    case 0:
                        ActivityScreen.Companion companion = ActivityScreen.INSTANCE;
                        return zhm.v.k((FixedTabsDelegate) activityScreen.c0.getValue(), new ListSubheaderDelegate(), (RowDelegate) activityScreen.Z.getValue(), (RowLoadingDelegate) activityScreen.f71422a0.getValue(), (FullScreenStateDelegate) activityScreen.f71423b0.getValue(), (SwipeToActionDelegate) activityScreen.f71424d0.getValue());
                    case 1:
                        ActivityScreen.Companion companion2 = ActivityScreen.INSTANCE;
                        return (k) ((ku5.e) activityScreen.W.getValue()).e.get();
                    default:
                        ActivityScreen.Companion companion3 = ActivityScreen.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) activityScreen.Z.getValue(), false);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (e) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f168518c.f59410q), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f168518c.f59409p.f57337m), null, new d(this, continuation, 2), 3);
        r map = ((SwipeToActionDelegate) this.f71424d0.getValue()).f.map(new rpi.d(new rsl.c(22), 25));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new ru5.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.f71423b0.getValue()).f52371h.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.Z.getValue()).f53218h), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FixedTabsDelegate) this.c0.getValue()).f52339c.f121375b), null, new d(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f168518c.u0()), null, new c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f168518c.v0()), null, new c(this, continuation, 3), 3);
        int i = 0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f168518c.f59409p.f57336l), null, new c(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f168518c.o.f57403b), null, new d(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f168517b.f58882b), null, new d(this, continuation, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f168518c;
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.crypto_investments_search_placeholder, null, null, 14));
        navBarWithToolbar.setTag("CRYPTO_ACTIVITY_NAV_BAR");
        ScreenContentRecyclerView recyclerView = h3().d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        knm.b.v(kli.a.k(m2(), 16.0f), recyclerView);
        h3().d.setTag("CRYPTO_ACTIVITY_RECYCLER_VIEW");
        h3().f168517b.setTabsGravity(jc.RIGHT);
        h3().e.post(new o6.a(this, 23));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF68584d0() {
        return (List) this.f71425e0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(l uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f168518c;
        Clause clause = uiState.f257426g;
        Integer num = uiState.f;
        String str = uiState.e;
        List<com.revolut.core.ui_kit.views.q> list = uiState.d;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setFiltersState(uiState.f257424b);
        navBarWithToolbar.setMenuItems(uiState.f257425c);
        i iVar = oVar instanceof i ? (i) oVar : null;
        if (iVar == null || iVar.f257415b) {
            h3().f168517b.setItems(list, str);
        }
        h3().f168517b.setVisibility(list.isEmpty() ? 8 : 0);
        j3();
        if (str != null) {
            Tabs monthTabs = h3().f168517b;
            Intrinsics.checkNotNullExpressionValue(monthTabs, "monthTabs");
            Tabs.u(monthTabs, uiState.e, false, false, false, 14);
        }
        if (iVar == null || !iVar.f257414a || num == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = h3().d.getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(num.intValue(), h3().f168517b.getHeight());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final iu5.a h3() {
        ViewBinding value = this.Y.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (iu5.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final k T2() {
        return (k) this.X.getValue();
    }

    public final void j3() {
        h3().e.a(h3().f168518c.getExpandRatio() == BitmapDescriptorFactory.HUE_RED && h3().f168517b.getVisibility() == 0);
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
