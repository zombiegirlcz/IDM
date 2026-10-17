package com.revolut.feature.shared_separate_favourites.alerts.ui.screen.completed_alerts;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.completed_alerts.SharedCompletedAlertsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ned.j;
import rd0.e;
import te0.w;
import vc.s;
import wrj.m;
import x0f.g;
import xda.z;
import xed.b;
import xed.c;
import xed.d;
import xed.f;
import xed.i;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/alerts/ui/screen/completed_alerts/SharedCompletedAlertsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lxed/i;", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/screen/completed_alerts/SharedCompletedAlertsScreenContract$InputData;", "Lxed/f;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SharedCompletedAlertsScreen extends BaseRecyclerViewScreen<i, SharedCompletedAlertsScreenContract$InputData, f> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f86726e0 = {o0.f186429a.j(new h0(SharedCompletedAlertsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final boolean U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f86727a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f86728b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f86729d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedCompletedAlertsScreen(SharedCompletedAlertsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = true;
        this.V = R$layout.screen_recycler_navbar;
        this.W = s.t(this, b.f);
        this.X = w.y0(new z(7));
        this.Y = w.y0(new z(8));
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: xed.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedCompletedAlertsScreen f304613b;

            {
                this.f304613b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SharedCompletedAlertsScreen sharedCompletedAlertsScreen = this.f304613b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SharedCompletedAlertsScreen.f86726e0;
                        return new SwipeToActionDelegate((RowDelegate) sharedCompletedAlertsScreen.X.getValue(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = SharedCompletedAlertsScreen.f86726e0;
                        return v.k((RowDelegate) sharedCompletedAlertsScreen.X.getValue(), (TextDelegate) sharedCompletedAlertsScreen.Y.getValue(), (RowLoadingDelegate) sharedCompletedAlertsScreen.f86727a0.getValue(), (SwipeToActionDelegate) sharedCompletedAlertsScreen.Z.getValue());
                    default:
                        KProperty[] kPropertyArr3 = SharedCompletedAlertsScreen.f86726e0;
                        return (h) ((ned.j) sharedCompletedAlertsScreen.c0.getValue()).d.get();
                }
            }
        });
        this.f86727a0 = w.y0(new z(9));
        final int i2 = 1;
        this.f86728b0 = w.y0(new Function0(this) { // from class: xed.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedCompletedAlertsScreen f304613b;

            {
                this.f304613b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SharedCompletedAlertsScreen sharedCompletedAlertsScreen = this.f304613b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SharedCompletedAlertsScreen.f86726e0;
                        return new SwipeToActionDelegate((RowDelegate) sharedCompletedAlertsScreen.X.getValue(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = SharedCompletedAlertsScreen.f86726e0;
                        return v.k((RowDelegate) sharedCompletedAlertsScreen.X.getValue(), (TextDelegate) sharedCompletedAlertsScreen.Y.getValue(), (RowLoadingDelegate) sharedCompletedAlertsScreen.f86727a0.getValue(), (SwipeToActionDelegate) sharedCompletedAlertsScreen.Z.getValue());
                    default:
                        KProperty[] kPropertyArr3 = SharedCompletedAlertsScreen.f86726e0;
                        return (h) ((ned.j) sharedCompletedAlertsScreen.c0.getValue()).d.get();
                }
            }
        });
        this.c0 = w.y0(new m(this, inputData, 29));
        final int i3 = 2;
        this.f86729d0 = w.y0(new Function0(this) { // from class: xed.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedCompletedAlertsScreen f304613b;

            {
                this.f304613b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SharedCompletedAlertsScreen sharedCompletedAlertsScreen = this.f304613b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SharedCompletedAlertsScreen.f86726e0;
                        return new SwipeToActionDelegate((RowDelegate) sharedCompletedAlertsScreen.X.getValue(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = SharedCompletedAlertsScreen.f86726e0;
                        return v.k((RowDelegate) sharedCompletedAlertsScreen.X.getValue(), (TextDelegate) sharedCompletedAlertsScreen.Y.getValue(), (RowLoadingDelegate) sharedCompletedAlertsScreen.f86727a0.getValue(), (SwipeToActionDelegate) sharedCompletedAlertsScreen.Z.getValue());
                    default:
                        KProperty[] kPropertyArr3 = SharedCompletedAlertsScreen.f86726e0;
                        return (h) ((ned.j) sharedCompletedAlertsScreen.c0.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (j) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (xed.h) this.f86729d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, e.b(((RowDelegate) this.X.getValue()).f53218h), null, new c(this, null), 3);
        a.g2(this, e.b(((SwipeToActionDelegate) this.Z.getValue()).f), null, new d(this, null), 3);
        a.g2(this, e.b(h3().f174539b.f59410q), null, new g(this, null, 13), 3);
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
    public final List getL0() {
        return (List) this.f86728b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f304620a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionText(uiState.f304621b);
        navBarWithToolbar.setDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.V;
    }

    public final jii.m h3() {
        ViewBinding value = this.W.getValue(this, f86726e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
