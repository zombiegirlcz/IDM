package com.revolut.feature.credit.card.impl.ui.display_amount_selector.bottom_sheet;

import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LinearProgressWithAmountDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.credit.card.api.navigation.descriptor.CreditCardDisplayBalanceSettings$InputData;
import com.revolut.feature.credit.card.impl.ui.display_amount_selector.bottom_sheet.CreditCardDisplayAmountBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jm4.a3;
import jm4.v0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mr4.b;
import mr4.d;
import mr4.g;
import no.m;
import te0.w;
import xki.e;
import zhm.v;
import zl4.h;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/display_amount_selector/bottom_sheet/CreditCardDisplayAmountBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lzl4/h;", "Lmr4/b;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardDisplayAmountBottomSheetController extends BaseBottomSheetRecyclerController<h, b> implements m {
    public static final /* synthetic */ int X = 0;
    public final /* synthetic */ ep4.b Q;
    public final CreditCardDisplayBalanceSettings$InputData R;
    public final RowDelegate S;
    public final FullScreenStateDelegate T;
    public final Object U;
    public final Object V;
    public final List W;

    public CreditCardDisplayAmountBottomSheetController(CreditCardDisplayBalanceSettings$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = ep4.b.f128075a;
        this.R = inputData;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.S = rowDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.T = fullScreenStateDelegate;
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: mr4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardDisplayAmountBottomSheetController f208052b;

            {
                this.f208052b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardDisplayAmountBottomSheetController creditCardDisplayAmountBottomSheetController = this.f208052b;
                switch (i2) {
                    case 0:
                        int i3 = CreditCardDisplayAmountBottomSheetController.X;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardDisplayAmountBottomSheetController.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardDisplayBalanceSettings$InputData creditCardDisplayBalanceSettings$InputData = creditCardDisplayAmountBottomSheetController.R;
                        creditCardDisplayBalanceSettings$InputData.getClass();
                        return new v0(a3Var, creditCardDisplayBalanceSettings$InputData);
                    default:
                        int i5 = CreditCardDisplayAmountBottomSheetController.X;
                        return (g) ((v0) creditCardDisplayAmountBottomSheetController.U.getValue()).f176394c.get();
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: mr4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardDisplayAmountBottomSheetController f208052b;

            {
                this.f208052b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardDisplayAmountBottomSheetController creditCardDisplayAmountBottomSheetController = this.f208052b;
                switch (i22) {
                    case 0:
                        int i3 = CreditCardDisplayAmountBottomSheetController.X;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardDisplayAmountBottomSheetController.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardDisplayBalanceSettings$InputData creditCardDisplayBalanceSettings$InputData = creditCardDisplayAmountBottomSheetController.R;
                        creditCardDisplayBalanceSettings$InputData.getClass();
                        return new v0(a3Var, creditCardDisplayBalanceSettings$InputData);
                    default:
                        int i5 = CreditCardDisplayAmountBottomSheetController.X;
                        return (g) ((v0) creditCardDisplayAmountBottomSheetController.U.getValue()).f176394c.get();
                }
            }
        });
        this.W = v.k(rowDelegate, fullScreenStateDelegate, new RowLoadingDelegate(), new LinearProgressWithAmountDelegate());
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        this.Q.getClass();
        return ep4.b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v0) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (g) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.T.f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f53218h), new mr4.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (g) this.V.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getW() {
        return this.W;
    }
}
