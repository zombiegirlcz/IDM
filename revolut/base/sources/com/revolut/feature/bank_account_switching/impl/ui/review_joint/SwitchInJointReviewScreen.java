package com.revolut.feature.bank_account_switching.impl.ui.review_joint;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.review_joint.SwitchInJointReviewScreen;
import com.revolut.feature.bank_account_switching.impl.ui.review_joint.SwitchInJointReviewScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import ep2.c;
import ep2.d;
import ep2.g;
import h30.l;
import jii.x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import vn2.a0;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/review_joint/SwitchInJointReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lep2/h;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwitchInJointReviewScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(SwitchInJointReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final SwitchInJointReviewScreenContract$InputData K;
    public final int L;
    public final FullScreenStateDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public SwitchInJointReviewScreen(SwitchInJointReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_two_buttons;
        this.M = new FullScreenStateDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ep2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwitchInJointReviewScreen f128066b;

            {
                this.f128066b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SwitchInJointReviewScreen switchInJointReviewScreen = this.f128066b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SwitchInJointReviewScreen.R;
                        SwitchInJointReviewScreen switchInJointReviewScreen2 = this.f128066b;
                        return dli.f.a(switchInJointReviewScreen2, (g) switchInJointReviewScreen2.Q.getValue(), v.k(new ScrollerDelegate(v.k(new SmallStockCardDelegate(), new ActionCardLoadingDelegate()), false), new ListSubheaderDelegate(), new RowLoadingDelegate(), new RowDelegate(null, null, 7), switchInJointReviewScreen2.M), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SwitchInJointReviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(switchInJointReviewScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        SwitchInJointReviewScreenContract$InputData switchInJointReviewScreenContract$InputData = switchInJointReviewScreen.K;
                        switchInJointReviewScreenContract$InputData.getClass();
                        return new a0(hVar, switchInJointReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SwitchInJointReviewScreen.R;
                        return (g) ((a0) switchInJointReviewScreen.P.getValue()).d.get();
                }
            }
        });
        this.O = s.t(this, c.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ep2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwitchInJointReviewScreen f128066b;

            {
                this.f128066b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SwitchInJointReviewScreen switchInJointReviewScreen = this.f128066b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SwitchInJointReviewScreen.R;
                        SwitchInJointReviewScreen switchInJointReviewScreen2 = this.f128066b;
                        return dli.f.a(switchInJointReviewScreen2, (g) switchInJointReviewScreen2.Q.getValue(), v.k(new ScrollerDelegate(v.k(new SmallStockCardDelegate(), new ActionCardLoadingDelegate()), false), new ListSubheaderDelegate(), new RowLoadingDelegate(), new RowDelegate(null, null, 7), switchInJointReviewScreen2.M), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SwitchInJointReviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(switchInJointReviewScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        SwitchInJointReviewScreenContract$InputData switchInJointReviewScreenContract$InputData = switchInJointReviewScreen.K;
                        switchInJointReviewScreenContract$InputData.getClass();
                        return new a0(hVar, switchInJointReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SwitchInJointReviewScreen.R;
                        return (g) ((a0) switchInJointReviewScreen.P.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ep2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwitchInJointReviewScreen f128066b;

            {
                this.f128066b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SwitchInJointReviewScreen switchInJointReviewScreen = this.f128066b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SwitchInJointReviewScreen.R;
                        SwitchInJointReviewScreen switchInJointReviewScreen2 = this.f128066b;
                        return dli.f.a(switchInJointReviewScreen2, (g) switchInJointReviewScreen2.Q.getValue(), v.k(new ScrollerDelegate(v.k(new SmallStockCardDelegate(), new ActionCardLoadingDelegate()), false), new ListSubheaderDelegate(), new RowLoadingDelegate(), new RowDelegate(null, null, 7), switchInJointReviewScreen2.M), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SwitchInJointReviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(switchInJointReviewScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        SwitchInJointReviewScreenContract$InputData switchInJointReviewScreenContract$InputData = switchInJointReviewScreen.K;
                        switchInJointReviewScreenContract$InputData.getClass();
                        return new a0(hVar, switchInJointReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SwitchInJointReviewScreen.R;
                        return (g) ((a0) switchInJointReviewScreen.P.getValue()).d.get();
                }
            }
        });
    }

    public static TextLocalisedClause e3() {
        return new TextLocalisedClause(R$string.account_switch_request_review_title, u.c(new TextLocalisedClause(R.string.common_merchant_Revolut, null, null, 14)), null, 12);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        ep2.h uiState = (ep2.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = d3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        boolean z = uiState.f128070b;
        screenRecyclerNavbarTwoButtonsFirstButton.setVisibility(z ? 0 : 8);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setToolbarTitle(e3());
        navBarWithToolbar.setTitle(e3(), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton largeActionButton = d3().f174573b;
        l.A(R.string.common_action_continue, null, null, 14, largeActionButton);
        largeActionButton.setLoadingButtonTag("ACCEPT_BUTTON_LOADING_TAG");
        LargeActionButton largeActionButton2 = d3().e;
        largeActionButton2.setText(new TextLocalisedClause(R$string.account_switch_request_review_in_joint_decline, null, null, 14));
        largeActionButton2.setLoadingButtonTag("REJECT_BUTTON_LOADING_TAG");
        largeActionButton2.o(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52371h.f121375b), null, new ep2.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174573b.o), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new d(this, continuation, 2), 3);
    }

    public final x d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
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
        return (dli.c) this.N.getValue();
    }
}
