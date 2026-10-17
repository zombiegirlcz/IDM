package com.revolut.feature.shops.impl.ui.combined_search;

import ajd.c;
import ajd.d;
import ajd.f;
import ajd.g;
import ajd.i;
import ajd.l;
import ajd.o;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shops.impl.R$string;
import com.revolut.feature.shops.impl.ui.combined_search.ShopsCombinedSearchScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import did.j;
import efm.r;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import skm.p0;
import te0.w;
import vc.s;
import xv0.x;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/combined_search/ShopsCombinedSearchScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lajd/o;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lajd/i;", "Lwhd/b;", "<init>", "()V", "Companion", "a", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShopsCombinedSearchScreen extends BaseRecyclerViewScreen<o, IOData$EmptyInput, i> implements whd.b {
    public final h U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f87159a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f87160b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f87161d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f87162e0;
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(ShopsCombinedSearchScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.shops.impl.ui.combined_search.ShopsCombinedSearchScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public ShopsCombinedSearchScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = s.t(this, b.f);
        Lazy lazyY0 = w.y0(new aj0.o(5));
        this.V = lazyY0;
        Lazy lazyY02 = w.y0(new aj0.o(6));
        this.W = lazyY02;
        Lazy lazyY03 = w.y0(new aj0.o(7));
        this.X = lazyY03;
        Lazy lazyY04 = w.y0(new aj0.o(8));
        this.Y = lazyY04;
        this.Z = R$layout.screen_recycler_navbar;
        final int i = 1;
        this.f87159a0 = true;
        final int i2 = 0;
        this.f87160b0 = w.y0(new Function0(this) { // from class: ajd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsCombinedSearchScreen f5535b;

            {
                this.f5535b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ShopsCombinedSearchScreen shopsCombinedSearchScreen = this.f5535b;
                switch (i3) {
                    case 0:
                        ShopsCombinedSearchScreen.Companion companion = ShopsCombinedSearchScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(shopsCombinedSearchScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new did.j(((did.d) aVar2.b()).f115008y);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                    case 1:
                        ShopsCombinedSearchScreen.Companion companion2 = ShopsCombinedSearchScreen.INSTANCE;
                        return (l) ((did.j) shopsCombinedSearchScreen.f87160b0.getValue()).e.get();
                    default:
                        ShopsCombinedSearchScreen.Companion companion3 = ShopsCombinedSearchScreen.INSTANCE;
                        return (on.a) ((did.j) shopsCombinedSearchScreen.f87160b0.getValue()).f.get();
                }
            }
        });
        this.c0 = w.y0(new Function0(this) { // from class: ajd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsCombinedSearchScreen f5535b;

            {
                this.f5535b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                ShopsCombinedSearchScreen shopsCombinedSearchScreen = this.f5535b;
                switch (i3) {
                    case 0:
                        ShopsCombinedSearchScreen.Companion companion = ShopsCombinedSearchScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(shopsCombinedSearchScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new did.j(((did.d) aVar2.b()).f115008y);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                    case 1:
                        ShopsCombinedSearchScreen.Companion companion2 = ShopsCombinedSearchScreen.INSTANCE;
                        return (l) ((did.j) shopsCombinedSearchScreen.f87160b0.getValue()).e.get();
                    default:
                        ShopsCombinedSearchScreen.Companion companion3 = ShopsCombinedSearchScreen.INSTANCE;
                        return (on.a) ((did.j) shopsCombinedSearchScreen.f87160b0.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.f87161d0 = w.y0(new Function0(this) { // from class: ajd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsCombinedSearchScreen f5535b;

            {
                this.f5535b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                ShopsCombinedSearchScreen shopsCombinedSearchScreen = this.f5535b;
                switch (i32) {
                    case 0:
                        ShopsCombinedSearchScreen.Companion companion = ShopsCombinedSearchScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(shopsCombinedSearchScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new did.j(((did.d) aVar2.b()).f115008y);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                    case 1:
                        ShopsCombinedSearchScreen.Companion companion2 = ShopsCombinedSearchScreen.INSTANCE;
                        return (l) ((did.j) shopsCombinedSearchScreen.f87160b0.getValue()).e.get();
                    default:
                        ShopsCombinedSearchScreen.Companion companion3 = ShopsCombinedSearchScreen.INSTANCE;
                        return (on.a) ((did.j) shopsCombinedSearchScreen.f87160b0.getValue()).f.get();
                }
            }
        });
        this.f87162e0 = v.k((RowDelegate) lazyY0.getValue(), (ListSubheaderDelegate) lazyY02.getValue(), (RewardsGridDelegate) lazyY03.getValue(), (NotificationCentreItemDelegate) lazyY04.getValue(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RewardsGridLoadingDelegate(), new FullScreenStateDelegate());
    }

    public static final void g3(ShopsCombinedSearchScreen shopsCombinedSearchScreen, Activity activity, View view, Function0 function0) {
        Object systemService = activity.getSystemService("input_method");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View rootView = view.getRootView();
        int i = rootView.getResources().getDisplayMetrics().heightPixels;
        Rect rect = new Rect();
        rootView.getWindowVisibleDisplayFrame(rect);
        int i2 = i - rect.bottom;
        int identifier = rootView.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? rootView.getResources().getDimensionPixelSize(identifier) : 0;
        if (i2 <= dimensionPixelSize + 50) {
            function0.invoke();
        } else {
            rootView.getViewTreeObserver().addOnGlobalLayoutListener(new ajd.b(rootView, rect, i, dimensionPixelSize, function0));
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return new AnalyticsProduct.Retail(super.f0());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (j) this.f87160b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        a.g2(this, e.b(h3().f174539b.f59410q), null, new c(this, continuation, 0), 3);
        a.g2(this, e.b(h3().f174539b.f59409p.f57336l), null, new c(this, continuation, 1), 3);
        r rVarDebounce = h3().f174539b.f59409p.f57337m.debounce(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        a.g2(this, e.b(rVarDebounce), null, new d(this, continuation, 0), 3);
        ?? r06 = this.V;
        a.g2(this, e.b(((RowDelegate) r06.getValue()).f53218h), null, new ajd.e(this, view, null), 3);
        a.g2(this, e.b(((RowDelegate) r06.getValue()).k), null, new f(this, null), 3);
        a.g2(this, e.b(((RewardsGridDelegate) this.X.getValue()).f53209c.d), null, new g(this, view, null), 3);
        ScreenContentRecyclerView recyclerView = h3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        a.g2(this, vkm.q.C(e.b(cp5.d.g(x.c(recyclerView, 7))), p0.f264002b), null, new d(this, continuation, 1), 3);
        a.g2(this, e.b(((NotificationCentreItemDelegate) this.Y.getValue()).f52865c), null, new d(this, continuation, 2), 3);
        on.a aVar = (on.a) this.f87161d0.getValue();
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = h3().f174538a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        a.g2(this, ((sn.a) aVar).b(controllerContainerCoordinatorLayout, false), null, new d(this, continuation, 3), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.setHints(u.c(new TextLocalisedClause(R$string.shops_screens_home_search_hint, null, null, 14)));
        navBarWithToolbar.j0(false);
        navBarWithToolbar.E0();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF102011b0() {
        return this.f87162e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.Z;
    }

    public final m h3() {
        ViewBinding value = this.U.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final l T2() {
        return (l) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f87159a0);
    }
}
