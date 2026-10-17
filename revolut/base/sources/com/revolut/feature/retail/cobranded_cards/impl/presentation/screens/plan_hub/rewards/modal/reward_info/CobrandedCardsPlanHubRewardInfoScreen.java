package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import b6b.o;
import b6b.r;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.CobrandedCardsPlanHubRewardInfoScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.CobrandedCardsPlanHubRewardInfoScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m7b.d;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/rewards/modal/reward_info/CobrandedCardsPlanHubRewardInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lm7b/d;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsPlanHubRewardInfoScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CobrandedCardsPlanHubRewardInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final CobrandedCardsPlanHubRewardInfoScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public CobrandedCardsPlanHubRewardInfoScreen(CobrandedCardsPlanHubRewardInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        this.M = s.t(this, m7b.b.f);
        this.N = w.y0(new m3g.c(10));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: m7b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubRewardInfoScreen f203366b;

            {
                this.f203366b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CobrandedCardsPlanHubRewardInfoScreen cobrandedCardsPlanHubRewardInfoScreen = this.f203366b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubRewardInfoScreen.R;
                        CobrandedCardsPlanHubRewardInfoScreen cobrandedCardsPlanHubRewardInfoScreen2 = this.f203366b;
                        return dli.f.a(cobrandedCardsPlanHubRewardInfoScreen2, (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.b) cobrandedCardsPlanHubRewardInfoScreen2.Q.getValue(), v.k((RowDelegate) cobrandedCardsPlanHubRewardInfoScreen2.N.getValue(), new CellDetailsStandaloneNoteDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubRewardInfoScreen.R;
                        qji.b bVarU2 = cobrandedCardsPlanHubRewardInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.di.CobrandedCardsPlanHubRewardInfoScreenInjector");
                        b6b.q qVar = (b6b.q) bVarU2;
                        o oVar = qVar.f12665b;
                        b6b.q qVar2 = qVar.f12666c;
                        CobrandedCardsPlanHubRewardInfoScreenContract$InputData cobrandedCardsPlanHubRewardInfoScreenContract$InputData = cobrandedCardsPlanHubRewardInfoScreen.K;
                        cobrandedCardsPlanHubRewardInfoScreenContract$InputData.getClass();
                        return new r(oVar, qVar2, cobrandedCardsPlanHubRewardInfoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubRewardInfoScreen.R;
                        return (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.b) ((r) cobrandedCardsPlanHubRewardInfoScreen.P.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: m7b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubRewardInfoScreen f203366b;

            {
                this.f203366b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CobrandedCardsPlanHubRewardInfoScreen cobrandedCardsPlanHubRewardInfoScreen = this.f203366b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubRewardInfoScreen.R;
                        CobrandedCardsPlanHubRewardInfoScreen cobrandedCardsPlanHubRewardInfoScreen2 = this.f203366b;
                        return dli.f.a(cobrandedCardsPlanHubRewardInfoScreen2, (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.b) cobrandedCardsPlanHubRewardInfoScreen2.Q.getValue(), v.k((RowDelegate) cobrandedCardsPlanHubRewardInfoScreen2.N.getValue(), new CellDetailsStandaloneNoteDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubRewardInfoScreen.R;
                        qji.b bVarU2 = cobrandedCardsPlanHubRewardInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.di.CobrandedCardsPlanHubRewardInfoScreenInjector");
                        b6b.q qVar = (b6b.q) bVarU2;
                        o oVar = qVar.f12665b;
                        b6b.q qVar2 = qVar.f12666c;
                        CobrandedCardsPlanHubRewardInfoScreenContract$InputData cobrandedCardsPlanHubRewardInfoScreenContract$InputData = cobrandedCardsPlanHubRewardInfoScreen.K;
                        cobrandedCardsPlanHubRewardInfoScreenContract$InputData.getClass();
                        return new r(oVar, qVar2, cobrandedCardsPlanHubRewardInfoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubRewardInfoScreen.R;
                        return (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.b) ((r) cobrandedCardsPlanHubRewardInfoScreen.P.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: m7b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubRewardInfoScreen f203366b;

            {
                this.f203366b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CobrandedCardsPlanHubRewardInfoScreen cobrandedCardsPlanHubRewardInfoScreen = this.f203366b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubRewardInfoScreen.R;
                        CobrandedCardsPlanHubRewardInfoScreen cobrandedCardsPlanHubRewardInfoScreen2 = this.f203366b;
                        return dli.f.a(cobrandedCardsPlanHubRewardInfoScreen2, (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.b) cobrandedCardsPlanHubRewardInfoScreen2.Q.getValue(), v.k((RowDelegate) cobrandedCardsPlanHubRewardInfoScreen2.N.getValue(), new CellDetailsStandaloneNoteDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubRewardInfoScreen.R;
                        qji.b bVarU2 = cobrandedCardsPlanHubRewardInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.di.CobrandedCardsPlanHubRewardInfoScreenInjector");
                        b6b.q qVar = (b6b.q) bVarU2;
                        o oVar = qVar.f12665b;
                        b6b.q qVar2 = qVar.f12666c;
                        CobrandedCardsPlanHubRewardInfoScreenContract$InputData cobrandedCardsPlanHubRewardInfoScreenContract$InputData = cobrandedCardsPlanHubRewardInfoScreen.K;
                        cobrandedCardsPlanHubRewardInfoScreenContract$InputData.getClass();
                        return new r(oVar, qVar2, cobrandedCardsPlanHubRewardInfoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubRewardInfoScreen.R;
                        return (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.b) ((r) cobrandedCardsPlanHubRewardInfoScreen.P.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174546c.setHeaderModel(uiState.f203369b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        CobrandedCardsPlanHubRewardInfoScreenContract$InputData cobrandedCardsPlanHubRewardInfoScreenContract$InputData = this.K;
        String str = cobrandedCardsPlanHubRewardInfoScreenContract$InputData.f82600a.e;
        if (str != null) {
            d3().f174545b.setText(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        LargeActionButton navBarBottomSheetButton = d3().f174545b;
        Intrinsics.checkNotNullExpressionValue(navBarBottomSheetButton, "navBarBottomSheetButton");
        navBarBottomSheetButton.setVisibility(cobrandedCardsPlanHubRewardInfoScreenContract$InputData.f82600a.e == null ? 8 : 0);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new lpl.c(this, null, 26), 3);
        ViewController.P2(this, new lt.d(rd0.e.b(((RowDelegate) this.N.getValue()).f53226s), 10), new a(this, null), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
