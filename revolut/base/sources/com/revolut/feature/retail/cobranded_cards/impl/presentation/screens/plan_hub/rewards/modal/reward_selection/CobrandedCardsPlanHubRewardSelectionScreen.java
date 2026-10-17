package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b6b.o;
import b6b.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_selection.CobrandedCardsPlanHubRewardSelectionScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_selection.CobrandedCardsPlanHubRewardSelectionScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lw0.m;
import njj.n;
import nuh.j;
import o7b.b;
import o7b.d;
import o7b.f;
import o7b.g;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/rewards/modal/reward_selection/CobrandedCardsPlanHubRewardSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lo7b/f;", "Ldli/a;", "Lo7b/g;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsPlanHubRewardSelectionScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CobrandedCardsPlanHubRewardSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final CobrandedCardsPlanHubRewardSelectionScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public CobrandedCardsPlanHubRewardSelectionScreen(CobrandedCardsPlanHubRewardSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        this.M = s.t(this, b.f);
        this.N = w.y0(new o23.b(20));
        this.O = w.y0(new o23.b(21));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: o7b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubRewardSelectionScreen f222736b;

            {
                this.f222736b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CobrandedCardsPlanHubRewardSelectionScreen cobrandedCardsPlanHubRewardSelectionScreen = this.f222736b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubRewardSelectionScreen.S;
                        CobrandedCardsPlanHubRewardSelectionScreen cobrandedCardsPlanHubRewardSelectionScreen2 = this.f222736b;
                        return dli.f.a(cobrandedCardsPlanHubRewardSelectionScreen2, (h) cobrandedCardsPlanHubRewardSelectionScreen2.R.getValue(), v.k((SingleChoiceDelegate) cobrandedCardsPlanHubRewardSelectionScreen2.N.getValue(), new SingleChoiceLoadingDelegate(), (FullScreenStateDelegate) cobrandedCardsPlanHubRewardSelectionScreen2.O.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubRewardSelectionScreen.S;
                        qji.b bVarU2 = cobrandedCardsPlanHubRewardSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_selection.di.CobrandedCardsPlanHubRewardSelectionScreenInjector");
                        q qVar = (q) bVarU2;
                        o oVar = qVar.f12665b;
                        q qVar2 = qVar.f12666c;
                        CobrandedCardsPlanHubRewardSelectionScreenContract$InputData cobrandedCardsPlanHubRewardSelectionScreenContract$InputData = cobrandedCardsPlanHubRewardSelectionScreen.K;
                        cobrandedCardsPlanHubRewardSelectionScreenContract$InputData.getClass();
                        return new b6b.s(oVar, qVar2, cobrandedCardsPlanHubRewardSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubRewardSelectionScreen.S;
                        return (h) ((b6b.s) cobrandedCardsPlanHubRewardSelectionScreen.Q.getValue()).f12672c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: o7b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubRewardSelectionScreen f222736b;

            {
                this.f222736b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CobrandedCardsPlanHubRewardSelectionScreen cobrandedCardsPlanHubRewardSelectionScreen = this.f222736b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubRewardSelectionScreen.S;
                        CobrandedCardsPlanHubRewardSelectionScreen cobrandedCardsPlanHubRewardSelectionScreen2 = this.f222736b;
                        return dli.f.a(cobrandedCardsPlanHubRewardSelectionScreen2, (h) cobrandedCardsPlanHubRewardSelectionScreen2.R.getValue(), v.k((SingleChoiceDelegate) cobrandedCardsPlanHubRewardSelectionScreen2.N.getValue(), new SingleChoiceLoadingDelegate(), (FullScreenStateDelegate) cobrandedCardsPlanHubRewardSelectionScreen2.O.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubRewardSelectionScreen.S;
                        qji.b bVarU2 = cobrandedCardsPlanHubRewardSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_selection.di.CobrandedCardsPlanHubRewardSelectionScreenInjector");
                        q qVar = (q) bVarU2;
                        o oVar = qVar.f12665b;
                        q qVar2 = qVar.f12666c;
                        CobrandedCardsPlanHubRewardSelectionScreenContract$InputData cobrandedCardsPlanHubRewardSelectionScreenContract$InputData = cobrandedCardsPlanHubRewardSelectionScreen.K;
                        cobrandedCardsPlanHubRewardSelectionScreenContract$InputData.getClass();
                        return new b6b.s(oVar, qVar2, cobrandedCardsPlanHubRewardSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubRewardSelectionScreen.S;
                        return (h) ((b6b.s) cobrandedCardsPlanHubRewardSelectionScreen.Q.getValue()).f12672c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: o7b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubRewardSelectionScreen f222736b;

            {
                this.f222736b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CobrandedCardsPlanHubRewardSelectionScreen cobrandedCardsPlanHubRewardSelectionScreen = this.f222736b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubRewardSelectionScreen.S;
                        CobrandedCardsPlanHubRewardSelectionScreen cobrandedCardsPlanHubRewardSelectionScreen2 = this.f222736b;
                        return dli.f.a(cobrandedCardsPlanHubRewardSelectionScreen2, (h) cobrandedCardsPlanHubRewardSelectionScreen2.R.getValue(), v.k((SingleChoiceDelegate) cobrandedCardsPlanHubRewardSelectionScreen2.N.getValue(), new SingleChoiceLoadingDelegate(), (FullScreenStateDelegate) cobrandedCardsPlanHubRewardSelectionScreen2.O.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubRewardSelectionScreen.S;
                        qji.b bVarU2 = cobrandedCardsPlanHubRewardSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_selection.di.CobrandedCardsPlanHubRewardSelectionScreenInjector");
                        q qVar = (q) bVarU2;
                        o oVar = qVar.f12665b;
                        q qVar2 = qVar.f12666c;
                        CobrandedCardsPlanHubRewardSelectionScreenContract$InputData cobrandedCardsPlanHubRewardSelectionScreenContract$InputData = cobrandedCardsPlanHubRewardSelectionScreen.K;
                        cobrandedCardsPlanHubRewardSelectionScreenContract$InputData.getClass();
                        return new b6b.s(oVar, qVar2, cobrandedCardsPlanHubRewardSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubRewardSelectionScreen.S;
                        return (h) ((b6b.s) cobrandedCardsPlanHubRewardSelectionScreen.Q.getValue()).f12672c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        m mVar = uiState.f222742b;
        Clause clause = uiState.f222743c;
        if (mVar != null) {
            d3().f174546c.setHeaderModel(mVar);
        }
        if (clause != null) {
            d3().f174545b.setText(clause);
        }
        LargeActionButton navBarBottomSheetButton = d3().f174545b;
        Intrinsics.checkNotNullExpressionValue(navBarBottomSheetButton, "navBarBottomSheetButton");
        navBarBottomSheetButton.setVisibility(clause != null ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b6b.s) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (o7b.h) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174545b.setLoadingButtonTag("REWARD_SELECTION_CONFIRM_BUTTON");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new j(this, continuation, 20), 3);
        int i = 28;
        ViewController.P2(this, new n(rd0.e.b(((SingleChoiceDelegate) this.N.getValue()).p()), i), new nwc.f(this, continuation, i), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
