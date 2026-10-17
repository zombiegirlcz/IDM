package com.revolut.feature.retail.savings.impl.ui.common.dialogs.capital_at_risk;

import aii.q;
import anb.d;
import anb.n;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$CapitalAtRiskScreen$InputData;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.capital_at_risk.CapitalAtRiskScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tob.b;
import tob.c;
import tob.f;
import tob.g;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/common/dialogs/capital_at_risk/CapitalAtRiskScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ltob/g;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CapitalAtRiskScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CapitalAtRiskScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final SavingsKompotFeatureConfig$CapitalAtRiskScreen$InputData K;
    public final int L;
    public final h M;
    public final LargeActionButtonDelegate N;
    public final Object O;
    public final boolean P;
    public final Object Q;
    public final Object R;

    public CapitalAtRiskScreen(SavingsKompotFeatureConfig$CapitalAtRiskScreen$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = s.t(this, b.f);
        this.N = new LargeActionButtonDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: tob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CapitalAtRiskScreen f272563b;

            {
                this.f272563b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CapitalAtRiskScreen capitalAtRiskScreen = this.f272563b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CapitalAtRiskScreen.S;
                        CapitalAtRiskScreen capitalAtRiskScreen2 = this.f272563b;
                        return dli.f.a(capitalAtRiskScreen2, (f) capitalAtRiskScreen2.R.getValue(), v.k(new FullScreenStateDelegate(), capitalAtRiskScreen2.N, new LargeActionButtonLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CapitalAtRiskScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(capitalAtRiskScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.ui.common.dialogs.capital_at_risk.di.CapitalAtRiskScreenInjector");
                        n nVar = ((n) objB).F;
                        SavingsKompotFeatureConfig$CapitalAtRiskScreen$InputData savingsKompotFeatureConfig$CapitalAtRiskScreen$InputData = capitalAtRiskScreen.K;
                        savingsKompotFeatureConfig$CapitalAtRiskScreen$InputData.getClass();
                        return new anb.d(nVar, savingsKompotFeatureConfig$CapitalAtRiskScreen$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CapitalAtRiskScreen.S;
                        return (f) ((anb.d) capitalAtRiskScreen.Q.getValue()).f6631c.get();
                }
            }
        });
        this.P = true;
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: tob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CapitalAtRiskScreen f272563b;

            {
                this.f272563b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CapitalAtRiskScreen capitalAtRiskScreen = this.f272563b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CapitalAtRiskScreen.S;
                        CapitalAtRiskScreen capitalAtRiskScreen2 = this.f272563b;
                        return dli.f.a(capitalAtRiskScreen2, (f) capitalAtRiskScreen2.R.getValue(), v.k(new FullScreenStateDelegate(), capitalAtRiskScreen2.N, new LargeActionButtonLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CapitalAtRiskScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(capitalAtRiskScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.ui.common.dialogs.capital_at_risk.di.CapitalAtRiskScreenInjector");
                        n nVar = ((n) objB).F;
                        SavingsKompotFeatureConfig$CapitalAtRiskScreen$InputData savingsKompotFeatureConfig$CapitalAtRiskScreen$InputData = capitalAtRiskScreen.K;
                        savingsKompotFeatureConfig$CapitalAtRiskScreen$InputData.getClass();
                        return new anb.d(nVar, savingsKompotFeatureConfig$CapitalAtRiskScreen$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CapitalAtRiskScreen.S;
                        return (f) ((anb.d) capitalAtRiskScreen.Q.getValue()).f6631c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: tob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CapitalAtRiskScreen f272563b;

            {
                this.f272563b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CapitalAtRiskScreen capitalAtRiskScreen = this.f272563b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CapitalAtRiskScreen.S;
                        CapitalAtRiskScreen capitalAtRiskScreen2 = this.f272563b;
                        return dli.f.a(capitalAtRiskScreen2, (f) capitalAtRiskScreen2.R.getValue(), v.k(new FullScreenStateDelegate(), capitalAtRiskScreen2.N, new LargeActionButtonLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CapitalAtRiskScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(capitalAtRiskScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.ui.common.dialogs.capital_at_risk.di.CapitalAtRiskScreenInjector");
                        n nVar = ((n) objB).F;
                        SavingsKompotFeatureConfig$CapitalAtRiskScreen$InputData savingsKompotFeatureConfig$CapitalAtRiskScreen$InputData = capitalAtRiskScreen.K;
                        savingsKompotFeatureConfig$CapitalAtRiskScreen$InputData.getClass();
                        return new anb.d(nVar, savingsKompotFeatureConfig$CapitalAtRiskScreen$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CapitalAtRiskScreen.S;
                        return (f) ((anb.d) capitalAtRiskScreen.Q.getValue()).f6631c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.n) value).f174542b.setHeaderModel(uiState.f272566a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        vkm.d dVarB = rd0.e.b(this.N.d.f121375b);
        ?? r92 = this.R;
        com.revolut.kompot.navigable.a.g2(this, dVarB, null, new c(2, 4, f.class, (f) r92.getValue(), "onLargeActionButtonClick", "onLargeActionButtonClick(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.n) value).f174542b.F), null, new ryj.f(2, (f) r92.getValue(), f.class, "onClauseClick", "onClauseClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 22), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}
