package com.revolut.feature.rev_points.impl.ui.benefits.unlock;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.api.navigation.RevPointsUnlockBenefitsControllerApi$InputData;
import com.revolut.feature.rev_points.impl.ui.benefits.unlock.RevPointsUnlockBenefitsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import gub.c;
import jii.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import xyb.b;
import xyb.f;
import zhm.v;
import zxb.b0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/benefits/unlock/RevPointsUnlockBenefitsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgub/c;", "Ldli/a;", "Lxyb/f;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsUnlockBenefitsScreen extends ViewController<c> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(RevPointsUnlockBenefitsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final RevPointsUnlockBenefitsControllerApi$InputData K;
    public final boolean L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public RevPointsUnlockBenefitsScreen(RevPointsUnlockBenefitsControllerApi$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = R$layout.screen_recycler_navbar_two_buttons;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: xyb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsUnlockBenefitsScreen f309698b;

            {
                this.f309698b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsUnlockBenefitsScreen revPointsUnlockBenefitsScreen = this.f309698b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsUnlockBenefitsScreen.R;
                        RevPointsUnlockBenefitsScreen revPointsUnlockBenefitsScreen2 = this.f309698b;
                        return dli.f.a(revPointsUnlockBenefitsScreen2, (e) revPointsUnlockBenefitsScreen2.Q.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new SimpleMediaDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsUnlockBenefitsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsUnlockBenefitsScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        revPointsUnlockBenefitsScreen.K.getClass();
                        return new b0(eVar, revPointsUnlockBenefitsScreen);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsUnlockBenefitsScreen.R;
                        return (e) ((b0) revPointsUnlockBenefitsScreen.P.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: xyb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsUnlockBenefitsScreen f309698b;

            {
                this.f309698b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsUnlockBenefitsScreen revPointsUnlockBenefitsScreen = this.f309698b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsUnlockBenefitsScreen.R;
                        RevPointsUnlockBenefitsScreen revPointsUnlockBenefitsScreen2 = this.f309698b;
                        return dli.f.a(revPointsUnlockBenefitsScreen2, (e) revPointsUnlockBenefitsScreen2.Q.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new SimpleMediaDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsUnlockBenefitsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsUnlockBenefitsScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        revPointsUnlockBenefitsScreen.K.getClass();
                        return new b0(eVar, revPointsUnlockBenefitsScreen);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsUnlockBenefitsScreen.R;
                        return (e) ((b0) revPointsUnlockBenefitsScreen.P.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: xyb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsUnlockBenefitsScreen f309698b;

            {
                this.f309698b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsUnlockBenefitsScreen revPointsUnlockBenefitsScreen = this.f309698b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsUnlockBenefitsScreen.R;
                        RevPointsUnlockBenefitsScreen revPointsUnlockBenefitsScreen2 = this.f309698b;
                        return dli.f.a(revPointsUnlockBenefitsScreen2, (e) revPointsUnlockBenefitsScreen2.Q.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new SimpleMediaDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsUnlockBenefitsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsUnlockBenefitsScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        revPointsUnlockBenefitsScreen.K.getClass();
                        return new b0(eVar, revPointsUnlockBenefitsScreen);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsUnlockBenefitsScreen.R;
                        return (e) ((b0) revPointsUnlockBenefitsScreen.P.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        Clause clause = uiState.f309702b;
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setDescriptionText(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (xyb.e) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.rev_points_unlock_benefits_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.rev_points_unlock_benefits_title, null, null, 14), null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        TextNavBarMenuItem textNavBarMenuItem = new TextNavBarMenuItem("NOT_NOW_MENU_ITEM_ID", new TextLocalisedClause(R$string.rev_points_unlock_benefits_not_now, null, null, 14), null, null, 12);
        if (!this.K.f83539a) {
            textNavBarMenuItem = null;
        }
        navBarWithToolbar.setMenuItems(v.l(textNavBarMenuItem));
        LargeActionButton largeActionButton = d3().f174573b;
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setText(new TextLocalisedClause(R$string.rev_points_unlock_benefits_activate_button, null, null, 14));
        LargeActionButton largeActionButton2 = d3().e;
        largeActionButton2.o(LargeActionButton.ButtonStyle.f58726b);
        largeActionButton2.setText(new TextLocalisedClause(R$string.rev_points_unlock_benefits_upgrade_button, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new xyb.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174573b.o), new xyb.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().e.o), new xyb.c(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f174574c.o.f57403b), new xyb.c(this, null, 3), 3);
    }

    public final x d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
