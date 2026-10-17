package com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alert_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alert_details.SharedAlertDetailsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import uwe.f;
import vc.s;
import vd1.a;
import ved.b;
import ved.c;
import ved.d;
import ved.h;
import ved.i;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/alerts/ui/screen/alert_details/SharedAlertDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lved/i;", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/screen/alert_details/SharedAlertDetailsScreenContract$InputData;", "Lved/h;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SharedAlertDetailsScreen extends BaseRecyclerViewScreen<i, SharedAlertDetailsScreenContract$InputData, h> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(SharedAlertDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final ao.h V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f86710a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f86711b0;
    public final boolean c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f86712d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f86713e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedAlertDetailsScreen(SharedAlertDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = s.t(this, b.f);
        this.W = w.y0(new ve7.i(2));
        this.X = w.y0(new ve7.i(3));
        this.Y = w.y0(new ve7.i(4));
        this.Z = w.y0(new ve7.i(5));
        this.f86710a0 = w.y0(new ve7.i(6));
        final int i = 0;
        this.f86711b0 = w.y0(new Function0(this) { // from class: ved.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedAlertDetailsScreen f288265b;

            {
                this.f288265b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SharedAlertDetailsScreen sharedAlertDetailsScreen = this.f288265b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SharedAlertDetailsScreen.f0;
                        return v.k((ActionsDelegate) sharedAlertDetailsScreen.W.getValue(), (TrendViewDelegate) sharedAlertDetailsScreen.X.getValue(), (FixedTabsDelegate) sharedAlertDetailsScreen.Y.getValue(), (FullScreenStateDelegate) sharedAlertDetailsScreen.Z.getValue(), new HeaderDelegate(), new HeaderLoadingDelegate(), (TextDelegate) sharedAlertDetailsScreen.f86710a0.getValue(), new PlainTextDelegate());
                    default:
                        KProperty[] kPropertyArr2 = SharedAlertDetailsScreen.f0;
                        return (o) ((ned.a) sharedAlertDetailsScreen.f86712d0.getValue()).d.get();
                }
            }
        });
        this.c0 = true;
        this.f86712d0 = w.y0(new a(this, inputData, 3));
        final int i2 = 1;
        this.f86713e0 = w.y0(new Function0(this) { // from class: ved.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedAlertDetailsScreen f288265b;

            {
                this.f288265b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SharedAlertDetailsScreen sharedAlertDetailsScreen = this.f288265b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SharedAlertDetailsScreen.f0;
                        return v.k((ActionsDelegate) sharedAlertDetailsScreen.W.getValue(), (TrendViewDelegate) sharedAlertDetailsScreen.X.getValue(), (FixedTabsDelegate) sharedAlertDetailsScreen.Y.getValue(), (FullScreenStateDelegate) sharedAlertDetailsScreen.Z.getValue(), new HeaderDelegate(), new HeaderLoadingDelegate(), (TextDelegate) sharedAlertDetailsScreen.f86710a0.getValue(), new PlainTextDelegate());
                    default:
                        KProperty[] kPropertyArr2 = SharedAlertDetailsScreen.f0;
                        return (o) ((ned.a) sharedAlertDetailsScreen.f86712d0.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (ned.a) this.f86712d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new f(this, continuation, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((ActionsDelegate) this.W.getValue()).f51611c.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((TrendViewDelegate) this.X.getValue()).r()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FixedTabsDelegate) this.Y.getValue()).f52339c.f121375b), null, new ved.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FullScreenStateDelegate) this.Z.getValue()).f52371h.f121375b), null, new ved.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((TextDelegate) this.f86710a0.getValue()).d), null, new ved.e(this, continuation, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF72103d0() {
        return (List) this.f86711b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3 */
    public final int getV() {
        return R$id.recyclerView;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f288271a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(uiState.f288272b);
        Clause clause = uiState.f288273c;
        if (clause != null) {
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setSecondDescriptionText(clause);
        }
        navBarWithToolbar.setEndIconImage(uiState.d);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    public final m h3() {
        ViewBinding value = this.V.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final ved.o T2() {
        return (ved.o) this.f86713e0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.c0);
    }
}
