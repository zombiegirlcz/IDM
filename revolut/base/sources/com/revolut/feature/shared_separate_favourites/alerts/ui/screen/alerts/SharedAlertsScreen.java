package com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jii.m;
import jki.o;
import koi.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ned.i;
import no0.a;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import wal.f;
import wed.d;
import wed.g;
import wed.j;
import wed.k;
import wed.p;
import wed.q;
import wed.r;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/alerts/ui/screen/alerts/SharedAlertsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lwed/r;", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/screen/alerts/SharedAlertsScreenContract$InputData;", "Lwed/p;", "Companion", "a", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SharedAlertsScreen extends BaseRecyclerViewScreen<r, SharedAlertsScreenContract$InputData, p> {
    public final boolean U;
    public final int V;
    public final h W;
    public final a X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f86715a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f86716b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f86717d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f86718e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f86719h0;
    public final Object i0;
    public final Integer j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f86720k0;
    public final Object l0;
    public static final /* synthetic */ KProperty[] m0 = {o0.f186429a.j(new h0(SharedAlertsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedAlertsScreen(SharedAlertsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = true;
        this.V = R$layout.screen_recycler_navbar;
        this.W = s.t(this, d.f);
        c delegatesManager = new c(0);
        boolean z = this.Q;
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        this.X = new a(delegatesManager, false, z, true);
        this.Y = w.y0(new f(22));
        this.Z = w.y0(new f(25));
        final int i = 3;
        this.f86715a0 = w.y0(new Function0(this) { // from class: wed.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedAlertsScreen f296712b;

            {
                this.f296712b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SharedAlertsScreen sharedAlertsScreen = this.f296712b;
                switch (i2) {
                    case 0:
                        SharedAlertsScreen.Companion companion = SharedAlertsScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) sharedAlertsScreen.Y.getValue(), (TextDelegate) sharedAlertsScreen.Z.getValue(), (RowLoadingDelegate) sharedAlertsScreen.f86716b0.getValue(), (ListSubheaderDelegate) sharedAlertsScreen.c0.getValue(), (SwipeToActionDelegate) sharedAlertsScreen.f86715a0.getValue(), (FixedTabsDelegate) sharedAlertsScreen.f0.getValue(), (FullScreenStateDelegate) sharedAlertsScreen.g0.getValue());
                    case 1:
                        SharedAlertsScreen.Companion companion2 = SharedAlertsScreen.INSTANCE;
                        return (q) ((ned.i) sharedAlertsScreen.i0.getValue()).o.get();
                    case 2:
                        SharedAlertsScreen.Companion companion3 = SharedAlertsScreen.INSTANCE;
                        return (t60.b) ((ned.i) sharedAlertsScreen.i0.getValue()).f214465j.get();
                    default:
                        SharedAlertsScreen.Companion companion4 = SharedAlertsScreen.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) sharedAlertsScreen.Y.getValue(), false);
                }
            }
        });
        this.f86716b0 = w.y0(new f(26));
        this.c0 = w.y0(new f(27));
        this.f86717d0 = w.y0(new f(28));
        this.f86718e0 = w.y0(new f(29));
        this.f0 = w.y0(new f(23));
        this.g0 = w.y0(new f(24));
        final int i2 = 0;
        this.f86719h0 = w.y0(new Function0(this) { // from class: wed.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedAlertsScreen f296712b;

            {
                this.f296712b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SharedAlertsScreen sharedAlertsScreen = this.f296712b;
                switch (i22) {
                    case 0:
                        SharedAlertsScreen.Companion companion = SharedAlertsScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) sharedAlertsScreen.Y.getValue(), (TextDelegate) sharedAlertsScreen.Z.getValue(), (RowLoadingDelegate) sharedAlertsScreen.f86716b0.getValue(), (ListSubheaderDelegate) sharedAlertsScreen.c0.getValue(), (SwipeToActionDelegate) sharedAlertsScreen.f86715a0.getValue(), (FixedTabsDelegate) sharedAlertsScreen.f0.getValue(), (FullScreenStateDelegate) sharedAlertsScreen.g0.getValue());
                    case 1:
                        SharedAlertsScreen.Companion companion2 = SharedAlertsScreen.INSTANCE;
                        return (q) ((ned.i) sharedAlertsScreen.i0.getValue()).o.get();
                    case 2:
                        SharedAlertsScreen.Companion companion3 = SharedAlertsScreen.INSTANCE;
                        return (t60.b) ((ned.i) sharedAlertsScreen.i0.getValue()).f214465j.get();
                    default:
                        SharedAlertsScreen.Companion companion4 = SharedAlertsScreen.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) sharedAlertsScreen.Y.getValue(), false);
                }
            }
        });
        this.i0 = w.y0(new w83.a(this, inputData, 10));
        this.j0 = inputData.f86721a.f ? Integer.valueOf(R$style.UiKitTheme_TransparentSlider) : null;
        final int i3 = 1;
        this.f86720k0 = w.y0(new Function0(this) { // from class: wed.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedAlertsScreen f296712b;

            {
                this.f296712b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SharedAlertsScreen sharedAlertsScreen = this.f296712b;
                switch (i22) {
                    case 0:
                        SharedAlertsScreen.Companion companion = SharedAlertsScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) sharedAlertsScreen.Y.getValue(), (TextDelegate) sharedAlertsScreen.Z.getValue(), (RowLoadingDelegate) sharedAlertsScreen.f86716b0.getValue(), (ListSubheaderDelegate) sharedAlertsScreen.c0.getValue(), (SwipeToActionDelegate) sharedAlertsScreen.f86715a0.getValue(), (FixedTabsDelegate) sharedAlertsScreen.f0.getValue(), (FullScreenStateDelegate) sharedAlertsScreen.g0.getValue());
                    case 1:
                        SharedAlertsScreen.Companion companion2 = SharedAlertsScreen.INSTANCE;
                        return (q) ((ned.i) sharedAlertsScreen.i0.getValue()).o.get();
                    case 2:
                        SharedAlertsScreen.Companion companion3 = SharedAlertsScreen.INSTANCE;
                        return (t60.b) ((ned.i) sharedAlertsScreen.i0.getValue()).f214465j.get();
                    default:
                        SharedAlertsScreen.Companion companion4 = SharedAlertsScreen.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) sharedAlertsScreen.Y.getValue(), false);
                }
            }
        });
        final int i5 = 2;
        this.l0 = w.y0(new Function0(this) { // from class: wed.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedAlertsScreen f296712b;

            {
                this.f296712b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                SharedAlertsScreen sharedAlertsScreen = this.f296712b;
                switch (i22) {
                    case 0:
                        SharedAlertsScreen.Companion companion = SharedAlertsScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) sharedAlertsScreen.Y.getValue(), (TextDelegate) sharedAlertsScreen.Z.getValue(), (RowLoadingDelegate) sharedAlertsScreen.f86716b0.getValue(), (ListSubheaderDelegate) sharedAlertsScreen.c0.getValue(), (SwipeToActionDelegate) sharedAlertsScreen.f86715a0.getValue(), (FixedTabsDelegate) sharedAlertsScreen.f0.getValue(), (FullScreenStateDelegate) sharedAlertsScreen.g0.getValue());
                    case 1:
                        SharedAlertsScreen.Companion companion2 = SharedAlertsScreen.INSTANCE;
                        return (q) ((ned.i) sharedAlertsScreen.i0.getValue()).o.get();
                    case 2:
                        SharedAlertsScreen.Companion companion3 = SharedAlertsScreen.INSTANCE;
                        return (t60.b) ((ned.i) sharedAlertsScreen.i0.getValue()).f214465j.get();
                    default:
                        SharedAlertsScreen.Companion companion4 = SharedAlertsScreen.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) sharedAlertsScreen.Y.getValue(), false);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getJ0() {
        return this.j0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (i) this.i0.getValue();
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) this.Y.getValue()).f53218h), null, new wed.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((SwipeToActionDelegate) this.f86715a0.getValue()).f), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((TextDelegate) this.Z.getValue()).d), null, new w3k.i(this, (Continuation) null, 23), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((ListSubheaderDelegate) this.c0.getValue()).f52707c), null, new wed.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new w65.c(this, continuation, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.s0()), null, new wed.i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.o.f57403b), null, new wed.e(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((SelectableDelegate) this.f86717d0.getValue()).r()), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButtonDelegate) this.f86718e0.getValue()).d.f121375b), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FixedTabsDelegate) this.f0.getValue()).f52339c.f121375b), null, new wed.e(this, continuation, 0), 3);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        efm.r rVarDebounce = efm.r.timer(200L, timeUnit).switchMap(new w4l.c(new wed.c(this, 1), 21)).debounce(300L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        efm.r rVarDistinctUntilChanged = w.a0(rVarDebounce, new wed.c(this, 0)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarDistinctUntilChanged), null, new wed.e(this, continuation, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174540c.setTag("SharedAlertsScreen_RecyclerView");
        h3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((i) this.i0.getValue()).e.get()).d(v.k((SelectableDelegate) this.f86717d0.getValue(), (LargeActionButtonDelegate) this.f86718e0.getValue()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF103587e0() {
        return (List) this.f86719h0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final koi.h d3() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(r uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f296752b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setMenuItems(uiState.f296753c);
        navBarWithToolbar.setActions(uiState.f296751a);
        navBarWithToolbar.setDescriptionVisible(false);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.V;
    }

    public final m h3() {
        ViewBinding value = this.W.getValue(this, m0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final q T2() {
        return (q) this.f86720k0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
