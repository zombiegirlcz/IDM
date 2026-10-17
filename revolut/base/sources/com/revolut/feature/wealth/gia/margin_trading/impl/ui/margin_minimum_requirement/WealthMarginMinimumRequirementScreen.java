package com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.gia.margin_trading.impl.R$string;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.WealthMarginMinimumRequirementContract$InputData;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.WealthMarginMinimumRequirementScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import q2e.i0;
import q43.m;
import q6h.b;
import q6h.e;
import q6h.f;
import te0.w;
import tki.c;
import vc.s;
import yp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/gia/margin_trading/impl/ui/margin_minimum_requirement/WealthMarginMinimumRequirementScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lq6h/c;", "Companion", "a", "feature_wealth_gia_margin_trading_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthMarginMinimumRequirementScreen extends ViewController<q> implements c {
    public final WealthMarginMinimumRequirementContract$InputData K;
    public final FullScreenStateDelegate L;
    public final h M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(WealthMarginMinimumRequirementScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.WealthMarginMinimumRequirementScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public WealthMarginMinimumRequirementScreen(WealthMarginMinimumRequirementContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new FullScreenStateDelegate();
        this.M = s.t(this, e.f);
        this.N = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: q6h.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthMarginMinimumRequirementScreen f242599b;

            {
                this.f242599b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WealthMarginMinimumRequirementScreen wealthMarginMinimumRequirementScreen = this.f242599b;
                switch (i2) {
                    case 0:
                        WealthMarginMinimumRequirementScreen.Companion companion = WealthMarginMinimumRequirementScreen.INSTANCE;
                        WealthMarginMinimumRequirementScreen wealthMarginMinimumRequirementScreen2 = this.f242599b;
                        return tki.g.a(wealthMarginMinimumRequirementScreen2, wealthMarginMinimumRequirementScreen2.d(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), wealthMarginMinimumRequirementScreen2.L), 0, null, null, null, 60);
                    case 1:
                        WealthMarginMinimumRequirementScreen.Companion companion2 = WealthMarginMinimumRequirementScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(wealthMarginMinimumRequirementScreen.m2()).a().get(f6h.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f6h.c.class, " is not found"));
                        }
                        f6h.c cVar = ((f6h.c) aVar2.b()).f132434j;
                        WealthMarginMinimumRequirementContract$InputData wealthMarginMinimumRequirementContract$InputData = wealthMarginMinimumRequirementScreen.K;
                        wealthMarginMinimumRequirementContract$InputData.getClass();
                        return new f6h.e(cVar, wealthMarginMinimumRequirementContract$InputData);
                    default:
                        WealthMarginMinimumRequirementScreen.Companion companion3 = WealthMarginMinimumRequirementScreen.INSTANCE;
                        return (b) ((f6h.e) wealthMarginMinimumRequirementScreen.P.getValue()).f132442c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: q6h.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthMarginMinimumRequirementScreen f242599b;

            {
                this.f242599b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WealthMarginMinimumRequirementScreen wealthMarginMinimumRequirementScreen = this.f242599b;
                switch (i22) {
                    case 0:
                        WealthMarginMinimumRequirementScreen.Companion companion = WealthMarginMinimumRequirementScreen.INSTANCE;
                        WealthMarginMinimumRequirementScreen wealthMarginMinimumRequirementScreen2 = this.f242599b;
                        return tki.g.a(wealthMarginMinimumRequirementScreen2, wealthMarginMinimumRequirementScreen2.d(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), wealthMarginMinimumRequirementScreen2.L), 0, null, null, null, 60);
                    case 1:
                        WealthMarginMinimumRequirementScreen.Companion companion2 = WealthMarginMinimumRequirementScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(wealthMarginMinimumRequirementScreen.m2()).a().get(f6h.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f6h.c.class, " is not found"));
                        }
                        f6h.c cVar = ((f6h.c) aVar2.b()).f132434j;
                        WealthMarginMinimumRequirementContract$InputData wealthMarginMinimumRequirementContract$InputData = wealthMarginMinimumRequirementScreen.K;
                        wealthMarginMinimumRequirementContract$InputData.getClass();
                        return new f6h.e(cVar, wealthMarginMinimumRequirementContract$InputData);
                    default:
                        WealthMarginMinimumRequirementScreen.Companion companion3 = WealthMarginMinimumRequirementScreen.INSTANCE;
                        return (b) ((f6h.e) wealthMarginMinimumRequirementScreen.P.getValue()).f132442c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: q6h.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthMarginMinimumRequirementScreen f242599b;

            {
                this.f242599b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WealthMarginMinimumRequirementScreen wealthMarginMinimumRequirementScreen = this.f242599b;
                switch (i22) {
                    case 0:
                        WealthMarginMinimumRequirementScreen.Companion companion = WealthMarginMinimumRequirementScreen.INSTANCE;
                        WealthMarginMinimumRequirementScreen wealthMarginMinimumRequirementScreen2 = this.f242599b;
                        return tki.g.a(wealthMarginMinimumRequirementScreen2, wealthMarginMinimumRequirementScreen2.d(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), wealthMarginMinimumRequirementScreen2.L), 0, null, null, null, 60);
                    case 1:
                        WealthMarginMinimumRequirementScreen.Companion companion2 = WealthMarginMinimumRequirementScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(wealthMarginMinimumRequirementScreen.m2()).a().get(f6h.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f6h.c.class, " is not found"));
                        }
                        f6h.c cVar = ((f6h.c) aVar2.b()).f132434j;
                        WealthMarginMinimumRequirementContract$InputData wealthMarginMinimumRequirementContract$InputData = wealthMarginMinimumRequirementScreen.K;
                        wealthMarginMinimumRequirementContract$InputData.getClass();
                        return new f6h.e(cVar, wealthMarginMinimumRequirementContract$InputData);
                    default:
                        WealthMarginMinimumRequirementScreen.Companion companion3 = WealthMarginMinimumRequirementScreen.INSTANCE;
                        return (b) ((f6h.e) wealthMarginMinimumRequirementScreen.P.getValue()).f132442c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((q6h.c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f6h.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_trading_margin_required_minimum_header_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.wealth_trading_margin_required_minimum_header_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.wealth_trading_margin_required_minimum_header_description, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setMenuItems(u.c(new IconNavBarMenuItem("INFO_MENU_ITEM_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.wealth_trading_margin_required_minimum_header_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)));
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        y.a(recyclerView, 3, true, new q56.o(this, 7));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new m(this, continuation, 5), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new i0(this, continuation, 15), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b d() {
        return (b) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.O.getValue();
    }
}
