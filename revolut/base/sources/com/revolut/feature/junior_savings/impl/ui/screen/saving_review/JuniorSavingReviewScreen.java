package com.revolut.feature.junior_savings.impl.ui.screen.saving_review;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_savings.impl.R$string;
import com.revolut.feature.junior_savings.impl.ui.screen.saving_review.JuniorSavingReviewScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dn8.b;
import dn8.c;
import dn8.d;
import dn8.i;
import dn8.j;
import jii.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/junior_savings/impl/ui/screen/saving_review/JuniorSavingReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ldn8/d;", "Companion", "a", "feature_junior_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorSavingReviewScreen extends ViewController<q> implements a {
    public final b K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final FullScreenStateDelegate Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(JuniorSavingReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.junior_savings.impl.ui.screen.saving_review.JuniorSavingReviewScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public JuniorSavingReviewScreen(b input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = R$layout.screen_recycler_navbar_two_buttons;
        this.M = true;
        this.N = s.t(this, dn8.h.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: dn8.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSavingReviewScreen f116245b;

            {
                this.f116245b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorSavingReviewScreen juniorSavingReviewScreen = this.f116245b;
                switch (i2) {
                    case 0:
                        JuniorSavingReviewScreen.Companion companion = JuniorSavingReviewScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(juniorSavingReviewScreen.m2()).a().get(zm8.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zm8.b.class, " is not found"));
                        }
                        zm8.b bVar = ((zm8.b) aVar2.b()).f323394j;
                        b bVar2 = juniorSavingReviewScreen.K;
                        bVar2.getClass();
                        return new zm8.a(bVar, bVar2);
                    case 1:
                        JuniorSavingReviewScreen.Companion companion2 = JuniorSavingReviewScreen.INSTANCE;
                        return (c) ((zm8.a) juniorSavingReviewScreen.O.getValue()).f323388b.get();
                    default:
                        JuniorSavingReviewScreen.Companion companion3 = JuniorSavingReviewScreen.INSTANCE;
                        JuniorSavingReviewScreen juniorSavingReviewScreen2 = this.f116245b;
                        return dli.f.a(juniorSavingReviewScreen2, (c) juniorSavingReviewScreen2.P.getValue(), v.k(juniorSavingReviewScreen2.Q, new RowDelegate(null, null, 7), new RowLoadingDelegate(), new FullScreenStateLoadingDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: dn8.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSavingReviewScreen f116245b;

            {
                this.f116245b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorSavingReviewScreen juniorSavingReviewScreen = this.f116245b;
                switch (i22) {
                    case 0:
                        JuniorSavingReviewScreen.Companion companion = JuniorSavingReviewScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(juniorSavingReviewScreen.m2()).a().get(zm8.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zm8.b.class, " is not found"));
                        }
                        zm8.b bVar = ((zm8.b) aVar2.b()).f323394j;
                        b bVar2 = juniorSavingReviewScreen.K;
                        bVar2.getClass();
                        return new zm8.a(bVar, bVar2);
                    case 1:
                        JuniorSavingReviewScreen.Companion companion2 = JuniorSavingReviewScreen.INSTANCE;
                        return (c) ((zm8.a) juniorSavingReviewScreen.O.getValue()).f323388b.get();
                    default:
                        JuniorSavingReviewScreen.Companion companion3 = JuniorSavingReviewScreen.INSTANCE;
                        JuniorSavingReviewScreen juniorSavingReviewScreen2 = this.f116245b;
                        return dli.f.a(juniorSavingReviewScreen2, (c) juniorSavingReviewScreen2.P.getValue(), v.k(juniorSavingReviewScreen2.Q, new RowDelegate(null, null, 7), new RowLoadingDelegate(), new FullScreenStateLoadingDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = new FullScreenStateDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: dn8.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSavingReviewScreen f116245b;

            {
                this.f116245b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorSavingReviewScreen juniorSavingReviewScreen = this.f116245b;
                switch (i22) {
                    case 0:
                        JuniorSavingReviewScreen.Companion companion = JuniorSavingReviewScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(juniorSavingReviewScreen.m2()).a().get(zm8.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zm8.b.class, " is not found"));
                        }
                        zm8.b bVar = ((zm8.b) aVar2.b()).f323394j;
                        b bVar2 = juniorSavingReviewScreen.K;
                        bVar2.getClass();
                        return new zm8.a(bVar, bVar2);
                    case 1:
                        JuniorSavingReviewScreen.Companion companion2 = JuniorSavingReviewScreen.INSTANCE;
                        return (c) ((zm8.a) juniorSavingReviewScreen.O.getValue()).f323388b.get();
                    default:
                        JuniorSavingReviewScreen.Companion companion3 = JuniorSavingReviewScreen.INSTANCE;
                        JuniorSavingReviewScreen juniorSavingReviewScreen2 = this.f116245b;
                        return dli.f.a(juniorSavingReviewScreen2, (c) juniorSavingReviewScreen2.P.getValue(), v.k(juniorSavingReviewScreen2.Q, new RowDelegate(null, null, 7), new RowLoadingDelegate(), new FullScreenStateLoadingDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = d3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        boolean z = uiState.f116238b;
        screenRecyclerNavbarTwoButtonsFirstButton.setVisibility(z ? 0 : 8);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (zm8.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b k3() {
        return (c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.junior_saving_request_review_overview_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.junior_saving_request_review_overview_title, null, null, 14));
        LargeActionButton largeActionButton = d3().f174573b;
        largeActionButton.setText(new TextLocalisedClause(R$string.junior_saving_request_review_overview_action_continue, null, null, 14));
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        LargeActionButton largeActionButton2 = d3().e;
        largeActionButton2.setText(new TextLocalisedClause(R$string.junior_saving_request_review_overview_action_decline, null, null, 14));
        largeActionButton2.o(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174574c.f59410q), new i(this, null, 0), 3);
        d3().e.setLoadingButtonTag("SECOND_BUTTON_LOADING_TAG");
        ViewController.P2(this, rd0.e.b(d3().e.o), new i(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174573b.o), new i(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new j(this, null), 3);
    }

    public final x d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
