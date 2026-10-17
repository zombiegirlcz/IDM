package com.revolut.feature.cash_topup.impl.ui.amount;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cash_topup.impl.R$string;
import com.revolut.feature.cash_topup.impl.ui.amount.CashTopUpAmountScreen;
import com.revolut.feature.cash_topup.impl.ui.amount.CashTopUpAmountScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import grl.k9;
import ihm.f;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import q5g.f0;
import q97.l1;
import qb3.i;
import qb3.j;
import rd0.e;
import te0.w;
import vc.s;
import yhm.d;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/amount/CashTopUpAmountScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lqb3/j;", "Lcom/revolut/feature/cash_topup/impl/ui/amount/CashTopUpAmountScreenContract$InputData;", "Laii/q;", "Lno/m;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class CashTopUpAmountScreen extends BaseRecyclerViewScreen<j, CashTopUpAmountScreenContract$InputData, q> implements m {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(CashTopUpAmountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final int V;
    public final h W;
    public final Object X;
    public final boolean Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final f f65606a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f65607b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final AmountEditDelegate f65608d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f65609e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashTopUpAmountScreen(CashTopUpAmountScreenContract$InputData.CreateBarcodeData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137507t;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.V = R$layout.screen_recycler_navbar_nextbutton;
        this.W = s.t(this, qb3.c.f);
        this.X = w.y0(new pt4.d(this, inputData, 28));
        final int i = 1;
        this.Y = true;
        final int i2 = 0;
        this.Z = w.y0(new Function0(this) { // from class: qb3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopUpAmountScreen f244085b;

            {
                this.f244085b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                CashTopUpAmountScreen cashTopUpAmountScreen = this.f244085b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = CashTopUpAmountScreen.f0;
                        return (i) ((mb3.j) cashTopUpAmountScreen.X.getValue()).f204074j.get();
                    default:
                        KProperty[] kPropertyArr2 = CashTopUpAmountScreen.f0;
                        qd0.b bVarN = ((mb3.j) cashTopUpAmountScreen.X.getValue()).f204070b.d.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                }
            }
        });
        this.f65606a0 = v0.a.d("create(...)");
        this.f65607b0 = w.y0(new Function0(this) { // from class: qb3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopUpAmountScreen f244085b;

            {
                this.f244085b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                CashTopUpAmountScreen cashTopUpAmountScreen = this.f244085b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = CashTopUpAmountScreen.f0;
                        return (i) ((mb3.j) cashTopUpAmountScreen.X.getValue()).f204074j.get();
                    default:
                        KProperty[] kPropertyArr2 = CashTopUpAmountScreen.f0;
                        qd0.b bVarN = ((mb3.j) cashTopUpAmountScreen.X.getValue()).f204070b.d.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                }
            }
        });
        this.c0 = w.y0(new q50.w(26));
        AmountEditDelegate amountEditDelegate = new AmountEditDelegate(new f0(this, 9));
        this.f65608d0 = amountEditDelegate;
        this.f65609e0 = v.k(amountEditDelegate, new RowLoadingDelegate());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        j uiState = (j) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174564b.setEnabled(uiState.f244092b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (mb3.j) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174565c.f59410q), null, new qb3.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174564b.o), null, new qb3.e(this, continuation, 1), 3);
        r rVarDebounce = this.f65606a0.debounce(400L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        vkm.d dVarB = e.b(rVarDebounce);
        ?? r06 = this.Z;
        int i = 4;
        com.revolut.kompot.navigable.a.g2(this, dVarB, null, new q9c.v(2, (i) r06.getValue(), i.class, "onAmountChanged", "onAmountChanged(Ljava/lang/String;)V", i, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(this.f65608d0.f51622g.f121375b, new l1(29))), null, new q9c.v(2, (i) r06.getValue(), i.class, "onHintClicked", "onHintClicked(Lcom/revolut/feature/cash_topup/api/mapper/CashTopUpHintMapper$HintType;)V", i, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButtonDelegate) this.c0.getValue()).d.f121375b), null, new qb3.f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) ((mb3.j) this.X.getValue()).e.get()).d(u.c((LargeActionButtonDelegate) this.c0.getValue()));
        boolean z = this.G instanceof CashTopUpAmountScreenContract$InputData.EditBarcodeData;
        NavBarWithToolbar navBarWithToolbar = g3().f174565c;
        TextLocalisedClause textLocalisedClause = z ? new TextLocalisedClause(R$string.topup_cash_amount_edit_title, null, null, 14) : new TextLocalisedClause(R$string.topup_cash_amount_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.topup_cash_amount_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        g3().f174564b.setText(z ? new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_save, null, null, 14) : new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        j uiState = (j) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174564b.setEnabled(uiState.f244092b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF65609e0() {
        return this.f65609e0;
    }

    public final jii.u g3() {
        ViewBinding value = this.W.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Y);
    }
}
