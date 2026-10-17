package com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation;

import aii.q;
import android.view.View;
import blb.f;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation.SavingsInterestRateExplanationContract$InputData;
import com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation.SavingsInterestRateExplanationScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import plb.d;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/core/product/presentation/rate_explanation/SavingsInterestRateExplanationScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lplb/a;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsInterestRateExplanationScreen extends BaseBottomSheetRecyclerController<q, plb.a> {
    public static final /* synthetic */ int V = 0;
    public final SavingsInterestRateExplanationContract$InputData Q;
    public final LargeActionButtonDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public SavingsInterestRateExplanationScreen(SavingsInterestRateExplanationContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.R = largeActionButtonDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: plb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsInterestRateExplanationScreen f237317b;

            {
                this.f237317b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SavingsInterestRateExplanationScreen savingsInterestRateExplanationScreen = this.f237317b;
                switch (i2) {
                    case 0:
                        int i3 = SavingsInterestRateExplanationScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(savingsInterestRateExplanationScreen.m2()).a().get(tib.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tib.b.class, " is not found"));
                        }
                        blb.e eVar = ((blb.e) ((blb.h) aVar2.b())).f16508l;
                        SavingsInterestRateExplanationContract$InputData savingsInterestRateExplanationContract$InputData = savingsInterestRateExplanationScreen.Q;
                        savingsInterestRateExplanationContract$InputData.getClass();
                        return new blb.f(eVar, savingsInterestRateExplanationContract$InputData);
                    default:
                        int i5 = SavingsInterestRateExplanationScreen.V;
                        return (b) ((blb.f) savingsInterestRateExplanationScreen.S.getValue()).f16517b.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: plb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsInterestRateExplanationScreen f237317b;

            {
                this.f237317b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SavingsInterestRateExplanationScreen savingsInterestRateExplanationScreen = this.f237317b;
                switch (i22) {
                    case 0:
                        int i3 = SavingsInterestRateExplanationScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(savingsInterestRateExplanationScreen.m2()).a().get(tib.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tib.b.class, " is not found"));
                        }
                        blb.e eVar = ((blb.e) ((blb.h) aVar2.b())).f16508l;
                        SavingsInterestRateExplanationContract$InputData savingsInterestRateExplanationContract$InputData = savingsInterestRateExplanationScreen.Q;
                        savingsInterestRateExplanationContract$InputData.getClass();
                        return new blb.f(eVar, savingsInterestRateExplanationContract$InputData);
                    default:
                        int i5 = SavingsInterestRateExplanationScreen.V;
                        return (b) ((blb.f) savingsInterestRateExplanationScreen.S.getValue()).f16517b.get();
                }
            }
        });
        this.U = v.k(cellDetailsDelegate, largeActionButtonDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b k3() {
        return (plb.b) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, h3(), new nt.e(2, (plb.b) this.T.getValue(), plb.b.class, "onClauseClick", "onClauseClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.d.f121375b), null, new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (plb.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
