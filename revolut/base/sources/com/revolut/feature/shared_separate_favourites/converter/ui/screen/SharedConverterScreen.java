package com.revolut.feature.shared_separate_favourites.converter.ui.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import efm.r;
import fgd.g;
import ihm.f;
import j82.q;
import ja3.b;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jgd.d;
import jgd.i;
import jgd.m;
import jgd.n;
import jgd.o;
import koi.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no0.a;
import rd0.e;
import te0.w;
import vc.s;
import yp0.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/converter/ui/screen/SharedConverterScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ljgd/o;", "Lcom/revolut/feature/shared_separate_favourites/converter/ui/screen/SharedConverterScreenContract$InputData;", "Ljgd/m;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SharedConverterScreen extends BaseRecyclerViewScreen<o, SharedConverterScreenContract$InputData, m> {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f86850h0 = {o0.f186429a.j(new h0(SharedConverterScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final boolean U;
    public final int V;
    public final h W;
    public final a X;
    public final f Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f86851a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f86852b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f86853d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f86854e0;
    public final Object f0;
    public final Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedConverterScreen(SharedConverterScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = true;
        this.V = R$layout.screen_recycler_navbar;
        this.W = s.t(this, d.f);
        c delegatesManager = new c(0);
        boolean z = this.Q;
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        this.X = new a(delegatesManager, false, z, true);
        this.Y = v0.a.d("create(...)");
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: jgd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedConverterScreen f173963b;

            {
                this.f173963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SharedConverterScreen sharedConverterScreen = this.f173963b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SharedConverterScreen.f86850h0;
                        return new RowDelegate(new jch.p(sharedConverterScreen, 13), null, 6);
                    case 1:
                        KProperty[] kPropertyArr2 = SharedConverterScreen.f86850h0;
                        return new SwipeToActionDelegate((RowDelegate) sharedConverterScreen.Z.getValue(), false);
                    case 2:
                        KProperty[] kPropertyArr3 = SharedConverterScreen.f86850h0;
                        return zhm.v.k((RowDelegate) sharedConverterScreen.Z.getValue(), (RowLoadingDelegate) sharedConverterScreen.f86851a0.getValue(), (SwipeToActionDelegate) sharedConverterScreen.f86852b0.getValue(), (FullScreenStateDelegate) sharedConverterScreen.c0.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = SharedConverterScreen.f86850h0;
                        return (n) ((fgd.g) sharedConverterScreen.f86854e0.getValue()).f135053g.get();
                    default:
                        KProperty[] kPropertyArr5 = SharedConverterScreen.f86850h0;
                        return (t60.b) ((fgd.g) sharedConverterScreen.f86854e0.getValue()).d.get();
                }
            }
        });
        this.f86851a0 = w.y0(new b(24));
        final int i2 = 1;
        this.f86852b0 = w.y0(new Function0(this) { // from class: jgd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedConverterScreen f173963b;

            {
                this.f173963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SharedConverterScreen sharedConverterScreen = this.f173963b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SharedConverterScreen.f86850h0;
                        return new RowDelegate(new jch.p(sharedConverterScreen, 13), null, 6);
                    case 1:
                        KProperty[] kPropertyArr2 = SharedConverterScreen.f86850h0;
                        return new SwipeToActionDelegate((RowDelegate) sharedConverterScreen.Z.getValue(), false);
                    case 2:
                        KProperty[] kPropertyArr3 = SharedConverterScreen.f86850h0;
                        return zhm.v.k((RowDelegate) sharedConverterScreen.Z.getValue(), (RowLoadingDelegate) sharedConverterScreen.f86851a0.getValue(), (SwipeToActionDelegate) sharedConverterScreen.f86852b0.getValue(), (FullScreenStateDelegate) sharedConverterScreen.c0.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = SharedConverterScreen.f86850h0;
                        return (n) ((fgd.g) sharedConverterScreen.f86854e0.getValue()).f135053g.get();
                    default:
                        KProperty[] kPropertyArr5 = SharedConverterScreen.f86850h0;
                        return (t60.b) ((fgd.g) sharedConverterScreen.f86854e0.getValue()).d.get();
                }
            }
        });
        this.c0 = w.y0(new b(25));
        final int i3 = 2;
        this.f86853d0 = w.y0(new Function0(this) { // from class: jgd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedConverterScreen f173963b;

            {
                this.f173963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SharedConverterScreen sharedConverterScreen = this.f173963b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SharedConverterScreen.f86850h0;
                        return new RowDelegate(new jch.p(sharedConverterScreen, 13), null, 6);
                    case 1:
                        KProperty[] kPropertyArr2 = SharedConverterScreen.f86850h0;
                        return new SwipeToActionDelegate((RowDelegate) sharedConverterScreen.Z.getValue(), false);
                    case 2:
                        KProperty[] kPropertyArr3 = SharedConverterScreen.f86850h0;
                        return zhm.v.k((RowDelegate) sharedConverterScreen.Z.getValue(), (RowLoadingDelegate) sharedConverterScreen.f86851a0.getValue(), (SwipeToActionDelegate) sharedConverterScreen.f86852b0.getValue(), (FullScreenStateDelegate) sharedConverterScreen.c0.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = SharedConverterScreen.f86850h0;
                        return (n) ((fgd.g) sharedConverterScreen.f86854e0.getValue()).f135053g.get();
                    default:
                        KProperty[] kPropertyArr5 = SharedConverterScreen.f86850h0;
                        return (t60.b) ((fgd.g) sharedConverterScreen.f86854e0.getValue()).d.get();
                }
            }
        });
        this.f86854e0 = w.y0(new j68.a(this, inputData, 21));
        final int i5 = 3;
        this.f0 = w.y0(new Function0(this) { // from class: jgd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedConverterScreen f173963b;

            {
                this.f173963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                SharedConverterScreen sharedConverterScreen = this.f173963b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SharedConverterScreen.f86850h0;
                        return new RowDelegate(new jch.p(sharedConverterScreen, 13), null, 6);
                    case 1:
                        KProperty[] kPropertyArr2 = SharedConverterScreen.f86850h0;
                        return new SwipeToActionDelegate((RowDelegate) sharedConverterScreen.Z.getValue(), false);
                    case 2:
                        KProperty[] kPropertyArr3 = SharedConverterScreen.f86850h0;
                        return zhm.v.k((RowDelegate) sharedConverterScreen.Z.getValue(), (RowLoadingDelegate) sharedConverterScreen.f86851a0.getValue(), (SwipeToActionDelegate) sharedConverterScreen.f86852b0.getValue(), (FullScreenStateDelegate) sharedConverterScreen.c0.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = SharedConverterScreen.f86850h0;
                        return (n) ((fgd.g) sharedConverterScreen.f86854e0.getValue()).f135053g.get();
                    default:
                        KProperty[] kPropertyArr5 = SharedConverterScreen.f86850h0;
                        return (t60.b) ((fgd.g) sharedConverterScreen.f86854e0.getValue()).d.get();
                }
            }
        });
        final int i6 = 4;
        this.g0 = w.y0(new Function0(this) { // from class: jgd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedConverterScreen f173963b;

            {
                this.f173963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                SharedConverterScreen sharedConverterScreen = this.f173963b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SharedConverterScreen.f86850h0;
                        return new RowDelegate(new jch.p(sharedConverterScreen, 13), null, 6);
                    case 1:
                        KProperty[] kPropertyArr2 = SharedConverterScreen.f86850h0;
                        return new SwipeToActionDelegate((RowDelegate) sharedConverterScreen.Z.getValue(), false);
                    case 2:
                        KProperty[] kPropertyArr3 = SharedConverterScreen.f86850h0;
                        return zhm.v.k((RowDelegate) sharedConverterScreen.Z.getValue(), (RowLoadingDelegate) sharedConverterScreen.f86851a0.getValue(), (SwipeToActionDelegate) sharedConverterScreen.f86852b0.getValue(), (FullScreenStateDelegate) sharedConverterScreen.c0.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = SharedConverterScreen.f86850h0;
                        return (n) ((fgd.g) sharedConverterScreen.f86854e0.getValue()).f135053g.get();
                    default:
                        KProperty[] kPropertyArr5 = SharedConverterScreen.f86850h0;
                        return (t60.b) ((fgd.g) sharedConverterScreen.f86854e0.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (g) this.f86854e0.getValue();
    }

    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        r rVarDistinctUntilChanged = this.Y.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarDistinctUntilChanged), null, new jgd.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((SwipeToActionDelegate) this.f86852b0.getValue()).f), null, new jgd.f(this, null), 3);
        ?? r87 = this.Z;
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) r87.getValue()).f53218h), null, new jgd.g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) r87.getValue()).f53222n), null, new jgd.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FullScreenStateDelegate) this.c0.getValue()).f52371h.f121375b), null, new i(this, null), 3);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.f59410q), null, new j2c.b(this, continuation, 23), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.o.f57403b), null, new jgd.e(this, continuation, 1), 3);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r rVarDebounce = r.timer(200L, timeUnit).switchMap(new jeg.h(new jgd.b(this, 1), 6)).debounce(300L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        r rVarDistinctUntilChanged2 = w.a0(rVarDebounce, new jgd.b(this, 0)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarDistinctUntilChanged2), null, new q(this, continuation, 21), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ScreenContentRecyclerView recyclerView = h3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        y.g(recyclerView, m2());
        h3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF79046b0() {
        return (List) this.f86853d0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final koi.h d3() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(o uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        boolean z = uiState.d;
        TextLocalisedClause textLocalisedClause = uiState.f173976a;
        if (z) {
            h3().f174540c.scrollToPosition(0);
        }
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f173977b);
        navBarWithToolbar.setMenuItems(uiState.f173978c);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setDescriptionVisible(false);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.V;
    }

    public final jii.m h3() {
        ViewBinding value = this.W.getValue(this, f86850h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final n T2() {
        return (n) this.f0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
